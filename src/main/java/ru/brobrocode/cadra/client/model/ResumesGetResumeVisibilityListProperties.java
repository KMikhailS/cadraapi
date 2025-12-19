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
 * ResumesGetResumeVisibilityListProperties
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2025-08-17T15:41:09.394389505+05:00[Asia/Yekaterinburg]", comments = "Generator version: 7.6.0")
public class ResumesGetResumeVisibilityListProperties {

  @Valid
  private List<@Valid ResumesGetResumeVisibilityListItem> items = new ArrayList<>();

  private BigDecimal limit;

  public ResumesGetResumeVisibilityListProperties() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public ResumesGetResumeVisibilityListProperties(List<@Valid ResumesGetResumeVisibilityListItem> items, BigDecimal limit) {
    this.items = items;
    this.limit = limit;
  }

  public ResumesGetResumeVisibilityListProperties items(List<@Valid ResumesGetResumeVisibilityListItem> items) {
    this.items = items;
    return this;
  }

  public ResumesGetResumeVisibilityListProperties addItemsItem(ResumesGetResumeVisibilityListItem itemsItem) {
    if (this.items == null) {
      this.items = new ArrayList<>();
    }
    this.items.add(itemsItem);
    return this;
  }

  /**
   * Список работодателей
   * @return items
  */
  @NotNull @Valid 
  @Schema(name = "items", description = "Список работодателей", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("items")
  public List<@Valid ResumesGetResumeVisibilityListItem> getItems() {
    return items;
  }

  public void setItems(List<@Valid ResumesGetResumeVisibilityListItem> items) {
    this.items = items;
  }

  public ResumesGetResumeVisibilityListProperties limit(BigDecimal limit) {
    this.limit = limit;
    return this;
  }

  /**
   * Максимальное количество элементов в списке
   * @return limit
  */
  @NotNull @Valid 
  @Schema(name = "limit", description = "Максимальное количество элементов в списке", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("limit")
  public BigDecimal getLimit() {
    return limit;
  }

  public void setLimit(BigDecimal limit) {
    this.limit = limit;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ResumesGetResumeVisibilityListProperties resumesGetResumeVisibilityListProperties = (ResumesGetResumeVisibilityListProperties) o;
    return Objects.equals(this.items, resumesGetResumeVisibilityListProperties.items) &&
        Objects.equals(this.limit, resumesGetResumeVisibilityListProperties.limit);
  }

  @Override
  public int hashCode() {
    return Objects.hash(items, limit);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ResumesGetResumeVisibilityListProperties {\n");
    sb.append("    items: ").append(toIndentedString(items)).append("\n");
    sb.append("    limit: ").append(toIndentedString(limit)).append("\n");
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

