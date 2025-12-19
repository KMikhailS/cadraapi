package ru.brobrocode.cadra.client.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.annotation.Generated;
import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;

import java.math.BigDecimal;
import java.util.Objects;

/**
 * VacanciesVacancyStatsItem
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2025-08-17T15:41:09.394389505+05:00[Asia/Yekaterinburg]", comments = "Generator version: 7.6.0")
public class VacanciesVacancyStatsItem {

  private String date;

  private BigDecimal responses = null;

  private BigDecimal views = null;

  public VacanciesVacancyStatsItem() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public VacanciesVacancyStatsItem(String date) {
    this.date = date;
  }

  public VacanciesVacancyStatsItem date(String date) {
    this.date = date;
    return this;
  }

  /**
   * Дата в формате `YYYY-MM-DD`
   * @return date
  */
  @NotNull 
  @Schema(name = "date", description = "Дата в формате `YYYY-MM-DD`", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("date")
  public String getDate() {
    return date;
  }

  public void setDate(String date) {
    this.date = date;
  }

  public VacanciesVacancyStatsItem responses(BigDecimal responses) {
    this.responses = responses;
    return this;
  }

  /**
   * Количество откликов на вакансию. `null` если дата в будущем или данных на эту дату нет
   * @return responses
  */
  @Valid 
  @Schema(name = "responses", description = "Количество откликов на вакансию. `null` если дата в будущем или данных на эту дату нет", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("responses")
  public BigDecimal getResponses() {
    return responses;
  }

  public void setResponses(BigDecimal responses) {
    this.responses = responses;
  }

  public VacanciesVacancyStatsItem views(BigDecimal views) {
    this.views = views;
    return this;
  }

  /**
   * Количество просмотров вакансии. `null` если дата в будущем или данных на эту дату нет
   * @return views
  */
  @Valid 
  @Schema(name = "views", description = "Количество просмотров вакансии. `null` если дата в будущем или данных на эту дату нет", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("views")
  public BigDecimal getViews() {
    return views;
  }

  public void setViews(BigDecimal views) {
    this.views = views;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    VacanciesVacancyStatsItem vacanciesVacancyStatsItem = (VacanciesVacancyStatsItem) o;
    return Objects.equals(this.date, vacanciesVacancyStatsItem.date) &&
        Objects.equals(this.responses, vacanciesVacancyStatsItem.responses) &&
        Objects.equals(this.views, vacanciesVacancyStatsItem.views);
  }

  @Override
  public int hashCode() {
    return Objects.hash(date, responses, views);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class VacanciesVacancyStatsItem {\n");
    sb.append("    date: ").append(toIndentedString(date)).append("\n");
    sb.append("    responses: ").append(toIndentedString(responses)).append("\n");
    sb.append("    views: ").append(toIndentedString(views)).append("\n");
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

