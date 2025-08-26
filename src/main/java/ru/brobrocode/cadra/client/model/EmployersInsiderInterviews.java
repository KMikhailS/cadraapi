package ru.brobrocode.cadra.client.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.annotation.Generated;
import jakarta.validation.constraints.NotNull;

import java.util.Objects;

/**
 * EmployersInsiderInterviews
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2025-08-17T15:41:09.394389505+05:00[Asia/Yekaterinburg]", comments = "Generator version: 7.6.0")
public class EmployersInsiderInterviews {

  private String id;

  private String title;

  private String url;

  public EmployersInsiderInterviews() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public EmployersInsiderInterviews(String id, String title, String url) {
    this.id = id;
    this.title = title;
    this.url = url;
  }

  public EmployersInsiderInterviews id(String id) {
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

  public EmployersInsiderInterviews title(String title) {
    this.title = title;
    return this;
  }

  /**
   * Заголовок интервью
   * @return title
  */
  @NotNull 
  @Schema(name = "title", description = "Заголовок интервью", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("title")
  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public EmployersInsiderInterviews url(String url) {
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
    EmployersInsiderInterviews employersInsiderInterviews = (EmployersInsiderInterviews) o;
    return Objects.equals(this.id, employersInsiderInterviews.id) &&
        Objects.equals(this.title, employersInsiderInterviews.title) &&
        Objects.equals(this.url, employersInsiderInterviews.url);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, title, url);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EmployersInsiderInterviews {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
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

