package ru.brobrocode.cadra.client.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.annotation.Generated;
import jakarta.validation.constraints.NotNull;

import java.util.Objects;

/**
 * DictionariesDistrictItem
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2025-08-17T15:41:09.394389505+05:00[Asia/Yekaterinburg]", comments = "Generator version: 7.6.0")
public class DictionariesDistrictItem {

  private String areaId;

  private String id;

  private String name;

  public DictionariesDistrictItem() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public DictionariesDistrictItem(String areaId, String id, String name) {
    this.areaId = areaId;
    this.id = id;
    this.name = name;
  }

  public DictionariesDistrictItem areaId(String areaId) {
    this.areaId = areaId;
    return this;
  }

  /**
   * Идентификатор города
   * @return areaId
  */
  @NotNull 
  @Schema(name = "area_id", description = "Идентификатор города", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("area_id")
  public String getAreaId() {
    return areaId;
  }

  public void setAreaId(String areaId) {
    this.areaId = areaId;
  }

  public DictionariesDistrictItem id(String id) {
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

  public DictionariesDistrictItem name(String name) {
    this.name = name;
    return this;
  }

  /**
   * Название района
   * @return name
  */
  @NotNull 
  @Schema(name = "name", description = "Название района", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("name")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DictionariesDistrictItem dictionariesDistrictItem = (DictionariesDistrictItem) o;
    return Objects.equals(this.areaId, dictionariesDistrictItem.areaId) &&
        Objects.equals(this.id, dictionariesDistrictItem.id) &&
        Objects.equals(this.name, dictionariesDistrictItem.name);
  }

  @Override
  public int hashCode() {
    return Objects.hash(areaId, id, name);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DictionariesDistrictItem {\n");
    sb.append("    areaId: ").append(toIndentedString(areaId)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
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

