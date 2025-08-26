package ru.brobrocode.cadra.client.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.annotation.Generated;
import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;

import java.math.BigDecimal;
import java.util.Objects;

/**
 * VacanciesAdditionalVacancyFields
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2025-08-17T15:41:09.394389505+05:00[Asia/Yekaterinburg]", comments = "Generator version: 7.6.0")
public class VacanciesAdditionalVacancyFields {

  private VacancyCounters counters;

  @Deprecated
  private VacancyEmploymentOutput employment = null;

  private VacancyEmploymentFormOutput employmentForm = null;

  private VacancyExperienceOutput experience = null;

  private VacancySnippet snippet;

  private BigDecimal sortPointDistance = null;

  public VacanciesAdditionalVacancyFields() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public VacanciesAdditionalVacancyFields(VacancySnippet snippet) {
    this.snippet = snippet;
  }

  public VacanciesAdditionalVacancyFields counters(VacancyCounters counters) {
    this.counters = counters;
    return this;
  }

  /**
   * Get counters
   * @return counters
  */
  @Valid 
  @Schema(name = "counters", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("counters")
  public VacancyCounters getCounters() {
    return counters;
  }

  public void setCounters(VacancyCounters counters) {
    this.counters = counters;
  }

  public VacanciesAdditionalVacancyFields employment(VacancyEmploymentOutput employment) {
    this.employment = employment;
    return this;
  }

  /**
   * Get employment
   * @return employment
   * @deprecated
  */
  @Valid 
  @Schema(name = "employment", deprecated = true, requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("employment")
  @Deprecated
  public VacancyEmploymentOutput getEmployment() {
    return employment;
  }

  /**
   * @deprecated
  */
  @Deprecated
  public void setEmployment(VacancyEmploymentOutput employment) {
    this.employment = employment;
  }

  public VacanciesAdditionalVacancyFields employmentForm(VacancyEmploymentFormOutput employmentForm) {
    this.employmentForm = employmentForm;
    return this;
  }

  /**
   * Get employmentForm
   * @return employmentForm
  */
  @Valid 
  @Schema(name = "employment_form", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("employment_form")
  public VacancyEmploymentFormOutput getEmploymentForm() {
    return employmentForm;
  }

  public void setEmploymentForm(VacancyEmploymentFormOutput employmentForm) {
    this.employmentForm = employmentForm;
  }

  public VacanciesAdditionalVacancyFields experience(VacancyExperienceOutput experience) {
    this.experience = experience;
    return this;
  }

  /**
   * Get experience
   * @return experience
  */
  @Valid 
  @Schema(name = "experience", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("experience")
  public VacancyExperienceOutput getExperience() {
    return experience;
  }

  public void setExperience(VacancyExperienceOutput experience) {
    this.experience = experience;
  }

  public VacanciesAdditionalVacancyFields snippet(VacancySnippet snippet) {
    this.snippet = snippet;
    return this;
  }

  /**
   * Get snippet
   * @return snippet
  */
  @NotNull @Valid 
  @Schema(name = "snippet", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("snippet")
  public VacancySnippet getSnippet() {
    return snippet;
  }

  public void setSnippet(VacancySnippet snippet) {
    this.snippet = snippet;
  }

  public VacanciesAdditionalVacancyFields sortPointDistance(BigDecimal sortPointDistance) {
    this.sortPointDistance = sortPointDistance;
    return this;
  }

  /**
   * Расстояние в метрах между центром сортировки (заданной параметрами `sort_point_lat`, `sort_point_lng`) и указанным в вакансии адресом. В случае, если в адресе указаны только станции метро, выдается расстояние между центром сортировки и средней геометрической точкой указанных станций.  Значение `sort_point_distance` выдается только в случае, если заданы параметры `sort_point_lat`, `sort_point_lng`, `order_by=distance`
   * @return sortPointDistance
  */
  @Valid 
  @Schema(name = "sort_point_distance", description = "Расстояние в метрах между центром сортировки (заданной параметрами `sort_point_lat`, `sort_point_lng`) и указанным в вакансии адресом. В случае, если в адресе указаны только станции метро, выдается расстояние между центром сортировки и средней геометрической точкой указанных станций.  Значение `sort_point_distance` выдается только в случае, если заданы параметры `sort_point_lat`, `sort_point_lng`, `order_by=distance`", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("sort_point_distance")
  public BigDecimal getSortPointDistance() {
    return sortPointDistance;
  }

  public void setSortPointDistance(BigDecimal sortPointDistance) {
    this.sortPointDistance = sortPointDistance;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    VacanciesAdditionalVacancyFields vacanciesAdditionalVacancyFields = (VacanciesAdditionalVacancyFields) o;
    return Objects.equals(this.counters, vacanciesAdditionalVacancyFields.counters) &&
        Objects.equals(this.employment, vacanciesAdditionalVacancyFields.employment) &&
        Objects.equals(this.employmentForm, vacanciesAdditionalVacancyFields.employmentForm) &&
        Objects.equals(this.experience, vacanciesAdditionalVacancyFields.experience) &&
        Objects.equals(this.snippet, vacanciesAdditionalVacancyFields.snippet) &&
        Objects.equals(this.sortPointDistance, vacanciesAdditionalVacancyFields.sortPointDistance);
  }

  @Override
  public int hashCode() {
    return Objects.hash(counters, employment, employmentForm, experience, snippet, sortPointDistance);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class VacanciesAdditionalVacancyFields {\n");
    sb.append("    counters: ").append(toIndentedString(counters)).append("\n");
    sb.append("    employment: ").append(toIndentedString(employment)).append("\n");
    sb.append("    employmentForm: ").append(toIndentedString(employmentForm)).append("\n");
    sb.append("    experience: ").append(toIndentedString(experience)).append("\n");
    sb.append("    snippet: ").append(toIndentedString(snippet)).append("\n");
    sb.append("    sortPointDistance: ").append(toIndentedString(sortPointDistance)).append("\n");
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

