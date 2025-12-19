package ru.brobrocode.cadra.client.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.annotation.Generated;
import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;

import java.util.Objects;

/**
 * SuggestsEmployerItem
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2025-08-17T15:41:09.394389505+05:00[Asia/Yekaterinburg]", comments = "Generator version: 7.6.0")
public class SuggestsEmployerItem {

  private String id;

  private SuggestsLogoUrl logoUrls = null;

  private String text;

  private String url;

  public SuggestsEmployerItem() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public SuggestsEmployerItem(String id, String text) {
    this.id = id;
    this.text = text;
  }

  public SuggestsEmployerItem id(String id) {
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

  public SuggestsEmployerItem logoUrls(SuggestsLogoUrl logoUrls) {
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

  public SuggestsEmployerItem text(String text) {
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

  public SuggestsEmployerItem url(String url) {
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

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SuggestsEmployerItem suggestsEmployerItem = (SuggestsEmployerItem) o;
    return Objects.equals(this.id, suggestsEmployerItem.id) &&
        Objects.equals(this.logoUrls, suggestsEmployerItem.logoUrls) &&
        Objects.equals(this.text, suggestsEmployerItem.text) &&
        Objects.equals(this.url, suggestsEmployerItem.url);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, logoUrls, text, url);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SuggestsEmployerItem {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    logoUrls: ").append(toIndentedString(logoUrls)).append("\n");
    sb.append("    text: ").append(toIndentedString(text)).append("\n");
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

