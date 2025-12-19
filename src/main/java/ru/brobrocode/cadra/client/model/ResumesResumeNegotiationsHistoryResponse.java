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
 * ResumesResumeNegotiationsHistoryResponse
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2025-08-17T15:41:09.394389505+05:00[Asia/Yekaterinburg]", comments = "Generator version: 7.6.0")
public class ResumesResumeNegotiationsHistoryResponse {

  @Valid
  private List<@Valid ResumesResumeNegotiationsHistoryVacancy> vacancies = new ArrayList<>();

  public ResumesResumeNegotiationsHistoryResponse() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public ResumesResumeNegotiationsHistoryResponse(List<@Valid ResumesResumeNegotiationsHistoryVacancy> vacancies) {
    this.vacancies = vacancies;
  }

  public ResumesResumeNegotiationsHistoryResponse vacancies(List<@Valid ResumesResumeNegotiationsHistoryVacancy> vacancies) {
    this.vacancies = vacancies;
    return this;
  }

  public ResumesResumeNegotiationsHistoryResponse addVacanciesItem(ResumesResumeNegotiationsHistoryVacancy vacanciesItem) {
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
  @NotNull @Valid 
  @Schema(name = "vacancies", description = "Массив вакансий", requiredMode = Schema.RequiredMode.REQUIRED)
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
    ResumesResumeNegotiationsHistoryResponse resumesResumeNegotiationsHistoryResponse = (ResumesResumeNegotiationsHistoryResponse) o;
    return Objects.equals(this.vacancies, resumesResumeNegotiationsHistoryResponse.vacancies);
  }

  @Override
  public int hashCode() {
    return Objects.hash(vacancies);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ResumesResumeNegotiationsHistoryResponse {\n");
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

