package ru.brobrocode.cadra.client.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.annotation.Generated;
import jakarta.validation.Valid;

import java.util.Objects;

/**
 * VacancyDraftVacancyDraftTypeBillingType
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2025-08-17T15:41:09.394389505+05:00[Asia/Yekaterinburg]", comments = "Generator version: 7.6.0")
public class VacancyDraftVacancyDraftTypeBillingType {

  private VacancyDraftBillingType billingType = null;

  private VacancyDraftType type = null;

  public VacancyDraftVacancyDraftTypeBillingType billingType(VacancyDraftBillingType billingType) {
    this.billingType = billingType;
    return this;
  }

  /**
   * Get billingType
   * @return billingType
  */
  @Valid 
  @Schema(name = "billing_type", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("billing_type")
  public VacancyDraftBillingType getBillingType() {
    return billingType;
  }

  public void setBillingType(VacancyDraftBillingType billingType) {
    this.billingType = billingType;
  }

  public VacancyDraftVacancyDraftTypeBillingType type(VacancyDraftType type) {
    this.type = type;
    return this;
  }

  /**
   * Get type
   * @return type
  */
  @Valid 
  @Schema(name = "type", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("type")
  public VacancyDraftType getType() {
    return type;
  }

  public void setType(VacancyDraftType type) {
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
    VacancyDraftVacancyDraftTypeBillingType vacancyDraftVacancyDraftTypeBillingType = (VacancyDraftVacancyDraftTypeBillingType) o;
    return Objects.equals(this.billingType, vacancyDraftVacancyDraftTypeBillingType.billingType) &&
        Objects.equals(this.type, vacancyDraftVacancyDraftTypeBillingType.type);
  }

  @Override
  public int hashCode() {
    return Objects.hash(billingType, type);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class VacancyDraftVacancyDraftTypeBillingType {\n");
    sb.append("    billingType: ").append(toIndentedString(billingType)).append("\n");
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

