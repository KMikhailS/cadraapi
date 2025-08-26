package ru.brobrocode.cadra.client.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.annotation.Generated;
import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;

import java.util.Objects;

/**
 * VacancyDraftEmployer
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2025-08-17T15:41:09.394389505+05:00[Asia/Yekaterinburg]", comments = "Generator version: 7.6.0")
public class VacancyDraftEmployer {

  private String alternateUrl;

  private String id;

  private VacancyDraftEmployerLogoUrls logoUrls;

  private String name;

  private String url;

  public VacancyDraftEmployer() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public VacancyDraftEmployer(String alternateUrl, String id, VacancyDraftEmployerLogoUrls logoUrls, String name, String url) {
    this.alternateUrl = alternateUrl;
    this.id = id;
    this.logoUrls = logoUrls;
    this.name = name;
    this.url = url;
  }

  public VacancyDraftEmployer alternateUrl(String alternateUrl) {
    this.alternateUrl = alternateUrl;
    return this;
  }

  /**
   * Url для просмотра работодателя на сайте
   * @return alternateUrl
  */
  @NotNull 
  @Schema(name = "alternate_url", description = "Url для просмотра работодателя на сайте", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("alternate_url")
  public String getAlternateUrl() {
    return alternateUrl;
  }

  public void setAlternateUrl(String alternateUrl) {
    this.alternateUrl = alternateUrl;
  }

  public VacancyDraftEmployer id(String id) {
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

  public VacancyDraftEmployer logoUrls(VacancyDraftEmployerLogoUrls logoUrls) {
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
  public VacancyDraftEmployerLogoUrls getLogoUrls() {
    return logoUrls;
  }

  public void setLogoUrls(VacancyDraftEmployerLogoUrls logoUrls) {
    this.logoUrls = logoUrls;
  }

  public VacancyDraftEmployer name(String name) {
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

  public VacancyDraftEmployer url(String url) {
    this.url = url;
    return this;
  }

  /**
   * Url для просмотра работодателя
   * @return url
  */
  @NotNull 
  @Schema(name = "url", description = "Url для просмотра работодателя", requiredMode = Schema.RequiredMode.REQUIRED)
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
    VacancyDraftEmployer vacancyDraftEmployer = (VacancyDraftEmployer) o;
    return Objects.equals(this.alternateUrl, vacancyDraftEmployer.alternateUrl) &&
        Objects.equals(this.id, vacancyDraftEmployer.id) &&
        Objects.equals(this.logoUrls, vacancyDraftEmployer.logoUrls) &&
        Objects.equals(this.name, vacancyDraftEmployer.name) &&
        Objects.equals(this.url, vacancyDraftEmployer.url);
  }

  @Override
  public int hashCode() {
    return Objects.hash(alternateUrl, id, logoUrls, name, url);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class VacancyDraftEmployer {\n");
    sb.append("    alternateUrl: ").append(toIndentedString(alternateUrl)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    logoUrls: ").append(toIndentedString(logoUrls)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
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

