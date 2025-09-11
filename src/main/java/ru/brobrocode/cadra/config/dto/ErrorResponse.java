package ru.brobrocode.cadra.config.dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import java.util.List;

@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class ErrorResponse {
	private String description;

	@JsonProperty("oauth_error")
	private String oauthError;

	private List<ErrorDetail> errors;

	@JsonProperty("request_id")
	private String requestId;

	@Data
	@JsonIgnoreProperties(ignoreUnknown = true)
	public static class ErrorDetail {
		private String value;
		private String type;
	}
}
