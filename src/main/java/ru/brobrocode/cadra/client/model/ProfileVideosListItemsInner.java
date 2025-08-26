package ru.brobrocode.cadra.client.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.annotation.Generated;
import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;

import java.util.Objects;

/**
 * ProfileVideosListItemsInner
 */

@JsonTypeName("ProfileVideosList_items_inner")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2025-08-17T15:41:09.394389505+05:00[Asia/Yekaterinburg]", comments = "Generator version: 7.6.0")
public class ProfileVideosListItemsInner {

  private ProfileVideosListItemsInnerDownloadUrl downloadUrl;

  private String id;

  public ProfileVideosListItemsInner() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public ProfileVideosListItemsInner(ProfileVideosListItemsInnerDownloadUrl downloadUrl, String id) {
    this.downloadUrl = downloadUrl;
    this.id = id;
  }

  public ProfileVideosListItemsInner downloadUrl(ProfileVideosListItemsInnerDownloadUrl downloadUrl) {
    this.downloadUrl = downloadUrl;
    return this;
  }

  /**
   * Get downloadUrl
   * @return downloadUrl
  */
  @NotNull @Valid 
  @Schema(name = "download_url", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("download_url")
  public ProfileVideosListItemsInnerDownloadUrl getDownloadUrl() {
    return downloadUrl;
  }

  public void setDownloadUrl(ProfileVideosListItemsInnerDownloadUrl downloadUrl) {
    this.downloadUrl = downloadUrl;
  }

  public ProfileVideosListItemsInner id(String id) {
    this.id = id;
    return this;
  }

  /**
   * Идентификатор видео
   * @return id
  */
  @NotNull 
  @Schema(name = "id", description = "Идентификатор видео", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("id")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ProfileVideosListItemsInner profileVideosListItemsInner = (ProfileVideosListItemsInner) o;
    return Objects.equals(this.downloadUrl, profileVideosListItemsInner.downloadUrl) &&
        Objects.equals(this.id, profileVideosListItemsInner.id);
  }

  @Override
  public int hashCode() {
    return Objects.hash(downloadUrl, id);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ProfileVideosListItemsInner {\n");
    sb.append("    downloadUrl: ").append(toIndentedString(downloadUrl)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
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

