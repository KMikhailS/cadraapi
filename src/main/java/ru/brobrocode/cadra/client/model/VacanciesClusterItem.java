package ru.brobrocode.cadra.client.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.annotation.Generated;
import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * VacanciesClusterItem
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2025-08-17T15:41:09.394389505+05:00[Asia/Yekaterinburg]", comments = "Generator version: 7.6.0")
public class VacanciesClusterItem {

  private String id;

  @Valid
  private List<@Valid VacanciesItemsOfClusterItem> items = new ArrayList<>();

  private String name;

  public VacanciesClusterItem() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public VacanciesClusterItem(String id, List<@Valid VacanciesItemsOfClusterItem> items, String name) {
    this.id = id;
    this.items = items;
    this.name = name;
  }

  public VacanciesClusterItem id(String id) {
    this.id = id;
    return this;
  }

  /**
   * Идентификатор кластера
   * @return id
  */
  @NotNull 
  @Schema(name = "id", description = "Идентификатор кластера", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("id")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public VacanciesClusterItem items(List<@Valid VacanciesItemsOfClusterItem> items) {
    this.items = items;
    return this;
  }

  public VacanciesClusterItem addItemsItem(VacanciesItemsOfClusterItem itemsItem) {
    if (this.items == null) {
      this.items = new ArrayList<>();
    }
    this.items.add(itemsItem);
    return this;
  }

  /**
   * Массив поисковых запросов в данном кластере с указанием дополнительных параметров
   * @return items
  */
  @NotNull @Valid 
  @Schema(name = "items", description = "Массив поисковых запросов в данном кластере с указанием дополнительных параметров", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("items")
  public List<@Valid VacanciesItemsOfClusterItem> getItems() {
    return items;
  }

  public void setItems(List<@Valid VacanciesItemsOfClusterItem> items) {
    this.items = items;
  }

  public VacanciesClusterItem name(String name) {
    this.name = name;
    return this;
  }

  /**
   * Название типа кластера
   * @return name
  */
  @NotNull 
  @Schema(name = "name", description = "Название типа кластера", requiredMode = Schema.RequiredMode.REQUIRED)
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
    VacanciesClusterItem vacanciesClusterItem = (VacanciesClusterItem) o;
    return Objects.equals(this.id, vacanciesClusterItem.id) &&
        Objects.equals(this.items, vacanciesClusterItem.items) &&
        Objects.equals(this.name, vacanciesClusterItem.name);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, items, name);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class VacanciesClusterItem {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    items: ").append(toIndentedString(items)).append("\n");
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

