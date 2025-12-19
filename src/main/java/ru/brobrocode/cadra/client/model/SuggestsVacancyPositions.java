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
 * Подсказки по должностям вакансий
 */

@Schema(name = "SuggestsVacancyPositions", description = "Подсказки по должностям вакансий")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2025-08-17T15:41:09.394389505+05:00[Asia/Yekaterinburg]", comments = "Generator version: 7.6.0")
public class SuggestsVacancyPositions {

  @Valid
  private List<@Valid SuggestsVacancyPositionItem> items = new ArrayList<>();

  public SuggestsVacancyPositions() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public SuggestsVacancyPositions(List<@Valid SuggestsVacancyPositionItem> items) {
    this.items = items;
  }

  public SuggestsVacancyPositions items(List<@Valid SuggestsVacancyPositionItem> items) {
    this.items = items;
    return this;
  }

  public SuggestsVacancyPositions addItemsItem(SuggestsVacancyPositionItem itemsItem) {
    if (this.items == null) {
      this.items = new ArrayList<>();
    }
    this.items.add(itemsItem);
    return this;
  }

  /**
   * Информация о найденных должностях вакансий
   * @return items
  */
  @NotNull @Valid 
  @Schema(name = "items", description = "Информация о найденных должностях вакансий", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("items")
  public List<@Valid SuggestsVacancyPositionItem> getItems() {
    return items;
  }

  public void setItems(List<@Valid SuggestsVacancyPositionItem> items) {
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
    SuggestsVacancyPositions suggestsVacancyPositions = (SuggestsVacancyPositions) o;
    return Objects.equals(this.items, suggestsVacancyPositions.items);
  }

  @Override
  public int hashCode() {
    return Objects.hash(items);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SuggestsVacancyPositions {\n");
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

