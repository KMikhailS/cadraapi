package ru.brobrocode.cadra.client.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.annotation.Generated;
import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;

import java.util.Objects;

/**
 * ResumeEditResumeSiteInner
 */

@JsonTypeName("ResumeEditResume_site_inner")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2025-08-17T15:41:09.394389505+05:00[Asia/Yekaterinburg]", comments = "Generator version: 7.6.0")
public class ResumeEditResumeSiteInner {

  private IncludesId type;

  private String url;

  public ResumeEditResumeSiteInner() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public ResumeEditResumeSiteInner(IncludesId type) {
    this.type = type;
  }

  public ResumeEditResumeSiteInner type(IncludesId type) {
    this.type = type;
    return this;
  }

  /**
   * Тип профиля. Элемент справочника [resume_contacts_site_type](#tag/Obshie-spravochniki/operation/get-dictionaries)
   * @return type
  */
  @NotNull @Valid 
  @Schema(name = "type", description = "Тип профиля. Элемент справочника [resume_contacts_site_type](#tag/Obshie-spravochniki/operation/get-dictionaries)", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("type")
  public IncludesId getType() {
    return type;
  }

  public void setType(IncludesId type) {
    this.type = type;
  }

  public ResumeEditResumeSiteInner url(String url) {
    this.url = url;
    return this;
  }

  /**
   * Ссылка на профиль или идентификатор
   * @return url
  */
  
  @Schema(name = "url", description = "Ссылка на профиль или идентификатор", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
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
    ResumeEditResumeSiteInner resumeEditResumeSiteInner = (ResumeEditResumeSiteInner) o;
    return Objects.equals(this.type, resumeEditResumeSiteInner.type) &&
        Objects.equals(this.url, resumeEditResumeSiteInner.url);
  }

  @Override
  public int hashCode() {
    return Objects.hash(type, url);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ResumeEditResumeSiteInner {\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
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

