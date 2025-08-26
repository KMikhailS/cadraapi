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
 * VacanciesDeletedVacancyListItems
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2025-08-17T15:41:09.394389505+05:00[Asia/Yekaterinburg]", comments = "Generator version: 7.6.0")
public class VacanciesDeletedVacancyListItems {

  @Valid
  private List<@Valid VacanciesVacancyArchived> items = new ArrayList<>();

  public VacanciesDeletedVacancyListItems() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public VacanciesDeletedVacancyListItems(List<@Valid VacanciesVacancyArchived> items) {
    this.items = items;
  }

  public VacanciesDeletedVacancyListItems items(List<@Valid VacanciesVacancyArchived> items) {
    this.items = items;
    return this;
  }

  public VacanciesDeletedVacancyListItems addItemsItem(VacanciesVacancyArchived itemsItem) {
    if (this.items == null) {
      this.items = new ArrayList<>();
    }
    this.items.add(itemsItem);
    return this;
  }

  /**
   * Список удаленных вакансий
   * @return items
  */
  @NotNull @Valid @Size(min = 0) 
  @Schema(name = "items", description = "Список удаленных вакансий", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("items")
  public List<@Valid VacanciesVacancyArchived> getItems() {
    return items;
  }

  public void setItems(List<@Valid VacanciesVacancyArchived> items) {
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
    VacanciesDeletedVacancyListItems vacanciesDeletedVacancyListItems = (VacanciesDeletedVacancyListItems) o;
    return Objects.equals(this.items, vacanciesDeletedVacancyListItems.items);
  }

  @Override
  public int hashCode() {
    return Objects.hash(items);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class VacanciesDeletedVacancyListItems {\n");
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

