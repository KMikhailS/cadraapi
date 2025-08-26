package ru.brobrocode.cadra.client.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.annotation.Generated;
import jakarta.validation.Valid;

import java.util.Objects;

/**
 * ResumesResumeConditionFieldsPrimaryEducationFields
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2025-08-17T15:41:09.394389505+05:00[Asia/Yekaterinburg]", comments = "Generator version: 7.6.0")
public class ResumesResumeConditionFieldsPrimaryEducationFields {

  private ResumesResumeConditionFieldsRequiredLengthWithTitle name = null;

  private ResumesResumeConditionFieldsRequiredLengthWithTitle organization = null;

  private ResumesResumeConditionFieldsRequiredLengthWithTitle result = null;

  private ResumesResumeConditionFieldsRequiredValueWithTitle year = null;

  public ResumesResumeConditionFieldsPrimaryEducationFields name(ResumesResumeConditionFieldsRequiredLengthWithTitle name) {
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

  public ResumesResumeConditionFieldsPrimaryEducationFields organization(ResumesResumeConditionFieldsRequiredLengthWithTitle organization) {
    this.organization = organization;
    return this;
  }

  /**
   * Get organization
   * @return organization
  */
  @Valid 
  @Schema(name = "organization", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("organization")
  public ResumesResumeConditionFieldsRequiredLengthWithTitle getOrganization() {
    return organization;
  }

  public void setOrganization(ResumesResumeConditionFieldsRequiredLengthWithTitle organization) {
    this.organization = organization;
  }

  public ResumesResumeConditionFieldsPrimaryEducationFields result(ResumesResumeConditionFieldsRequiredLengthWithTitle result) {
    this.result = result;
    return this;
  }

  /**
   * Get result
   * @return result
  */
  @Valid 
  @Schema(name = "result", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("result")
  public ResumesResumeConditionFieldsRequiredLengthWithTitle getResult() {
    return result;
  }

  public void setResult(ResumesResumeConditionFieldsRequiredLengthWithTitle result) {
    this.result = result;
  }

  public ResumesResumeConditionFieldsPrimaryEducationFields year(ResumesResumeConditionFieldsRequiredValueWithTitle year) {
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
    ResumesResumeConditionFieldsPrimaryEducationFields resumesResumeConditionFieldsPrimaryEducationFields = (ResumesResumeConditionFieldsPrimaryEducationFields) o;
    return Objects.equals(this.name, resumesResumeConditionFieldsPrimaryEducationFields.name) &&
        Objects.equals(this.organization, resumesResumeConditionFieldsPrimaryEducationFields.organization) &&
        Objects.equals(this.result, resumesResumeConditionFieldsPrimaryEducationFields.result) &&
        Objects.equals(this.year, resumesResumeConditionFieldsPrimaryEducationFields.year);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, organization, result, year);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ResumesResumeConditionFieldsPrimaryEducationFields {\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    organization: ").append(toIndentedString(organization)).append("\n");
    sb.append("    result: ").append(toIndentedString(result)).append("\n");
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

