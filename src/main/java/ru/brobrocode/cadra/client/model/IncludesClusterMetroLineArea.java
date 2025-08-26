package ru.brobrocode.cadra.client.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.annotation.Generated;
import jakarta.validation.constraints.NotNull;

import java.util.Objects;

/**
 * IncludesClusterMetroLineArea
 */

@JsonTypeName("_IncludesClusterMetroLine_area")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2025-08-17T15:41:09.394389505+05:00[Asia/Yekaterinburg]", comments = "Generator version: 7.6.0")
public class IncludesClusterMetroLineArea {

  private String id;

  private String name;

  private String url;

  public IncludesClusterMetroLineArea() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public IncludesClusterMetroLineArea(String id, String name, String url) {
    this.id = id;
    this.name = name;
    this.url = url;
  }

  public IncludesClusterMetroLineArea id(String id) {
    this.id = id;
    return this;
  }

  /**
   * Идентификатор региона из [справочника](#tag/Obshie-spravochniki/operation/get-areas)
   * @return id
  */
  @NotNull 
  @Schema(name = "id", description = "Идентификатор региона из [справочника](#tag/Obshie-spravochniki/operation/get-areas)", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("id")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public IncludesClusterMetroLineArea name(String name) {
    this.name = name;
    return this;
  }

  /**
   * Название региона
   * @return name
  */
  @NotNull 
  @Schema(name = "name", description = "Название региона", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("name")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public IncludesClusterMetroLineArea url(String url) {
    this.url = url;
    return this;
  }

  /**
   * Ссылка на информацию о регионе
   * @return url
  */
  @NotNull 
  @Schema(name = "url", description = "Ссылка на информацию о регионе", requiredMode = Schema.RequiredMode.REQUIRED)
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
    IncludesClusterMetroLineArea includesClusterMetroLineArea = (IncludesClusterMetroLineArea) o;
    return Objects.equals(this.id, includesClusterMetroLineArea.id) &&
        Objects.equals(this.name, includesClusterMetroLineArea.name) &&
        Objects.equals(this.url, includesClusterMetroLineArea.url);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, url);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IncludesClusterMetroLineArea {\n");
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

