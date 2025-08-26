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
 * VacanciesVacanciesItems
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2025-08-17T15:41:09.394389505+05:00[Asia/Yekaterinburg]", comments = "Generator version: 7.6.0")
public class VacanciesVacanciesItems {

  @Valid
  private List<VacanciesVacanciesItem> items = new ArrayList<>();

  public VacanciesVacanciesItems() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public VacanciesVacanciesItems(List<VacanciesVacanciesItem> items) {
    this.items = items;
  }

  public VacanciesVacanciesItems items(List<VacanciesVacanciesItem> items) {
    this.items = items;
    return this;
  }

  public VacanciesVacanciesItems addItemsItem(VacanciesVacanciesItem itemsItem) {
    if (this.items == null) {
      this.items = new ArrayList<>();
    }
    this.items.add(itemsItem);
    return this;
  }

  /**
   * Список вакансий
   * @return items
  */
  @NotNull @Valid @Size(min = 0) 
  @Schema(name = "items", description = "Список вакансий", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("items")
  public List<VacanciesVacanciesItem> getItems() {
    return items;
  }

  public void setItems(List<VacanciesVacanciesItem> items) {
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
    VacanciesVacanciesItems vacanciesVacanciesItems = (VacanciesVacanciesItems) o;
    return Objects.equals(this.items, vacanciesVacanciesItems.items);
  }

  @Override
  public int hashCode() {
    return Objects.hash(items);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class VacanciesVacanciesItems {\n");
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

