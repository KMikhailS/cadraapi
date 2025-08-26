package ru.brobrocode.cadra.client.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.annotation.Generated;
import jakarta.validation.constraints.NotNull;

import java.util.Objects;

/**
 * Фотография пользователя (см. [Артефакты](#tag/Rabota-s-artefaktami))
 */

@Schema(name = "ProfilePhoto", description = "Фотография пользователя (см. [Артефакты](#tag/Rabota-s-artefaktami))")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2025-08-17T15:41:09.394389505+05:00[Asia/Yekaterinburg]", comments = "Generator version: 7.6.0")
public class ProfilePhoto {

  @Deprecated
  private String _40;

  @Deprecated
  private String _100;

  @Deprecated
  private String _500;

  private String id;

  private String medium;

  private String small;

  public ProfilePhoto() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public ProfilePhoto(String id, String medium, String small) {
    this.id = id;
    this.medium = medium;
    this.small = small;
  }

  public ProfilePhoto _40(String _40) {
    this._40 = _40;
    return this;
  }

  /**
   * Get _40
   * @return _40
   * @deprecated
  */
  
  @Schema(name = "40", deprecated = true, requiredMode = Schema.RequiredMode.NOT_REQUIRED)
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

  public ProfilePhoto _100(String _100) {
    this._100 = _100;
    return this;
  }

  /**
   * Get _100
   * @return _100
   * @deprecated
  */
  
  @Schema(name = "100", deprecated = true, requiredMode = Schema.RequiredMode.NOT_REQUIRED)
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

  public ProfilePhoto _500(String _500) {
    this._500 = _500;
    return this;
  }

  /**
   * Get _500
   * @return _500
   * @deprecated
  */
  
  @Schema(name = "500", deprecated = true, requiredMode = Schema.RequiredMode.NOT_REQUIRED)
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

  public ProfilePhoto id(String id) {
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

  public ProfilePhoto medium(String medium) {
    this.medium = medium;
    return this;
  }

  /**
   * URL среднего по размеру изображения. Изображение по данному url доступно ограниченное время, после получения ответа. Приложение должно быть готово к тому, что на запрос изображения вернётся `404 Not Found` 
   * @return medium
  */
  @NotNull 
  @Schema(name = "medium", description = "URL среднего по размеру изображения. Изображение по данному url доступно ограниченное время, после получения ответа. Приложение должно быть готово к тому, что на запрос изображения вернётся `404 Not Found` ", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("medium")
  public String getMedium() {
    return medium;
  }

  public void setMedium(String medium) {
    this.medium = medium;
  }

  public ProfilePhoto small(String small) {
    this.small = small;
    return this;
  }

  /**
   * URL уменьшенного изображения. Изображение по данному url доступно ограниченное время, после получения ответа. Приложение должно быть готово к тому, что на запрос изображения вернётся `404 Not Found` 
   * @return small
  */
  @NotNull 
  @Schema(name = "small", description = "URL уменьшенного изображения. Изображение по данному url доступно ограниченное время, после получения ответа. Приложение должно быть готово к тому, что на запрос изображения вернётся `404 Not Found` ", requiredMode = Schema.RequiredMode.REQUIRED)
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
    ProfilePhoto profilePhoto = (ProfilePhoto) o;
    return Objects.equals(this._40, profilePhoto._40) &&
        Objects.equals(this._100, profilePhoto._100) &&
        Objects.equals(this._500, profilePhoto._500) &&
        Objects.equals(this.id, profilePhoto.id) &&
        Objects.equals(this.medium, profilePhoto.medium) &&
        Objects.equals(this.small, profilePhoto.small);
  }

  @Override
  public int hashCode() {
    return Objects.hash(_40, _100, _500, id, medium, small);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ProfilePhoto {\n");
    sb.append("    _40: ").append(toIndentedString(_40)).append("\n");
    sb.append("    _100: ").append(toIndentedString(_100)).append("\n");
    sb.append("    _500: ").append(toIndentedString(_500)).append("\n");
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

