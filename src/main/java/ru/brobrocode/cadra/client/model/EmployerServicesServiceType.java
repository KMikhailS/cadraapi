package ru.brobrocode.cadra.client.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.annotation.Generated;
import jakarta.validation.constraints.NotNull;

import java.util.Objects;

/**
 * EmployerServicesServiceType
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2025-08-17T15:41:09.394389505+05:00[Asia/Yekaterinburg]", comments = "Generator version: 7.6.0")
public class EmployerServicesServiceType {

  private String id;

  private String name;

  public EmployerServicesServiceType() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public EmployerServicesServiceType(String id, String name) {
    this.id = id;
    this.name = name;
  }

  public EmployerServicesServiceType id(String id) {
    this.id = id;
    return this;
  }

  /**
   * Идентификатор типа услуги
   * @return id
  */
  @NotNull 
  @Schema(name = "id", description = "Идентификатор типа услуги", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("id")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public EmployerServicesServiceType name(String name) {
    this.name = name;
    return this;
  }

  /**
   * Локализованное название типа услуги
   * @return name
  */
  @NotNull 
  @Schema(name = "name", description = "Локализованное название типа услуги", requiredMode = Schema.RequiredMode.REQUIRED)
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
    EmployerServicesServiceType employerServicesServiceType = (EmployerServicesServiceType) o;
    return Objects.equals(this.id, employerServicesServiceType.id) &&
        Objects.equals(this.name, employerServicesServiceType.name);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EmployerServicesServiceType {\n");
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

