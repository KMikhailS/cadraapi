package ru.brobrocode.cadra.client.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.annotation.Generated;
import jakarta.validation.Valid;

import java.math.BigDecimal;
import java.util.Objects;

/**
 * ResumesResumeConditionFieldsSiteCondition
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2025-08-17T15:41:09.394389505+05:00[Asia/Yekaterinburg]", comments = "Generator version: 7.6.0")
public class ResumesResumeConditionFieldsSiteCondition {

  private BigDecimal maxCount = null;

  private BigDecimal minCount = null;

  private Boolean required = null;

  private ResumesResumeConditionFieldsSiteFields fields = null;

  public ResumesResumeConditionFieldsSiteCondition maxCount(BigDecimal maxCount) {
    this.maxCount = maxCount;
    return this;
  }

  /**
   * Максимальное количество объектов для полей, в которых передается список. Если `null` — количество неограниченно
   * @return maxCount
  */
  @Valid 
  @Schema(name = "max_count", description = "Максимальное количество объектов для полей, в которых передается список. Если `null` — количество неограниченно", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("max_count")
  public BigDecimal getMaxCount() {
    return maxCount;
  }

  public void setMaxCount(BigDecimal maxCount) {
    this.maxCount = maxCount;
  }

  public ResumesResumeConditionFieldsSiteCondition minCount(BigDecimal minCount) {
    this.minCount = minCount;
    return this;
  }

  /**
   * Минимальное количество объектов для полей,, где необходимо передавать список. Если `null` — нижняя граница не определена
   * @return minCount
  */
  @Valid 
  @Schema(name = "min_count", description = "Минимальное количество объектов для полей,, где необходимо передавать список. Если `null` — нижняя граница не определена", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("min_count")
  public BigDecimal getMinCount() {
    return minCount;
  }

  public void setMinCount(BigDecimal minCount) {
    this.minCount = minCount;
  }

  public ResumesResumeConditionFieldsSiteCondition required(Boolean required) {
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

  public ResumesResumeConditionFieldsSiteCondition fields(ResumesResumeConditionFieldsSiteFields fields) {
    this.fields = fields;
    return this;
  }

  /**
   * Get fields
   * @return fields
  */
  @Valid 
  @Schema(name = "fields", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("fields")
  public ResumesResumeConditionFieldsSiteFields getFields() {
    return fields;
  }

  public void setFields(ResumesResumeConditionFieldsSiteFields fields) {
    this.fields = fields;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ResumesResumeConditionFieldsSiteCondition resumesResumeConditionFieldsSiteCondition = (ResumesResumeConditionFieldsSiteCondition) o;
    return Objects.equals(this.maxCount, resumesResumeConditionFieldsSiteCondition.maxCount) &&
        Objects.equals(this.minCount, resumesResumeConditionFieldsSiteCondition.minCount) &&
        Objects.equals(this.required, resumesResumeConditionFieldsSiteCondition.required) &&
        Objects.equals(this.fields, resumesResumeConditionFieldsSiteCondition.fields);
  }

  @Override
  public int hashCode() {
    return Objects.hash(maxCount, minCount, required, fields);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ResumesResumeConditionFieldsSiteCondition {\n");
    sb.append("    maxCount: ").append(toIndentedString(maxCount)).append("\n");
    sb.append("    minCount: ").append(toIndentedString(minCount)).append("\n");
    sb.append("    required: ").append(toIndentedString(required)).append("\n");
    sb.append("    fields: ").append(toIndentedString(fields)).append("\n");
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

