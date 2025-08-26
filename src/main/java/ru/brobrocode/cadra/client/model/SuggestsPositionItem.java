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
 * SuggestsPositionItem
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2025-08-17T15:41:09.394389505+05:00[Asia/Yekaterinburg]", comments = "Generator version: 7.6.0")
public class SuggestsPositionItem {

  private String id;

  @Valid
  private List<@Valid SuggestsProfessionalRoleItemWithName> professionalRoles = new ArrayList<>();

  @Valid
  private List<@Valid SuggestsSpecializationsWithName> specializations = new ArrayList<>();

  private String text;

  public SuggestsPositionItem() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public SuggestsPositionItem(String id, List<@Valid SuggestsProfessionalRoleItemWithName> professionalRoles, String text) {
    this.id = id;
    this.professionalRoles = professionalRoles;
    this.text = text;
  }

  public SuggestsPositionItem id(String id) {
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

  public SuggestsPositionItem professionalRoles(List<@Valid SuggestsProfessionalRoleItemWithName> professionalRoles) {
    this.professionalRoles = professionalRoles;
    return this;
  }

  public SuggestsPositionItem addProfessionalRolesItem(SuggestsProfessionalRoleItemWithName professionalRolesItem) {
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

  public SuggestsPositionItem specializations(List<@Valid SuggestsSpecializationsWithName> specializations) {
    this.specializations = specializations;
    return this;
  }

  public SuggestsPositionItem addSpecializationsItem(SuggestsSpecializationsWithName specializationsItem) {
    if (this.specializations == null) {
      this.specializations = new ArrayList<>();
    }
    this.specializations.add(specializationsItem);
    return this;
  }

  /**
   * Информация о специализациях, соответствующих должности
   * @return specializations
  */
  @Valid @Size(min = 1) 
  @Schema(name = "specializations", description = "Информация о специализациях, соответствующих должности", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("specializations")
  public List<@Valid SuggestsSpecializationsWithName> getSpecializations() {
    return specializations;
  }

  public void setSpecializations(List<@Valid SuggestsSpecializationsWithName> specializations) {
    this.specializations = specializations;
  }

  public SuggestsPositionItem text(String text) {
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
    SuggestsPositionItem suggestsPositionItem = (SuggestsPositionItem) o;
    return Objects.equals(this.id, suggestsPositionItem.id) &&
        Objects.equals(this.professionalRoles, suggestsPositionItem.professionalRoles) &&
        Objects.equals(this.specializations, suggestsPositionItem.specializations) &&
        Objects.equals(this.text, suggestsPositionItem.text);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, professionalRoles, specializations, text);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SuggestsPositionItem {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    professionalRoles: ").append(toIndentedString(professionalRoles)).append("\n");
    sb.append("    specializations: ").append(toIndentedString(specializations)).append("\n");
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

