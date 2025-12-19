package ru.brobrocode.cadra.client.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.annotation.Generated;
import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;

import java.math.BigDecimal;
import java.util.Objects;

/**
 * MetroLineStation
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2025-08-17T15:41:09.394389505+05:00[Asia/Yekaterinburg]", comments = "Generator version: 7.6.0")
public class MetroLineStation {

  private String id;

  private BigDecimal lat;

  private MetroMetroLine line;

  private BigDecimal lng;

  private String name;

  private Integer order;

  public MetroLineStation() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public MetroLineStation(String id, BigDecimal lat, MetroMetroLine line, BigDecimal lng, String name, Integer order) {
    this.id = id;
    this.lat = lat;
    this.line = line;
    this.lng = lng;
    this.name = name;
    this.order = order;
  }

  public MetroLineStation id(String id) {
    this.id = id;
    return this;
  }

  /**
   * Идентификатор станции
   * @return id
  */
  @NotNull 
  @Schema(name = "id", description = "Идентификатор станции", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("id")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public MetroLineStation lat(BigDecimal lat) {
    this.lat = lat;
    return this;
  }

  /**
   * Широта расположения станции
   * @return lat
  */
  @NotNull @Valid 
  @Schema(name = "lat", description = "Широта расположения станции", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("lat")
  public BigDecimal getLat() {
    return lat;
  }

  public void setLat(BigDecimal lat) {
    this.lat = lat;
  }

  public MetroLineStation line(MetroMetroLine line) {
    this.line = line;
    return this;
  }

  /**
   * Линия метро
   * @return line
  */
  @NotNull @Valid 
  @Schema(name = "line", description = "Линия метро", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("line")
  public MetroMetroLine getLine() {
    return line;
  }

  public void setLine(MetroMetroLine line) {
    this.line = line;
  }

  public MetroLineStation lng(BigDecimal lng) {
    this.lng = lng;
    return this;
  }

  /**
   * Долгота расположения станции
   * @return lng
  */
  @NotNull @Valid 
  @Schema(name = "lng", description = "Долгота расположения станции", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("lng")
  public BigDecimal getLng() {
    return lng;
  }

  public void setLng(BigDecimal lng) {
    this.lng = lng;
  }

  public MetroLineStation name(String name) {
    this.name = name;
    return this;
  }

  /**
   * Название станции
   * @return name
  */
  @NotNull 
  @Schema(name = "name", description = "Название станции", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("name")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public MetroLineStation order(Integer order) {
    this.order = order;
    return this;
  }

  /**
   * Порядковый номер станции на линии, начиная с 0
   * @return order
  */
  @NotNull 
  @Schema(name = "order", description = "Порядковый номер станции на линии, начиная с 0", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("order")
  public Integer getOrder() {
    return order;
  }

  public void setOrder(Integer order) {
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
    MetroLineStation metroLineStation = (MetroLineStation) o;
    return Objects.equals(this.id, metroLineStation.id) &&
        Objects.equals(this.lat, metroLineStation.lat) &&
        Objects.equals(this.line, metroLineStation.line) &&
        Objects.equals(this.lng, metroLineStation.lng) &&
        Objects.equals(this.name, metroLineStation.name) &&
        Objects.equals(this.order, metroLineStation.order);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, lat, line, lng, name, order);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MetroLineStation {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    lat: ").append(toIndentedString(lat)).append("\n");
    sb.append("    line: ").append(toIndentedString(line)).append("\n");
    sb.append("    lng: ").append(toIndentedString(lng)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
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

