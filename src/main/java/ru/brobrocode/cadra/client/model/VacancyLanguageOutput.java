package ru.brobrocode.cadra.client.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.annotation.Generated;
import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;

import java.util.Objects;

/**
 * VacancyLanguageOutput
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2025-08-17T15:41:09.394389505+05:00[Asia/Yekaterinburg]", comments = "Generator version: 7.6.0")
public class VacancyLanguageOutput {

  private String id;

  private VacancyLanguageOutputAllOfLevel level;

  private String name;

  public VacancyLanguageOutput() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public VacancyLanguageOutput(String id, VacancyLanguageOutputAllOfLevel level, String name) {
    this.id = id;
    this.level = level;
    this.name = name;
  }

  public VacancyLanguageOutput id(String id) {
    this.id = id;
    return this;
  }

  /**
   * Идентификатор языка. Значения из справочника [/languages](#tag/Obshie-spravochniki/operation/get-dictionaries)
   * @return id
  */
  @NotNull 
  @Schema(name = "id", description = "Идентификатор языка. Значения из справочника [/languages](#tag/Obshie-spravochniki/operation/get-dictionaries)", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("id")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public VacancyLanguageOutput level(VacancyLanguageOutputAllOfLevel level) {
    this.level = level;
    return this;
  }

  /**
   * Get level
   * @return level
  */
  @NotNull @Valid 
  @Schema(name = "level", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("level")
  public VacancyLanguageOutputAllOfLevel getLevel() {
    return level;
  }

  public void setLevel(VacancyLanguageOutputAllOfLevel level) {
    this.level = level;
  }

  public VacancyLanguageOutput name(String name) {
    this.name = name;
    return this;
  }

  /**
   * Название языка
   * @return name
  */
  @NotNull 
  @Schema(name = "name", description = "Название языка", requiredMode = Schema.RequiredMode.REQUIRED)
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
    VacancyLanguageOutput vacancyLanguageOutput = (VacancyLanguageOutput) o;
    return Objects.equals(this.id, vacancyLanguageOutput.id) &&
        Objects.equals(this.level, vacancyLanguageOutput.level) &&
        Objects.equals(this.name, vacancyLanguageOutput.name);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, level, name);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class VacancyLanguageOutput {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    level: ").append(toIndentedString(level)).append("\n");
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

