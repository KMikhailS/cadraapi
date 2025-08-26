package ru.brobrocode.cadra.client.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.annotation.Generated;
import jakarta.validation.constraints.NotNull;

import java.util.Objects;

/**
 * EmployerManagersEmployerManagerId
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2025-08-17T15:41:09.394389505+05:00[Asia/Yekaterinburg]", comments = "Generator version: 7.6.0")
public class EmployerManagersEmployerManagerId {

  private String id;

  public EmployerManagersEmployerManagerId() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public EmployerManagersEmployerManagerId(String id) {
    this.id = id;
  }

  public EmployerManagersEmployerManagerId id(String id) {
    this.id = id;
    return this;
  }

  /**
   * Идентификатор менеджера
   * @return id
  */
  @NotNull 
  @Schema(name = "id", description = "Идентификатор менеджера", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("id")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EmployerManagersEmployerManagerId employerManagersEmployerManagerId = (EmployerManagersEmployerManagerId) o;
    return Objects.equals(this.id, employerManagersEmployerManagerId.id);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EmployerManagersEmployerManagerId {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
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

