package ru.brobrocode.cadra.client.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.annotation.Generated;
import jakarta.validation.constraints.NotNull;

import java.util.Objects;

/**
 * SuggestsProfessionalRoleItemWithName
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2025-08-17T15:41:09.394389505+05:00[Asia/Yekaterinburg]", comments = "Generator version: 7.6.0")
public class SuggestsProfessionalRoleItemWithName {

  private Boolean acceptIncompleteResumes;

  private String id;

  private String name;

  public SuggestsProfessionalRoleItemWithName() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public SuggestsProfessionalRoleItemWithName(Boolean acceptIncompleteResumes, String id, String name) {
    this.acceptIncompleteResumes = acceptIncompleteResumes;
    this.id = id;
    this.name = name;
  }

  public SuggestsProfessionalRoleItemWithName acceptIncompleteResumes(Boolean acceptIncompleteResumes) {
    this.acceptIncompleteResumes = acceptIncompleteResumes;
    return this;
  }

  /**
   * Профессиональная роль, для которой можно принимать отклики неполным резюме
   * @return acceptIncompleteResumes
  */
  @NotNull 
  @Schema(name = "accept_incomplete_resumes", example = "true", description = "Профессиональная роль, для которой можно принимать отклики неполным резюме", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("accept_incomplete_resumes")
  public Boolean getAcceptIncompleteResumes() {
    return acceptIncompleteResumes;
  }

  public void setAcceptIncompleteResumes(Boolean acceptIncompleteResumes) {
    this.acceptIncompleteResumes = acceptIncompleteResumes;
  }

  public SuggestsProfessionalRoleItemWithName id(String id) {
    this.id = id;
    return this;
  }

  /**
   * Идентификатор профессиональной роли
   * @return id
  */
  @NotNull 
  @Schema(name = "id", example = "21", description = "Идентификатор профессиональной роли", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("id")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public SuggestsProfessionalRoleItemWithName name(String name) {
    this.name = name;
    return this;
  }

  /**
   * Название профессиональной роли
   * @return name
  */
  @NotNull 
  @Schema(name = "name", example = "Водитель", description = "Название профессиональной роли", requiredMode = Schema.RequiredMode.REQUIRED)
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
    SuggestsProfessionalRoleItemWithName suggestsProfessionalRoleItemWithName = (SuggestsProfessionalRoleItemWithName) o;
    return Objects.equals(this.acceptIncompleteResumes, suggestsProfessionalRoleItemWithName.acceptIncompleteResumes) &&
        Objects.equals(this.id, suggestsProfessionalRoleItemWithName.id) &&
        Objects.equals(this.name, suggestsProfessionalRoleItemWithName.name);
  }

  @Override
  public int hashCode() {
    return Objects.hash(acceptIncompleteResumes, id, name);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SuggestsProfessionalRoleItemWithName {\n");
    sb.append("    acceptIncompleteResumes: ").append(toIndentedString(acceptIncompleteResumes)).append("\n");
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

