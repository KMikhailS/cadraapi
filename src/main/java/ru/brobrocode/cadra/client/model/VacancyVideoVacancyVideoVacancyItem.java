package ru.brobrocode.cadra.client.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.annotation.Generated;
import jakarta.validation.Valid;
import jakarta.validation.constraints.Size;

import java.util.Objects;

/**
 * Данные по видео вакансии, либо &#x60;null&#x60;, если она не подключена
 */

@Schema(name = "VacancyVideoVacancyVideoVacancyItem", description = "Данные по видео вакансии, либо `null`, если она не подключена")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2025-08-17T15:41:09.394389505+05:00[Asia/Yekaterinburg]", comments = "Generator version: 7.6.0")
public class VacancyVideoVacancyVideoVacancyItem {

  private VacancyVideoVacancyCoverPicture coverPicture = null;

  private VacancyVideoVacancySnippetPicture snippetPicture = null;

  @Deprecated
  private String snippetPictureUrl = null;

  private VacancyVideoVacancyVideo snippetVideo = null;

  @Deprecated
  private String snippetVideoUrl = null;

  private VacancyVideoVacancyVideo video;

  @Deprecated
  private String videoUrl;

  public VacancyVideoVacancyVideoVacancyItem coverPicture(VacancyVideoVacancyCoverPicture coverPicture) {
    this.coverPicture = coverPicture;
    return this;
  }

  /**
   * Get coverPicture
   * @return coverPicture
  */
  @Valid 
  @Schema(name = "cover_picture", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("cover_picture")
  public VacancyVideoVacancyCoverPicture getCoverPicture() {
    return coverPicture;
  }

  public void setCoverPicture(VacancyVideoVacancyCoverPicture coverPicture) {
    this.coverPicture = coverPicture;
  }

  public VacancyVideoVacancyVideoVacancyItem snippetPicture(VacancyVideoVacancySnippetPicture snippetPicture) {
    this.snippetPicture = snippetPicture;
    return this;
  }

  /**
   * Get snippetPicture
   * @return snippetPicture
  */
  @Valid 
  @Schema(name = "snippet_picture", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("snippet_picture")
  public VacancyVideoVacancySnippetPicture getSnippetPicture() {
    return snippetPicture;
  }

  public void setSnippetPicture(VacancyVideoVacancySnippetPicture snippetPicture) {
    this.snippetPicture = snippetPicture;
  }

  public VacancyVideoVacancyVideoVacancyItem snippetPictureUrl(String snippetPictureUrl) {
    this.snippetPictureUrl = snippetPictureUrl;
    return this;
  }

  /**
   * Ссылка на версию обложки для сниппета
   * @return snippetPictureUrl
   * @deprecated
  */
  
  @Schema(name = "snippet_picture_url", description = "Ссылка на версию обложки для сниппета", deprecated = true, requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("snippet_picture_url")
  @Deprecated
  public String getSnippetPictureUrl() {
    return snippetPictureUrl;
  }

  /**
   * @deprecated
  */
  @Deprecated
  public void setSnippetPictureUrl(String snippetPictureUrl) {
    this.snippetPictureUrl = snippetPictureUrl;
  }

  public VacancyVideoVacancyVideoVacancyItem snippetVideo(VacancyVideoVacancyVideo snippetVideo) {
    this.snippetVideo = snippetVideo;
    return this;
  }

  /**
   * Get snippetVideo
   * @return snippetVideo
  */
  @Valid 
  @Schema(name = "snippet_video", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("snippet_video")
  public VacancyVideoVacancyVideo getSnippetVideo() {
    return snippetVideo;
  }

  public void setSnippetVideo(VacancyVideoVacancyVideo snippetVideo) {
    this.snippetVideo = snippetVideo;
  }

  public VacancyVideoVacancyVideoVacancyItem snippetVideoUrl(String snippetVideoUrl) {
    this.snippetVideoUrl = snippetVideoUrl;
    return this;
  }

  /**
   * Ссылка на версию видео для сниппета
   * @return snippetVideoUrl
   * @deprecated
  */
  
  @Schema(name = "snippet_video_url", description = "Ссылка на версию видео для сниппета", deprecated = true, requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("snippet_video_url")
  @Deprecated
  public String getSnippetVideoUrl() {
    return snippetVideoUrl;
  }

  /**
   * @deprecated
  */
  @Deprecated
  public void setSnippetVideoUrl(String snippetVideoUrl) {
    this.snippetVideoUrl = snippetVideoUrl;
  }

  public VacancyVideoVacancyVideoVacancyItem video(VacancyVideoVacancyVideo video) {
    this.video = video;
    return this;
  }

  /**
   * Get video
   * @return video
  */
  @Valid 
  @Schema(name = "video", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("video")
  public VacancyVideoVacancyVideo getVideo() {
    return video;
  }

  public void setVideo(VacancyVideoVacancyVideo video) {
    this.video = video;
  }

  public VacancyVideoVacancyVideoVacancyItem videoUrl(String videoUrl) {
    this.videoUrl = videoUrl;
    return this;
  }

  /**
   * Ссылка для скачивания видео
   * @return videoUrl
   * @deprecated
  */
  @Size(min = 1) 
  @Schema(name = "video_url", description = "Ссылка для скачивания видео", deprecated = true, requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("video_url")
  @Deprecated
  public String getVideoUrl() {
    return videoUrl;
  }

  /**
   * @deprecated
  */
  @Deprecated
  public void setVideoUrl(String videoUrl) {
    this.videoUrl = videoUrl;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    VacancyVideoVacancyVideoVacancyItem vacancyVideoVacancyVideoVacancyItem = (VacancyVideoVacancyVideoVacancyItem) o;
    return Objects.equals(this.coverPicture, vacancyVideoVacancyVideoVacancyItem.coverPicture) &&
        Objects.equals(this.snippetPicture, vacancyVideoVacancyVideoVacancyItem.snippetPicture) &&
        Objects.equals(this.snippetPictureUrl, vacancyVideoVacancyVideoVacancyItem.snippetPictureUrl) &&
        Objects.equals(this.snippetVideo, vacancyVideoVacancyVideoVacancyItem.snippetVideo) &&
        Objects.equals(this.snippetVideoUrl, vacancyVideoVacancyVideoVacancyItem.snippetVideoUrl) &&
        Objects.equals(this.video, vacancyVideoVacancyVideoVacancyItem.video) &&
        Objects.equals(this.videoUrl, vacancyVideoVacancyVideoVacancyItem.videoUrl);
  }

  @Override
  public int hashCode() {
    return Objects.hash(coverPicture, snippetPicture, snippetPictureUrl, snippetVideo, snippetVideoUrl, video, videoUrl);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class VacancyVideoVacancyVideoVacancyItem {\n");
    sb.append("    coverPicture: ").append(toIndentedString(coverPicture)).append("\n");
    sb.append("    snippetPicture: ").append(toIndentedString(snippetPicture)).append("\n");
    sb.append("    snippetPictureUrl: ").append(toIndentedString(snippetPictureUrl)).append("\n");
    sb.append("    snippetVideo: ").append(toIndentedString(snippetVideo)).append("\n");
    sb.append("    snippetVideoUrl: ").append(toIndentedString(snippetVideoUrl)).append("\n");
    sb.append("    video: ").append(toIndentedString(video)).append("\n");
    sb.append("    videoUrl: ").append(toIndentedString(videoUrl)).append("\n");
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

