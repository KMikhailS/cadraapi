package ru.brobrocode.cadra.client.config;

import feign.FeignException;
import feign.Logger;
import feign.Request;
import feign.slf4j.Slf4jLogger;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.context.request.WebRequest;
import ru.brobrocode.cadra.client.api.OauthApi;

/**
 * Legacy Feign configuration class.
 * This class is no longer used by HH API clients.
 * All HH API clients now use {@link HhApiFeignConfiguration} instead.
 *
 * @deprecated Use {@link HhApiFeignConfiguration} for all HH API clients
 */
@Deprecated
public class CoreFeignConfiguration {

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
		return new Slf4jLogger(OauthApi.class);
	}

	@ExceptionHandler(FeignException.class)
	@ResponseBody
	public ResponseEntity<Object> handleConstraintViolationException(Exception e, WebRequest request) {
		return ResponseEntity.accepted().body("");
	}

	@Bean
	public Request.Options options() {
		return new Request.Options(connectTimeout, readTimeout);
	}
}
