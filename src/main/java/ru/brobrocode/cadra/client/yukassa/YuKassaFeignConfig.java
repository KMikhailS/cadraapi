package ru.brobrocode.cadra.client.yukassa;

import feign.Logger;
import feign.RequestInterceptor;
import feign.codec.ErrorDecoder;
import feign.slf4j.Slf4jLogger;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.Base64;

@Configuration
public class YuKassaFeignConfig {

	@Value("${yukassa.shop-id}")
	private String shopId;

	@Value("${yukassa.secret-key}")
	private String secretKey;

//	@Bean
//	public RequestInterceptor yuKassaRequestInterceptor() {
//		return requestTemplate -> {
//			String credentials = shopId + ":" + secretKey;
//			String base64Credentials = Base64.getEncoder().encodeToString(credentials.getBytes());
//			requestTemplate.header("Authorization", "Basic " + base64Credentials);
//			requestTemplate.header("Content-Type", "application/json");
//		};
//	}

	@Bean
	public ErrorDecoder yuKassaErrorDecoder() {
		return new YuKassaErrorDecoder();
	}
	@Bean
	Logger.Level feignLoggerLevel() {
		return Logger.Level.FULL;
	}

	@Bean
	Logger feignLogger() {
		return new Slf4jLogger(YuKassaClient.class);
	}
}
