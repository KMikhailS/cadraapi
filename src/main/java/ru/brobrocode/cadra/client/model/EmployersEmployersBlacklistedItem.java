package ru.brobrocode.cadra.client.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.annotation.Generated;
import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;

import java.math.BigDecimal;
import java.util.Objects;

/**
 * EmployersEmployersBlacklistedItem
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2025-08-17T15:41:09.394389505+05:00[Asia/Yekaterinburg]", comments = "Generator version: 7.6.0")
public class EmployersEmployersBlacklistedItem {

  private String alternateUrl = null;

  private String id = null;

  private IncludesLogoUrls logoUrls = null;

  private String name;

  private BigDecimal openVacancies;

  private String url = null;

  private String vacanciesUrl = null;

  public EmployersEmployersBlacklistedItem() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public EmployersEmployersBlacklistedItem(String name, BigDecimal openVacancies) {
    this.name = name;
    this.openVacancies = openVacancies;
  }

  public EmployersEmployersBlacklistedItem alternateUrl(String alternateUrl) {
    this.alternateUrl = alternateUrl;
    return this;
  }

  /**
   * Ссылка на представление компании на сайте
   * @return alternateUrl
  */
  
  @Schema(name = "alternate_url", description = "Ссылка на представление компании на сайте", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("alternate_url")
  public String getAlternateUrl() {
    return alternateUrl;
  }

  public void setAlternateUrl(String alternateUrl) {
    this.alternateUrl = alternateUrl;
  }

  public EmployersEmployersBlacklistedItem id(String id) {
    this.id = id;
    return this;
  }

  /**
   * Идентификатор компании
   * @return id
  */
  
  @Schema(name = "id", description = "Идентификатор компании", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("id")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public EmployersEmployersBlacklistedItem logoUrls(IncludesLogoUrls logoUrls) {
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

  public EmployersEmployersBlacklistedItem name(String name) {
    this.name = name;
    return this;
  }

  /**
   * Название компании
   * @return name
  */
  @NotNull 
  @Schema(name = "name", description = "Название компании", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("name")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public EmployersEmployersBlacklistedItem openVacancies(BigDecimal openVacancies) {
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

  public EmployersEmployersBlacklistedItem url(String url) {
    this.url = url;
    return this;
  }

  /**
   * URL, на который нужно сделать GET-запрос, чтобы получить информацию о компании
   * @return url
  */
  
  @Schema(name = "url", description = "URL, на который нужно сделать GET-запрос, чтобы получить информацию о компании", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("url")
  public String getUrl() {
    return url;
  }

  public void setUrl(String url) {
    this.url = url;
  }

  public EmployersEmployersBlacklistedItem vacanciesUrl(String vacanciesUrl) {
    this.vacanciesUrl = vacanciesUrl;
    return this;
  }

  /**
   * Ссылка на поисковую выдачу вакансий данной компании
   * @return vacanciesUrl
  */
  
  @Schema(name = "vacancies_url", description = "Ссылка на поисковую выдачу вакансий данной компании", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
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
    EmployersEmployersBlacklistedItem employersEmployersBlacklistedItem = (EmployersEmployersBlacklistedItem) o;
    return Objects.equals(this.alternateUrl, employersEmployersBlacklistedItem.alternateUrl) &&
        Objects.equals(this.id, employersEmployersBlacklistedItem.id) &&
        Objects.equals(this.logoUrls, employersEmployersBlacklistedItem.logoUrls) &&
        Objects.equals(this.name, employersEmployersBlacklistedItem.name) &&
        Objects.equals(this.openVacancies, employersEmployersBlacklistedItem.openVacancies) &&
        Objects.equals(this.url, employersEmployersBlacklistedItem.url) &&
        Objects.equals(this.vacanciesUrl, employersEmployersBlacklistedItem.vacanciesUrl);
  }

  @Override
  public int hashCode() {
    return Objects.hash(alternateUrl, id, logoUrls, name, openVacancies, url, vacanciesUrl);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EmployersEmployersBlacklistedItem {\n");
    sb.append("    alternateUrl: ").append(toIndentedString(alternateUrl)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    logoUrls: ").append(toIndentedString(logoUrls)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    openVacancies: ").append(toIndentedString(openVacancies)).append("\n");
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

