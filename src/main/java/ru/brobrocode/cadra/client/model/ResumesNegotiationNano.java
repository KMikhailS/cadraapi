package ru.brobrocode.cadra.client.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.annotation.Generated;
import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;

import java.util.Objects;

/**
 * ResumesNegotiationNano
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2025-08-17T15:41:09.394389505+05:00[Asia/Yekaterinburg]", comments = "Generator version: 7.6.0")
public class ResumesNegotiationNano {

  private String createdAt;

  private ResumesNegotiationNanoEmployerState employerState;

  public ResumesNegotiationNano() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public ResumesNegotiationNano(String createdAt, ResumesNegotiationNanoEmployerState employerState) {
    this.createdAt = createdAt;
    this.employerState = employerState;
  }

  public ResumesNegotiationNano createdAt(String createdAt) {
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

  public ResumesNegotiationNano employerState(ResumesNegotiationNanoEmployerState employerState) {
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

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ResumesNegotiationNano resumesNegotiationNano = (ResumesNegotiationNano) o;
    return Objects.equals(this.createdAt, resumesNegotiationNano.createdAt) &&
        Objects.equals(this.employerState, resumesNegotiationNano.employerState);
  }

  @Override
  public int hashCode() {
    return Objects.hash(createdAt, employerState);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ResumesNegotiationNano {\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    employerState: ").append(toIndentedString(employerState)).append("\n");
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

