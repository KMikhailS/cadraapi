package ru.brobrocode.cadra.client.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.annotation.Generated;

import java.util.Objects;

/**
 * VacancyProfessionalRoleItemOutput
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2025-08-17T15:41:09.394389505+05:00[Asia/Yekaterinburg]", comments = "Generator version: 7.6.0")
public class VacancyProfessionalRoleItemOutput {

  private String id;

  private String name;

  public VacancyProfessionalRoleItemOutput id(String id) {
    this.id = id;
    return this;
  }

  /**
   * Идентификатор профессиональной роли. Элемент справочника [professional_roles](#tag/Obshie-spravochniki/operation/get-professional-roles-dictionary)
   * @return id
  */
  
  @Schema(name = "id", description = "Идентификатор профессиональной роли. Элемент справочника [professional_roles](#tag/Obshie-spravochniki/operation/get-professional-roles-dictionary)", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("id")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public VacancyProfessionalRoleItemOutput name(String name) {
    this.name = name;
    return this;
  }

  /**
   * Название профессиональной роли
   * @return name
  */
  
  @Schema(name = "name", description = "Название профессиональной роли", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
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
    VacancyProfessionalRoleItemOutput vacancyProfessionalRoleItemOutput = (VacancyProfessionalRoleItemOutput) o;
    return Objects.equals(this.id, vacancyProfessionalRoleItemOutput.id) &&
        Objects.equals(this.name, vacancyProfessionalRoleItemOutput.name);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class VacancyProfessionalRoleItemOutput {\n");
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

