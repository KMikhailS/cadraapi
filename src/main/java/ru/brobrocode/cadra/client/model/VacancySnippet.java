package ru.brobrocode.cadra.client.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.annotation.Generated;

import java.util.Objects;

/**
 * VacancySnippet
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2025-08-17T15:41:09.394389505+05:00[Asia/Yekaterinburg]", comments = "Generator version: 7.6.0")
public class VacancySnippet {

  private String requirement = null;

  private String responsibility = null;

  public VacancySnippet requirement(String requirement) {
    this.requirement = requirement;
    return this;
  }

  /**
   * Отрывок из требований по вакансии, если они найдены в тексте описания
   * @return requirement
  */
  
  @Schema(name = "requirement", description = "Отрывок из требований по вакансии, если они найдены в тексте описания", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("requirement")
  public String getRequirement() {
    return requirement;
  }

  public void setRequirement(String requirement) {
    this.requirement = requirement;
  }

  public VacancySnippet responsibility(String responsibility) {
    this.responsibility = responsibility;
    return this;
  }

  /**
   * Отрывок из обязанностей по вакансии, если они найдены в тексте описания
   * @return responsibility
  */
  
  @Schema(name = "responsibility", description = "Отрывок из обязанностей по вакансии, если они найдены в тексте описания", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("responsibility")
  public String getResponsibility() {
    return responsibility;
  }

  public void setResponsibility(String responsibility) {
    this.responsibility = responsibility;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    VacancySnippet vacancySnippet = (VacancySnippet) o;
    return Objects.equals(this.requirement, vacancySnippet.requirement) &&
        Objects.equals(this.responsibility, vacancySnippet.responsibility);
  }

  @Override
  public int hashCode() {
    return Objects.hash(requirement, responsibility);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class VacancySnippet {\n");
    sb.append("    requirement: ").append(toIndentedString(requirement)).append("\n");
    sb.append("    responsibility: ").append(toIndentedString(responsibility)).append("\n");
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

