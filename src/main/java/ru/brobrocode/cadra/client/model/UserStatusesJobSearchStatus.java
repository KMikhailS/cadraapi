package ru.brobrocode.cadra.client.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.annotation.Generated;

import java.util.Objects;

/**
 * UserStatusesJobSearchStatus
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2025-08-17T15:41:09.394389505+05:00[Asia/Yekaterinburg]", comments = "Generator version: 7.6.0")
public class UserStatusesJobSearchStatus {

  private String id;

  private String lastChangeTime;

  private String name;

  public UserStatusesJobSearchStatus id(String id) {
    this.id = id;
    return this;
  }

  /**
   * Идентификатор статуса
   * @return id
  */
  
  @Schema(name = "id", example = "active_search", description = "Идентификатор статуса", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("id")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public UserStatusesJobSearchStatus lastChangeTime(String lastChangeTime) {
    this.lastChangeTime = lastChangeTime;
    return this;
  }

  /**
   * Время, когда статус в последний раз менялся
   * @return lastChangeTime
  */
  
  @Schema(name = "last_change_time", example = "2024-02-08T10:48:44.267Z", description = "Время, когда статус в последний раз менялся", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("last_change_time")
  public String getLastChangeTime() {
    return lastChangeTime;
  }

  public void setLastChangeTime(String lastChangeTime) {
    this.lastChangeTime = lastChangeTime;
  }

  public UserStatusesJobSearchStatus name(String name) {
    this.name = name;
    return this;
  }

  /**
   * Название статуса
   * @return name
  */
  
  @Schema(name = "name", example = "В активном поиске работы", description = "Название статуса", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
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
    UserStatusesJobSearchStatus userStatusesJobSearchStatus = (UserStatusesJobSearchStatus) o;
    return Objects.equals(this.id, userStatusesJobSearchStatus.id) &&
        Objects.equals(this.lastChangeTime, userStatusesJobSearchStatus.lastChangeTime) &&
        Objects.equals(this.name, userStatusesJobSearchStatus.name);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, lastChangeTime, name);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UserStatusesJobSearchStatus {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    lastChangeTime: ").append(toIndentedString(lastChangeTime)).append("\n");
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

