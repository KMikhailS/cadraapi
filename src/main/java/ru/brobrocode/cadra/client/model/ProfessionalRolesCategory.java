package ru.brobrocode.cadra.client.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.annotation.Generated;
import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * ProfessionalRolesCategory
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2025-08-17T15:41:09.394389505+05:00[Asia/Yekaterinburg]", comments = "Generator version: 7.6.0")
public class ProfessionalRolesCategory {

  private String id;

  private String name = null;

  @Valid
  private List<@Valid ProfessionalRolesRole> roles = new ArrayList<>();

  public ProfessionalRolesCategory() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public ProfessionalRolesCategory(String id, String name, List<@Valid ProfessionalRolesRole> roles) {
    this.id = id;
    this.name = name;
    this.roles = roles;
  }

  public ProfessionalRolesCategory id(String id) {
    this.id = id;
    return this;
  }

  /**
   * Идентификатор категории профессиональной роли
   * @return id
  */
  @NotNull @Size(min = 1) 
  @Schema(name = "id", example = "123", description = "Идентификатор категории профессиональной роли", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("id")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public ProfessionalRolesCategory name(String name) {
    this.name = name;
    return this;
  }

  /**
   * Имя категории профессиональной роли
   * @return name
  */
  @NotNull @Size(min = 1) 
  @Schema(name = "name", example = "Строительство, недвижимость", description = "Имя категории профессиональной роли", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("name")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public ProfessionalRolesCategory roles(List<@Valid ProfessionalRolesRole> roles) {
    this.roles = roles;
    return this;
  }

  public ProfessionalRolesCategory addRolesItem(ProfessionalRolesRole rolesItem) {
    if (this.roles == null) {
      this.roles = new ArrayList<>();
    }
    this.roles.add(rolesItem);
    return this;
  }

  /**
   * Список профессиональных ролей, входящих в эту категорию 
   * @return roles
  */
  @NotNull @Valid @Size(min = 1) 
  @Schema(name = "roles", description = "Список профессиональных ролей, входящих в эту категорию ", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("roles")
  public List<@Valid ProfessionalRolesRole> getRoles() {
    return roles;
  }

  public void setRoles(List<@Valid ProfessionalRolesRole> roles) {
    this.roles = roles;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ProfessionalRolesCategory professionalRolesCategory = (ProfessionalRolesCategory) o;
    return Objects.equals(this.id, professionalRolesCategory.id) &&
        Objects.equals(this.name, professionalRolesCategory.name) &&
        Objects.equals(this.roles, professionalRolesCategory.roles);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, roles);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ProfessionalRolesCategory {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    roles: ").append(toIndentedString(roles)).append("\n");
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

