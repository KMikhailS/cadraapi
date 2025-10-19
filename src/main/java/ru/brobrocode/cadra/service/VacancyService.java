package ru.brobrocode.cadra.service;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.http.ResponseEntity;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.oauth2.client.OAuth2AuthorizeRequest;
import org.springframework.security.oauth2.client.OAuth2AuthorizedClient;
import org.springframework.security.oauth2.client.OAuth2AuthorizedClientManager;
import org.springframework.security.oauth2.core.user.OAuth2User;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import ru.brobrocode.cadra.client.api.ResumesApi;
import ru.brobrocode.cadra.client.model.VacanciesVacanciesResponse;
import ru.brobrocode.cadra.config.exception.TariffException;
import ru.brobrocode.cadra.dto.*;
import ru.brobrocode.cadra.entity.Resume;
import ru.brobrocode.cadra.entity.SelectedTariff;
import ru.brobrocode.cadra.entity.UserInfo;
import ru.brobrocode.cadra.entity.VacancyProcessingState;
import ru.brobrocode.cadra.mapper.VacancyMapper;
import ru.brobrocode.cadra.repository.UserInfoRepository;
import ru.brobrocode.cadra.repository.VacancyProcessingStateRepository;

import java.math.BigDecimal;
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
	private final UserInfoRepository userInfoRepository;
	private final ApplicationEventPublisher applicationEventPublisher;
	private final VacancyProcessingStateRepository vacancyProcessingStateRepository;
	private final OAuth2AuthorizedClientManager clientManager;

	public Integer getFoundVacanciesCount(String resumeId, SettingsDTO settingsDTO) {
		try {
			int page = 0;
			int perPage = 50;
			ResponseEntity<VacanciesVacanciesResponse> response = getVacancies(resumeId, page, perPage, settingsDTO);
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

	public Integer getResponsesCount(SelectedTariff selectedTariff, UserInfo userInfo) {
		Integer maxResponses = selectedTariff.getMaxResponses();
		Integer spentResponses = selectedTariff.getSpentResponses();
		Integer maxResponsesPerDay = selectedTariff.getMaxResponsesPerDay();
		Integer appliedVacanciesForToday = getAppliedVacanciesForToday(userInfo);
		int remainResponses = maxResponses - spentResponses;
		int availableForToday = maxResponsesPerDay - appliedVacanciesForToday;

		return Math.min(availableForToday, remainResponses);
	}

	private Integer getAppliedVacanciesForToday(UserInfo userInfo) {
		LocalDate now = LocalDate.now();
		List<Resume> resumes = userInfo.getResumes();
		if(resumes != null && !resumes.isEmpty()) {
			List<String> resumeIds = resumes.stream()
					.map(Resume::getId)
					.toList();
			return vacancyProcessingStateRepository
					.findAllByResumeIdInAndStatusAndAppliedDate(resumeIds, VacancyProcessingState.Status.COMPLETED, now)
					.stream()
					.mapToInt(state -> state.getAppliedVacancies() != null ? state.getAppliedVacancies() : 0)
					.sum();
		}
		return 0;
	}

	@Transactional
	public AvailableVacanciesResponse getAvailableVacancies(String resumeId) {
		AvailableVacanciesResponse response = new AvailableVacanciesResponse();
		UserInfo userInfo = getUserInfoWithTariffAndResumes();
		SelectedTariff selectedTariff = getActiveSelectedTariffByUser(userInfo);
		Integer responsesCount = getResponsesCount(selectedTariff, userInfo);
		log.info("Total responses count: {} for resume: {}", responsesCount, resumeId);
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

		String accessToken = getAccessToken();
		ApplyVacanciesEvent event = new ApplyVacanciesEvent(processId, resumeId, userInfo.getPhone(),
				userInfo.getEmail(), selectedTariff.getId(), request.getVacancyIds(), accessToken);
		applicationEventPublisher.publishEvent(event);

		ApplyVacanciesResponse applyVacanciesResponse = new ApplyVacanciesResponse();
		applyVacanciesResponse.setProcessId(processId);

		return applyVacanciesResponse;
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
		response.setAppliedVacancies(vacancyProcessingState.getAppliedVacancies());
		response.setStatus(vacancyProcessingState.getStatus());
		return response;
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

	private UserInfo getUserInfoWithTariffAndResumes() {
		Object principal = SecurityContextHolder.getContext().getAuthentication().getPrincipal();
		if (principal instanceof OAuth2User user) {
			Map<String, Object> attributes = user.getAttributes();
			String userId = (String) attributes.get("id");
			UserInfo userInfo = userInfoRepository.findByIdWithSelectedTariffs(userId)
					.orElseThrow(() -> new IllegalArgumentException("User not found"));
			userInfoRepository.findByIdWithResumes(userId);
			return userInfo;
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

	private String getAccessToken() {
		Authentication authentication = SecurityContextHolder.getContext().getAuthentication();

		if (authentication == null) {
			return null;
		}
		OAuth2AuthorizeRequest request = OAuth2AuthorizeRequest
				.withClientRegistrationId("hh")
				.principal(authentication)
				.build();

		OAuth2AuthorizedClient client = clientManager.authorize(request);

		return client != null ? client.getAccessToken().getTokenValue() : null;
	}

	private ResponseEntity<VacanciesVacanciesResponse> getVacancies(String resumeId, int page, int perPage, SettingsDTO settings) {
		String text = null;
		String experience = null;
		String employment = null;
		BigDecimal salary = null;
		String currency = null;
		if (settings != null) {
			if (settings.getText() != null && !settings.getText().isEmpty()) {
				text = settings.getText();
			}
			if (settings.getExperience() != null && !settings.getExperience().isEmpty()) {
				experience = settings.getExperience();
			}
			if (settings.getEmployment() != null && !settings.getEmployment().isEmpty()) {
				employment = settings.getEmployment();
			}
			if (settings.getSalary() != null) {
				salary = settings.getSalary();
			}
			if (settings.getCurrency() != null && !settings.getCurrency().isEmpty()) {
				currency = settings.getCurrency();
			}
		}
		return resumesApi.getVacanciesSimilarToResume(
				resumeId,
				DEFAULT_USER_AGENT,
				page,
				perPage,
				text,
				null,
				experience,
				employment,
				null,
				null,
				null,
				null,
				null,
				null,
				null,
				currency,
				salary,
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
