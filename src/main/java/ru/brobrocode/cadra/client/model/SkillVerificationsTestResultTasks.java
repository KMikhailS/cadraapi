package ru.brobrocode.cadra.client.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.annotation.Generated;
import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * SkillVerificationsTestResultTasks
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2025-08-17T15:41:09.394389505+05:00[Asia/Yekaterinburg]", comments = "Generator version: 7.6.0")
public class SkillVerificationsTestResultTasks {

  @Valid
  private List<@Valid SkillVerificationsTestResultTasksClosedAnswersInner> closedAnswers = new ArrayList<>();

  private SkillVerificationsOpenedAnswer openedAnswer = null;

  private String question;

  public SkillVerificationsTestResultTasks() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public SkillVerificationsTestResultTasks(List<@Valid SkillVerificationsTestResultTasksClosedAnswersInner> closedAnswers, String question) {
    this.closedAnswers = closedAnswers;
    this.question = question;
  }

  public SkillVerificationsTestResultTasks closedAnswers(List<@Valid SkillVerificationsTestResultTasksClosedAnswersInner> closedAnswers) {
    this.closedAnswers = closedAnswers;
    return this;
  }

  public SkillVerificationsTestResultTasks addClosedAnswersItem(SkillVerificationsTestResultTasksClosedAnswersInner closedAnswersItem) {
    if (this.closedAnswers == null) {
      this.closedAnswers = new ArrayList<>();
    }
    this.closedAnswers.add(closedAnswersItem);
    return this;
  }

  /**
   * Варианты ответов на закрытые вопросы
   * @return closedAnswers
  */
  @NotNull @Valid 
  @Schema(name = "closed_answers", description = "Варианты ответов на закрытые вопросы", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("closed_answers")
  public List<@Valid SkillVerificationsTestResultTasksClosedAnswersInner> getClosedAnswers() {
    return closedAnswers;
  }

  public void setClosedAnswers(List<@Valid SkillVerificationsTestResultTasksClosedAnswersInner> closedAnswers) {
    this.closedAnswers = closedAnswers;
  }

  public SkillVerificationsTestResultTasks openedAnswer(SkillVerificationsOpenedAnswer openedAnswer) {
    this.openedAnswer = openedAnswer;
    return this;
  }

  /**
   * Get openedAnswer
   * @return openedAnswer
  */
  @Valid 
  @Schema(name = "opened_answer", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("opened_answer")
  public SkillVerificationsOpenedAnswer getOpenedAnswer() {
    return openedAnswer;
  }

  public void setOpenedAnswer(SkillVerificationsOpenedAnswer openedAnswer) {
    this.openedAnswer = openedAnswer;
  }

  public SkillVerificationsTestResultTasks question(String question) {
    this.question = question;
    return this;
  }

  /**
   * Текст вопроса
   * @return question
  */
  @NotNull 
  @Schema(name = "question", description = "Текст вопроса", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("question")
  public String getQuestion() {
    return question;
  }

  public void setQuestion(String question) {
    this.question = question;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SkillVerificationsTestResultTasks skillVerificationsTestResultTasks = (SkillVerificationsTestResultTasks) o;
    return Objects.equals(this.closedAnswers, skillVerificationsTestResultTasks.closedAnswers) &&
        Objects.equals(this.openedAnswer, skillVerificationsTestResultTasks.openedAnswer) &&
        Objects.equals(this.question, skillVerificationsTestResultTasks.question);
  }

  @Override
  public int hashCode() {
    return Objects.hash(closedAnswers, openedAnswer, question);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SkillVerificationsTestResultTasks {\n");
    sb.append("    closedAnswers: ").append(toIndentedString(closedAnswers)).append("\n");
    sb.append("    openedAnswer: ").append(toIndentedString(openedAnswer)).append("\n");
    sb.append("    question: ").append(toIndentedString(question)).append("\n");
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

