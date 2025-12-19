package ru.brobrocode.cadra.client.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.annotation.Generated;
import jakarta.validation.Valid;
import jakarta.validation.constraints.Size;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * Адрес
 */

@Schema(name = "VacancyAddressRawOutput", description = "Адрес")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2025-08-17T15:41:09.394389505+05:00[Asia/Yekaterinburg]", comments = "Generator version: 7.6.0")
public class VacancyAddressRawOutput {

  private String building = null;

  private String city = null;

  private String description = null;

  private String id = null;

  private BigDecimal lat = null;

  private BigDecimal lng = null;

  private IncludesMetroStation metro = null;

  @Valid
  private List<@Valid IncludesMetroStation> metroStations = new ArrayList<>();

  private String raw = null;

  private String street = null;

  public VacancyAddressRawOutput building(String building) {
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

  public VacancyAddressRawOutput city(String city) {
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

  public VacancyAddressRawOutput description(String description) {
    this.description = description;
    return this;
  }

  /**
   * Описание
   * @return description
  */
  
  @Schema(name = "description", description = "Описание", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("description")
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public VacancyAddressRawOutput id(String id) {
    this.id = id;
    return this;
  }

  /**
   * Адрес из [списка доступных адресов работодателя](https://api.hh.ru/openapi/redoc#tag/Adresa-rabotodatelya/operation/get-employer-addresses)
   * @return id
  */
  
  @Schema(name = "id", description = "Адрес из [списка доступных адресов работодателя](https://api.hh.ru/openapi/redoc#tag/Adresa-rabotodatelya/operation/get-employer-addresses)", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("id")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public VacancyAddressRawOutput lat(BigDecimal lat) {
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

  public VacancyAddressRawOutput lng(BigDecimal lng) {
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

  public VacancyAddressRawOutput metro(IncludesMetroStation metro) {
    this.metro = metro;
    return this;
  }

  /**
   * Get metro
   * @return metro
  */
  @Valid 
  @Schema(name = "metro", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("metro")
  public IncludesMetroStation getMetro() {
    return metro;
  }

  public void setMetro(IncludesMetroStation metro) {
    this.metro = metro;
  }

  public VacancyAddressRawOutput metroStations(List<@Valid IncludesMetroStation> metroStations) {
    this.metroStations = metroStations;
    return this;
  }

  public VacancyAddressRawOutput addMetroStationsItem(IncludesMetroStation metroStationsItem) {
    if (this.metroStations == null) {
      this.metroStations = new ArrayList<>();
    }
    this.metroStations.add(metroStationsItem);
    return this;
  }

  /**
   * Get metroStations
   * @return metroStations
  */
  @Valid @Size(min = 0) 
  @Schema(name = "metro_stations", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("metro_stations")
  public List<@Valid IncludesMetroStation> getMetroStations() {
    return metroStations;
  }

  public void setMetroStations(List<@Valid IncludesMetroStation> metroStations) {
    this.metroStations = metroStations;
  }

  public VacancyAddressRawOutput raw(String raw) {
    this.raw = raw;
    return this;
  }

  /**
   * Полный адрес
   * @return raw
  */
  
  @Schema(name = "raw", description = "Полный адрес", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("raw")
  public String getRaw() {
    return raw;
  }

  public void setRaw(String raw) {
    this.raw = raw;
  }

  public VacancyAddressRawOutput street(String street) {
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
    VacancyAddressRawOutput vacancyAddressRawOutput = (VacancyAddressRawOutput) o;
    return Objects.equals(this.building, vacancyAddressRawOutput.building) &&
        Objects.equals(this.city, vacancyAddressRawOutput.city) &&
        Objects.equals(this.description, vacancyAddressRawOutput.description) &&
        Objects.equals(this.id, vacancyAddressRawOutput.id) &&
        Objects.equals(this.lat, vacancyAddressRawOutput.lat) &&
        Objects.equals(this.lng, vacancyAddressRawOutput.lng) &&
        Objects.equals(this.metro, vacancyAddressRawOutput.metro) &&
        Objects.equals(this.metroStations, vacancyAddressRawOutput.metroStations) &&
        Objects.equals(this.raw, vacancyAddressRawOutput.raw) &&
        Objects.equals(this.street, vacancyAddressRawOutput.street);
  }

  @Override
  public int hashCode() {
    return Objects.hash(building, city, description, id, lat, lng, metro, metroStations, raw, street);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class VacancyAddressRawOutput {\n");
    sb.append("    building: ").append(toIndentedString(building)).append("\n");
    sb.append("    city: ").append(toIndentedString(city)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    lat: ").append(toIndentedString(lat)).append("\n");
    sb.append("    lng: ").append(toIndentedString(lng)).append("\n");
    sb.append("    metro: ").append(toIndentedString(metro)).append("\n");
    sb.append("    metroStations: ").append(toIndentedString(metroStations)).append("\n");
    sb.append("    raw: ").append(toIndentedString(raw)).append("\n");
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

