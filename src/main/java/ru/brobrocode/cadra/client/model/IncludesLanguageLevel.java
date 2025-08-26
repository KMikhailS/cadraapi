package ru.brobrocode.cadra.client.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.annotation.Generated;
import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;

import java.util.Objects;

/**
 * IncludesLanguageLevel
 */

@JsonTypeName("_IncludesLanguageLevel")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2025-08-17T15:41:09.394389505+05:00[Asia/Yekaterinburg]", comments = "Generator version: 7.6.0")
public class IncludesLanguageLevel {

  private String id;

  private String name;

  private IncludesIdName level;

  public IncludesLanguageLevel() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public IncludesLanguageLevel(String id, String name, IncludesIdName level) {
    this.id = id;
    this.name = name;
    this.level = level;
  }

  public IncludesLanguageLevel id(String id) {
    this.id = id;
    return this;
  }

  /**
   * Идентификатор
   * @return id
  */
  @NotNull 
  @Schema(name = "id", description = "Идентификатор", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("id")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public IncludesLanguageLevel name(String name) {
    this.name = name;
    return this;
  }

  /**
   * Название
   * @return name
  */
  @NotNull 
  @Schema(name = "name", description = "Название", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("name")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public IncludesLanguageLevel level(IncludesIdName level) {
    this.level = level;
    return this;
  }

  /**
   * Уровень владения. Возможные значения элементов приведены в поле `language_level` [справочника полей](#tag/Obshie-spravochniki/operation/get-dictionaries)
   * @return level
  */
  @NotNull @Valid 
  @Schema(name = "level", description = "Уровень владения. Возможные значения элементов приведены в поле `language_level` [справочника полей](#tag/Obshie-spravochniki/operation/get-dictionaries)", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("level")
  public IncludesIdName getLevel() {
    return level;
  }

  public void setLevel(IncludesIdName level) {
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
    IncludesLanguageLevel includesLanguageLevel = (IncludesLanguageLevel) o;
    return Objects.equals(this.id, includesLanguageLevel.id) &&
        Objects.equals(this.name, includesLanguageLevel.name) &&
        Objects.equals(this.level, includesLanguageLevel.level);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, level);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IncludesLanguageLevel {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
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

