package ru.brobrocode.cadra.client.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.annotation.Generated;
import jakarta.validation.constraints.NotNull;

import java.util.Objects;

/**
 * Изменение вакансии
 */

@Schema(name = "WebhookPayloadVacancyChange", description = "Изменение вакансии")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2025-08-17T15:41:09.394389505+05:00[Asia/Yekaterinburg]", comments = "Generator version: 7.6.0")
public class WebhookPayloadVacancyChange implements WebhookSendObjectBaseUserPayload {

  private String changeDate;

  private String vacancyId;

  public WebhookPayloadVacancyChange() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public WebhookPayloadVacancyChange(String changeDate, String vacancyId) {
    this.changeDate = changeDate;
    this.vacancyId = vacancyId;
  }

  public WebhookPayloadVacancyChange changeDate(String changeDate) {
    this.changeDate = changeDate;
    return this;
  }

  /**
   * Дата изменения вакансии в формате [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601) с точностью до секунды: `YYYY-MM-DDThh:mm:ss±hhmm`
   * @return changeDate
  */
  @NotNull 
  @Schema(name = "change_date", description = "Дата изменения вакансии в формате [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601) с точностью до секунды: `YYYY-MM-DDThh:mm:ss±hhmm`", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("change_date")
  public String getChangeDate() {
    return changeDate;
  }

  public void setChangeDate(String changeDate) {
    this.changeDate = changeDate;
  }

  public WebhookPayloadVacancyChange vacancyId(String vacancyId) {
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
    WebhookPayloadVacancyChange webhookPayloadVacancyChange = (WebhookPayloadVacancyChange) o;
    return Objects.equals(this.changeDate, webhookPayloadVacancyChange.changeDate) &&
        Objects.equals(this.vacancyId, webhookPayloadVacancyChange.vacancyId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(changeDate, vacancyId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class WebhookPayloadVacancyChange {\n");
    sb.append("    changeDate: ").append(toIndentedString(changeDate)).append("\n");
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

