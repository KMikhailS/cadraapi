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
 * SuggestsCompanyItem
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2025-08-17T15:41:09.394389505+05:00[Asia/Yekaterinburg]", comments = "Generator version: 7.6.0")
public class SuggestsCompanyItem {

  private String id;

  private SuggestsLogoUrl logoUrls = null;

  private String text;

  private String url;

  private SuggestsArea area;

  @Valid
  private List<@Valid IncludesIdName> industries = new ArrayList<>();

  public SuggestsCompanyItem() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public SuggestsCompanyItem(String id, String text, SuggestsArea area) {
    this.id = id;
    this.text = text;
    this.area = area;
  }

  public SuggestsCompanyItem id(String id) {
    this.id = id;
    return this;
  }

  /**
   * Идентификатор организации
   * @return id
  */
  @NotNull 
  @Schema(name = "id", description = "Идентификатор организации", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("id")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public SuggestsCompanyItem logoUrls(SuggestsLogoUrl logoUrls) {
    this.logoUrls = logoUrls;
    return this;
  }

  /**
   * Get logoUrls
   * @return logoUrls
  */
  @Valid 
  @Schema(name = "logo_urls", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("logo_urls")
  public SuggestsLogoUrl getLogoUrls() {
    return logoUrls;
  }

  public void setLogoUrls(SuggestsLogoUrl logoUrls) {
    this.logoUrls = logoUrls;
  }

  public SuggestsCompanyItem text(String text) {
    this.text = text;
    return this;
  }

  /**
   * Название организации
   * @return text
  */
  @NotNull 
  @Schema(name = "text", description = "Название организации", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("text")
  public String getText() {
    return text;
  }

  public void setText(String text) {
    this.text = text;
  }

  public SuggestsCompanyItem url(String url) {
    this.url = url;
    return this;
  }

  /**
   * Сайт организации
   * @return url
  */
  
  @Schema(name = "url", description = "Сайт организации", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("url")
  public String getUrl() {
    return url;
  }

  public void setUrl(String url) {
    this.url = url;
  }

  public SuggestsCompanyItem area(SuggestsArea area) {
    this.area = area;
    return this;
  }

  /**
   * Get area
   * @return area
  */
  @NotNull @Valid 
  @Schema(name = "area", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("area")
  public SuggestsArea getArea() {
    return area;
  }

  public void setArea(SuggestsArea area) {
    this.area = area;
  }

  public SuggestsCompanyItem industries(List<@Valid IncludesIdName> industries) {
    this.industries = industries;
    return this;
  }

  public SuggestsCompanyItem addIndustriesItem(IncludesIdName industriesItem) {
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
  @Valid 
  @Schema(name = "industries", description = "Сферы деятельности", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("industries")
  public List<@Valid IncludesIdName> getIndustries() {
    return industries;
  }

  public void setIndustries(List<@Valid IncludesIdName> industries) {
    this.industries = industries;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SuggestsCompanyItem suggestsCompanyItem = (SuggestsCompanyItem) o;
    return Objects.equals(this.id, suggestsCompanyItem.id) &&
        Objects.equals(this.logoUrls, suggestsCompanyItem.logoUrls) &&
        Objects.equals(this.text, suggestsCompanyItem.text) &&
        Objects.equals(this.url, suggestsCompanyItem.url) &&
        Objects.equals(this.area, suggestsCompanyItem.area) &&
        Objects.equals(this.industries, suggestsCompanyItem.industries);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, logoUrls, text, url, area, industries);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SuggestsCompanyItem {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    logoUrls: ").append(toIndentedString(logoUrls)).append("\n");
    sb.append("    text: ").append(toIndentedString(text)).append("\n");
    sb.append("    url: ").append(toIndentedString(url)).append("\n");
    sb.append("    area: ").append(toIndentedString(area)).append("\n");
    sb.append("    industries: ").append(toIndentedString(industries)).append("\n");
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

