package ru.brobrocode.cadra.client.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.annotation.Generated;
import jakarta.validation.constraints.NotNull;

import java.util.Objects;

/**
 * DictionariesAreaCommon
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2025-08-17T15:41:09.394389505+05:00[Asia/Yekaterinburg]", comments = "Generator version: 7.6.0")
public class DictionariesAreaCommon {

  private String id;

  private String name;

  private String namePrepositional = null;

  private String parentId = null;

  public DictionariesAreaCommon() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public DictionariesAreaCommon(String id, String name) {
    this.id = id;
    this.name = name;
  }

  public DictionariesAreaCommon id(String id) {
    this.id = id;
    return this;
  }

  /**
   * Идентификатор региона из [справочника](#tag/Obshie-spravochniki/operation/get-areas) 
   * @return id
  */
  @NotNull 
  @Schema(name = "id", description = "Идентификатор региона из [справочника](#tag/Obshie-spravochniki/operation/get-areas) ", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("id")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public DictionariesAreaCommon name(String name) {
    this.name = name;
    return this;
  }

  /**
   * Название региона
   * @return name
  */
  @NotNull 
  @Schema(name = "name", description = "Название региона", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("name")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public DictionariesAreaCommon namePrepositional(String namePrepositional) {
    this.namePrepositional = namePrepositional;
    return this;
  }

  /**
   * Применимо только для русской локализации.  Название региона в предложном падеже с предлогом `в`, например: `в Москве`. Возвращается, если в запросе передан параметр `additional_case=prepositional` 
   * @return namePrepositional
  */
  
  @Schema(name = "name_prepositional", description = "Применимо только для русской локализации.  Название региона в предложном падеже с предлогом `в`, например: `в Москве`. Возвращается, если в запросе передан параметр `additional_case=prepositional` ", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("name_prepositional")
  public String getNamePrepositional() {
    return namePrepositional;
  }

  public void setNamePrepositional(String namePrepositional) {
    this.namePrepositional = namePrepositional;
  }

  public DictionariesAreaCommon parentId(String parentId) {
    this.parentId = parentId;
    return this;
  }

  /**
   * Идентификатор родительского региона
   * @return parentId
  */
  
  @Schema(name = "parent_id", description = "Идентификатор родительского региона", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("parent_id")
  public String getParentId() {
    return parentId;
  }

  public void setParentId(String parentId) {
    this.parentId = parentId;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DictionariesAreaCommon dictionariesAreaCommon = (DictionariesAreaCommon) o;
    return Objects.equals(this.id, dictionariesAreaCommon.id) &&
        Objects.equals(this.name, dictionariesAreaCommon.name) &&
        Objects.equals(this.namePrepositional, dictionariesAreaCommon.namePrepositional) &&
        Objects.equals(this.parentId, dictionariesAreaCommon.parentId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, namePrepositional, parentId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DictionariesAreaCommon {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    namePrepositional: ").append(toIndentedString(namePrepositional)).append("\n");
    sb.append("    parentId: ").append(toIndentedString(parentId)).append("\n");
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

