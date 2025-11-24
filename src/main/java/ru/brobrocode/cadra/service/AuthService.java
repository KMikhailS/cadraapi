package ru.brobrocode.cadra.service;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.oauth2.client.OAuth2AuthorizedClient;
import org.springframework.security.oauth2.client.OAuth2AuthorizedClientService;
import org.springframework.security.oauth2.core.OAuth2AccessToken;
import org.springframework.security.oauth2.core.OAuth2RefreshToken;
import org.springframework.stereotype.Service;
import ru.brobrocode.cadra.client.api.OauthApi;
import ru.brobrocode.cadra.client.model.AuthUserToken;
import ru.brobrocode.cadra.config.exception.RefreshTokenException;
import ru.brobrocode.cadra.config.exception.TokenNotExpiredException;
import ru.brobrocode.cadra.entity.UserInfo;
import ru.brobrocode.cadra.repository.UserInfoRepository;

import java.time.Instant;
import java.time.LocalDateTime;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

@Slf4j
@RequiredArgsConstructor
@Service
public class AuthService {

	private final OauthApi oauthApi;
	private final OAuth2AuthorizedClientService authorizedClientService;
	private final UserInfoRepository userInfoRepository;

	// Lock objects per user to prevent concurrent token refresh for the same user
	private final Map<String, Object> refreshLocks = new ConcurrentHashMap<>();

	/**
	 * Refreshes the access token and refresh token for the current user.
	 * This method is called automatically when a 403 token-expired error is received from HH API.
	 * It updates tokens in both OAuth2AuthorizedClientService (in-memory) and UserInfo database.
	 * Uses per-user synchronization to prevent concurrent token refresh attempts.
	 *
	 * @throws RefreshTokenException if token refresh fails
	 */
	public void refreshToken() {
		Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
		if (authentication == null) {
			log.error("Token refresh failed: no authentication context found");
			throw new RefreshTokenException("No authentication context available");
		}

		String userId = authentication.getName();
		log.info("Starting token refresh for user: {}", userId);

		// Get or create lock for this specific user
		Object userLock = refreshLocks.computeIfAbsent(userId, k -> new Object());

		synchronized (userLock) {
			try {
				// Load UserInfo from database to get refresh token
				UserInfo userInfo = userInfoRepository.findById(userId)
						.orElseThrow(() -> new RefreshTokenException("User not found in database: " + userId));

				if (userInfo.getRefreshToken() == null) {
					log.error("Token refresh failed for user {}: no refresh token available", userId);
					throw new RefreshTokenException("No refresh token available for user: " + userId);
				}

				// Check if token is actually expired
				if (userInfo.getTokenExpiresAt() != null &&
					userInfo.getTokenExpiresAt().isAfter(LocalDateTime.now())) {
					log.warn("Token refresh skipped for user {}: token not yet expired (expires at: {})",
							userId, userInfo.getTokenExpiresAt());
					throw new TokenNotExpiredException("Token is still valid, retry with current token");
				}

				String refreshTokenValue = userInfo.getRefreshToken();
				log.debug("Requesting new token pair from HH API for user: {}", userId);

				// Request new token pair from HH API
				ResponseEntity<AuthUserToken> response = oauthApi.refreshToken(
						"refresh_token",
						refreshTokenValue
				);

				if (response.getBody() == null) {
					log.error("Token refresh failed for user {}: empty response from HH API", userId);
					throw new RefreshTokenException("Empty response from token refresh endpoint");
				}

				AuthUserToken authUserToken = response.getBody();
				log.info("Successfully received new token pair from HH API for user: {}", userId);

				// Create new OAuth2 tokens
				OAuth2AccessToken newAccessToken = new OAuth2AccessToken(
						OAuth2AccessToken.TokenType.BEARER,
						authUserToken.getAccessToken(),
						Instant.now(),
						Instant.now().plusSeconds(authUserToken.getExpiresIn())
				);

				OAuth2RefreshToken newRefreshToken = new OAuth2RefreshToken(
						authUserToken.getRefreshToken(),
						Instant.now()
				);

				// Load current OAuth2 client to update it with new tokens
				OAuth2AuthorizedClient currentClient = authorizedClientService
						.loadAuthorizedClient("hh", userId);

				if (currentClient != null) {
					// Update OAuth2AuthorizedClientService (in-memory)
					OAuth2AuthorizedClient updatedClient = new OAuth2AuthorizedClient(
							currentClient.getClientRegistration(),
							currentClient.getPrincipalName(),
							newAccessToken,
							newRefreshToken
					);
					authorizedClientService.saveAuthorizedClient(updatedClient, authentication);
					log.debug("Updated OAuth2AuthorizedClient for user: {}", userId);
				} else {
					log.warn("OAuth2AuthorizedClient not found for user {}, skipping in-memory update", userId);
				}

				// Update UserInfo in database
				updateUserInfoTokens(userInfo, authUserToken);

				log.info("Token refresh completed successfully for user: {}", userId);

			} catch (RefreshTokenException e) {
				throw e;
			} catch (TokenNotExpiredException e) {
				throw e;
			} catch (feign.FeignException.BadRequest e) {
				// Handle "token not expired" error from HH API
				if (e.getMessage() != null && e.getMessage().contains("token not expired")) {
					log.warn("HH API returned 'token not expired' for user {}, token is still valid", userId);
					throw new TokenNotExpiredException("Token is still valid according to HH API, retry with current token");
				}
				log.error("Bad request during token refresh for user: {}", userId, e);
				throw new RefreshTokenException("Token refresh failed for user: " + userId, e);
			} catch (Exception e) {
				log.error("Unexpected error during token refresh for user: {}", userId, e);
				throw new RefreshTokenException("Token refresh failed for user: " + userId, e);
			} finally {
				// Clean up lock to prevent memory leak
				refreshLocks.remove(userId);
			}
		}
	}

	/**
	 * Updates access token and refresh token in UserInfo database.
	 *
	 * @param userInfo user entity to update
	 * @param authUserToken new token data from HH API
	 */
	private void updateUserInfoTokens(UserInfo userInfo, AuthUserToken authUserToken) {
		try {
			log.debug("Updating tokens in database for user: {}", userInfo.getId());

			userInfo.setAccessToken(authUserToken.getAccessToken());
			userInfo.setRefreshToken(authUserToken.getRefreshToken());

			// Calculate and save token expiration time
			if (authUserToken.getExpiresIn() != null) {
				LocalDateTime expiresAt = LocalDateTime.now().plusSeconds(authUserToken.getExpiresIn());
				userInfo.setTokenExpiresAt(expiresAt);
				log.debug("Token expiration time set to: {} for user: {}", expiresAt, userInfo.getId());
			}

			userInfo.setUpdatedAt(LocalDateTime.now());

			userInfoRepository.save(userInfo);

			log.info("Successfully updated tokens in database for user: {}", userInfo.getId());

		} catch (Exception e) {
			log.error("Failed to update tokens in database for user: {}", userInfo.getId(), e);
			throw new RefreshTokenException("Failed to persist tokens to database for user: " + userInfo.getId(), e);
		}
	}
}
