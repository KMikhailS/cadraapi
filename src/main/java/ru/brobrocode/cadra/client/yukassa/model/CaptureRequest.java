package ru.brobrocode.cadra.client.yukassa.model;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class CaptureRequest {
	private Amount amount;
}