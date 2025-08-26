package ru.brobrocode.cadra.client.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.annotation.Generated;
import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * DictionariesSalaryStatisticsAreaItem
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2025-08-17T15:41:09.394389505+05:00[Asia/Yekaterinburg]", comments = "Generator version: 7.6.0")
public class DictionariesSalaryStatisticsAreaItem {

  @Valid
  private List<@Valid DictionariesSalaryStatisticsAreaItem> areas = new ArrayList<>();

  private String id;

  private String name;

  public DictionariesSalaryStatisticsAreaItem() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public DictionariesSalaryStatisticsAreaItem(String id, String name) {
    this.id = id;
    this.name = name;
  }

  public DictionariesSalaryStatisticsAreaItem areas(List<@Valid DictionariesSalaryStatisticsAreaItem> areas) {
    this.areas = areas;
    return this;
  }

  public DictionariesSalaryStatisticsAreaItem addAreasItem(DictionariesSalaryStatisticsAreaItem areasItem) {
    if (this.areas == null) {
      this.areas = new ArrayList<>();
    }
    this.areas.add(areasItem);
    return this;
  }

  /**
   * Дочерние регионы
   * @return areas
  */
  @Valid @Size(min = 0) 
  @Schema(name = "areas", description = "Дочерние регионы", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("areas")
  public List<@Valid DictionariesSalaryStatisticsAreaItem> getAreas() {
    return areas;
  }

  public void setAreas(List<@Valid DictionariesSalaryStatisticsAreaItem> areas) {
    this.areas = areas;
  }

  public DictionariesSalaryStatisticsAreaItem id(String id) {
    this.id = id;
    return this;
  }

  /**
   * Идентификатор региона
   * @return id
  */
  @NotNull 
  @Schema(name = "id", description = "Идентификатор региона", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("id")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public DictionariesSalaryStatisticsAreaItem name(String name) {
    this.name = name;
    return this;
  }

  /**
   * Название региона
   * @return name
  */
  @NotNull 
  @Schema(name = "name", description = "Название региона", requiredMode = Schema.RequiredMode.REQUIRED)
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
    DictionariesSalaryStatisticsAreaItem dictionariesSalaryStatisticsAreaItem = (DictionariesSalaryStatisticsAreaItem) o;
    return Objects.equals(this.areas, dictionariesSalaryStatisticsAreaItem.areas) &&
        Objects.equals(this.id, dictionariesSalaryStatisticsAreaItem.id) &&
        Objects.equals(this.name, dictionariesSalaryStatisticsAreaItem.name);
  }

  @Override
  public int hashCode() {
    return Objects.hash(areas, id, name);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DictionariesSalaryStatisticsAreaItem {\n");
    sb.append("    areas: ").append(toIndentedString(areas)).append("\n");
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

