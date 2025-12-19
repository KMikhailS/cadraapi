package ru.brobrocode.cadra.client.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.annotation.Generated;
import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;

import java.util.Objects;

/**
 * ResumeObjectsOwnerComments
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2025-08-17T15:41:09.394389505+05:00[Asia/Yekaterinburg]", comments = "Generator version: 7.6.0")
public class ResumeObjectsOwnerComments {

  private ResumeObjectsOwnerCommentsCounters counters;

  private String url;

  public ResumeObjectsOwnerComments() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public ResumeObjectsOwnerComments(ResumeObjectsOwnerCommentsCounters counters, String url) {
    this.counters = counters;
    this.url = url;
  }

  public ResumeObjectsOwnerComments counters(ResumeObjectsOwnerCommentsCounters counters) {
    this.counters = counters;
    return this;
  }

  /**
   * Информация о количестве комментариев
   * @return counters
  */
  @NotNull @Valid 
  @Schema(name = "counters", description = "Информация о количестве комментариев", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("counters")
  public ResumeObjectsOwnerCommentsCounters getCounters() {
    return counters;
  }

  public void setCounters(ResumeObjectsOwnerCommentsCounters counters) {
    this.counters = counters;
  }

  public ResumeObjectsOwnerComments url(String url) {
    this.url = url;
    return this;
  }

  /**
   * URL, на который нужно сделать GET-запрос, чтобы получить список комментариев
   * @return url
  */
  @NotNull 
  @Schema(name = "url", description = "URL, на который нужно сделать GET-запрос, чтобы получить список комментариев", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("url")
  public String getUrl() {
    return url;
  }

  public void setUrl(String url) {
    this.url = url;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ResumeObjectsOwnerComments resumeObjectsOwnerComments = (ResumeObjectsOwnerComments) o;
    return Objects.equals(this.counters, resumeObjectsOwnerComments.counters) &&
        Objects.equals(this.url, resumeObjectsOwnerComments.url);
  }

  @Override
  public int hashCode() {
    return Objects.hash(counters, url);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ResumeObjectsOwnerComments {\n");
    sb.append("    counters: ").append(toIndentedString(counters)).append("\n");
    sb.append("    url: ").append(toIndentedString(url)).append("\n");
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

