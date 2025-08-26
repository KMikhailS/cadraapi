package ru.brobrocode.cadra.client.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.annotation.Generated;

import java.util.Objects;

/**
 * VacancyProfessionalRoleItem
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2025-08-17T15:41:09.394389505+05:00[Asia/Yekaterinburg]", comments = "Generator version: 7.6.0")
public class VacancyProfessionalRoleItem {

  private String id;

  public VacancyProfessionalRoleItem id(String id) {
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

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    VacancyProfessionalRoleItem vacancyProfessionalRoleItem = (VacancyProfessionalRoleItem) o;
    return Objects.equals(this.id, vacancyProfessionalRoleItem.id);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class VacancyProfessionalRoleItem {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
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

