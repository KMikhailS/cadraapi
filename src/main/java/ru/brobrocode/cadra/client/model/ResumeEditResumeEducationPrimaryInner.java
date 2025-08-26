package ru.brobrocode.cadra.client.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.annotation.Generated;
import jakarta.validation.constraints.NotNull;

import java.util.Objects;

/**
 * ResumeEditResumeEducationPrimaryInner
 */

@JsonTypeName("ResumeEditResume_education_primary_inner")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2025-08-17T15:41:09.394389505+05:00[Asia/Yekaterinburg]", comments = "Generator version: 7.6.0")
public class ResumeEditResumeEducationPrimaryInner {

  private String name;

  private String nameId;

  private String organization;

  private String organizationId;

  private String result;

  private String resultId;

  private Integer year;

  public ResumeEditResumeEducationPrimaryInner() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public ResumeEditResumeEducationPrimaryInner(String name, Integer year) {
    this.name = name;
    this.year = year;
  }

  public ResumeEditResumeEducationPrimaryInner name(String name) {
    this.name = name;
    return this;
  }

  /**
   * Название учебного заведения
   * @return name
  */
  @NotNull 
  @Schema(name = "name", description = "Название учебного заведения", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("name")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public ResumeEditResumeEducationPrimaryInner nameId(String nameId) {
    this.nameId = nameId;
    return this;
  }

  /**
   * Идентификатор учебного заведения, можно получить из [подсказок по названиям вузов](#tag/Podskazki/operation/get-educational-institutions-suggests) 
   * @return nameId
  */
  
  @Schema(name = "name_id", description = "Идентификатор учебного заведения, можно получить из [подсказок по названиям вузов](#tag/Podskazki/operation/get-educational-institutions-suggests) ", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("name_id")
  public String getNameId() {
    return nameId;
  }

  public void setNameId(String nameId) {
    this.nameId = nameId;
  }

  public ResumeEditResumeEducationPrimaryInner organization(String organization) {
    this.organization = organization;
    return this;
  }

  /**
   * Факультет
   * @return organization
  */
  
  @Schema(name = "organization", description = "Факультет", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("organization")
  public String getOrganization() {
    return organization;
  }

  public void setOrganization(String organization) {
    this.organization = organization;
  }

  public ResumeEditResumeEducationPrimaryInner organizationId(String organizationId) {
    this.organizationId = organizationId;
    return this;
  }

  /**
   * Идентификатор факультета, можно получить из [справочника факультетов](#tag/Obshie-spravochniki/operation/get-faculties)
   * @return organizationId
  */
  
  @Schema(name = "organization_id", description = "Идентификатор факультета, можно получить из [справочника факультетов](#tag/Obshie-spravochniki/operation/get-faculties)", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("organization_id")
  public String getOrganizationId() {
    return organizationId;
  }

  public void setOrganizationId(String organizationId) {
    this.organizationId = organizationId;
  }

  public ResumeEditResumeEducationPrimaryInner result(String result) {
    this.result = result;
    return this;
  }

  /**
   * Специальность / специализация
   * @return result
  */
  
  @Schema(name = "result", description = "Специальность / специализация", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("result")
  public String getResult() {
    return result;
  }

  public void setResult(String result) {
    this.result = result;
  }

  public ResumeEditResumeEducationPrimaryInner resultId(String resultId) {
    this.resultId = resultId;
    return this;
  }

  /**
   * Идентификатор специальности / специализации, можно получить из [подсказок по специализациям](#tag/Podskazki/operation/get-fields-of-study-suggestions)
   * @return resultId
  */
  
  @Schema(name = "result_id", description = "Идентификатор специальности / специализации, можно получить из [подсказок по специализациям](#tag/Podskazki/operation/get-fields-of-study-suggestions)", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("result_id")
  public String getResultId() {
    return resultId;
  }

  public void setResultId(String resultId) {
    this.resultId = resultId;
  }

  public ResumeEditResumeEducationPrimaryInner year(Integer year) {
    this.year = year;
    return this;
  }

  /**
   * Год окончания
   * @return year
  */
  @NotNull 
  @Schema(name = "year", description = "Год окончания", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("year")
  public Integer getYear() {
    return year;
  }

  public void setYear(Integer year) {
    this.year = year;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ResumeEditResumeEducationPrimaryInner resumeEditResumeEducationPrimaryInner = (ResumeEditResumeEducationPrimaryInner) o;
    return Objects.equals(this.name, resumeEditResumeEducationPrimaryInner.name) &&
        Objects.equals(this.nameId, resumeEditResumeEducationPrimaryInner.nameId) &&
        Objects.equals(this.organization, resumeEditResumeEducationPrimaryInner.organization) &&
        Objects.equals(this.organizationId, resumeEditResumeEducationPrimaryInner.organizationId) &&
        Objects.equals(this.result, resumeEditResumeEducationPrimaryInner.result) &&
        Objects.equals(this.resultId, resumeEditResumeEducationPrimaryInner.resultId) &&
        Objects.equals(this.year, resumeEditResumeEducationPrimaryInner.year);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, nameId, organization, organizationId, result, resultId, year);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ResumeEditResumeEducationPrimaryInner {\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    nameId: ").append(toIndentedString(nameId)).append("\n");
    sb.append("    organization: ").append(toIndentedString(organization)).append("\n");
    sb.append("    organizationId: ").append(toIndentedString(organizationId)).append("\n");
    sb.append("    result: ").append(toIndentedString(result)).append("\n");
    sb.append("    resultId: ").append(toIndentedString(resultId)).append("\n");
    sb.append("    year: ").append(toIndentedString(year)).append("\n");
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

