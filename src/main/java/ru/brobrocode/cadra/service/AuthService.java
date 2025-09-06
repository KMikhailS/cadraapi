package ru.brobrocode.cadra.service;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import ru.brobrocode.cadra.client.api.MeApi;
import ru.brobrocode.cadra.client.api.OauthApi;
import ru.brobrocode.cadra.client.model.AuthUserToken;
import ru.brobrocode.cadra.client.model.MeApplicantProfile;
import ru.brobrocode.cadra.client.model.MeProfile;
import ru.brobrocode.cadra.client.wrapper.AccessTokenHolder;
import ru.brobrocode.cadra.entity.UserInfo;
import ru.brobrocode.cadra.repository.UserInfoRepository;

import java.time.LocalDateTime;

import static ru.brobrocode.cadra.constants.HHApiConstants.*;

@Slf4j
@RequiredArgsConstructor
@Service
public class AuthService {

	@Value("${cadra.client-id}")
	private String clientId;
	@Value("${cadra.client-secret}")
	private String clientSecret;
//	@Value("${cadra.redirect-uri}")
//	private String redirectUri;

	private final OauthApi oauthApi;
	private final MeApi meApi;
	private final AccessTokenHolder accessTokenHolder;
	private final UserInfoRepository userInfoRepository;

	public void authenticateUser(String authorizationCode) {
		UserInfo userInfo = new UserInfo();
//		String accessToken = initializeToken(authorizationCode, userInfo);
//		userInfo = getUserInfo(accessToken, userInfo);
	}

//	private String initializeToken(String authorizationCode, UserInfo userInfo) {
//		try {
//			String redirectUri = "https://cadra.online/auth/callback";
//			log.info("Initializing token with authorization code");
//			ResponseEntity<AuthUserToken> response = oauthApi.authorize(
//					clientId,
//					clientSecret,
//					authorizationCode,
//					"authorization_code",
//					redirectUri,
//					null
//			);
//			return processTokenResponse(response, userInfo);
//		} catch (Exception e) {
//			log.error("Failed to initialize token with authorization code", e);
//			throw new RuntimeException("Token initialization failed", e);
//		}
//	}

//	private String processTokenResponse(ResponseEntity<AuthUserToken> response, UserInfo userInfo) {
//		AuthUserToken tokenResponse = response.getBody();
//		if (tokenResponse == null) {
//			throw new RuntimeException("No access token available. User needs to re-authenticate.");
//		}
//		userInfo.setAccessToken(tokenResponse.getAccessToken());
//		userInfo.setRefreshToken(tokenResponse.getRefreshToken());
//		long expiresInSeconds = tokenResponse.getExpiresIn() - 60;
//		LocalDateTime tokenExpiresAt = LocalDateTime.now().plusSeconds(expiresInSeconds);
//		userInfo.setExpiresAt(tokenExpiresAt);
//
//		return tokenResponse.getAccessToken();
//	}

	private UserInfo getUserInfo(String accessToken, UserInfo userInfo) {
		MeProfile meProfile = getMeProfile(accessToken);
		if (meProfile instanceof MeApplicantProfile profile) {
			String hhId = profile.getId();
			UserInfo existUser = userInfoRepository.findById(hhId).orElse(null);
			if (existUser != null) {
				return existUser;
			}
			userInfo.setPhone(profile.getPhone());
			userInfo.setEmail(profile.getEmail());
			userInfo.setFirstName(profile.getFirstName());
			userInfo.setLastName(profile.getLastName());
			userInfo.setMiddleName(profile.getMiddleName());
		}
		return userInfoRepository.save(userInfo);
	}

	public MeProfile getMeProfile(String accessToken) {
		accessTokenHolder.setAccessToken(accessToken);
		try {
			ResponseEntity<MeProfile> response = meApi.getCurrentUserInfo(
					DEFAULT_USER_AGENT,
					DEFAULT_LOCALE,
					DEFAULT_HOST
			);

			MeProfile userProfile = response.getBody();
			log.info("Successfully retrieved user profile with auth_type: {}",
					userProfile != null ? userProfile.getAuthType() : "null");

			return userProfile;
		} catch (Exception e) {
			log.error("Error getting current user information", e);
			throw new RuntimeException("Failed to retrieve user information from hh.ru", e);
		} finally {
			accessTokenHolder.resetAccessToken();
		}
	}
}
