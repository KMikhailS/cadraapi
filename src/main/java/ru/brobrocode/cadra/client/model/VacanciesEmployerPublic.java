package ru.brobrocode.cadra.client.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.annotation.Generated;
import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;

import java.util.Objects;

/**
 * VacanciesEmployerPublic
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2025-08-17T15:41:09.394389505+05:00[Asia/Yekaterinburg]", comments = "Generator version: 7.6.0")
public class VacanciesEmployerPublic {

  private Boolean accreditedItEmployer;

  private String alternateUrl = null;

  private VacanciesEmployerRating employerRating;

  private String id = null;

  private IncludesLogoUrls logoUrls = null;

  private String name;

  private Boolean trusted;

  private String url = null;

  private String vacanciesUrl = null;

  public VacanciesEmployerPublic() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public VacanciesEmployerPublic(String name, Boolean trusted) {
    this.name = name;
    this.trusted = trusted;
  }

  public VacanciesEmployerPublic accreditedItEmployer(Boolean accreditedItEmployer) {
    this.accreditedItEmployer = accreditedItEmployer;
    return this;
  }

  /**
   * Флаг, показывающий, прошла ли компания IT аккредитацию
   * @return accreditedItEmployer
  */
  
  @Schema(name = "accredited_it_employer", description = "Флаг, показывающий, прошла ли компания IT аккредитацию", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("accredited_it_employer")
  public Boolean getAccreditedItEmployer() {
    return accreditedItEmployer;
  }

  public void setAccreditedItEmployer(Boolean accreditedItEmployer) {
    this.accreditedItEmployer = accreditedItEmployer;
  }

  public VacanciesEmployerPublic alternateUrl(String alternateUrl) {
    this.alternateUrl = alternateUrl;
    return this;
  }

  /**
   * Ссылка на представление компании на сайте
   * @return alternateUrl
  */
  
  @Schema(name = "alternate_url", example = "https://hh.ru/employer/1455", description = "Ссылка на представление компании на сайте", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("alternate_url")
  public String getAlternateUrl() {
    return alternateUrl;
  }

  public void setAlternateUrl(String alternateUrl) {
    this.alternateUrl = alternateUrl;
  }

  public VacanciesEmployerPublic employerRating(VacanciesEmployerRating employerRating) {
    this.employerRating = employerRating;
    return this;
  }

  /**
   * Get employerRating
   * @return employerRating
  */
  @Valid 
  @Schema(name = "employer_rating", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("employer_rating")
  public VacanciesEmployerRating getEmployerRating() {
    return employerRating;
  }

  public void setEmployerRating(VacanciesEmployerRating employerRating) {
    this.employerRating = employerRating;
  }

  public VacanciesEmployerPublic id(String id) {
    this.id = id;
    return this;
  }

  /**
   * Идентификатор компании
   * @return id
  */
  
  @Schema(name = "id", example = "1455", description = "Идентификатор компании", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("id")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public VacanciesEmployerPublic logoUrls(IncludesLogoUrls logoUrls) {
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

  public VacanciesEmployerPublic name(String name) {
    this.name = name;
    return this;
  }

  /**
   * Название компании
   * @return name
  */
  @NotNull 
  @Schema(name = "name", example = "HeadHunter", description = "Название компании", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("name")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public VacanciesEmployerPublic trusted(Boolean trusted) {
    this.trusted = trusted;
    return this;
  }

  /**
   * Флаг, показывающий, прошла ли компания проверку на сайте
   * @return trusted
  */
  @NotNull 
  @Schema(name = "trusted", description = "Флаг, показывающий, прошла ли компания проверку на сайте", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("trusted")
  public Boolean getTrusted() {
    return trusted;
  }

  public void setTrusted(Boolean trusted) {
    this.trusted = trusted;
  }

  public VacanciesEmployerPublic url(String url) {
    this.url = url;
    return this;
  }

  /**
   * URL, на который нужно сделать GET-запрос, чтобы получить информацию о компании
   * @return url
  */
  
  @Schema(name = "url", example = "https://api.hh.ru/employers/1455", description = "URL, на который нужно сделать GET-запрос, чтобы получить информацию о компании", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("url")
  public String getUrl() {
    return url;
  }

  public void setUrl(String url) {
    this.url = url;
  }

  public VacanciesEmployerPublic vacanciesUrl(String vacanciesUrl) {
    this.vacanciesUrl = vacanciesUrl;
    return this;
  }

  /**
   * Ссылка на поисковую выдачу вакансий данной компании
   * @return vacanciesUrl
  */
  
  @Schema(name = "vacancies_url", example = "https://api.hh.ru/vacancies?employer_id=1455", description = "Ссылка на поисковую выдачу вакансий данной компании", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
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
    VacanciesEmployerPublic vacanciesEmployerPublic = (VacanciesEmployerPublic) o;
    return Objects.equals(this.accreditedItEmployer, vacanciesEmployerPublic.accreditedItEmployer) &&
        Objects.equals(this.alternateUrl, vacanciesEmployerPublic.alternateUrl) &&
        Objects.equals(this.employerRating, vacanciesEmployerPublic.employerRating) &&
        Objects.equals(this.id, vacanciesEmployerPublic.id) &&
        Objects.equals(this.logoUrls, vacanciesEmployerPublic.logoUrls) &&
        Objects.equals(this.name, vacanciesEmployerPublic.name) &&
        Objects.equals(this.trusted, vacanciesEmployerPublic.trusted) &&
        Objects.equals(this.url, vacanciesEmployerPublic.url) &&
        Objects.equals(this.vacanciesUrl, vacanciesEmployerPublic.vacanciesUrl);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accreditedItEmployer, alternateUrl, employerRating, id, logoUrls, name, trusted, url, vacanciesUrl);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class VacanciesEmployerPublic {\n");
    sb.append("    accreditedItEmployer: ").append(toIndentedString(accreditedItEmployer)).append("\n");
    sb.append("    alternateUrl: ").append(toIndentedString(alternateUrl)).append("\n");
    sb.append("    employerRating: ").append(toIndentedString(employerRating)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    logoUrls: ").append(toIndentedString(logoUrls)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    trusted: ").append(toIndentedString(trusted)).append("\n");
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

