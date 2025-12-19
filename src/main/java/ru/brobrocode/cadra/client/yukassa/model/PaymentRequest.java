package ru.brobrocode.cadra.client.yukassa.model;

import lombok.Builder;
import lombok.Data;

import java.util.Map;

@Data
@Builder
public class PaymentRequest {
	private Amount amount;
	private String description;
	private Confirmation confirmation;
	private boolean capture;
	private Map<String, Object> metadata;
	private Receipt receipt;
}
