package ru.brobrocode.cadra.client.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.annotation.Generated;
import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * VacanciesAvailableVacancyTypeItem
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2025-08-17T15:41:09.394389505+05:00[Asia/Yekaterinburg]", comments = "Generator version: 7.6.0")
public class VacanciesAvailableVacancyTypeItem {

  private BigDecimal availablePublicationsCount;

  private String description;

  private String name;

  @Valid
  private List<@Valid VacancyPublication> publications = new ArrayList<>();

  private VacanciesAvailableVacancyTypeItemVacancyBillingType vacancyBillingType;

  @Valid
  private List<@Valid VacancyType> vacancyTypes = new ArrayList<>();

  public VacanciesAvailableVacancyTypeItem() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public VacanciesAvailableVacancyTypeItem(BigDecimal availablePublicationsCount, String description, String name, List<@Valid VacancyPublication> publications, VacanciesAvailableVacancyTypeItemVacancyBillingType vacancyBillingType, List<@Valid VacancyType> vacancyTypes) {
    this.availablePublicationsCount = availablePublicationsCount;
    this.description = description;
    this.name = name;
    this.publications = publications;
    this.vacancyBillingType = vacancyBillingType;
    this.vacancyTypes = vacancyTypes;
  }

  public VacanciesAvailableVacancyTypeItem availablePublicationsCount(BigDecimal availablePublicationsCount) {
    this.availablePublicationsCount = availablePublicationsCount;
    return this;
  }

  /**
   * Общее количество публикаций, доступных данному менеджеру
   * @return availablePublicationsCount
  */
  @NotNull @Valid 
  @Schema(name = "available_publications_count", description = "Общее количество публикаций, доступных данному менеджеру", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("available_publications_count")
  public BigDecimal getAvailablePublicationsCount() {
    return availablePublicationsCount;
  }

  public void setAvailablePublicationsCount(BigDecimal availablePublicationsCount) {
    this.availablePublicationsCount = availablePublicationsCount;
  }

  public VacanciesAvailableVacancyTypeItem description(String description) {
    this.description = description;
    return this;
  }

  /**
   * Описание типа публикации
   * @return description
  */
  @NotNull 
  @Schema(name = "description", description = "Описание типа публикации", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("description")
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public VacanciesAvailableVacancyTypeItem name(String name) {
    this.name = name;
    return this;
  }

  /**
   * Название типа публикации
   * @return name
  */
  @NotNull 
  @Schema(name = "name", description = "Название типа публикации", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("name")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public VacanciesAvailableVacancyTypeItem publications(List<@Valid VacancyPublication> publications) {
    this.publications = publications;
    return this;
  }

  public VacanciesAvailableVacancyTypeItem addPublicationsItem(VacancyPublication publicationsItem) {
    if (this.publications == null) {
      this.publications = new ArrayList<>();
    }
    this.publications.add(publicationsItem);
    return this;
  }

  /**
   * Список регионов, где может быть опубликована вакансия и количество публикаций, доступных работодателю
   * @return publications
  */
  @NotNull @Valid 
  @Schema(name = "publications", description = "Список регионов, где может быть опубликована вакансия и количество публикаций, доступных работодателю", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("publications")
  public List<@Valid VacancyPublication> getPublications() {
    return publications;
  }

  public void setPublications(List<@Valid VacancyPublication> publications) {
    this.publications = publications;
  }

  public VacanciesAvailableVacancyTypeItem vacancyBillingType(VacanciesAvailableVacancyTypeItemVacancyBillingType vacancyBillingType) {
    this.vacancyBillingType = vacancyBillingType;
    return this;
  }

  /**
   * Get vacancyBillingType
   * @return vacancyBillingType
  */
  @NotNull @Valid 
  @Schema(name = "vacancy_billing_type", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("vacancy_billing_type")
  public VacanciesAvailableVacancyTypeItemVacancyBillingType getVacancyBillingType() {
    return vacancyBillingType;
  }

  public void setVacancyBillingType(VacanciesAvailableVacancyTypeItemVacancyBillingType vacancyBillingType) {
    this.vacancyBillingType = vacancyBillingType;
  }

  public VacanciesAvailableVacancyTypeItem vacancyTypes(List<@Valid VacancyType> vacancyTypes) {
    this.vacancyTypes = vacancyTypes;
    return this;
  }

  public VacanciesAvailableVacancyTypeItem addVacancyTypesItem(VacancyType vacancyTypesItem) {
    if (this.vacancyTypes == null) {
      this.vacancyTypes = new ArrayList<>();
    }
    this.vacancyTypes.add(vacancyTypesItem);
    return this;
  }

  /**
   * Список типов вакансии
   * @return vacancyTypes
  */
  @NotNull @Valid 
  @Schema(name = "vacancy_types", description = "Список типов вакансии", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("vacancy_types")
  public List<@Valid VacancyType> getVacancyTypes() {
    return vacancyTypes;
  }

  public void setVacancyTypes(List<@Valid VacancyType> vacancyTypes) {
    this.vacancyTypes = vacancyTypes;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    VacanciesAvailableVacancyTypeItem vacanciesAvailableVacancyTypeItem = (VacanciesAvailableVacancyTypeItem) o;
    return Objects.equals(this.availablePublicationsCount, vacanciesAvailableVacancyTypeItem.availablePublicationsCount) &&
        Objects.equals(this.description, vacanciesAvailableVacancyTypeItem.description) &&
        Objects.equals(this.name, vacanciesAvailableVacancyTypeItem.name) &&
        Objects.equals(this.publications, vacanciesAvailableVacancyTypeItem.publications) &&
        Objects.equals(this.vacancyBillingType, vacanciesAvailableVacancyTypeItem.vacancyBillingType) &&
        Objects.equals(this.vacancyTypes, vacanciesAvailableVacancyTypeItem.vacancyTypes);
  }

  @Override
  public int hashCode() {
    return Objects.hash(availablePublicationsCount, description, name, publications, vacancyBillingType, vacancyTypes);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class VacanciesAvailableVacancyTypeItem {\n");
    sb.append("    availablePublicationsCount: ").append(toIndentedString(availablePublicationsCount)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    publications: ").append(toIndentedString(publications)).append("\n");
    sb.append("    vacancyBillingType: ").append(toIndentedString(vacancyBillingType)).append("\n");
    sb.append("    vacancyTypes: ").append(toIndentedString(vacancyTypes)).append("\n");
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

