package ru.brobrocode.cadra.client.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.annotation.Generated;
import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * EmployerAddressesEmployerAddressItemResponse
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2025-08-17T15:41:09.394389505+05:00[Asia/Yekaterinburg]", comments = "Generator version: 7.6.0")
public class EmployerAddressesEmployerAddressItemResponse {

  private String building = null;

  private Boolean canEdit;

  private String city = null;

  private Boolean deleted;

  private String description = null;

  private String id;

  private BigDecimal lat = null;

  private BigDecimal lng = null;

  private EmployerAddressesEmployerAddressItemManager manager = null;

  @Valid
  private List<@Valid IncludesMetroStation> metroStations = new ArrayList<>();

  private String raw = null;

  private String street = null;

  public EmployerAddressesEmployerAddressItemResponse() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public EmployerAddressesEmployerAddressItemResponse(String city, BigDecimal lat, BigDecimal lng) {
    this.city = city;
    this.lat = lat;
    this.lng = lng;
  }

  public EmployerAddressesEmployerAddressItemResponse building(String building) {
    this.building = building;
    return this;
  }

  /**
   * Номер дома
   * @return building
  */
  
  @Schema(name = "building", description = "Номер дома", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("building")
  public String getBuilding() {
    return building;
  }

  public void setBuilding(String building) {
    this.building = building;
  }

  public EmployerAddressesEmployerAddressItemResponse canEdit(Boolean canEdit) {
    this.canEdit = canEdit;
    return this;
  }

  /**
   * Имеет ли текущий пользователь право редактировать этот адрес
   * @return canEdit
  */
  
  @Schema(name = "can_edit", description = "Имеет ли текущий пользователь право редактировать этот адрес", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("can_edit")
  public Boolean getCanEdit() {
    return canEdit;
  }

  public void setCanEdit(Boolean canEdit) {
    this.canEdit = canEdit;
  }

  public EmployerAddressesEmployerAddressItemResponse city(String city) {
    this.city = city;
    return this;
  }

  /**
   * Город
   * @return city
  */
  @NotNull 
  @Schema(name = "city", description = "Город", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("city")
  public String getCity() {
    return city;
  }

  public void setCity(String city) {
    this.city = city;
  }

  public EmployerAddressesEmployerAddressItemResponse deleted(Boolean deleted) {
    this.deleted = deleted;
    return this;
  }

  /**
   * Удалён ли адрес
   * @return deleted
  */
  
  @Schema(name = "deleted", description = "Удалён ли адрес", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("deleted")
  public Boolean getDeleted() {
    return deleted;
  }

  public void setDeleted(Boolean deleted) {
    this.deleted = deleted;
  }

  public EmployerAddressesEmployerAddressItemResponse description(String description) {
    this.description = description;
    return this;
  }

  /**
   * Дополнительная информация об адресе
   * @return description
  */
  
  @Schema(name = "description", description = "Дополнительная информация об адресе", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("description")
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public EmployerAddressesEmployerAddressItemResponse id(String id) {
    this.id = id;
    return this;
  }

  /**
   * Идентификатор адреса
   * @return id
  */
  
  @Schema(name = "id", description = "Идентификатор адреса", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("id")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public EmployerAddressesEmployerAddressItemResponse lat(BigDecimal lat) {
    this.lat = lat;
    return this;
  }

  /**
   * Географическая широта
   * @return lat
  */
  @NotNull @Valid 
  @Schema(name = "lat", description = "Географическая широта", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("lat")
  public BigDecimal getLat() {
    return lat;
  }

  public void setLat(BigDecimal lat) {
    this.lat = lat;
  }

  public EmployerAddressesEmployerAddressItemResponse lng(BigDecimal lng) {
    this.lng = lng;
    return this;
  }

  /**
   * Географическая долгота
   * @return lng
  */
  @NotNull @Valid 
  @Schema(name = "lng", description = "Географическая долгота", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("lng")
  public BigDecimal getLng() {
    return lng;
  }

  public void setLng(BigDecimal lng) {
    this.lng = lng;
  }

  public EmployerAddressesEmployerAddressItemResponse manager(EmployerAddressesEmployerAddressItemManager manager) {
    this.manager = manager;
    return this;
  }

  /**
   * Get manager
   * @return manager
  */
  @Valid 
  @Schema(name = "manager", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("manager")
  public EmployerAddressesEmployerAddressItemManager getManager() {
    return manager;
  }

  public void setManager(EmployerAddressesEmployerAddressItemManager manager) {
    this.manager = manager;
  }

  public EmployerAddressesEmployerAddressItemResponse metroStations(List<@Valid IncludesMetroStation> metroStations) {
    this.metroStations = metroStations;
    return this;
  }

  public EmployerAddressesEmployerAddressItemResponse addMetroStationsItem(IncludesMetroStation metroStationsItem) {
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
  @Valid 
  @Schema(name = "metro_stations", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("metro_stations")
  public List<@Valid IncludesMetroStation> getMetroStations() {
    return metroStations;
  }

  public void setMetroStations(List<@Valid IncludesMetroStation> metroStations) {
    this.metroStations = metroStations;
  }

  public EmployerAddressesEmployerAddressItemResponse raw(String raw) {
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

  public EmployerAddressesEmployerAddressItemResponse street(String street) {
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
    EmployerAddressesEmployerAddressItemResponse employerAddressesEmployerAddressItemResponse = (EmployerAddressesEmployerAddressItemResponse) o;
    return Objects.equals(this.building, employerAddressesEmployerAddressItemResponse.building) &&
        Objects.equals(this.canEdit, employerAddressesEmployerAddressItemResponse.canEdit) &&
        Objects.equals(this.city, employerAddressesEmployerAddressItemResponse.city) &&
        Objects.equals(this.deleted, employerAddressesEmployerAddressItemResponse.deleted) &&
        Objects.equals(this.description, employerAddressesEmployerAddressItemResponse.description) &&
        Objects.equals(this.id, employerAddressesEmployerAddressItemResponse.id) &&
        Objects.equals(this.lat, employerAddressesEmployerAddressItemResponse.lat) &&
        Objects.equals(this.lng, employerAddressesEmployerAddressItemResponse.lng) &&
        Objects.equals(this.manager, employerAddressesEmployerAddressItemResponse.manager) &&
        Objects.equals(this.metroStations, employerAddressesEmployerAddressItemResponse.metroStations) &&
        Objects.equals(this.raw, employerAddressesEmployerAddressItemResponse.raw) &&
        Objects.equals(this.street, employerAddressesEmployerAddressItemResponse.street);
  }

  @Override
  public int hashCode() {
    return Objects.hash(building, canEdit, city, deleted, description, id, lat, lng, manager, metroStations, raw, street);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EmployerAddressesEmployerAddressItemResponse {\n");
    sb.append("    building: ").append(toIndentedString(building)).append("\n");
    sb.append("    canEdit: ").append(toIndentedString(canEdit)).append("\n");
    sb.append("    city: ").append(toIndentedString(city)).append("\n");
    sb.append("    deleted: ").append(toIndentedString(deleted)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    lat: ").append(toIndentedString(lat)).append("\n");
    sb.append("    lng: ").append(toIndentedString(lng)).append("\n");
    sb.append("    manager: ").append(toIndentedString(manager)).append("\n");
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

