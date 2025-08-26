package ru.brobrocode.cadra.client.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.annotation.Generated;
import jakarta.validation.Valid;

import java.math.BigDecimal;
import java.util.Objects;

/**
 * VacanciesVacancyConditionFieldsMaxMinLength
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2025-08-17T15:41:09.394389505+05:00[Asia/Yekaterinburg]", comments = "Generator version: 7.6.0")
public class VacanciesVacancyConditionFieldsMaxMinLength {

  private BigDecimal maxLength = null;

  private BigDecimal minLength = null;

  public VacanciesVacancyConditionFieldsMaxMinLength maxLength(BigDecimal maxLength) {
    this.maxLength = maxLength;
    return this;
  }

  /**
   * Максимальная длина для текстовых полей
   * @return maxLength
  */
  @Valid 
  @Schema(name = "max_length", description = "Максимальная длина для текстовых полей", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("max_length")
  public BigDecimal getMaxLength() {
    return maxLength;
  }

  public void setMaxLength(BigDecimal maxLength) {
    this.maxLength = maxLength;
  }

  public VacanciesVacancyConditionFieldsMaxMinLength minLength(BigDecimal minLength) {
    this.minLength = minLength;
    return this;
  }

  /**
   * Минимальная длина для текстовых полей
   * @return minLength
  */
  @Valid 
  @Schema(name = "min_length", description = "Минимальная длина для текстовых полей", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("min_length")
  public BigDecimal getMinLength() {
    return minLength;
  }

  public void setMinLength(BigDecimal minLength) {
    this.minLength = minLength;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    VacanciesVacancyConditionFieldsMaxMinLength vacanciesVacancyConditionFieldsMaxMinLength = (VacanciesVacancyConditionFieldsMaxMinLength) o;
    return Objects.equals(this.maxLength, vacanciesVacancyConditionFieldsMaxMinLength.maxLength) &&
        Objects.equals(this.minLength, vacanciesVacancyConditionFieldsMaxMinLength.minLength);
  }

  @Override
  public int hashCode() {
    return Objects.hash(maxLength, minLength);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class VacanciesVacancyConditionFieldsMaxMinLength {\n");
    sb.append("    maxLength: ").append(toIndentedString(maxLength)).append("\n");
    sb.append("    minLength: ").append(toIndentedString(minLength)).append("\n");
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

