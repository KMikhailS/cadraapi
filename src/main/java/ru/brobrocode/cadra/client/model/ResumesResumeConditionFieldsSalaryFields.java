package ru.brobrocode.cadra.client.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.annotation.Generated;
import jakarta.validation.Valid;

import java.util.Objects;

/**
 * ResumesResumeConditionFieldsSalaryFields
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2025-08-17T15:41:09.394389505+05:00[Asia/Yekaterinburg]", comments = "Generator version: 7.6.0")
public class ResumesResumeConditionFieldsSalaryFields {

  private ResumesResumeConditionFieldsRequiredValueWithTitle amount = null;

  private ResumesResumeConditionFieldsRequiredLengthWithTitle currency = null;

  public ResumesResumeConditionFieldsSalaryFields amount(ResumesResumeConditionFieldsRequiredValueWithTitle amount) {
    this.amount = amount;
    return this;
  }

  /**
   * Get amount
   * @return amount
  */
  @Valid 
  @Schema(name = "amount", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("amount")
  public ResumesResumeConditionFieldsRequiredValueWithTitle getAmount() {
    return amount;
  }

  public void setAmount(ResumesResumeConditionFieldsRequiredValueWithTitle amount) {
    this.amount = amount;
  }

  public ResumesResumeConditionFieldsSalaryFields currency(ResumesResumeConditionFieldsRequiredLengthWithTitle currency) {
    this.currency = currency;
    return this;
  }

  /**
   * Get currency
   * @return currency
  */
  @Valid 
  @Schema(name = "currency", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("currency")
  public ResumesResumeConditionFieldsRequiredLengthWithTitle getCurrency() {
    return currency;
  }

  public void setCurrency(ResumesResumeConditionFieldsRequiredLengthWithTitle currency) {
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
    ResumesResumeConditionFieldsSalaryFields resumesResumeConditionFieldsSalaryFields = (ResumesResumeConditionFieldsSalaryFields) o;
    return Objects.equals(this.amount, resumesResumeConditionFieldsSalaryFields.amount) &&
        Objects.equals(this.currency, resumesResumeConditionFieldsSalaryFields.currency);
  }

  @Override
  public int hashCode() {
    return Objects.hash(amount, currency);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ResumesResumeConditionFieldsSalaryFields {\n");
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

