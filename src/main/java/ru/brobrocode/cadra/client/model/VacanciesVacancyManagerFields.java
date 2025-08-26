package ru.brobrocode.cadra.client.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.annotation.Generated;
import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;

import java.util.Objects;

/**
 * VacanciesVacancyManagerFields
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2025-08-17T15:41:09.394389505+05:00[Asia/Yekaterinburg]", comments = "Generator version: 7.6.0")
public class VacanciesVacancyManagerFields {

  private VacanciesAddress address;

  private String archivedAt;

  private VacancyBrandedTemplate brandedTemplate = null;

  private Boolean canUpgradeBillingType;

  private VacancyCountersOutput counters;

  private String expiresAt;

  private Boolean hidden;

  private VacancyManager manager;

  private Boolean responseNotifications;

  private VacancyVacancyProperties vacancyProperties;

  public VacanciesVacancyManagerFields() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public VacanciesVacancyManagerFields(VacanciesAddress address, VacancyBrandedTemplate brandedTemplate, Boolean canUpgradeBillingType, String expiresAt, Boolean hidden, VacancyManager manager, Boolean responseNotifications) {
    this.address = address;
    this.brandedTemplate = brandedTemplate;
    this.canUpgradeBillingType = canUpgradeBillingType;
    this.expiresAt = expiresAt;
    this.hidden = hidden;
    this.manager = manager;
    this.responseNotifications = responseNotifications;
  }

  public VacanciesVacancyManagerFields address(VacanciesAddress address) {
    this.address = address;
    return this;
  }

  /**
   * Get address
   * @return address
  */
  @NotNull @Valid 
  @Schema(name = "address", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("address")
  public VacanciesAddress getAddress() {
    return address;
  }

  public void setAddress(VacanciesAddress address) {
    this.address = address;
  }

  public VacanciesVacancyManagerFields archivedAt(String archivedAt) {
    this.archivedAt = archivedAt;
    return this;
  }

  /**
   * Дата архивации вакансии
   * @return archivedAt
  */
  
  @Schema(name = "archived_at", description = "Дата архивации вакансии", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("archived_at")
  public String getArchivedAt() {
    return archivedAt;
  }

  public void setArchivedAt(String archivedAt) {
    this.archivedAt = archivedAt;
  }

  public VacanciesVacancyManagerFields brandedTemplate(VacancyBrandedTemplate brandedTemplate) {
    this.brandedTemplate = brandedTemplate;
    return this;
  }

  /**
   * Get brandedTemplate
   * @return brandedTemplate
  */
  @NotNull @Valid 
  @Schema(name = "branded_template", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("branded_template")
  public VacancyBrandedTemplate getBrandedTemplate() {
    return brandedTemplate;
  }

  public void setBrandedTemplate(VacancyBrandedTemplate brandedTemplate) {
    this.brandedTemplate = brandedTemplate;
  }

  public VacanciesVacancyManagerFields canUpgradeBillingType(Boolean canUpgradeBillingType) {
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

  public VacanciesVacancyManagerFields counters(VacancyCountersOutput counters) {
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
  public VacancyCountersOutput getCounters() {
    return counters;
  }

  public void setCounters(VacancyCountersOutput counters) {
    this.counters = counters;
  }

  public VacanciesVacancyManagerFields expiresAt(String expiresAt) {
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

  public VacanciesVacancyManagerFields hidden(Boolean hidden) {
    this.hidden = hidden;
    return this;
  }

  /**
   * Удалена ли вакансия (скрыта из архива)
   * @return hidden
  */
  @NotNull 
  @Schema(name = "hidden", description = "Удалена ли вакансия (скрыта из архива)", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("hidden")
  public Boolean getHidden() {
    return hidden;
  }

  public void setHidden(Boolean hidden) {
    this.hidden = hidden;
  }

  public VacanciesVacancyManagerFields manager(VacancyManager manager) {
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
  public VacancyManager getManager() {
    return manager;
  }

  public void setManager(VacancyManager manager) {
    this.manager = manager;
  }

  public VacanciesVacancyManagerFields responseNotifications(Boolean responseNotifications) {
    this.responseNotifications = responseNotifications;
    return this;
  }

  /**
   * Уведомлять ли менеджера о новых откликах
   * @return responseNotifications
  */
  @NotNull 
  @Schema(name = "response_notifications", description = "Уведомлять ли менеджера о новых откликах", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("response_notifications")
  public Boolean getResponseNotifications() {
    return responseNotifications;
  }

  public void setResponseNotifications(Boolean responseNotifications) {
    this.responseNotifications = responseNotifications;
  }

  public VacanciesVacancyManagerFields vacancyProperties(VacancyVacancyProperties vacancyProperties) {
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
    VacanciesVacancyManagerFields vacanciesVacancyManagerFields = (VacanciesVacancyManagerFields) o;
    return Objects.equals(this.address, vacanciesVacancyManagerFields.address) &&
        Objects.equals(this.archivedAt, vacanciesVacancyManagerFields.archivedAt) &&
        Objects.equals(this.brandedTemplate, vacanciesVacancyManagerFields.brandedTemplate) &&
        Objects.equals(this.canUpgradeBillingType, vacanciesVacancyManagerFields.canUpgradeBillingType) &&
        Objects.equals(this.counters, vacanciesVacancyManagerFields.counters) &&
        Objects.equals(this.expiresAt, vacanciesVacancyManagerFields.expiresAt) &&
        Objects.equals(this.hidden, vacanciesVacancyManagerFields.hidden) &&
        Objects.equals(this.manager, vacanciesVacancyManagerFields.manager) &&
        Objects.equals(this.responseNotifications, vacanciesVacancyManagerFields.responseNotifications) &&
        Objects.equals(this.vacancyProperties, vacanciesVacancyManagerFields.vacancyProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(address, archivedAt, brandedTemplate, canUpgradeBillingType, counters, expiresAt, hidden, manager, responseNotifications, vacancyProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class VacanciesVacancyManagerFields {\n");
    sb.append("    address: ").append(toIndentedString(address)).append("\n");
    sb.append("    archivedAt: ").append(toIndentedString(archivedAt)).append("\n");
    sb.append("    brandedTemplate: ").append(toIndentedString(brandedTemplate)).append("\n");
    sb.append("    canUpgradeBillingType: ").append(toIndentedString(canUpgradeBillingType)).append("\n");
    sb.append("    counters: ").append(toIndentedString(counters)).append("\n");
    sb.append("    expiresAt: ").append(toIndentedString(expiresAt)).append("\n");
    sb.append("    hidden: ").append(toIndentedString(hidden)).append("\n");
    sb.append("    manager: ").append(toIndentedString(manager)).append("\n");
    sb.append("    responseNotifications: ").append(toIndentedString(responseNotifications)).append("\n");
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

