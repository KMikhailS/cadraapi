package ru.brobrocode.cadra.client.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.annotation.Generated;
import jakarta.validation.Valid;

import java.math.BigDecimal;
import java.util.Objects;

/**
 * VacancyCountersForArchivedOrHidden
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2025-08-17T15:41:09.394389505+05:00[Asia/Yekaterinburg]", comments = "Generator version: 7.6.0")
public class VacancyCountersForArchivedOrHidden {

  private BigDecimal responses;

  private BigDecimal totalResponses;

  private BigDecimal invitationsAndResponses;

  public VacancyCountersForArchivedOrHidden responses(BigDecimal responses) {
    this.responses = responses;
    return this;
  }

  /**
   * Количество откликов на вакансию с момента публикации
   * @return responses
  */
  @Valid 
  @Schema(name = "responses", description = "Количество откликов на вакансию с момента публикации", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("responses")
  public BigDecimal getResponses() {
    return responses;
  }

  public void setResponses(BigDecimal responses) {
    this.responses = responses;
  }

  public VacancyCountersForArchivedOrHidden totalResponses(BigDecimal totalResponses) {
    this.totalResponses = totalResponses;
    return this;
  }

  /**
   * Количество откликов на вакансию с момента создания
   * @return totalResponses
  */
  @Valid 
  @Schema(name = "total_responses", description = "Количество откликов на вакансию с момента создания", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("total_responses")
  public BigDecimal getTotalResponses() {
    return totalResponses;
  }

  public void setTotalResponses(BigDecimal totalResponses) {
    this.totalResponses = totalResponses;
  }

  public VacancyCountersForArchivedOrHidden invitationsAndResponses(BigDecimal invitationsAndResponses) {
    this.invitationsAndResponses = invitationsAndResponses;
    return this;
  }

  /**
   * Количество откликов и приглашений на вакансию
   * @return invitationsAndResponses
  */
  @Valid 
  @Schema(name = "invitations_and_responses", description = "Количество откликов и приглашений на вакансию", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("invitations_and_responses")
  public BigDecimal getInvitationsAndResponses() {
    return invitationsAndResponses;
  }

  public void setInvitationsAndResponses(BigDecimal invitationsAndResponses) {
    this.invitationsAndResponses = invitationsAndResponses;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    VacancyCountersForArchivedOrHidden vacancyCountersForArchivedOrHidden = (VacancyCountersForArchivedOrHidden) o;
    return Objects.equals(this.responses, vacancyCountersForArchivedOrHidden.responses) &&
        Objects.equals(this.totalResponses, vacancyCountersForArchivedOrHidden.totalResponses) &&
        Objects.equals(this.invitationsAndResponses, vacancyCountersForArchivedOrHidden.invitationsAndResponses);
  }

  @Override
  public int hashCode() {
    return Objects.hash(responses, totalResponses, invitationsAndResponses);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class VacancyCountersForArchivedOrHidden {\n");
    sb.append("    responses: ").append(toIndentedString(responses)).append("\n");
    sb.append("    totalResponses: ").append(toIndentedString(totalResponses)).append("\n");
    sb.append("    invitationsAndResponses: ").append(toIndentedString(invitationsAndResponses)).append("\n");
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

