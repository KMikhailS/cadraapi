package ru.brobrocode.cadra.client.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.annotation.Generated;
import jakarta.validation.constraints.NotNull;

import java.util.Objects;

/**
 * ProfileFieldsDistrict
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2025-08-17T15:41:09.394389505+05:00[Asia/Yekaterinburg]", comments = "Generator version: 7.6.0")
public class ProfileFieldsDistrict {

  private String areaId;

  private String id;

  private String name;

  private String url;

  public ProfileFieldsDistrict() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public ProfileFieldsDistrict(String id) {
    this.id = id;
  }

  public ProfileFieldsDistrict areaId(String areaId) {
    this.areaId = areaId;
    return this;
  }

  /**
   * Идентификатор города к которому принадлежит район
   * @return areaId
  */
  
  @Schema(name = "area_id", description = "Идентификатор города к которому принадлежит район", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("area_id")
  public String getAreaId() {
    return areaId;
  }

  public void setAreaId(String areaId) {
    this.areaId = areaId;
  }

  public ProfileFieldsDistrict id(String id) {
    this.id = id;
    return this;
  }

  /**
   * Идентификатор района
   * @return id
  */
  @NotNull 
  @Schema(name = "id", description = "Идентификатор района", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("id")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public ProfileFieldsDistrict name(String name) {
    this.name = name;
    return this;
  }

  /**
   * Наименование района
   * @return name
  */
  
  @Schema(name = "name", description = "Наименование района", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("name")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public ProfileFieldsDistrict url(String url) {
    this.url = url;
    return this;
  }

  /**
   * URL города к которому принадлежит район
   * @return url
  */
  
  @Schema(name = "url", description = "URL города к которому принадлежит район", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("url")
  public String getUrl() {
    return url;
  }

  public void setUrl(String url) {
    this.url = url;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ProfileFieldsDistrict profileFieldsDistrict = (ProfileFieldsDistrict) o;
    return Objects.equals(this.areaId, profileFieldsDistrict.areaId) &&
        Objects.equals(this.id, profileFieldsDistrict.id) &&
        Objects.equals(this.name, profileFieldsDistrict.name) &&
        Objects.equals(this.url, profileFieldsDistrict.url);
  }

  @Override
  public int hashCode() {
    return Objects.hash(areaId, id, name, url);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ProfileFieldsDistrict {\n");
    sb.append("    areaId: ").append(toIndentedString(areaId)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    url: ").append(toIndentedString(url)).append("\n");
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

