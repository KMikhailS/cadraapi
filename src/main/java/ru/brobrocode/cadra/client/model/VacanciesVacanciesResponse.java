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
 * VacanciesVacanciesResponse
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2025-08-17T15:41:09.394389505+05:00[Asia/Yekaterinburg]", comments = "Generator version: 7.6.0")
public class VacanciesVacanciesResponse {

  @Valid
  private List<VacanciesVacanciesItem> items = new ArrayList<>();

  private Integer found;

  private Integer page;

  private Integer pages;

  private Integer perPage;

  @Valid
  private List<@Valid VacanciesClusterItem> clusters;

  @Valid
  private List<@Valid VacanciesArgumentItem> arguments;

  private String alternateUrl = null;

  private VacanciesFixes fixes = null;

  private VacanciesSuggests suggests = null;

  public VacanciesVacanciesResponse() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public VacanciesVacanciesResponse(List<VacanciesVacanciesItem> items, Integer found, Integer page, Integer pages, Integer perPage) {
    this.items = items;
    this.found = found;
    this.page = page;
    this.pages = pages;
    this.perPage = perPage;
  }

  public VacanciesVacanciesResponse items(List<VacanciesVacanciesItem> items) {
    this.items = items;
    return this;
  }

  public VacanciesVacanciesResponse addItemsItem(VacanciesVacanciesItem itemsItem) {
    if (this.items == null) {
      this.items = new ArrayList<>();
    }
    this.items.add(itemsItem);
    return this;
  }

