package ru.brobrocode.cadra.client.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.annotation.Generated;
import jakarta.validation.constraints.NotNull;

import java.util.Objects;

/**
 * IncludesIdNameLastChangeTime
 */

@JsonTypeName("_IncludesIdNameLastChangeTime")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2025-08-17T15:41:09.394389505+05:00[Asia/Yekaterinburg]", comments = "Generator version: 7.6.0")
public class IncludesIdNameLastChangeTime {

  private String id;

  private String name;

  private String lastChangeTime;

  public IncludesIdNameLastChangeTime() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public IncludesIdNameLastChangeTime(String id, String name) {
    this.id = id;
    this.name = name;
  }

  public IncludesIdNameLastChangeTime id(String id) {
    this.id = id;
    return this;
  }

  /**
   * Идентификатор
   * @return id
  */
  @NotNull 
  @Schema(name = "id", description = "Идентификатор", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("id")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public IncludesIdNameLastChangeTime name(String name) {
    this.name = name;
    return this;
  }

  /**
   * Название
   * @return name
  */
  @NotNull 
  @Schema(name = "name", description = "Название", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("name")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public IncludesIdNameLastChangeTime lastChangeTime(String lastChangeTime) {
    this.lastChangeTime = lastChangeTime;
    return this;
  }

  /**
   * Время последнего изменения
   * @return lastChangeTime
  */
  
  @Schema(name = "last_change_time", description = "Время последнего изменения", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("last_change_time")
  public String getLastChangeTime() {
    return lastChangeTime;
  }

  public void setLastChangeTime(String lastChangeTime) {
    this.lastChangeTime = lastChangeTime;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    IncludesIdNameLastChangeTime includesIdNameLastChangeTime = (IncludesIdNameLastChangeTime) o;
    return Objects.equals(this.id, includesIdNameLastChangeTime.id) &&
        Objects.equals(this.name, includesIdNameLastChangeTime.name) &&
        Objects.equals(this.lastChangeTime, includesIdNameLastChangeTime.lastChangeTime);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, lastChangeTime);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IncludesIdNameLastChangeTime {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    lastChangeTime: ").append(toIndentedString(lastChangeTime)).append("\n");
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

