package ru.brobrocode.cadra.client.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.annotation.Generated;
import jakarta.validation.constraints.NotNull;

import java.util.Objects;

/**
 * VacancyTemplates
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2025-08-17T15:41:09.394389505+05:00[Asia/Yekaterinburg]", comments = "Generator version: 7.6.0")
public class VacancyTemplates {

  private String id;

  private String name;

  private String url;

  public VacancyTemplates() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public VacancyTemplates(String id, String name, String url) {
    this.id = id;
    this.name = name;
    this.url = url;
  }

  public VacancyTemplates id(String id) {
    this.id = id;
    return this;
  }

  /**
   * Идентификатор шаблона
   * @return id
  */
  @NotNull 
  @Schema(name = "id", description = "Идентификатор шаблона", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("id")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public VacancyTemplates name(String name) {
    this.name = name;
    return this;
  }

  /**
   * Название шаблона
   * @return name
  */
  @NotNull 
  @Schema(name = "name", description = "Название шаблона", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("name")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public VacancyTemplates url(String url) {
    this.url = url;
    return this;
  }

  /**
   * Ссылка на шаблон
   * @return url
  */
  @NotNull 
  @Schema(name = "url", description = "Ссылка на шаблон", requiredMode = Schema.RequiredMode.REQUIRED)
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
    VacancyTemplates vacancyTemplates = (VacancyTemplates) o;
    return Objects.equals(this.id, vacancyTemplates.id) &&
        Objects.equals(this.name, vacancyTemplates.name) &&
        Objects.equals(this.url, vacancyTemplates.url);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, url);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class VacancyTemplates {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
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