  /**
   * Список вакансий
   * @return items
  */
  @NotNull @Valid @Size(min = 0) 
  @Schema(name = "items", description = "Список вакансий", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("items")
  public List<VacanciesVacanciesItem> getItems() {
    return items;
  }

  public void setItems(List<VacanciesVacanciesItem> items) {
    this.items = items;
  }

  public VacanciesVacanciesResponse found(Integer found) {
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

  public VacanciesVacanciesResponse page(Integer page) {
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

  public VacanciesVacanciesResponse pages(Integer pages) {
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

  public VacanciesVacanciesResponse perPage(Integer perPage) {
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

  public VacanciesVacanciesResponse clusters(List<@Valid VacanciesClusterItem> clusters) {
    this.clusters = clusters;
    return this;
  }

  public VacanciesVacanciesResponse addClustersItem(VacanciesClusterItem clustersItem) {
    if (this.clusters == null) {
      this.clusters = new ArrayList<>();
    }
    this.clusters.add(clustersItem);
    return this;
  }

  /**
   * Массив [кластеров поиска](#tag/Poisk-vakansij/Klastery-v-poiske-vakansij)
   * @return clusters
  */
  @Valid 
  @Schema(name = "clusters", description = "Массив [кластеров поиска](#tag/Poisk-vakansij/Klastery-v-poiske-vakansij)", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("clusters")
  public List<@Valid VacanciesClusterItem> getClusters() {
    return clusters;
  }

  public void setClusters(List<@Valid VacanciesClusterItem> clusters) {
    this.clusters = clusters;
  }

  public VacanciesVacanciesResponse arguments(List<@Valid VacanciesArgumentItem> arguments) {
    this.arguments = arguments;
    return this;
  }

  public VacanciesVacanciesResponse addArgumentsItem(VacanciesArgumentItem argumentsItem) {
    if (this.arguments == null) {
      this.arguments = new ArrayList<>();
    }
    this.arguments.add(argumentsItem);
    return this;
  }

  /**
   * Массив параметров поиска, переданных в запросе.  Возвращается только если в запросе передан параметр `describe_arguments=true`. В массиве выдаются только те параметры, которые влияют на поиск вакансий. Неизвестные параметры игнорируются. Элемент списка с одним значением `argument` может повторяться несколько раз, если параметр имеет несколько значений 
   * @return arguments
  */
  @Valid 
  @Schema(name = "arguments", description = "Массив параметров поиска, переданных в запросе.  Возвращается только если в запросе передан параметр `describe_arguments=true`. В массиве выдаются только те параметры, которые влияют на поиск вакансий. Неизвестные параметры игнорируются. Элемент списка с одним значением `argument` может повторяться несколько раз, если параметр имеет несколько значений ", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("arguments")
  public List<@Valid VacanciesArgumentItem> getArguments() {
    return arguments;
  }

  public void setArguments(List<@Valid VacanciesArgumentItem> arguments) {
    this.arguments = arguments;
  }

  public VacanciesVacanciesResponse alternateUrl(String alternateUrl) {
    this.alternateUrl = alternateUrl;
    return this;
  }

  /**
   * Ссылка на вакансию
   * @return alternateUrl
  */
  
  @Schema(name = "alternate_url", description = "Ссылка на вакансию", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("alternate_url")
  public String getAlternateUrl() {
    return alternateUrl;
  }

  public void setAlternateUrl(String alternateUrl) {
    this.alternateUrl = alternateUrl;
  }

  public VacanciesVacanciesResponse fixes(VacanciesFixes fixes) {
    this.fixes = fixes;
    return this;
  }

  /**
   * Get fixes
   * @return fixes
  */
  @Valid 
  @Schema(name = "fixes", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("fixes")
  public VacanciesFixes getFixes() {
    return fixes;
  }

  public void setFixes(VacanciesFixes fixes) {
    this.fixes = fixes;
  }

  public VacanciesVacanciesResponse suggests(VacanciesSuggests suggests) {
    this.suggests = suggests;
    return this;
  }

  /**
   * Get suggests
   * @return suggests
  */
  @Valid 
  @Schema(name = "suggests", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("suggests")
  public VacanciesSuggests getSuggests() {
    return suggests;
  }

  public void setSuggests(VacanciesSuggests suggests) {
    this.suggests = suggests;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    VacanciesVacanciesResponse vacanciesVacanciesResponse = (VacanciesVacanciesResponse) o;
    return Objects.equals(this.items, vacanciesVacanciesResponse.items) &&
        Objects.equals(this.found, vacanciesVacanciesResponse.found) &&
        Objects.equals(this.page, vacanciesVacanciesResponse.page) &&
        Objects.equals(this.pages, vacanciesVacanciesResponse.pages) &&
        Objects.equals(this.perPage, vacanciesVacanciesResponse.perPage) &&
        Objects.equals(this.clusters, vacanciesVacanciesResponse.clusters) &&
        Objects.equals(this.arguments, vacanciesVacanciesResponse.arguments) &&
        Objects.equals(this.alternateUrl, vacanciesVacanciesResponse.alternateUrl) &&
        Objects.equals(this.fixes, vacanciesVacanciesResponse.fixes) &&
        Objects.equals(this.suggests, vacanciesVacanciesResponse.suggests);
  }

  @Override
  public int hashCode() {
    return Objects.hash(items, found, page, pages, perPage, clusters, arguments, alternateUrl, fixes, suggests);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class VacanciesVacanciesResponse {\n");
    sb.append("    items: ").append(toIndentedString(items)).append("\n");
    sb.append("    found: ").append(toIndentedString(found)).append("\n");
    sb.append("    page: ").append(toIndentedString(page)).append("\n");
    sb.append("    pages: ").append(toIndentedString(pages)).append("\n");
    sb.append("    perPage: ").append(toIndentedString(perPage)).append("\n");
    sb.append("    clusters: ").append(toIndentedString(clusters)).append("\n");
    sb.append("    arguments: ").append(toIndentedString(arguments)).append("\n");
    sb.append("    alternateUrl: ").append(toIndentedString(alternateUrl)).append("\n");
    sb.append("    fixes: ").append(toIndentedString(fixes)).append("\n");
    sb.append("    suggests: ").append(toIndentedString(suggests)).append("\n");
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

