package ru.brobrocode.cadra.client.yukassa.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import java.util.Map;

@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class PaymentObject {
	private String id;
	private String status;
	private Boolean paid;
	private Amount amount;

	@JsonProperty("income_amount")
	private Amount incomeAmount;

	private String description;
	private Recipient recipient;

	@JsonProperty("payment_method")
	private PaymentMethod paymentMethod;

	@JsonProperty("captured_at")
	private String capturedAt;

	@JsonProperty("created_at")
	private String createdAt;

	private Boolean test;

	@JsonProperty("refunded_amount")
	private Amount refundedAmount;

	private Boolean refundable;

	private Map<String, Object> metadata;
	private String paymentMethodId;
	private CancellationDetails cancellationDetails;
}
