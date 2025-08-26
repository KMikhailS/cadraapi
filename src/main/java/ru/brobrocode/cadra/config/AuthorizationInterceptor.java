package ru.brobrocode.cadra.config;

import feign.RequestInterceptor;
import feign.RequestTemplate;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;
import ru.brobrocode.cadra.client.wrapper.UserInfoHolder;
import ru.brobrocode.cadra.service.CustomAccessTokenProvider;

@Component
@RequiredArgsConstructor
@Slf4j
public class AuthorizationInterceptor implements RequestInterceptor {

    private final CustomAccessTokenProvider tokenProvider;
    private final UserInfoHolder userInfoHolder;

    private static final String AUTHORIZATION_HEADER = "Authorization";
    private static final String BEARER_PREFIX = "Bearer ";

    @Override
    public void apply(RequestTemplate template) {
        try {
            String accessToken = tokenProvider.getAccessToken(userInfoHolder.getUserInfo());
            if (accessToken != null && !accessToken.trim().isEmpty()) {
                template.header(AUTHORIZATION_HEADER, BEARER_PREFIX + accessToken);
                log.info("Added authorization header to request: {} {}",
                    template.method(), template.url());
            } else {
                log.info("No access token available for request: {} {}",
                    template.method(), template.url());
            }

        } catch (Exception e) {
            log.error("Failed to add authorization header for request: {} {}. Error: {}",
                template.method(), template.url(), e.getMessage());
        }
    }
}