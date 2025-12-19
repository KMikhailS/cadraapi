package ru.brobrocode.cadra.client.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.annotation.Generated;
import jakarta.validation.constraints.NotNull;

import java.util.Objects;

/**
 * VacanciesAvailableVacancyTypeItemVacancyBillingType
 */

@JsonTypeName("VacanciesAvailableVacancyTypeItem_vacancy_billing_type")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2025-08-17T15:41:09.394389505+05:00[Asia/Yekaterinburg]", comments = "Generator version: 7.6.0")
public class VacanciesAvailableVacancyTypeItemVacancyBillingType {

  private String id;

  public VacanciesAvailableVacancyTypeItemVacancyBillingType() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public VacanciesAvailableVacancyTypeItemVacancyBillingType(String id) {
    this.id = id;
  }

  public VacanciesAvailableVacancyTypeItemVacancyBillingType id(String id) {
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

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    VacanciesAvailableVacancyTypeItemVacancyBillingType vacanciesAvailableVacancyTypeItemVacancyBillingType = (VacanciesAvailableVacancyTypeItemVacancyBillingType) o;
    return Objects.equals(this.id, vacanciesAvailableVacancyTypeItemVacancyBillingType.id);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class VacanciesAvailableVacancyTypeItemVacancyBillingType {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
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

