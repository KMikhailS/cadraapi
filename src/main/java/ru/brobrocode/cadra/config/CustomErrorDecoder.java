package ru.brobrocode.cadra.config;

import com.fasterxml.jackson.databind.ObjectMapper;
import feign.FeignException;
import feign.Response;
import feign.Util;
import feign.codec.ErrorDecoder;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;
import ru.brobrocode.cadra.config.dto.ErrorResponse;
import ru.brobrocode.cadra.config.exception.TokenExpiredException;
import ru.brobrocode.cadra.service.AuthService;

import java.io.IOException;
import java.nio.charset.StandardCharsets;


@Slf4j
@Component
public class CustomErrorDecoder implements ErrorDecoder {

	private final AuthService authService;
	private final ObjectMapper objectMapper;

	public CustomErrorDecoder(AuthService authService, ObjectMapper objectMapper) {
		this.authService = authService;
		this.objectMapper = objectMapper;
	}

	@Override
	public Exception decode(String methodKey, Response response) {
		if (response.status() == 403) {
			try {
				String responseBody = getResponseBody(response);
				ErrorResponse errorResponse = objectMapper.readValue(responseBody, ErrorResponse.class);

				if (isTokenExpiredError(errorResponse)) {
					log.warn("Token expired detected for method: {} | Request ID: {} | OAuth Error: {}",
							methodKey,
							errorResponse.getRequestId(),
							errorResponse.getOauthError());

					try {
						authService.refreshToken();
						log.info("Token refreshed successfully for method: {} | Request ID: {}",
								methodKey, errorResponse.getRequestId());

						return new TokenExpiredException("Token expired and refreshed, retry request");
					} catch (Exception e) {
						log.error("Token refresh failed for method: {} | Request ID: {} | Error: {}",
								methodKey, errorResponse.getRequestId(), e.getMessage(), e);
						throw e;
					}
				} else {
					log.warn("403 Forbidden but not token expiration for method: {} | Request ID: {} | Description: {}",
							methodKey, errorResponse.getRequestId(), errorResponse.getDescription());
				}
			} catch (TokenExpiredException e) {
				throw e;
			} catch (IOException e) {
				log.error("Failed to parse 403 response for method: {}", methodKey, e);
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

