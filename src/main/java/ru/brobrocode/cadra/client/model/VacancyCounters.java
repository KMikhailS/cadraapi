package ru.brobrocode.cadra.client.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.annotation.Generated;
import jakarta.validation.Valid;

import java.math.BigDecimal;
import java.util.Objects;

/**
 * Число откликов на вакансию. Доступно для соискательской авторизации и авторизации приложения при использовании параметра &#x60;responses_count_enabled&#x3D;true&#x60; 
 */

@Schema(name = "VacancyCounters", description = "Число откликов на вакансию. Доступно для соискательской авторизации и авторизации приложения при использовании параметра `responses_count_enabled=true` ")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2025-08-17T15:41:09.394389505+05:00[Asia/Yekaterinburg]", comments = "Generator version: 7.6.0")
public class VacancyCounters {

  private BigDecimal responses;

  private BigDecimal totalResponses;

  public VacancyCounters responses(BigDecimal responses) {
    this.responses = responses;
    return this;
  }

  /**
   * Количество откликов на вакансию с момента публикации
   * @return responses
  */
  @Valid 
  @Schema(name = "responses", description = "Количество откликов на вакансию с момента публикации", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("responses")
  public BigDecimal getResponses() {
    return responses;
  }

  public void setResponses(BigDecimal responses) {
    this.responses = responses;
  }

  public VacancyCounters totalResponses(BigDecimal totalResponses) {
    this.totalResponses = totalResponses;
    return this;
  }

  /**
   * Количество откликов на вакансию с момента создания
   * @return totalResponses
  */
  @Valid 
  @Schema(name = "total_responses", description = "Количество откликов на вакансию с момента создания", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("total_responses")
  public BigDecimal getTotalResponses() {
    return totalResponses;
  }

  public void setTotalResponses(BigDecimal totalResponses) {
    this.totalResponses = totalResponses;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    VacancyCounters vacancyCounters = (VacancyCounters) o;
    return Objects.equals(this.responses, vacancyCounters.responses) &&
        Objects.equals(this.totalResponses, vacancyCounters.totalResponses);
  }

  @Override
  public int hashCode() {
    return Objects.hash(responses, totalResponses);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class VacancyCounters {\n");
    sb.append("    responses: ").append(toIndentedString(responses)).append("\n");
    sb.append("    totalResponses: ").append(toIndentedString(totalResponses)).append("\n");
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

