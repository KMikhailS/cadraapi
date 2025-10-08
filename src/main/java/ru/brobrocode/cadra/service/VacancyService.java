package ru.brobrocode.cadra.service;

import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.context.ApplicationEventPublisher;
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
import ru.brobrocode.cadra.entity.VacancyProcessingState;
import ru.brobrocode.cadra.mapper.VacancyMapper;
import ru.brobrocode.cadra.repository.SelectedTariffRepository;
import ru.brobrocode.cadra.repository.UserInfoRepository;
import ru.brobrocode.cadra.repository.VacancyProcessingStateRepository;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.*;

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
	private final ApplicationEventPublisher applicationEventPublisher;
	private final VacancyProcessingStateRepository vacancyProcessingStateRepository;
	private final ObjectMapper objectMapper;

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

	public VacanciesDTO getAllVacanciesSimilarToResume(String resumeId, Integer responsesCount) {
		List<VacancyItemDTO> allItems = new ArrayList<>();
		int page = 0;
		int perPage = 100;

		int maxItems = responsesCount * 2;

		try {
			while (true) {
				VacanciesDTO vacanciesPage = getVacanciesSimilarToResume(resumeId, page, perPage);
				if (vacanciesPage == null || vacanciesPage.getItems() == null || vacanciesPage.getItems().isEmpty()) {
					break;
				}
				allItems.addAll(vacanciesPage.getItems());
				page++;
				if (allItems.size() >= maxItems) {
					break;
				}
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

	private Integer getResponsesCount(SelectedTariff selectedTariff, String resumeId) {
		Integer maxResponses = selectedTariff.getMaxResponses();
		Integer spentResponses = selectedTariff.getSpentResponses();
		Integer maxResponsesPerDay = selectedTariff.getMaxResponsesPerDay();
		Integer appliedVacanciesForToday = getAppliedVacanciesForToday(resumeId);
		int remainResponses = maxResponses - spentResponses;
		if (remainResponses > maxResponsesPerDay) {
			return maxResponsesPerDay - appliedVacanciesForToday;
		}
		return remainResponses - appliedVacanciesForToday;
	}

	private Integer getAppliedVacanciesForToday(String resumeId) {
		LocalDate now = LocalDate.now();
		return vacancyProcessingStateRepository
				.findAllByResumeIdAndStatusAndAppliedDate(resumeId, VacancyProcessingState.Status.COMPLETED, now)
				.stream()
				.mapToInt(state -> state.getAppliedVacancies() != null ? state.getAppliedVacancies() : 0)
				.sum();
	}

	@Transactional
	public AvailableVacanciesResponse getAvailableVacancies(String resumeId) {
		AvailableVacanciesResponse response = new AvailableVacanciesResponse();
		UserInfo userInfo = getUserInfoWithTariff();
		SelectedTariff selectedTariff = getActiveSelectedTariffByUser(userInfo);
		Integer responsesCount = getResponsesCount(selectedTariff, resumeId);
		if (responsesCount <= 0) {
			response.setVacancyIds(Collections.emptyList());
			response.setVacanciesCount(0);
			return response;
		}
		Boolean isSendLetter = selectedTariff.getIsSendLetter();
		VacanciesDTO vacancies = getAllVacanciesSimilarToResume(resumeId, responsesCount);
		List<String> vacancyIds = new ArrayList<>();
		if (vacancies != null && vacancies.getItems() != null && !vacancies.getItems().isEmpty()) {
			vacancyIds = vacancies.getItems().stream()
					.filter(item -> isAvailableVacancy(item, isSendLetter))
					.limit(responsesCount)
					.map(VacancyItemDTO::getId)
					.toList();
		}
		response.setVacancyIds(vacancyIds);
		response.setVacanciesCount(vacancyIds.size());
		return response;
	}

	@Transactional
	public ApplyVacanciesResponse applyToAllVacancies(String resumeId, AvailableVacanciesRequest request) {
		UserInfo userInfo = getUserInfoWithTariff();
		SelectedTariff selectedTariff = getActiveSelectedTariffByUser(userInfo);
		if (selectedTariff == null) {
			throw new TariffException("Не найден активный тариф для пользователя " + userInfo.getId());
		}
		VacancyProcessingState vacancyProcessingState = new VacancyProcessingState();
		String processId = UUID.randomUUID().toString();
		vacancyProcessingState.setId(processId);
		vacancyProcessingState.setResumeId(resumeId);
		vacancyProcessingState.setStatus(VacancyProcessingState.Status.PROCESS);
		vacancyProcessingState.setCreatedAt(LocalDateTime.now());
		vacancyProcessingState.setUpdatedAt(LocalDateTime.now());
		vacancyProcessingStateRepository.save(vacancyProcessingState);
		log.info("VacancyProcessingState saved: {}", vacancyProcessingState.getId());

		ApplyVacanciesEvent event = new ApplyVacanciesEvent(processId, resumeId, request.getVacancyIds());
		applicationEventPublisher.publishEvent(event);
		log.info("ApplyVacanciesEvent published {}", event);

		ApplyVacanciesResponse applyVacanciesResponse = new ApplyVacanciesResponse();
		applyVacanciesResponse.setProcessId(processId);
		log.info("ApplyVacanciesResponse created {}", applyVacanciesResponse);

		return applyVacanciesResponse;
//		int userNegotiationsCount = getUserNegotiationsCount(selectedTariff);
//		if (userNegotiationsCount <= 0) {
//			throw new TariffException("Нет доступных откликов");
//		}
//		VacanciesDTO vacancies = getAllVacanciesSimilarToResume(resumeId);
//		int applyVacanciesCount = 0;
//		if (vacancies != null && vacancies.getItems() != null && !vacancies.getItems().isEmpty()) {
//			List<VacancyItemDTO> items = vacancies.getItems().stream()
//					.filter(this::isAvailableVacancy)
//					.toList();
//			for(VacancyItemDTO item : items) {
//				if (applyVacanciesCount > userNegotiationsCount) {
//					break;
//				}
//				VacancyApplicationRequest request = new VacancyApplicationRequest();
//				request.setResumeId(resumeId);
//				request.setVacancyId(item.getId());
//				ApplyVacancyResponse applyVacancyResponse = applyToVacancy(request);
//				if (applyVacancyResponse != null && applyVacancyResponse.isSuccess()) {
//					applyVacanciesCount++;
//				}
//			}
//		}
//		Integer spentResponses = selectedTariff.getSpentResponses();
//		selectedTariff.setSpentResponses(spentResponses + applyVacanciesCount);
//		selectedTariffRepository.save(selectedTariff);
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

	public ApplyStatusResponse getApplyVacancyStatus(String processId) {
		ApplyStatusResponse response = new ApplyStatusResponse();
		VacancyProcessingState vacancyProcessingState = vacancyProcessingStateRepository.findById(processId).orElse(null);
		if (vacancyProcessingState == null) {
			response.setProcessId(processId);
			response.setMessage("Ошибка процесса отправки резюме. Не найден процесс.");
			response.setStatus(VacancyProcessingState.Status.ERROR);
			return response;
		}
		response.setProcessId(processId);
		response.setStatus(vacancyProcessingState.getStatus());
		return response;
	}

	private String handleErrorResponse() {
		return null;
	}

	private boolean isAvailableVacancy(VacancyItemDTO item, Boolean isSendLetter) {
		Boolean hasTest = item.getHasTest();
		boolean noNeedTest = hasTest == null || !hasTest;
		Boolean responseLetterRequired = item.getResponseLetterRequired();
		boolean noNeedResponseLetterRequired = isSendLetter || responseLetterRequired == null || !responseLetterRequired;

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
