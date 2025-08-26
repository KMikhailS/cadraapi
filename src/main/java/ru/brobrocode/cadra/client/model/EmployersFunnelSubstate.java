package ru.brobrocode.cadra.client.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.annotation.Generated;
import jakarta.validation.constraints.NotNull;

import java.util.Objects;

/**
 * EmployersFunnelSubstate
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2025-08-17T15:41:09.394389505+05:00[Asia/Yekaterinburg]", comments = "Generator version: 7.6.0")
public class EmployersFunnelSubstate {

  private String name;

  public EmployersFunnelSubstate() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public EmployersFunnelSubstate(String name) {
    this.name = name;
  }

  public EmployersFunnelSubstate name(String name) {
    this.name = name;
    return this;
  }

  /**
   * Название подстатуса этапа, которое задал работодатель
   * @return name
  */
  @NotNull 
  @Schema(name = "name", description = "Название подстатуса этапа, которое задал работодатель", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("name")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EmployersFunnelSubstate employersFunnelSubstate = (EmployersFunnelSubstate) o;
    return Objects.equals(this.name, employersFunnelSubstate.name);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EmployersFunnelSubstate {\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
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

