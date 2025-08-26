package ru.brobrocode.cadra.client.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.annotation.Generated;
import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;

import java.util.Objects;

/**
 * EmployerServicesMethodAccessItem
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2025-08-17T15:41:09.394389505+05:00[Asia/Yekaterinburg]", comments = "Generator version: 7.6.0")
public class EmployerServicesMethodAccessItem {

  private EmployerServicesMethodAccessItemAccess access;

  private String description;

  private String id;

  public EmployerServicesMethodAccessItem() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public EmployerServicesMethodAccessItem(EmployerServicesMethodAccessItemAccess access, String description, String id) {
    this.access = access;
    this.description = description;
    this.id = id;
  }

  public EmployerServicesMethodAccessItem access(EmployerServicesMethodAccessItemAccess access) {
    this.access = access;
    return this;
  }

  /**
   * Get access
   * @return access
  */
  @NotNull @Valid 
  @Schema(name = "access", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("access")
  public EmployerServicesMethodAccessItemAccess getAccess() {
    return access;
  }

  public void setAccess(EmployerServicesMethodAccessItemAccess access) {
    this.access = access;
  }

  public EmployerServicesMethodAccessItem description(String description) {
    this.description = description;
    return this;
  }

  /**
   * Описание группы методов
   * @return description
  */
  @NotNull 
  @Schema(name = "description", description = "Описание группы методов", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("description")
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public EmployerServicesMethodAccessItem id(String id) {
    this.id = id;
    return this;
  }

  /**
   * Идентификатор группы методов
   * @return id
  */
  @NotNull 
  @Schema(name = "id", description = "Идентификатор группы методов", requiredMode = Schema.RequiredMode.REQUIRED)
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
    EmployerServicesMethodAccessItem employerServicesMethodAccessItem = (EmployerServicesMethodAccessItem) o;
    return Objects.equals(this.access, employerServicesMethodAccessItem.access) &&
        Objects.equals(this.description, employerServicesMethodAccessItem.description) &&
        Objects.equals(this.id, employerServicesMethodAccessItem.id);
  }

  @Override
  public int hashCode() {
    return Objects.hash(access, description, id);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EmployerServicesMethodAccessItem {\n");
    sb.append("    access: ").append(toIndentedString(access)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
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

