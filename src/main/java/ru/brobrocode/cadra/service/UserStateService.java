package ru.brobrocode.cadra.service;

import com.github.benmanes.caffeine.cache.LoadingCache;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.oauth2.core.user.OAuth2User;
import org.springframework.stereotype.Service;
import ru.brobrocode.cadra.client.api.MeApi;
import ru.brobrocode.cadra.client.model.MeApplicantProfile;
import ru.brobrocode.cadra.client.model.MeManagerProfile;
import ru.brobrocode.cadra.client.model.MeProfile;
import ru.brobrocode.cadra.dto.UserInfoDTO;
import ru.brobrocode.cadra.entity.UserInfo;
import ru.brobrocode.cadra.repository.UserInfoRepository;

import java.util.Map;

import static ru.brobrocode.cadra.constants.HHApiConstants.*;

@Slf4j
@RequiredArgsConstructor
@Service
public class UserStateService {

	private final UserInfoRepository userInfoRepository;
	private final MeApi meApi;
	private final LoadingCache<String, UserInfoDTO> userInfoCache;

	public UserInfo getUserInfo() {
		Object principal = SecurityContextHolder.getContext().getAuthentication().getPrincipal();
		if (principal instanceof OAuth2User user) {
			Map<String, Object> attributes = user.getAttributes();
			String userId = (String) attributes.get("id");
			return userInfoRepository.findById(userId)
					.orElseThrow(() -> new IllegalArgumentException("User not found"));
		}
		throw new IllegalStateException("User not found");
	}

	public UserInfo getUserInfoWithTariffAndResumes() {
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

	public UserInfoDTO getUserInfoDTO(UserInfo userInfo) {
		UserInfoDTO userInfoDTO = userInfoCache.get(userInfo.getId());
		if (userInfoDTO == null || userInfoDTO.getId() == null) {
			userInfoDTO = getCurrentUserInfo(userInfo, userInfo.getAccessToken());
			userInfoCache.put(userInfo.getId(), userInfoDTO);
		}
		return userInfoDTO;
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
				userInfoDTO.setMessage("Ваш статус на hh.ru работодатель. Чтобы пользоваться сервисом поменяйте статус на соискатель");
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
}
