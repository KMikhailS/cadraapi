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
 * ProfileFieldsEducationAdditional
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2025-08-17T15:41:09.394389505+05:00[Asia/Yekaterinburg]", comments = "Generator version: 7.6.0")
public class ProfileFieldsEducationAdditional {

  private String id = null;

  private String name;

  private String organization;

  private String result = null;

  @Valid
  private List<@Valid ProfileFieldsEducationResumesItem> resumes = new ArrayList<>();

  private BigDecimal year;

  public ProfileFieldsEducationAdditional() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public ProfileFieldsEducationAdditional(String name, List<@Valid ProfileFieldsEducationResumesItem> resumes, BigDecimal year) {
    this.name = name;
    this.resumes = resumes;
    this.year = year;
  }

  public ProfileFieldsEducationAdditional id(String id) {
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

  public ProfileFieldsEducationAdditional name(String name) {
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

  public ProfileFieldsEducationAdditional organization(String organization) {
    this.organization = organization;
    return this;
  }

  /**
   * Организация, проводившая курс / тест
   * @return organization
  */
  
  @Schema(name = "organization", description = "Организация, проводившая курс / тест", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("organization")
  public String getOrganization() {
    return organization;
  }

  public void setOrganization(String organization) {
    this.organization = organization;
  }

  public ProfileFieldsEducationAdditional result(String result) {
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

  public ProfileFieldsEducationAdditional resumes(List<@Valid ProfileFieldsEducationResumesItem> resumes) {
    this.resumes = resumes;
    return this;
  }

  public ProfileFieldsEducationAdditional addResumesItem(ProfileFieldsEducationResumesItem resumesItem) {
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

  public ProfileFieldsEducationAdditional year(BigDecimal year) {
    this.year = year;
    return this;
  }

  /**
   * Год окончания / сдачи
   * @return year
  */
  @NotNull @Valid 
  @Schema(name = "year", description = "Год окончания / сдачи", requiredMode = Schema.RequiredMode.REQUIRED)
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
    ProfileFieldsEducationAdditional profileFieldsEducationAdditional = (ProfileFieldsEducationAdditional) o;
    return Objects.equals(this.id, profileFieldsEducationAdditional.id) &&
        Objects.equals(this.name, profileFieldsEducationAdditional.name) &&
        Objects.equals(this.organization, profileFieldsEducationAdditional.organization) &&
        Objects.equals(this.result, profileFieldsEducationAdditional.result) &&
        Objects.equals(this.resumes, profileFieldsEducationAdditional.resumes) &&
        Objects.equals(this.year, profileFieldsEducationAdditional.year);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, organization, result, resumes, year);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ProfileFieldsEducationAdditional {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    organization: ").append(toIndentedString(organization)).append("\n");
    sb.append("    result: ").append(toIndentedString(result)).append("\n");
    sb.append("    resumes: ").append(toIndentedString(resumes)).append("\n");
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

