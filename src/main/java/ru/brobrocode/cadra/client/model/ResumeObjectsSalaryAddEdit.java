package ru.brobrocode.cadra.client.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.annotation.Generated;
import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;

import java.math.BigDecimal;
import java.util.Objects;

/**
 * ResumeObjectsSalaryAddEdit
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2025-08-17T15:41:09.394389505+05:00[Asia/Yekaterinburg]", comments = "Generator version: 7.6.0")
public class ResumeObjectsSalaryAddEdit {

  private BigDecimal amount = null;

  private String currency = null;

  public ResumeObjectsSalaryAddEdit() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public ResumeObjectsSalaryAddEdit(BigDecimal amount, String currency) {
    this.amount = amount;
    this.currency = currency;
  }

  public ResumeObjectsSalaryAddEdit amount(BigDecimal amount) {
    this.amount = amount;
    return this;
  }

  /**
   * Сумма
   * @return amount
  */
  @NotNull @Valid 
  @Schema(name = "amount", description = "Сумма", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("amount")
  public BigDecimal getAmount() {
    return amount;
  }

  public void setAmount(BigDecimal amount) {
    this.amount = amount;
  }

  public ResumeObjectsSalaryAddEdit currency(String currency) {
    this.currency = currency;
    return this;
  }

  /**
   * Идентификатор валюты. Возможные значения перечислены в массиве `currency` [справочника полей](#tag/Obshie-spravochniki/operation/get-dictionaries)
   * @return currency
  */
  @NotNull 
  @Schema(name = "currency", description = "Идентификатор валюты. Возможные значения перечислены в массиве `currency` [справочника полей](#tag/Obshie-spravochniki/operation/get-dictionaries)", requiredMode = Schema.RequiredMode.REQUIRED)
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
    ResumeObjectsSalaryAddEdit resumeObjectsSalaryAddEdit = (ResumeObjectsSalaryAddEdit) o;
    return Objects.equals(this.amount, resumeObjectsSalaryAddEdit.amount) &&
        Objects.equals(this.currency, resumeObjectsSalaryAddEdit.currency);
  }

  @Override
  public int hashCode() {
    return Objects.hash(amount, currency);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ResumeObjectsSalaryAddEdit {\n");
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

