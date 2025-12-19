package ru.brobrocode.cadra.client.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.annotation.Generated;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotNull;

import java.util.Objects;

/**
 * Информация о счетчиках соискателя
 */

@Schema(name = "MeApplicantProfileCounters", description = "Информация о счетчиках соискателя")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2025-08-17T15:41:09.394389505+05:00[Asia/Yekaterinburg]", comments = "Generator version: 7.6.0")
public class MeApplicantProfileCounters {

  private Integer newResumeViews;

  private Integer resumesCount;

  private Integer unreadNegotiations;

  public MeApplicantProfileCounters() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public MeApplicantProfileCounters(Integer newResumeViews, Integer resumesCount, Integer unreadNegotiations) {
    this.newResumeViews = newResumeViews;
    this.resumesCount = resumesCount;
    this.unreadNegotiations = unreadNegotiations;
  }

  public MeApplicantProfileCounters newResumeViews(Integer newResumeViews) {
    this.newResumeViews = newResumeViews;
    return this;
  }

  /**
   * Общее количество новых просмотров всех резюме текущего пользователя
   * minimum: 0
   * @return newResumeViews
  */
  @NotNull @Min(0) 
  @Schema(name = "new_resume_views", example = "2", description = "Общее количество новых просмотров всех резюме текущего пользователя", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("new_resume_views")
  public Integer getNewResumeViews() {
    return newResumeViews;
  }

  public void setNewResumeViews(Integer newResumeViews) {
    this.newResumeViews = newResumeViews;
  }

  public MeApplicantProfileCounters resumesCount(Integer resumesCount) {
    this.resumesCount = resumesCount;
    return this;
  }

  /**
   * Общее количество созданных резюме текущего пользователя
   * minimum: 0
   * @return resumesCount
  */
  @NotNull @Min(0) 
  @Schema(name = "resumes_count", example = "5", description = "Общее количество созданных резюме текущего пользователя", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("resumes_count")
  public Integer getResumesCount() {
    return resumesCount;
  }

  public void setResumesCount(Integer resumesCount) {
    this.resumesCount = resumesCount;
  }

  public MeApplicantProfileCounters unreadNegotiations(Integer unreadNegotiations) {
    this.unreadNegotiations = unreadNegotiations;
    return this;
  }

  /**
   * Количество новых непрочитанных откликов (у которых `has_updates: true`)
   * minimum: 0
   * @return unreadNegotiations
  */
  @NotNull @Min(0) 
  @Schema(name = "unread_negotiations", example = "1", description = "Количество новых непрочитанных откликов (у которых `has_updates: true`)", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("unread_negotiations")
  public Integer getUnreadNegotiations() {
    return unreadNegotiations;
  }

  public void setUnreadNegotiations(Integer unreadNegotiations) {
    this.unreadNegotiations = unreadNegotiations;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MeApplicantProfileCounters meApplicantProfileCounters = (MeApplicantProfileCounters) o;
    return Objects.equals(this.newResumeViews, meApplicantProfileCounters.newResumeViews) &&
        Objects.equals(this.resumesCount, meApplicantProfileCounters.resumesCount) &&
        Objects.equals(this.unreadNegotiations, meApplicantProfileCounters.unreadNegotiations);
  }

  @Override
  public int hashCode() {
    return Objects.hash(newResumeViews, resumesCount, unreadNegotiations);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MeApplicantProfileCounters {\n");
    sb.append("    newResumeViews: ").append(toIndentedString(newResumeViews)).append("\n");
    sb.append("    resumesCount: ").append(toIndentedString(resumesCount)).append("\n");
    sb.append("    unreadNegotiations: ").append(toIndentedString(unreadNegotiations)).append("\n");
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

