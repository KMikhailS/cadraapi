package ru.brobrocode.cadra.client.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.annotation.Generated;
import jakarta.validation.constraints.NotNull;

import java.util.Objects;

/**
 * VacancyInsiderInterview
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2025-08-17T15:41:09.394389505+05:00[Asia/Yekaterinburg]", comments = "Generator version: 7.6.0")
public class VacancyInsiderInterview {

  private String id;

  private String url;

  public VacancyInsiderInterview() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public VacancyInsiderInterview(String id, String url) {
    this.id = id;
    this.url = url;
  }

  public VacancyInsiderInterview id(String id) {
    this.id = id;
    return this;
  }

  /**
   * Идентификатор интервью
   * @return id
  */
  @NotNull 
  @Schema(name = "id", description = "Идентификатор интервью", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("id")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public VacancyInsiderInterview url(String url) {
    this.url = url;
    return this;
  }

  /**
   * Адрес страницы, содержащей интервью
   * @return url
  */
  @NotNull 
  @Schema(name = "url", description = "Адрес страницы, содержащей интервью", requiredMode = Schema.RequiredMode.REQUIRED)
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
    VacancyInsiderInterview vacancyInsiderInterview = (VacancyInsiderInterview) o;
    return Objects.equals(this.id, vacancyInsiderInterview.id) &&
        Objects.equals(this.url, vacancyInsiderInterview.url);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, url);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class VacancyInsiderInterview {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
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

