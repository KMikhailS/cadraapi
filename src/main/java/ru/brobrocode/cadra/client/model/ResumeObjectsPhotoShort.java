package ru.brobrocode.cadra.client.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.annotation.Generated;
import jakarta.validation.constraints.NotNull;

import java.util.Objects;

/**
 * ResumeObjectsPhotoShort
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2025-08-17T15:41:09.394389505+05:00[Asia/Yekaterinburg]", comments = "Generator version: 7.6.0")
public class ResumeObjectsPhotoShort {

  private String id;

  private String medium;

  private String small;

  public ResumeObjectsPhotoShort() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public ResumeObjectsPhotoShort(String id, String medium, String small) {
    this.id = id;
    this.medium = medium;
    this.small = small;
  }

  public ResumeObjectsPhotoShort id(String id) {
    this.id = id;
    return this;
  }

  /**
   * Уникальный идентификатор изображения
   * @return id
  */
  @NotNull 
  @Schema(name = "id", description = "Уникальный идентификатор изображения", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("id")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public ResumeObjectsPhotoShort medium(String medium) {
    this.medium = medium;
    return this;
  }

  /**
   * URL среднего по размеру изображения. Изображение по данному URL доступно ограниченное время после получения ответа. Приложение должно быть готово к тому, что на запрос изображения вернется ошибка `404 Not Found`
   * @return medium
  */
  @NotNull 
  @Schema(name = "medium", description = "URL среднего по размеру изображения. Изображение по данному URL доступно ограниченное время после получения ответа. Приложение должно быть готово к тому, что на запрос изображения вернется ошибка `404 Not Found`", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("medium")
  public String getMedium() {
    return medium;
  }

  public void setMedium(String medium) {
    this.medium = medium;
  }

  public ResumeObjectsPhotoShort small(String small) {
    this.small = small;
    return this;
  }

  /**
   * URL уменьшенного изображения. Изображение по данному URL доступно ограниченное время после получения ответа. Приложение должно быть готово к тому, что на запрос изображения вернется ошибка `404 Not Found`
   * @return small
  */
  @NotNull 
  @Schema(name = "small", description = "URL уменьшенного изображения. Изображение по данному URL доступно ограниченное время после получения ответа. Приложение должно быть готово к тому, что на запрос изображения вернется ошибка `404 Not Found`", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("small")
  public String getSmall() {
    return small;
  }

  public void setSmall(String small) {
    this.small = small;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ResumeObjectsPhotoShort resumeObjectsPhotoShort = (ResumeObjectsPhotoShort) o;
    return Objects.equals(this.id, resumeObjectsPhotoShort.id) &&
        Objects.equals(this.medium, resumeObjectsPhotoShort.medium) &&
        Objects.equals(this.small, resumeObjectsPhotoShort.small);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, medium, small);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ResumeObjectsPhotoShort {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    medium: ").append(toIndentedString(medium)).append("\n");
    sb.append("    small: ").append(toIndentedString(small)).append("\n");
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

