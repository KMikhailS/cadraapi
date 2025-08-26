package ru.brobrocode.cadra.client.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.annotation.Generated;
import jakarta.validation.constraints.NotNull;

import java.util.Objects;

/**
 * Архивация вакансии
 */

@Schema(name = "WebhookPayloadVacancyArchivation", description = "Архивация вакансии")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2025-08-17T15:41:09.394389505+05:00[Asia/Yekaterinburg]", comments = "Generator version: 7.6.0")
public class WebhookPayloadVacancyArchivation implements WebhookSendObjectBaseUserPayload {

  private String archivationDate;

  private String vacancyId = null;

  public WebhookPayloadVacancyArchivation() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public WebhookPayloadVacancyArchivation(String archivationDate, String vacancyId) {
    this.archivationDate = archivationDate;
    this.vacancyId = vacancyId;
  }

  public WebhookPayloadVacancyArchivation archivationDate(String archivationDate) {
    this.archivationDate = archivationDate;
    return this;
  }

  /**
   * Дата архивации вакансии в формате [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601) с точностью до секунды: `YYYY-MM-DDThh:mm:ss±hhmm`
   * @return archivationDate
  */
  @NotNull 
  @Schema(name = "archivation_date", description = "Дата архивации вакансии в формате [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601) с точностью до секунды: `YYYY-MM-DDThh:mm:ss±hhmm`", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("archivation_date")
  public String getArchivationDate() {
    return archivationDate;
  }

  public void setArchivationDate(String archivationDate) {
    this.archivationDate = archivationDate;
  }

  public WebhookPayloadVacancyArchivation vacancyId(String vacancyId) {
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
    WebhookPayloadVacancyArchivation webhookPayloadVacancyArchivation = (WebhookPayloadVacancyArchivation) o;
    return Objects.equals(this.archivationDate, webhookPayloadVacancyArchivation.archivationDate) &&
        Objects.equals(this.vacancyId, webhookPayloadVacancyArchivation.vacancyId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(archivationDate, vacancyId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class WebhookPayloadVacancyArchivation {\n");
    sb.append("    archivationDate: ").append(toIndentedString(archivationDate)).append("\n");
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

