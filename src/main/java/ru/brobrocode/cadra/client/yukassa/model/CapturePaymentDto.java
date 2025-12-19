package ru.brobrocode.cadra.client.yukassa.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.math.BigDecimal;

@NoArgsConstructor
@Setter
@Getter
public class CapturePaymentDto {
	private BigDecimal amount;
}
