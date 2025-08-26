package ru.brobrocode.cadra.client.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.annotation.Generated;
import jakarta.validation.Valid;

import java.util.Objects;

/**
 * VacanciesVacancyConditionFieldsSalaryFields
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2025-08-17T15:41:09.394389505+05:00[Asia/Yekaterinburg]", comments = "Generator version: 7.6.0")
public class VacanciesVacancyConditionFieldsSalaryFields {

  private VacanciesVacancyConditionFieldsRequiredWithTitle currency = null;

  private VacanciesVacancyConditionFieldsRequiredValueWithTitle from = null;

  private VacanciesVacancyConditionFieldsRequiredWithTitle gross = null;

  private VacanciesVacancyConditionFieldsRequiredValueWithTitle to = null;

  public VacanciesVacancyConditionFieldsSalaryFields currency(VacanciesVacancyConditionFieldsRequiredWithTitle currency) {
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
  public VacanciesVacancyConditionFieldsRequiredWithTitle getCurrency() {
    return currency;
  }

  public void setCurrency(VacanciesVacancyConditionFieldsRequiredWithTitle currency) {
    this.currency = currency;
  }

  public VacanciesVacancyConditionFieldsSalaryFields from(VacanciesVacancyConditionFieldsRequiredValueWithTitle from) {
    this.from = from;
    return this;
  }

  /**
   * Get from
   * @return from
  */
  @Valid 
  @Schema(name = "from", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("from")
  public VacanciesVacancyConditionFieldsRequiredValueWithTitle getFrom() {
    return from;
  }

  public void setFrom(VacanciesVacancyConditionFieldsRequiredValueWithTitle from) {
    this.from = from;
  }

  public VacanciesVacancyConditionFieldsSalaryFields gross(VacanciesVacancyConditionFieldsRequiredWithTitle gross) {
    this.gross = gross;
    return this;
  }

  /**
   * Get gross
   * @return gross
  */
  @Valid 
  @Schema(name = "gross", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("gross")
  public VacanciesVacancyConditionFieldsRequiredWithTitle getGross() {
    return gross;
  }

  public void setGross(VacanciesVacancyConditionFieldsRequiredWithTitle gross) {
    this.gross = gross;
  }

  public VacanciesVacancyConditionFieldsSalaryFields to(VacanciesVacancyConditionFieldsRequiredValueWithTitle to) {
    this.to = to;
    return this;
  }

  /**
   * Get to
   * @return to
  */
  @Valid 
  @Schema(name = "to", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("to")
  public VacanciesVacancyConditionFieldsRequiredValueWithTitle getTo() {
    return to;
  }

  public void setTo(VacanciesVacancyConditionFieldsRequiredValueWithTitle to) {
    this.to = to;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    VacanciesVacancyConditionFieldsSalaryFields vacanciesVacancyConditionFieldsSalaryFields = (VacanciesVacancyConditionFieldsSalaryFields) o;
    return Objects.equals(this.currency, vacanciesVacancyConditionFieldsSalaryFields.currency) &&
        Objects.equals(this.from, vacanciesVacancyConditionFieldsSalaryFields.from) &&
        Objects.equals(this.gross, vacanciesVacancyConditionFieldsSalaryFields.gross) &&
        Objects.equals(this.to, vacanciesVacancyConditionFieldsSalaryFields.to);
  }

  @Override
  public int hashCode() {
    return Objects.hash(currency, from, gross, to);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class VacanciesVacancyConditionFieldsSalaryFields {\n");
    sb.append("    currency: ").append(toIndentedString(currency)).append("\n");
    sb.append("    from: ").append(toIndentedString(from)).append("\n");
    sb.append("    gross: ").append(toIndentedString(gross)).append("\n");
    sb.append("    to: ").append(toIndentedString(to)).append("\n");
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

