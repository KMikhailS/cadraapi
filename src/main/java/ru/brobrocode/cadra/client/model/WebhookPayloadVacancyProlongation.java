package ru.brobrocode.cadra.client.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.annotation.Generated;
import jakarta.validation.constraints.NotNull;

import java.util.Objects;

/**
 * Продление вакансии
 */

@Schema(name = "WebhookPayloadVacancyProlongation", description = "Продление вакансии")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2025-08-17T15:41:09.394389505+05:00[Asia/Yekaterinburg]", comments = "Generator version: 7.6.0")
public class WebhookPayloadVacancyProlongation implements WebhookSendObjectBaseUserPayload {

  private String prolongationDate;

  private String vacancyId;

  public WebhookPayloadVacancyProlongation() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public WebhookPayloadVacancyProlongation(String prolongationDate, String vacancyId) {
    this.prolongationDate = prolongationDate;
    this.vacancyId = vacancyId;
  }

  public WebhookPayloadVacancyProlongation prolongationDate(String prolongationDate) {
    this.prolongationDate = prolongationDate;
    return this;
  }

  /**
   * Дата продления вакансии в формате [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601) с точностью до секунды: `YYYY-MM-DDThh:mm:ss±hhmm`
   * @return prolongationDate
  */
  @NotNull 
  @Schema(name = "prolongation_date", description = "Дата продления вакансии в формате [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601) с точностью до секунды: `YYYY-MM-DDThh:mm:ss±hhmm`", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("prolongation_date")
  public String getProlongationDate() {
    return prolongationDate;
  }

  public void setProlongationDate(String prolongationDate) {
    this.prolongationDate = prolongationDate;
  }

  public WebhookPayloadVacancyProlongation vacancyId(String vacancyId) {
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
    WebhookPayloadVacancyProlongation webhookPayloadVacancyProlongation = (WebhookPayloadVacancyProlongation) o;
    return Objects.equals(this.prolongationDate, webhookPayloadVacancyProlongation.prolongationDate) &&
        Objects.equals(this.vacancyId, webhookPayloadVacancyProlongation.vacancyId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(prolongationDate, vacancyId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class WebhookPayloadVacancyProlongation {\n");
    sb.append("    prolongationDate: ").append(toIndentedString(prolongationDate)).append("\n");
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

