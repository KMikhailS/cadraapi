package ru.brobrocode.cadra.client.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.annotation.Generated;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

import java.util.Objects;

/**
 * Данные по видео
 */

@Schema(name = "VacancyVideoVacancyVideo", description = "Данные по видео")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2025-08-17T15:41:09.394389505+05:00[Asia/Yekaterinburg]", comments = "Generator version: 7.6.0")
public class VacancyVideoVacancyVideo {

  private String uploadId;

  private String url;

  public VacancyVideoVacancyVideo() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public VacancyVideoVacancyVideo(String uploadId, String url) {
    this.uploadId = uploadId;
    this.url = url;
  }

  public VacancyVideoVacancyVideo uploadId(String uploadId) {
    this.uploadId = uploadId;
    return this;
  }

  /**
   * Идентификатор видео
   * @return uploadId
  */
  @NotNull @Size(min = 1) 
  @Schema(name = "upload_id", description = "Идентификатор видео", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("upload_id")
  public String getUploadId() {
    return uploadId;
  }

  public void setUploadId(String uploadId) {
    this.uploadId = uploadId;
  }

  public VacancyVideoVacancyVideo url(String url) {
    this.url = url;
    return this;
  }

  /**
   * Ссылка на видео
   * @return url
  */
  @NotNull @Size(min = 1) 
  @Schema(name = "url", description = "Ссылка на видео", requiredMode = Schema.RequiredMode.REQUIRED)
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
    VacancyVideoVacancyVideo vacancyVideoVacancyVideo = (VacancyVideoVacancyVideo) o;
    return Objects.equals(this.uploadId, vacancyVideoVacancyVideo.uploadId) &&
        Objects.equals(this.url, vacancyVideoVacancyVideo.url);
  }

  @Override
  public int hashCode() {
    return Objects.hash(uploadId, url);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class VacancyVideoVacancyVideo {\n");
    sb.append("    uploadId: ").append(toIndentedString(uploadId)).append("\n");
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

