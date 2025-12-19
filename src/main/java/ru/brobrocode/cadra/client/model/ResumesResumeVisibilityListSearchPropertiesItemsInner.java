package ru.brobrocode.cadra.client.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.annotation.Generated;
import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;

import java.util.Objects;

/**
 * ResumesResumeVisibilityListSearchPropertiesItemsInner
 */

@JsonTypeName("ResumesResumeVisibilityListSearchProperties_items_inner")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2025-08-17T15:41:09.394389505+05:00[Asia/Yekaterinburg]", comments = "Generator version: 7.6.0")
public class ResumesResumeVisibilityListSearchPropertiesItemsInner {

  private String alternateUrl;

  private String id;

  private IncludesLogoUrls90 logoUrls;

  private String name;

  private String url;

  private Boolean selected;

  public ResumesResumeVisibilityListSearchPropertiesItemsInner() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public ResumesResumeVisibilityListSearchPropertiesItemsInner(String alternateUrl, String id, IncludesLogoUrls90 logoUrls, String name, String url, Boolean selected) {
    this.alternateUrl = alternateUrl;
    this.id = id;
    this.logoUrls = logoUrls;
    this.name = name;
    this.url = url;
    this.selected = selected;
  }

  public ResumesResumeVisibilityListSearchPropertiesItemsInner alternateUrl(String alternateUrl) {
    this.alternateUrl = alternateUrl;
    return this;
  }

  /**
   * Ссылка на описание работодателя на сайте
   * @return alternateUrl
  */
  @NotNull 
  @Schema(name = "alternate_url", description = "Ссылка на описание работодателя на сайте", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("alternate_url")
  public String getAlternateUrl() {
    return alternateUrl;
  }

  public void setAlternateUrl(String alternateUrl) {
    this.alternateUrl = alternateUrl;
  }

  public ResumesResumeVisibilityListSearchPropertiesItemsInner id(String id) {
    this.id = id;
    return this;
  }

  /**
   * Идентификатор работодателя
   * @return id
  */
  @NotNull 
  @Schema(name = "id", description = "Идентификатор работодателя", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("id")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public ResumesResumeVisibilityListSearchPropertiesItemsInner logoUrls(IncludesLogoUrls90 logoUrls) {
    this.logoUrls = logoUrls;
    return this;
  }

  /**
   * Get logoUrls
   * @return logoUrls
  */
  @NotNull @Valid 
  @Schema(name = "logo_urls", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("logo_urls")
  public IncludesLogoUrls90 getLogoUrls() {
    return logoUrls;
  }

  public void setLogoUrls(IncludesLogoUrls90 logoUrls) {
    this.logoUrls = logoUrls;
  }

  public ResumesResumeVisibilityListSearchPropertiesItemsInner name(String name) {
    this.name = name;
    return this;
  }

  /**
   * Название работодателя
   * @return name
  */
  @NotNull 
  @Schema(name = "name", description = "Название работодателя", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("name")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public ResumesResumeVisibilityListSearchPropertiesItemsInner url(String url) {
    this.url = url;
    return this;
  }

  /**
   * Ссылка на детальное описание работодателя
   * @return url
  */
  @NotNull 
  @Schema(name = "url", description = "Ссылка на детальное описание работодателя", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("url")
  public String getUrl() {
    return url;
  }

  public void setUrl(String url) {
    this.url = url;
  }

  public ResumesResumeVisibilityListSearchPropertiesItemsInner selected(Boolean selected) {
    this.selected = selected;
    return this;
  }

  /**
   * Присутствует ли работодатель в списке видимости резюме
   * @return selected
  */
  @NotNull 
  @Schema(name = "selected", description = "Присутствует ли работодатель в списке видимости резюме", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("selected")
  public Boolean getSelected() {
    return selected;
  }

  public void setSelected(Boolean selected) {
    this.selected = selected;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ResumesResumeVisibilityListSearchPropertiesItemsInner resumesResumeVisibilityListSearchPropertiesItemsInner = (ResumesResumeVisibilityListSearchPropertiesItemsInner) o;
    return Objects.equals(this.alternateUrl, resumesResumeVisibilityListSearchPropertiesItemsInner.alternateUrl) &&
        Objects.equals(this.id, resumesResumeVisibilityListSearchPropertiesItemsInner.id) &&
        Objects.equals(this.logoUrls, resumesResumeVisibilityListSearchPropertiesItemsInner.logoUrls) &&
        Objects.equals(this.name, resumesResumeVisibilityListSearchPropertiesItemsInner.name) &&
        Objects.equals(this.url, resumesResumeVisibilityListSearchPropertiesItemsInner.url) &&
        Objects.equals(this.selected, resumesResumeVisibilityListSearchPropertiesItemsInner.selected);
  }

  @Override
  public int hashCode() {
    return Objects.hash(alternateUrl, id, logoUrls, name, url, selected);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ResumesResumeVisibilityListSearchPropertiesItemsInner {\n");
    sb.append("    alternateUrl: ").append(toIndentedString(alternateUrl)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    logoUrls: ").append(toIndentedString(logoUrls)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    url: ").append(toIndentedString(url)).append("\n");
    sb.append("    selected: ").append(toIndentedString(selected)).append("\n");
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

