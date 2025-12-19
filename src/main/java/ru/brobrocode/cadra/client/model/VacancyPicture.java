package ru.brobrocode.cadra.client.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.annotation.Generated;
import jakarta.validation.Valid;

import java.math.BigDecimal;
import java.util.Objects;

/**
 * VacancyPicture
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2025-08-17T15:41:09.394389505+05:00[Asia/Yekaterinburg]", comments = "Generator version: 7.6.0")
public class VacancyPicture {

  private String blurredPath = null;

  private BigDecimal height;

  private String path;

  private BigDecimal width;

  public VacancyPicture blurredPath(String blurredPath) {
    this.blurredPath = blurredPath;
    return this;
  }

  /**
   * Путь до маленькой (порядка 4% от изначального размера) размытой картинки. При показе ее нужно преобразовать к нужному размеру
   * @return blurredPath
  */
  
  @Schema(name = "blurred_path", description = "Путь до маленькой (порядка 4% от изначального размера) размытой картинки. При показе ее нужно преобразовать к нужному размеру", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("blurred_path")
  public String getBlurredPath() {
    return blurredPath;
  }

  public void setBlurredPath(String blurredPath) {
    this.blurredPath = blurredPath;
  }

  public VacancyPicture height(BigDecimal height) {
    this.height = height;
    return this;
  }

  /**
   * Высота картинки
   * @return height
  */
  @Valid 
  @Schema(name = "height", description = "Высота картинки", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("height")
  public BigDecimal getHeight() {
    return height;
  }

  public void setHeight(BigDecimal height) {
    this.height = height;
  }

  public VacancyPicture path(String path) {
    this.path = path;
    return this;
  }

  /**
   * Адрес картинки
   * @return path
  */
  
  @Schema(name = "path", description = "Адрес картинки", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("path")
  public String getPath() {
    return path;
  }

  public void setPath(String path) {
    this.path = path;
  }

  public VacancyPicture width(BigDecimal width) {
    this.width = width;
    return this;
  }

  /**
   * Ширина картинки
   * @return width
  */
  @Valid 
  @Schema(name = "width", description = "Ширина картинки", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("width")
  public BigDecimal getWidth() {
    return width;
  }

  public void setWidth(BigDecimal width) {
    this.width = width;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    VacancyPicture vacancyPicture = (VacancyPicture) o;
    return Objects.equals(this.blurredPath, vacancyPicture.blurredPath) &&
        Objects.equals(this.height, vacancyPicture.height) &&
        Objects.equals(this.path, vacancyPicture.path) &&
        Objects.equals(this.width, vacancyPicture.width);
  }

  @Override
  public int hashCode() {
    return Objects.hash(blurredPath, height, path, width);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class VacancyPicture {\n");
    sb.append("    blurredPath: ").append(toIndentedString(blurredPath)).append("\n");
    sb.append("    height: ").append(toIndentedString(height)).append("\n");
    sb.append("    path: ").append(toIndentedString(path)).append("\n");
    sb.append("    width: ").append(toIndentedString(width)).append("\n");
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

