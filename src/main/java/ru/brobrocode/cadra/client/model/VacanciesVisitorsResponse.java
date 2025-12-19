package ru.brobrocode.cadra.client.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.annotation.Generated;
import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * VacanciesVisitorsResponse
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2025-08-17T15:41:09.394389505+05:00[Asia/Yekaterinburg]", comments = "Generator version: 7.6.0")
public class VacanciesVisitorsResponse {

  @Valid
  private List<VacanciesVisitorsVisitorItemsItemsInner> items = new ArrayList<>();

  private Integer found;

  private Integer page;

  private Integer pages;

  private Integer perPage;

  private BigDecimal hiddenOnPage;

  public VacanciesVisitorsResponse() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public VacanciesVisitorsResponse(List<VacanciesVisitorsVisitorItemsItemsInner> items, Integer found, Integer page, Integer pages, Integer perPage, BigDecimal hiddenOnPage) {
    this.items = items;
    this.found = found;
    this.page = page;
    this.pages = pages;
    this.perPage = perPage;
    this.hiddenOnPage = hiddenOnPage;
  }

  public VacanciesVisitorsResponse items(List<VacanciesVisitorsVisitorItemsItemsInner> items) {
    this.items = items;
    return this;
  }

  public VacanciesVisitorsResponse addItemsItem(VacanciesVisitorsVisitorItemsItemsInner itemsItem) {
    if (this.items == null) {
      this.items = new ArrayList<>();
    }
    this.items.add(itemsItem);
    return this;
  }

  /**
   * Список сокращенных представлений резюме
   * @return items
  */
  @NotNull @Valid @Size(min = 0) 
  @Schema(name = "items", description = "Список сокращенных представлений резюме", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("items")
  public List<VacanciesVisitorsVisitorItemsItemsInner> getItems() {
    return items;
  }

  public void setItems(List<VacanciesVisitorsVisitorItemsItemsInner> items) {
    this.items = items;
  }

  public VacanciesVisitorsResponse found(Integer found) {
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

  public VacanciesVisitorsResponse page(Integer page) {
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

  public VacanciesVisitorsResponse pages(Integer pages) {
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

  public VacanciesVisitorsResponse perPage(Integer perPage) {
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

  public VacanciesVisitorsResponse hiddenOnPage(BigDecimal hiddenOnPage) {
    this.hiddenOnPage = hiddenOnPage;
    return this;
  }

  /**
   * Количество удаленных или скрытых соискателями резюме на странице
   * @return hiddenOnPage
  */
  @NotNull @Valid 
  @Schema(name = "hidden_on_page", description = "Количество удаленных или скрытых соискателями резюме на странице", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("hidden_on_page")
  public BigDecimal getHiddenOnPage() {
    return hiddenOnPage;
  }

  public void setHiddenOnPage(BigDecimal hiddenOnPage) {
    this.hiddenOnPage = hiddenOnPage;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    VacanciesVisitorsResponse vacanciesVisitorsResponse = (VacanciesVisitorsResponse) o;
    return Objects.equals(this.items, vacanciesVisitorsResponse.items) &&
        Objects.equals(this.found, vacanciesVisitorsResponse.found) &&
        Objects.equals(this.page, vacanciesVisitorsResponse.page) &&
        Objects.equals(this.pages, vacanciesVisitorsResponse.pages) &&
        Objects.equals(this.perPage, vacanciesVisitorsResponse.perPage) &&
        Objects.equals(this.hiddenOnPage, vacanciesVisitorsResponse.hiddenOnPage);
  }

  @Override
  public int hashCode() {
    return Objects.hash(items, found, page, pages, perPage, hiddenOnPage);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class VacanciesVisitorsResponse {\n");
    sb.append("    items: ").append(toIndentedString(items)).append("\n");
    sb.append("    found: ").append(toIndentedString(found)).append("\n");
    sb.append("    page: ").append(toIndentedString(page)).append("\n");
    sb.append("    pages: ").append(toIndentedString(pages)).append("\n");
    sb.append("    perPage: ").append(toIndentedString(perPage)).append("\n");
    sb.append("    hiddenOnPage: ").append(toIndentedString(hiddenOnPage)).append("\n");
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

