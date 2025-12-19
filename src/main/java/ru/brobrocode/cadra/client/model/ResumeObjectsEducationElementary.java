package ru.brobrocode.cadra.client.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.annotation.Generated;
import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;

import java.math.BigDecimal;
import java.util.Objects;

/**
 * ResumeObjectsEducationElementary
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2025-08-17T15:41:09.394389505+05:00[Asia/Yekaterinburg]", comments = "Generator version: 7.6.0")
public class ResumeObjectsEducationElementary {

  private String id = null;

  private String name;

  private BigDecimal year;

  public ResumeObjectsEducationElementary() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public ResumeObjectsEducationElementary(String name, BigDecimal year) {
    this.name = name;
    this.year = year;
  }

  public ResumeObjectsEducationElementary id(String id) {
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

  public ResumeObjectsEducationElementary name(String name) {
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

  public ResumeObjectsEducationElementary year(BigDecimal year) {
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
    ResumeObjectsEducationElementary resumeObjectsEducationElementary = (ResumeObjectsEducationElementary) o;
    return Objects.equals(this.id, resumeObjectsEducationElementary.id) &&
        Objects.equals(this.name, resumeObjectsEducationElementary.name) &&
        Objects.equals(this.year, resumeObjectsEducationElementary.year);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, year);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ResumeObjectsEducationElementary {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
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

