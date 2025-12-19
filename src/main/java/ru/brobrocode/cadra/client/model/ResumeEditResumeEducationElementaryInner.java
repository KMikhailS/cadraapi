package ru.brobrocode.cadra.client.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.annotation.Generated;
import jakarta.validation.constraints.NotNull;

import java.util.Objects;

/**
 * ResumeEditResumeEducationElementaryInner
 */

@JsonTypeName("ResumeEditResume_education_elementary_inner")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2025-08-17T15:41:09.394389505+05:00[Asia/Yekaterinburg]", comments = "Generator version: 7.6.0")
public class ResumeEditResumeEducationElementaryInner {

  private String name;

  private Integer year;

  public ResumeEditResumeEducationElementaryInner() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public ResumeEditResumeEducationElementaryInner(String name, Integer year) {
    this.name = name;
    this.year = year;
  }

  public ResumeEditResumeEducationElementaryInner name(String name) {
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

  public ResumeEditResumeEducationElementaryInner year(Integer year) {
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
    ResumeEditResumeEducationElementaryInner resumeEditResumeEducationElementaryInner = (ResumeEditResumeEducationElementaryInner) o;
    return Objects.equals(this.name, resumeEditResumeEducationElementaryInner.name) &&
        Objects.equals(this.year, resumeEditResumeEducationElementaryInner.year);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, year);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ResumeEditResumeEducationElementaryInner {\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
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

