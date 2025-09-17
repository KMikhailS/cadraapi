package ru.brobrocode.cadra.client.yukassa.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.JsonNode;
import lombok.Data;

import java.time.LocalDate;
import java.time.LocalDateTime;

@Data
public class PaymentResponse {
	private String id;
	private String status;
	private Amount amount;
	private String description;
	private Confirmation confirmation;
	@JsonProperty("created_at")
	private LocalDateTime createdAt;
	private Boolean paid;
	private JsonNode metadata;
}