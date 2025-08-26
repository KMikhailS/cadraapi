package ru.brobrocode.cadra.client.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.annotation.Generated;
import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * EmployerManagerTypesEmployerManagerTypesItem
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2025-08-17T15:41:09.394389505+05:00[Asia/Yekaterinburg]", comments = "Generator version: 7.6.0")
public class EmployerManagerTypesEmployerManagerTypesItem {

  @Valid
  private List<@Valid EmployerManagerTypesAvailablePermissions> availablePermissions = new ArrayList<>();

  private String id;

  private String name;

  public EmployerManagerTypesEmployerManagerTypesItem() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public EmployerManagerTypesEmployerManagerTypesItem(List<@Valid EmployerManagerTypesAvailablePermissions> availablePermissions, String id, String name) {
    this.availablePermissions = availablePermissions;
    this.id = id;
    this.name = name;
  }

  public EmployerManagerTypesEmployerManagerTypesItem availablePermissions(List<@Valid EmployerManagerTypesAvailablePermissions> availablePermissions) {
    this.availablePermissions = availablePermissions;
    return this;
  }

  public EmployerManagerTypesEmployerManagerTypesItem addAvailablePermissionsItem(EmployerManagerTypesAvailablePermissions availablePermissionsItem) {
    if (this.availablePermissions == null) {
      this.availablePermissions = new ArrayList<>();
    }
    this.availablePermissions.add(availablePermissionsItem);
    return this;
  }

  /**
   * Список прав, которые можно дать данному типу менеджера
   * @return availablePermissions
  */
  @NotNull @Valid 
  @Schema(name = "available_permissions", description = "Список прав, которые можно дать данному типу менеджера", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("available_permissions")
  public List<@Valid EmployerManagerTypesAvailablePermissions> getAvailablePermissions() {
    return availablePermissions;
  }

  public void setAvailablePermissions(List<@Valid EmployerManagerTypesAvailablePermissions> availablePermissions) {
    this.availablePermissions = availablePermissions;
  }

  public EmployerManagerTypesEmployerManagerTypesItem id(String id) {
    this.id = id;
    return this;
  }

  /**
   * Идентификатор типа менеджера
   * @return id
  */
  @NotNull 
  @Schema(name = "id", description = "Идентификатор типа менеджера", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("id")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public EmployerManagerTypesEmployerManagerTypesItem name(String name) {
    this.name = name;
    return this;
  }

  /**
   * Название типа менеджера
   * @return name
  */
  @NotNull 
  @Schema(name = "name", description = "Название типа менеджера", requiredMode = Schema.RequiredMode.REQUIRED)
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
    EmployerManagerTypesEmployerManagerTypesItem employerManagerTypesEmployerManagerTypesItem = (EmployerManagerTypesEmployerManagerTypesItem) o;
    return Objects.equals(this.availablePermissions, employerManagerTypesEmployerManagerTypesItem.availablePermissions) &&
        Objects.equals(this.id, employerManagerTypesEmployerManagerTypesItem.id) &&
        Objects.equals(this.name, employerManagerTypesEmployerManagerTypesItem.name);
  }

  @Override
  public int hashCode() {
    return Objects.hash(availablePermissions, id, name);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EmployerManagerTypesEmployerManagerTypesItem {\n");
    sb.append("    availablePermissions: ").append(toIndentedString(availablePermissions)).append("\n");
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

