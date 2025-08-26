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
 * Документы, подтверждающие наличие у соискателя опыта или квалификации для выполнения определенного вида деятельности.  Зависят от профессиональных ролей резюме 
 */

@Schema(name = "CredsCreds", description = "Документы, подтверждающие наличие у соискателя опыта или квалификации для выполнения определенного вида деятельности.  Зависят от профессиональных ролей резюме ")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2025-08-17T15:41:09.394389505+05:00[Asia/Yekaterinburg]", comments = "Generator version: 7.6.0")
public class CredsCreds {

  @Valid
  private Map<String, CredsAnswers> answers = new HashMap<>();

  @Valid
  private Map<String, List<String>> questionToAnswerMap = new HashMap<>();

  @Valid
  private Map<String, CredsQuestions> questions = new HashMap<>();

  public CredsCreds answers(Map<String, CredsAnswers> answers) {
    this.answers = answers;
    return this;
  }

  public CredsCreds putAnswersItem(String key, CredsAnswers answersItem) {
    if (this.answers == null) {
      this.answers = new HashMap<>();
    }
    this.answers.put(key, answersItem);
    return this;
  }

  /**
   * Get answers
   * @return answers
  */
  @Valid 
  @Schema(name = "answers", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("answers")
  public Map<String, CredsAnswers> getAnswers() {
    return answers;
  }

  public void setAnswers(Map<String, CredsAnswers> answers) {
    this.answers = answers;
  }

  public CredsCreds questionToAnswerMap(Map<String, List<String>> questionToAnswerMap) {
    this.questionToAnswerMap = questionToAnswerMap;
    return this;
  }

  public CredsCreds putQuestionToAnswerMapItem(String key, List<String> questionToAnswerMapItem) {
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

  public CredsCreds questions(Map<String, CredsQuestions> questions) {
    this.questions = questions;
    return this;
  }

  public CredsCreds putQuestionsItem(String key, CredsQuestions questionsItem) {
    if (this.questions == null) {
      this.questions = new HashMap<>();
    }
    this.questions.put(key, questionsItem);
    return this;
  }

  /**
   * Get questions
   * @return questions
  */
  @Valid 
  @Schema(name = "questions", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("questions")
  public Map<String, CredsQuestions> getQuestions() {
    return questions;
  }

  public void setQuestions(Map<String, CredsQuestions> questions) {
    this.questions = questions;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CredsCreds credsCreds = (CredsCreds) o;
    return Objects.equals(this.answers, credsCreds.answers) &&
        Objects.equals(this.questionToAnswerMap, credsCreds.questionToAnswerMap) &&
        Objects.equals(this.questions, credsCreds.questions);
  }

  @Override
  public int hashCode() {
    return Objects.hash(answers, questionToAnswerMap, questions);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CredsCreds {\n");
    sb.append("    answers: ").append(toIndentedString(answers)).append("\n");
    sb.append("    questionToAnswerMap: ").append(toIndentedString(questionToAnswerMap)).append("\n");
    sb.append("    questions: ").append(toIndentedString(questions)).append("\n");
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

