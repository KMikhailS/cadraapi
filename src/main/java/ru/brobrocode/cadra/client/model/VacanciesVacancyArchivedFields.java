package ru.brobrocode.cadra.client.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.annotation.Generated;
import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;

import java.math.BigDecimal;
import java.util.Objects;

/**
 * VacanciesVacancyArchivedFields
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2025-08-17T15:41:09.394389505+05:00[Asia/Yekaterinburg]", comments = "Generator version: 7.6.0")
public class VacanciesVacancyArchivedFields {

  private String archivedAt;

  private Boolean closedForApplicants;

  private VacancyCountersForArchivedOrHidden counters;

  private String createdAt;

  private BigDecimal sortPointDistance = null;

  private VacancyVacancyProperties vacancyProperties;

  public VacanciesVacancyArchivedFields() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public VacanciesVacancyArchivedFields(String archivedAt, Boolean closedForApplicants, VacancyCountersForArchivedOrHidden counters, String createdAt, VacancyVacancyProperties vacancyProperties) {
    this.archivedAt = archivedAt;
    this.closedForApplicants = closedForApplicants;
    this.counters = counters;
    this.createdAt = createdAt;
    this.vacancyProperties = vacancyProperties;
  }

  public VacanciesVacancyArchivedFields archivedAt(String archivedAt) {
    this.archivedAt = archivedAt;
    return this;
  }

  /**
   * Дата и время архивации вакансии
   * @return archivedAt
  */
  @NotNull 
  @Schema(name = "archived_at", description = "Дата и время архивации вакансии", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("archived_at")
  public String getArchivedAt() {
    return archivedAt;
  }

  public void setArchivedAt(String archivedAt) {
    this.archivedAt = archivedAt;
  }

  public VacanciesVacancyArchivedFields closedForApplicants(Boolean closedForApplicants) {
    this.closedForApplicants = closedForApplicants;
    return this;
  }

  /**
   * Является ли вакансия скрытой от соискателей
   * @return closedForApplicants
  */
  @NotNull 
  @Schema(name = "closed_for_applicants", description = "Является ли вакансия скрытой от соискателей", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("closed_for_applicants")
  public Boolean getClosedForApplicants() {
    return closedForApplicants;
  }

  public void setClosedForApplicants(Boolean closedForApplicants) {
    this.closedForApplicants = closedForApplicants;
  }

  public VacanciesVacancyArchivedFields counters(VacancyCountersForArchivedOrHidden counters) {
    this.counters = counters;
    return this;
  }

  /**
   * Get counters
   * @return counters
  */
  @NotNull @Valid 
  @Schema(name = "counters", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("counters")
  public VacancyCountersForArchivedOrHidden getCounters() {
    return counters;
  }

  public void setCounters(VacancyCountersForArchivedOrHidden counters) {
    this.counters = counters;
  }

  public VacanciesVacancyArchivedFields createdAt(String createdAt) {
    this.createdAt = createdAt;
    return this;
  }

  /**
   * Дата и время публикации вакансии
   * @return createdAt
  */
  @NotNull 
  @Schema(name = "created_at", description = "Дата и время публикации вакансии", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("created_at")
  public String getCreatedAt() {
    return createdAt;
  }

  public void setCreatedAt(String createdAt) {
    this.createdAt = createdAt;
  }

  public VacanciesVacancyArchivedFields sortPointDistance(BigDecimal sortPointDistance) {
    this.sortPointDistance = sortPointDistance;
    return this;
  }

  /**
   * Расстояние в метрах между центром сортировки (заданной параметрами `sort_point_lat`, `sort_point_lng`) и указанным в вакансии адресом. В случае, если в адресе указаны только станции метро, выдается расстояние между центром сортировки и средней геометрической точкой указанных станций.  Значение `sort_point_distance` выдается только в случае, если заданы параметры `sort_point_lat`, `sort_point_lng`, `order_by=distance` 
   * @return sortPointDistance
  */
  @Valid 
  @Schema(name = "sort_point_distance", description = "Расстояние в метрах между центром сортировки (заданной параметрами `sort_point_lat`, `sort_point_lng`) и указанным в вакансии адресом. В случае, если в адресе указаны только станции метро, выдается расстояние между центром сортировки и средней геометрической точкой указанных станций.  Значение `sort_point_distance` выдается только в случае, если заданы параметры `sort_point_lat`, `sort_point_lng`, `order_by=distance` ", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("sort_point_distance")
  public BigDecimal getSortPointDistance() {
    return sortPointDistance;
  }

  public void setSortPointDistance(BigDecimal sortPointDistance) {
    this.sortPointDistance = sortPointDistance;
  }

  public VacanciesVacancyArchivedFields vacancyProperties(VacancyVacancyProperties vacancyProperties) {
    this.vacancyProperties = vacancyProperties;
    return this;
  }

  /**
   * Get vacancyProperties
   * @return vacancyProperties
  */
  @NotNull @Valid 
  @Schema(name = "vacancy_properties", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("vacancy_properties")
  public VacancyVacancyProperties getVacancyProperties() {
    return vacancyProperties;
  }

  public void setVacancyProperties(VacancyVacancyProperties vacancyProperties) {
    this.vacancyProperties = vacancyProperties;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    VacanciesVacancyArchivedFields vacanciesVacancyArchivedFields = (VacanciesVacancyArchivedFields) o;
    return Objects.equals(this.archivedAt, vacanciesVacancyArchivedFields.archivedAt) &&
        Objects.equals(this.closedForApplicants, vacanciesVacancyArchivedFields.closedForApplicants) &&
        Objects.equals(this.counters, vacanciesVacancyArchivedFields.counters) &&
        Objects.equals(this.createdAt, vacanciesVacancyArchivedFields.createdAt) &&
        Objects.equals(this.sortPointDistance, vacanciesVacancyArchivedFields.sortPointDistance) &&
        Objects.equals(this.vacancyProperties, vacanciesVacancyArchivedFields.vacancyProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(archivedAt, closedForApplicants, counters, createdAt, sortPointDistance, vacancyProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class VacanciesVacancyArchivedFields {\n");
    sb.append("    archivedAt: ").append(toIndentedString(archivedAt)).append("\n");
    sb.append("    closedForApplicants: ").append(toIndentedString(closedForApplicants)).append("\n");
    sb.append("    counters: ").append(toIndentedString(counters)).append("\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    sortPointDistance: ").append(toIndentedString(sortPointDistance)).append("\n");
    sb.append("    vacancyProperties: ").append(toIndentedString(vacancyProperties)).append("\n");
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

