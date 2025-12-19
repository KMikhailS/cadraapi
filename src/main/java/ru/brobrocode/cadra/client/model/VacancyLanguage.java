package ru.brobrocode.cadra.client.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.annotation.Generated;
import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;

import java.util.Objects;

/**
 * VacancyLanguage
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2025-08-17T15:41:09.394389505+05:00[Asia/Yekaterinburg]", comments = "Generator version: 7.6.0")
public class VacancyLanguage {

  private String id;

  private VacancyLanguageLevel level;

  public VacancyLanguage() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public VacancyLanguage(String id, VacancyLanguageLevel level) {
    this.id = id;
    this.level = level;
  }

  public VacancyLanguage id(String id) {
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

  public VacancyLanguage level(VacancyLanguageLevel level) {
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
  public VacancyLanguageLevel getLevel() {
    return level;
  }

  public void setLevel(VacancyLanguageLevel level) {
    this.level = level;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    VacancyLanguage vacancyLanguage = (VacancyLanguage) o;
    return Objects.equals(this.id, vacancyLanguage.id) &&
        Objects.equals(this.level, vacancyLanguage.level);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, level);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class VacancyLanguage {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    level: ").append(toIndentedString(level)).append("\n");
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

