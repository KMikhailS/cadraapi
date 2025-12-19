package ru.brobrocode.cadra.client.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.annotation.Generated;
import jakarta.validation.Valid;

import java.util.Objects;

/**
 * VacanciesVacancyConditionFieldsSalaryRangeFields
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2025-08-17T15:41:09.394389505+05:00[Asia/Yekaterinburg]", comments = "Generator version: 7.6.0")
public class VacanciesVacancyConditionFieldsSalaryRangeFields {

  private VacanciesVacancyConditionFieldsRequiredWithTitle currency = null;

  private VacanciesVacancyConditionFieldsRequiredWithTitle frequency = null;

  private VacanciesVacancyConditionFieldsRequiredValueWithTitle from = null;

  private VacanciesVacancyConditionFieldsRequiredWithTitle gross = null;

  private VacanciesVacancyConditionFieldsRequiredWithTitle mode = null;

  private VacanciesVacancyConditionFieldsRequiredValueWithTitle to = null;

  public VacanciesVacancyConditionFieldsSalaryRangeFields currency(VacanciesVacancyConditionFieldsRequiredWithTitle currency) {
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

  public VacanciesVacancyConditionFieldsSalaryRangeFields frequency(VacanciesVacancyConditionFieldsRequiredWithTitle frequency) {
    this.frequency = frequency;
    return this;
  }

  /**
   * Get frequency
   * @return frequency
  */
  @Valid 
  @Schema(name = "frequency", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("frequency")
  public VacanciesVacancyConditionFieldsRequiredWithTitle getFrequency() {
    return frequency;
  }

  public void setFrequency(VacanciesVacancyConditionFieldsRequiredWithTitle frequency) {
    this.frequency = frequency;
  }

  public VacanciesVacancyConditionFieldsSalaryRangeFields from(VacanciesVacancyConditionFieldsRequiredValueWithTitle from) {
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

  public VacanciesVacancyConditionFieldsSalaryRangeFields gross(VacanciesVacancyConditionFieldsRequiredWithTitle gross) {
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

  public VacanciesVacancyConditionFieldsSalaryRangeFields mode(VacanciesVacancyConditionFieldsRequiredWithTitle mode) {
    this.mode = mode;
    return this;
  }

  /**
   * Get mode
   * @return mode
  */
  @Valid 
  @Schema(name = "mode", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("mode")
  public VacanciesVacancyConditionFieldsRequiredWithTitle getMode() {
    return mode;
  }

  public void setMode(VacanciesVacancyConditionFieldsRequiredWithTitle mode) {
    this.mode = mode;
  }

  public VacanciesVacancyConditionFieldsSalaryRangeFields to(VacanciesVacancyConditionFieldsRequiredValueWithTitle to) {
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
    VacanciesVacancyConditionFieldsSalaryRangeFields vacanciesVacancyConditionFieldsSalaryRangeFields = (VacanciesVacancyConditionFieldsSalaryRangeFields) o;
    return Objects.equals(this.currency, vacanciesVacancyConditionFieldsSalaryRangeFields.currency) &&
        Objects.equals(this.frequency, vacanciesVacancyConditionFieldsSalaryRangeFields.frequency) &&
        Objects.equals(this.from, vacanciesVacancyConditionFieldsSalaryRangeFields.from) &&
        Objects.equals(this.gross, vacanciesVacancyConditionFieldsSalaryRangeFields.gross) &&
        Objects.equals(this.mode, vacanciesVacancyConditionFieldsSalaryRangeFields.mode) &&
        Objects.equals(this.to, vacanciesVacancyConditionFieldsSalaryRangeFields.to);
  }

  @Override
  public int hashCode() {
    return Objects.hash(currency, frequency, from, gross, mode, to);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class VacanciesVacancyConditionFieldsSalaryRangeFields {\n");
    sb.append("    currency: ").append(toIndentedString(currency)).append("\n");
    sb.append("    frequency: ").append(toIndentedString(frequency)).append("\n");
    sb.append("    from: ").append(toIndentedString(from)).append("\n");
    sb.append("    gross: ").append(toIndentedString(gross)).append("\n");
    sb.append("    mode: ").append(toIndentedString(mode)).append("\n");
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

