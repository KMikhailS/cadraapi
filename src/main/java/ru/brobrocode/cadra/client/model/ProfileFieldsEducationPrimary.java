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
 * ProfileFieldsEducationPrimary
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2025-08-17T15:41:09.394389505+05:00[Asia/Yekaterinburg]", comments = "Generator version: 7.6.0")
public class ProfileFieldsEducationPrimary {

  private IncludesIdName educationLevel = null;

  private String id = null;

  private String name;

  private String nameId = null;

  private String organization = null;

  private String organizationId = null;

  private String result = null;

  private String resultId = null;

  @Valid
  private List<@Valid ProfileFieldsEducationResumesItem> resumes = new ArrayList<>();

  private String universityAcronym = null;

  private BigDecimal year;

  public ProfileFieldsEducationPrimary() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public ProfileFieldsEducationPrimary(String name, List<@Valid ProfileFieldsEducationResumesItem> resumes, BigDecimal year) {
    this.name = name;
    this.resumes = resumes;
    this.year = year;
  }

  public ProfileFieldsEducationPrimary educationLevel(IncludesIdName educationLevel) {
    this.educationLevel = educationLevel;
    return this;
  }

  /**
   * Get educationLevel
   * @return educationLevel
  */
  @Valid 
  @Schema(name = "education_level", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("education_level")
  public IncludesIdName getEducationLevel() {
    return educationLevel;
  }

  public void setEducationLevel(IncludesIdName educationLevel) {
    this.educationLevel = educationLevel;
  }

  public ProfileFieldsEducationPrimary id(String id) {
    this.id = id;
    return this;
  }

  /**
   * Идентификатор
   * @return id
  */
  
  @Schema(name = "id", description = "Идентификатор", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("id")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public ProfileFieldsEducationPrimary name(String name) {
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

  public ProfileFieldsEducationPrimary nameId(String nameId) {
    this.nameId = nameId;
    return this;
  }

  /**
   * Идентификатор учебного заведения
   * @return nameId
  */
  
  @Schema(name = "name_id", description = "Идентификатор учебного заведения", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("name_id")
  public String getNameId() {
    return nameId;
  }

  public void setNameId(String nameId) {
    this.nameId = nameId;
  }

  public ProfileFieldsEducationPrimary organization(String organization) {
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

  public ProfileFieldsEducationPrimary organizationId(String organizationId) {
    this.organizationId = organizationId;
    return this;
  }

  /**
   * Идентификатор факультета
   * @return organizationId
  */
  
  @Schema(name = "organization_id", description = "Идентификатор факультета", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("organization_id")
  public String getOrganizationId() {
    return organizationId;
  }

  public void setOrganizationId(String organizationId) {
    this.organizationId = organizationId;
  }

  public ProfileFieldsEducationPrimary result(String result) {
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

  public ProfileFieldsEducationPrimary resultId(String resultId) {
    this.resultId = resultId;
    return this;
  }

  /**
   * Идентификатор специальности / специализации
   * @return resultId
  */
  
  @Schema(name = "result_id", description = "Идентификатор специальности / специализации", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("result_id")
  public String getResultId() {
    return resultId;
  }

  public void setResultId(String resultId) {
    this.resultId = resultId;
  }

  public ProfileFieldsEducationPrimary resumes(List<@Valid ProfileFieldsEducationResumesItem> resumes) {
    this.resumes = resumes;
    return this;
  }

  public ProfileFieldsEducationPrimary addResumesItem(ProfileFieldsEducationResumesItem resumesItem) {
    if (this.resumes == null) {
      this.resumes = new ArrayList<>();
    }
    this.resumes.add(resumesItem);
    return this;
  }

  /**
   * Список резюме соискателя где используется образование
   * @return resumes
  */
  @NotNull @Valid 
  @Schema(name = "resumes", description = "Список резюме соискателя где используется образование", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("resumes")
  public List<@Valid ProfileFieldsEducationResumesItem> getResumes() {
    return resumes;
  }

  public void setResumes(List<@Valid ProfileFieldsEducationResumesItem> resumes) {
    this.resumes = resumes;
  }

  public ProfileFieldsEducationPrimary universityAcronym(String universityAcronym) {
    this.universityAcronym = universityAcronym;
    return this;
  }

  /**
   * Акроним учебного заведения
   * @return universityAcronym
  */
  
  @Schema(name = "university_acronym", description = "Акроним учебного заведения", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("university_acronym")
  public String getUniversityAcronym() {
    return universityAcronym;
  }

  public void setUniversityAcronym(String universityAcronym) {
    this.universityAcronym = universityAcronym;
  }

  public ProfileFieldsEducationPrimary year(BigDecimal year) {
    this.year = year;
    return this;
  }

  /**
   * Год окончания
   * @return year
  */
  @NotNull @Valid 
  @Schema(name = "year", description = "Год окончания", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("year")
  public BigDecimal getYear() {
    return year;
  }

  public void setYear(BigDecimal year) {
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
    ProfileFieldsEducationPrimary profileFieldsEducationPrimary = (ProfileFieldsEducationPrimary) o;
    return Objects.equals(this.educationLevel, profileFieldsEducationPrimary.educationLevel) &&
        Objects.equals(this.id, profileFieldsEducationPrimary.id) &&
        Objects.equals(this.name, profileFieldsEducationPrimary.name) &&
        Objects.equals(this.nameId, profileFieldsEducationPrimary.nameId) &&
        Objects.equals(this.organization, profileFieldsEducationPrimary.organization) &&
        Objects.equals(this.organizationId, profileFieldsEducationPrimary.organizationId) &&
        Objects.equals(this.result, profileFieldsEducationPrimary.result) &&
        Objects.equals(this.resultId, profileFieldsEducationPrimary.resultId) &&
        Objects.equals(this.resumes, profileFieldsEducationPrimary.resumes) &&
        Objects.equals(this.universityAcronym, profileFieldsEducationPrimary.universityAcronym) &&
        Objects.equals(this.year, profileFieldsEducationPrimary.year);
  }

  @Override
  public int hashCode() {
    return Objects.hash(educationLevel, id, name, nameId, organization, organizationId, result, resultId, resumes, universityAcronym, year);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ProfileFieldsEducationPrimary {\n");
    sb.append("    educationLevel: ").append(toIndentedString(educationLevel)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    nameId: ").append(toIndentedString(nameId)).append("\n");
    sb.append("    organization: ").append(toIndentedString(organization)).append("\n");
    sb.append("    organizationId: ").append(toIndentedString(organizationId)).append("\n");
    sb.append("    result: ").append(toIndentedString(result)).append("\n");
    sb.append("    resultId: ").append(toIndentedString(resultId)).append("\n");
    sb.append("    resumes: ").append(toIndentedString(resumes)).append("\n");
    sb.append("    universityAcronym: ").append(toIndentedString(universityAcronym)).append("\n");
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

