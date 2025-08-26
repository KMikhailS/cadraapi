package ru.brobrocode.cadra.client.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.annotation.Generated;
import jakarta.validation.constraints.NotNull;

import java.util.Objects;

/**
 * ResumeObjectsMetroLine
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2025-08-17T15:41:09.394389505+05:00[Asia/Yekaterinburg]", comments = "Generator version: 7.6.0")
public class ResumeObjectsMetroLine {

  private String hexColor;

  private String id;

  private String name;

  public ResumeObjectsMetroLine() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public ResumeObjectsMetroLine(String hexColor, String id, String name) {
    this.hexColor = hexColor;
    this.id = id;
    this.name = name;
  }

  public ResumeObjectsMetroLine hexColor(String hexColor) {
    this.hexColor = hexColor;
    return this;
  }

  /**
   * Цвет линии в HEX-формате `RRGGBB` (от `000000` до `FFFFFF`)
   * @return hexColor
  */
  @NotNull 
  @Schema(name = "hex_color", description = "Цвет линии в HEX-формате `RRGGBB` (от `000000` до `FFFFFF`)", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("hex_color")
  public String getHexColor() {
    return hexColor;
  }

  public void setHexColor(String hexColor) {
    this.hexColor = hexColor;
  }

  public ResumeObjectsMetroLine id(String id) {
    this.id = id;
    return this;
  }

  /**
   * Идентификатор линии
   * @return id
  */
  @NotNull 
  @Schema(name = "id", description = "Идентификатор линии", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("id")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public ResumeObjectsMetroLine name(String name) {
    this.name = name;
    return this;
  }

  /**
   * Название линии
   * @return name
  */
  @NotNull 
  @Schema(name = "name", description = "Название линии", requiredMode = Schema.RequiredMode.REQUIRED)
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
    ResumeObjectsMetroLine resumeObjectsMetroLine = (ResumeObjectsMetroLine) o;
    return Objects.equals(this.hexColor, resumeObjectsMetroLine.hexColor) &&
        Objects.equals(this.id, resumeObjectsMetroLine.id) &&
        Objects.equals(this.name, resumeObjectsMetroLine.name);
  }

  @Override
  public int hashCode() {
    return Objects.hash(hexColor, id, name);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ResumeObjectsMetroLine {\n");
    sb.append("    hexColor: ").append(toIndentedString(hexColor)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
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

