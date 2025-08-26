package ru.brobrocode.cadra.service;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import ru.brobrocode.cadra.client.api.OauthApi;
import ru.brobrocode.cadra.client.model.AuthUserToken;
import ru.brobrocode.cadra.client.model.AuthUserTokenAndAppToken;
import ru.brobrocode.cadra.entity.UserInfo;
import ru.brobrocode.cadra.repository.UserInfoRepository;

import java.time.LocalDateTime;

@Service
@RequiredArgsConstructor
@Slf4j
public class CustomAccessTokenProvider {

	@Value("${cadra.client-id}")
	private String clientId;
	@Value("${cadra.client-secret}")
	private String clientSecret;

	@Value("${cadra.redirect-uri}")
	private String redirectUri;

	private final OauthApi oauthApi;
	private final UserInfoRepository userInfoRepository;

	/**
	 * Get a valid access token, refreshing if necessary
	 */
	public String getAccessToken(String userId) {
		UserInfo userInfo = userInfoRepository.findById(userId)
				.orElseThrow(() -> new IllegalArgumentException("User not found"));
		if (userInfo.getAccessToken() == null) {
			return initializeToken(userInfo);
		} else if (userInfo.getExpiresAt().isBefore(LocalDateTime.now())) {
			return refreshAccessToken(userInfo);
		}
		return userInfo.getAccessToken();
	}

	//    /**
//     * Initialize token with authorization code
//     */
	public String initializeToken(UserInfo userInfo) {
		try {
			log.info("Initializing token with authorization code");
			String authorizationCode = userInfo.getAccessToken();
			ResponseEntity<AuthUserTokenAndAppToken> response = oauthApi.authorize(
					clientId,
					clientSecret,
					authorizationCode,
					"authorization_code",
					redirectUri,
					null
			);
			return processTokenResponse(response, userInfo);
		} catch (Exception e) {
			log.error("Failed to initialize token with authorization code", e);
			throw new RuntimeException("Token initialization failed", e);
		}
	}

	//    /**
//     * Refresh the access token using refresh token
//     */
	private String refreshAccessToken(UserInfo userInfo) {
		String currentRefreshToken = userInfo.getRefreshToken();
		if (currentRefreshToken == null) {
			throw new RuntimeException("No refresh token available. User needs to re-authenticate.");
		}
		try {
			log.info("Refreshing access token using refresh token");
			String authorizationCode = userInfo.getAccessToken();
			ResponseEntity<AuthUserTokenAndAppToken> response = oauthApi.authorize(
					clientId,
					clientSecret,
					authorizationCode,
					"refresh_token",
					redirectUri,
					currentRefreshToken
			);
			return processTokenResponse(response, userInfo);
		} catch (Exception e) {
			log.error("Failed to refresh access token", e);
			throw new RuntimeException("Token refresh failed. User needs to re-authenticate.", e);
		}
	}

	//    /**
//     * Process token response and store tokens
//     */
	private String processTokenResponse(ResponseEntity<AuthUserTokenAndAppToken> response, UserInfo userInfo) {
		AuthUserTokenAndAppToken tokenResponse = response.getBody();

		if (tokenResponse instanceof AuthUserToken userToken) {
			String currentAccessToken = userToken.getAccessToken();
			String currentRefreshToken = userToken.getRefreshToken();

			long expiresInSeconds = userToken.getExpiresIn() - 60;
			LocalDateTime tokenExpiresAt = LocalDateTime.now().plusSeconds(expiresInSeconds);

			userInfo.setAccessToken(currentAccessToken);
			userInfo.setRefreshToken(currentRefreshToken);
			userInfo.setExpiresAt(tokenExpiresAt);
			userInfoRepository.save(userInfo);
			log.info("Token stored successfully. Expires at: {}", tokenExpiresAt);

			return currentAccessToken;
		} else {
			throw new RuntimeException("Unexpected token response type: " +
					(tokenResponse != null ? tokenResponse.getClass().getSimpleName() : "null"));
		}
	}
//
//    /**
//     * Check if current token is valid and not expired
//     */
//    private boolean isTokenValid() {
//        return currentAccessToken != null &&
//               tokenExpiresAt != null &&
//               LocalDateTime.now().isBefore(tokenExpiresAt);
//    }
//
//    /**
//     * Clear all stored tokens
//     */
//    public void clearTokens() {
//        tokenLock.lock();
//        try {
//            log.info("Clearing stored tokens");
//            currentAccessToken = null;
//            currentRefreshToken = null;
//            tokenExpiresAt = null;
//        } finally {
//            tokenLock.unlock();
//        }
//    }
//
//    /**
//     * Invalidate current token on the server
//     */
//    public void invalidateToken() {
//        if (currentAccessToken == null) {
//            log.warn("No active token to invalidate");
//            return;
//        }
//
//        try {
//            log.info("Invalidating token on server");
//            oauthApi.invalidateToken();
//            clearTokens();
//            log.info("Token invalidated successfully");
//        } catch (Exception e) {
//            log.error("Failed to invalidate token on server", e);
//            // Clear local tokens even if server invalidation fails
//            clearTokens();
//        }
//    }
//
//    /**
//     * Check if we have any stored tokens (for status checking)
//     */
//    public boolean hasTokens() {
//        return currentAccessToken != null;
//    }
//
//    /**
//     * Get token expiration time (for status checking)
//     */
//    public LocalDateTime getTokenExpiresAt() {
//        return tokenExpiresAt;
//    }
}