package ru.brobrocode.cadra.service;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.github.benmanes.caffeine.cache.LoadingCache;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.oauth2.client.OAuth2AuthorizeRequest;
import org.springframework.security.oauth2.client.OAuth2AuthorizedClient;
import org.springframework.security.oauth2.client.OAuth2AuthorizedClientManager;
import org.springframework.security.oauth2.core.user.OAuth2User;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import ru.brobrocode.cadra.client.api.MeApi;
import ru.brobrocode.cadra.client.api.ResumesApi;
import ru.brobrocode.cadra.client.model.*;
import ru.brobrocode.cadra.dto.ResumeDTO;
import ru.brobrocode.cadra.dto.SelectedTariffDTO;
import ru.brobrocode.cadra.dto.SettingsDTO;
import ru.brobrocode.cadra.dto.UserInfoDTO;
import ru.brobrocode.cadra.entity.Resume;
import ru.brobrocode.cadra.entity.SelectedTariff;
import ru.brobrocode.cadra.entity.UserInfo;
import ru.brobrocode.cadra.mapper.UserMapper;
import ru.brobrocode.cadra.repository.ResumeRepository;
import ru.brobrocode.cadra.repository.SelectedTariffRepository;
import ru.brobrocode.cadra.repository.UserInfoRepository;
import ru.brobrocode.cadra.repository.VacancyProcessingStateRepository;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.concurrent.locks.ReentrantLock;

import static ru.brobrocode.cadra.constants.HHApiConstants.*;

@Service
@RequiredArgsConstructor
@Slf4j
public class UserService {

	private final UserInfoRepository userInfoRepository;
	private final ResumeRepository resumeRepository;
	private final MeApi meApi;
	private final ResumesApi resumesApi;
	private final SelectedTariffRepository selectedTariffRepository;
//	private final UserMapper userMapper;
	private final VacancyService vacancyService;
	private final ObjectMapper objectMapper;
	private final OAuth2AuthorizedClientManager clientManager;
	private final LoadingCache<String, UserInfoDTO> userInfoCache;

	public UserInfoDTO getCurrentUser() {
		UserInfo userInfo = getUserInfo();
		if (userInfo == null) {
			throw new RuntimeException("User not found");
		}
		if (userInfo.getAccessToken() == null) {
			saveTokens(userInfo);
		}
		UserInfoDTO userInfoDTO = userInfoCache.get(userInfo.getId());
		if (userInfoDTO == null || userInfoDTO.getId() == null) {
			userInfoDTO = getCurrentUserInfo(userInfo, userInfo.getAccessToken());
			SelectedTariff selectedTariff = getSelectedTariff(userInfo.getId());
			fillSelectedTariff(userInfoDTO, selectedTariff, userInfo);
			List<ResumeDTO> resumes = getResumes(userInfo);
			userInfoDTO.setResumes(resumes);
			userInfoCache.put(userInfo.getId(), userInfoDTO);
		}
		return userInfoDTO;
	}

	private void fillSelectedTariff(UserInfoDTO userInfoDTO, SelectedTariff selectedTariff, UserInfo userInfo) {
		if (selectedTariff == null) {
			return;
		}
		SelectedTariffDTO selectedTariffDTO = new SelectedTariffDTO();
		selectedTariffDTO.setTitle(selectedTariff.getTariff().getName());
		selectedTariffDTO.setMaxResponses(selectedTariff.getMaxResponses());
		Integer availableVacanciesForToday = vacancyService.getResponsesCount(selectedTariff, userInfo);
		selectedTariffDTO.setAvailableVacanciesForToday(availableVacanciesForToday);
		userInfoDTO.setSelectedTariff(selectedTariffDTO);
	}

	private UserInfoDTO getCurrentUserInfo(UserInfo userInfo, String accessToken) {
		UserInfoDTO userInfoDTO = new UserInfoDTO();
		userInfoDTO.setId(userInfo.getId());
		ResponseEntity<MeProfile> currentUserInfo = meApi.getCurrentUserInfo(
				DEFAULT_USER_AGENT,
				"Bearer " + accessToken,
				DEFAULT_LOCALE,
				DEFAULT_HOST);
		if (currentUserInfo.getStatusCode().is2xxSuccessful()) {
			MeProfile meProfile = currentUserInfo.getBody();
			if (meProfile instanceof MeManagerProfile) {
				userInfoDTO.setMessage("Пользователь является работодателем");
			} else if (meProfile instanceof MeApplicantProfile applicant) {
				userInfoDTO.setEmail(applicant.getEmail());
				userInfoDTO.setPhone(applicant.getPhone());
				userInfoDTO.setFirstName(applicant.getFirstName());
				userInfoDTO.setLastName(applicant.getLastName());
				userInfoDTO.setMiddleName(applicant.getMiddleName());
				userInfoDTO.setShowOnboarding(userInfo.getShowOnboarding());
			}
		}
		return userInfoDTO;
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

	private UserInfo getUserInfo() {
		Object principal = SecurityContextHolder.getContext().getAuthentication().getPrincipal();
		if (principal instanceof OAuth2User user) {
			Map<String, Object> attributes = user.getAttributes();
			String userId = (String) attributes.get("id");
			return userInfoRepository.findById(userId)
					.orElseThrow(() -> new IllegalArgumentException("User not found"));
		}
		throw new IllegalStateException("User not found");
	}

	public UserInfo findById(String userId) {
		return userInfoRepository.findById(userId).orElseThrow(() -> new IllegalArgumentException("User not found"));
	}

	public UserInfo processOAuthUser(Map<String, Object> attributes) {
		UserInfo userInfo = userInfoRepository.findById((String) attributes.get("id")).orElse(null);
		if (userInfo == null) {
			userInfo = new UserInfo();
			userInfo.setId((String) attributes.get("id"));
			userInfo.setRole("ROLE_USER");
		}
//		userInfo.setPhone((String) attributes.get("phone"));
//		userInfo.setEmail((String) attributes.get("email"));
//		userInfo.setFirstName((String) attributes.get("first_name"));
//		userInfo.setLastName((String) attributes.get("last_name"));
//		userInfo.setMiddleName((String) attributes.get("middle_name"));
		return userInfoRepository.save(userInfo);
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
}
