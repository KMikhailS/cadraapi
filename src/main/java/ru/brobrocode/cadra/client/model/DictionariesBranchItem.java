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
 * DictionariesBranchItem
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2025-08-17T15:41:09.394389505+05:00[Asia/Yekaterinburg]", comments = "Generator version: 7.6.0")
public class DictionariesBranchItem {

  private String id;

  @Valid
  private List<@Valid IncludesIdName> industries = new ArrayList<>();

  private String name;

  public DictionariesBranchItem() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public DictionariesBranchItem(String id, List<@Valid IncludesIdName> industries, String name) {
    this.id = id;
    this.industries = industries;
    this.name = name;
  }

  public DictionariesBranchItem id(String id) {
    this.id = id;
    return this;
  }

  /**
   * Идентификатор отрасли
   * @return id
  */
  @NotNull 
  @Schema(name = "id", description = "Идентификатор отрасли", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("id")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public DictionariesBranchItem industries(List<@Valid IncludesIdName> industries) {
    this.industries = industries;
    return this;
  }

  public DictionariesBranchItem addIndustriesItem(IncludesIdName industriesItem) {
    if (this.industries == null) {
      this.industries = new ArrayList<>();
    }
    this.industries.add(industriesItem);
    return this;
  }

  /**
   * Сферы деятельности
   * @return industries
  */
  @NotNull @Valid 
  @Schema(name = "industries", description = "Сферы деятельности", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("industries")
  public List<@Valid IncludesIdName> getIndustries() {
    return industries;
  }

  public void setIndustries(List<@Valid IncludesIdName> industries) {
    this.industries = industries;
  }

  public DictionariesBranchItem name(String name) {
    this.name = name;
    return this;
  }

  /**
   * Название отрасли
   * @return name
  */
  @NotNull 
  @Schema(name = "name", description = "Название отрасли", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("name")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DictionariesBranchItem dictionariesBranchItem = (DictionariesBranchItem) o;
    return Objects.equals(this.id, dictionariesBranchItem.id) &&
        Objects.equals(this.industries, dictionariesBranchItem.industries) &&
        Objects.equals(this.name, dictionariesBranchItem.name);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, industries, name);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DictionariesBranchItem {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    industries: ").append(toIndentedString(industries)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
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

