package ru.brobrocode.cadra.client.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.annotation.Generated;
import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;

import java.util.Objects;

/**
 * ResumeEditResumeLanguageInner
 */

@JsonTypeName("ResumeEditResume_language_inner")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2025-08-17T15:41:09.394389505+05:00[Asia/Yekaterinburg]", comments = "Generator version: 7.6.0")
public class ResumeEditResumeLanguageInner {

  private String id;

  private IncludesId level;

  public ResumeEditResumeLanguageInner() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public ResumeEditResumeLanguageInner(String id, IncludesId level) {
    this.id = id;
    this.level = level;
  }

  public ResumeEditResumeLanguageInner id(String id) {
    this.id = id;
    return this;
  }

  /**
   * Идентификатор языка. Элемент справочника [languages](#tag/Obshie-spravochniki/operation/get-languages)
   * @return id
  */
  @NotNull 
  @Schema(name = "id", description = "Идентификатор языка. Элемент справочника [languages](#tag/Obshie-spravochniki/operation/get-languages)", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("id")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public ResumeEditResumeLanguageInner level(IncludesId level) {
    this.level = level;
    return this;
  }

  /**
   * Уровень знания языка. Элемент справочника [language_level](#tag/Obshie-spravochniki/operation/get-dictionaries)
   * @return level
  */
  @NotNull @Valid 
  @Schema(name = "level", description = "Уровень знания языка. Элемент справочника [language_level](#tag/Obshie-spravochniki/operation/get-dictionaries)", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("level")
  public IncludesId getLevel() {
    return level;
  }

  public void setLevel(IncludesId level) {
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
    ResumeEditResumeLanguageInner resumeEditResumeLanguageInner = (ResumeEditResumeLanguageInner) o;
    return Objects.equals(this.id, resumeEditResumeLanguageInner.id) &&
        Objects.equals(this.level, resumeEditResumeLanguageInner.level);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, level);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ResumeEditResumeLanguageInner {\n");
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

