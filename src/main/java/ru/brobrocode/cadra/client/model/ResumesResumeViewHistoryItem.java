package ru.brobrocode.cadra.client.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.annotation.Generated;
import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;

import java.util.Objects;

/**
 * ResumesResumeViewHistoryItem
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2025-08-17T15:41:09.394389505+05:00[Asia/Yekaterinburg]", comments = "Generator version: 7.6.0")
public class ResumesResumeViewHistoryItem {

  private String createdAt;

  private ResumesResumeViewHistoryItemEmployer employer;

  private Boolean viewed;

  public ResumesResumeViewHistoryItem() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public ResumesResumeViewHistoryItem(String createdAt, ResumesResumeViewHistoryItemEmployer employer, Boolean viewed) {
    this.createdAt = createdAt;
    this.employer = employer;
    this.viewed = viewed;
  }

  public ResumesResumeViewHistoryItem createdAt(String createdAt) {
    this.createdAt = createdAt;
    return this;
  }

  /**
   * Дата создания записи (дата просмотра резюме работодателем)
   * @return createdAt
  */
  @NotNull 
  @Schema(name = "created_at", description = "Дата создания записи (дата просмотра резюме работодателем)", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("created_at")
  public String getCreatedAt() {
    return createdAt;
  }

  public void setCreatedAt(String createdAt) {
    this.createdAt = createdAt;
  }

  public ResumesResumeViewHistoryItem employer(ResumesResumeViewHistoryItemEmployer employer) {
    this.employer = employer;
    return this;
  }

  /**
   * Get employer
   * @return employer
  */
  @NotNull @Valid 
  @Schema(name = "employer", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("employer")
  public ResumesResumeViewHistoryItemEmployer getEmployer() {
    return employer;
  }

  public void setEmployer(ResumesResumeViewHistoryItemEmployer employer) {
    this.employer = employer;
  }

  public ResumesResumeViewHistoryItem viewed(Boolean viewed) {
    this.viewed = viewed;
    return this;
  }

  /**
   * Отметка о просмотре записи
   * @return viewed
  */
  @NotNull 
  @Schema(name = "viewed", description = "Отметка о просмотре записи", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("viewed")
  public Boolean getViewed() {
    return viewed;
  }

  public void setViewed(Boolean viewed) {
    this.viewed = viewed;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ResumesResumeViewHistoryItem resumesResumeViewHistoryItem = (ResumesResumeViewHistoryItem) o;
    return Objects.equals(this.createdAt, resumesResumeViewHistoryItem.createdAt) &&
        Objects.equals(this.employer, resumesResumeViewHistoryItem.employer) &&
        Objects.equals(this.viewed, resumesResumeViewHistoryItem.viewed);
  }

  @Override
  public int hashCode() {
    return Objects.hash(createdAt, employer, viewed);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ResumesResumeViewHistoryItem {\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    employer: ").append(toIndentedString(employer)).append("\n");
    sb.append("    viewed: ").append(toIndentedString(viewed)).append("\n");
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

