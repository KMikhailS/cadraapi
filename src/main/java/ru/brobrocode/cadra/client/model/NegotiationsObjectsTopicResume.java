package ru.brobrocode.cadra.client.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.annotation.Generated;
import jakarta.validation.constraints.NotNull;

import java.util.Objects;

/**
 * NegotiationsObjectsTopicResume
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2025-08-17T15:41:09.394389505+05:00[Asia/Yekaterinburg]", comments = "Generator version: 7.6.0")
public class NegotiationsObjectsTopicResume {

  private String alternateUrl;

  private String id;

  private String title = null;

  private String url;

  private String createdAt;

  private String updatedAt;

  public NegotiationsObjectsTopicResume() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public NegotiationsObjectsTopicResume(String alternateUrl, String id, String title, String url, String createdAt, String updatedAt) {
    this.alternateUrl = alternateUrl;
    this.id = id;
    this.title = title;
    this.url = url;
    this.createdAt = createdAt;
    this.updatedAt = updatedAt;
  }

  public NegotiationsObjectsTopicResume alternateUrl(String alternateUrl) {
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

  public NegotiationsObjectsTopicResume id(String id) {
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

  public NegotiationsObjectsTopicResume title(String title) {
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

  public NegotiationsObjectsTopicResume url(String url) {
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

  public NegotiationsObjectsTopicResume createdAt(String createdAt) {
    this.createdAt = createdAt;
    return this;
  }

  /**
   * Дата и время создания резюме
   * @return createdAt
  */
  @NotNull 
  @Schema(name = "created_at", description = "Дата и время создания резюме", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("created_at")
  public String getCreatedAt() {
    return createdAt;
  }

  public void setCreatedAt(String createdAt) {
    this.createdAt = createdAt;
  }

  public NegotiationsObjectsTopicResume updatedAt(String updatedAt) {
    this.updatedAt = updatedAt;
    return this;
  }

  /**
   * Дата и время обновления резюме
   * @return updatedAt
  */
  @NotNull 
  @Schema(name = "updated_at", description = "Дата и время обновления резюме", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("updated_at")
  public String getUpdatedAt() {
    return updatedAt;
  }

  public void setUpdatedAt(String updatedAt) {
    this.updatedAt = updatedAt;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    NegotiationsObjectsTopicResume negotiationsObjectsTopicResume = (NegotiationsObjectsTopicResume) o;
    return Objects.equals(this.alternateUrl, negotiationsObjectsTopicResume.alternateUrl) &&
        Objects.equals(this.id, negotiationsObjectsTopicResume.id) &&
        Objects.equals(this.title, negotiationsObjectsTopicResume.title) &&
        Objects.equals(this.url, negotiationsObjectsTopicResume.url) &&
        Objects.equals(this.createdAt, negotiationsObjectsTopicResume.createdAt) &&
        Objects.equals(this.updatedAt, negotiationsObjectsTopicResume.updatedAt);
  }

  @Override
  public int hashCode() {
    return Objects.hash(alternateUrl, id, title, url, createdAt, updatedAt);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class NegotiationsObjectsTopicResume {\n");
    sb.append("    alternateUrl: ").append(toIndentedString(alternateUrl)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
    sb.append("    url: ").append(toIndentedString(url)).append("\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    updatedAt: ").append(toIndentedString(updatedAt)).append("\n");
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

