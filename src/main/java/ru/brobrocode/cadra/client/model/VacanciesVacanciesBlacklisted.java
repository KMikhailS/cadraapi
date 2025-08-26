package ru.brobrocode.cadra.client.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.annotation.Generated;
import jakarta.validation.Valid;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * VacanciesVacanciesBlacklisted
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2025-08-17T15:41:09.394389505+05:00[Asia/Yekaterinburg]", comments = "Generator version: 7.6.0")
public class VacanciesVacanciesBlacklisted {

  @Valid
  private List<@Valid VacanciesVacanciesBlacklistedItem> items = new ArrayList<>();

  private Boolean limitReached;

  public VacanciesVacanciesBlacklisted items(List<@Valid VacanciesVacanciesBlacklistedItem> items) {
    this.items = items;
    return this;
  }

  public VacanciesVacanciesBlacklisted addItemsItem(VacanciesVacanciesBlacklistedItem itemsItem) {
    if (this.items == null) {
      this.items = new ArrayList<>();
    }
    this.items.add(itemsItem);
    return this;
  }

  /**
   * Массив скрытых вакансий
   * @return items
  */
  @Valid 
  @Schema(name = "items", description = "Массив скрытых вакансий", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("items")
  public List<@Valid VacanciesVacanciesBlacklistedItem> getItems() {
    return items;
  }

  public void setItems(List<@Valid VacanciesVacanciesBlacklistedItem> items) {
    this.items = items;
  }

  public VacanciesVacanciesBlacklisted limitReached(Boolean limitReached) {
    this.limitReached = limitReached;
    return this;
  }

  /**
   * Превышено ли максимальное количество элементов в списке
   * @return limitReached
  */
  
  @Schema(name = "limit_reached", description = "Превышено ли максимальное количество элементов в списке", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("limit_reached")
  public Boolean getLimitReached() {
    return limitReached;
  }

  public void setLimitReached(Boolean limitReached) {
    this.limitReached = limitReached;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    VacanciesVacanciesBlacklisted vacanciesVacanciesBlacklisted = (VacanciesVacanciesBlacklisted) o;
    return Objects.equals(this.items, vacanciesVacanciesBlacklisted.items) &&
        Objects.equals(this.limitReached, vacanciesVacanciesBlacklisted.limitReached);
  }

  @Override
  public int hashCode() {
    return Objects.hash(items, limitReached);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class VacanciesVacanciesBlacklisted {\n");
    sb.append("    items: ").append(toIndentedString(items)).append("\n");
    sb.append("    limitReached: ").append(toIndentedString(limitReached)).append("\n");
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

