package ru.brobrocode.cadra.client.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.annotation.Generated;
import jakarta.validation.constraints.NotNull;

import java.util.Objects;

/**
 * SuggestsSearchKeywordItem
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2025-08-17T15:41:09.394389505+05:00[Asia/Yekaterinburg]", comments = "Generator version: 7.6.0")
public class SuggestsSearchKeywordItem {

  private String text;

  public SuggestsSearchKeywordItem() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public SuggestsSearchKeywordItem(String text) {
    this.text = text;
  }

  public SuggestsSearchKeywordItem text(String text) {
    this.text = text;
    return this;
  }

  /**
   * Ключевое слово
   * @return text
  */
  @NotNull 
  @Schema(name = "text", description = "Ключевое слово", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("text")
  public String getText() {
    return text;
  }

  public void setText(String text) {
    this.text = text;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SuggestsSearchKeywordItem suggestsSearchKeywordItem = (SuggestsSearchKeywordItem) o;
    return Objects.equals(this.text, suggestsSearchKeywordItem.text);
  }

  @Override
  public int hashCode() {
    return Objects.hash(text);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SuggestsSearchKeywordItem {\n");
    sb.append("    text: ").append(toIndentedString(text)).append("\n");
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

