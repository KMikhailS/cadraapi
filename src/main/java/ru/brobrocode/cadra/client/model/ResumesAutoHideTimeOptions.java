package ru.brobrocode.cadra.client.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.annotation.Generated;
import jakarta.validation.constraints.NotNull;

import java.util.Objects;

/**
 * ResumesAutoHideTimeOptions
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2025-08-17T15:41:09.394389505+05:00[Asia/Yekaterinburg]", comments = "Generator version: 7.6.0")
public class ResumesAutoHideTimeOptions {

  private Boolean active = null;

  private String id;

  private String name;

  public ResumesAutoHideTimeOptions() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public ResumesAutoHideTimeOptions(String id, String name) {
    this.id = id;
    this.name = name;
  }

  public ResumesAutoHideTimeOptions active(Boolean active) {
    this.active = active;
    return this;
  }

  /**
   * Выбран ли вариант автоскрытия
   * @return active
  */
  
  @Schema(name = "active", description = "Выбран ли вариант автоскрытия", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("active")
  public Boolean getActive() {
    return active;
  }

  public void setActive(Boolean active) {
    this.active = active;
  }

  public ResumesAutoHideTimeOptions id(String id) {
    this.id = id;
    return this;
  }

  /**
   * Идентификатор варианта автоскрытия
   * @return id
  */
  @NotNull 
  @Schema(name = "id", description = "Идентификатор варианта автоскрытия", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("id")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public ResumesAutoHideTimeOptions name(String name) {
    this.name = name;
    return this;
  }

  /**
   * Название варианта автоскрытия
   * @return name
  */
  @NotNull 
  @Schema(name = "name", description = "Название варианта автоскрытия", requiredMode = Schema.RequiredMode.REQUIRED)
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
    ResumesAutoHideTimeOptions resumesAutoHideTimeOptions = (ResumesAutoHideTimeOptions) o;
    return Objects.equals(this.active, resumesAutoHideTimeOptions.active) &&
        Objects.equals(this.id, resumesAutoHideTimeOptions.id) &&
        Objects.equals(this.name, resumesAutoHideTimeOptions.name);
  }

  @Override
  public int hashCode() {
    return Objects.hash(active, id, name);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ResumesAutoHideTimeOptions {\n");
    sb.append("    active: ").append(toIndentedString(active)).append("\n");
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

