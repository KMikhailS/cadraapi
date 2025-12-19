package ru.brobrocode.cadra.client.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.annotation.Generated;
import jakarta.validation.constraints.NotNull;

import java.util.Objects;

/**
 * ApplicantCommentsAccessType
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2025-08-17T15:41:09.394389505+05:00[Asia/Yekaterinburg]", comments = "Generator version: 7.6.0")
public class ApplicantCommentsAccessType {

  private String id;

  private String name;

  public ApplicantCommentsAccessType() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public ApplicantCommentsAccessType(String id, String name) {
    this.id = id;
    this.name = name;
  }

  public ApplicantCommentsAccessType id(String id) {
    this.id = id;
    return this;
  }

  /**
   * Идентификатор типа доступа
   * @return id
  */
  @NotNull 
  @Schema(name = "id", description = "Идентификатор типа доступа", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("id")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public ApplicantCommentsAccessType name(String name) {
    this.name = name;
    return this;
  }

  /**
   * Название типа доступа
   * @return name
  */
  @NotNull 
  @Schema(name = "name", description = "Название типа доступа", requiredMode = Schema.RequiredMode.REQUIRED)
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
    ApplicantCommentsAccessType applicantCommentsAccessType = (ApplicantCommentsAccessType) o;
    return Objects.equals(this.id, applicantCommentsAccessType.id) &&
        Objects.equals(this.name, applicantCommentsAccessType.name);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ApplicantCommentsAccessType {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
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

