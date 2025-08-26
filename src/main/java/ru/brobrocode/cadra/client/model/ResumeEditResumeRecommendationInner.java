package ru.brobrocode.cadra.client.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.annotation.Generated;
import jakarta.validation.constraints.NotNull;

import java.util.Objects;

/**
 * ResumeEditResumeRecommendationInner
 */

@JsonTypeName("ResumeEditResume_recommendation_inner")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2025-08-17T15:41:09.394389505+05:00[Asia/Yekaterinburg]", comments = "Generator version: 7.6.0")
public class ResumeEditResumeRecommendationInner {

  private String name;

  private String organization;

  private String position;

  public ResumeEditResumeRecommendationInner() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public ResumeEditResumeRecommendationInner(String name, String organization, String position) {
    this.name = name;
    this.organization = organization;
    this.position = position;
  }

  public ResumeEditResumeRecommendationInner name(String name) {
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

  public ResumeEditResumeRecommendationInner organization(String organization) {
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

  public ResumeEditResumeRecommendationInner position(String position) {
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
    ResumeEditResumeRecommendationInner resumeEditResumeRecommendationInner = (ResumeEditResumeRecommendationInner) o;
    return Objects.equals(this.name, resumeEditResumeRecommendationInner.name) &&
        Objects.equals(this.organization, resumeEditResumeRecommendationInner.organization) &&
        Objects.equals(this.position, resumeEditResumeRecommendationInner.position);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, organization, position);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ResumeEditResumeRecommendationInner {\n");
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

