package ru.brobrocode.cadra.client.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.annotation.Generated;
import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

import java.math.BigDecimal;
import java.util.Objects;

/**
 * Обложка видео вакансии, либо &#x60;null&#x60;, если обложка отсутствует
 */

@Schema(name = "VacancyVideoVacancyCoverPicture", description = "Обложка видео вакансии, либо `null`, если обложка отсутствует")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2025-08-17T15:41:09.394389505+05:00[Asia/Yekaterinburg]", comments = "Generator version: 7.6.0")
public class VacancyVideoVacancyCoverPicture {

  private BigDecimal resizedHeight;

  private String resizedPath;

  private BigDecimal resizedWidth;

  public VacancyVideoVacancyCoverPicture() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public VacancyVideoVacancyCoverPicture(BigDecimal resizedHeight, String resizedPath, BigDecimal resizedWidth) {
    this.resizedHeight = resizedHeight;
    this.resizedPath = resizedPath;
    this.resizedWidth = resizedWidth;
  }

  public VacancyVideoVacancyCoverPicture resizedHeight(BigDecimal resizedHeight) {
    this.resizedHeight = resizedHeight;
    return this;
  }

  /**
   * Высота изображения
   * @return resizedHeight
  */
  @NotNull @Valid 
  @Schema(name = "resized_height", description = "Высота изображения", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("resized_height")
  public BigDecimal getResizedHeight() {
    return resizedHeight;
  }

  public void setResizedHeight(BigDecimal resizedHeight) {
    this.resizedHeight = resizedHeight;
  }

  public VacancyVideoVacancyCoverPicture resizedPath(String resizedPath) {
    this.resizedPath = resizedPath;
    return this;
  }

  /**
   * Ссылка на изображение
   * @return resizedPath
  */
  @NotNull @Size(min = 1) 
  @Schema(name = "resized_path", description = "Ссылка на изображение", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("resized_path")
  public String getResizedPath() {
    return resizedPath;
  }

  public void setResizedPath(String resizedPath) {
    this.resizedPath = resizedPath;
  }

  public VacancyVideoVacancyCoverPicture resizedWidth(BigDecimal resizedWidth) {
    this.resizedWidth = resizedWidth;
    return this;
  }

  /**
   * Ширина изображения
   * @return resizedWidth
  */
  @NotNull @Valid 
  @Schema(name = "resized_width", description = "Ширина изображения", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("resized_width")
  public BigDecimal getResizedWidth() {
    return resizedWidth;
  }

  public void setResizedWidth(BigDecimal resizedWidth) {
    this.resizedWidth = resizedWidth;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    VacancyVideoVacancyCoverPicture vacancyVideoVacancyCoverPicture = (VacancyVideoVacancyCoverPicture) o;
    return Objects.equals(this.resizedHeight, vacancyVideoVacancyCoverPicture.resizedHeight) &&
        Objects.equals(this.resizedPath, vacancyVideoVacancyCoverPicture.resizedPath) &&
        Objects.equals(this.resizedWidth, vacancyVideoVacancyCoverPicture.resizedWidth);
  }

  @Override
  public int hashCode() {
    return Objects.hash(resizedHeight, resizedPath, resizedWidth);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class VacancyVideoVacancyCoverPicture {\n");
    sb.append("    resizedHeight: ").append(toIndentedString(resizedHeight)).append("\n");
    sb.append("    resizedPath: ").append(toIndentedString(resizedPath)).append("\n");
    sb.append("    resizedWidth: ").append(toIndentedString(resizedWidth)).append("\n");
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

