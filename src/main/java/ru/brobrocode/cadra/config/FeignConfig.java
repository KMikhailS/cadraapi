package ru.brobrocode.cadra.config;

import com.fasterxml.jackson.databind.ObjectMapper;
import feign.Retryer;
import feign.codec.ErrorDecoder;
import lombok.RequiredArgsConstructor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.oauth2.client.OAuth2AuthorizedClientManager;
import ru.brobrocode.cadra.service.AuthService;

@Configuration
@RequiredArgsConstructor
public class FeignConfig {

//	private final OAuth2AuthorizedClientManager oAuth2AuthorizedClientManager;

    @Bean
    public OAuth2FeignRequestInterceptor requestInterceptor() {
        return new OAuth2FeignRequestInterceptor();
    }

	@Bean
	public ErrorDecoder errorDecoder(AuthService authService, ObjectMapper objectMapper) {
		return new CustomErrorDecoder(authService, objectMapper);
	}

	@Bean
	public Retryer retryer() {
		return new TokenRefreshRetryer();
	}
}
