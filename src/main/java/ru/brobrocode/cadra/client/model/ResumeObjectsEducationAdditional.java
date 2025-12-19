package ru.brobrocode.cadra.client.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.annotation.Generated;
import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;

import java.math.BigDecimal;
import java.util.Objects;

/**
 * ResumeObjectsEducationAdditional
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2025-08-17T15:41:09.394389505+05:00[Asia/Yekaterinburg]", comments = "Generator version: 7.6.0")
public class ResumeObjectsEducationAdditional {

  private String id = null;

  private String name;

  private String organization;

  private String result = null;

  private BigDecimal year;

  public ResumeObjectsEducationAdditional() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public ResumeObjectsEducationAdditional(String name, BigDecimal year) {
    this.name = name;
    this.year = year;
  }

  public ResumeObjectsEducationAdditional id(String id) {
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

  public ResumeObjectsEducationAdditional name(String name) {
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

  public ResumeObjectsEducationAdditional organization(String organization) {
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

  public ResumeObjectsEducationAdditional result(String result) {
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

  public ResumeObjectsEducationAdditional year(BigDecimal year) {
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
    ResumeObjectsEducationAdditional resumeObjectsEducationAdditional = (ResumeObjectsEducationAdditional) o;
    return Objects.equals(this.id, resumeObjectsEducationAdditional.id) &&
        Objects.equals(this.name, resumeObjectsEducationAdditional.name) &&
        Objects.equals(this.organization, resumeObjectsEducationAdditional.organization) &&
        Objects.equals(this.result, resumeObjectsEducationAdditional.result) &&
        Objects.equals(this.year, resumeObjectsEducationAdditional.year);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, organization, result, year);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ResumeObjectsEducationAdditional {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
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

