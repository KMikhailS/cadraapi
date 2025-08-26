package ru.brobrocode.cadra.client.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.annotation.Generated;
import jakarta.validation.constraints.NotNull;

import java.util.Objects;

/**
 * VacanciesUpgradeFieldsPrice
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2025-08-17T15:41:09.394389505+05:00[Asia/Yekaterinburg]", comments = "Generator version: 7.6.0")
public class VacanciesUpgradeFieldsPrice {

  private String amount;

  private String currencyCode;

  public VacanciesUpgradeFieldsPrice() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public VacanciesUpgradeFieldsPrice(String amount, String currencyCode) {
    this.amount = amount;
    this.currencyCode = currencyCode;
  }

  public VacanciesUpgradeFieldsPrice amount(String amount) {
    this.amount = amount;
    return this;
  }

  /**
   * Значение цены
   * @return amount
  */
  @NotNull 
  @Schema(name = "amount", description = "Значение цены", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("amount")
  public String getAmount() {
    return amount;
  }

  public void setAmount(String amount) {
    this.amount = amount;
  }

  public VacanciesUpgradeFieldsPrice currencyCode(String currencyCode) {
    this.currencyCode = currencyCode;
    return this;
  }

  /**
   * Идентификатор валюты. Возможные значения приведены в поле `currency` [справочника полей](#tag/Obshie-spravochniki/operation/get-dictionaries)
   * @return currencyCode
  */
  @NotNull 
  @Schema(name = "currency_code", description = "Идентификатор валюты. Возможные значения приведены в поле `currency` [справочника полей](#tag/Obshie-spravochniki/operation/get-dictionaries)", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("currency_code")
  public String getCurrencyCode() {
    return currencyCode;
  }

  public void setCurrencyCode(String currencyCode) {
    this.currencyCode = currencyCode;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    VacanciesUpgradeFieldsPrice vacanciesUpgradeFieldsPrice = (VacanciesUpgradeFieldsPrice) o;
    return Objects.equals(this.amount, vacanciesUpgradeFieldsPrice.amount) &&
        Objects.equals(this.currencyCode, vacanciesUpgradeFieldsPrice.currencyCode);
  }

  @Override
  public int hashCode() {
    return Objects.hash(amount, currencyCode);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class VacanciesUpgradeFieldsPrice {\n");
    sb.append("    amount: ").append(toIndentedString(amount)).append("\n");
    sb.append("    currencyCode: ").append(toIndentedString(currencyCode)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

