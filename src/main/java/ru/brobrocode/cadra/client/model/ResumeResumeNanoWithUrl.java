package ru.brobrocode.cadra.client.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.annotation.Generated;
import jakarta.validation.constraints.NotNull;

import java.util.Objects;

/**
 * ResumeResumeNanoWithUrl
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2025-08-17T15:41:09.394389505+05:00[Asia/Yekaterinburg]", comments = "Generator version: 7.6.0")
public class ResumeResumeNanoWithUrl {

  private String alternateUrl;

  private String id;

  private String title = null;

  private String url;

  public ResumeResumeNanoWithUrl() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public ResumeResumeNanoWithUrl(String alternateUrl, String id, String title, String url) {
    this.alternateUrl = alternateUrl;
    this.id = id;
    this.title = title;
    this.url = url;
  }

  public ResumeResumeNanoWithUrl alternateUrl(String alternateUrl) {
    this.alternateUrl = alternateUrl;
    return this;
  }

  /**
   * URL резюме на сайте
   * @return alternateUrl
  */
  @NotNull 
  @Schema(name = "alternate_url", description = "URL резюме на сайте", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("alternate_url")
  public String getAlternateUrl() {
    return alternateUrl;
  }

  public void setAlternateUrl(String alternateUrl) {
    this.alternateUrl = alternateUrl;
  }

  public ResumeResumeNanoWithUrl id(String id) {
    this.id = id;
    return this;
  }

  /**
   * Идентификатор резюме
   * @return id
  */
  @NotNull 
  @Schema(name = "id", description = "Идентификатор резюме", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("id")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public ResumeResumeNanoWithUrl title(String title) {
    this.title = title;
    return this;
  }

  /**
   * Желаемая должность
   * @return title
  */
  @NotNull 
  @Schema(name = "title", description = "Желаемая должность", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("title")
  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public ResumeResumeNanoWithUrl url(String url) {
    this.url = url;
    return this;
  }

  /**
   * Ссылка на получение элементов
   * @return url
  */
  @NotNull 
  @Schema(name = "url", description = "Ссылка на получение элементов", requiredMode = Schema.RequiredMode.REQUIRED)
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
    ResumeResumeNanoWithUrl resumeResumeNanoWithUrl = (ResumeResumeNanoWithUrl) o;
    return Objects.equals(this.alternateUrl, resumeResumeNanoWithUrl.alternateUrl) &&
        Objects.equals(this.id, resumeResumeNanoWithUrl.id) &&
        Objects.equals(this.title, resumeResumeNanoWithUrl.title) &&
        Objects.equals(this.url, resumeResumeNanoWithUrl.url);
  }

  @Override
  public int hashCode() {
    return Objects.hash(alternateUrl, id, title, url);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ResumeResumeNanoWithUrl {\n");
    sb.append("    alternateUrl: ").append(toIndentedString(alternateUrl)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
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

