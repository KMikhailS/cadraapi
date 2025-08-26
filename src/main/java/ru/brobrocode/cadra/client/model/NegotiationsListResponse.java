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
 * NegotiationsListResponse
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2025-08-17T15:41:09.394389505+05:00[Asia/Yekaterinburg]", comments = "Generator version: 7.6.0")
public class NegotiationsListResponse {

  @Valid
  private List<@Valid NegotiationsListItem> items = new ArrayList<>();

  private Integer found;

  private Integer page;

  private Integer pages;

  private Integer perPage;

  @Valid
  private List<@Valid NegotiationsNegotiationsCollection> collections = new ArrayList<>();

  @Valid
  private List<@Valid EmployersEmployersState> employerStates = new ArrayList<>();

  @Valid
  private List<@Valid NegotiationsNegotiationsCollection> generatedCollections = new ArrayList<>();

  public NegotiationsListResponse() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public NegotiationsListResponse(List<@Valid NegotiationsListItem> items, Integer found, Integer page, Integer pages, Integer perPage, List<@Valid NegotiationsNegotiationsCollection> collections, List<@Valid EmployersEmployersState> employerStates, List<@Valid NegotiationsNegotiationsCollection> generatedCollections) {
    this.items = items;
    this.found = found;
    this.page = page;
    this.pages = pages;
    this.perPage = perPage;
    this.collections = collections;
    this.employerStates = employerStates;
    this.generatedCollections = generatedCollections;
  }

  public NegotiationsListResponse items(List<@Valid NegotiationsListItem> items) {
    this.items = items;
    return this;
  }

  public NegotiationsListResponse addItemsItem(NegotiationsListItem itemsItem) {
    if (this.items == null) {
      this.items = new ArrayList<>();
    }
    this.items.add(itemsItem);
    return this;
  }

  /**
   * Список откликов
   * @return items
  */
  @NotNull @Valid @Size(min = 0) 
  @Schema(name = "items", description = "Список откликов", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("items")
  public List<@Valid NegotiationsListItem> getItems() {
    return items;
  }

  public void setItems(List<@Valid NegotiationsListItem> items) {
    this.items = items;
  }

  public NegotiationsListResponse found(Integer found) {
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

  public NegotiationsListResponse page(Integer page) {
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

  public NegotiationsListResponse pages(Integer pages) {
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

  public NegotiationsListResponse perPage(Integer perPage) {
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

  public NegotiationsListResponse collections(List<@Valid NegotiationsNegotiationsCollection> collections) {
    this.collections = collections;
    return this;
  }

  public NegotiationsListResponse addCollectionsItem(NegotiationsNegotiationsCollection collectionsItem) {
    if (this.collections == null) {
      this.collections = new ArrayList<>();
    }
    this.collections.add(collectionsItem);
    return this;
  }

  /**
   * Коллекции откликов/приглашений для данной вакансии
   * @return collections
  */
  @NotNull @Valid 
  @Schema(name = "collections", description = "Коллекции откликов/приглашений для данной вакансии", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("collections")
  public List<@Valid NegotiationsNegotiationsCollection> getCollections() {
    return collections;
  }

  public void setCollections(List<@Valid NegotiationsNegotiationsCollection> collections) {
    this.collections = collections;
  }

  public NegotiationsListResponse employerStates(List<@Valid EmployersEmployersState> employerStates) {
    this.employerStates = employerStates;
    return this;
  }

  public NegotiationsListResponse addEmployerStatesItem(EmployersEmployersState employerStatesItem) {
    if (this.employerStates == null) {
      this.employerStates = new ArrayList<>();
    }
    this.employerStates.add(employerStatesItem);
    return this;
  }

  /**
   * Состояния [откликов/приглашений](https://github.com/hhru/api/blob/master/docs/employer_negotiations.md#term-employer-state) вакансии для работодателя 
   * @return employerStates
  */
  @NotNull @Valid 
  @Schema(name = "employer_states", description = "Состояния [откликов/приглашений](https://github.com/hhru/api/blob/master/docs/employer_negotiations.md#term-employer-state) вакансии для работодателя ", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("employer_states")
  public List<@Valid EmployersEmployersState> getEmployerStates() {
    return employerStates;
  }

  public void setEmployerStates(List<@Valid EmployersEmployersState> employerStates) {
    this.employerStates = employerStates;
  }

  public NegotiationsListResponse generatedCollections(List<@Valid NegotiationsNegotiationsCollection> generatedCollections) {
    this.generatedCollections = generatedCollections;
    return this;
  }

  public NegotiationsListResponse addGeneratedCollectionsItem(NegotiationsNegotiationsCollection generatedCollectionsItem) {
    if (this.generatedCollections == null) {
      this.generatedCollections = new ArrayList<>();
    }
    this.generatedCollections.add(generatedCollectionsItem);
    return this;
  }

  /**
   * Сгенерированные коллекции откликов/приглашений для данной вакансии
   * @return generatedCollections
  */
  @NotNull @Valid 
  @Schema(name = "generated_collections", description = "Сгенерированные коллекции откликов/приглашений для данной вакансии", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("generated_collections")
  public List<@Valid NegotiationsNegotiationsCollection> getGeneratedCollections() {
    return generatedCollections;
  }

  public void setGeneratedCollections(List<@Valid NegotiationsNegotiationsCollection> generatedCollections) {
    this.generatedCollections = generatedCollections;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    NegotiationsListResponse negotiationsListResponse = (NegotiationsListResponse) o;
    return Objects.equals(this.items, negotiationsListResponse.items) &&
        Objects.equals(this.found, negotiationsListResponse.found) &&
        Objects.equals(this.page, negotiationsListResponse.page) &&
        Objects.equals(this.pages, negotiationsListResponse.pages) &&
        Objects.equals(this.perPage, negotiationsListResponse.perPage) &&
        Objects.equals(this.collections, negotiationsListResponse.collections) &&
        Objects.equals(this.employerStates, negotiationsListResponse.employerStates) &&
        Objects.equals(this.generatedCollections, negotiationsListResponse.generatedCollections);
  }

  @Override
  public int hashCode() {
    return Objects.hash(items, found, page, pages, perPage, collections, employerStates, generatedCollections);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class NegotiationsListResponse {\n");
    sb.append("    items: ").append(toIndentedString(items)).append("\n");
    sb.append("    found: ").append(toIndentedString(found)).append("\n");
    sb.append("    page: ").append(toIndentedString(page)).append("\n");
    sb.append("    pages: ").append(toIndentedString(pages)).append("\n");
    sb.append("    perPage: ").append(toIndentedString(perPage)).append("\n");
    sb.append("    collections: ").append(toIndentedString(collections)).append("\n");
    sb.append("    employerStates: ").append(toIndentedString(employerStates)).append("\n");
    sb.append("    generatedCollections: ").append(toIndentedString(generatedCollections)).append("\n");
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

