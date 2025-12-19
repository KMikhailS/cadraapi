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
 * Список видео профиля для текущего или запрашиваемого соискателя
 */

@Schema(name = "ProfileVideosList", description = "Список видео профиля для текущего или запрашиваемого соискателя")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2025-08-17T15:41:09.394389505+05:00[Asia/Yekaterinburg]", comments = "Generator version: 7.6.0")
public class ProfileVideosList {

  @Valid
  private List<@Valid ProfileVideosListItemsInner> items = new ArrayList<>();

  public ProfileVideosList() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public ProfileVideosList(List<@Valid ProfileVideosListItemsInner> items) {
    this.items = items;
  }

  public ProfileVideosList items(List<@Valid ProfileVideosListItemsInner> items) {
    this.items = items;
    return this;
  }

  public ProfileVideosList addItemsItem(ProfileVideosListItemsInner itemsItem) {
    if (this.items == null) {
      this.items = new ArrayList<>();
    }
    this.items.add(itemsItem);
    return this;
  }

  /**
   * Get items
   * @return items
  */
  @NotNull @Valid 
  @Schema(name = "items", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("items")
  public List<@Valid ProfileVideosListItemsInner> getItems() {
    return items;
  }

  public void setItems(List<@Valid ProfileVideosListItemsInner> items) {
    this.items = items;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ProfileVideosList profileVideosList = (ProfileVideosList) o;
    return Objects.equals(this.items, profileVideosList.items);
  }

  @Override
  public int hashCode() {
    return Objects.hash(items);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ProfileVideosList {\n");
    sb.append("    items: ").append(toIndentedString(items)).append("\n");
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

