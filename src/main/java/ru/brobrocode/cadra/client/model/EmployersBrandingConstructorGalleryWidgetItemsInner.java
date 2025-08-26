package ru.brobrocode.cadra.client.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.annotation.Generated;
import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;

import java.math.BigDecimal;
import java.util.Objects;

/**
 * EmployersBrandingConstructorGalleryWidgetItemsInner
 */

@JsonTypeName("EmployersBrandingConstructorGalleryWidget_items_inner")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2025-08-17T15:41:09.394389505+05:00[Asia/Yekaterinburg]", comments = "Generator version: 7.6.0")
public class EmployersBrandingConstructorGalleryWidgetItemsInner {

  private BigDecimal pictureId;

  private String resizedPath;

  public EmployersBrandingConstructorGalleryWidgetItemsInner() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public EmployersBrandingConstructorGalleryWidgetItemsInner(BigDecimal pictureId, String resizedPath) {
    this.pictureId = pictureId;
    this.resizedPath = resizedPath;
  }

  public EmployersBrandingConstructorGalleryWidgetItemsInner pictureId(BigDecimal pictureId) {
    this.pictureId = pictureId;
    return this;
  }

  /**
   * Идентификатор изображения
   * @return pictureId
  */
  @NotNull @Valid 
  @Schema(name = "picture_id", description = "Идентификатор изображения", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("picture_id")
  public BigDecimal getPictureId() {
    return pictureId;
  }

  public void setPictureId(BigDecimal pictureId) {
    this.pictureId = pictureId;
  }

  public EmployersBrandingConstructorGalleryWidgetItemsInner resizedPath(String resizedPath) {
    this.resizedPath = resizedPath;
    return this;
  }

  /**
   * Путь к изображению на cdn хранилище
   * @return resizedPath
  */
  @NotNull 
  @Schema(name = "resized_path", description = "Путь к изображению на cdn хранилище", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("resized_path")
  public String getResizedPath() {
    return resizedPath;
  }

  public void setResizedPath(String resizedPath) {
    this.resizedPath = resizedPath;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EmployersBrandingConstructorGalleryWidgetItemsInner employersBrandingConstructorGalleryWidgetItemsInner = (EmployersBrandingConstructorGalleryWidgetItemsInner) o;
    return Objects.equals(this.pictureId, employersBrandingConstructorGalleryWidgetItemsInner.pictureId) &&
        Objects.equals(this.resizedPath, employersBrandingConstructorGalleryWidgetItemsInner.resizedPath);
  }

  @Override
  public int hashCode() {
    return Objects.hash(pictureId, resizedPath);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EmployersBrandingConstructorGalleryWidgetItemsInner {\n");
    sb.append("    pictureId: ").append(toIndentedString(pictureId)).append("\n");
    sb.append("    resizedPath: ").append(toIndentedString(resizedPath)).append("\n");
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

