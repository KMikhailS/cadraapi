package ru.brobrocode.cadra.client.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.annotation.Generated;

import java.util.Objects;

/**
 * WebhookActionVacancyOnlyMineSettings
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2025-08-17T15:41:09.394389505+05:00[Asia/Yekaterinburg]", comments = "Generator version: 7.6.0")
public class WebhookActionVacancyOnlyMineSettings {

  private Boolean vacanciesOnlyMine = false;

  public WebhookActionVacancyOnlyMineSettings vacanciesOnlyMine(Boolean vacanciesOnlyMine) {
    this.vacanciesOnlyMine = vacanciesOnlyMine;
    return this;
  }

  /**
   * Если `true`, сервис будет присылать уведомления только о вакансиях текущего пользователя.  По умолчанию `false` — сервис будет присылать уведомления о всех вакансиях, к которым есть доступ 
   * @return vacanciesOnlyMine
  */
  
  @Schema(name = "vacancies_only_mine", description = "Если `true`, сервис будет присылать уведомления только о вакансиях текущего пользователя.  По умолчанию `false` — сервис будет присылать уведомления о всех вакансиях, к которым есть доступ ", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("vacancies_only_mine")
  public Boolean getVacanciesOnlyMine() {
    return vacanciesOnlyMine;
  }

  public void setVacanciesOnlyMine(Boolean vacanciesOnlyMine) {
    this.vacanciesOnlyMine = vacanciesOnlyMine;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    WebhookActionVacancyOnlyMineSettings webhookActionVacancyOnlyMineSettings = (WebhookActionVacancyOnlyMineSettings) o;
    return Objects.equals(this.vacanciesOnlyMine, webhookActionVacancyOnlyMineSettings.vacanciesOnlyMine);
  }

  @Override
  public int hashCode() {
    return Objects.hash(vacanciesOnlyMine);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class WebhookActionVacancyOnlyMineSettings {\n");
    sb.append("    vacanciesOnlyMine: ").append(toIndentedString(vacanciesOnlyMine)).append("\n");
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

