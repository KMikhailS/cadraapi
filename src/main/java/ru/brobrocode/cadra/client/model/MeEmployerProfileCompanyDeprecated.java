package ru.brobrocode.cadra.client.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.annotation.Generated;
import jakarta.validation.constraints.NotNull;

import java.util.Objects;

/**
 * Информация о компании работодателя
 */

@Schema(name = "MeEmployerProfileCompanyDeprecated", description = "Информация о компании работодателя")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2025-08-17T15:41:09.394389505+05:00[Asia/Yekaterinburg]", comments = "Generator version: 7.6.0")
public class MeEmployerProfileCompanyDeprecated {

  private String id;

  private String name;

  @Deprecated
  private String managerId;

  public MeEmployerProfileCompanyDeprecated() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public MeEmployerProfileCompanyDeprecated(String id, String name, String managerId) {
    this.id = id;
    this.name = name;
    this.managerId = managerId;
  }

  public MeEmployerProfileCompanyDeprecated id(String id) {
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

  public MeEmployerProfileCompanyDeprecated name(String name) {
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

  public MeEmployerProfileCompanyDeprecated managerId(String managerId) {
    this.managerId = managerId;
    return this;
  }

  /**
   * Идентификатор менеджера
   * @return managerId
   * @deprecated
  */
  @NotNull 
  @Schema(name = "manager_id", example = "4062820", description = "Идентификатор менеджера", deprecated = true, requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("manager_id")
  @Deprecated
  public String getManagerId() {
    return managerId;
  }

  /**
   * @deprecated
  */
  @Deprecated
  public void setManagerId(String managerId) {
    this.managerId = managerId;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MeEmployerProfileCompanyDeprecated meEmployerProfileCompanyDeprecated = (MeEmployerProfileCompanyDeprecated) o;
    return Objects.equals(this.id, meEmployerProfileCompanyDeprecated.id) &&
        Objects.equals(this.name, meEmployerProfileCompanyDeprecated.name) &&
        Objects.equals(this.managerId, meEmployerProfileCompanyDeprecated.managerId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, managerId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MeEmployerProfileCompanyDeprecated {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    managerId: ").append(toIndentedString(managerId)).append("\n");
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

