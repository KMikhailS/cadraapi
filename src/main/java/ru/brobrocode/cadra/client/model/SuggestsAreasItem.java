package ru.brobrocode.cadra.client.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.annotation.Generated;
import jakarta.validation.constraints.NotNull;

import java.util.Objects;

/**
 * SuggestsAreasItem
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2025-08-17T15:41:09.394389505+05:00[Asia/Yekaterinburg]", comments = "Generator version: 7.6.0")
public class SuggestsAreasItem {

  private String id;

  private String text;

  private String url;

  public SuggestsAreasItem() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public SuggestsAreasItem(String id, String text, String url) {
    this.id = id;
    this.text = text;
    this.url = url;
  }

  public SuggestsAreasItem id(String id) {
    this.id = id;
    return this;
  }

  /**
   * Идентификатор региона
   * @return id
  */
  @NotNull 
  @Schema(name = "id", description = "Идентификатор региона", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("id")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public SuggestsAreasItem text(String text) {
    this.text = text;
    return this;
  }

  /**
   * Название региона
   * @return text
  */
  @NotNull 
  @Schema(name = "text", description = "Название региона", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("text")
  public String getText() {
    return text;
  }

  public void setText(String text) {
    this.text = text;
  }

  public SuggestsAreasItem url(String url) {
    this.url = url;
    return this;
  }

  /**
   * URL региона
   * @return url
  */
  @NotNull 
  @Schema(name = "url", description = "URL региона", requiredMode = Schema.RequiredMode.REQUIRED)
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
    SuggestsAreasItem suggestsAreasItem = (SuggestsAreasItem) o;
    return Objects.equals(this.id, suggestsAreasItem.id) &&
        Objects.equals(this.text, suggestsAreasItem.text) &&
        Objects.equals(this.url, suggestsAreasItem.url);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, text, url);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SuggestsAreasItem {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    text: ").append(toIndentedString(text)).append("\n");
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

