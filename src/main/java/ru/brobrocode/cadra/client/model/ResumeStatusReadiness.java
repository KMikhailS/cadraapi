package ru.brobrocode.cadra.client.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.annotation.Generated;
import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * Информация о статусе резюме и готовности резюме к публикации
 */

@Schema(name = "ResumeStatusReadiness", description = "Информация о статусе резюме и готовности резюме к публикации")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2025-08-17T15:41:09.394389505+05:00[Asia/Yekaterinburg]", comments = "Generator version: 7.6.0")
public class ResumeStatusReadiness {

  private Boolean blocked;

  private Boolean canPublishOrUpdate = null;

  private Boolean finished;

  private IncludesIdName status;

  @Valid
  private List<@Valid ResumeObjectsModerationNote> moderationNote = new ArrayList<>();

  private ResumeObjectsProgress progress;

  private String publishUrl;

  public ResumeStatusReadiness() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public ResumeStatusReadiness(Boolean blocked, Boolean finished, IncludesIdName status, List<@Valid ResumeObjectsModerationNote> moderationNote, ResumeObjectsProgress progress, String publishUrl) {
    this.blocked = blocked;
    this.finished = finished;
    this.status = status;
    this.moderationNote = moderationNote;
    this.progress = progress;
    this.publishUrl = publishUrl;
  }

  public ResumeStatusReadiness blocked(Boolean blocked) {
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

  public ResumeStatusReadiness canPublishOrUpdate(Boolean canPublishOrUpdate) {
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

  public ResumeStatusReadiness finished(Boolean finished) {
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

  public ResumeStatusReadiness status(IncludesIdName status) {
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

  public ResumeStatusReadiness moderationNote(List<@Valid ResumeObjectsModerationNote> moderationNote) {
    this.moderationNote = moderationNote;
    return this;
  }

  public ResumeStatusReadiness addModerationNoteItem(ResumeObjectsModerationNote moderationNoteItem) {
    if (this.moderationNote == null) {
      this.moderationNote = new ArrayList<>();
    }
    this.moderationNote.add(moderationNoteItem);
    return this;
  }

  /**
   * Замечания модератора. В некоторых случаях замечания могут сопровождаться [блокировкой резюме](#tag/Rezyume.-Prosmotr-informacii/Status-rezyume). Полный список возможных замечаний доступен в поле `resume_moderation_note` [в справочнике полей](#tag/Obshie-spravochniki/operation/get-dictionaries) 
   * @return moderationNote
  */
  @NotNull @Valid 
  @Schema(name = "moderation_note", description = "Замечания модератора. В некоторых случаях замечания могут сопровождаться [блокировкой резюме](#tag/Rezyume.-Prosmotr-informacii/Status-rezyume). Полный список возможных замечаний доступен в поле `resume_moderation_note` [в справочнике полей](#tag/Obshie-spravochniki/operation/get-dictionaries) ", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("moderation_note")
  public List<@Valid ResumeObjectsModerationNote> getModerationNote() {
    return moderationNote;
  }

  public void setModerationNote(List<@Valid ResumeObjectsModerationNote> moderationNote) {
    this.moderationNote = moderationNote;
  }

  public ResumeStatusReadiness progress(ResumeObjectsProgress progress) {
    this.progress = progress;
    return this;
  }

  /**
   * Get progress
   * @return progress
  */
  @NotNull @Valid 
  @Schema(name = "progress", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("progress")
  public ResumeObjectsProgress getProgress() {
    return progress;
  }

  public void setProgress(ResumeObjectsProgress progress) {
    this.progress = progress;
  }

  public ResumeStatusReadiness publishUrl(String publishUrl) {
    this.publishUrl = publishUrl;
    return this;
  }

  /**
   * URL для публикации или обновления резюме
   * @return publishUrl
  */
  @NotNull 
  @Schema(name = "publish_url", description = "URL для публикации или обновления резюме", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("publish_url")
  public String getPublishUrl() {
    return publishUrl;
  }

  public void setPublishUrl(String publishUrl) {
    this.publishUrl = publishUrl;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ResumeStatusReadiness resumeStatusReadiness = (ResumeStatusReadiness) o;
    return Objects.equals(this.blocked, resumeStatusReadiness.blocked) &&
        Objects.equals(this.canPublishOrUpdate, resumeStatusReadiness.canPublishOrUpdate) &&
        Objects.equals(this.finished, resumeStatusReadiness.finished) &&
        Objects.equals(this.status, resumeStatusReadiness.status) &&
        Objects.equals(this.moderationNote, resumeStatusReadiness.moderationNote) &&
        Objects.equals(this.progress, resumeStatusReadiness.progress) &&
        Objects.equals(this.publishUrl, resumeStatusReadiness.publishUrl);
  }

  @Override
  public int hashCode() {
    return Objects.hash(blocked, canPublishOrUpdate, finished, status, moderationNote, progress, publishUrl);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ResumeStatusReadiness {\n");
    sb.append("    blocked: ").append(toIndentedString(blocked)).append("\n");
    sb.append("    canPublishOrUpdate: ").append(toIndentedString(canPublishOrUpdate)).append("\n");
    sb.append("    finished: ").append(toIndentedString(finished)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    moderationNote: ").append(toIndentedString(moderationNote)).append("\n");
    sb.append("    progress: ").append(toIndentedString(progress)).append("\n");
    sb.append("    publishUrl: ").append(toIndentedString(publishUrl)).append("\n");
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

