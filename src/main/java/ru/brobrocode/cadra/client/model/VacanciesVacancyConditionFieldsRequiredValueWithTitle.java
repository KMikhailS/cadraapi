package ru.brobrocode.cadra.client.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.annotation.Generated;
import jakarta.validation.Valid;

import java.math.BigDecimal;
import java.util.Objects;

/**
 * VacanciesVacancyConditionFieldsRequiredValueWithTitle
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2025-08-17T15:41:09.394389505+05:00[Asia/Yekaterinburg]", comments = "Generator version: 7.6.0")
public class VacanciesVacancyConditionFieldsRequiredValueWithTitle {

  private BigDecimal maxValue = null;

  private BigDecimal minValue = null;

  private Boolean required = null;

  public VacanciesVacancyConditionFieldsRequiredValueWithTitle maxValue(BigDecimal maxValue) {
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

  public VacanciesVacancyConditionFieldsRequiredValueWithTitle minValue(BigDecimal minValue) {
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

  public VacanciesVacancyConditionFieldsRequiredValueWithTitle required(Boolean required) {
    this.required = required;
    return this;
  }

  /**
   * Является ли поле необходимым?
   * @return required
  */
  
  @Schema(name = "required", description = "Является ли поле необходимым?", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("required")
  public Boolean getRequired() {
    return required;
  }

  public void setRequired(Boolean required) {
    this.required = required;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    VacanciesVacancyConditionFieldsRequiredValueWithTitle vacanciesVacancyConditionFieldsRequiredValueWithTitle = (VacanciesVacancyConditionFieldsRequiredValueWithTitle) o;
    return Objects.equals(this.maxValue, vacanciesVacancyConditionFieldsRequiredValueWithTitle.maxValue) &&
        Objects.equals(this.minValue, vacanciesVacancyConditionFieldsRequiredValueWithTitle.minValue) &&
        Objects.equals(this.required, vacanciesVacancyConditionFieldsRequiredValueWithTitle.required);
  }

  @Override
  public int hashCode() {
    return Objects.hash(maxValue, minValue, required);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class VacanciesVacancyConditionFieldsRequiredValueWithTitle {\n");
    sb.append("    maxValue: ").append(toIndentedString(maxValue)).append("\n");
    sb.append("    minValue: ").append(toIndentedString(minValue)).append("\n");
    sb.append("    required: ").append(toIndentedString(required)).append("\n");
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

