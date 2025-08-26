package ru.brobrocode.cadra.client.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.annotation.Generated;
import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;

import java.util.Objects;

/**
 * IncludesClusterMetroLine
 */

@JsonTypeName("_IncludesClusterMetroLine")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2025-08-17T15:41:09.394389505+05:00[Asia/Yekaterinburg]", comments = "Generator version: 7.6.0")
public class IncludesClusterMetroLine {

  private IncludesClusterMetroLineArea area;

  private String hexColor;

  private String id;

  public IncludesClusterMetroLine() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public IncludesClusterMetroLine(IncludesClusterMetroLineArea area, String hexColor, String id) {
    this.area = area;
    this.hexColor = hexColor;
    this.id = id;
  }

  public IncludesClusterMetroLine area(IncludesClusterMetroLineArea area) {
    this.area = area;
    return this;
  }

  /**
   * Get area
   * @return area
  */
  @NotNull @Valid 
  @Schema(name = "area", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("area")
  public IncludesClusterMetroLineArea getArea() {
    return area;
  }

  public void setArea(IncludesClusterMetroLineArea area) {
    this.area = area;
  }

  public IncludesClusterMetroLine hexColor(String hexColor) {
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

  public IncludesClusterMetroLine id(String id) {
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

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    IncludesClusterMetroLine includesClusterMetroLine = (IncludesClusterMetroLine) o;
    return Objects.equals(this.area, includesClusterMetroLine.area) &&
        Objects.equals(this.hexColor, includesClusterMetroLine.hexColor) &&
        Objects.equals(this.id, includesClusterMetroLine.id);
  }

  @Override
  public int hashCode() {
    return Objects.hash(area, hexColor, id);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IncludesClusterMetroLine {\n");
    sb.append("    area: ").append(toIndentedString(area)).append("\n");
    sb.append("    hexColor: ").append(toIndentedString(hexColor)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
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

