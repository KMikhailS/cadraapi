package ru.brobrocode.cadra.client.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.annotation.Generated;
import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * MetroMetroLineWithStations
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2025-08-17T15:41:09.394389505+05:00[Asia/Yekaterinburg]", comments = "Generator version: 7.6.0")
public class MetroMetroLineWithStations {

  private String hexColor;

  private String id;

  private String name;

  @Valid
  private List<@Valid MetroLineStation> stations = new ArrayList<>();

  public MetroMetroLineWithStations() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public MetroMetroLineWithStations(String hexColor, String id, String name, List<@Valid MetroLineStation> stations) {
    this.hexColor = hexColor;
    this.id = id;
    this.name = name;
    this.stations = stations;
  }

  public MetroMetroLineWithStations hexColor(String hexColor) {
    this.hexColor = hexColor;
    return this;
  }

  /**
   * Цвет линии в HEX-формате `RRGGBB` (от `000000` до `FFFFFF`)
   * @return hexColor
  */
  @NotNull @Pattern(regexp = "^[0-9A-Fa-f]{6}$") 
  @Schema(name = "hex_color", description = "Цвет линии в HEX-формате `RRGGBB` (от `000000` до `FFFFFF`)", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("hex_color")
  public String getHexColor() {
    return hexColor;
  }

  public void setHexColor(String hexColor) {
    this.hexColor = hexColor;
  }

  public MetroMetroLineWithStations id(String id) {
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

  public MetroMetroLineWithStations name(String name) {
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

  public MetroMetroLineWithStations stations(List<@Valid MetroLineStation> stations) {
    this.stations = stations;
    return this;
  }

  public MetroMetroLineWithStations addStationsItem(MetroLineStation stationsItem) {
    if (this.stations == null) {
      this.stations = new ArrayList<>();
    }
    this.stations.add(stationsItem);
    return this;
  }

  /**
   * Список станций метро на линии
   * @return stations
  */
  @NotNull @Valid 
  @Schema(name = "stations", description = "Список станций метро на линии", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("stations")
  public List<@Valid MetroLineStation> getStations() {
    return stations;
  }

  public void setStations(List<@Valid MetroLineStation> stations) {
    this.stations = stations;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MetroMetroLineWithStations metroMetroLineWithStations = (MetroMetroLineWithStations) o;
    return Objects.equals(this.hexColor, metroMetroLineWithStations.hexColor) &&
        Objects.equals(this.id, metroMetroLineWithStations.id) &&
        Objects.equals(this.name, metroMetroLineWithStations.name) &&
        Objects.equals(this.stations, metroMetroLineWithStations.stations);
  }

  @Override
  public int hashCode() {
    return Objects.hash(hexColor, id, name, stations);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MetroMetroLineWithStations {\n");
    sb.append("    hexColor: ").append(toIndentedString(hexColor)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    stations: ").append(toIndentedString(stations)).append("\n");
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

