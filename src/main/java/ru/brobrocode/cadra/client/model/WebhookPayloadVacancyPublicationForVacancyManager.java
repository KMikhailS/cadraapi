package ru.brobrocode.cadra.client.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.annotation.Generated;
import jakarta.validation.constraints.NotNull;

import java.util.Objects;

/**
 * WebhookPayloadVacancyPublicationForVacancyManager
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2025-08-17T15:41:09.394389505+05:00[Asia/Yekaterinburg]", comments = "Generator version: 7.6.0")
public class WebhookPayloadVacancyPublicationForVacancyManager implements WebhookSendObjectBaseUserPayload {

  private String creationDate;

  private String employerManagerId;

  private String vacancyId;

  public WebhookPayloadVacancyPublicationForVacancyManager() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public WebhookPayloadVacancyPublicationForVacancyManager(String creationDate, String employerManagerId, String vacancyId) {
    this.creationDate = creationDate;
    this.employerManagerId = employerManagerId;
    this.vacancyId = vacancyId;
  }

  public WebhookPayloadVacancyPublicationForVacancyManager creationDate(String creationDate) {
    this.creationDate = creationDate;
    return this;
  }

  /**
   * Дата создания вакансии в формате [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601) с точностью до секунды: `YYYY-MM-DDThh:mm:ss±hhmm
   * @return creationDate
  */
  @NotNull 
  @Schema(name = "creation_date", description = "Дата создания вакансии в формате [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601) с точностью до секунды: `YYYY-MM-DDThh:mm:ss±hhmm", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("creation_date")
  public String getCreationDate() {
    return creationDate;
  }

  public void setCreationDate(String creationDate) {
    this.creationDate = creationDate;
  }

  public WebhookPayloadVacancyPublicationForVacancyManager employerManagerId(String employerManagerId) {
    this.employerManagerId = employerManagerId;
    return this;
  }

  /**
   * Идентификатор модератора вакансии
   * @return employerManagerId
  */
  @NotNull 
  @Schema(name = "employer_manager_id", description = "Идентификатор модератора вакансии", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("employer_manager_id")
  public String getEmployerManagerId() {
    return employerManagerId;
  }

  public void setEmployerManagerId(String employerManagerId) {
    this.employerManagerId = employerManagerId;
  }

  public WebhookPayloadVacancyPublicationForVacancyManager vacancyId(String vacancyId) {
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
    WebhookPayloadVacancyPublicationForVacancyManager webhookPayloadVacancyPublicationForVacancyManager = (WebhookPayloadVacancyPublicationForVacancyManager) o;
    return Objects.equals(this.creationDate, webhookPayloadVacancyPublicationForVacancyManager.creationDate) &&
        Objects.equals(this.employerManagerId, webhookPayloadVacancyPublicationForVacancyManager.employerManagerId) &&
        Objects.equals(this.vacancyId, webhookPayloadVacancyPublicationForVacancyManager.vacancyId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(creationDate, employerManagerId, vacancyId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class WebhookPayloadVacancyPublicationForVacancyManager {\n");
    sb.append("    creationDate: ").append(toIndentedString(creationDate)).append("\n");
    sb.append("    employerManagerId: ").append(toIndentedString(employerManagerId)).append("\n");
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

