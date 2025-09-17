package ru.brobrocode.cadra.service;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.oauth2.core.user.OAuth2User;
import org.springframework.stereotype.Service;
import ru.brobrocode.cadra.client.api.MeApi;
import ru.brobrocode.cadra.client.api.ResumesApi;
import ru.brobrocode.cadra.client.model.MeApplicantProfile;
import ru.brobrocode.cadra.client.model.MeProfile;
import ru.brobrocode.cadra.client.model.ResumesMineItem;
import ru.brobrocode.cadra.client.model.ResumesMineResponse;
import ru.brobrocode.cadra.dto.ResumeDTO;
import ru.brobrocode.cadra.dto.UserInfoDTO;
import ru.brobrocode.cadra.entity.Resume;
import ru.brobrocode.cadra.entity.SelectedTariff;
import ru.brobrocode.cadra.entity.UserInfo;
import ru.brobrocode.cadra.mapper.UserMapper;
import ru.brobrocode.cadra.repository.ResumeRepository;
import ru.brobrocode.cadra.repository.SelectedTariffRepository;
import ru.brobrocode.cadra.repository.UserInfoRepository;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;

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
	private final UserMapper userMapper;
	private final VacancyService vacancyService;

	public UserInfoDTO getCurrentUser() {
		MeApplicantProfile userProfile = getUserProfile();
		SelectedTariff selectedTariff = getSelectedTariff(userProfile.getId());
		List<ResumeDTO> resumes = getResumes();
		UserInfoDTO userInfoDTO = userMapper.toUserInfoDTO(userProfile, selectedTariff);
		userInfoDTO.setResumes(resumes);

		return userInfoDTO;
	}

	public UserInfoDTO getResumeInfo() {
		UserInfoDTO userInfoDTO = new UserInfoDTO();
		List<ResumeDTO> resumes = getResumes();
		userInfoDTO.setResumes(resumes);

		return userInfoDTO;
	}

	private List<ResumeDTO> getResumes() {
		List<ResumesMineItem> mineResumes = getMineResumes();
		List<ResumeDTO> resumes = new ArrayList<>();
		for (ResumesMineItem mineResume : mineResumes) {
			ResumeDTO resumeDTO = new ResumeDTO();
			resumeDTO.setId(mineResume.getId());
			resumeDTO.setTitle(mineResume.getTitle());
			Integer foundVacanciesCount = vacancyService.getFoundVacanciesCount(mineResume.getId());
			resumeDTO.setVacanciesToApply(foundVacanciesCount);
			resumes.add(resumeDTO);
		}
		return resumes;
	}

	public MeApplicantProfile getUserProfile() {
		try {
			ResponseEntity<MeProfile> response = meApi.getCurrentUserInfo(
					DEFAULT_USER_AGENT,
					DEFAULT_LOCALE,
					DEFAULT_HOST
			);

			MeProfile userResponse = response.getBody();
			if (userResponse instanceof MeApplicantProfile userProfile) {
				return userProfile;
			}
		} catch (Exception e) {
			log.error("Error getting current user information", e);
			throw new RuntimeException("Failed to retrieve user information from hh.ru", e);
		}
		return null;
	}

	public List<ResumesMineItem> getMineResumes() {
		try {
			ResponseEntity<ResumesMineResponse> response = resumesApi.getMineResumes(
					DEFAULT_USER_AGENT,
					DEFAULT_LOCALE,
					DEFAULT_HOST
			);

			ResumesMineResponse resumesResponse = response.getBody();
			if (resumesResponse != null) {
				return resumesResponse.getItems();
			}
		} catch (Exception e) {
			log.error("Error getting current user information", e);
			throw new RuntimeException("Failed to retrieve user information from hh.ru", e);
		}
		return Collections.emptyList();
	}

	public SelectedTariff getSelectedTariff(String userId) {
		return selectedTariffRepository.findByUserIdAndIsActive(userId, true).orElse(null);
	}

	private void saveResume(ResumesMineItem resumeItem, UserInfo userInfo) {
		Resume resume = new Resume();
		resume.setId(resumeItem.getId());
		resume.setTitle(resumeItem.getTitle());
		resume.setUser(userInfo);
		resumeRepository.save(resume);
	}

	private UserInfo getUserInfo() {
		OAuth2User principal = (OAuth2User) SecurityContextHolder.getContext().getAuthentication().getPrincipal();
		Map<String, Object> attributes = principal.getAttributes();
		String userId = (String) attributes.get("id");
		return findById(userId);
	}

	public UserInfo findById(String userId) {
		return userInfoRepository.findById(userId).orElseThrow(() -> new IllegalArgumentException("User not found"));
	}

	public UserInfo processOAuthUser(Map<String, Object> attributes) {
		UserInfo userInfo = userInfoRepository.findById((String) attributes.get("id")).orElse(null);
		if (userInfo == null) {
			userInfo = new UserInfo();
			userInfo.setId((String) attributes.get("id"));
		}
		userInfo.setRole("ROLE_USER");
		userInfo.setPhone((String) attributes.get("phone"));
		userInfo.setEmail((String) attributes.get("email"));
		userInfo.setFirstName((String) attributes.get("first_name"));
		userInfo.setLastName((String) attributes.get("last_name"));
		userInfo.setMiddleName((String) attributes.get("middle_name"));
		return userInfoRepository.save(userInfo);
	}
}
