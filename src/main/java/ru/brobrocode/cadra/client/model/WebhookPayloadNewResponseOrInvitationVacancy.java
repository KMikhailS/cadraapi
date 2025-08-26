package ru.brobrocode.cadra.client.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.annotation.Generated;
import jakarta.validation.constraints.NotNull;

import java.util.Objects;

/**
 * Новый отклик или приглашение на вакансии (в отличие от NEW_NEGOTIATION_VACANCY, данное событие будет вызываться как на отклик со стороны соискателя, так и на приглашение со стороны работодателя)
 */

@Schema(name = "WebhookPayloadNewResponseOrInvitationVacancy", description = "Новый отклик или приглашение на вакансии (в отличие от NEW_NEGOTIATION_VACANCY, данное событие будет вызываться как на отклик со стороны соискателя, так и на приглашение со стороны работодателя)")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2025-08-17T15:41:09.394389505+05:00[Asia/Yekaterinburg]", comments = "Generator version: 7.6.0")
public class WebhookPayloadNewResponseOrInvitationVacancy implements WebhookSendObjectBaseUserPayload {

  private String employerId;

  private String responseDate;

  private String resumeId = null;

  private String topicId;

  private String vacancyId = null;

  public WebhookPayloadNewResponseOrInvitationVacancy() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public WebhookPayloadNewResponseOrInvitationVacancy(String employerId, String responseDate, String resumeId, String topicId, String vacancyId) {
    this.employerId = employerId;
    this.responseDate = responseDate;
    this.resumeId = resumeId;
    this.topicId = topicId;
    this.vacancyId = vacancyId;
  }

  public WebhookPayloadNewResponseOrInvitationVacancy employerId(String employerId) {
    this.employerId = employerId;
    return this;
  }

  /**
   * Идентификатор работодателя
   * @return employerId
  */
  @NotNull 
  @Schema(name = "employer_id", description = "Идентификатор работодателя", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("employer_id")
  public String getEmployerId() {
    return employerId;
  }

  public void setEmployerId(String employerId) {
    this.employerId = employerId;
  }

  public WebhookPayloadNewResponseOrInvitationVacancy responseDate(String responseDate) {
    this.responseDate = responseDate;
    return this;
  }

  /**
   * Дата отклика или приглашения в формате [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601) с точностью до секунды: `YYYY-MM-DDThh:mm:ss±hhmm`
   * @return responseDate
  */
  @NotNull 
  @Schema(name = "response_date", description = "Дата отклика или приглашения в формате [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601) с точностью до секунды: `YYYY-MM-DDThh:mm:ss±hhmm`", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("response_date")
  public String getResponseDate() {
    return responseDate;
  }

  public void setResponseDate(String responseDate) {
    this.responseDate = responseDate;
  }

  public WebhookPayloadNewResponseOrInvitationVacancy resumeId(String resumeId) {
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

  public WebhookPayloadNewResponseOrInvitationVacancy topicId(String topicId) {
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

  public WebhookPayloadNewResponseOrInvitationVacancy vacancyId(String vacancyId) {
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
    WebhookPayloadNewResponseOrInvitationVacancy webhookPayloadNewResponseOrInvitationVacancy = (WebhookPayloadNewResponseOrInvitationVacancy) o;
    return Objects.equals(this.employerId, webhookPayloadNewResponseOrInvitationVacancy.employerId) &&
        Objects.equals(this.responseDate, webhookPayloadNewResponseOrInvitationVacancy.responseDate) &&
        Objects.equals(this.resumeId, webhookPayloadNewResponseOrInvitationVacancy.resumeId) &&
        Objects.equals(this.topicId, webhookPayloadNewResponseOrInvitationVacancy.topicId) &&
        Objects.equals(this.vacancyId, webhookPayloadNewResponseOrInvitationVacancy.vacancyId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(employerId, responseDate, resumeId, topicId, vacancyId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class WebhookPayloadNewResponseOrInvitationVacancy {\n");
    sb.append("    employerId: ").append(toIndentedString(employerId)).append("\n");
    sb.append("    responseDate: ").append(toIndentedString(responseDate)).append("\n");
    sb.append("    resumeId: ").append(toIndentedString(resumeId)).append("\n");
    sb.append("    topicId: ").append(toIndentedString(topicId)).append("\n");
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

