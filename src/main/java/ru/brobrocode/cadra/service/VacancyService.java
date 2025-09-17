package ru.brobrocode.cadra.service;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.oauth2.core.user.OAuth2User;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import ru.brobrocode.cadra.client.api.NegotiationsApi;
import ru.brobrocode.cadra.client.api.ResumesApi;
import ru.brobrocode.cadra.client.model.VacanciesVacanciesResponse;
import ru.brobrocode.cadra.config.exception.TariffException;
import ru.brobrocode.cadra.dto.*;
import ru.brobrocode.cadra.entity.SelectedTariff;
import ru.brobrocode.cadra.entity.UserInfo;
import ru.brobrocode.cadra.mapper.VacancyMapper;
import ru.brobrocode.cadra.repository.SelectedTariffRepository;
import ru.brobrocode.cadra.repository.UserInfoRepository;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import static ru.brobrocode.cadra.constants.HHApiConstants.*;

@Slf4j
@RequiredArgsConstructor
@Service
public class VacancyService {

	private final VacancyMapper vacancyMapper;
	private final ResumesApi resumesApi;
	private final NegotiationsApi negotiationsApi;
	private final UserInfoRepository userInfoRepository;
	private final SelectedTariffRepository selectedTariffRepository;

	public Integer getFoundVacanciesCount(String resumeId) {
		try {
			int page = 0;
			int perPage = 50;
			ResponseEntity<VacanciesVacanciesResponse> response = getVacancies(resumeId, page, perPage);
			VacanciesVacanciesResponse vacanciesResponse = response.getBody();
			if (vacanciesResponse != null) {
				return vacanciesResponse.getFound();
			}
			return null;
		} catch (Exception e) {
			log.error("Error getting current user information", e);
			throw new RuntimeException("Failed to retrieve user information from hh.ru", e);
		}
	}

	public VacanciesDTO getVacanciesSimilarToResume(String resumeId, Integer page, Integer perPage) {
		try {
			ResponseEntity<VacanciesVacanciesResponse> response = getVacancies(resumeId, page, perPage);
			VacanciesVacanciesResponse vacanciesResponse = response.getBody();
			if (vacanciesResponse != null) {
				return vacancyMapper.toVacanciesDTO(vacanciesResponse);
			}
			return null;
		} catch (Exception e) {
			log.error("Error getting current user information", e);
			throw new RuntimeException("Failed to retrieve user information from hh.ru", e);
		}
	}

	public VacanciesDTO getAllVacanciesSimilarToResume(String resumeId) {
		List<VacancyItemDTO> allItems = new ArrayList<>();
		int page = 0;
		int perPage = 100;
		
		try {
			while (true) {
				VacanciesDTO vacanciesPage = getVacanciesSimilarToResume(resumeId, page, perPage);
				
				if (vacanciesPage == null || vacanciesPage.getItems() == null || vacanciesPage.getItems().isEmpty()) {
					break;
				}
				
				allItems.addAll(vacanciesPage.getItems());
				page++;
			}
			
			VacanciesDTO result = new VacanciesDTO();
			result.setItems(allItems);
			result.setFound(allItems.size());
			return result;
			
		} catch (Exception e) {
			log.error("Error getting all vacancies similar to resume: {}", e.getMessage(), e);
			throw new RuntimeException("Failed to retrieve all vacancies from hh.ru", e);
		}
	}

