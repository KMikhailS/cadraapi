package ru.brobrocode.cadra.client.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.annotation.Generated;
import jakarta.validation.Valid;

import java.util.Objects;

/**
 * ResumesResumeConditionFieldsElementaryEducationFields
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2025-08-17T15:41:09.394389505+05:00[Asia/Yekaterinburg]", comments = "Generator version: 7.6.0")
public class ResumesResumeConditionFieldsElementaryEducationFields {

  private ResumesResumeConditionFieldsRequiredLengthWithTitle name = null;

  private ResumesResumeConditionFieldsRequiredValueWithTitle year = null;

  public ResumesResumeConditionFieldsElementaryEducationFields name(ResumesResumeConditionFieldsRequiredLengthWithTitle name) {
    this.name = name;
    return this;
  }

  /**
   * Get name
   * @return name
  */
  @Valid 
  @Schema(name = "name", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("name")
  public ResumesResumeConditionFieldsRequiredLengthWithTitle getName() {
    return name;
  }

  public void setName(ResumesResumeConditionFieldsRequiredLengthWithTitle name) {
    this.name = name;
  }

  public ResumesResumeConditionFieldsElementaryEducationFields year(ResumesResumeConditionFieldsRequiredValueWithTitle year) {
    this.year = year;
    return this;
  }

  /**
   * Get year
   * @return year
  */
  @Valid 
  @Schema(name = "year", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("year")
  public ResumesResumeConditionFieldsRequiredValueWithTitle getYear() {
    return year;
  }

  public void setYear(ResumesResumeConditionFieldsRequiredValueWithTitle year) {
    this.year = year;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ResumesResumeConditionFieldsElementaryEducationFields resumesResumeConditionFieldsElementaryEducationFields = (ResumesResumeConditionFieldsElementaryEducationFields) o;
    return Objects.equals(this.name, resumesResumeConditionFieldsElementaryEducationFields.name) &&
        Objects.equals(this.year, resumesResumeConditionFieldsElementaryEducationFields.year);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, year);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ResumesResumeConditionFieldsElementaryEducationFields {\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    year: ").append(toIndentedString(year)).append("\n");
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

