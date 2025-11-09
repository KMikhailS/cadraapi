package ru.brobrocode.cadra.client.yukassa.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Builder;
import lombok.Data;

import java.math.BigDecimal;

/**
 * Товар или услуга в чеке по 54-ФЗ
 */
@Data
@Builder
@JsonInclude(JsonInclude.Include.NON_NULL)
public class ReceiptItem {
	/**
	 * Название товара или услуги (до 128 символов)
	 */
	private String description;

	/**
	 * Количество товара
	 */
	private BigDecimal quantity;

	/**
	 * Суммарная стоимость покупаемого товара в копейках/центах
	 */
	private Amount amount;

	/**
	 * Код НДС:
	 * 1 - без НДС
	 * 2 - НДС 0%
	 * 3 - НДС 10%
	 * 4 - НДС 20%
	 * 5 - НДС 10/110
	 * 6 - НДС 20/120
	 */
	@JsonProperty("vat_code")
	private Integer vatCode;

	/**
	 * Признак способа расчета:
	 * full_prepayment - предоплата 100%
	 * full_payment - полный расчет
	 * advance - аванс
	 */
	@JsonProperty("payment_mode")
	private String paymentMode;

	/**
	 * Признак предмета расчета:
	 * commodity - товар
	 * service - услуга
	 * payment - платеж
	 */
	@JsonProperty("payment_subject")
	private String paymentSubject;
}
