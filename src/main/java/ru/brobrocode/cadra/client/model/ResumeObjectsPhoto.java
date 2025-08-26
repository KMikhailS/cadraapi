package ru.brobrocode.cadra.client.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.annotation.Generated;
import jakarta.validation.constraints.NotNull;

import java.util.Objects;

/**
 * Значение может быть &#x60;null&#x60;, если у работодателя отсутствует брендирование страницы
 */

@Schema(name = "ResumeObjectsPhoto", description = "Значение может быть `null`, если у работодателя отсутствует брендирование страницы")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2025-08-17T15:41:09.394389505+05:00[Asia/Yekaterinburg]", comments = "Generator version: 7.6.0")
public class ResumeObjectsPhoto {

  @Deprecated
  private String _40 = null;

  @Deprecated
  private String _100 = null;

  @Deprecated
  private String _500 = null;

  private String medium;

  private String small;

  private String id;

  public ResumeObjectsPhoto() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public ResumeObjectsPhoto(String medium, String small, String id) {
    this.medium = medium;
    this.small = small;
    this.id = id;
  }

  public ResumeObjectsPhoto _40(String _40) {
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

  public ResumeObjectsPhoto _100(String _100) {
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

  public ResumeObjectsPhoto _500(String _500) {
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

  public ResumeObjectsPhoto medium(String medium) {
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

  public ResumeObjectsPhoto small(String small) {
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

  public ResumeObjectsPhoto id(String id) {
    this.id = id;
    return this;
  }

  /**
   * Идентификатор
   * @return id
  */
  @NotNull 
  @Schema(name = "id", description = "Идентификатор", requiredMode = Schema.RequiredMode.REQUIRED)
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
    ResumeObjectsPhoto resumeObjectsPhoto = (ResumeObjectsPhoto) o;
    return Objects.equals(this._40, resumeObjectsPhoto._40) &&
        Objects.equals(this._100, resumeObjectsPhoto._100) &&
        Objects.equals(this._500, resumeObjectsPhoto._500) &&
        Objects.equals(this.medium, resumeObjectsPhoto.medium) &&
        Objects.equals(this.small, resumeObjectsPhoto.small) &&
        Objects.equals(this.id, resumeObjectsPhoto.id);
  }

  @Override
  public int hashCode() {
    return Objects.hash(_40, _100, _500, medium, small, id);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ResumeObjectsPhoto {\n");
    sb.append("    _40: ").append(toIndentedString(_40)).append("\n");
    sb.append("    _100: ").append(toIndentedString(_100)).append("\n");
    sb.append("    _500: ").append(toIndentedString(_500)).append("\n");
    sb.append("    medium: ").append(toIndentedString(medium)).append("\n");
    sb.append("    small: ").append(toIndentedString(small)).append("\n");
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

