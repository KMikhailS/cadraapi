package ru.brobrocode.cadra.client.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.annotation.Generated;
import jakarta.validation.constraints.NotNull;

import java.util.Objects;

/**
 * SuggestsProfessionalRoleItem
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2025-08-17T15:41:09.394389505+05:00[Asia/Yekaterinburg]", comments = "Generator version: 7.6.0")
public class SuggestsProfessionalRoleItem {

  private Boolean acceptIncompleteResumes;

  private String id;

  private String text;

  public SuggestsProfessionalRoleItem() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public SuggestsProfessionalRoleItem(Boolean acceptIncompleteResumes, String id, String text) {
    this.acceptIncompleteResumes = acceptIncompleteResumes;
    this.id = id;
    this.text = text;
  }

  public SuggestsProfessionalRoleItem acceptIncompleteResumes(Boolean acceptIncompleteResumes) {
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

  public SuggestsProfessionalRoleItem id(String id) {
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

  public SuggestsProfessionalRoleItem text(String text) {
    this.text = text;
    return this;
  }

  /**
   * Название профессиональной роли
   * @return text
  */
  @NotNull 
  @Schema(name = "text", example = "Водитель", description = "Название профессиональной роли", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("text")
  public String getText() {
    return text;
  }

  public void setText(String text) {
    this.text = text;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SuggestsProfessionalRoleItem suggestsProfessionalRoleItem = (SuggestsProfessionalRoleItem) o;
    return Objects.equals(this.acceptIncompleteResumes, suggestsProfessionalRoleItem.acceptIncompleteResumes) &&
        Objects.equals(this.id, suggestsProfessionalRoleItem.id) &&
        Objects.equals(this.text, suggestsProfessionalRoleItem.text);
  }

  @Override
  public int hashCode() {
    return Objects.hash(acceptIncompleteResumes, id, text);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SuggestsProfessionalRoleItem {\n");
    sb.append("    acceptIncompleteResumes: ").append(toIndentedString(acceptIncompleteResumes)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    text: ").append(toIndentedString(text)).append("\n");
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

