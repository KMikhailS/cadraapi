package ru.brobrocode.cadra.client.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.annotation.Generated;
import jakarta.validation.constraints.NotNull;

import java.util.Objects;

/**
 * SuggestsSpecializationsWithName
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2025-08-17T15:41:09.394389505+05:00[Asia/Yekaterinburg]", comments = "Generator version: 7.6.0")
public class SuggestsSpecializationsWithName {

  private String id;

  private String name;

  private String profareaId;

  private String profareaName;

  public SuggestsSpecializationsWithName() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public SuggestsSpecializationsWithName(String id, String name, String profareaId, String profareaName) {
    this.id = id;
    this.name = name;
    this.profareaId = profareaId;
    this.profareaName = profareaName;
  }

  public SuggestsSpecializationsWithName id(String id) {
    this.id = id;
    return this;
  }

  /**
   * Идентификатор специализации
   * @return id
  */
  @NotNull 
  @Schema(name = "id", example = "21.17", description = "Идентификатор специализации", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("id")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public SuggestsSpecializationsWithName name(String name) {
    this.name = name;
    return this;
  }

  /**
   * Название специализации
   * @return name
  */
  @NotNull 
  @Schema(name = "name", example = "Автоперевозки", description = "Название специализации", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("name")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public SuggestsSpecializationsWithName profareaId(String profareaId) {
    this.profareaId = profareaId;
    return this;
  }

  /**
   * Идентификатор профессиональной области
   * @return profareaId
  */
  @NotNull 
  @Schema(name = "profarea_id", example = "21", description = "Идентификатор профессиональной области", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("profarea_id")
  public String getProfareaId() {
    return profareaId;
  }

  public void setProfareaId(String profareaId) {
    this.profareaId = profareaId;
  }

  public SuggestsSpecializationsWithName profareaName(String profareaName) {
    this.profareaName = profareaName;
    return this;
  }

  /**
   * Название профессиональной области
   * @return profareaName
  */
  @NotNull 
  @Schema(name = "profarea_name", example = "Транспорт, логистика", description = "Название профессиональной области", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("profarea_name")
  public String getProfareaName() {
    return profareaName;
  }

  public void setProfareaName(String profareaName) {
    this.profareaName = profareaName;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SuggestsSpecializationsWithName suggestsSpecializationsWithName = (SuggestsSpecializationsWithName) o;
    return Objects.equals(this.id, suggestsSpecializationsWithName.id) &&
        Objects.equals(this.name, suggestsSpecializationsWithName.name) &&
        Objects.equals(this.profareaId, suggestsSpecializationsWithName.profareaId) &&
        Objects.equals(this.profareaName, suggestsSpecializationsWithName.profareaName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, profareaId, profareaName);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SuggestsSpecializationsWithName {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    profareaId: ").append(toIndentedString(profareaId)).append("\n");
    sb.append("    profareaName: ").append(toIndentedString(profareaName)).append("\n");
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

