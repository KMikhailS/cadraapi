package ru.brobrocode.cadra.client.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.annotation.Generated;
import jakarta.validation.Valid;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * CredsAnswers
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2025-08-17T15:41:09.394389505+05:00[Asia/Yekaterinburg]", comments = "Generator version: 7.6.0")
public class CredsAnswers {

  private String answerGroup;

  private String answerId;

  @Valid
  private List<String> askQuestionsAfter = new ArrayList<>();

  private String description = null;

  private String positiveTitle;

  private Boolean skipAtResult;

  private String title;

  public CredsAnswers answerGroup(String answerGroup) {
    this.answerGroup = answerGroup;
    return this;
  }

  /**
   * Группа данного ответа, positive, negative, neutral
   * @return answerGroup
  */
  
  @Schema(name = "answer_group", description = "Группа данного ответа, positive, negative, neutral", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("answer_group")
  public String getAnswerGroup() {
    return answerGroup;
  }

  public void setAnswerGroup(String answerGroup) {
    this.answerGroup = answerGroup;
  }

  public CredsAnswers answerId(String answerId) {
    this.answerId = answerId;
    return this;
  }

  /**
   * Идентификатор ответа (совпадает с ключом объекта)
   * @return answerId
  */
  
  @Schema(name = "answer_id", description = "Идентификатор ответа (совпадает с ключом объекта)", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("answer_id")
  public String getAnswerId() {
    return answerId;
  }

  public void setAnswerId(String answerId) {
    this.answerId = answerId;
  }

  public CredsAnswers askQuestionsAfter(List<String> askQuestionsAfter) {
    this.askQuestionsAfter = askQuestionsAfter;
    return this;
  }

  public CredsAnswers addAskQuestionsAfterItem(String askQuestionsAfterItem) {
    if (this.askQuestionsAfter == null) {
      this.askQuestionsAfter = new ArrayList<>();
    }
    this.askQuestionsAfter.add(askQuestionsAfterItem);
    return this;
  }

  /**
   * Вопросы которые нужно задать после использования пользователем данного ответа
   * @return askQuestionsAfter
  */
  
  @Schema(name = "ask_questions_after", description = "Вопросы которые нужно задать после использования пользователем данного ответа", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("ask_questions_after")
  public List<String> getAskQuestionsAfter() {
    return askQuestionsAfter;
  }

  public void setAskQuestionsAfter(List<String> askQuestionsAfter) {
    this.askQuestionsAfter = askQuestionsAfter;
  }

  public CredsAnswers description(String description) {
    this.description = description;
    return this;
  }

  /**
   * Описание ответа
   * @return description
  */
  
  @Schema(name = "description", description = "Описание ответа", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("description")
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public CredsAnswers positiveTitle(String positiveTitle) {
    this.positiveTitle = positiveTitle;
    return this;
  }

  /**
   * Текст ответа который можно использовать для отображения без самого вопроса
   * @return positiveTitle
  */
  
  @Schema(name = "positive_title", description = "Текст ответа который можно использовать для отображения без самого вопроса", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("positive_title")
  public String getPositiveTitle() {
    return positiveTitle;
  }

  public void setPositiveTitle(String positiveTitle) {
    this.positiveTitle = positiveTitle;
  }

  public CredsAnswers skipAtResult(Boolean skipAtResult) {
    this.skipAtResult = skipAtResult;
    return this;
  }

  /**
   * Нужно ли пропускать данный ответ на форме с отображением кредов пользователя
   * @return skipAtResult
  */
  
  @Schema(name = "skip_at_result", description = "Нужно ли пропускать данный ответ на форме с отображением кредов пользователя", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("skip_at_result")
  public Boolean getSkipAtResult() {
    return skipAtResult;
  }

  public void setSkipAtResult(Boolean skipAtResult) {
    this.skipAtResult = skipAtResult;
  }

  public CredsAnswers title(String title) {
    this.title = title;
    return this;
  }

  /**
   * Текст ответа который нужно отрисовать для сбора ответов от пользователя
   * @return title
  */
  
  @Schema(name = "title", description = "Текст ответа который нужно отрисовать для сбора ответов от пользователя", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("title")
  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CredsAnswers credsAnswers = (CredsAnswers) o;
    return Objects.equals(this.answerGroup, credsAnswers.answerGroup) &&
        Objects.equals(this.answerId, credsAnswers.answerId) &&
        Objects.equals(this.askQuestionsAfter, credsAnswers.askQuestionsAfter) &&
        Objects.equals(this.description, credsAnswers.description) &&
        Objects.equals(this.positiveTitle, credsAnswers.positiveTitle) &&
        Objects.equals(this.skipAtResult, credsAnswers.skipAtResult) &&
        Objects.equals(this.title, credsAnswers.title);
  }

  @Override
  public int hashCode() {
    return Objects.hash(answerGroup, answerId, askQuestionsAfter, description, positiveTitle, skipAtResult, title);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CredsAnswers {\n");
    sb.append("    answerGroup: ").append(toIndentedString(answerGroup)).append("\n");
    sb.append("    answerId: ").append(toIndentedString(answerId)).append("\n");
    sb.append("    askQuestionsAfter: ").append(toIndentedString(askQuestionsAfter)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    positiveTitle: ").append(toIndentedString(positiveTitle)).append("\n");
    sb.append("    skipAtResult: ").append(toIndentedString(skipAtResult)).append("\n");
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
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

