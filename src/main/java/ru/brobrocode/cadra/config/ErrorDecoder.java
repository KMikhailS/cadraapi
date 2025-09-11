package ru.brobrocode.cadra.config;

import com.fasterxml.jackson.databind.ObjectMapper;
import feign.FeignException;
import feign.Response;
import feign.Util;
import feign.codec.ErrorDecoder;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;
import ru.brobrocode.cadra.config.dto.ErrorResponse;

import java.io.IOException;
import java.nio.charset.StandardCharsets;


@Slf4j
@Component
public class CustomErrorDecoder implements ErrorDecoder {

	private final TokenService tokenService;
	private final ObjectMapper objectMapper;

	public CustomErrorDecoder(TokenService tokenService, ObjectMapper objectMapper) {
		this.tokenService = tokenService;
		this.objectMapper = objectMapper;
	}

	@Override
	public Exception decode(String methodKey, Response response) {
		if (response.status() == 403) {
			try {
				String responseBody = getResponseBody(response);
				ErrorResponse errorResponse = objectMapper.readValue(responseBody, ErrorResponse.class);

				if (isTokenExpiredError(errorResponse)) {
					log.info("Token expired, attempting to refresh for method: {}", methodKey);

					try {
						tokenService.refreshToken();
						log.info("Token refreshed successfully");

						return new TokenExpiredException("Token expired and refreshed, retry request");

					} catch (Exception e) {
						log.error("Failed to refresh token", e);
						return new FeignException.Forbidden("Token refresh failed", response.request(), null, response.headers());
					}
				}
			} catch (IOException e) {
				log.error("Error parsing 403 response", e);
			}
		}
		return new Default().decode(methodKey, response);
	}

	private String getResponseBody(Response response) throws IOException {
		if (response.body() != null) {
			return Util.toString(response.body().asReader(StandardCharsets.UTF_8));
		}
		return "";
	}

	private boolean isTokenExpiredError(ErrorResponse errorResponse) {
		return "token-expired".equals(errorResponse.getOauthError()) ||
				(errorResponse.getErrors() != null &&
						errorResponse.getErrors().stream()
								.anyMatch(error -> "token_expired".equals(error.getValue()) && "oauth".equals(error.getType())));
	}
}
