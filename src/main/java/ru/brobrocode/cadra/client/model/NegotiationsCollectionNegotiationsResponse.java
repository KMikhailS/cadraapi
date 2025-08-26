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
 * NegotiationsCollectionNegotiationsResponse
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2025-08-17T15:41:09.394389505+05:00[Asia/Yekaterinburg]", comments = "Generator version: 7.6.0")
public class NegotiationsCollectionNegotiationsResponse {

  private IncludesIdName orderedBy;

  private Integer found;

  private Integer page;

  private Integer pages;

  private Integer perPage;

  @Valid
  private List<NegotiationsCollectionNegotiationsItemsInner> items = new ArrayList<>();

  public NegotiationsCollectionNegotiationsResponse() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public NegotiationsCollectionNegotiationsResponse(IncludesIdName orderedBy, Integer found, Integer page, Integer pages, Integer perPage, List<NegotiationsCollectionNegotiationsItemsInner> items) {
    this.orderedBy = orderedBy;
    this.found = found;
    this.page = page;
    this.pages = pages;
    this.perPage = perPage;
    this.items = items;
  }

  public NegotiationsCollectionNegotiationsResponse orderedBy(IncludesIdName orderedBy) {
    this.orderedBy = orderedBy;
    return this;
  }

  /**
   * Применяемый тип сортировки
   * @return orderedBy
  */
  @NotNull @Valid 
  @Schema(name = "ordered_by", description = "Применяемый тип сортировки", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("ordered_by")
  public IncludesIdName getOrderedBy() {
    return orderedBy;
  }

  public void setOrderedBy(IncludesIdName orderedBy) {
    this.orderedBy = orderedBy;
  }

  public NegotiationsCollectionNegotiationsResponse found(Integer found) {
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

  public NegotiationsCollectionNegotiationsResponse page(Integer page) {
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

  public NegotiationsCollectionNegotiationsResponse pages(Integer pages) {
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

  public NegotiationsCollectionNegotiationsResponse perPage(Integer perPage) {
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

  public NegotiationsCollectionNegotiationsResponse items(List<NegotiationsCollectionNegotiationsItemsInner> items) {
    this.items = items;
    return this;
  }

  public NegotiationsCollectionNegotiationsResponse addItemsItem(NegotiationsCollectionNegotiationsItemsInner itemsItem) {
    if (this.items == null) {
      this.items = new ArrayList<>();
    }
    this.items.add(itemsItem);
    return this;
  }

  /**
   * Get items
   * @return items
  */
  @NotNull @Valid @Size(min = 0) 
  @Schema(name = "items", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("items")
  public List<NegotiationsCollectionNegotiationsItemsInner> getItems() {
    return items;
  }

  public void setItems(List<NegotiationsCollectionNegotiationsItemsInner> items) {
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
    NegotiationsCollectionNegotiationsResponse negotiationsCollectionNegotiationsResponse = (NegotiationsCollectionNegotiationsResponse) o;
    return Objects.equals(this.orderedBy, negotiationsCollectionNegotiationsResponse.orderedBy) &&
        Objects.equals(this.found, negotiationsCollectionNegotiationsResponse.found) &&
        Objects.equals(this.page, negotiationsCollectionNegotiationsResponse.page) &&
        Objects.equals(this.pages, negotiationsCollectionNegotiationsResponse.pages) &&
        Objects.equals(this.perPage, negotiationsCollectionNegotiationsResponse.perPage) &&
        Objects.equals(this.items, negotiationsCollectionNegotiationsResponse.items);
  }

  @Override
  public int hashCode() {
    return Objects.hash(orderedBy, found, page, pages, perPage, items);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class NegotiationsCollectionNegotiationsResponse {\n");
    sb.append("    orderedBy: ").append(toIndentedString(orderedBy)).append("\n");
    sb.append("    found: ").append(toIndentedString(found)).append("\n");
    sb.append("    page: ").append(toIndentedString(page)).append("\n");
    sb.append("    pages: ").append(toIndentedString(pages)).append("\n");
    sb.append("    perPage: ").append(toIndentedString(perPage)).append("\n");
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

