package ru.brobrocode.cadra.client.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.annotation.Generated;
import jakarta.validation.constraints.NotNull;

import java.util.Objects;

/**
 * IncludesIdNameUrl
 */

@JsonTypeName("_IncludesIdNameUrl")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2025-08-17T15:41:09.394389505+05:00[Asia/Yekaterinburg]", comments = "Generator version: 7.6.0")
public class IncludesIdNameUrl {

  private String id;

  private String name;

  private String url;

  public IncludesIdNameUrl() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public IncludesIdNameUrl(String id, String name, String url) {
    this.id = id;
    this.name = name;
    this.url = url;
  }

  public IncludesIdNameUrl id(String id) {
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

  public IncludesIdNameUrl name(String name) {
    this.name = name;
    return this;
  }

  /**
   * Название
   * @return name
  */
  @NotNull 
  @Schema(name = "name", description = "Название", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("name")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public IncludesIdNameUrl url(String url) {
    this.url = url;
    return this;
  }

  /**
   * URL получения информации о поле
   * @return url
  */
  @NotNull 
  @Schema(name = "url", description = "URL получения информации о поле", requiredMode = Schema.RequiredMode.REQUIRED)
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
    IncludesIdNameUrl includesIdNameUrl = (IncludesIdNameUrl) o;
    return Objects.equals(this.id, includesIdNameUrl.id) &&
        Objects.equals(this.name, includesIdNameUrl.name) &&
        Objects.equals(this.url, includesIdNameUrl.url);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, url);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IncludesIdNameUrl {\n");
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

