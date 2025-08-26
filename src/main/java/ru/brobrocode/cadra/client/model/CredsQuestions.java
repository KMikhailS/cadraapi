package ru.brobrocode.cadra.client.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.annotation.Generated;
import jakarta.validation.Valid;
import jakarta.validation.constraints.Size;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * CredsQuestions
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2025-08-17T15:41:09.394389505+05:00[Asia/Yekaterinburg]", comments = "Generator version: 7.6.0")
public class CredsQuestions {

  private String description = null;

  private Boolean isActive;

  @Valid
  private List<String> possibleAnswers = new ArrayList<>();

  private String questionId;

  private String questionTitle;

  private String questionType;

  private Boolean required;

  private Boolean skipTitleAtView;

  private String viewTitle = null;

  public CredsQuestions description(String description) {
    this.description = description;
    return this;
  }

  /**
   * Описание вопроса
   * @return description
  */
  
  @Schema(name = "description", description = "Описание вопроса", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("description")
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public CredsQuestions isActive(Boolean isActive) {
    this.isActive = isActive;
    return this;
  }

  /**
   * Показан ли вопрос изначально, актуально для динамических вопросов
   * @return isActive
  */
  
  @Schema(name = "is_active", description = "Показан ли вопрос изначально, актуально для динамических вопросов", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("is_active")
  public Boolean getIsActive() {
    return isActive;
  }

  public void setIsActive(Boolean isActive) {
    this.isActive = isActive;
  }

  public CredsQuestions possibleAnswers(List<String> possibleAnswers) {
    this.possibleAnswers = possibleAnswers;
    return this;
  }

  public CredsQuestions addPossibleAnswersItem(String possibleAnswersItem) {
    if (this.possibleAnswers == null) {
      this.possibleAnswers = new ArrayList<>();
    }
    this.possibleAnswers.add(possibleAnswersItem);
    return this;
  }

  /**
   * Возможные ответы на вопрос, гарантировано придут в поле answers
   * @return possibleAnswers
  */
  @Size(min = 1) 
  @Schema(name = "possible_answers", description = "Возможные ответы на вопрос, гарантировано придут в поле answers", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("possible_answers")
  public List<String> getPossibleAnswers() {
    return possibleAnswers;
  }

  public void setPossibleAnswers(List<String> possibleAnswers) {
    this.possibleAnswers = possibleAnswers;
  }

  public CredsQuestions questionId(String questionId) {
    this.questionId = questionId;
    return this;
  }

  /**
   * Идентификатор вопроса (совпадает с ключом объекта)
   * @return questionId
  */
  
  @Schema(name = "question_id", description = "Идентификатор вопроса (совпадает с ключом объекта)", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("question_id")
  public String getQuestionId() {
    return questionId;
  }

  public void setQuestionId(String questionId) {
    this.questionId = questionId;
  }

  public CredsQuestions questionTitle(String questionTitle) {
    this.questionTitle = questionTitle;
    return this;
  }

  /**
   * Текст вопроса отображаемый на форме
   * @return questionTitle
  */
  
  @Schema(name = "question_title", description = "Текст вопроса отображаемый на форме", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("question_title")
  public String getQuestionTitle() {
    return questionTitle;
  }

  public void setQuestionTitle(String questionTitle) {
    this.questionTitle = questionTitle;
  }

  public CredsQuestions questionType(String questionType) {
    this.questionType = questionType;
    return this;
  }

  /**
   * Возможность мульти выбора ответов на данный вопрос \"single_choice\" / \"multi_select\"
   * @return questionType
  */
  
  @Schema(name = "question_type", description = "Возможность мульти выбора ответов на данный вопрос \"single_choice\" / \"multi_select\"", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("question_type")
  public String getQuestionType() {
    return questionType;
  }

  public void setQuestionType(String questionType) {
    this.questionType = questionType;
  }

  public CredsQuestions required(Boolean required) {
    this.required = required;
    return this;
  }

  /**
   * Обязателен ли вопрос для получения ответа
   * @return required
  */
  
  @Schema(name = "required", description = "Обязателен ли вопрос для получения ответа", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("required")
  public Boolean getRequired() {
    return required;
  }

  public void setRequired(Boolean required) {
    this.required = required;
  }

  public CredsQuestions skipTitleAtView(Boolean skipTitleAtView) {
    this.skipTitleAtView = skipTitleAtView;
    return this;
  }

  /**
   * Пропускать ли текст вопроса на просмотре, если false - ответы внутри placeholder, если true - просто перечисляем без текста вопроса
   * @return skipTitleAtView
  */
  
  @Schema(name = "skip_title_at_view", description = "Пропускать ли текст вопроса на просмотре, если false - ответы внутри placeholder, если true - просто перечисляем без текста вопроса", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("skip_title_at_view")
  public Boolean getSkipTitleAtView() {
    return skipTitleAtView;
  }

  public void setSkipTitleAtView(Boolean skipTitleAtView) {
    this.skipTitleAtView = skipTitleAtView;
  }

  public CredsQuestions viewTitle(String viewTitle) {
    this.viewTitle = viewTitle;
    return this;
  }

  /**
   * Текст вопроса на просмотре
   * @return viewTitle
  */
  
  @Schema(name = "view_title", description = "Текст вопроса на просмотре", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("view_title")
  public String getViewTitle() {
    return viewTitle;
  }

  public void setViewTitle(String viewTitle) {
    this.viewTitle = viewTitle;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CredsQuestions credsQuestions = (CredsQuestions) o;
    return Objects.equals(this.description, credsQuestions.description) &&
        Objects.equals(this.isActive, credsQuestions.isActive) &&
        Objects.equals(this.possibleAnswers, credsQuestions.possibleAnswers) &&
        Objects.equals(this.questionId, credsQuestions.questionId) &&
        Objects.equals(this.questionTitle, credsQuestions.questionTitle) &&
        Objects.equals(this.questionType, credsQuestions.questionType) &&
        Objects.equals(this.required, credsQuestions.required) &&
        Objects.equals(this.skipTitleAtView, credsQuestions.skipTitleAtView) &&
        Objects.equals(this.viewTitle, credsQuestions.viewTitle);
  }

  @Override
  public int hashCode() {
    return Objects.hash(description, isActive, possibleAnswers, questionId, questionTitle, questionType, required, skipTitleAtView, viewTitle);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CredsQuestions {\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    isActive: ").append(toIndentedString(isActive)).append("\n");
    sb.append("    possibleAnswers: ").append(toIndentedString(possibleAnswers)).append("\n");
    sb.append("    questionId: ").append(toIndentedString(questionId)).append("\n");
    sb.append("    questionTitle: ").append(toIndentedString(questionTitle)).append("\n");
    sb.append("    questionType: ").append(toIndentedString(questionType)).append("\n");
    sb.append("    required: ").append(toIndentedString(required)).append("\n");
    sb.append("    skipTitleAtView: ").append(toIndentedString(skipTitleAtView)).append("\n");
    sb.append("    viewTitle: ").append(toIndentedString(viewTitle)).append("\n");
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

