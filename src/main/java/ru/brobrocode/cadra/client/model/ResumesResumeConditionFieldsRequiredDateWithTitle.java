package ru.brobrocode.cadra.client.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.annotation.Generated;

import java.util.Objects;

/**
 * ResumesResumeConditionFieldsRequiredDateWithTitle
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2025-08-17T15:41:09.394389505+05:00[Asia/Yekaterinburg]", comments = "Generator version: 7.6.0")
public class ResumesResumeConditionFieldsRequiredDateWithTitle {

  private String maxDate = null;

  private String minDate = null;

  private Boolean required = null;

  public ResumesResumeConditionFieldsRequiredDateWithTitle maxDate(String maxDate) {
    this.maxDate = maxDate;
    return this;
  }

  /**
   * Верхняя граница диапазона значений дат, включительно. Если `null` — верхняя граница даты не определена
   * @return maxDate
  */
  
  @Schema(name = "max_date", description = "Верхняя граница диапазона значений дат, включительно. Если `null` — верхняя граница даты не определена", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("max_date")
  public String getMaxDate() {
    return maxDate;
  }

  public void setMaxDate(String maxDate) {
    this.maxDate = maxDate;
  }

  public ResumesResumeConditionFieldsRequiredDateWithTitle minDate(String minDate) {
    this.minDate = minDate;
    return this;
  }

  /**
   * Нижняя граница диапазона значений дат, включительно. Если `null` — нижняя граница даты не определена
   * @return minDate
  */
  
  @Schema(name = "min_date", description = "Нижняя граница диапазона значений дат, включительно. Если `null` — нижняя граница даты не определена", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("min_date")
  public String getMinDate() {
    return minDate;
  }

  public void setMinDate(String minDate) {
    this.minDate = minDate;
  }

  public ResumesResumeConditionFieldsRequiredDateWithTitle required(Boolean required) {
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
    ResumesResumeConditionFieldsRequiredDateWithTitle resumesResumeConditionFieldsRequiredDateWithTitle = (ResumesResumeConditionFieldsRequiredDateWithTitle) o;
    return Objects.equals(this.maxDate, resumesResumeConditionFieldsRequiredDateWithTitle.maxDate) &&
        Objects.equals(this.minDate, resumesResumeConditionFieldsRequiredDateWithTitle.minDate) &&
        Objects.equals(this.required, resumesResumeConditionFieldsRequiredDateWithTitle.required);
  }

  @Override
  public int hashCode() {
    return Objects.hash(maxDate, minDate, required);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ResumesResumeConditionFieldsRequiredDateWithTitle {\n");
    sb.append("    maxDate: ").append(toIndentedString(maxDate)).append("\n");
    sb.append("    minDate: ").append(toIndentedString(minDate)).append("\n");
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

