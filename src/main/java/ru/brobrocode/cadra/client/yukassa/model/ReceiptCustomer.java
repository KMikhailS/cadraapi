package ru.brobrocode.cadra.client.yukassa.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Builder;
import lombok.Data;

/**
 * Данные покупателя для чека по 54-ФЗ
 * Должен быть указан хотя бы один из контактов: email или phone
 */
@Data
@Builder
@JsonInclude(JsonInclude.Include.NON_NULL)
public class ReceiptCustomer {
	/**
	 * Email покупателя
	 */
	private String email;

	/**
	 * Телефон покупателя в формате ITU-T E.164 (например, "79000000000")
	 */
	private String phone;

	/**
	 * Полное имя покупателя (опционально)
	 */
	private String fullName;
}
