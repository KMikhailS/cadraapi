package ru.brobrocode.cadra.client.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.annotation.Generated;
import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;

import java.util.Objects;

/**
 * SavedSearchesSavedSearchItem
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2025-08-17T15:41:09.394389505+05:00[Asia/Yekaterinburg]", comments = "Generator version: 7.6.0")
public class SavedSearchesSavedSearchItem {

  private String createdAt;

  private String id;

  private SavedSearchesSavedSearchItemItems items;

  private String name;

  private SavedSearchesSavedSearchItemNewItems newItems;

  private Boolean subscription;

  public SavedSearchesSavedSearchItem() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public SavedSearchesSavedSearchItem(String createdAt, String id, SavedSearchesSavedSearchItemItems items, String name, SavedSearchesSavedSearchItemNewItems newItems, Boolean subscription) {
    this.createdAt = createdAt;
    this.id = id;
    this.items = items;
    this.name = name;
    this.newItems = newItems;
    this.subscription = subscription;
  }

  public SavedSearchesSavedSearchItem createdAt(String createdAt) {
    this.createdAt = createdAt;
    return this;
  }

  /**
   * Дата и время создания
   * @return createdAt
  */
  @NotNull 
  @Schema(name = "created_at", description = "Дата и время создания", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("created_at")
  public String getCreatedAt() {
    return createdAt;
  }

  public void setCreatedAt(String createdAt) {
    this.createdAt = createdAt;
  }

  public SavedSearchesSavedSearchItem id(String id) {
    this.id = id;
    return this;
  }

  /**
   * Идентификатор поиска
   * @return id
  */
  @NotNull 
  @Schema(name = "id", description = "Идентификатор поиска", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("id")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public SavedSearchesSavedSearchItem items(SavedSearchesSavedSearchItemItems items) {
    this.items = items;
    return this;
  }

  /**
   * Get items
   * @return items
  */
  @NotNull @Valid 
  @Schema(name = "items", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("items")
  public SavedSearchesSavedSearchItemItems getItems() {
    return items;
  }

  public void setItems(SavedSearchesSavedSearchItemItems items) {
    this.items = items;
  }

  public SavedSearchesSavedSearchItem name(String name) {
    this.name = name;
    return this;
  }

  /**
   * Название поиска
   * @return name
  */
  @NotNull 
  @Schema(name = "name", description = "Название поиска", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("name")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public SavedSearchesSavedSearchItem newItems(SavedSearchesSavedSearchItemNewItems newItems) {
    this.newItems = newItems;
    return this;
  }

  /**
   * Get newItems
   * @return newItems
  */
  @NotNull @Valid 
  @Schema(name = "new_items", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("new_items")
  public SavedSearchesSavedSearchItemNewItems getNewItems() {
    return newItems;
  }

  public void setNewItems(SavedSearchesSavedSearchItemNewItems newItems) {
    this.newItems = newItems;
  }

  public SavedSearchesSavedSearchItem subscription(Boolean subscription) {
    this.subscription = subscription;
    return this;
  }

  /**
   * Статус подписки
   * @return subscription
  */
  @NotNull 
  @Schema(name = "subscription", description = "Статус подписки", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("subscription")
  public Boolean getSubscription() {
    return subscription;
  }

  public void setSubscription(Boolean subscription) {
    this.subscription = subscription;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SavedSearchesSavedSearchItem savedSearchesSavedSearchItem = (SavedSearchesSavedSearchItem) o;
    return Objects.equals(this.createdAt, savedSearchesSavedSearchItem.createdAt) &&
        Objects.equals(this.id, savedSearchesSavedSearchItem.id) &&
        Objects.equals(this.items, savedSearchesSavedSearchItem.items) &&
        Objects.equals(this.name, savedSearchesSavedSearchItem.name) &&
        Objects.equals(this.newItems, savedSearchesSavedSearchItem.newItems) &&
        Objects.equals(this.subscription, savedSearchesSavedSearchItem.subscription);
  }

  @Override
  public int hashCode() {
    return Objects.hash(createdAt, id, items, name, newItems, subscription);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SavedSearchesSavedSearchItem {\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    items: ").append(toIndentedString(items)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    newItems: ").append(toIndentedString(newItems)).append("\n");
    sb.append("    subscription: ").append(toIndentedString(subscription)).append("\n");
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

