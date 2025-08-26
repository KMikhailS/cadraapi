package ru.brobrocode.cadra.client.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.annotation.Generated;
import jakarta.validation.constraints.NotNull;

import java.util.Objects;

/**
 * Желаемая зарплата
 */

@Schema(name = "ResumeEditResume_salary", description = "Желаемая зарплата")
@JsonTypeName("ResumeEditResume_salary")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2025-08-17T15:41:09.394389505+05:00[Asia/Yekaterinburg]", comments = "Generator version: 7.6.0")
public class ResumeEditResumeSalary {

  private Integer amount;

  private String currency;

  public ResumeEditResumeSalary() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public ResumeEditResumeSalary(Integer amount, String currency) {
    this.amount = amount;
    this.currency = currency;
  }

  public ResumeEditResumeSalary amount(Integer amount) {
    this.amount = amount;
    return this;
  }

  /**
   * Сумма
   * @return amount
  */
  @NotNull 
  @Schema(name = "amount", description = "Сумма", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("amount")
  public Integer getAmount() {
    return amount;
  }

  public void setAmount(Integer amount) {
    this.amount = amount;
  }

  public ResumeEditResumeSalary currency(String currency) {
    this.currency = currency;
    return this;
  }

  /**
   * Идентификатор валюты
   * @return currency
  */
  @NotNull 
  @Schema(name = "currency", description = "Идентификатор валюты", requiredMode = Schema.RequiredMode.REQUIRED)
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
    ResumeEditResumeSalary resumeEditResumeSalary = (ResumeEditResumeSalary) o;
    return Objects.equals(this.amount, resumeEditResumeSalary.amount) &&
        Objects.equals(this.currency, resumeEditResumeSalary.currency);
  }

  @Override
  public int hashCode() {
    return Objects.hash(amount, currency);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ResumeEditResumeSalary {\n");
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

