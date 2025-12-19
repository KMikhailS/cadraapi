package ru.brobrocode.cadra.client.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.annotation.Generated;
import jakarta.validation.constraints.NotNull;

import java.util.Objects;

/**
 * ProfileFieldsAddressCoordinates
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2025-08-17T15:41:09.394389505+05:00[Asia/Yekaterinburg]", comments = "Generator version: 7.6.0")
public class ProfileFieldsAddressCoordinates {

  private Double lat;

  private Double lng;

  public ProfileFieldsAddressCoordinates() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public ProfileFieldsAddressCoordinates(Double lat, Double lng) {
    this.lat = lat;
    this.lng = lng;
  }

  public ProfileFieldsAddressCoordinates lat(Double lat) {
    this.lat = lat;
    return this;
  }

  /**
   * Широта
   * @return lat
  */
  @NotNull 
  @Schema(name = "lat", description = "Широта", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("lat")
  public Double getLat() {
    return lat;
  }

  public void setLat(Double lat) {
    this.lat = lat;
  }

  public ProfileFieldsAddressCoordinates lng(Double lng) {
    this.lng = lng;
    return this;
  }

  /**
   * Долгота
   * @return lng
  */
  @NotNull 
  @Schema(name = "lng", description = "Долгота", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("lng")
  public Double getLng() {
    return lng;
  }

  public void setLng(Double lng) {
    this.lng = lng;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ProfileFieldsAddressCoordinates profileFieldsAddressCoordinates = (ProfileFieldsAddressCoordinates) o;
    return Objects.equals(this.lat, profileFieldsAddressCoordinates.lat) &&
        Objects.equals(this.lng, profileFieldsAddressCoordinates.lng);
  }

  @Override
  public int hashCode() {
    return Objects.hash(lat, lng);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ProfileFieldsAddressCoordinates {\n");
    sb.append("    lat: ").append(toIndentedString(lat)).append("\n");
    sb.append("    lng: ").append(toIndentedString(lng)).append("\n");
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

