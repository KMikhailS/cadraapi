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
 * VacanciesVacanciesBlacklistedResponse
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2025-08-17T15:41:09.394389505+05:00[Asia/Yekaterinburg]", comments = "Generator version: 7.6.0")
public class VacanciesVacanciesBlacklistedResponse {

  private Integer found;

  private Integer page;

  private Integer pages;

  private Integer perPage;

  @Valid
  private List<@Valid VacanciesVacanciesBlacklistedItem> items = new ArrayList<>();

  private Boolean limitReached;

  public VacanciesVacanciesBlacklistedResponse() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public VacanciesVacanciesBlacklistedResponse(Integer found, Integer page, Integer pages, Integer perPage) {
    this.found = found;
    this.page = page;
    this.pages = pages;
    this.perPage = perPage;
  }

  public VacanciesVacanciesBlacklistedResponse found(Integer found) {
    this.found = found;
    return this;
  }

  /**
   * Найдено результатов
   * @return found
  */
  @NotNull 
  @Schema(name = "found", example = "6", description = "Найдено результатов", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("found")
  public Integer getFound() {
    return found;
  }

  public void setFound(Integer found) {
    this.found = found;
  }

  public VacanciesVacanciesBlacklistedResponse page(Integer page) {
    this.page = page;
    return this;
  }

  /**
   * Номер страницы
   * @return page
  */
  @NotNull 
  @Schema(name = "page", example = "1", description = "Номер страницы", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("page")
  public Integer getPage() {
    return page;
  }

  public void setPage(Integer page) {
    this.page = page;
  }

  public VacanciesVacanciesBlacklistedResponse pages(Integer pages) {
    this.pages = pages;
    return this;
  }

  /**
   * Всего страниц
   * @return pages
  */
  @NotNull 
  @Schema(name = "pages", example = "2", description = "Всего страниц", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("pages")
  public Integer getPages() {
    return pages;
  }

  public void setPages(Integer pages) {
    this.pages = pages;
  }

  public VacanciesVacanciesBlacklistedResponse perPage(Integer perPage) {
    this.perPage = perPage;
    return this;
  }

  /**
   * Результатов на странице
   * @return perPage
  */
  @NotNull 
  @Schema(name = "per_page", example = "5", description = "Результатов на странице", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("per_page")
  public Integer getPerPage() {
    return perPage;
  }

  public void setPerPage(Integer perPage) {
    this.perPage = perPage;
  }

  public VacanciesVacanciesBlacklistedResponse items(List<@Valid VacanciesVacanciesBlacklistedItem> items) {
    this.items = items;
    return this;
  }

  public VacanciesVacanciesBlacklistedResponse addItemsItem(VacanciesVacanciesBlacklistedItem itemsItem) {
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

  public VacanciesVacanciesBlacklistedResponse limitReached(Boolean limitReached) {
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
    VacanciesVacanciesBlacklistedResponse vacanciesVacanciesBlacklistedResponse = (VacanciesVacanciesBlacklistedResponse) o;
    return Objects.equals(this.found, vacanciesVacanciesBlacklistedResponse.found) &&
        Objects.equals(this.page, vacanciesVacanciesBlacklistedResponse.page) &&
        Objects.equals(this.pages, vacanciesVacanciesBlacklistedResponse.pages) &&
        Objects.equals(this.perPage, vacanciesVacanciesBlacklistedResponse.perPage) &&
        Objects.equals(this.items, vacanciesVacanciesBlacklistedResponse.items) &&
        Objects.equals(this.limitReached, vacanciesVacanciesBlacklistedResponse.limitReached);
  }

  @Override
  public int hashCode() {
    return Objects.hash(found, page, pages, perPage, items, limitReached);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class VacanciesVacanciesBlacklistedResponse {\n");
    sb.append("    found: ").append(toIndentedString(found)).append("\n");
    sb.append("    page: ").append(toIndentedString(page)).append("\n");
    sb.append("    pages: ").append(toIndentedString(pages)).append("\n");
    sb.append("    perPage: ").append(toIndentedString(perPage)).append("\n");
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

