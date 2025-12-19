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
 * Подсказки по ключевым навыкам
 */

@Schema(name = "SuggestsSkillSet", description = "Подсказки по ключевым навыкам")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2025-08-17T15:41:09.394389505+05:00[Asia/Yekaterinburg]", comments = "Generator version: 7.6.0")
public class SuggestsSkillSet {

  @Valid
  private List<@Valid IncludesSkillSetItem> items = new ArrayList<>();

  public SuggestsSkillSet() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public SuggestsSkillSet(List<@Valid IncludesSkillSetItem> items) {
    this.items = items;
  }

  public SuggestsSkillSet items(List<@Valid IncludesSkillSetItem> items) {
    this.items = items;
    return this;
  }

  public SuggestsSkillSet addItemsItem(IncludesSkillSetItem itemsItem) {
    if (this.items == null) {
      this.items = new ArrayList<>();
    }
    this.items.add(itemsItem);
    return this;
  }

  /**
   * Массив найденных ключевых навыков
   * @return items
  */
  @NotNull @Valid 
  @Schema(name = "items", description = "Массив найденных ключевых навыков", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("items")
  public List<@Valid IncludesSkillSetItem> getItems() {
    return items;
  }

  public void setItems(List<@Valid IncludesSkillSetItem> items) {
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
    SuggestsSkillSet suggestsSkillSet = (SuggestsSkillSet) o;
    return Objects.equals(this.items, suggestsSkillSet.items);
  }

  @Override
  public int hashCode() {
    return Objects.hash(items);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SuggestsSkillSet {\n");
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

