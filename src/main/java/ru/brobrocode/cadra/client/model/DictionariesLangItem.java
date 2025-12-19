package ru.brobrocode.cadra.client.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.annotation.Generated;
import jakarta.validation.constraints.NotNull;

import java.util.Objects;

/**
 * DictionariesLangItem
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2025-08-17T15:41:09.394389505+05:00[Asia/Yekaterinburg]", comments = "Generator version: 7.6.0")
public class DictionariesLangItem {

  private String id;

  private String name;

  private String uid;

  public DictionariesLangItem() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public DictionariesLangItem(String id, String name, String uid) {
    this.id = id;
    this.name = name;
    this.uid = uid;
  }

  public DictionariesLangItem id(String id) {
    this.id = id;
    return this;
  }

  /**
   * Идентификатор языка
   * @return id
  */
  @NotNull 
  @Schema(name = "id", example = "ita", description = "Идентификатор языка", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("id")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public DictionariesLangItem name(String name) {
    this.name = name;
    return this;
  }

  /**
   * Название языка
   * @return name
  */
  @NotNull 
  @Schema(name = "name", example = "Итальянский", description = "Название языка", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("name")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public DictionariesLangItem uid(String uid) {
    this.uid = uid;
    return this;
  }

  /**
   * Универсальный идентификатор языка
   * @return uid
  */
  @NotNull 
  @Schema(name = "uid", example = "17", description = "Универсальный идентификатор языка", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("uid")
  public String getUid() {
    return uid;
  }

  public void setUid(String uid) {
    this.uid = uid;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DictionariesLangItem dictionariesLangItem = (DictionariesLangItem) o;
    return Objects.equals(this.id, dictionariesLangItem.id) &&
        Objects.equals(this.name, dictionariesLangItem.name) &&
        Objects.equals(this.uid, dictionariesLangItem.uid);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, uid);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DictionariesLangItem {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    uid: ").append(toIndentedString(uid)).append("\n");
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

