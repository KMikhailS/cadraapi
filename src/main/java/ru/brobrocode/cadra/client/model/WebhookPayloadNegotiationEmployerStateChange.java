package ru.brobrocode.cadra.client.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.annotation.Generated;
import jakarta.validation.constraints.NotNull;

import java.util.Objects;

/**
 * Изменение этапа, на котором находится кандидат на вакансии. Содержит информацию о том кто, какое резюме с какого на какой  статус перевел 
 */

@Schema(name = "WebhookPayloadNegotiationEmployerStateChange", description = "Изменение этапа, на котором находится кандидат на вакансии. Содержит информацию о том кто, какое резюме с какого на какой  статус перевел ")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2025-08-17T15:41:09.394389505+05:00[Asia/Yekaterinburg]", comments = "Generator version: 7.6.0")
public class WebhookPayloadNegotiationEmployerStateChange implements WebhookSendObjectBaseUserPayload {

  private String employerManagerId;

  private String fromState;

  private String resumeId;

  private String toState;

  private String topicId;

  private String transferredAt;

  private String vacancyId;

  public WebhookPayloadNegotiationEmployerStateChange() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public WebhookPayloadNegotiationEmployerStateChange(String employerManagerId, String fromState, String resumeId, String toState, String topicId, String transferredAt, String vacancyId) {
    this.employerManagerId = employerManagerId;
    this.fromState = fromState;
    this.resumeId = resumeId;
    this.toState = toState;
    this.topicId = topicId;
    this.transferredAt = transferredAt;
    this.vacancyId = vacancyId;
  }

  public WebhookPayloadNegotiationEmployerStateChange employerManagerId(String employerManagerId) {
    this.employerManagerId = employerManagerId;
    return this;
  }

  /**
   * Идентификатор менеджера, совершившего перевод
   * @return employerManagerId
  */
  @NotNull 
  @Schema(name = "employer_manager_id", description = "Идентификатор менеджера, совершившего перевод", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("employer_manager_id")
  public String getEmployerManagerId() {
    return employerManagerId;
  }

  public void setEmployerManagerId(String employerManagerId) {
    this.employerManagerId = employerManagerId;
  }

  public WebhookPayloadNegotiationEmployerStateChange fromState(String fromState) {
    this.fromState = fromState;
    return this;
  }

  /**
   * С какого статуса перевели
   * @return fromState
  */
  @NotNull 
  @Schema(name = "from_state", description = "С какого статуса перевели", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("from_state")
  public String getFromState() {
    return fromState;
  }

  public void setFromState(String fromState) {
    this.fromState = fromState;
  }

  public WebhookPayloadNegotiationEmployerStateChange resumeId(String resumeId) {
    this.resumeId = resumeId;
    return this;
  }

  /**
   * Идентификатор резюме
   * @return resumeId
  */
  @NotNull 
  @Schema(name = "resume_id", description = "Идентификатор резюме", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("resume_id")
  public String getResumeId() {
    return resumeId;
  }

  public void setResumeId(String resumeId) {
    this.resumeId = resumeId;
  }

  public WebhookPayloadNegotiationEmployerStateChange toState(String toState) {
    this.toState = toState;
    return this;
  }

  /**
   * На какой статус перевели
   * @return toState
  */
  @NotNull 
  @Schema(name = "to_state", description = "На какой статус перевели", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("to_state")
  public String getToState() {
    return toState;
  }

  public void setToState(String toState) {
    this.toState = toState;
  }

  public WebhookPayloadNegotiationEmployerStateChange topicId(String topicId) {
    this.topicId = topicId;
    return this;
  }

  /**
   * Идентификатор топика
   * @return topicId
  */
  @NotNull 
  @Schema(name = "topic_id", description = "Идентификатор топика", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("topic_id")
  public String getTopicId() {
    return topicId;
  }

  public void setTopicId(String topicId) {
    this.topicId = topicId;
  }

  public WebhookPayloadNegotiationEmployerStateChange transferredAt(String transferredAt) {
    this.transferredAt = transferredAt;
    return this;
  }

  /**
   * Время перевода на новый этап
   * @return transferredAt
  */
  @NotNull 
  @Schema(name = "transferred_at", description = "Время перевода на новый этап", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("transferred_at")
  public String getTransferredAt() {
    return transferredAt;
  }

  public void setTransferredAt(String transferredAt) {
    this.transferredAt = transferredAt;
  }

  public WebhookPayloadNegotiationEmployerStateChange vacancyId(String vacancyId) {
    this.vacancyId = vacancyId;
    return this;
  }

  /**
   * Идентификатор вакансии
   * @return vacancyId
  */
  @NotNull 
  @Schema(name = "vacancy_id", description = "Идентификатор вакансии", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("vacancy_id")
  public String getVacancyId() {
    return vacancyId;
  }

  public void setVacancyId(String vacancyId) {
    this.vacancyId = vacancyId;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    WebhookPayloadNegotiationEmployerStateChange webhookPayloadNegotiationEmployerStateChange = (WebhookPayloadNegotiationEmployerStateChange) o;
    return Objects.equals(this.employerManagerId, webhookPayloadNegotiationEmployerStateChange.employerManagerId) &&
        Objects.equals(this.fromState, webhookPayloadNegotiationEmployerStateChange.fromState) &&
        Objects.equals(this.resumeId, webhookPayloadNegotiationEmployerStateChange.resumeId) &&
        Objects.equals(this.toState, webhookPayloadNegotiationEmployerStateChange.toState) &&
        Objects.equals(this.topicId, webhookPayloadNegotiationEmployerStateChange.topicId) &&
        Objects.equals(this.transferredAt, webhookPayloadNegotiationEmployerStateChange.transferredAt) &&
        Objects.equals(this.vacancyId, webhookPayloadNegotiationEmployerStateChange.vacancyId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(employerManagerId, fromState, resumeId, toState, topicId, transferredAt, vacancyId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class WebhookPayloadNegotiationEmployerStateChange {\n");
    sb.append("    employerManagerId: ").append(toIndentedString(employerManagerId)).append("\n");
    sb.append("    fromState: ").append(toIndentedString(fromState)).append("\n");
    sb.append("    resumeId: ").append(toIndentedString(resumeId)).append("\n");
    sb.append("    toState: ").append(toIndentedString(toState)).append("\n");
    sb.append("    topicId: ").append(toIndentedString(topicId)).append("\n");
    sb.append("    transferredAt: ").append(toIndentedString(transferredAt)).append("\n");
    sb.append("    vacancyId: ").append(toIndentedString(vacancyId)).append("\n");
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

