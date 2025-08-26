package ru.brobrocode.cadra.client.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.annotation.Generated;
import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;

import java.math.BigDecimal;
import java.util.Objects;

/**
 * VacanciesActiveVacancyFields
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2025-08-17T15:41:09.394389505+05:00[Asia/Yekaterinburg]", comments = "Generator version: 7.6.0")
public class VacanciesActiveVacancyFields {

  private VacanciesAddress address = null;

  private Boolean canUpgradeBillingType;

  private VacancyCountersForActive counters;

  private String createdAt;

  private String expiresAt;

  private Boolean hasUpdates;

  private VacancyManagerOutput manager;

  private BigDecimal sortPointDistance = null;

  private VacancyVacancyProperties vacancyProperties;

  public VacanciesActiveVacancyFields() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public VacanciesActiveVacancyFields(Boolean canUpgradeBillingType, VacancyCountersForActive counters, String createdAt, String expiresAt, Boolean hasUpdates, VacancyManagerOutput manager) {
    this.canUpgradeBillingType = canUpgradeBillingType;
    this.counters = counters;
    this.createdAt = createdAt;
    this.expiresAt = expiresAt;
    this.hasUpdates = hasUpdates;
    this.manager = manager;
  }

  public VacanciesActiveVacancyFields address(VacanciesAddress address) {
    this.address = address;
    return this;
  }

  /**
   * Get address
   * @return address
  */
  @Valid 
  @Schema(name = "address", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("address")
  public VacanciesAddress getAddress() {
    return address;
  }

  public void setAddress(VacanciesAddress address) {
    this.address = address;
  }

  public VacanciesActiveVacancyFields canUpgradeBillingType(Boolean canUpgradeBillingType) {
    this.canUpgradeBillingType = canUpgradeBillingType;
    return this;
  }

  /**
   * Можно ли улучшить биллинговый тип вакансии
   * @return canUpgradeBillingType
  */
  @NotNull 
  @Schema(name = "can_upgrade_billing_type", description = "Можно ли улучшить биллинговый тип вакансии", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("can_upgrade_billing_type")
  public Boolean getCanUpgradeBillingType() {
    return canUpgradeBillingType;
  }

  public void setCanUpgradeBillingType(Boolean canUpgradeBillingType) {
    this.canUpgradeBillingType = canUpgradeBillingType;
  }

  public VacanciesActiveVacancyFields counters(VacancyCountersForActive counters) {
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
  public VacancyCountersForActive getCounters() {
    return counters;
  }

  public void setCounters(VacancyCountersForActive counters) {
    this.counters = counters;
  }

  public VacanciesActiveVacancyFields createdAt(String createdAt) {
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

  public VacanciesActiveVacancyFields expiresAt(String expiresAt) {
    this.expiresAt = expiresAt;
    return this;
  }

  /**
   * Дата и время окончания публикации вакансии
   * @return expiresAt
  */
  @NotNull 
  @Schema(name = "expires_at", description = "Дата и время окончания публикации вакансии", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("expires_at")
  public String getExpiresAt() {
    return expiresAt;
  }

  public void setExpiresAt(String expiresAt) {
    this.expiresAt = expiresAt;
  }

  public VacanciesActiveVacancyFields hasUpdates(Boolean hasUpdates) {
    this.hasUpdates = hasUpdates;
    return this;
  }

  /**
   * Есть ли в откликах/приглашениях по данной вакансии обновления, требующие внимания
   * @return hasUpdates
  */
  @NotNull 
  @Schema(name = "has_updates", description = "Есть ли в откликах/приглашениях по данной вакансии обновления, требующие внимания", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("has_updates")
  public Boolean getHasUpdates() {
    return hasUpdates;
  }

  public void setHasUpdates(Boolean hasUpdates) {
    this.hasUpdates = hasUpdates;
  }

  public VacanciesActiveVacancyFields manager(VacancyManagerOutput manager) {
    this.manager = manager;
    return this;
  }

  /**
   * Get manager
   * @return manager
  */
  @NotNull @Valid 
  @Schema(name = "manager", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("manager")
  public VacancyManagerOutput getManager() {
    return manager;
  }

  public void setManager(VacancyManagerOutput manager) {
    this.manager = manager;
  }

  public VacanciesActiveVacancyFields sortPointDistance(BigDecimal sortPointDistance) {
    this.sortPointDistance = sortPointDistance;
    return this;
  }

  /**
   * Расстояние в метрах между центром сортировки (заданной параметрами `sort_point_lat`, `sort_point_lng`) и указанным в вакансии адресом. В случае, если в адресе указаны только станции метро, выдается расстояние между центром сортировки и средней геометрической точкой указанных станций. Значение `sort_point_distance` выдается только в случае, если заданы параметры `sort_point_lat`, `sort_point_lng`, `order_by=distance` 
   * @return sortPointDistance
  */
  @Valid 
  @Schema(name = "sort_point_distance", description = "Расстояние в метрах между центром сортировки (заданной параметрами `sort_point_lat`, `sort_point_lng`) и указанным в вакансии адресом. В случае, если в адресе указаны только станции метро, выдается расстояние между центром сортировки и средней геометрической точкой указанных станций. Значение `sort_point_distance` выдается только в случае, если заданы параметры `sort_point_lat`, `sort_point_lng`, `order_by=distance` ", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("sort_point_distance")
  public BigDecimal getSortPointDistance() {
    return sortPointDistance;
  }

  public void setSortPointDistance(BigDecimal sortPointDistance) {
    this.sortPointDistance = sortPointDistance;
  }

  public VacanciesActiveVacancyFields vacancyProperties(VacancyVacancyProperties vacancyProperties) {
    this.vacancyProperties = vacancyProperties;
    return this;
  }

  /**
   * Get vacancyProperties
   * @return vacancyProperties
  */
  @Valid 
  @Schema(name = "vacancy_properties", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
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
    VacanciesActiveVacancyFields vacanciesActiveVacancyFields = (VacanciesActiveVacancyFields) o;
    return Objects.equals(this.address, vacanciesActiveVacancyFields.address) &&
        Objects.equals(this.canUpgradeBillingType, vacanciesActiveVacancyFields.canUpgradeBillingType) &&
        Objects.equals(this.counters, vacanciesActiveVacancyFields.counters) &&
        Objects.equals(this.createdAt, vacanciesActiveVacancyFields.createdAt) &&
        Objects.equals(this.expiresAt, vacanciesActiveVacancyFields.expiresAt) &&
        Objects.equals(this.hasUpdates, vacanciesActiveVacancyFields.hasUpdates) &&
        Objects.equals(this.manager, vacanciesActiveVacancyFields.manager) &&
        Objects.equals(this.sortPointDistance, vacanciesActiveVacancyFields.sortPointDistance) &&
        Objects.equals(this.vacancyProperties, vacanciesActiveVacancyFields.vacancyProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(address, canUpgradeBillingType, counters, createdAt, expiresAt, hasUpdates, manager, sortPointDistance, vacancyProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class VacanciesActiveVacancyFields {\n");
    sb.append("    address: ").append(toIndentedString(address)).append("\n");
    sb.append("    canUpgradeBillingType: ").append(toIndentedString(canUpgradeBillingType)).append("\n");
    sb.append("    counters: ").append(toIndentedString(counters)).append("\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    expiresAt: ").append(toIndentedString(expiresAt)).append("\n");
    sb.append("    hasUpdates: ").append(toIndentedString(hasUpdates)).append("\n");
    sb.append("    manager: ").append(toIndentedString(manager)).append("\n");
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

