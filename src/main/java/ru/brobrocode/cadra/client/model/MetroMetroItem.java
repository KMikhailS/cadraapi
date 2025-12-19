package ru.brobrocode.cadra.client.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.annotation.Generated;
import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * MetroMetroItem
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2025-08-17T15:41:09.394389505+05:00[Asia/Yekaterinburg]", comments = "Generator version: 7.6.0")
public class MetroMetroItem {

  private String id;

  @Valid
  private List<@Valid MetroMetroLineWithStations> lines = new ArrayList<>();

  private String name;

  private String url;

  public MetroMetroItem() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public MetroMetroItem(String id, List<@Valid MetroMetroLineWithStations> lines, String name, String url) {
    this.id = id;
    this.lines = lines;
    this.name = name;
    this.url = url;
  }

  public MetroMetroItem id(String id) {
    this.id = id;
    return this;
  }

  /**
   * Идентификатор города
   * @return id
  */
  @NotNull 
  @Schema(name = "id", description = "Идентификатор города", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("id")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public MetroMetroItem lines(List<@Valid MetroMetroLineWithStations> lines) {
    this.lines = lines;
    return this;
  }

  public MetroMetroItem addLinesItem(MetroMetroLineWithStations linesItem) {
    if (this.lines == null) {
      this.lines = new ArrayList<>();
    }
    this.lines.add(linesItem);
    return this;
  }

  /**
   * Список линий метро в городе
   * @return lines
  */
  @NotNull @Valid 
  @Schema(name = "lines", description = "Список линий метро в городе", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("lines")
  public List<@Valid MetroMetroLineWithStations> getLines() {
    return lines;
  }

  public void setLines(List<@Valid MetroMetroLineWithStations> lines) {
    this.lines = lines;
  }

  public MetroMetroItem name(String name) {
    this.name = name;
    return this;
  }

  /**
   * Название города
   * @return name
  */
  @NotNull 
  @Schema(name = "name", description = "Название города", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("name")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public MetroMetroItem url(String url) {
    this.url = url;
    return this;
  }

  /**
   * URL запроса
   * @return url
  */
  @NotNull 
  @Schema(name = "url", description = "URL запроса", requiredMode = Schema.RequiredMode.REQUIRED)
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
    MetroMetroItem metroMetroItem = (MetroMetroItem) o;
    return Objects.equals(this.id, metroMetroItem.id) &&
        Objects.equals(this.lines, metroMetroItem.lines) &&
        Objects.equals(this.name, metroMetroItem.name) &&
        Objects.equals(this.url, metroMetroItem.url);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, lines, name, url);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MetroMetroItem {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    lines: ").append(toIndentedString(lines)).append("\n");
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

