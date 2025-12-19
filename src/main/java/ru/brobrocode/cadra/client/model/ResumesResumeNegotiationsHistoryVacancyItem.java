package ru.brobrocode.cadra.client.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.annotation.Generated;
import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;

import java.util.Objects;

/**
 * ResumesResumeNegotiationsHistoryVacancyItem
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2025-08-17T15:41:09.394389505+05:00[Asia/Yekaterinburg]", comments = "Generator version: 7.6.0")
public class ResumesResumeNegotiationsHistoryVacancyItem {

  private String createdAt;

  private ResumesNegotiationNanoEmployerState employerState;

  private Boolean withMessage;

  public ResumesResumeNegotiationsHistoryVacancyItem() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public ResumesResumeNegotiationsHistoryVacancyItem(String createdAt, ResumesNegotiationNanoEmployerState employerState, Boolean withMessage) {
    this.createdAt = createdAt;
    this.employerState = employerState;
    this.withMessage = withMessage;
  }

  public ResumesResumeNegotiationsHistoryVacancyItem createdAt(String createdAt) {
    this.createdAt = createdAt;
    return this;
  }

  /**
   * Дата изменения состояния отклика/приглашения
   * @return createdAt
  */
  @NotNull 
  @Schema(name = "created_at", description = "Дата изменения состояния отклика/приглашения", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("created_at")
  public String getCreatedAt() {
    return createdAt;
  }

  public void setCreatedAt(String createdAt) {
    this.createdAt = createdAt;
  }

  public ResumesResumeNegotiationsHistoryVacancyItem employerState(ResumesNegotiationNanoEmployerState employerState) {
    this.employerState = employerState;
    return this;
  }

  /**
   * Get employerState
   * @return employerState
  */
  @NotNull @Valid 
  @Schema(name = "employer_state", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("employer_state")
  public ResumesNegotiationNanoEmployerState getEmployerState() {
    return employerState;
  }

  public void setEmployerState(ResumesNegotiationNanoEmployerState employerState) {
    this.employerState = employerState;
  }

  public ResumesResumeNegotiationsHistoryVacancyItem withMessage(Boolean withMessage) {
    this.withMessage = withMessage;
    return this;
  }

  /**
   * Признак того, что при изменении состояния отклика/приглашения было отправлено сообщение соискателю
   * @return withMessage
  */
  @NotNull 
  @Schema(name = "with_message", description = "Признак того, что при изменении состояния отклика/приглашения было отправлено сообщение соискателю", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("with_message")
  public Boolean getWithMessage() {
    return withMessage;
  }

  public void setWithMessage(Boolean withMessage) {
    this.withMessage = withMessage;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ResumesResumeNegotiationsHistoryVacancyItem resumesResumeNegotiationsHistoryVacancyItem = (ResumesResumeNegotiationsHistoryVacancyItem) o;
    return Objects.equals(this.createdAt, resumesResumeNegotiationsHistoryVacancyItem.createdAt) &&
        Objects.equals(this.employerState, resumesResumeNegotiationsHistoryVacancyItem.employerState) &&
        Objects.equals(this.withMessage, resumesResumeNegotiationsHistoryVacancyItem.withMessage);
  }

  @Override
  public int hashCode() {
    return Objects.hash(createdAt, employerState, withMessage);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ResumesResumeNegotiationsHistoryVacancyItem {\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    employerState: ").append(toIndentedString(employerState)).append("\n");
    sb.append("    withMessage: ").append(toIndentedString(withMessage)).append("\n");
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

