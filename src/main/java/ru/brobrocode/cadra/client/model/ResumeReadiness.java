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
 * ResumeReadiness
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2025-08-17T15:41:09.394389505+05:00[Asia/Yekaterinburg]", comments = "Generator version: 7.6.0")
public class ResumeReadiness {

  @Valid
  private List<@Valid ResumeObjectsModerationNote> moderationNote = new ArrayList<>();

  private ResumeObjectsProgress progress;

  private String publishUrl;

  public ResumeReadiness() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public ResumeReadiness(List<@Valid ResumeObjectsModerationNote> moderationNote, ResumeObjectsProgress progress, String publishUrl) {
    this.moderationNote = moderationNote;
    this.progress = progress;
    this.publishUrl = publishUrl;
  }

  public ResumeReadiness moderationNote(List<@Valid ResumeObjectsModerationNote> moderationNote) {
    this.moderationNote = moderationNote;
    return this;
  }

  public ResumeReadiness addModerationNoteItem(ResumeObjectsModerationNote moderationNoteItem) {
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

  public ResumeReadiness progress(ResumeObjectsProgress progress) {
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

  public ResumeReadiness publishUrl(String publishUrl) {
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
    ResumeReadiness resumeReadiness = (ResumeReadiness) o;
    return Objects.equals(this.moderationNote, resumeReadiness.moderationNote) &&
        Objects.equals(this.progress, resumeReadiness.progress) &&
        Objects.equals(this.publishUrl, resumeReadiness.publishUrl);
  }

  @Override
  public int hashCode() {
    return Objects.hash(moderationNote, progress, publishUrl);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ResumeReadiness {\n");
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

