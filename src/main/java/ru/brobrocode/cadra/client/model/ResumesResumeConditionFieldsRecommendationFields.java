package ru.brobrocode.cadra.client.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.annotation.Generated;
import jakarta.validation.Valid;

import java.util.Objects;

/**
 * ResumesResumeConditionFieldsRecommendationFields
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2025-08-17T15:41:09.394389505+05:00[Asia/Yekaterinburg]", comments = "Generator version: 7.6.0")
public class ResumesResumeConditionFieldsRecommendationFields {

  private ResumesResumeConditionFieldsRequiredLengthWithTitle name = null;

  private ResumesResumeConditionFieldsRequiredLengthWithTitle organization = null;

  private ResumesResumeConditionFieldsRequiredLengthWithTitle position = null;

  public ResumesResumeConditionFieldsRecommendationFields name(ResumesResumeConditionFieldsRequiredLengthWithTitle name) {
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

  public ResumesResumeConditionFieldsRecommendationFields organization(ResumesResumeConditionFieldsRequiredLengthWithTitle organization) {
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

  public ResumesResumeConditionFieldsRecommendationFields position(ResumesResumeConditionFieldsRequiredLengthWithTitle position) {
    this.position = position;
    return this;
  }

  /**
   * Get position
   * @return position
  */
  @Valid 
  @Schema(name = "position", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("position")
  public ResumesResumeConditionFieldsRequiredLengthWithTitle getPosition() {
    return position;
  }

  public void setPosition(ResumesResumeConditionFieldsRequiredLengthWithTitle position) {
    this.position = position;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ResumesResumeConditionFieldsRecommendationFields resumesResumeConditionFieldsRecommendationFields = (ResumesResumeConditionFieldsRecommendationFields) o;
    return Objects.equals(this.name, resumesResumeConditionFieldsRecommendationFields.name) &&
        Objects.equals(this.organization, resumesResumeConditionFieldsRecommendationFields.organization) &&
        Objects.equals(this.position, resumesResumeConditionFieldsRecommendationFields.position);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, organization, position);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ResumesResumeConditionFieldsRecommendationFields {\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    organization: ").append(toIndentedString(organization)).append("\n");
    sb.append("    position: ").append(toIndentedString(position)).append("\n");
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

