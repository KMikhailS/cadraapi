package ru.brobrocode.cadra.client.config;

import com.fasterxml.jackson.databind.ObjectMapper;
import feign.Logger;
import feign.Request;
import feign.Retryer;
import feign.codec.ErrorDecoder;
import feign.slf4j.Slf4jLogger;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Lazy;
import ru.brobrocode.cadra.config.CustomErrorDecoder;
import ru.brobrocode.cadra.config.TokenRefreshRetryer;
import ru.brobrocode.cadra.service.AuthService;

/**
 * Feign configuration for all HH API clients.
 * Includes CustomErrorDecoder for token refresh on 403 token-expired errors
 * and TokenRefreshRetryer for automatic retry logic.
 */
public class HhApiFeignConfiguration {

	@Value("${feign.client.config.default.connectTimeout:30000}")
	private int connectTimeout;

	@Value("${feign.client.config.default.readTimeout:300000}")
	private int readTimeout;

	@Bean
	Logger.Level feignLoggerLevel() {
		return Logger.Level.FULL;
	}

	@Bean
	Logger feignLogger() {
		return new Slf4jLogger();
	}

	@Bean
	public Request.Options options() {
		return new Request.Options(connectTimeout, readTimeout);
	}

	@Bean
	public ErrorDecoder errorDecoder(@Lazy AuthService authService, ObjectMapper objectMapper) {
		return new CustomErrorDecoder(authService, objectMapper);
	}

	@Bean
	public Retryer retryer() {
		return new TokenRefreshRetryer();
	}
}
