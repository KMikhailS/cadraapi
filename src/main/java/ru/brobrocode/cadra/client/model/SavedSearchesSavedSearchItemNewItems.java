package ru.brobrocode.cadra.client.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.annotation.Generated;
import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;

import java.math.BigDecimal;
import java.util.Objects;

/**
 * SavedSearchesSavedSearchItemNewItems
 */

@JsonTypeName("SavedSearchesSavedSearchItem_new_items")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2025-08-17T15:41:09.394389505+05:00[Asia/Yekaterinburg]", comments = "Generator version: 7.6.0")
public class SavedSearchesSavedSearchItemNewItems {

  private BigDecimal count;

  private String url;

  public SavedSearchesSavedSearchItemNewItems() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public SavedSearchesSavedSearchItemNewItems(BigDecimal count, String url) {
    this.count = count;
    this.url = url;
  }

  public SavedSearchesSavedSearchItemNewItems count(BigDecimal count) {
    this.count = count;
    return this;
  }

  /**
   * Количество элементов
   * @return count
  */
  @NotNull @Valid 
  @Schema(name = "count", description = "Количество элементов", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("count")
  public BigDecimal getCount() {
    return count;
  }

  public void setCount(BigDecimal count) {
    this.count = count;
  }

  public SavedSearchesSavedSearchItemNewItems url(String url) {
    this.url = url;
    return this;
  }

  /**
   * Ссылка на получение элементов
   * @return url
  */
  @NotNull 
  @Schema(name = "url", description = "Ссылка на получение элементов", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("url")
  public String getUrl() {
    return url;
  }

  public void setUrl(String url) {
    this.url = url;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SavedSearchesSavedSearchItemNewItems savedSearchesSavedSearchItemNewItems = (SavedSearchesSavedSearchItemNewItems) o;
    return Objects.equals(this.count, savedSearchesSavedSearchItemNewItems.count) &&
        Objects.equals(this.url, savedSearchesSavedSearchItemNewItems.url);
  }

  @Override
  public int hashCode() {
    return Objects.hash(count, url);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SavedSearchesSavedSearchItemNewItems {\n");
    sb.append("    count: ").append(toIndentedString(count)).append("\n");
    sb.append("    url: ").append(toIndentedString(url)).append("\n");
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

