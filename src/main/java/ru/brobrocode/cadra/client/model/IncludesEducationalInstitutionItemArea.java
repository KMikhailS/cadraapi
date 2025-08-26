package ru.brobrocode.cadra.client.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.annotation.Generated;
import jakarta.validation.constraints.NotNull;

import java.util.Objects;

/**
 * Регион
 */

@Schema(name = "_IncludesEducationalInstitutionItem_area", description = "Регион")
@JsonTypeName("_IncludesEducationalInstitutionItem_area")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2025-08-17T15:41:09.394389505+05:00[Asia/Yekaterinburg]", comments = "Generator version: 7.6.0")
public class IncludesEducationalInstitutionItemArea {

  private String id;

  private String name;

  public IncludesEducationalInstitutionItemArea() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public IncludesEducationalInstitutionItemArea(String id, String name) {
    this.id = id;
    this.name = name;
  }

  public IncludesEducationalInstitutionItemArea id(String id) {
    this.id = id;
    return this;
  }

  /**
   * Идентификатор региона
   * @return id
  */
  @NotNull 
  @Schema(name = "id", description = "Идентификатор региона", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("id")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public IncludesEducationalInstitutionItemArea name(String name) {
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
    IncludesEducationalInstitutionItemArea includesEducationalInstitutionItemArea = (IncludesEducationalInstitutionItemArea) o;
    return Objects.equals(this.id, includesEducationalInstitutionItemArea.id) &&
        Objects.equals(this.name, includesEducationalInstitutionItemArea.name);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IncludesEducationalInstitutionItemArea {\n");
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

