package ru.brobrocode.cadra.client.yukassa.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;

@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class WebhookNotification {
	private String type;
	private String event;
	private PaymentObject object;
}
