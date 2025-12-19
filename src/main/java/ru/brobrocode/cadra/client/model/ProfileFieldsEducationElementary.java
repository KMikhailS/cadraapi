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
 * ProfileFieldsEducationElementary
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2025-08-17T15:41:09.394389505+05:00[Asia/Yekaterinburg]", comments = "Generator version: 7.6.0")
public class ProfileFieldsEducationElementary {

  private String id = null;

  private String name;

  @Valid
  private List<@Valid ProfileFieldsEducationResumesItem> resumes = new ArrayList<>();

  private BigDecimal year;

  public ProfileFieldsEducationElementary() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public ProfileFieldsEducationElementary(String name, List<@Valid ProfileFieldsEducationResumesItem> resumes, BigDecimal year) {
    this.name = name;
    this.resumes = resumes;
    this.year = year;
  }

  public ProfileFieldsEducationElementary id(String id) {
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

  public ProfileFieldsEducationElementary name(String name) {
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

  public ProfileFieldsEducationElementary resumes(List<@Valid ProfileFieldsEducationResumesItem> resumes) {
    this.resumes = resumes;
    return this;
  }

  public ProfileFieldsEducationElementary addResumesItem(ProfileFieldsEducationResumesItem resumesItem) {
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

  public ProfileFieldsEducationElementary year(BigDecimal year) {
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
    ProfileFieldsEducationElementary profileFieldsEducationElementary = (ProfileFieldsEducationElementary) o;
    return Objects.equals(this.id, profileFieldsEducationElementary.id) &&
        Objects.equals(this.name, profileFieldsEducationElementary.name) &&
        Objects.equals(this.resumes, profileFieldsEducationElementary.resumes) &&
        Objects.equals(this.year, profileFieldsEducationElementary.year);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, resumes, year);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ProfileFieldsEducationElementary {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
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

