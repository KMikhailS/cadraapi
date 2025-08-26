package ru.brobrocode.cadra.client.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.annotation.Generated;
import jakarta.validation.Valid;

import java.util.Objects;

/**
 * ResumesResumeConditionFieldsLanguageFields
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2025-08-17T15:41:09.394389505+05:00[Asia/Yekaterinburg]", comments = "Generator version: 7.6.0")
public class ResumesResumeConditionFieldsLanguageFields {

  private ResumesResumeConditionFieldsRequiredWithTitle id = null;

  private ResumesResumeConditionFieldsRequiredWithTitle level = null;

  public ResumesResumeConditionFieldsLanguageFields id(ResumesResumeConditionFieldsRequiredWithTitle id) {
    this.id = id;
    return this;
  }

  /**
   * Get id
   * @return id
  */
  @Valid 
  @Schema(name = "id", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("id")
  public ResumesResumeConditionFieldsRequiredWithTitle getId() {
    return id;
  }

  public void setId(ResumesResumeConditionFieldsRequiredWithTitle id) {
    this.id = id;
  }

  public ResumesResumeConditionFieldsLanguageFields level(ResumesResumeConditionFieldsRequiredWithTitle level) {
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

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ResumesResumeConditionFieldsLanguageFields resumesResumeConditionFieldsLanguageFields = (ResumesResumeConditionFieldsLanguageFields) o;
    return Objects.equals(this.id, resumesResumeConditionFieldsLanguageFields.id) &&
        Objects.equals(this.level, resumesResumeConditionFieldsLanguageFields.level);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, level);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ResumesResumeConditionFieldsLanguageFields {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    level: ").append(toIndentedString(level)).append("\n");
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

