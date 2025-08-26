package ru.brobrocode.cadra.client.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.annotation.Generated;
import jakarta.validation.Valid;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * ResumesResumeConditionFieldsNotIn
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2025-08-17T15:41:09.394389505+05:00[Asia/Yekaterinburg]", comments = "Generator version: 7.6.0")
public class ResumesResumeConditionFieldsNotIn {

  @Valid
  private List<String> notIn;

  public ResumesResumeConditionFieldsNotIn notIn(List<String> notIn) {
    this.notIn = notIn;
    return this;
  }

  public ResumesResumeConditionFieldsNotIn addNotInItem(String notInItem) {
    if (this.notIn == null) {
      this.notIn = new ArrayList<>();
    }
    this.notIn.add(notInItem);
    return this;
  }

  /**
   * Список недопустимых значений
   * @return notIn
  */
  
  @Schema(name = "not_in", description = "Список недопустимых значений", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("not_in")
  public List<String> getNotIn() {
    return notIn;
  }

  public void setNotIn(List<String> notIn) {
    this.notIn = notIn;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ResumesResumeConditionFieldsNotIn resumesResumeConditionFieldsNotIn = (ResumesResumeConditionFieldsNotIn) o;
    return Objects.equals(this.notIn, resumesResumeConditionFieldsNotIn.notIn);
  }

  @Override
  public int hashCode() {
    return Objects.hash(notIn);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ResumesResumeConditionFieldsNotIn {\n");
    sb.append("    notIn: ").append(toIndentedString(notIn)).append("\n");
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

