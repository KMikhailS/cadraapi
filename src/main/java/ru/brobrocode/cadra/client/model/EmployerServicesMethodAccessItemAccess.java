package ru.brobrocode.cadra.client.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.annotation.Generated;
import jakarta.validation.constraints.NotNull;

import java.util.Objects;

/**
 * Информация о доступе к платному методу
 */

@Schema(name = "EmployerServicesMethodAccessItem_access", description = "Информация о доступе к платному методу")
@JsonTypeName("EmployerServicesMethodAccessItem_access")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2025-08-17T15:41:09.394389505+05:00[Asia/Yekaterinburg]", comments = "Generator version: 7.6.0")
public class EmployerServicesMethodAccessItemAccess {

  private Boolean hasAccess;

  public EmployerServicesMethodAccessItemAccess() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public EmployerServicesMethodAccessItemAccess(Boolean hasAccess) {
    this.hasAccess = hasAccess;
  }

  public EmployerServicesMethodAccessItemAccess hasAccess(Boolean hasAccess) {
    this.hasAccess = hasAccess;
    return this;
  }

  /**
   * Признак наличия доступа к группе методов
   * @return hasAccess
  */
  @NotNull 
  @Schema(name = "has_access", description = "Признак наличия доступа к группе методов", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("has_access")
  public Boolean getHasAccess() {
    return hasAccess;
  }

  public void setHasAccess(Boolean hasAccess) {
    this.hasAccess = hasAccess;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EmployerServicesMethodAccessItemAccess employerServicesMethodAccessItemAccess = (EmployerServicesMethodAccessItemAccess) o;
    return Objects.equals(this.hasAccess, employerServicesMethodAccessItemAccess.hasAccess);
  }

  @Override
  public int hashCode() {
    return Objects.hash(hasAccess);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EmployerServicesMethodAccessItemAccess {\n");
    sb.append("    hasAccess: ").append(toIndentedString(hasAccess)).append("\n");
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

