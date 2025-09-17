package ru.brobrocode.cadra.client.yukassa;

import feign.Response;
import feign.codec.ErrorDecoder;
import org.apache.commons.io.IOUtils;

import java.io.IOException;
import java.nio.charset.StandardCharsets;

public class YuKassaErrorDecoder implements ErrorDecoder {

	@Override
	public Exception decode(String methodKey, Response response) {
		String responseBody = "";
		try {
			if (response.body() != null) {
				responseBody = IOUtils.toString(response.body().asInputStream(), StandardCharsets.UTF_8);
			}
		} catch (IOException e) {
			// log error
		}
		return switch (response.status()) {
			case 400 -> new YuKassaException("Bad request: " + responseBody);
			case 401 -> new YuKassaException("Unauthorized: " + responseBody);
			case 403 -> new YuKassaException("Forbidden: " + responseBody);
			case 404 -> new YuKassaException("Not found: " + responseBody);
			case 429 -> new YuKassaException("Rate limit exceeded: " + responseBody);
			default -> new YuKassaException("Unknown error: " + responseBody);
		};
	}
}
