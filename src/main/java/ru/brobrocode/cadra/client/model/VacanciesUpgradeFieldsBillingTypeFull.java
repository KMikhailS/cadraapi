package ru.brobrocode.cadra.client.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.annotation.Generated;
import jakarta.validation.constraints.NotNull;

import java.util.Objects;

/**
 * VacanciesUpgradeFieldsBillingTypeFull
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2025-08-17T15:41:09.394389505+05:00[Asia/Yekaterinburg]", comments = "Generator version: 7.6.0")
public class VacanciesUpgradeFieldsBillingTypeFull {

  private String id;

  private String name;

  private String description;

  public VacanciesUpgradeFieldsBillingTypeFull() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public VacanciesUpgradeFieldsBillingTypeFull(String id) {
    this.id = id;
  }

  public VacanciesUpgradeFieldsBillingTypeFull id(String id) {
    this.id = id;
    return this;
  }

  /**
   * Биллинговый тип [из справочника vacancy_billing_type](#tag/Obshie-spravochniki/operation/get-dictionaries)
   * @return id
  */
  @NotNull 
  @Schema(name = "id", description = "Биллинговый тип [из справочника vacancy_billing_type](#tag/Obshie-spravochniki/operation/get-dictionaries)", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("id")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public VacanciesUpgradeFieldsBillingTypeFull name(String name) {
    this.name = name;
    return this;
  }

  /**
   * Название биллингового типа вакансии
   * @return name
  */
  
  @Schema(name = "name", description = "Название биллингового типа вакансии", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("name")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public VacanciesUpgradeFieldsBillingTypeFull description(String description) {
    this.description = description;
    return this;
  }

  /**
   * Описание типа вакансии
   * @return description
  */
  
  @Schema(name = "description", description = "Описание типа вакансии", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("description")
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    VacanciesUpgradeFieldsBillingTypeFull vacanciesUpgradeFieldsBillingTypeFull = (VacanciesUpgradeFieldsBillingTypeFull) o;
    return Objects.equals(this.id, vacanciesUpgradeFieldsBillingTypeFull.id) &&
        Objects.equals(this.name, vacanciesUpgradeFieldsBillingTypeFull.name) &&
        Objects.equals(this.description, vacanciesUpgradeFieldsBillingTypeFull.description);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, description);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class VacanciesUpgradeFieldsBillingTypeFull {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
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

