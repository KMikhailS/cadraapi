package ru.brobrocode.cadra.client.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.annotation.Generated;
import jakarta.validation.constraints.NotNull;

import java.util.Objects;

/**
 * Информация о компании, к которой прикреплен рабочий аккаунт менеджера
 */

@Schema(name = "ManagerAccountCompany", description = "Информация о компании, к которой прикреплен рабочий аккаунт менеджера")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2025-08-17T15:41:09.394389505+05:00[Asia/Yekaterinburg]", comments = "Generator version: 7.6.0")
public class ManagerAccountCompany {

  private String id;

  private String name;

  public ManagerAccountCompany() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public ManagerAccountCompany(String id, String name) {
    this.id = id;
    this.name = name;
  }

  public ManagerAccountCompany id(String id) {
    this.id = id;
    return this;
  }

  /**
   * Идентификатор компании
   * @return id
  */
  @NotNull 
  @Schema(name = "id", example = "1455", description = "Идентификатор компании", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("id")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public ManagerAccountCompany name(String name) {
    this.name = name;
    return this;
  }

  /**
   * Название компании
   * @return name
  */
  @NotNull 
  @Schema(name = "name", example = "HeadHunter", description = "Название компании", requiredMode = Schema.RequiredMode.REQUIRED)
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
    ManagerAccountCompany managerAccountCompany = (ManagerAccountCompany) o;
    return Objects.equals(this.id, managerAccountCompany.id) &&
        Objects.equals(this.name, managerAccountCompany.name);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ManagerAccountCompany {\n");
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

