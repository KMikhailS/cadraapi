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
 * ResumesSearchForResumesResponse
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2025-08-17T15:41:09.394389505+05:00[Asia/Yekaterinburg]", comments = "Generator version: 7.6.0")
public class ResumesSearchForResumesResponse {

  private Integer found;

  private Integer page;

  private Integer pages;

  private Integer perPage;

  @Valid
  private List<ResumesSearchForEmployerAndApplicant> items = new ArrayList<>();

  public ResumesSearchForResumesResponse() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public ResumesSearchForResumesResponse(Integer found, Integer page, Integer pages, Integer perPage, List<ResumesSearchForEmployerAndApplicant> items) {
    this.found = found;
    this.page = page;
    this.pages = pages;
    this.perPage = perPage;
    this.items = items;
  }

  public ResumesSearchForResumesResponse found(Integer found) {
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

  public ResumesSearchForResumesResponse page(Integer page) {
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

  public ResumesSearchForResumesResponse pages(Integer pages) {
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

  public ResumesSearchForResumesResponse perPage(Integer perPage) {
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

  public ResumesSearchForResumesResponse items(List<ResumesSearchForEmployerAndApplicant> items) {
    this.items = items;
    return this;
  }

  public ResumesSearchForResumesResponse addItemsItem(ResumesSearchForEmployerAndApplicant itemsItem) {
    if (this.items == null) {
      this.items = new ArrayList<>();
    }
    this.items.add(itemsItem);
    return this;
  }

  /**
   * Массив найденных резюме
   * @return items
  */
  @NotNull @Valid 
  @Schema(name = "items", description = "Массив найденных резюме", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("items")
  public List<ResumesSearchForEmployerAndApplicant> getItems() {
    return items;
  }

  public void setItems(List<ResumesSearchForEmployerAndApplicant> items) {
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
    ResumesSearchForResumesResponse resumesSearchForResumesResponse = (ResumesSearchForResumesResponse) o;
    return Objects.equals(this.found, resumesSearchForResumesResponse.found) &&
        Objects.equals(this.page, resumesSearchForResumesResponse.page) &&
        Objects.equals(this.pages, resumesSearchForResumesResponse.pages) &&
        Objects.equals(this.perPage, resumesSearchForResumesResponse.perPage) &&
        Objects.equals(this.items, resumesSearchForResumesResponse.items);
  }

  @Override
  public int hashCode() {
    return Objects.hash(found, page, pages, perPage, items);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ResumesSearchForResumesResponse {\n");
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

