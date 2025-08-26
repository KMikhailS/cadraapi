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
 * SuggestsVacancyPositionItem
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2025-08-17T15:41:09.394389505+05:00[Asia/Yekaterinburg]", comments = "Generator version: 7.6.0")
public class SuggestsVacancyPositionItem {

  private String id;

  @Valid
  private List<@Valid SuggestsProfessionalRoleItemWithName> professionalRoles = new ArrayList<>();

  private String text;

  public SuggestsVacancyPositionItem() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public SuggestsVacancyPositionItem(String id, List<@Valid SuggestsProfessionalRoleItemWithName> professionalRoles, String text) {
    this.id = id;
    this.professionalRoles = professionalRoles;
    this.text = text;
  }

  public SuggestsVacancyPositionItem id(String id) {
    this.id = id;
    return this;
  }

  /**
   * Идентификатор должности
   * @return id
  */
  @NotNull 
  @Schema(name = "id", example = "2063", description = "Идентификатор должности", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("id")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public SuggestsVacancyPositionItem professionalRoles(List<@Valid SuggestsProfessionalRoleItemWithName> professionalRoles) {
    this.professionalRoles = professionalRoles;
    return this;
  }

  public SuggestsVacancyPositionItem addProfessionalRolesItem(SuggestsProfessionalRoleItemWithName professionalRolesItem) {
    if (this.professionalRoles == null) {
      this.professionalRoles = new ArrayList<>();
    }
    this.professionalRoles.add(professionalRolesItem);
    return this;
  }

  /**
   * Информация о профессиональных ролях, соответствующих должности
   * @return professionalRoles
  */
  @NotNull @Valid @Size(min = 1) 
  @Schema(name = "professional_roles", description = "Информация о профессиональных ролях, соответствующих должности", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("professional_roles")
  public List<@Valid SuggestsProfessionalRoleItemWithName> getProfessionalRoles() {
    return professionalRoles;
  }

  public void setProfessionalRoles(List<@Valid SuggestsProfessionalRoleItemWithName> professionalRoles) {
    this.professionalRoles = professionalRoles;
  }

  public SuggestsVacancyPositionItem text(String text) {
    this.text = text;
    return this;
  }

  /**
   * Название должности
   * @return text
  */
  @NotNull 
  @Schema(name = "text", example = "Личный водитель", description = "Название должности", requiredMode = Schema.RequiredMode.REQUIRED)
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
    SuggestsVacancyPositionItem suggestsVacancyPositionItem = (SuggestsVacancyPositionItem) o;
    return Objects.equals(this.id, suggestsVacancyPositionItem.id) &&
        Objects.equals(this.professionalRoles, suggestsVacancyPositionItem.professionalRoles) &&
        Objects.equals(this.text, suggestsVacancyPositionItem.text);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, professionalRoles, text);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SuggestsVacancyPositionItem {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    professionalRoles: ").append(toIndentedString(professionalRoles)).append("\n");
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

