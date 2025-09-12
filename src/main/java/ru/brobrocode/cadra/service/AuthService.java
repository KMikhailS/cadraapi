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

import java.time.Instant;

@Slf4j
@RequiredArgsConstructor
@Service
public class AuthService {

	private final OauthApi oauthApi;
	private final OAuth2AuthorizedClientService authorizedClientService;

	public void refreshToken() {
		try {
			Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
			if (authentication == null) {
				throw new RefreshTokenException("Token initialization failed");
			}
			String principalName = authentication.getName();
			OAuth2AuthorizedClient currentClient = authorizedClientService
					.loadAuthorizedClient("hh", principalName);

			if (currentClient == null || currentClient.getRefreshToken() == null) {
				throw new RefreshTokenException("No refresh token available");
			}
			String refreshToken = currentClient.getRefreshToken().getTokenValue();
			ResponseEntity<AuthUserToken> response = oauthApi.refreshToken(
					"refresh_token",
					refreshToken
			);
			if (response.getBody() != null) {
				AuthUserToken authUserToken = response.getBody();
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
				OAuth2AuthorizedClient updatedClient = new OAuth2AuthorizedClient(
						currentClient.getClientRegistration(),
						currentClient.getPrincipalName(),
						newAccessToken,
						newRefreshToken
				);
				authorizedClientService.saveAuthorizedClient(updatedClient, authentication);
			}
		} catch (Exception e) {
			log.error("Failed to initialize token with authorization code", e);
			throw new RefreshTokenException("Token initialization failed", e);
		}
	}
}
