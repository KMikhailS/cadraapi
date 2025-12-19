package ru.brobrocode.cadra.client.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.annotation.Generated;
import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;

import java.math.BigDecimal;
import java.util.Objects;

/**
 * NegotiationsObjectsPoliteness
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2025-08-17T15:41:09.394389505+05:00[Asia/Yekaterinburg]", comments = "Generator version: 7.6.0")
public class NegotiationsObjectsPoliteness {

  private String articleUrl;

  private String description;

  private String hint;

  private BigDecimal index;

  @Deprecated
  private BigDecimal indexChange;

  public NegotiationsObjectsPoliteness() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public NegotiationsObjectsPoliteness(String articleUrl, String description, String hint, BigDecimal index, BigDecimal indexChange) {
    this.articleUrl = articleUrl;
    this.description = description;
    this.hint = hint;
    this.index = index;
    this.indexChange = indexChange;
  }

  public NegotiationsObjectsPoliteness articleUrl(String articleUrl) {
    this.articleUrl = articleUrl;
    return this;
  }

  /**
   * URL на статью HH про индекс вежливости
   * @return articleUrl
  */
  @NotNull 
  @Schema(name = "article_url", description = "URL на статью HH про индекс вежливости", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("article_url")
  public String getArticleUrl() {
    return articleUrl;
  }

  public void setArticleUrl(String articleUrl) {
    this.articleUrl = articleUrl;
  }

  public NegotiationsObjectsPoliteness description(String description) {
    this.description = description;
    return this;
  }

  /**
   * Описание понятия индекса вежливости
   * @return description
  */
  @NotNull 
  @Schema(name = "description", description = "Описание понятия индекса вежливости", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("description")
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public NegotiationsObjectsPoliteness hint(String hint) {
    this.hint = hint;
    return this;
  }

  /**
   * Описание текущего значения индекса вежливости
   * @return hint
  */
  @NotNull 
  @Schema(name = "hint", description = "Описание текущего значения индекса вежливости", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("hint")
  public String getHint() {
    return hint;
  }

  public void setHint(String hint) {
    this.hint = hint;
  }

  public NegotiationsObjectsPoliteness index(BigDecimal index) {
    this.index = index;
    return this;
  }

  /**
   * Значение индекса вежливости
   * @return index
  */
  @NotNull @Valid 
  @Schema(name = "index", description = "Значение индекса вежливости", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("index")
  public BigDecimal getIndex() {
    return index;
  }

  public void setIndex(BigDecimal index) {
    this.index = index;
  }

  public NegotiationsObjectsPoliteness indexChange(BigDecimal indexChange) {
    this.indexChange = indexChange;
    return this;
  }

  /**
   * Изменение индекса вежливости за последние 24 часа
   * @return indexChange
   * @deprecated
  */
  @NotNull @Valid 
  @Schema(name = "index_change", description = "Изменение индекса вежливости за последние 24 часа", deprecated = true, requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("index_change")
  @Deprecated
  public BigDecimal getIndexChange() {
    return indexChange;
  }

  /**
   * @deprecated
  */
  @Deprecated
  public void setIndexChange(BigDecimal indexChange) {
    this.indexChange = indexChange;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    NegotiationsObjectsPoliteness negotiationsObjectsPoliteness = (NegotiationsObjectsPoliteness) o;
    return Objects.equals(this.articleUrl, negotiationsObjectsPoliteness.articleUrl) &&
        Objects.equals(this.description, negotiationsObjectsPoliteness.description) &&
        Objects.equals(this.hint, negotiationsObjectsPoliteness.hint) &&
        Objects.equals(this.index, negotiationsObjectsPoliteness.index) &&
        Objects.equals(this.indexChange, negotiationsObjectsPoliteness.indexChange);
  }

  @Override
  public int hashCode() {
    return Objects.hash(articleUrl, description, hint, index, indexChange);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class NegotiationsObjectsPoliteness {\n");
    sb.append("    articleUrl: ").append(toIndentedString(articleUrl)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    hint: ").append(toIndentedString(hint)).append("\n");
    sb.append("    index: ").append(toIndentedString(index)).append("\n");
    sb.append("    indexChange: ").append(toIndentedString(indexChange)).append("\n");
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

