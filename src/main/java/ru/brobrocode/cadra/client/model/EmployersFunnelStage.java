package ru.brobrocode.cadra.client.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.annotation.Generated;
import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;

import java.util.Objects;

/**
 * EmployersFunnelStage
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2025-08-17T15:41:09.394389505+05:00[Asia/Yekaterinburg]", comments = "Generator version: 7.6.0")
public class EmployersFunnelStage {

  private String id;

  private EmployersEmployersState state;

  private EmployersFunnelSubstate substate = null;

  public EmployersFunnelStage() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public EmployersFunnelStage(String id, EmployersEmployersState state) {
    this.id = id;
    this.state = state;
  }

  public EmployersFunnelStage id(String id) {
    this.id = id;
    return this;
  }

  /**
   * Идентификатор этапа воронки
   * @return id
  */
  @NotNull 
  @Schema(name = "id", description = "Идентификатор этапа воронки", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("id")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public EmployersFunnelStage state(EmployersEmployersState state) {
    this.state = state;
    return this;
  }

  /**
   * Get state
   * @return state
  */
  @NotNull @Valid 
  @Schema(name = "state", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("state")
  public EmployersEmployersState getState() {
    return state;
  }

  public void setState(EmployersEmployersState state) {
    this.state = state;
  }

  public EmployersFunnelStage substate(EmployersFunnelSubstate substate) {
    this.substate = substate;
    return this;
  }

  /**
   * Get substate
   * @return substate
  */
  @Valid 
  @Schema(name = "substate", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("substate")
  public EmployersFunnelSubstate getSubstate() {
    return substate;
  }

  public void setSubstate(EmployersFunnelSubstate substate) {
    this.substate = substate;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EmployersFunnelStage employersFunnelStage = (EmployersFunnelStage) o;
    return Objects.equals(this.id, employersFunnelStage.id) &&
        Objects.equals(this.state, employersFunnelStage.state) &&
        Objects.equals(this.substate, employersFunnelStage.substate);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, state, substate);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EmployersFunnelStage {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    state: ").append(toIndentedString(state)).append("\n");
    sb.append("    substate: ").append(toIndentedString(substate)).append("\n");
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

