package ru.brobrocode.cadra.client.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.annotation.Generated;
import jakarta.validation.Valid;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * ResumesPostResumeVisibilityListBody
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2025-08-17T15:41:09.394389505+05:00[Asia/Yekaterinburg]", comments = "Generator version: 7.6.0")
public class ResumesPostResumeVisibilityListBody {

  @Valid
  private List<@Valid IncludesId> items = new ArrayList<>();

  public ResumesPostResumeVisibilityListBody items(List<@Valid IncludesId> items) {
    this.items = items;
    return this;
  }

  public ResumesPostResumeVisibilityListBody addItemsItem(IncludesId itemsItem) {
    if (this.items == null) {
      this.items = new ArrayList<>();
    }
    this.items.add(itemsItem);
    return this;
  }

  /**
   * Список передаваемых идентификаторов работодателей
   * @return items
  */
  @Valid 
  @Schema(name = "items", description = "Список передаваемых идентификаторов работодателей", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("items")
  public List<@Valid IncludesId> getItems() {
    return items;
  }

  public void setItems(List<@Valid IncludesId> items) {
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
    ResumesPostResumeVisibilityListBody resumesPostResumeVisibilityListBody = (ResumesPostResumeVisibilityListBody) o;
    return Objects.equals(this.items, resumesPostResumeVisibilityListBody.items);
  }

  @Override
  public int hashCode() {
    return Objects.hash(items);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ResumesPostResumeVisibilityListBody {\n");
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

