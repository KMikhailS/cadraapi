package ru.brobrocode.cadra.client.yukassa.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class PaymentMethod {
	private String type;
	private String id;
	private Boolean saved;
	private String status;
	private String title;

	@JsonProperty("account_number")
	private String accountNumber;
}