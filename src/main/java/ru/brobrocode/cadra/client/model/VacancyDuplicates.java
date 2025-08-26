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
 * VacancyDuplicates
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2025-08-17T15:41:09.394389505+05:00[Asia/Yekaterinburg]", comments = "Generator version: 7.6.0")
public class VacancyDuplicates {

  private BigDecimal found;

  private Boolean hasDuplicates;

  @Valid
  private List<BigDecimal> items = new ArrayList<>();

  public VacancyDuplicates() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public VacancyDuplicates(BigDecimal found, Boolean hasDuplicates, List<BigDecimal> items) {
    this.found = found;
    this.hasDuplicates = hasDuplicates;
    this.items = items;
  }

  public VacancyDuplicates found(BigDecimal found) {
    this.found = found;
    return this;
  }

  /**
   * Общее количество дубликатов вакансии
   * @return found
  */
  @NotNull @Valid 
  @Schema(name = "found", description = "Общее количество дубликатов вакансии", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("found")
  public BigDecimal getFound() {
    return found;
  }

  public void setFound(BigDecimal found) {
    this.found = found;
  }

  public VacancyDuplicates hasDuplicates(Boolean hasDuplicates) {
    this.hasDuplicates = hasDuplicates;
    return this;
  }

  /**
   * Существуют ли дубликаты вакансии
   * @return hasDuplicates
  */
  @NotNull 
  @Schema(name = "has_duplicates", description = "Существуют ли дубликаты вакансии", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("has_duplicates")
  public Boolean getHasDuplicates() {
    return hasDuplicates;
  }

  public void setHasDuplicates(Boolean hasDuplicates) {
    this.hasDuplicates = hasDuplicates;
  }

  public VacancyDuplicates items(List<BigDecimal> items) {
    this.items = items;
    return this;
  }

  public VacancyDuplicates addItemsItem(BigDecimal itemsItem) {
    if (this.items == null) {
      this.items = new ArrayList<>();
    }
    this.items.add(itemsItem);
    return this;
  }

  /**
   * Список идентификаторов дубликатов вакансии
   * @return items
  */
  @NotNull @Valid 
  @Schema(name = "items", description = "Список идентификаторов дубликатов вакансии", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("items")
  public List<BigDecimal> getItems() {
    return items;
  }

  public void setItems(List<BigDecimal> items) {
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
    VacancyDuplicates vacancyDuplicates = (VacancyDuplicates) o;
    return Objects.equals(this.found, vacancyDuplicates.found) &&
        Objects.equals(this.hasDuplicates, vacancyDuplicates.hasDuplicates) &&
        Objects.equals(this.items, vacancyDuplicates.items);
  }

  @Override
  public int hashCode() {
    return Objects.hash(found, hasDuplicates, items);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class VacancyDuplicates {\n");
    sb.append("    found: ").append(toIndentedString(found)).append("\n");
    sb.append("    hasDuplicates: ").append(toIndentedString(hasDuplicates)).append("\n");
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

