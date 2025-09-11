package ru.brobrocode.cadra.config;

import lombok.RequiredArgsConstructor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.oauth2.client.OAuth2AuthorizedClientManager;

@Configuration
@RequiredArgsConstructor
public class FeignConfig {

	private final OAuth2AuthorizedClientManager oAuth2AuthorizedClientManager;

    @Bean
    public OAuth2FeignRequestInterceptor requestInterceptor() {
        return new OAuth2FeignRequestInterceptor(oAuth2AuthorizedClientManager);
    }
}