package ru.brobrocode.cadra.client.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.annotation.Generated;
import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;

import java.util.Objects;

/**
 * Поле, передаваемое в запросе при смене биллингового типа вакансии. Биллинговый тип можно только улучшать
 */

@Schema(name = "VacancyEditBillingType", description = "Поле, передаваемое в запросе при смене биллингового типа вакансии. Биллинговый тип можно только улучшать")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2025-08-17T15:41:09.394389505+05:00[Asia/Yekaterinburg]", comments = "Generator version: 7.6.0")
public class VacancyEditBillingType {

  private VacancyBillingType billingType;

  public VacancyEditBillingType() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public VacancyEditBillingType(VacancyBillingType billingType) {
    this.billingType = billingType;
  }

  public VacancyEditBillingType billingType(VacancyBillingType billingType) {
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

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    VacancyEditBillingType vacancyEditBillingType = (VacancyEditBillingType) o;
    return Objects.equals(this.billingType, vacancyEditBillingType.billingType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(billingType);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class VacancyEditBillingType {\n");
    sb.append("    billingType: ").append(toIndentedString(billingType)).append("\n");
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

