package ru.brobrocode.cadra.client.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.annotation.Generated;
import jakarta.validation.Valid;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;

/**
 * CredsCredsUpdate
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2025-08-17T15:41:09.394389505+05:00[Asia/Yekaterinburg]", comments = "Generator version: 7.6.0")
public class CredsCredsUpdate {

  @Valid
  private Map<String, List<String>> questionToAnswerMap = new HashMap<>();

  public CredsCredsUpdate questionToAnswerMap(Map<String, List<String>> questionToAnswerMap) {
    this.questionToAnswerMap = questionToAnswerMap;
    return this;
  }

  public CredsCredsUpdate putQuestionToAnswerMapItem(String key, List<String> questionToAnswerMapItem) {
    if (this.questionToAnswerMap == null) {
      this.questionToAnswerMap = new HashMap<>();
    }
    this.questionToAnswerMap.put(key, questionToAnswerMapItem);
    return this;
  }

  /**
   * Get questionToAnswerMap
   * @return questionToAnswerMap
  */
  @Valid 
  @Schema(name = "question_to_answer_map", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("question_to_answer_map")
  public Map<String, List<String>> getQuestionToAnswerMap() {
    return questionToAnswerMap;
  }

  public void setQuestionToAnswerMap(Map<String, List<String>> questionToAnswerMap) {
    this.questionToAnswerMap = questionToAnswerMap;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CredsCredsUpdate credsCredsUpdate = (CredsCredsUpdate) o;
    return Objects.equals(this.questionToAnswerMap, credsCredsUpdate.questionToAnswerMap);
  }

  @Override
  public int hashCode() {
    return Objects.hash(questionToAnswerMap);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CredsCredsUpdate {\n");
    sb.append("    questionToAnswerMap: ").append(toIndentedString(questionToAnswerMap)).append("\n");
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

