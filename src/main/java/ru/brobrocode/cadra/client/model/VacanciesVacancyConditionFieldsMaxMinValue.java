package ru.brobrocode.cadra.client.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.annotation.Generated;
import jakarta.validation.Valid;

import java.math.BigDecimal;
import java.util.Objects;

/**
 * VacanciesVacancyConditionFieldsMaxMinValue
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2025-08-17T15:41:09.394389505+05:00[Asia/Yekaterinburg]", comments = "Generator version: 7.6.0")
public class VacanciesVacancyConditionFieldsMaxMinValue {

  private BigDecimal maxValue = null;

  private BigDecimal minValue = null;

  public VacanciesVacancyConditionFieldsMaxMinValue maxValue(BigDecimal maxValue) {
    this.maxValue = maxValue;
    return this;
  }

  /**
   * Максимальное значение
   * @return maxValue
  */
  @Valid 
  @Schema(name = "max_value", description = "Максимальное значение", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("max_value")
  public BigDecimal getMaxValue() {
    return maxValue;
  }

  public void setMaxValue(BigDecimal maxValue) {
    this.maxValue = maxValue;
  }

  public VacanciesVacancyConditionFieldsMaxMinValue minValue(BigDecimal minValue) {
    this.minValue = minValue;
    return this;
  }

  /**
   * Минимальное значение
   * @return minValue
  */
  @Valid 
  @Schema(name = "min_value", description = "Минимальное значение", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("min_value")
  public BigDecimal getMinValue() {
    return minValue;
  }

  public void setMinValue(BigDecimal minValue) {
    this.minValue = minValue;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    VacanciesVacancyConditionFieldsMaxMinValue vacanciesVacancyConditionFieldsMaxMinValue = (VacanciesVacancyConditionFieldsMaxMinValue) o;
    return Objects.equals(this.maxValue, vacanciesVacancyConditionFieldsMaxMinValue.maxValue) &&
        Objects.equals(this.minValue, vacanciesVacancyConditionFieldsMaxMinValue.minValue);
  }

  @Override
  public int hashCode() {
    return Objects.hash(maxValue, minValue);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class VacanciesVacancyConditionFieldsMaxMinValue {\n");
    sb.append("    maxValue: ").append(toIndentedString(maxValue)).append("\n");
    sb.append("    minValue: ").append(toIndentedString(minValue)).append("\n");
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

