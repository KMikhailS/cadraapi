package ru.brobrocode.cadra.config;

import feign.Request;
import feign.RequestInterceptor;
import feign.RequestTemplate;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.oauth2.client.OAuth2AuthorizeRequest;
import org.springframework.security.oauth2.client.OAuth2AuthorizedClient;
import org.springframework.security.oauth2.client.OAuth2AuthorizedClientManager;
import org.springframework.stereotype.Component;

import java.util.Base64;

@Slf4j
@RequiredArgsConstructor
@Component
public class OAuth2FeignRequestInterceptor implements RequestInterceptor {

	@Value("${yukassa.shop-id}")
	private String shopId;
	@Value("${yukassa.secret-key}")
	private String secretKey;

//	private final OAuth2AuthorizedClientManager clientManager;

	@Override
	public void apply(RequestTemplate template) {
		Request request = template.request();
		if (request.url().contains("payments")) {
			String credentials = shopId + ":" + secretKey;
			String base64Credentials = Base64.getEncoder().encodeToString(credentials.getBytes());
			template.header("Authorization", "Basic " + base64Credentials);
			template.header("Content-Type", "application/json");
		}
//		} else {
//			String token = getAccessToken();
//			if (token != null) {
//				template.header("Authorization", "Bearer " + token);
//			}
//		}
	}

//	private String getAccessToken() {
//		Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
//
//		if (authentication == null) {
//			return null;
//		}
//
//		OAuth2AuthorizeRequest request = OAuth2AuthorizeRequest
//				.withClientRegistrationId("hh")
//				.principal(authentication)
//				.build();
//
//		OAuth2AuthorizedClient client = clientManager.authorize(request);
//
//		return client != null ? client.getAccessToken().getTokenValue() : null;
//	}
}
