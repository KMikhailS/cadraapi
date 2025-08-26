package ru.brobrocode.cadra.client.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.annotation.Generated;
import jakarta.validation.constraints.NotNull;

import java.util.Objects;

/**
 * VacancyAreaOutput
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2025-08-17T15:41:09.394389505+05:00[Asia/Yekaterinburg]", comments = "Generator version: 7.6.0")
public class VacancyAreaOutput {

  private String id;

  private String name;

  public VacancyAreaOutput() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public VacancyAreaOutput(String id, String name) {
    this.id = id;
    this.name = name;
  }

  public VacancyAreaOutput id(String id) {
    this.id = id;
    return this;
  }

  /**
   * Идентификатор региона из [справочника](#tag/Obshie-spravochniki/operation/get-areas)
   * @return id
  */
  @NotNull 
  @Schema(name = "id", description = "Идентификатор региона из [справочника](#tag/Obshie-spravochniki/operation/get-areas)", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("id")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public VacancyAreaOutput name(String name) {
    this.name = name;
    return this;
  }

  /**
   * Название региона
   * @return name
  */
  @NotNull 
  @Schema(name = "name", description = "Название региона", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("name")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    VacancyAreaOutput vacancyAreaOutput = (VacancyAreaOutput) o;
    return Objects.equals(this.id, vacancyAreaOutput.id) &&
        Objects.equals(this.name, vacancyAreaOutput.name);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class VacancyAreaOutput {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
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

