package ru.brobrocode.cadra.security;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.ResponseEntity;
import org.springframework.security.oauth2.client.endpoint.OAuth2AccessTokenResponseClient;
import org.springframework.security.oauth2.client.endpoint.OAuth2AuthorizationCodeGrantRequest;
import org.springframework.security.oauth2.core.OAuth2AccessToken;
import org.springframework.security.oauth2.core.endpoint.OAuth2AccessTokenResponse;
import ru.brobrocode.cadra.client.api.OauthApi;
import ru.brobrocode.cadra.client.model.AuthUserToken;

@Slf4j
@RequiredArgsConstructor
public class CustomAccessTokenResponseClient implements OAuth2AccessTokenResponseClient<OAuth2AuthorizationCodeGrantRequest> {

	@Value("${cadra.client-id}")
	private String clientId;
	@Value("${cadra.client-secret}")
	private String clientSecret;
	@Value("${cadra.redirect-uri}")
	private String redirectUri;

	private final OauthApi oauthApi;

	@Override
	public OAuth2AccessTokenResponse getTokenResponse(OAuth2AuthorizationCodeGrantRequest authorizationGrantRequest) {
		try {
			String authorizationCode = authorizationGrantRequest
					.getAuthorizationExchange()
					.getAuthorizationResponse()
					.getCode();
			ResponseEntity<AuthUserToken> response = oauthApi.authorize(
					clientId,
					clientSecret,
					authorizationCode,
					"authorization_code",
					redirectUri,
					null
			);
			if (response.getBody() != null) {
				AuthUserToken authUserToken = response.getBody();
				return OAuth2AccessTokenResponse
						.withToken(authUserToken.getAccessToken())
						.refreshToken(authUserToken.getRefreshToken())
						.expiresIn(authUserToken.getExpiresIn())
						.tokenType(OAuth2AccessToken.TokenType.BEARER)
						.build();
			}
		} catch (Exception e) {
			log.error(e.getMessage(), e);
			throw new RuntimeException(e);
		}
		return null;
	}
}
