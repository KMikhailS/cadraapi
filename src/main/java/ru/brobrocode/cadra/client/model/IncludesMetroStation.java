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
 * IncludesMetroStation
 */

@JsonTypeName("_IncludesMetroStation")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2025-08-17T15:41:09.394389505+05:00[Asia/Yekaterinburg]", comments = "Generator version: 7.6.0")
public class IncludesMetroStation {

  private BigDecimal lat = null;

  private String lineId;

  private String lineName;

  private BigDecimal lng = null;

  private String stationId;

  private String stationName;

  public IncludesMetroStation() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public IncludesMetroStation(BigDecimal lat, String lineId, String lineName, BigDecimal lng, String stationId, String stationName) {
    this.lat = lat;
    this.lineId = lineId;
    this.lineName = lineName;
    this.lng = lng;
    this.stationId = stationId;
    this.stationName = stationName;
  }

  public IncludesMetroStation lat(BigDecimal lat) {
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

  public IncludesMetroStation lineId(String lineId) {
    this.lineId = lineId;
    return this;
  }

  /**
   * Идентификатор линии метро
   * @return lineId
  */
  @NotNull 
  @Schema(name = "line_id", description = "Идентификатор линии метро", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("line_id")
  public String getLineId() {
    return lineId;
  }

  public void setLineId(String lineId) {
    this.lineId = lineId;
  }

  public IncludesMetroStation lineName(String lineName) {
    this.lineName = lineName;
    return this;
  }

  /**
   * Название линии метро
   * @return lineName
  */
  @NotNull 
  @Schema(name = "line_name", description = "Название линии метро", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("line_name")
  public String getLineName() {
    return lineName;
  }

  public void setLineName(String lineName) {
    this.lineName = lineName;
  }

  public IncludesMetroStation lng(BigDecimal lng) {
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

  public IncludesMetroStation stationId(String stationId) {
    this.stationId = stationId;
    return this;
  }

  /**
   * Идентификатор станции метро
   * @return stationId
  */
  @NotNull 
  @Schema(name = "station_id", description = "Идентификатор станции метро", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("station_id")
  public String getStationId() {
    return stationId;
  }

  public void setStationId(String stationId) {
    this.stationId = stationId;
  }

  public IncludesMetroStation stationName(String stationName) {
    this.stationName = stationName;
    return this;
  }

  /**
   * Название станции метро
   * @return stationName
  */
  @NotNull 
  @Schema(name = "station_name", description = "Название станции метро", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("station_name")
  public String getStationName() {
    return stationName;
  }

  public void setStationName(String stationName) {
    this.stationName = stationName;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    IncludesMetroStation includesMetroStation = (IncludesMetroStation) o;
    return Objects.equals(this.lat, includesMetroStation.lat) &&
        Objects.equals(this.lineId, includesMetroStation.lineId) &&
        Objects.equals(this.lineName, includesMetroStation.lineName) &&
        Objects.equals(this.lng, includesMetroStation.lng) &&
        Objects.equals(this.stationId, includesMetroStation.stationId) &&
        Objects.equals(this.stationName, includesMetroStation.stationName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(lat, lineId, lineName, lng, stationId, stationName);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IncludesMetroStation {\n");
    sb.append("    lat: ").append(toIndentedString(lat)).append("\n");
    sb.append("    lineId: ").append(toIndentedString(lineId)).append("\n");
    sb.append("    lineName: ").append(toIndentedString(lineName)).append("\n");
    sb.append("    lng: ").append(toIndentedString(lng)).append("\n");
    sb.append("    stationId: ").append(toIndentedString(stationId)).append("\n");
    sb.append("    stationName: ").append(toIndentedString(stationName)).append("\n");
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

