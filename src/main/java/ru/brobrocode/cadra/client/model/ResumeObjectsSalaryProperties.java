package ru.brobrocode.cadra.client.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.annotation.Generated;
import jakarta.validation.Valid;

import java.math.BigDecimal;
import java.util.Objects;

/**
 * ResumeObjectsSalaryProperties
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2025-08-17T15:41:09.394389505+05:00[Asia/Yekaterinburg]", comments = "Generator version: 7.6.0")
public class ResumeObjectsSalaryProperties {

  private BigDecimal amount = null;

  private String currency = null;

  public ResumeObjectsSalaryProperties amount(BigDecimal amount) {
    this.amount = amount;
    return this;
  }

  /**
   * Сумма
   * @return amount
  */
  @Valid 
  @Schema(name = "amount", description = "Сумма", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("amount")
  public BigDecimal getAmount() {
    return amount;
  }

  public void setAmount(BigDecimal amount) {
    this.amount = amount;
  }

  public ResumeObjectsSalaryProperties currency(String currency) {
    this.currency = currency;
    return this;
  }

  /**
   * Идентификатор валюты. Возможные значения перечислены в массиве `currency` [справочника полей](#tag/Obshie-spravochniki/operation/get-dictionaries)
   * @return currency
  */
  
  @Schema(name = "currency", description = "Идентификатор валюты. Возможные значения перечислены в массиве `currency` [справочника полей](#tag/Obshie-spravochniki/operation/get-dictionaries)", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("currency")
  public String getCurrency() {
    return currency;
  }

  public void setCurrency(String currency) {
    this.currency = currency;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ResumeObjectsSalaryProperties resumeObjectsSalaryProperties = (ResumeObjectsSalaryProperties) o;
    return Objects.equals(this.amount, resumeObjectsSalaryProperties.amount) &&
        Objects.equals(this.currency, resumeObjectsSalaryProperties.currency);
  }

  @Override
  public int hashCode() {
    return Objects.hash(amount, currency);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ResumeObjectsSalaryProperties {\n");
    sb.append("    amount: ").append(toIndentedString(amount)).append("\n");
    sb.append("    currency: ").append(toIndentedString(currency)).append("\n");
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

