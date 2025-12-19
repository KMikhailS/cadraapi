package ru.brobrocode.cadra.client.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.annotation.Generated;
import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * ResumeObjectsNegotiationsHistoryForEmployer
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2025-08-17T15:41:09.394389505+05:00[Asia/Yekaterinburg]", comments = "Generator version: 7.6.0")
public class ResumeObjectsNegotiationsHistoryForEmployer {

  private String url;

  @Valid
  private List<@Valid ResumesResumeNegotiationsHistoryVacancy> vacancies;

  public ResumeObjectsNegotiationsHistoryForEmployer() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public ResumeObjectsNegotiationsHistoryForEmployer(String url) {
    this.url = url;
  }

  public ResumeObjectsNegotiationsHistoryForEmployer url(String url) {
    this.url = url;
    return this;
  }

  /**
   * URL, на который необходимо сделать GET-запрос, чтобы получить [подробную историю откликов/приглашений](#tag/Otklikipriglasheniya-rabotodatelya/operation/get-resume-negotiations-history) по данному резюме
   * @return url
  */
  @NotNull 
  @Schema(name = "url", description = "URL, на который необходимо сделать GET-запрос, чтобы получить [подробную историю откликов/приглашений](#tag/Otklikipriglasheniya-rabotodatelya/operation/get-resume-negotiations-history) по данному резюме", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("url")
  public String getUrl() {
    return url;
  }

  public void setUrl(String url) {
    this.url = url;
  }

  public ResumeObjectsNegotiationsHistoryForEmployer vacancies(List<@Valid ResumesResumeNegotiationsHistoryVacancy> vacancies) {
    this.vacancies = vacancies;
    return this;
  }

  public ResumeObjectsNegotiationsHistoryForEmployer addVacanciesItem(ResumesResumeNegotiationsHistoryVacancy vacanciesItem) {
    if (this.vacancies == null) {
      this.vacancies = new ArrayList<>();
    }
    this.vacancies.add(vacanciesItem);
    return this;
  }

  /**
   * Массив вакансий
   * @return vacancies
  */
  @Valid 
  @Schema(name = "vacancies", description = "Массив вакансий", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("vacancies")
  public List<@Valid ResumesResumeNegotiationsHistoryVacancy> getVacancies() {
    return vacancies;
  }

  public void setVacancies(List<@Valid ResumesResumeNegotiationsHistoryVacancy> vacancies) {
    this.vacancies = vacancies;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ResumeObjectsNegotiationsHistoryForEmployer resumeObjectsNegotiationsHistoryForEmployer = (ResumeObjectsNegotiationsHistoryForEmployer) o;
    return Objects.equals(this.url, resumeObjectsNegotiationsHistoryForEmployer.url) &&
        Objects.equals(this.vacancies, resumeObjectsNegotiationsHistoryForEmployer.vacancies);
  }

  @Override
  public int hashCode() {
    return Objects.hash(url, vacancies);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ResumeObjectsNegotiationsHistoryForEmployer {\n");
    sb.append("    url: ").append(toIndentedString(url)).append("\n");
    sb.append("    vacancies: ").append(toIndentedString(vacancies)).append("\n");
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

