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
 * VacancyDraftVacancyDraftItems
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2025-08-17T15:41:09.394389505+05:00[Asia/Yekaterinburg]", comments = "Generator version: 7.6.0")
public class VacancyDraftVacancyDraftItems {

  private Integer found;

  @Valid
  private List<VacancyDraftVacancyDraftItem> items = new ArrayList<>();

  private Integer page;

  private Integer pages;

  private Integer perPage;

  public VacancyDraftVacancyDraftItems() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public VacancyDraftVacancyDraftItems(Integer found, List<VacancyDraftVacancyDraftItem> items, Integer page, Integer pages, Integer perPage) {
    this.found = found;
    this.items = items;
    this.page = page;
    this.pages = pages;
    this.perPage = perPage;
  }

  public VacancyDraftVacancyDraftItems found(Integer found) {
    this.found = found;
    return this;
  }

  /**
   * Get found
   * @return found
  */
  @NotNull 
  @Schema(name = "found", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("found")
  public Integer getFound() {
    return found;
  }

  public void setFound(Integer found) {
    this.found = found;
  }

  public VacancyDraftVacancyDraftItems items(List<VacancyDraftVacancyDraftItem> items) {
    this.items = items;
    return this;
  }

  public VacancyDraftVacancyDraftItems addItemsItem(VacancyDraftVacancyDraftItem itemsItem) {
    if (this.items == null) {
      this.items = new ArrayList<>();
    }
    this.items.add(itemsItem);
    return this;
  }

  /**
   * Список черновиков
   * @return items
  */
  @NotNull @Valid 
  @Schema(name = "items", description = "Список черновиков", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("items")
  public List<VacancyDraftVacancyDraftItem> getItems() {
    return items;
  }

  public void setItems(List<VacancyDraftVacancyDraftItem> items) {
    this.items = items;
  }

  public VacancyDraftVacancyDraftItems page(Integer page) {
    this.page = page;
    return this;
  }

  /**
   * Get page
   * @return page
  */
  @NotNull 
  @Schema(name = "page", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("page")
  public Integer getPage() {
    return page;
  }

  public void setPage(Integer page) {
    this.page = page;
  }

  public VacancyDraftVacancyDraftItems pages(Integer pages) {
    this.pages = pages;
    return this;
  }

  /**
   * Get pages
   * @return pages
  */
  @NotNull 
  @Schema(name = "pages", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("pages")
  public Integer getPages() {
    return pages;
  }

  public void setPages(Integer pages) {
    this.pages = pages;
  }

  public VacancyDraftVacancyDraftItems perPage(Integer perPage) {
    this.perPage = perPage;
    return this;
  }

  /**
   * Get perPage
   * @return perPage
  */
  @NotNull 
  @Schema(name = "per_page", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("per_page")
  public Integer getPerPage() {
    return perPage;
  }

  public void setPerPage(Integer perPage) {
    this.perPage = perPage;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    VacancyDraftVacancyDraftItems vacancyDraftVacancyDraftItems = (VacancyDraftVacancyDraftItems) o;
    return Objects.equals(this.found, vacancyDraftVacancyDraftItems.found) &&
        Objects.equals(this.items, vacancyDraftVacancyDraftItems.items) &&
        Objects.equals(this.page, vacancyDraftVacancyDraftItems.page) &&
        Objects.equals(this.pages, vacancyDraftVacancyDraftItems.pages) &&
        Objects.equals(this.perPage, vacancyDraftVacancyDraftItems.perPage);
  }

  @Override
  public int hashCode() {
    return Objects.hash(found, items, page, pages, perPage);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class VacancyDraftVacancyDraftItems {\n");
    sb.append("    found: ").append(toIndentedString(found)).append("\n");
    sb.append("    items: ").append(toIndentedString(items)).append("\n");
    sb.append("    page: ").append(toIndentedString(page)).append("\n");
    sb.append("    pages: ").append(toIndentedString(pages)).append("\n");
    sb.append("    perPage: ").append(toIndentedString(perPage)).append("\n");
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

