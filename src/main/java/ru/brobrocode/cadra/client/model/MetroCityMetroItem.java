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
 * MetroCityMetroItem
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2025-08-17T15:41:09.394389505+05:00[Asia/Yekaterinburg]", comments = "Generator version: 7.6.0")
public class MetroCityMetroItem {

  private String id;

  @Valid
  private List<@Valid MetroMetroLineWithStations> lines = new ArrayList<>();

  private String name;

  public MetroCityMetroItem() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public MetroCityMetroItem(String id, List<@Valid MetroMetroLineWithStations> lines, String name) {
    this.id = id;
    this.lines = lines;
    this.name = name;
  }

  public MetroCityMetroItem id(String id) {
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

  public MetroCityMetroItem lines(List<@Valid MetroMetroLineWithStations> lines) {
    this.lines = lines;
    return this;
  }

  public MetroCityMetroItem addLinesItem(MetroMetroLineWithStations linesItem) {
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

  public MetroCityMetroItem name(String name) {
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

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MetroCityMetroItem metroCityMetroItem = (MetroCityMetroItem) o;
    return Objects.equals(this.id, metroCityMetroItem.id) &&
        Objects.equals(this.lines, metroCityMetroItem.lines) &&
        Objects.equals(this.name, metroCityMetroItem.name);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, lines, name);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MetroCityMetroItem {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    lines: ").append(toIndentedString(lines)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
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

