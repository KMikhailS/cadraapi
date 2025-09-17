package ru.brobrocode.cadra.client.yukassa.model;

import lombok.Builder;
import lombok.Data;

import java.math.BigDecimal;

@Data
@Builder
public class Amount {
	private BigDecimal value;
	private String currency;
}