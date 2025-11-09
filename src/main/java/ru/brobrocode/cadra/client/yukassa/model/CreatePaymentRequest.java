package ru.brobrocode.cadra.client.yukassa.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@Setter
@Getter
public class CreatePaymentRequest {
	private String tariffName;
	private String email;
	private String phone;
}
