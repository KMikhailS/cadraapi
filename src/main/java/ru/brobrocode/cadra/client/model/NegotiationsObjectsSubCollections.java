package ru.brobrocode.cadra.client.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.annotation.Generated;
import jakarta.validation.constraints.NotNull;

import java.util.Objects;

/**
 * NegotiationsObjectsSubCollections
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2025-08-17T15:41:09.394389505+05:00[Asia/Yekaterinburg]", comments = "Generator version: 7.6.0")
public class NegotiationsObjectsSubCollections {

  private String id;

  private String name;

  private Boolean rootCollection;

  private String url;

  public NegotiationsObjectsSubCollections() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public NegotiationsObjectsSubCollections(String id, String name, Boolean rootCollection, String url) {
    this.id = id;
    this.name = name;
    this.rootCollection = rootCollection;
    this.url = url;
  }

  public NegotiationsObjectsSubCollections id(String id) {
    this.id = id;
    return this;
  }

  /**
   * Идентификатор коллекции подстатуса
   * @return id
  */
  @NotNull 
  @Schema(name = "id", description = "Идентификатор коллекции подстатуса", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("id")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public NegotiationsObjectsSubCollections name(String name) {
    this.name = name;
    return this;
  }

  /**
   * Название коллекции подстатуса
   * @return name
  */
  @NotNull 
  @Schema(name = "name", description = "Название коллекции подстатуса", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("name")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public NegotiationsObjectsSubCollections rootCollection(Boolean rootCollection) {
    this.rootCollection = rootCollection;
    return this;
  }

  /**
   * Является ли коллекция подстатуса обязательной. В коллекции всегда присутствует только одна обязательная коллекция подстатуса
   * @return rootCollection
  */
  @NotNull 
  @Schema(name = "root_collection", description = "Является ли коллекция подстатуса обязательной. В коллекции всегда присутствует только одна обязательная коллекция подстатуса", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("root_collection")
  public Boolean getRootCollection() {
    return rootCollection;
  }

  public void setRootCollection(Boolean rootCollection) {
    this.rootCollection = rootCollection;
  }

  public NegotiationsObjectsSubCollections url(String url) {
    this.url = url;
    return this;
  }

  /**
   * URL, [GET-запрос на который](#tag/Otklikipriglasheniya-rabotodatelya/operation/get-negotiations) возвращает список откликов/приглашений коллекции подстатуса 
   * @return url
  */
  @NotNull 
  @Schema(name = "url", description = "URL, [GET-запрос на который](#tag/Otklikipriglasheniya-rabotodatelya/operation/get-negotiations) возвращает список откликов/приглашений коллекции подстатуса ", requiredMode = Schema.RequiredMode.REQUIRED)
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
    NegotiationsObjectsSubCollections negotiationsObjectsSubCollections = (NegotiationsObjectsSubCollections) o;
    return Objects.equals(this.id, negotiationsObjectsSubCollections.id) &&
        Objects.equals(this.name, negotiationsObjectsSubCollections.name) &&
        Objects.equals(this.rootCollection, negotiationsObjectsSubCollections.rootCollection) &&
        Objects.equals(this.url, negotiationsObjectsSubCollections.url);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, rootCollection, url);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class NegotiationsObjectsSubCollections {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    rootCollection: ").append(toIndentedString(rootCollection)).append("\n");
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

