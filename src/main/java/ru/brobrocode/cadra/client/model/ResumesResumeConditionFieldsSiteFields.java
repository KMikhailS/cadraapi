package ru.brobrocode.cadra.client.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.annotation.Generated;
import jakarta.validation.Valid;

import java.util.Objects;

/**
 * ResumesResumeConditionFieldsSiteFields
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2025-08-17T15:41:09.394389505+05:00[Asia/Yekaterinburg]", comments = "Generator version: 7.6.0")
public class ResumesResumeConditionFieldsSiteFields {

  private ResumesResumeConditionFieldsRequiredWithTitle type = null;

  private ResumesResumeConditionFieldsRequiredLengthWithTitle url = null;

  public ResumesResumeConditionFieldsSiteFields type(ResumesResumeConditionFieldsRequiredWithTitle type) {
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

  public ResumesResumeConditionFieldsSiteFields url(ResumesResumeConditionFieldsRequiredLengthWithTitle url) {
    this.url = url;
    return this;
  }

  /**
   * Get url
   * @return url
  */
  @Valid 
  @Schema(name = "url", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("url")
  public ResumesResumeConditionFieldsRequiredLengthWithTitle getUrl() {
    return url;
  }

  public void setUrl(ResumesResumeConditionFieldsRequiredLengthWithTitle url) {
    this.url = url;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ResumesResumeConditionFieldsSiteFields resumesResumeConditionFieldsSiteFields = (ResumesResumeConditionFieldsSiteFields) o;
    return Objects.equals(this.type, resumesResumeConditionFieldsSiteFields.type) &&
        Objects.equals(this.url, resumesResumeConditionFieldsSiteFields.url);
  }

  @Override
  public int hashCode() {
    return Objects.hash(type, url);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ResumesResumeConditionFieldsSiteFields {\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    url: ").append(toIndentedString(url)).append("\n");
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

