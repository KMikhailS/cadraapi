package ru.brobrocode.cadra.client.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.annotation.Generated;
import jakarta.validation.constraints.NotNull;

import java.util.Objects;

/**
 * Координаты проживания
 */

@Schema(name = "ProfileProfileUpdate_address_coordinates", description = "Координаты проживания")
@JsonTypeName("ProfileProfileUpdate_address_coordinates")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2025-08-17T15:41:09.394389505+05:00[Asia/Yekaterinburg]", comments = "Generator version: 7.6.0")
public class ProfileProfileUpdateAddressCoordinates {

  private Double lat;

  private Double lng;

  public ProfileProfileUpdateAddressCoordinates() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public ProfileProfileUpdateAddressCoordinates(Double lat, Double lng) {
    this.lat = lat;
    this.lng = lng;
  }

  public ProfileProfileUpdateAddressCoordinates lat(Double lat) {
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

  public ProfileProfileUpdateAddressCoordinates lng(Double lng) {
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
    ProfileProfileUpdateAddressCoordinates profileProfileUpdateAddressCoordinates = (ProfileProfileUpdateAddressCoordinates) o;
    return Objects.equals(this.lat, profileProfileUpdateAddressCoordinates.lat) &&
        Objects.equals(this.lng, profileProfileUpdateAddressCoordinates.lng);
  }

  @Override
  public int hashCode() {
    return Objects.hash(lat, lng);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ProfileProfileUpdateAddressCoordinates {\n");
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