	@Transactional
	public void applyToAllVacancies(String resumeId) {
		UserInfo userInfo = getUserInfoWithTariff();
		SelectedTariff selectedTariff = getActiveSelectedTariffByUser(userInfo);
		if (selectedTariff == null) {
			throw new TariffException("Не найден активный тариф для пользователя " + userInfo.getId());
		}
		int userNegotiationsCount = getUserNegotiationsCount(selectedTariff);
		if (userNegotiationsCount <= 0) {
			throw new TariffException("Нет доступных откликов");
		}
		VacanciesDTO vacancies = getAllVacanciesSimilarToResume(resumeId);
		int applyVacanciesCount = 0;
		if (vacancies != null && vacancies.getItems() != null && !vacancies.getItems().isEmpty()) {
			List<VacancyItemDTO> items = vacancies.getItems().stream()
					.filter(this::isAvailableVacancy)
					.toList();
			for(VacancyItemDTO item : items) {
				if (applyVacanciesCount > userNegotiationsCount) {
					break;
				}
				VacancyApplicationRequest request = new VacancyApplicationRequest();
				request.setResumeId(resumeId);
				request.setVacancyId(item.getId());
				ApplyVacancyResponse applyVacancyResponse = applyToVacancy(request);
				if (applyVacancyResponse != null && applyVacancyResponse.isSuccess()) {
					applyVacanciesCount++;
				}
			}
		}
		Integer spentResponses = selectedTariff.getSpentResponses();
		selectedTariff.setSpentResponses(spentResponses + applyVacanciesCount);
		selectedTariffRepository.save(selectedTariff);
	}

	public ApplyVacancyResponse applyToVacancy(VacancyApplicationRequest request) {
		ApplyVacancyResponse applyVacancyResponse = new ApplyVacancyResponse();
		applyVacancyResponse.setVacancyId(request.getVacancyId());
		try {
			ResponseEntity<String> response = negotiationsApi.applyToVacancy(
					DEFAULT_USER_AGENT,
					request.getResumeId(),
					request.getVacancyId(),
					DEFAULT_LOCALE,
					DEFAULT_HOST,
					request.getMessage()
			);

			int statusCode = response.getStatusCode().value();

			if (statusCode == 210) {
				applyVacancyResponse.setSuccess(true);
			} else if (statusCode == 400) {
				applyVacancyResponse.setSuccess(false);
			}

		} catch (Exception e) {
			applyVacancyResponse.setSuccess(false);
			log.error("Error applying to vacancy: {}", e.getMessage(), e);
		}
		return applyVacancyResponse;
	}

	private String handleErrorResponse() {
		return null;
	}

	private boolean isAvailableVacancy(VacancyItemDTO item) {
		Boolean hasTest = item.getHasTest();
		boolean noNeedTest = hasTest == null || !hasTest;
		Boolean responseLetterRequired = item.getResponseLetterRequired();
		boolean noNeedResponseLetterRequired = responseLetterRequired == null || !responseLetterRequired;

		return noNeedTest && noNeedResponseLetterRequired;
	}

	private UserInfo getUserInfoWithTariff() {
		Object principal = SecurityContextHolder.getContext().getAuthentication().getPrincipal();
		if (principal instanceof OAuth2User user) {
			Map<String, Object> attributes = user.getAttributes();
			String userId = (String) attributes.get("id");
			return userInfoRepository.findByIdWithSelectedTariffs(userId)
					.orElseThrow(() -> new IllegalArgumentException("User not found"));
		}
		throw new IllegalStateException("User not found");
	}

	private SelectedTariff getActiveSelectedTariffByUser(UserInfo userInfo) {
		return userInfo.getSelectedTariff().stream()
				.filter(SelectedTariff::getIsActive)
				.filter(tariff -> tariff.getExpiresAt().isAfter(LocalDate.now()))
				.findFirst()
				.orElse(null);
	}

	private int getUserNegotiationsCount(SelectedTariff selectedTariff) {
			if (selectedTariff != null) {
				Integer spentResponses = selectedTariff.getSpentResponses();
				Integer maxResponses = selectedTariff.getTariff().getMaxResponses();
				return maxResponses - spentResponses;
			}
		return 0;
	}

	private ResponseEntity<VacanciesVacanciesResponse> getVacancies(String resumeId, int page, int perPage) {
		return resumesApi.getVacanciesSimilarToResume(
				resumeId,
				DEFAULT_USER_AGENT,
				page,
				perPage,
				null,
				null,
				null,
				null,
				null,
				null,
				null,
				null,
				null,
				null,
				null,
				null,
				null,
				null,
				null,
				null,
				null,
				null,
				null,
				null,
				null,
				null,
				null,
				null,
				null,
				null,
				null,
				null,
				null,
				null,
				null,
				DEFAULT_LOCALE,
				DEFAULT_HOST
		);
	}
}
