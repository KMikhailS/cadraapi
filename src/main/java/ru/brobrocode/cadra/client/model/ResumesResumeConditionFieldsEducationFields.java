package ru.brobrocode.cadra.client.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.annotation.Generated;
import jakarta.validation.Valid;

import java.util.Objects;

/**
 * ResumesResumeConditionFieldsEducationFields
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2025-08-17T15:41:09.394389505+05:00[Asia/Yekaterinburg]", comments = "Generator version: 7.6.0")
public class ResumesResumeConditionFieldsEducationFields {

  private ResumesResumeConditionFieldsEducationPrimaryCondition additional = null;

  private ResumesResumeConditionFieldsEducationPrimaryCondition attestation = null;

  private ResumesResumeConditionFieldsEducationElementaryCondition elementary = null;

  private ResumesResumeConditionFieldsRequiredWithTitle level = null;

  private ResumesResumeConditionFieldsEducationPrimaryCondition primary = null;

  public ResumesResumeConditionFieldsEducationFields additional(ResumesResumeConditionFieldsEducationPrimaryCondition additional) {
    this.additional = additional;
    return this;
  }

  /**
   * Get additional
   * @return additional
  */
  @Valid 
  @Schema(name = "additional", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("additional")
  public ResumesResumeConditionFieldsEducationPrimaryCondition getAdditional() {
    return additional;
  }

  public void setAdditional(ResumesResumeConditionFieldsEducationPrimaryCondition additional) {
    this.additional = additional;
  }

  public ResumesResumeConditionFieldsEducationFields attestation(ResumesResumeConditionFieldsEducationPrimaryCondition attestation) {
    this.attestation = attestation;
    return this;
  }

  /**
   * Get attestation
   * @return attestation
  */
  @Valid 
  @Schema(name = "attestation", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("attestation")
  public ResumesResumeConditionFieldsEducationPrimaryCondition getAttestation() {
    return attestation;
  }

  public void setAttestation(ResumesResumeConditionFieldsEducationPrimaryCondition attestation) {
    this.attestation = attestation;
  }

  public ResumesResumeConditionFieldsEducationFields elementary(ResumesResumeConditionFieldsEducationElementaryCondition elementary) {
    this.elementary = elementary;
    return this;
  }

  /**
   * Get elementary
   * @return elementary
  */
  @Valid 
  @Schema(name = "elementary", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("elementary")
  public ResumesResumeConditionFieldsEducationElementaryCondition getElementary() {
    return elementary;
  }

  public void setElementary(ResumesResumeConditionFieldsEducationElementaryCondition elementary) {
    this.elementary = elementary;
  }

  public ResumesResumeConditionFieldsEducationFields level(ResumesResumeConditionFieldsRequiredWithTitle level) {
    this.level = level;
    return this;
  }

  /**
   * Get level
   * @return level
  */
  @Valid 
  @Schema(name = "level", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("level")
  public ResumesResumeConditionFieldsRequiredWithTitle getLevel() {
    return level;
  }

  public void setLevel(ResumesResumeConditionFieldsRequiredWithTitle level) {
    this.level = level;
  }

  public ResumesResumeConditionFieldsEducationFields primary(ResumesResumeConditionFieldsEducationPrimaryCondition primary) {
    this.primary = primary;
    return this;
  }

  /**
   * Get primary
   * @return primary
  */
  @Valid 
  @Schema(name = "primary", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("primary")
  public ResumesResumeConditionFieldsEducationPrimaryCondition getPrimary() {
    return primary;
  }

  public void setPrimary(ResumesResumeConditionFieldsEducationPrimaryCondition primary) {
    this.primary = primary;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ResumesResumeConditionFieldsEducationFields resumesResumeConditionFieldsEducationFields = (ResumesResumeConditionFieldsEducationFields) o;
    return Objects.equals(this.additional, resumesResumeConditionFieldsEducationFields.additional) &&
        Objects.equals(this.attestation, resumesResumeConditionFieldsEducationFields.attestation) &&
        Objects.equals(this.elementary, resumesResumeConditionFieldsEducationFields.elementary) &&
        Objects.equals(this.level, resumesResumeConditionFieldsEducationFields.level) &&
        Objects.equals(this.primary, resumesResumeConditionFieldsEducationFields.primary);
  }

  @Override
  public int hashCode() {
    return Objects.hash(additional, attestation, elementary, level, primary);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ResumesResumeConditionFieldsEducationFields {\n");
    sb.append("    additional: ").append(toIndentedString(additional)).append("\n");
    sb.append("    attestation: ").append(toIndentedString(attestation)).append("\n");
    sb.append("    elementary: ").append(toIndentedString(elementary)).append("\n");
    sb.append("    level: ").append(toIndentedString(level)).append("\n");
    sb.append("    primary: ").append(toIndentedString(primary)).append("\n");
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

