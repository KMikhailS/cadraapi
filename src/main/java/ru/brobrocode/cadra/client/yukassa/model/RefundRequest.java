package ru.brobrocode.cadra.client.yukassa.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class RefundRequest {
	@JsonProperty("payment_id")
	private String paymentId;
	private Amount amount;
}
