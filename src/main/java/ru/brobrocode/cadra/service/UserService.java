package ru.brobrocode.cadra.service;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.oauth2.client.OAuth2AuthorizeRequest;
import org.springframework.security.oauth2.client.OAuth2AuthorizedClient;
import org.springframework.security.oauth2.client.OAuth2AuthorizedClientManager;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import ru.brobrocode.cadra.client.api.ResumesApi;
import ru.brobrocode.cadra.client.model.ResumesMineItem;
import ru.brobrocode.cadra.client.model.ResumesMineResponse;
import ru.brobrocode.cadra.dto.ResumeDTO;
import ru.brobrocode.cadra.dto.SelectedTariffDTO;
import ru.brobrocode.cadra.dto.SettingsDTO;
import ru.brobrocode.cadra.dto.UserInfoDTO;
import ru.brobrocode.cadra.entity.Resume;
import ru.brobrocode.cadra.entity.SelectedTariff;
import ru.brobrocode.cadra.entity.Tariff;
import ru.brobrocode.cadra.entity.UserInfo;
import ru.brobrocode.cadra.repository.ResumeRepository;
import ru.brobrocode.cadra.repository.SelectedTariffRepository;
import ru.brobrocode.cadra.repository.UserInfoRepository;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import static ru.brobrocode.cadra.constants.HHApiConstants.*;

@Service
@RequiredArgsConstructor
@Slf4j
public class UserService {

	private final UserInfoRepository userInfoRepository;
	private final ResumeRepository resumeRepository;
	private final ResumesApi resumesApi;
	private final SelectedTariffRepository selectedTariffRepository;
	private final VacancyService vacancyService;
	private final ObjectMapper objectMapper;
	private final OAuth2AuthorizedClientManager clientManager;
	private final UserStateService userStateService;
	private final TariffService tariffService;

	public UserInfoDTO getCurrentUser() {
		UserInfo userInfo = userStateService.getUserInfo();
		if (userInfo == null) {
			throw new RuntimeException("User not found");
		}
		if (userInfo.getAccessToken() == null) {
			saveTokens(userInfo);
		}
		UserInfoDTO userInfoDTO = userStateService.getUserInfoDTO(userInfo);
		userInfoDTO.setIsAnyTariffSelected(isAnyTariffSelected(userInfoDTO.getId()));
		if (userInfoDTO.getMessage() != null && !userInfoDTO.getMessage().isEmpty()) {
			return userInfoDTO;
		}
		SelectedTariff selectedTariff = getSelectedTariff(userInfo.getId());
		fillSelectedTariff(userInfoDTO, selectedTariff, userInfo);
		List<ResumeDTO> resumes = getResumes(userInfo);
		userInfoDTO.setResumes(resumes);
		return userInfoDTO;
	}

	private void fillSelectedTariff(UserInfoDTO userInfoDTO, SelectedTariff selectedTariff, UserInfo userInfo) {
		if (selectedTariff == null) {
			return;
		}
		SelectedTariffDTO selectedTariffDTO = new SelectedTariffDTO();
		selectedTariffDTO.setTitle(selectedTariff.getTariff().getName());
		selectedTariffDTO.setMaxResponses(selectedTariff.getMaxResponses());
		selectedTariffDTO.setSpentResponses(selectedTariff.getSpentResponses());
		Integer availableVacanciesForToday = vacancyService.getResponsesCount(selectedTariff, userInfo);
		selectedTariffDTO.setAvailableVacanciesForToday(availableVacanciesForToday);
		userInfoDTO.setSelectedTariff(selectedTariffDTO);
	}

	private void saveTokens(UserInfo userInfo) {
		Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
		if (authentication == null) {
			return;
		}
		OAuth2AuthorizeRequest request = OAuth2AuthorizeRequest
				.withClientRegistrationId("hh")
				.principal(authentication)
				.build();

		OAuth2AuthorizedClient client = clientManager.authorize(request);
		if (client != null) {
			if (client.getAccessToken() != null) {
				String accessToken = client.getAccessToken().getTokenValue();
				userInfo.setAccessToken(accessToken);
			}
			if (client.getRefreshToken() != null) {
				String refreshToken = client.getRefreshToken().getTokenValue();
				userInfo.setRefreshToken(refreshToken);
			}
			userInfoRepository.save(userInfo);
		}
	}

	private List<ResumeDTO> getResumes(UserInfo userInfo) {
		List<ResumesMineItem> mineResumes = getMineResumes(userInfo.getAccessToken());
		List<ResumeDTO> resumes = new ArrayList<>();
		if (mineResumes.isEmpty()) {
			return resumes;
		}
		for (ResumesMineItem mineResume : mineResumes) {
			String settings = saveResume(mineResume, userInfo);
			ResumeDTO resumeDTO = new ResumeDTO();
			resumeDTO.setId(mineResume.getId());
			resumeDTO.setTitle(mineResume.getTitle());
			resumeDTO.setSettings(getResumeSettings(settings));
			resumes.add(resumeDTO);
		}
		return resumes;
	}

