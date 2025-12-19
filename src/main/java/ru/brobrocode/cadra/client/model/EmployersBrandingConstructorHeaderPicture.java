package ru.brobrocode.cadra.client.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.annotation.Generated;
import jakarta.validation.constraints.NotNull;

import java.util.Objects;

/**
 * Изображение из шапки бренд страницы
 */

@Schema(name = "EmployersBrandingConstructorHeaderPicture", description = "Изображение из шапки бренд страницы")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2025-08-17T15:41:09.394389505+05:00[Asia/Yekaterinburg]", comments = "Generator version: 7.6.0")
public class EmployersBrandingConstructorHeaderPicture {

  private String resizedPath;

  public EmployersBrandingConstructorHeaderPicture() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public EmployersBrandingConstructorHeaderPicture(String resizedPath) {
    this.resizedPath = resizedPath;
  }

  public EmployersBrandingConstructorHeaderPicture resizedPath(String resizedPath) {
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
    EmployersBrandingConstructorHeaderPicture employersBrandingConstructorHeaderPicture = (EmployersBrandingConstructorHeaderPicture) o;
    return Objects.equals(this.resizedPath, employersBrandingConstructorHeaderPicture.resizedPath);
  }

  @Override
  public int hashCode() {
    return Objects.hash(resizedPath);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EmployersBrandingConstructorHeaderPicture {\n");
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

