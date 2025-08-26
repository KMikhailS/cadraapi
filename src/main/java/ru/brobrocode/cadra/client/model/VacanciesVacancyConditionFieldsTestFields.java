package ru.brobrocode.cadra.client.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.annotation.Generated;
import jakarta.validation.Valid;

import java.util.Objects;

/**
 * VacanciesVacancyConditionFieldsTestFields
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2025-08-17T15:41:09.394389505+05:00[Asia/Yekaterinburg]", comments = "Generator version: 7.6.0")
public class VacanciesVacancyConditionFieldsTestFields {

  private VacanciesVacancyConditionFieldsRequired required = null;

  public VacanciesVacancyConditionFieldsTestFields required(VacanciesVacancyConditionFieldsRequired required) {
    this.required = required;
    return this;
  }

  /**
   * Get required
   * @return required
  */
  @Valid 
  @Schema(name = "required", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("required")
  public VacanciesVacancyConditionFieldsRequired getRequired() {
    return required;
  }

  public void setRequired(VacanciesVacancyConditionFieldsRequired required) {
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
    VacanciesVacancyConditionFieldsTestFields vacanciesVacancyConditionFieldsTestFields = (VacanciesVacancyConditionFieldsTestFields) o;
    return Objects.equals(this.required, vacanciesVacancyConditionFieldsTestFields.required);
  }

  @Override
  public int hashCode() {
    return Objects.hash(required);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class VacanciesVacancyConditionFieldsTestFields {\n");
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

