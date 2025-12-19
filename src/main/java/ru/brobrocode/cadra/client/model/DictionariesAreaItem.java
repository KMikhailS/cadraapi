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
 * DictionariesAreaItem
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2025-08-17T15:41:09.394389505+05:00[Asia/Yekaterinburg]", comments = "Generator version: 7.6.0")
public class DictionariesAreaItem {

  private String id;

  private String name;

  private String namePrepositional = null;

  private String parentId = null;

  @Valid
  private List<@Valid DictionariesAreaItem> areas = new ArrayList<>();

  public DictionariesAreaItem() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public DictionariesAreaItem(String id, String name, List<@Valid DictionariesAreaItem> areas) {
    this.id = id;
    this.name = name;
    this.areas = areas;
  }

  public DictionariesAreaItem id(String id) {
    this.id = id;
    return this;
  }

  /**
   * Идентификатор региона из [справочника](#tag/Obshie-spravochniki/operation/get-areas) 
   * @return id
  */
  @NotNull 
  @Schema(name = "id", description = "Идентификатор региона из [справочника](#tag/Obshie-spravochniki/operation/get-areas) ", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("id")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public DictionariesAreaItem name(String name) {
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

  public DictionariesAreaItem namePrepositional(String namePrepositional) {
    this.namePrepositional = namePrepositional;
    return this;
  }

  /**
   * Применимо только для русской локализации.  Название региона в предложном падеже с предлогом `в`, например: `в Москве`. Возвращается, если в запросе передан параметр `additional_case=prepositional` 
   * @return namePrepositional
  */
  
  @Schema(name = "name_prepositional", description = "Применимо только для русской локализации.  Название региона в предложном падеже с предлогом `в`, например: `в Москве`. Возвращается, если в запросе передан параметр `additional_case=prepositional` ", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("name_prepositional")
  public String getNamePrepositional() {
    return namePrepositional;
  }

  public void setNamePrepositional(String namePrepositional) {
    this.namePrepositional = namePrepositional;
  }

  public DictionariesAreaItem parentId(String parentId) {
    this.parentId = parentId;
    return this;
  }

  /**
   * Идентификатор родительского региона
   * @return parentId
  */
  
  @Schema(name = "parent_id", description = "Идентификатор родительского региона", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("parent_id")
  public String getParentId() {
    return parentId;
  }

  public void setParentId(String parentId) {
    this.parentId = parentId;
  }

  public DictionariesAreaItem areas(List<@Valid DictionariesAreaItem> areas) {
    this.areas = areas;
    return this;
  }

  public DictionariesAreaItem addAreasItem(DictionariesAreaItem areasItem) {
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
  @NotNull @Valid @Size(min = 0) 
  @Schema(name = "areas", description = "Дочерние регионы", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("areas")
  public List<@Valid DictionariesAreaItem> getAreas() {
    return areas;
  }

  public void setAreas(List<@Valid DictionariesAreaItem> areas) {
    this.areas = areas;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DictionariesAreaItem dictionariesAreaItem = (DictionariesAreaItem) o;
    return Objects.equals(this.id, dictionariesAreaItem.id) &&
        Objects.equals(this.name, dictionariesAreaItem.name) &&
        Objects.equals(this.namePrepositional, dictionariesAreaItem.namePrepositional) &&
        Objects.equals(this.parentId, dictionariesAreaItem.parentId) &&
        Objects.equals(this.areas, dictionariesAreaItem.areas);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, namePrepositional, parentId, areas);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DictionariesAreaItem {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    namePrepositional: ").append(toIndentedString(namePrepositional)).append("\n");
    sb.append("    parentId: ").append(toIndentedString(parentId)).append("\n");
    sb.append("    areas: ").append(toIndentedString(areas)).append("\n");
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

