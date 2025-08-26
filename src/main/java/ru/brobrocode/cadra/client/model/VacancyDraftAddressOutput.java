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
 * VacancyDraftAddressOutput
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2025-08-17T15:41:09.394389505+05:00[Asia/Yekaterinburg]", comments = "Generator version: 7.6.0")
public class VacancyDraftAddressOutput {

  private String building = null;

  private String city = null;

  private BigDecimal lat = null;

  private BigDecimal lng = null;

  private String street = null;

  private String description = null;

  @Valid
  private List<@Valid IncludesMetroStation> metroStations = new ArrayList<>();

  private String id = null;

  private Boolean showMetroOnly = null;

  public VacancyDraftAddressOutput building(String building) {
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

  public VacancyDraftAddressOutput city(String city) {
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

  public VacancyDraftAddressOutput lat(BigDecimal lat) {
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

  public VacancyDraftAddressOutput lng(BigDecimal lng) {
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

  public VacancyDraftAddressOutput street(String street) {
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

  public VacancyDraftAddressOutput description(String description) {
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

  public VacancyDraftAddressOutput metroStations(List<@Valid IncludesMetroStation> metroStations) {
    this.metroStations = metroStations;
    return this;
  }

  public VacancyDraftAddressOutput addMetroStationsItem(IncludesMetroStation metroStationsItem) {
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

  public VacancyDraftAddressOutput id(String id) {
    this.id = id;
    return this;
  }

  /**
   * Адрес из [списка доступных адресов работодателя](#tag/Adresa-rabotodatelya/operation/get-employer-addresses)
   * @return id
  */
  
  @Schema(name = "id", description = "Адрес из [списка доступных адресов работодателя](#tag/Adresa-rabotodatelya/operation/get-employer-addresses)", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("id")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public VacancyDraftAddressOutput showMetroOnly(Boolean showMetroOnly) {
    this.showMetroOnly = showMetroOnly;
    return this;
  }

  /**
   * Показывать только метро для указанного адреса
   * @return showMetroOnly
  */
  
  @Schema(name = "show_metro_only", description = "Показывать только метро для указанного адреса", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("show_metro_only")
  public Boolean getShowMetroOnly() {
    return showMetroOnly;
  }

  public void setShowMetroOnly(Boolean showMetroOnly) {
    this.showMetroOnly = showMetroOnly;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    VacancyDraftAddressOutput vacancyDraftAddressOutput = (VacancyDraftAddressOutput) o;
    return Objects.equals(this.building, vacancyDraftAddressOutput.building) &&
        Objects.equals(this.city, vacancyDraftAddressOutput.city) &&
        Objects.equals(this.lat, vacancyDraftAddressOutput.lat) &&
        Objects.equals(this.lng, vacancyDraftAddressOutput.lng) &&
        Objects.equals(this.street, vacancyDraftAddressOutput.street) &&
        Objects.equals(this.description, vacancyDraftAddressOutput.description) &&
        Objects.equals(this.metroStations, vacancyDraftAddressOutput.metroStations) &&
        Objects.equals(this.id, vacancyDraftAddressOutput.id) &&
        Objects.equals(this.showMetroOnly, vacancyDraftAddressOutput.showMetroOnly);
  }

  @Override
  public int hashCode() {
    return Objects.hash(building, city, lat, lng, street, description, metroStations, id, showMetroOnly);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class VacancyDraftAddressOutput {\n");
    sb.append("    building: ").append(toIndentedString(building)).append("\n");
    sb.append("    city: ").append(toIndentedString(city)).append("\n");
    sb.append("    lat: ").append(toIndentedString(lat)).append("\n");
    sb.append("    lng: ").append(toIndentedString(lng)).append("\n");
    sb.append("    street: ").append(toIndentedString(street)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    metroStations: ").append(toIndentedString(metroStations)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    showMetroOnly: ").append(toIndentedString(showMetroOnly)).append("\n");
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

