package ru.brobrocode.cadra.client.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.annotation.Generated;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

import java.util.Objects;

/**
 * Обложка видео сниппета
 */

@Schema(name = "VacancyVideoVacancySnippetPicture", description = "Обложка видео сниппета")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2025-08-17T15:41:09.394389505+05:00[Asia/Yekaterinburg]", comments = "Generator version: 7.6.0")
public class VacancyVideoVacancySnippetPicture {

  private String url;

  public VacancyVideoVacancySnippetPicture() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public VacancyVideoVacancySnippetPicture(String url) {
    this.url = url;
  }

  public VacancyVideoVacancySnippetPicture url(String url) {
    this.url = url;
    return this;
  }

  /**
   * Ссылка на изображение
   * @return url
  */
  @NotNull @Size(min = 1) 
  @Schema(name = "url", description = "Ссылка на изображение", requiredMode = Schema.RequiredMode.REQUIRED)
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
    VacancyVideoVacancySnippetPicture vacancyVideoVacancySnippetPicture = (VacancyVideoVacancySnippetPicture) o;
    return Objects.equals(this.url, vacancyVideoVacancySnippetPicture.url);
  }

  @Override
  public int hashCode() {
    return Objects.hash(url);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class VacancyVideoVacancySnippetPicture {\n");
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

