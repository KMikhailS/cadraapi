package ru.brobrocode.cadra.client.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.annotation.Generated;
import jakarta.validation.Valid;

import java.util.Objects;

/**
 * VacanciesVacancyConditionFieldsSalaryCondition
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2025-08-17T15:41:09.394389505+05:00[Asia/Yekaterinburg]", comments = "Generator version: 7.6.0")
public class VacanciesVacancyConditionFieldsSalaryCondition {

  private Boolean required = null;

  private VacanciesVacancyConditionFieldsSalaryFields fields = null;

  public VacanciesVacancyConditionFieldsSalaryCondition required(Boolean required) {
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

  public VacanciesVacancyConditionFieldsSalaryCondition fields(VacanciesVacancyConditionFieldsSalaryFields fields) {
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
  public VacanciesVacancyConditionFieldsSalaryFields getFields() {
    return fields;
  }

  public void setFields(VacanciesVacancyConditionFieldsSalaryFields fields) {
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
    VacanciesVacancyConditionFieldsSalaryCondition vacanciesVacancyConditionFieldsSalaryCondition = (VacanciesVacancyConditionFieldsSalaryCondition) o;
    return Objects.equals(this.required, vacanciesVacancyConditionFieldsSalaryCondition.required) &&
        Objects.equals(this.fields, vacanciesVacancyConditionFieldsSalaryCondition.fields);
  }

  @Override
  public int hashCode() {
    return Objects.hash(required, fields);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class VacanciesVacancyConditionFieldsSalaryCondition {\n");
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

