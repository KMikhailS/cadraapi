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
 * Поля, передаваемые в запросе на создание вакансии
 */

@Schema(name = "VacancyCreateFields", description = "Поля, передаваемые в запросе на создание вакансии")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2025-08-17T15:41:09.394389505+05:00[Asia/Yekaterinburg]", comments = "Generator version: 7.6.0")
public class VacancyCreateFields {

  private VacancyArea area;

  private VacancyBillingType billingType;

  private String description;

  @Valid
  private List<@Valid VacancyDriverLicenceTypeItem> driverLicenseTypes = new ArrayList<>();

  private VacancyManager manager = null;

  private String name;

  private String previousId = null;

  private VacancyType type;

  public VacancyCreateFields() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public VacancyCreateFields(VacancyArea area, VacancyBillingType billingType, String description, String name, VacancyType type) {
    this.area = area;
    this.billingType = billingType;
    this.description = description;
    this.name = name;
    this.type = type;
  }

  public VacancyCreateFields area(VacancyArea area) {
    this.area = area;
    return this;
  }

  /**
   * Get area
   * @return area
  */
  @NotNull @Valid 
  @Schema(name = "area", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("area")
  public VacancyArea getArea() {
    return area;
  }

  public void setArea(VacancyArea area) {
    this.area = area;
  }

  public VacancyCreateFields billingType(VacancyBillingType billingType) {
    this.billingType = billingType;
    return this;
  }

  /**
   * Get billingType
   * @return billingType
  */
  @NotNull @Valid 
  @Schema(name = "billing_type", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("billing_type")
  public VacancyBillingType getBillingType() {
    return billingType;
  }

  public void setBillingType(VacancyBillingType billingType) {
    this.billingType = billingType;
  }

  public VacancyCreateFields description(String description) {
    this.description = description;
    return this;
  }

  /**
   * Описание в html, не менее 200 символов
   * @return description
  */
  @NotNull 
  @Schema(name = "description", description = "Описание в html, не менее 200 символов", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("description")
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public VacancyCreateFields driverLicenseTypes(List<@Valid VacancyDriverLicenceTypeItem> driverLicenseTypes) {
    this.driverLicenseTypes = driverLicenseTypes;
    return this;
  }

  public VacancyCreateFields addDriverLicenseTypesItem(VacancyDriverLicenceTypeItem driverLicenseTypesItem) {
    if (this.driverLicenseTypes == null) {
      this.driverLicenseTypes = new ArrayList<>();
    }
    this.driverLicenseTypes.add(driverLicenseTypesItem);
    return this;
  }

  /**
   * Список требуемых категорий водительских прав
   * @return driverLicenseTypes
  */
  @Valid 
  @Schema(name = "driver_license_types", description = "Список требуемых категорий водительских прав", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("driver_license_types")
  public List<@Valid VacancyDriverLicenceTypeItem> getDriverLicenseTypes() {
    return driverLicenseTypes;
  }

  public void setDriverLicenseTypes(List<@Valid VacancyDriverLicenceTypeItem> driverLicenseTypes) {
    this.driverLicenseTypes = driverLicenseTypes;
  }

  public VacancyCreateFields manager(VacancyManager manager) {
    this.manager = manager;
    return this;
  }

  /**
   * Get manager
   * @return manager
  */
  @Valid 
  @Schema(name = "manager", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("manager")
  public VacancyManager getManager() {
    return manager;
  }

  public void setManager(VacancyManager manager) {
    this.manager = manager;
  }

  public VacancyCreateFields name(String name) {
    this.name = name;
    return this;
  }

  /**
   * Название
   * @return name
  */
  @NotNull 
  @Schema(name = "name", description = "Название", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("name")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public VacancyCreateFields previousId(String previousId) {
    this.previousId = previousId;
    return this;
  }

  /**
   * Если этот параметр передан, то у новой вакансии дополнительно будет создана связь с предыдущей вакансией (поле previous_id). Этот параметр не влияет на другие и не связан с ними, их всё равно необходимо передавать.  Должен быть равен только ID архивной вакансии. ID архивной вакансии можно получить, запросив [список архивных вакансий](#tag/Upravlenie-vakansiyami/operation/get-archived-vacancies) <a name='previous_id'></a> 
   * @return previousId
  */
  
  @Schema(name = "previous_id", description = "Если этот параметр передан, то у новой вакансии дополнительно будет создана связь с предыдущей вакансией (поле previous_id). Этот параметр не влияет на другие и не связан с ними, их всё равно необходимо передавать.  Должен быть равен только ID архивной вакансии. ID архивной вакансии можно получить, запросив [список архивных вакансий](#tag/Upravlenie-vakansiyami/operation/get-archived-vacancies) <a name='previous_id'></a> ", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("previous_id")
  public String getPreviousId() {
    return previousId;
  }

  public void setPreviousId(String previousId) {
    this.previousId = previousId;
  }

  public VacancyCreateFields type(VacancyType type) {
    this.type = type;
    return this;
  }

  /**
   * Get type
   * @return type
  */
  @NotNull @Valid 
  @Schema(name = "type", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("type")
  public VacancyType getType() {
    return type;
  }

  public void setType(VacancyType type) {
    this.type = type;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    VacancyCreateFields vacancyCreateFields = (VacancyCreateFields) o;
    return Objects.equals(this.area, vacancyCreateFields.area) &&
        Objects.equals(this.billingType, vacancyCreateFields.billingType) &&
        Objects.equals(this.description, vacancyCreateFields.description) &&
        Objects.equals(this.driverLicenseTypes, vacancyCreateFields.driverLicenseTypes) &&
        Objects.equals(this.manager, vacancyCreateFields.manager) &&
        Objects.equals(this.name, vacancyCreateFields.name) &&
        Objects.equals(this.previousId, vacancyCreateFields.previousId) &&
        Objects.equals(this.type, vacancyCreateFields.type);
  }

  @Override
  public int hashCode() {
    return Objects.hash(area, billingType, description, driverLicenseTypes, manager, name, previousId, type);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class VacancyCreateFields {\n");
    sb.append("    area: ").append(toIndentedString(area)).append("\n");
    sb.append("    billingType: ").append(toIndentedString(billingType)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    driverLicenseTypes: ").append(toIndentedString(driverLicenseTypes)).append("\n");
    sb.append("    manager: ").append(toIndentedString(manager)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    previousId: ").append(toIndentedString(previousId)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
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

