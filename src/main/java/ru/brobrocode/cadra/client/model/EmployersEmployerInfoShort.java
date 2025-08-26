package ru.brobrocode.cadra.client.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.annotation.Generated;
import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;

import java.util.Objects;

/**
 * EmployersEmployerInfoShort
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2025-08-17T15:41:09.394389505+05:00[Asia/Yekaterinburg]", comments = "Generator version: 7.6.0")
public class EmployersEmployerInfoShort {

  private String alternateUrl;

  private String id;

  private IncludesLogoUrls logoUrls = null;

  private String name;

  private String url;

  public EmployersEmployerInfoShort() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public EmployersEmployerInfoShort(String alternateUrl, String id, String name, String url) {
    this.alternateUrl = alternateUrl;
    this.id = id;
    this.name = name;
    this.url = url;
  }

  public EmployersEmployerInfoShort alternateUrl(String alternateUrl) {
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

  public EmployersEmployerInfoShort id(String id) {
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

  public EmployersEmployerInfoShort logoUrls(IncludesLogoUrls logoUrls) {
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
  public IncludesLogoUrls getLogoUrls() {
    return logoUrls;
  }

  public void setLogoUrls(IncludesLogoUrls logoUrls) {
    this.logoUrls = logoUrls;
  }

  public EmployersEmployerInfoShort name(String name) {
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

  public EmployersEmployerInfoShort url(String url) {
    this.url = url;
    return this;
  }

  /**
   * URL для получения полного описания работодателя
   * @return url
  */
  @NotNull 
  @Schema(name = "url", description = "URL для получения полного описания работодателя", requiredMode = Schema.RequiredMode.REQUIRED)
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
    EmployersEmployerInfoShort employersEmployerInfoShort = (EmployersEmployerInfoShort) o;
    return Objects.equals(this.alternateUrl, employersEmployerInfoShort.alternateUrl) &&
        Objects.equals(this.id, employersEmployerInfoShort.id) &&
        Objects.equals(this.logoUrls, employersEmployerInfoShort.logoUrls) &&
        Objects.equals(this.name, employersEmployerInfoShort.name) &&
        Objects.equals(this.url, employersEmployerInfoShort.url);
  }

  @Override
  public int hashCode() {
    return Objects.hash(alternateUrl, id, logoUrls, name, url);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EmployersEmployerInfoShort {\n");
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

