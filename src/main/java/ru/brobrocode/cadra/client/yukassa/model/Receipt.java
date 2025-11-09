package ru.brobrocode.cadra.client.yukassa.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Builder;
import lombok.Data;

import java.util.List;

/**
 * Данные фискального чека для соответствия 54-ФЗ
 */
@Data
@Builder
@JsonInclude(JsonInclude.Include.NON_NULL)
public class Receipt {
	/**
	 * Информация о покупателе (email или phone обязательны)
	 */
	private ReceiptCustomer customer;

	/**
	 * Список товаров или услуг в чеке
	 */
	private List<ReceiptItem> items;
}
