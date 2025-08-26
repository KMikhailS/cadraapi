package ru.brobrocode.cadra.client.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.annotation.Generated;
import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;

import java.math.BigDecimal;
import java.util.Objects;

/**
 * IncludesClusterMetroStation
 */

@JsonTypeName("_IncludesClusterMetroStation")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2025-08-17T15:41:09.394389505+05:00[Asia/Yekaterinburg]", comments = "Generator version: 7.6.0")
public class IncludesClusterMetroStation {

  private IncludesClusterMetroStationArea area;

  private String hexColor;

  private String id;

  private BigDecimal lat;

  private BigDecimal lng;

  private BigDecimal order;

  public IncludesClusterMetroStation() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public IncludesClusterMetroStation(IncludesClusterMetroStationArea area, String hexColor, String id, BigDecimal lat, BigDecimal lng, BigDecimal order) {
    this.area = area;
    this.hexColor = hexColor;
    this.id = id;
    this.lat = lat;
    this.lng = lng;
    this.order = order;
  }

  public IncludesClusterMetroStation area(IncludesClusterMetroStationArea area) {
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
  public IncludesClusterMetroStationArea getArea() {
    return area;
  }

  public void setArea(IncludesClusterMetroStationArea area) {
    this.area = area;
  }

  public IncludesClusterMetroStation hexColor(String hexColor) {
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

  public IncludesClusterMetroStation id(String id) {
    this.id = id;
    return this;
  }

  /**
   * Идентификатор станции метро
   * @return id
  */
  @NotNull 
  @Schema(name = "id", description = "Идентификатор станции метро", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("id")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public IncludesClusterMetroStation lat(BigDecimal lat) {
    this.lat = lat;
    return this;
  }

  /**
   * Широта
   * @return lat
  */
  @NotNull @Valid 
  @Schema(name = "lat", description = "Широта", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("lat")
  public BigDecimal getLat() {
    return lat;
  }

  public void setLat(BigDecimal lat) {
    this.lat = lat;
  }

  public IncludesClusterMetroStation lng(BigDecimal lng) {
    this.lng = lng;
    return this;
  }

  /**
   * Долгота
   * @return lng
  */
  @NotNull @Valid 
  @Schema(name = "lng", description = "Долгота", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("lng")
  public BigDecimal getLng() {
    return lng;
  }

  public void setLng(BigDecimal lng) {
    this.lng = lng;
  }

  public IncludesClusterMetroStation order(BigDecimal order) {
    this.order = order;
    return this;
  }

  /**
   * Порядковый номер станции в линии метро
   * @return order
  */
  @NotNull @Valid 
  @Schema(name = "order", description = "Порядковый номер станции в линии метро", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("order")
  public BigDecimal getOrder() {
    return order;
  }

  public void setOrder(BigDecimal order) {
    this.order = order;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    IncludesClusterMetroStation includesClusterMetroStation = (IncludesClusterMetroStation) o;
    return Objects.equals(this.area, includesClusterMetroStation.area) &&
        Objects.equals(this.hexColor, includesClusterMetroStation.hexColor) &&
        Objects.equals(this.id, includesClusterMetroStation.id) &&
        Objects.equals(this.lat, includesClusterMetroStation.lat) &&
        Objects.equals(this.lng, includesClusterMetroStation.lng) &&
        Objects.equals(this.order, includesClusterMetroStation.order);
  }

  @Override
  public int hashCode() {
    return Objects.hash(area, hexColor, id, lat, lng, order);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IncludesClusterMetroStation {\n");
    sb.append("    area: ").append(toIndentedString(area)).append("\n");
    sb.append("    hexColor: ").append(toIndentedString(hexColor)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    lat: ").append(toIndentedString(lat)).append("\n");
    sb.append("    lng: ").append(toIndentedString(lng)).append("\n");
    sb.append("    order: ").append(toIndentedString(order)).append("\n");
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

