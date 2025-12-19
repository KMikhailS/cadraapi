package ru.brobrocode.cadra.client.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.annotation.Generated;
import jakarta.validation.constraints.NotNull;

import java.util.Objects;

/**
 * ProfileVideosListItemsInnerDownloadUrl
 */

@JsonTypeName("ProfileVideosList_items_inner_download_url")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2025-08-17T15:41:09.394389505+05:00[Asia/Yekaterinburg]", comments = "Generator version: 7.6.0")
public class ProfileVideosListItemsInnerDownloadUrl {

  private String expiresAt;

  private String url;

  public ProfileVideosListItemsInnerDownloadUrl() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public ProfileVideosListItemsInnerDownloadUrl(String expiresAt, String url) {
    this.expiresAt = expiresAt;
    this.url = url;
  }

  public ProfileVideosListItemsInnerDownloadUrl expiresAt(String expiresAt) {
    this.expiresAt = expiresAt;
    return this;
  }

  /**
   * Дата и время, до которых действительна ссылка
   * @return expiresAt
  */
  @NotNull 
  @Schema(name = "expires_at", description = "Дата и время, до которых действительна ссылка", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("expires_at")
  public String getExpiresAt() {
    return expiresAt;
  }

  public void setExpiresAt(String expiresAt) {
    this.expiresAt = expiresAt;
  }

  public ProfileVideosListItemsInnerDownloadUrl url(String url) {
    this.url = url;
    return this;
  }

  /**
   * Ссылка на скачивание видео
   * @return url
  */
  @NotNull 
  @Schema(name = "url", description = "Ссылка на скачивание видео", requiredMode = Schema.RequiredMode.REQUIRED)
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
    ProfileVideosListItemsInnerDownloadUrl profileVideosListItemsInnerDownloadUrl = (ProfileVideosListItemsInnerDownloadUrl) o;
    return Objects.equals(this.expiresAt, profileVideosListItemsInnerDownloadUrl.expiresAt) &&
        Objects.equals(this.url, profileVideosListItemsInnerDownloadUrl.url);
  }

  @Override
  public int hashCode() {
    return Objects.hash(expiresAt, url);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ProfileVideosListItemsInnerDownloadUrl {\n");
    sb.append("    expiresAt: ").append(toIndentedString(expiresAt)).append("\n");
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

