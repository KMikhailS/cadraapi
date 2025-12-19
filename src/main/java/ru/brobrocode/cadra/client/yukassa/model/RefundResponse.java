package ru.brobrocode.cadra.client.yukassa.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class RefundResponse {
	private String id;
	private String status;
	@JsonProperty("payment_id")
	private String paymentId;
	private Amount amount;
}