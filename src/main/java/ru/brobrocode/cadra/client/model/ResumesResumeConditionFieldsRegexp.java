package ru.brobrocode.cadra.client.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.annotation.Generated;

import java.util.Objects;

/**
 * ResumesResumeConditionFieldsRegexp
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2025-08-17T15:41:09.394389505+05:00[Asia/Yekaterinburg]", comments = "Generator version: 7.6.0")
public class ResumesResumeConditionFieldsRegexp {

  private String regexp = null;

  public ResumesResumeConditionFieldsRegexp regexp(String regexp) {
    this.regexp = regexp;
    return this;
  }

  /**
   * Регулярное выражение, которому должно отвечать значение поля
   * @return regexp
  */
  
  @Schema(name = "regexp", description = "Регулярное выражение, которому должно отвечать значение поля", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("regexp")
  public String getRegexp() {
    return regexp;
  }

  public void setRegexp(String regexp) {
    this.regexp = regexp;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ResumesResumeConditionFieldsRegexp resumesResumeConditionFieldsRegexp = (ResumesResumeConditionFieldsRegexp) o;
    return Objects.equals(this.regexp, resumesResumeConditionFieldsRegexp.regexp);
  }

  @Override
  public int hashCode() {
    return Objects.hash(regexp);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ResumesResumeConditionFieldsRegexp {\n");
    sb.append("    regexp: ").append(toIndentedString(regexp)).append("\n");
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

