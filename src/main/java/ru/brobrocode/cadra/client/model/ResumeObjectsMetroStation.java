package ru.brobrocode.cadra.client.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.annotation.Generated;
import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;

import java.math.BigDecimal;
import java.util.Objects;

/**
 * Ближайшая станция метро. Элемент справочника [metro](#tag/Obshie-spravochniki/operation/get-metro-stations) 
 */

@Schema(name = "ResumeObjectsMetroStation", description = "Ближайшая станция метро. Элемент справочника [metro](#tag/Obshie-spravochniki/operation/get-metro-stations) ")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2025-08-17T15:41:09.394389505+05:00[Asia/Yekaterinburg]", comments = "Generator version: 7.6.0")
public class ResumeObjectsMetroStation {

  private String id;

  private BigDecimal lat;

  private ResumeObjectsMetroLine line;

  private BigDecimal lng;

  private String name;

  private BigDecimal order;

  public ResumeObjectsMetroStation() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public ResumeObjectsMetroStation(String id, BigDecimal lat, ResumeObjectsMetroLine line, BigDecimal lng, BigDecimal order) {
    this.id = id;
    this.lat = lat;
    this.line = line;
    this.lng = lng;
    this.order = order;
  }

  public ResumeObjectsMetroStation id(String id) {
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

  public ResumeObjectsMetroStation lat(BigDecimal lat) {
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

  public ResumeObjectsMetroStation line(ResumeObjectsMetroLine line) {
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
  public ResumeObjectsMetroLine getLine() {
    return line;
  }

  public void setLine(ResumeObjectsMetroLine line) {
    this.line = line;
  }

  public ResumeObjectsMetroStation lng(BigDecimal lng) {
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

  public ResumeObjectsMetroStation name(String name) {
    this.name = name;
    return this;
  }

  /**
   * Название станции метро
   * @return name
  */
  
  @Schema(name = "name", description = "Название станции метро", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("name")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public ResumeObjectsMetroStation order(BigDecimal order) {
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
    ResumeObjectsMetroStation resumeObjectsMetroStation = (ResumeObjectsMetroStation) o;
    return Objects.equals(this.id, resumeObjectsMetroStation.id) &&
        Objects.equals(this.lat, resumeObjectsMetroStation.lat) &&
        Objects.equals(this.line, resumeObjectsMetroStation.line) &&
        Objects.equals(this.lng, resumeObjectsMetroStation.lng) &&
        Objects.equals(this.name, resumeObjectsMetroStation.name) &&
        Objects.equals(this.order, resumeObjectsMetroStation.order);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, lat, line, lng, name, order);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ResumeObjectsMetroStation {\n");
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

