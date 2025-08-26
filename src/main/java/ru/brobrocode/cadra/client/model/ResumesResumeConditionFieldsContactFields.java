package ru.brobrocode.cadra.client.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.annotation.Generated;
import jakarta.validation.Valid;

import java.util.Objects;

/**
 * ResumesResumeConditionFieldsContactFields
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2025-08-17T15:41:09.394389505+05:00[Asia/Yekaterinburg]", comments = "Generator version: 7.6.0")
public class ResumesResumeConditionFieldsContactFields {

  private ResumesResumeConditionFieldsRequiredLengthWithTitle comment = null;

  private ResumesResumeConditionFieldsRequiredWithTitle preferred = null;

  private ResumesResumeConditionFieldsRequiredWithTitle type = null;

  private ResumesResumeConditionFieldsRequiredWithTitle value = null;

  public ResumesResumeConditionFieldsContactFields comment(ResumesResumeConditionFieldsRequiredLengthWithTitle comment) {
    this.comment = comment;
    return this;
  }

  /**
   * Get comment
   * @return comment
  */
  @Valid 
  @Schema(name = "comment", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("comment")
  public ResumesResumeConditionFieldsRequiredLengthWithTitle getComment() {
    return comment;
  }

  public void setComment(ResumesResumeConditionFieldsRequiredLengthWithTitle comment) {
    this.comment = comment;
  }

  public ResumesResumeConditionFieldsContactFields preferred(ResumesResumeConditionFieldsRequiredWithTitle preferred) {
    this.preferred = preferred;
    return this;
  }

  /**
   * Get preferred
   * @return preferred
  */
  @Valid 
  @Schema(name = "preferred", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("preferred")
  public ResumesResumeConditionFieldsRequiredWithTitle getPreferred() {
    return preferred;
  }

  public void setPreferred(ResumesResumeConditionFieldsRequiredWithTitle preferred) {
    this.preferred = preferred;
  }

  public ResumesResumeConditionFieldsContactFields type(ResumesResumeConditionFieldsRequiredWithTitle type) {
    this.type = type;
    return this;
  }

  /**
   * Get type
   * @return type
  */
  @Valid 
  @Schema(name = "type", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("type")
  public ResumesResumeConditionFieldsRequiredWithTitle getType() {
    return type;
  }

  public void setType(ResumesResumeConditionFieldsRequiredWithTitle type) {
    this.type = type;
  }

  public ResumesResumeConditionFieldsContactFields value(ResumesResumeConditionFieldsRequiredWithTitle value) {
    this.value = value;
    return this;
  }

  /**
   * Get value
   * @return value
  */
  @Valid 
  @Schema(name = "value", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("value")
  public ResumesResumeConditionFieldsRequiredWithTitle getValue() {
    return value;
  }

  public void setValue(ResumesResumeConditionFieldsRequiredWithTitle value) {
    this.value = value;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ResumesResumeConditionFieldsContactFields resumesResumeConditionFieldsContactFields = (ResumesResumeConditionFieldsContactFields) o;
    return Objects.equals(this.comment, resumesResumeConditionFieldsContactFields.comment) &&
        Objects.equals(this.preferred, resumesResumeConditionFieldsContactFields.preferred) &&
        Objects.equals(this.type, resumesResumeConditionFieldsContactFields.type) &&
        Objects.equals(this.value, resumesResumeConditionFieldsContactFields.value);
  }

  @Override
  public int hashCode() {
    return Objects.hash(comment, preferred, type, value);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ResumesResumeConditionFieldsContactFields {\n");
    sb.append("    comment: ").append(toIndentedString(comment)).append("\n");
    sb.append("    preferred: ").append(toIndentedString(preferred)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    value: ").append(toIndentedString(value)).append("\n");
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

