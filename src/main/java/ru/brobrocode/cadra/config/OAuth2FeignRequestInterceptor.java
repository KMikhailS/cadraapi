package ru.brobrocode.cadra.config;

import feign.RequestInterceptor;
import feign.RequestTemplate;
import lombok.RequiredArgsConstructor;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.oauth2.client.OAuth2AuthorizeRequest;
import org.springframework.security.oauth2.client.OAuth2AuthorizedClient;
import org.springframework.security.oauth2.client.OAuth2AuthorizedClientManager;
import org.springframework.stereotype.Component;

@RequiredArgsConstructor
@Component
public class OAuth2FeignRequestInterceptor implements RequestInterceptor {

	private final OAuth2AuthorizedClientManager clientManager;

	@Override
	public void apply(RequestTemplate template) {
		String token = getAccessToken();
		if (token != null) {
			template.header("Authorization", "Bearer " + token);
		}
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
}
