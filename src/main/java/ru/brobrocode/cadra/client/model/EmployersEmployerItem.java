package ru.brobrocode.cadra.client.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.annotation.Generated;
import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;

import java.math.BigDecimal;
import java.util.Objects;

/**
 * EmployersEmployerItem
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2025-08-17T15:41:09.394389505+05:00[Asia/Yekaterinburg]", comments = "Generator version: 7.6.0")
public class EmployersEmployerItem {

  private String alternateUrl;

  private String id;

  private IncludesLogoUrls logoUrls = null;

  private String name;

  private String url;

  private String vacanciesUrl;

  private BigDecimal openVacancies;

  public EmployersEmployerItem() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public EmployersEmployerItem(String alternateUrl, String id, String name, String url, String vacanciesUrl, BigDecimal openVacancies) {
    this.alternateUrl = alternateUrl;
    this.id = id;
    this.name = name;
    this.url = url;
    this.vacanciesUrl = vacanciesUrl;
    this.openVacancies = openVacancies;
  }

  public EmployersEmployerItem alternateUrl(String alternateUrl) {
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

  public EmployersEmployerItem id(String id) {
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

  public EmployersEmployerItem logoUrls(IncludesLogoUrls logoUrls) {
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

  public EmployersEmployerItem name(String name) {
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

  public EmployersEmployerItem url(String url) {
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

  public EmployersEmployerItem vacanciesUrl(String vacanciesUrl) {
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

  public EmployersEmployerItem openVacancies(BigDecimal openVacancies) {
    this.openVacancies = openVacancies;
    return this;
  }

  /**
   * Количество открытых вакансий у работодателя
   * @return openVacancies
  */
  @NotNull @Valid 
  @Schema(name = "open_vacancies", description = "Количество открытых вакансий у работодателя", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("open_vacancies")
  public BigDecimal getOpenVacancies() {
    return openVacancies;
  }

  public void setOpenVacancies(BigDecimal openVacancies) {
    this.openVacancies = openVacancies;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EmployersEmployerItem employersEmployerItem = (EmployersEmployerItem) o;
    return Objects.equals(this.alternateUrl, employersEmployerItem.alternateUrl) &&
        Objects.equals(this.id, employersEmployerItem.id) &&
        Objects.equals(this.logoUrls, employersEmployerItem.logoUrls) &&
        Objects.equals(this.name, employersEmployerItem.name) &&
        Objects.equals(this.url, employersEmployerItem.url) &&
        Objects.equals(this.vacanciesUrl, employersEmployerItem.vacanciesUrl) &&
        Objects.equals(this.openVacancies, employersEmployerItem.openVacancies);
  }

  @Override
  public int hashCode() {
    return Objects.hash(alternateUrl, id, logoUrls, name, url, vacanciesUrl, openVacancies);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EmployersEmployerItem {\n");
    sb.append("    alternateUrl: ").append(toIndentedString(alternateUrl)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    logoUrls: ").append(toIndentedString(logoUrls)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    url: ").append(toIndentedString(url)).append("\n");
    sb.append("    vacanciesUrl: ").append(toIndentedString(vacanciesUrl)).append("\n");
    sb.append("    openVacancies: ").append(toIndentedString(openVacancies)).append("\n");
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

