package ru.brobrocode.cadra.client.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.annotation.Generated;
import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;

import java.math.BigDecimal;
import java.util.Objects;

/**
 * VacancyCountersForActive
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2025-08-17T15:41:09.394389505+05:00[Asia/Yekaterinburg]", comments = "Generator version: 7.6.0")
public class VacancyCountersForActive {

  private BigDecimal calls;

  private BigDecimal invitations;

  private BigDecimal invitationsAndResponses;

  private BigDecimal newMissedCalls;

  private BigDecimal responses;

  private BigDecimal resumesInProgress;

  private BigDecimal unreadResponses;

  private BigDecimal views;

  public VacancyCountersForActive() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public VacancyCountersForActive(BigDecimal invitations, BigDecimal responses, BigDecimal resumesInProgress, BigDecimal unreadResponses, BigDecimal views) {
    this.invitations = invitations;
    this.responses = responses;
    this.resumesInProgress = resumesInProgress;
    this.unreadResponses = unreadResponses;
    this.views = views;
  }

  public VacancyCountersForActive calls(BigDecimal calls) {
    this.calls = calls;
    return this;
  }

  /**
   * Общее количество звонков
   * @return calls
  */
  @Valid 
  @Schema(name = "calls", description = "Общее количество звонков", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("calls")
  public BigDecimal getCalls() {
    return calls;
  }

  public void setCalls(BigDecimal calls) {
    this.calls = calls;
  }

  public VacancyCountersForActive invitations(BigDecimal invitations) {
    this.invitations = invitations;
    return this;
  }

  /**
   * Количество приглашений на вакансию
   * @return invitations
  */
  @NotNull @Valid 
  @Schema(name = "invitations", description = "Количество приглашений на вакансию", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("invitations")
  public BigDecimal getInvitations() {
    return invitations;
  }

  public void setInvitations(BigDecimal invitations) {
    this.invitations = invitations;
  }

  public VacancyCountersForActive invitationsAndResponses(BigDecimal invitationsAndResponses) {
    this.invitationsAndResponses = invitationsAndResponses;
    return this;
  }

  /**
   * Количество откликнувшихся и приглашенных соискателей на вакансию
   * @return invitationsAndResponses
  */
  @Valid 
  @Schema(name = "invitations_and_responses", description = "Количество откликнувшихся и приглашенных соискателей на вакансию", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("invitations_and_responses")
  public BigDecimal getInvitationsAndResponses() {
    return invitationsAndResponses;
  }

  public void setInvitationsAndResponses(BigDecimal invitationsAndResponses) {
    this.invitationsAndResponses = invitationsAndResponses;
  }

  public VacancyCountersForActive newMissedCalls(BigDecimal newMissedCalls) {
    this.newMissedCalls = newMissedCalls;
    return this;
  }

  /**
   * Общее количество новых пропущенных звонков
   * @return newMissedCalls
  */
  @Valid 
  @Schema(name = "new_missed_calls", description = "Общее количество новых пропущенных звонков", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("new_missed_calls")
  public BigDecimal getNewMissedCalls() {
    return newMissedCalls;
  }

  public void setNewMissedCalls(BigDecimal newMissedCalls) {
    this.newMissedCalls = newMissedCalls;
  }

  public VacancyCountersForActive responses(BigDecimal responses) {
    this.responses = responses;
    return this;
  }

  /**
   * Количество откликов на вакансию
   * @return responses
  */
  @NotNull @Valid 
  @Schema(name = "responses", description = "Количество откликов на вакансию", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("responses")
  public BigDecimal getResponses() {
    return responses;
  }

  public void setResponses(BigDecimal responses) {
    this.responses = responses;
  }

  public VacancyCountersForActive resumesInProgress(BigDecimal resumesInProgress) {
    this.resumesInProgress = resumesInProgress;
    return this;
  }

  /**
   * Количество резюме в работе на вакансию
   * @return resumesInProgress
  */
  @NotNull @Valid 
  @Schema(name = "resumes_in_progress", description = "Количество резюме в работе на вакансию", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("resumes_in_progress")
  public BigDecimal getResumesInProgress() {
    return resumesInProgress;
  }

  public void setResumesInProgress(BigDecimal resumesInProgress) {
    this.resumesInProgress = resumesInProgress;
  }

  public VacancyCountersForActive unreadResponses(BigDecimal unreadResponses) {
    this.unreadResponses = unreadResponses;
    return this;
  }

  /**
   * Количество непросмотренных откликов на вакансию
   * @return unreadResponses
  */
  @NotNull @Valid 
  @Schema(name = "unread_responses", description = "Количество непросмотренных откликов на вакансию", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("unread_responses")
  public BigDecimal getUnreadResponses() {
    return unreadResponses;
  }

  public void setUnreadResponses(BigDecimal unreadResponses) {
    this.unreadResponses = unreadResponses;
  }

  public VacancyCountersForActive views(BigDecimal views) {
    this.views = views;
    return this;
  }

  /**
   * Количество просмотров вакансии
   * @return views
  */
  @NotNull @Valid 
  @Schema(name = "views", description = "Количество просмотров вакансии", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("views")
  public BigDecimal getViews() {
    return views;
  }

  public void setViews(BigDecimal views) {
    this.views = views;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    VacancyCountersForActive vacancyCountersForActive = (VacancyCountersForActive) o;
    return Objects.equals(this.calls, vacancyCountersForActive.calls) &&
        Objects.equals(this.invitations, vacancyCountersForActive.invitations) &&
        Objects.equals(this.invitationsAndResponses, vacancyCountersForActive.invitationsAndResponses) &&
        Objects.equals(this.newMissedCalls, vacancyCountersForActive.newMissedCalls) &&
        Objects.equals(this.responses, vacancyCountersForActive.responses) &&
        Objects.equals(this.resumesInProgress, vacancyCountersForActive.resumesInProgress) &&
        Objects.equals(this.unreadResponses, vacancyCountersForActive.unreadResponses) &&
        Objects.equals(this.views, vacancyCountersForActive.views);
  }

  @Override
  public int hashCode() {
    return Objects.hash(calls, invitations, invitationsAndResponses, newMissedCalls, responses, resumesInProgress, unreadResponses, views);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class VacancyCountersForActive {\n");
    sb.append("    calls: ").append(toIndentedString(calls)).append("\n");
    sb.append("    invitations: ").append(toIndentedString(invitations)).append("\n");
    sb.append("    invitationsAndResponses: ").append(toIndentedString(invitationsAndResponses)).append("\n");
    sb.append("    newMissedCalls: ").append(toIndentedString(newMissedCalls)).append("\n");
    sb.append("    responses: ").append(toIndentedString(responses)).append("\n");
    sb.append("    resumesInProgress: ").append(toIndentedString(resumesInProgress)).append("\n");
    sb.append("    unreadResponses: ").append(toIndentedString(unreadResponses)).append("\n");
    sb.append("    views: ").append(toIndentedString(views)).append("\n");
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

