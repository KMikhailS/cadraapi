package ru.brobrocode.cadra.client.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.annotation.Generated;
import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;

import java.util.Objects;

/**
 * ResumeStatus
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2025-08-17T15:41:09.394389505+05:00[Asia/Yekaterinburg]", comments = "Generator version: 7.6.0")
public class ResumeStatus {

  private Boolean blocked;

  private Boolean canPublishOrUpdate = null;

  private Boolean finished;

  private IncludesIdName status;

  public ResumeStatus() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public ResumeStatus(Boolean blocked, Boolean finished, IncludesIdName status) {
    this.blocked = blocked;
    this.finished = finished;
    this.status = status;
  }

  public ResumeStatus blocked(Boolean blocked) {
    this.blocked = blocked;
    return this;
  }

  /**
   * Заблокировано ли резюме ([подробнее](#tag/Rezyume.-Prosmotr-informacii/Status-rezyume))
   * @return blocked
  */
  @NotNull 
  @Schema(name = "blocked", description = "Заблокировано ли резюме ([подробнее](#tag/Rezyume.-Prosmotr-informacii/Status-rezyume))", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("blocked")
  public Boolean getBlocked() {
    return blocked;
  }

  public void setBlocked(Boolean blocked) {
    this.blocked = blocked;
  }

  public ResumeStatus canPublishOrUpdate(Boolean canPublishOrUpdate) {
    this.canPublishOrUpdate = canPublishOrUpdate;
    return this;
  }

  /**
   * Можно ли опубликовать или обновить данное резюме
   * @return canPublishOrUpdate
  */
  
  @Schema(name = "can_publish_or_update", description = "Можно ли опубликовать или обновить данное резюме", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("can_publish_or_update")
  public Boolean getCanPublishOrUpdate() {
    return canPublishOrUpdate;
  }

  public void setCanPublishOrUpdate(Boolean canPublishOrUpdate) {
    this.canPublishOrUpdate = canPublishOrUpdate;
  }

  public ResumeStatus finished(Boolean finished) {
    this.finished = finished;
    return this;
  }

  /**
   * Заполнено ли резюме
   * @return finished
  */
  @NotNull 
  @Schema(name = "finished", description = "Заполнено ли резюме", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("finished")
  public Boolean getFinished() {
    return finished;
  }

  public void setFinished(Boolean finished) {
    this.finished = finished;
  }

  public ResumeStatus status(IncludesIdName status) {
    this.status = status;
    return this;
  }

  /**
   * Get status
   * @return status
  */
  @NotNull @Valid 
  @Schema(name = "status", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("status")
  public IncludesIdName getStatus() {
    return status;
  }

  public void setStatus(IncludesIdName status) {
    this.status = status;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ResumeStatus resumeStatus = (ResumeStatus) o;
    return Objects.equals(this.blocked, resumeStatus.blocked) &&
        Objects.equals(this.canPublishOrUpdate, resumeStatus.canPublishOrUpdate) &&
        Objects.equals(this.finished, resumeStatus.finished) &&
        Objects.equals(this.status, resumeStatus.status);
  }

  @Override
  public int hashCode() {
    return Objects.hash(blocked, canPublishOrUpdate, finished, status);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ResumeStatus {\n");
    sb.append("    blocked: ").append(toIndentedString(blocked)).append("\n");
    sb.append("    canPublishOrUpdate: ").append(toIndentedString(canPublishOrUpdate)).append("\n");
    sb.append("    finished: ").append(toIndentedString(finished)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
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

