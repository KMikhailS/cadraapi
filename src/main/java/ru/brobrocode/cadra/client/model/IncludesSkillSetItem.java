package ru.brobrocode.cadra.client.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.annotation.Generated;
import jakarta.validation.constraints.NotNull;

import java.util.Objects;

/**
 * IncludesSkillSetItem
 */

@JsonTypeName("_IncludesSkillSetItem")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2025-08-17T15:41:09.394389505+05:00[Asia/Yekaterinburg]", comments = "Generator version: 7.6.0")
public class IncludesSkillSetItem {

  private String id;

  private String text;

  public IncludesSkillSetItem() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public IncludesSkillSetItem(String id, String text) {
    this.id = id;
    this.text = text;
  }

  public IncludesSkillSetItem id(String id) {
    this.id = id;
    return this;
  }

  /**
   * Идентификатор ключевого навыка
   * @return id
  */
  @NotNull 
  @Schema(name = "id", description = "Идентификатор ключевого навыка", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("id")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public IncludesSkillSetItem text(String text) {
    this.text = text;
    return this;
  }

  /**
   * Название ключевого навыка
   * @return text
  */
  @NotNull 
  @Schema(name = "text", description = "Название ключевого навыка", requiredMode = Schema.RequiredMode.REQUIRED)
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
    IncludesSkillSetItem includesSkillSetItem = (IncludesSkillSetItem) o;
    return Objects.equals(this.id, includesSkillSetItem.id) &&
        Objects.equals(this.text, includesSkillSetItem.text);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, text);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IncludesSkillSetItem {\n");
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

