package ru.brobrocode.cadra.client.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.annotation.Generated;
import jakarta.validation.constraints.NotNull;

import java.util.Objects;

/**
 * ResumeObjectsPhotoNoId
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2025-08-17T15:41:09.394389505+05:00[Asia/Yekaterinburg]", comments = "Generator version: 7.6.0")
public class ResumeObjectsPhotoNoId {

  @Deprecated
  private String _40 = null;

  @Deprecated
  private String _100 = null;

  @Deprecated
  private String _500 = null;

  private String medium;

  private String small;

  public ResumeObjectsPhotoNoId() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public ResumeObjectsPhotoNoId(String medium, String small) {
    this.medium = medium;
    this.small = small;
  }

  public ResumeObjectsPhotoNoId _40(String _40) {
    this._40 = _40;
    return this;
  }

  /**
   * URL изображения размером 40x40 пикселей. Изображение по данному URL доступно ограниченное время после получения ответа. Приложение должно быть готово к тому, что на запрос изображения вернется ошибка `404 Not Found`
   * @return _40
   * @deprecated
  */
  
  @Schema(name = "40", description = "URL изображения размером 40x40 пикселей. Изображение по данному URL доступно ограниченное время после получения ответа. Приложение должно быть готово к тому, что на запрос изображения вернется ошибка `404 Not Found`", deprecated = true, requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("40")
  @Deprecated
  public String get40() {
    return _40;
  }

  /**
   * @deprecated
  */
  @Deprecated
  public void set40(String _40) {
    this._40 = _40;
  }

  public ResumeObjectsPhotoNoId _100(String _100) {
    this._100 = _100;
    return this;
  }

  /**
   * URL изображения размером 100x100 пикселей. Изображение по данному URL доступно ограниченное время после получения ответа. Приложение должно быть готово к тому, что на запрос изображения вернется ошибка `404 Not Found`
   * @return _100
   * @deprecated
  */
  
  @Schema(name = "100", description = "URL изображения размером 100x100 пикселей. Изображение по данному URL доступно ограниченное время после получения ответа. Приложение должно быть готово к тому, что на запрос изображения вернется ошибка `404 Not Found`", deprecated = true, requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("100")
  @Deprecated
  public String get100() {
    return _100;
  }

  /**
   * @deprecated
  */
  @Deprecated
  public void set100(String _100) {
    this._100 = _100;
  }

  public ResumeObjectsPhotoNoId _500(String _500) {
    this._500 = _500;
    return this;
  }

  /**
   * URL изображения размером 500x500 пикселей. Изображение по данному URL доступно ограниченное время после получения ответа. Приложение должно быть готово к тому, что на запрос изображения вернется ошибка `404 Not Found`
   * @return _500
   * @deprecated
  */
  
  @Schema(name = "500", description = "URL изображения размером 500x500 пикселей. Изображение по данному URL доступно ограниченное время после получения ответа. Приложение должно быть готово к тому, что на запрос изображения вернется ошибка `404 Not Found`", deprecated = true, requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("500")
  @Deprecated
  public String get500() {
    return _500;
  }

  /**
   * @deprecated
  */
  @Deprecated
  public void set500(String _500) {
    this._500 = _500;
  }

  public ResumeObjectsPhotoNoId medium(String medium) {
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

  public ResumeObjectsPhotoNoId small(String small) {
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
    ResumeObjectsPhotoNoId resumeObjectsPhotoNoId = (ResumeObjectsPhotoNoId) o;
    return Objects.equals(this._40, resumeObjectsPhotoNoId._40) &&
        Objects.equals(this._100, resumeObjectsPhotoNoId._100) &&
        Objects.equals(this._500, resumeObjectsPhotoNoId._500) &&
        Objects.equals(this.medium, resumeObjectsPhotoNoId.medium) &&
        Objects.equals(this.small, resumeObjectsPhotoNoId.small);
  }

  @Override
  public int hashCode() {
    return Objects.hash(_40, _100, _500, medium, small);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ResumeObjectsPhotoNoId {\n");
    sb.append("    _40: ").append(toIndentedString(_40)).append("\n");
    sb.append("    _100: ").append(toIndentedString(_100)).append("\n");
    sb.append("    _500: ").append(toIndentedString(_500)).append("\n");
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

