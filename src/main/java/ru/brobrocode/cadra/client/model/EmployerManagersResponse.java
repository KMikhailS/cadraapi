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
 * EmployerManagersResponse
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2025-08-17T15:41:09.394389505+05:00[Asia/Yekaterinburg]", comments = "Generator version: 7.6.0")
public class EmployerManagersResponse {

  private Integer found;

  @Valid
  private List<@Valid EmployerManagersEmployerManagerItem> items = new ArrayList<>();

  private Integer page;

  private Integer pages;

  private Integer perPage;

  public EmployerManagersResponse() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public EmployerManagersResponse(Integer found, List<@Valid EmployerManagersEmployerManagerItem> items, Integer page, Integer pages, Integer perPage) {
    this.found = found;
    this.items = items;
    this.page = page;
    this.pages = pages;
    this.perPage = perPage;
  }

  public EmployerManagersResponse found(Integer found) {
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

  public EmployerManagersResponse items(List<@Valid EmployerManagersEmployerManagerItem> items) {
    this.items = items;
    return this;
  }

  public EmployerManagersResponse addItemsItem(EmployerManagersEmployerManagerItem itemsItem) {
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
  public List<@Valid EmployerManagersEmployerManagerItem> getItems() {
    return items;
  }

  public void setItems(List<@Valid EmployerManagersEmployerManagerItem> items) {
    this.items = items;
  }

  public EmployerManagersResponse page(Integer page) {
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

  public EmployerManagersResponse pages(Integer pages) {
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

  public EmployerManagersResponse perPage(Integer perPage) {
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
    EmployerManagersResponse employerManagersResponse = (EmployerManagersResponse) o;
    return Objects.equals(this.found, employerManagersResponse.found) &&
        Objects.equals(this.items, employerManagersResponse.items) &&
        Objects.equals(this.page, employerManagersResponse.page) &&
        Objects.equals(this.pages, employerManagersResponse.pages) &&
        Objects.equals(this.perPage, employerManagersResponse.perPage);
  }

  @Override
  public int hashCode() {
    return Objects.hash(found, items, page, pages, perPage);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EmployerManagersResponse {\n");
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

