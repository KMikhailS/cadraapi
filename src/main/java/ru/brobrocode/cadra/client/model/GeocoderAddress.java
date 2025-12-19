package ru.brobrocode.cadra.client.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.annotation.Generated;
import jakarta.validation.Valid;

import java.math.BigDecimal;
import java.util.Objects;

/**
 * Адрес
 */

@Schema(name = "GeocoderAddress", description = "Адрес")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2025-08-17T15:41:09.394389505+05:00[Asia/Yekaterinburg]", comments = "Generator version: 7.6.0")
public class GeocoderAddress {

  private String building = null;

  private String city = null;

  private BigDecimal lat = null;

  private BigDecimal lng = null;

  private String street = null;

  public GeocoderAddress building(String building) {
    this.building = building;
    return this;
  }

  /**
   * Дом
   * @return building
  */
  
  @Schema(name = "building", description = "Дом", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("building")
  public String getBuilding() {
    return building;
  }

  public void setBuilding(String building) {
    this.building = building;
  }

  public GeocoderAddress city(String city) {
    this.city = city;
    return this;
  }

  /**
   * Город
   * @return city
  */
  
  @Schema(name = "city", description = "Город", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("city")
  public String getCity() {
    return city;
  }

  public void setCity(String city) {
    this.city = city;
  }

  public GeocoderAddress lat(BigDecimal lat) {
    this.lat = lat;
    return this;
  }

  /**
   * Широта
   * @return lat
  */
  @Valid 
  @Schema(name = "lat", description = "Широта", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("lat")
  public BigDecimal getLat() {
    return lat;
  }

  public void setLat(BigDecimal lat) {
    this.lat = lat;
  }

  public GeocoderAddress lng(BigDecimal lng) {
    this.lng = lng;
    return this;
  }

  /**
   * Долгота
   * @return lng
  */
  @Valid 
  @Schema(name = "lng", description = "Долгота", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("lng")
  public BigDecimal getLng() {
    return lng;
  }

  public void setLng(BigDecimal lng) {
    this.lng = lng;
  }

  public GeocoderAddress street(String street) {
    this.street = street;
    return this;
  }

  /**
   * Улица
   * @return street
  */
  
  @Schema(name = "street", description = "Улица", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("street")
  public String getStreet() {
    return street;
  }

  public void setStreet(String street) {
    this.street = street;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GeocoderAddress geocoderAddress = (GeocoderAddress) o;
    return Objects.equals(this.building, geocoderAddress.building) &&
        Objects.equals(this.city, geocoderAddress.city) &&
        Objects.equals(this.lat, geocoderAddress.lat) &&
        Objects.equals(this.lng, geocoderAddress.lng) &&
        Objects.equals(this.street, geocoderAddress.street);
  }

  @Override
  public int hashCode() {
    return Objects.hash(building, city, lat, lng, street);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GeocoderAddress {\n");
    sb.append("    building: ").append(toIndentedString(building)).append("\n");
    sb.append("    city: ").append(toIndentedString(city)).append("\n");
    sb.append("    lat: ").append(toIndentedString(lat)).append("\n");
    sb.append("    lng: ").append(toIndentedString(lng)).append("\n");
    sb.append("    street: ").append(toIndentedString(street)).append("\n");
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

