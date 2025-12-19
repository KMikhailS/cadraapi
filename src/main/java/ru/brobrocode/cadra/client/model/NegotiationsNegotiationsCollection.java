package ru.brobrocode.cadra.client.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.annotation.Generated;
import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * NegotiationsNegotiationsCollection
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2025-08-17T15:41:09.394389505+05:00[Asia/Yekaterinburg]", comments = "Generator version: 7.6.0")
public class NegotiationsNegotiationsCollection {

  private String description;

  private Boolean hidden;

  private String id;

  private String name;

  @Valid
  private List<@Valid NegotiationsNegotiationsSubCollection> subCollections = new ArrayList<>();

  private String url;

  private NegotiationsObjectsEmployerCounters counters;

  @Valid
  private List<@Valid NegotiationsNegotiationsOrderTypes> orderTypes = new ArrayList<>();

  public NegotiationsNegotiationsCollection() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public NegotiationsNegotiationsCollection(String description, String id, String name, String url, List<@Valid NegotiationsNegotiationsOrderTypes> orderTypes) {
    this.description = description;
    this.id = id;
    this.name = name;
    this.url = url;
    this.orderTypes = orderTypes;
  }

  public NegotiationsNegotiationsCollection description(String description) {
    this.description = description;
    return this;
  }

  /**
   * Описание коллекции
   * @return description
  */
  @NotNull 
  @Schema(name = "description", description = "Описание коллекции", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("description")
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public NegotiationsNegotiationsCollection hidden(Boolean hidden) {
    this.hidden = hidden;
    return this;
  }

  /**
   * Является ли данная коллекция скрытой
   * @return hidden
  */
  
  @Schema(name = "hidden", description = "Является ли данная коллекция скрытой", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("hidden")
  public Boolean getHidden() {
    return hidden;
  }

  public void setHidden(Boolean hidden) {
    this.hidden = hidden;
  }

  public NegotiationsNegotiationsCollection id(String id) {
    this.id = id;
    return this;
  }

  /**
   * Идентификатор коллекции
   * @return id
  */
  @NotNull 
  @Schema(name = "id", description = "Идентификатор коллекции", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("id")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public NegotiationsNegotiationsCollection name(String name) {
    this.name = name;
    return this;
  }

  /**
   * Название коллекции
   * @return name
  */
  @NotNull 
  @Schema(name = "name", description = "Название коллекции", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("name")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public NegotiationsNegotiationsCollection subCollections(List<@Valid NegotiationsNegotiationsSubCollection> subCollections) {
    this.subCollections = subCollections;
    return this;
  }

  public NegotiationsNegotiationsCollection addSubCollectionsItem(NegotiationsNegotiationsSubCollection subCollectionsItem) {
    if (this.subCollections == null) {
      this.subCollections = new ArrayList<>();
    }
    this.subCollections.add(subCollectionsItem);
    return this;
  }

  /**
   * Коллекция подстатусов откликов/приглашений для данной вакансии
   * @return subCollections
  */
  @Valid 
  @Schema(name = "sub_collections", description = "Коллекция подстатусов откликов/приглашений для данной вакансии", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("sub_collections")
  public List<@Valid NegotiationsNegotiationsSubCollection> getSubCollections() {
    return subCollections;
  }

  public void setSubCollections(List<@Valid NegotiationsNegotiationsSubCollection> subCollections) {
    this.subCollections = subCollections;
  }

  public NegotiationsNegotiationsCollection url(String url) {
    this.url = url;
    return this;
  }

  /**
   * URL, [GET-запрос на который](#tag/Otklikipriglasheniya-rabotodatelya/operation/get-negotiations) возвращает список откликов/приглашений коллекции 
   * @return url
  */
  @NotNull 
  @Schema(name = "url", description = "URL, [GET-запрос на который](#tag/Otklikipriglasheniya-rabotodatelya/operation/get-negotiations) возвращает список откликов/приглашений коллекции ", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("url")
  public String getUrl() {
    return url;
  }

  public void setUrl(String url) {
    this.url = url;
  }

  public NegotiationsNegotiationsCollection counters(NegotiationsObjectsEmployerCounters counters) {
    this.counters = counters;
    return this;
  }

  /**
   * Get counters
   * @return counters
  */
  @Valid 
  @Schema(name = "counters", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("counters")
  public NegotiationsObjectsEmployerCounters getCounters() {
    return counters;
  }

  public void setCounters(NegotiationsObjectsEmployerCounters counters) {
    this.counters = counters;
  }

  public NegotiationsNegotiationsCollection orderTypes(List<@Valid NegotiationsNegotiationsOrderTypes> orderTypes) {
    this.orderTypes = orderTypes;
    return this;
  }

  public NegotiationsNegotiationsCollection addOrderTypesItem(NegotiationsNegotiationsOrderTypes orderTypesItem) {
    if (this.orderTypes == null) {
      this.orderTypes = new ArrayList<>();
    }
    this.orderTypes.add(orderTypesItem);
    return this;
  }

  /**
   * Get orderTypes
   * @return orderTypes
  */
  @NotNull @Valid 
  @Schema(name = "order_types", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("order_types")
  public List<@Valid NegotiationsNegotiationsOrderTypes> getOrderTypes() {
    return orderTypes;
  }

  public void setOrderTypes(List<@Valid NegotiationsNegotiationsOrderTypes> orderTypes) {
    this.orderTypes = orderTypes;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    NegotiationsNegotiationsCollection negotiationsNegotiationsCollection = (NegotiationsNegotiationsCollection) o;
    return Objects.equals(this.description, negotiationsNegotiationsCollection.description) &&
        Objects.equals(this.hidden, negotiationsNegotiationsCollection.hidden) &&
        Objects.equals(this.id, negotiationsNegotiationsCollection.id) &&
        Objects.equals(this.name, negotiationsNegotiationsCollection.name) &&
        Objects.equals(this.subCollections, negotiationsNegotiationsCollection.subCollections) &&
        Objects.equals(this.url, negotiationsNegotiationsCollection.url) &&
        Objects.equals(this.counters, negotiationsNegotiationsCollection.counters) &&
        Objects.equals(this.orderTypes, negotiationsNegotiationsCollection.orderTypes);
  }

  @Override
  public int hashCode() {
    return Objects.hash(description, hidden, id, name, subCollections, url, counters, orderTypes);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class NegotiationsNegotiationsCollection {\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    hidden: ").append(toIndentedString(hidden)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    subCollections: ").append(toIndentedString(subCollections)).append("\n");
    sb.append("    url: ").append(toIndentedString(url)).append("\n");
    sb.append("    counters: ").append(toIndentedString(counters)).append("\n");
    sb.append("    orderTypes: ").append(toIndentedString(orderTypes)).append("\n");
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

