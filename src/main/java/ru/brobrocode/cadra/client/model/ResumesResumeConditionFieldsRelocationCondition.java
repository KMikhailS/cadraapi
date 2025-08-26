package ru.brobrocode.cadra.client.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.annotation.Generated;
import jakarta.validation.Valid;

import java.util.Objects;

/**
 * ResumesResumeConditionFieldsRelocationCondition
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2025-08-17T15:41:09.394389505+05:00[Asia/Yekaterinburg]", comments = "Generator version: 7.6.0")
public class ResumesResumeConditionFieldsRelocationCondition {

  private Boolean required = null;

  private ResumesResumeConditionFieldsRelocationFields fields = null;

  public ResumesResumeConditionFieldsRelocationCondition required(Boolean required) {
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

  public ResumesResumeConditionFieldsRelocationCondition fields(ResumesResumeConditionFieldsRelocationFields fields) {
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
  public ResumesResumeConditionFieldsRelocationFields getFields() {
    return fields;
  }

  public void setFields(ResumesResumeConditionFieldsRelocationFields fields) {
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
    ResumesResumeConditionFieldsRelocationCondition resumesResumeConditionFieldsRelocationCondition = (ResumesResumeConditionFieldsRelocationCondition) o;
    return Objects.equals(this.required, resumesResumeConditionFieldsRelocationCondition.required) &&
        Objects.equals(this.fields, resumesResumeConditionFieldsRelocationCondition.fields);
  }

  @Override
  public int hashCode() {
    return Objects.hash(required, fields);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ResumesResumeConditionFieldsRelocationCondition {\n");
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

