package ru.brobrocode.cadra.client.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.annotation.Generated;
import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;

import java.util.Objects;

/**
 * Информация о компании.  Если резюме просмотрено анонимным работодателем, либо из откликов к анонимной вакансии, объект будет содержать только поле &#x60;name&#x60; 
 */

@Schema(name = "ResumesResumeViewHistoryItem_employer", description = "Информация о компании.  Если резюме просмотрено анонимным работодателем, либо из откликов к анонимной вакансии, объект будет содержать только поле `name` ")
@JsonTypeName("ResumesResumeViewHistoryItem_employer")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2025-08-17T15:41:09.394389505+05:00[Asia/Yekaterinburg]", comments = "Generator version: 7.6.0")
public class ResumesResumeViewHistoryItemEmployer {

  private String alternateUrl;

  private String id;

  private IncludesLogoUrls logoUrls = null;

  private String name;

  private String url;

  private String vacanciesUrl;

  public ResumesResumeViewHistoryItemEmployer() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public ResumesResumeViewHistoryItemEmployer(String alternateUrl, String id, String name, String url, String vacanciesUrl) {
    this.alternateUrl = alternateUrl;
    this.id = id;
    this.name = name;
    this.url = url;
    this.vacanciesUrl = vacanciesUrl;
  }

  public ResumesResumeViewHistoryItemEmployer alternateUrl(String alternateUrl) {
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

  public ResumesResumeViewHistoryItemEmployer id(String id) {
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

  public ResumesResumeViewHistoryItemEmployer logoUrls(IncludesLogoUrls logoUrls) {
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

  public ResumesResumeViewHistoryItemEmployer name(String name) {
    this.name = name;
    return this;
  }

  /**
   * Название
   * @return name
  */
  @NotNull 
  @Schema(name = "name", description = "Название", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("name")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public ResumesResumeViewHistoryItemEmployer url(String url) {
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

  public ResumesResumeViewHistoryItemEmployer vacanciesUrl(String vacanciesUrl) {
    this.vacanciesUrl = vacanciesUrl;
    return this;
  }

  /**
   * URL для получения поисковой выдачи с вакансиями данного работодателя
   * @return vacanciesUrl
  */
  @NotNull 
  @Schema(name = "vacancies_url", description = "URL для получения поисковой выдачи с вакансиями данного работодателя", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("vacancies_url")
  public String getVacanciesUrl() {
    return vacanciesUrl;
  }

  public void setVacanciesUrl(String vacanciesUrl) {
    this.vacanciesUrl = vacanciesUrl;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ResumesResumeViewHistoryItemEmployer resumesResumeViewHistoryItemEmployer = (ResumesResumeViewHistoryItemEmployer) o;
    return Objects.equals(this.alternateUrl, resumesResumeViewHistoryItemEmployer.alternateUrl) &&
        Objects.equals(this.id, resumesResumeViewHistoryItemEmployer.id) &&
        Objects.equals(this.logoUrls, resumesResumeViewHistoryItemEmployer.logoUrls) &&
        Objects.equals(this.name, resumesResumeViewHistoryItemEmployer.name) &&
        Objects.equals(this.url, resumesResumeViewHistoryItemEmployer.url) &&
        Objects.equals(this.vacanciesUrl, resumesResumeViewHistoryItemEmployer.vacanciesUrl);
  }

  @Override
  public int hashCode() {
    return Objects.hash(alternateUrl, id, logoUrls, name, url, vacanciesUrl);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ResumesResumeViewHistoryItemEmployer {\n");
    sb.append("    alternateUrl: ").append(toIndentedString(alternateUrl)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    logoUrls: ").append(toIndentedString(logoUrls)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    url: ").append(toIndentedString(url)).append("\n");
    sb.append("    vacanciesUrl: ").append(toIndentedString(vacanciesUrl)).append("\n");
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

