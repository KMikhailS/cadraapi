package ru.brobrocode.cadra.client.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.annotation.Generated;
import jakarta.validation.constraints.NotNull;

import java.util.Objects;

/**
 * ResumeEditResumeEducationAdditionalInner
 */

@JsonTypeName("ResumeEditResume_education_additional_inner")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2025-08-17T15:41:09.394389505+05:00[Asia/Yekaterinburg]", comments = "Generator version: 7.6.0")
public class ResumeEditResumeEducationAdditionalInner {

  private String name;

  private String organization;

  private String result;

  private Integer year;

  public ResumeEditResumeEducationAdditionalInner() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public ResumeEditResumeEducationAdditionalInner(String name, String organization, Integer year) {
    this.name = name;
    this.organization = organization;
    this.year = year;
  }

  public ResumeEditResumeEducationAdditionalInner name(String name) {
    this.name = name;
    return this;
  }

  /**
   * Название курса / теста
   * @return name
  */
  @NotNull 
  @Schema(name = "name", description = "Название курса / теста", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("name")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public ResumeEditResumeEducationAdditionalInner organization(String organization) {
    this.organization = organization;
    return this;
  }

  /**
   * Организация, проводившая курс / тест
   * @return organization
  */
  @NotNull 
  @Schema(name = "organization", description = "Организация, проводившая курс / тест", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("organization")
  public String getOrganization() {
    return organization;
  }

  public void setOrganization(String organization) {
    this.organization = organization;
  }

  public ResumeEditResumeEducationAdditionalInner result(String result) {
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

  public ResumeEditResumeEducationAdditionalInner year(Integer year) {
    this.year = year;
    return this;
  }

  /**
   * Год окончания / сдачи
   * @return year
  */
  @NotNull 
  @Schema(name = "year", description = "Год окончания / сдачи", requiredMode = Schema.RequiredMode.REQUIRED)
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
    ResumeEditResumeEducationAdditionalInner resumeEditResumeEducationAdditionalInner = (ResumeEditResumeEducationAdditionalInner) o;
    return Objects.equals(this.name, resumeEditResumeEducationAdditionalInner.name) &&
        Objects.equals(this.organization, resumeEditResumeEducationAdditionalInner.organization) &&
        Objects.equals(this.result, resumeEditResumeEducationAdditionalInner.result) &&
        Objects.equals(this.year, resumeEditResumeEducationAdditionalInner.year);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, organization, result, year);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ResumeEditResumeEducationAdditionalInner {\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    organization: ").append(toIndentedString(organization)).append("\n");
    sb.append("    result: ").append(toIndentedString(result)).append("\n");
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

