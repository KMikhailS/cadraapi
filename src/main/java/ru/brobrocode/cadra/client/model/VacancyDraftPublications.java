package ru.brobrocode.cadra.client.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.annotation.Generated;
import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;

import java.math.BigDecimal;
import java.util.Objects;

/**
 * VacancyDraftPublications
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2025-08-17T15:41:09.394389505+05:00[Asia/Yekaterinburg]", comments = "Generator version: 7.6.0")
public class VacancyDraftPublications {

  private VacancyBillingTypeOutput billingType = null;

  private BigDecimal count;

  @Deprecated
  private String publicationType;

  private String vacancyType;

  public VacancyDraftPublications() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public VacancyDraftPublications(VacancyBillingTypeOutput billingType, BigDecimal count, String publicationType, String vacancyType) {
    this.billingType = billingType;
    this.count = count;
    this.publicationType = publicationType;
    this.vacancyType = vacancyType;
  }

  public VacancyDraftPublications billingType(VacancyBillingTypeOutput billingType) {
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
  public VacancyBillingTypeOutput getBillingType() {
    return billingType;
  }

  public void setBillingType(VacancyBillingTypeOutput billingType) {
    this.billingType = billingType;
  }

  public VacancyDraftPublications count(BigDecimal count) {
    this.count = count;
    return this;
  }

  /**
   * Количество публикаций
   * @return count
  */
  @NotNull @Valid 
  @Schema(name = "count", description = "Количество публикаций", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("count")
  public BigDecimal getCount() {
    return count;
  }

  public void setCount(BigDecimal count) {
    this.count = count;
  }

  public VacancyDraftPublications publicationType(String publicationType) {
    this.publicationType = publicationType;
    return this;
  }

  /**
   * Тип публикации (справочник [vacancy_billing_type](#tag/Obshie-spravochniki/operation/get-dictionaries))
   * @return publicationType
   * @deprecated
  */
  @NotNull 
  @Schema(name = "publication_type", description = "Тип публикации (справочник [vacancy_billing_type](#tag/Obshie-spravochniki/operation/get-dictionaries))", deprecated = true, requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("publication_type")
  @Deprecated
  public String getPublicationType() {
    return publicationType;
  }

  /**
   * @deprecated
  */
  @Deprecated
  public void setPublicationType(String publicationType) {
    this.publicationType = publicationType;
  }

  public VacancyDraftPublications vacancyType(String vacancyType) {
    this.vacancyType = vacancyType;
    return this;
  }

  /**
   * Тип вакансии (справочник [vacancy_type](#tag/Obshie-spravochniki/operation/get-dictionaries))
   * @return vacancyType
  */
  @NotNull 
  @Schema(name = "vacancy_type", description = "Тип вакансии (справочник [vacancy_type](#tag/Obshie-spravochniki/operation/get-dictionaries))", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("vacancy_type")
  public String getVacancyType() {
    return vacancyType;
  }

  public void setVacancyType(String vacancyType) {
    this.vacancyType = vacancyType;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    VacancyDraftPublications vacancyDraftPublications = (VacancyDraftPublications) o;
    return Objects.equals(this.billingType, vacancyDraftPublications.billingType) &&
        Objects.equals(this.count, vacancyDraftPublications.count) &&
        Objects.equals(this.publicationType, vacancyDraftPublications.publicationType) &&
        Objects.equals(this.vacancyType, vacancyDraftPublications.vacancyType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(billingType, count, publicationType, vacancyType);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class VacancyDraftPublications {\n");
    sb.append("    billingType: ").append(toIndentedString(billingType)).append("\n");
    sb.append("    count: ").append(toIndentedString(count)).append("\n");
    sb.append("    publicationType: ").append(toIndentedString(publicationType)).append("\n");
    sb.append("    vacancyType: ").append(toIndentedString(vacancyType)).append("\n");
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

