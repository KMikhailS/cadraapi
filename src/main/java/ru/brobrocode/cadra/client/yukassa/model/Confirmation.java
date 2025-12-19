package ru.brobrocode.cadra.client.yukassa.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Builder;
import lombok.Data;

import java.util.Map;

@Data
@Builder
public class Confirmation {
	private String type;
	@JsonProperty("return_url")
	private String returnUrl;
	@JsonProperty("confirmation_url")
	private String confirmationUrl;
}