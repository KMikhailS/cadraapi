package ru.brobrocode.cadra.client.yukassa.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class Recipient {
	@JsonProperty("account_id")
	private String accountId;

	@JsonProperty("gateway_id")
	private String gatewayId;
}