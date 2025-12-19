package ru.brobrocode.cadra.dto;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import java.math.BigDecimal;

@Getter
@Setter
@ToString
@NoArgsConstructor
public class SettingsDTO {
	private String text;
	private String experience;
	private String employment;
	private BigDecimal salary;
	private String currency;
}
