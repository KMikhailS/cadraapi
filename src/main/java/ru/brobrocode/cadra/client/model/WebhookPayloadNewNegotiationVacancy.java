package ru.brobrocode.cadra.client.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.annotation.Generated;
import jakarta.validation.constraints.NotNull;

import java.util.Objects;

/**
 * Новый отклик на вакансию
 */

@Schema(name = "WebhookPayloadNewNegotiationVacancy", description = "Новый отклик на вакансию")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2025-08-17T15:41:09.394389505+05:00[Asia/Yekaterinburg]", comments = "Generator version: 7.6.0")
public class WebhookPayloadNewNegotiationVacancy implements WebhookSendObjectBaseUserPayload {

  private String employerId;

  private Object negotiationDate = null;

  private String resumeId = null;

  private String topicId;

  private String vacancyId = null;

  public WebhookPayloadNewNegotiationVacancy() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public WebhookPayloadNewNegotiationVacancy(String employerId, Object negotiationDate, String resumeId, String topicId, String vacancyId) {
    this.employerId = employerId;
    this.negotiationDate = negotiationDate;
    this.resumeId = resumeId;
    this.topicId = topicId;
    this.vacancyId = vacancyId;
  }

  public WebhookPayloadNewNegotiationVacancy employerId(String employerId) {
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

  public WebhookPayloadNewNegotiationVacancy negotiationDate(Object negotiationDate) {
    this.negotiationDate = negotiationDate;
    return this;
  }

  /**
   * Дата отклика в формате [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601) с точностью до секунды: `YYYY-MM-DDThh:mm:ss±hhmm`
   * @return negotiationDate
  */
  @NotNull 
  @Schema(name = "negotiation_date", description = "Дата отклика в формате [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601) с точностью до секунды: `YYYY-MM-DDThh:mm:ss±hhmm`", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("negotiation_date")
  public Object getNegotiationDate() {
    return negotiationDate;
  }

  public void setNegotiationDate(Object negotiationDate) {
    this.negotiationDate = negotiationDate;
  }

  public WebhookPayloadNewNegotiationVacancy resumeId(String resumeId) {
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

  public WebhookPayloadNewNegotiationVacancy topicId(String topicId) {
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

  public WebhookPayloadNewNegotiationVacancy vacancyId(String vacancyId) {
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
    WebhookPayloadNewNegotiationVacancy webhookPayloadNewNegotiationVacancy = (WebhookPayloadNewNegotiationVacancy) o;
    return Objects.equals(this.employerId, webhookPayloadNewNegotiationVacancy.employerId) &&
        Objects.equals(this.negotiationDate, webhookPayloadNewNegotiationVacancy.negotiationDate) &&
        Objects.equals(this.resumeId, webhookPayloadNewNegotiationVacancy.resumeId) &&
        Objects.equals(this.topicId, webhookPayloadNewNegotiationVacancy.topicId) &&
        Objects.equals(this.vacancyId, webhookPayloadNewNegotiationVacancy.vacancyId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(employerId, negotiationDate, resumeId, topicId, vacancyId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class WebhookPayloadNewNegotiationVacancy {\n");
    sb.append("    employerId: ").append(toIndentedString(employerId)).append("\n");
    sb.append("    negotiationDate: ").append(toIndentedString(negotiationDate)).append("\n");
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

