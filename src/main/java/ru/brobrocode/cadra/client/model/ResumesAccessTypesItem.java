package ru.brobrocode.cadra.client.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.annotation.Generated;
import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;

import java.math.BigDecimal;
import java.util.Objects;

/**
 * ResumesAccessTypesItem
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2025-08-17T15:41:09.394389505+05:00[Asia/Yekaterinburg]", comments = "Generator version: 7.6.0")
public class ResumesAccessTypesItem {

  private Boolean active = null;

  private String id;

  private BigDecimal limit = null;

  private String listUrl = null;

  private String name;

  private BigDecimal total = null;

  public ResumesAccessTypesItem() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public ResumesAccessTypesItem(String id, String name) {
    this.id = id;
    this.name = name;
  }

  public ResumesAccessTypesItem active(Boolean active) {
    this.active = active;
    return this;
  }

  /**
   * Выбран ли тип видимости
   * @return active
  */
  
  @Schema(name = "active", description = "Выбран ли тип видимости", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("active")
  public Boolean getActive() {
    return active;
  }

  public void setActive(Boolean active) {
    this.active = active;
  }

  public ResumesAccessTypesItem id(String id) {
    this.id = id;
    return this;
  }

  /**
   * Идентификатор типа видимости
   * @return id
  */
  @NotNull 
  @Schema(name = "id", description = "Идентификатор типа видимости", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("id")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public ResumesAccessTypesItem limit(BigDecimal limit) {
    this.limit = limit;
    return this;
  }

  /**
   * Максимальное количество компаний в списке видимости. Возвращается только для типов `blacklist` и `whitelist`
   * @return limit
  */
  @Valid 
  @Schema(name = "limit", description = "Максимальное количество компаний в списке видимости. Возвращается только для типов `blacklist` и `whitelist`", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("limit")
  public BigDecimal getLimit() {
    return limit;
  }

  public void setLimit(BigDecimal limit) {
    this.limit = limit;
  }

  public ResumesAccessTypesItem listUrl(String listUrl) {
    this.listUrl = listUrl;
    return this;
  }

  /**
   * Ссылка на список видимости. Возвращается только для типов `blacklist` и `whitelist`
   * @return listUrl
  */
  
  @Schema(name = "list_url", description = "Ссылка на список видимости. Возвращается только для типов `blacklist` и `whitelist`", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("list_url")
  public String getListUrl() {
    return listUrl;
  }

  public void setListUrl(String listUrl) {
    this.listUrl = listUrl;
  }

  public ResumesAccessTypesItem name(String name) {
    this.name = name;
    return this;
  }

  /**
   * Имя типа видимости
   * @return name
  */
  @NotNull 
  @Schema(name = "name", description = "Имя типа видимости", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("name")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public ResumesAccessTypesItem total(BigDecimal total) {
    this.total = total;
    return this;
  }

  /**
   * Количество компаний, добавленных в соответствующий список видимости. Возвращается только для типов `blacklist` и `whitelist`
   * @return total
  */
  @Valid 
  @Schema(name = "total", description = "Количество компаний, добавленных в соответствующий список видимости. Возвращается только для типов `blacklist` и `whitelist`", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("total")
  public BigDecimal getTotal() {
    return total;
  }

  public void setTotal(BigDecimal total) {
    this.total = total;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ResumesAccessTypesItem resumesAccessTypesItem = (ResumesAccessTypesItem) o;
    return Objects.equals(this.active, resumesAccessTypesItem.active) &&
        Objects.equals(this.id, resumesAccessTypesItem.id) &&
        Objects.equals(this.limit, resumesAccessTypesItem.limit) &&
        Objects.equals(this.listUrl, resumesAccessTypesItem.listUrl) &&
        Objects.equals(this.name, resumesAccessTypesItem.name) &&
        Objects.equals(this.total, resumesAccessTypesItem.total);
  }

  @Override
  public int hashCode() {
    return Objects.hash(active, id, limit, listUrl, name, total);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ResumesAccessTypesItem {\n");
    sb.append("    active: ").append(toIndentedString(active)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    limit: ").append(toIndentedString(limit)).append("\n");
    sb.append("    listUrl: ").append(toIndentedString(listUrl)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    total: ").append(toIndentedString(total)).append("\n");
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

