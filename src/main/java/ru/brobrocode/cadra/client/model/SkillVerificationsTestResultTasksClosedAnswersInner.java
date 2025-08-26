package ru.brobrocode.cadra.client.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.annotation.Generated;

import java.util.Objects;

/**
 * SkillVerificationsTestResultTasksClosedAnswersInner
 */

@JsonTypeName("SkillVerificationsTestResultTasks_closed_answers_inner")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2025-08-17T15:41:09.394389505+05:00[Asia/Yekaterinburg]", comments = "Generator version: 7.6.0")
public class SkillVerificationsTestResultTasksClosedAnswersInner {

  private Boolean correct;

  private Boolean selected;

  private String value;

  public SkillVerificationsTestResultTasksClosedAnswersInner correct(Boolean correct) {
    this.correct = correct;
    return this;
  }

  /**
   * Является ли вариант ответа правильным
   * @return correct
  */
  
  @Schema(name = "correct", description = "Является ли вариант ответа правильным", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("correct")
  public Boolean getCorrect() {
    return correct;
  }

  public void setCorrect(Boolean correct) {
    this.correct = correct;
  }

  public SkillVerificationsTestResultTasksClosedAnswersInner selected(Boolean selected) {
    this.selected = selected;
    return this;
  }

  /**
   * Выбран ли вариант ответа
   * @return selected
  */
  
  @Schema(name = "selected", description = "Выбран ли вариант ответа", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("selected")
  public Boolean getSelected() {
    return selected;
  }

  public void setSelected(Boolean selected) {
    this.selected = selected;
  }

  public SkillVerificationsTestResultTasksClosedAnswersInner value(String value) {
    this.value = value;
    return this;
  }

  /**
   * Вариант ответа на вопрос
   * @return value
  */
  
  @Schema(name = "value", description = "Вариант ответа на вопрос", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("value")
  public String getValue() {
    return value;
  }

  public void setValue(String value) {
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
    SkillVerificationsTestResultTasksClosedAnswersInner skillVerificationsTestResultTasksClosedAnswersInner = (SkillVerificationsTestResultTasksClosedAnswersInner) o;
    return Objects.equals(this.correct, skillVerificationsTestResultTasksClosedAnswersInner.correct) &&
        Objects.equals(this.selected, skillVerificationsTestResultTasksClosedAnswersInner.selected) &&
        Objects.equals(this.value, skillVerificationsTestResultTasksClosedAnswersInner.value);
  }

  @Override
  public int hashCode() {
    return Objects.hash(correct, selected, value);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SkillVerificationsTestResultTasksClosedAnswersInner {\n");
    sb.append("    correct: ").append(toIndentedString(correct)).append("\n");
    sb.append("    selected: ").append(toIndentedString(selected)).append("\n");
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

