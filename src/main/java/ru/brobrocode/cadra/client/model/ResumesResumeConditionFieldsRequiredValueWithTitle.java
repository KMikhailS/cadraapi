package ru.brobrocode.cadra.client.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.annotation.Generated;
import jakarta.validation.Valid;

import java.math.BigDecimal;
import java.util.Objects;

/**
 * ResumesResumeConditionFieldsRequiredValueWithTitle
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2025-08-17T15:41:09.394389505+05:00[Asia/Yekaterinburg]", comments = "Generator version: 7.6.0")
public class ResumesResumeConditionFieldsRequiredValueWithTitle {

  private BigDecimal maxValue = null;

  private BigDecimal minValue = null;

  private Boolean required = null;

  public ResumesResumeConditionFieldsRequiredValueWithTitle maxValue(BigDecimal maxValue) {
    this.maxValue = maxValue;
    return this;
  }

  /**
   * Верхняя граница диапазона числовых значений, включительно. `null` — если верхняя граница не определена
   * @return maxValue
  */
  @Valid 
  @Schema(name = "max_value", description = "Верхняя граница диапазона числовых значений, включительно. `null` — если верхняя граница не определена", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("max_value")
  public BigDecimal getMaxValue() {
    return maxValue;
  }

  public void setMaxValue(BigDecimal maxValue) {
    this.maxValue = maxValue;
  }

  public ResumesResumeConditionFieldsRequiredValueWithTitle minValue(BigDecimal minValue) {
    this.minValue = minValue;
    return this;
  }

  /**
   * Нижняя граница диапазона числовых значений, включительно. `null` — если нижняя граница не определена
   * @return minValue
  */
  @Valid 
  @Schema(name = "min_value", description = "Нижняя граница диапазона числовых значений, включительно. `null` — если нижняя граница не определена", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("min_value")
  public BigDecimal getMinValue() {
    return minValue;
  }

  public void setMinValue(BigDecimal minValue) {
    this.minValue = minValue;
  }

  public ResumesResumeConditionFieldsRequiredValueWithTitle required(Boolean required) {
    this.required = required;
    return this;
  }

  /**
   * Является ли поле необходимым? Для строковых значений поле не должно быть `null` или `\"\"`
   * @return required
  */
  
  @Schema(name = "required", description = "Является ли поле необходимым? Для строковых значений поле не должно быть `null` или `\"\"`", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
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
    ResumesResumeConditionFieldsRequiredValueWithTitle resumesResumeConditionFieldsRequiredValueWithTitle = (ResumesResumeConditionFieldsRequiredValueWithTitle) o;
    return Objects.equals(this.maxValue, resumesResumeConditionFieldsRequiredValueWithTitle.maxValue) &&
        Objects.equals(this.minValue, resumesResumeConditionFieldsRequiredValueWithTitle.minValue) &&
        Objects.equals(this.required, resumesResumeConditionFieldsRequiredValueWithTitle.required);
  }

  @Override
  public int hashCode() {
    return Objects.hash(maxValue, minValue, required);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ResumesResumeConditionFieldsRequiredValueWithTitle {\n");
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

