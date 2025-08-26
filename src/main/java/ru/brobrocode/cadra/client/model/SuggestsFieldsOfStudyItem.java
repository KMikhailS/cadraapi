package ru.brobrocode.cadra.client.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.annotation.Generated;
import jakarta.validation.constraints.NotNull;

import java.util.Objects;

/**
 * SuggestsFieldsOfStudyItem
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2025-08-17T15:41:09.394389505+05:00[Asia/Yekaterinburg]", comments = "Generator version: 7.6.0")
public class SuggestsFieldsOfStudyItem {

  private String id;

  private String text;

  public SuggestsFieldsOfStudyItem() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public SuggestsFieldsOfStudyItem(String id, String text) {
    this.id = id;
    this.text = text;
  }

  public SuggestsFieldsOfStudyItem id(String id) {
    this.id = id;
    return this;
  }

  /**
   * Идентификатор специализации
   * @return id
  */
  @NotNull 
  @Schema(name = "id", description = "Идентификатор специализации", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("id")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public SuggestsFieldsOfStudyItem text(String text) {
    this.text = text;
    return this;
  }

  /**
   * Название специализации
   * @return text
  */
  @NotNull 
  @Schema(name = "text", description = "Название специализации", requiredMode = Schema.RequiredMode.REQUIRED)
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
    SuggestsFieldsOfStudyItem suggestsFieldsOfStudyItem = (SuggestsFieldsOfStudyItem) o;
    return Objects.equals(this.id, suggestsFieldsOfStudyItem.id) &&
        Objects.equals(this.text, suggestsFieldsOfStudyItem.text);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, text);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SuggestsFieldsOfStudyItem {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
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