	public List<ResumesMineItem> getMineResumes(String accessToken) {
		try {
			ResponseEntity<ResumesMineResponse> response = resumesApi.getMineResumes(
					DEFAULT_USER_AGENT,
					"Bearer " + accessToken,
					DEFAULT_LOCALE,
					DEFAULT_HOST
			);
			ResumesMineResponse resumesResponse = response.getBody();
			if (resumesResponse != null) {
				return resumesResponse.getItems();
			}
		} catch (Exception e) {
			log.error("Error getting current user resume information", e);
			throw new RuntimeException("Failed to retrieve user information from hh.ru", e);
		}
		return Collections.emptyList();
	}

	public SelectedTariff getSelectedTariff(String userId) {
		return selectedTariffRepository.findByUserIdAndIsActive(userId, true).orElse(null);
	}

	private String saveResume(ResumesMineItem resumeItem, UserInfo userInfo) {
		Resume existResume = userInfo.getResumes().stream()
				.filter(resume -> resumeItem.getId().equals(resume.getId()))
				.findFirst()
				.orElse(null);
		if (existResume == null) {
			Resume resume = new Resume();
			resume.setId(resumeItem.getId());
			resume.setTitle(resumeItem.getTitle());
			resume.setUser(userInfo);
			resume.setCreatedAt(LocalDateTime.now());
			resume.setUpdatedAt(LocalDateTime.now());
			resumeRepository.save(resume);
			return null;
		}
		return existResume.getSettings();
	}

	public ResumeDTO getResumeInfo(String resumeId) {
		ResumeDTO resumeDTO = new ResumeDTO();
		resumeDTO.setId(resumeId);
		Resume resume = getResumeById(resumeId);
		SettingsDTO settingsDTO = getResumeSettings(resume);
		Integer foundVacanciesCount = vacancyService.getFoundVacanciesCount(resumeId, settingsDTO);
		resumeDTO.setVacanciesToApply(foundVacanciesCount);

		return resumeDTO;
	}

	private SettingsDTO getResumeSettings(String settings) {
		if (settings == null) {
			return null;
		}
		try {
			return objectMapper.readValue(settings, SettingsDTO.class);
		} catch (JsonProcessingException e) {
			log.error("Error getting settings from hh.ru", e);
		}
		return null;
	}

	private SettingsDTO getResumeSettings(Resume resume) {
		if (resume.getSettings() == null) {
			return null;
		}
		try {
			return objectMapper.readValue(resume.getSettings(), SettingsDTO.class);
		} catch (JsonProcessingException e) {
			log.error("Error getting settings from hh.ru", e);
		}
		return null;
	}

	@Transactional
	public void saveResumeSettings(String resumeId, SettingsDTO settingsDTO) {
		try {
			String settingsValue = objectMapper.writeValueAsString(settingsDTO);
			Resume resume = getResumeById(resumeId);
			resume.setSettings(settingsValue);
			resumeRepository.save(resume);
		} catch (Exception e) {
			log.error("Error saving settings", e);
			throw new RuntimeException("Error saving settings", e);
		}
	}

	private Resume getResumeById(String resumeId) {
		return resumeRepository.findById(resumeId)
				.orElseThrow(() -> new IllegalArgumentException("Resume not found"));
	}

	private void savePromoTariff(UserInfo userInfo) {
		Tariff promoTariff = tariffService.getByName("Пробный");
		SelectedTariff selectedTariff = new SelectedTariff();
		selectedTariff.setTariff(promoTariff);
		selectedTariff.setUser(userInfo);
		selectedTariff.setSpentResponses(0);
		selectedTariff.setMaxResponses(promoTariff.getMaxResponses());
		selectedTariff.setIsActive(true);
		selectedTariff.setExpiresAt(LocalDate.now().plusDays(promoTariff.getExpirationDays()));
		selectedTariff.setCreatedAt(LocalDateTime.now());
		selectedTariff.setUpdatedAt(LocalDateTime.now());
		selectedTariff.setMaxResponsesPerDay(promoTariff.getMaxResponsesPerDay());
		selectedTariff.setIsSendLetter(promoTariff.getIsSendLetter());
		selectedTariffRepository.save(selectedTariff);
	}

	private boolean isAnyTariffSelected(String userId) {
		List<SelectedTariff> tariffs = selectedTariffRepository.findByUserId(userId);
		return tariffs != null && !tariffs.isEmpty();
	}

	public boolean hasSelectedTariffs() {
		UserInfo userInfo = userStateService.getUserInfo();
		if (userInfo == null) {
			return false;
		}
		return isAnyTariffSelected(userInfo.getId());
	}

	@Transactional
	public String activatePromoTariff() {
		UserInfo userInfo = userStateService.getUserInfo();
		if (userInfo == null) {
			throw new RuntimeException("User not found");
		}

		// Проверяем, выбирал ли пользователь уже какие-либо тарифы
		if (isAnyTariffSelected(userInfo.getId())) {
			log.info("User {} already has selected tariffs, promo tariff not available", userInfo.getId());
			return "Тариф Пробный не доступен";
		}

		// Активируем пробный тариф
		log.info("Activating promo tariff for user {}", userInfo.getId());
		savePromoTariff(userInfo);
		return null;
	}
}
