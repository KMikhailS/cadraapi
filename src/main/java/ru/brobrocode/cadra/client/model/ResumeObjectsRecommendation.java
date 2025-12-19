package ru.brobrocode.cadra.client.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.annotation.Generated;
import jakarta.validation.constraints.NotNull;

import java.util.Objects;

/**
 * ResumeObjectsRecommendation
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2025-08-17T15:41:09.394389505+05:00[Asia/Yekaterinburg]", comments = "Generator version: 7.6.0")
public class ResumeObjectsRecommendation {

  private String contact;

  private String name;

  private String organization;

  private String position;

  public ResumeObjectsRecommendation() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public ResumeObjectsRecommendation(String name, String organization, String position) {
    this.name = name;
    this.organization = organization;
    this.position = position;
  }

  public ResumeObjectsRecommendation contact(String contact) {
    this.contact = contact;
    return this;
  }

  /**
   * Контакт
   * @return contact
  */
  
  @Schema(name = "contact", description = "Контакт", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("contact")
  public String getContact() {
    return contact;
  }

  public void setContact(String contact) {
    this.contact = contact;
  }

  public ResumeObjectsRecommendation name(String name) {
    this.name = name;
    return this;
  }

  /**
   * Имя выдавшего рекомендацию
   * @return name
  */
  @NotNull 
  @Schema(name = "name", description = "Имя выдавшего рекомендацию", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("name")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public ResumeObjectsRecommendation organization(String organization) {
    this.organization = organization;
    return this;
  }

  /**
   * Организация
   * @return organization
  */
  @NotNull 
  @Schema(name = "organization", description = "Организация", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("organization")
  public String getOrganization() {
    return organization;
  }

  public void setOrganization(String organization) {
    this.organization = organization;
  }

  public ResumeObjectsRecommendation position(String position) {
    this.position = position;
    return this;
  }

  /**
   * Должность
   * @return position
  */
  @NotNull 
  @Schema(name = "position", description = "Должность", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("position")
  public String getPosition() {
    return position;
  }

  public void setPosition(String position) {
    this.position = position;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ResumeObjectsRecommendation resumeObjectsRecommendation = (ResumeObjectsRecommendation) o;
    return Objects.equals(this.contact, resumeObjectsRecommendation.contact) &&
        Objects.equals(this.name, resumeObjectsRecommendation.name) &&
        Objects.equals(this.organization, resumeObjectsRecommendation.organization) &&
        Objects.equals(this.position, resumeObjectsRecommendation.position);
  }

  @Override
  public int hashCode() {
    return Objects.hash(contact, name, organization, position);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ResumeObjectsRecommendation {\n");
    sb.append("    contact: ").append(toIndentedString(contact)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    organization: ").append(toIndentedString(organization)).append("\n");
    sb.append("    position: ").append(toIndentedString(position)).append("\n");
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

