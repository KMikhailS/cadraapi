package ru.brobrocode.cadra.config;

import feign.RequestInterceptor;
import lombok.RequiredArgsConstructor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import ru.brobrocode.cadra.client.wrapper.UserInfoHolder;
import ru.brobrocode.cadra.service.CustomAccessTokenProvider;

@Configuration
@RequiredArgsConstructor
public class FeignConfig {

	private final CustomAccessTokenProvider tokenProvider;
	private final UserInfoHolder userInfoHolder;

    @Bean
    public AuthorizationInterceptor requestInterceptor() {
        return new AuthorizationInterceptor(tokenProvider, userInfoHolder);
    }
}