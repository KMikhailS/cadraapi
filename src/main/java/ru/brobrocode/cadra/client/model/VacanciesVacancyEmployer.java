package ru.brobrocode.cadra.client.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.annotation.Generated;
import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;

import java.util.Objects;

/**
 * VacanciesVacancyEmployer
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2025-08-17T15:41:09.394389505+05:00[Asia/Yekaterinburg]", comments = "Generator version: 7.6.0")
public class VacanciesVacancyEmployer {

  private Boolean accreditedItEmployer;

  private String alternateUrl = null;

  private VacanciesEmployerRating employerRating;

  private String id = null;

  private IncludesLogoUrls logoUrls = null;

  private String name;

  private Boolean trusted;

  private String url = null;

  private String vacanciesUrl = null;

  private Boolean blacklisted;

  private IncludesEmployerApplicantServices applicantServices;

  public VacanciesVacancyEmployer() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public VacanciesVacancyEmployer(String name, Boolean trusted) {
    this.name = name;
    this.trusted = trusted;
  }

  public VacanciesVacancyEmployer accreditedItEmployer(Boolean accreditedItEmployer) {
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

  public VacanciesVacancyEmployer alternateUrl(String alternateUrl) {
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

  public VacanciesVacancyEmployer employerRating(VacanciesEmployerRating employerRating) {
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

  public VacanciesVacancyEmployer id(String id) {
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

  public VacanciesVacancyEmployer logoUrls(IncludesLogoUrls logoUrls) {
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

  public VacanciesVacancyEmployer name(String name) {
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

  public VacanciesVacancyEmployer trusted(Boolean trusted) {
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

  public VacanciesVacancyEmployer url(String url) {
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

  public VacanciesVacancyEmployer vacanciesUrl(String vacanciesUrl) {
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

  public VacanciesVacancyEmployer blacklisted(Boolean blacklisted) {
    this.blacklisted = blacklisted;
    return this;
  }

  /**
   * Добавлены ли все вакансии работодателя в [список скрытых](#tag/Skrytye-rabotodateli)
   * @return blacklisted
  */
  
  @Schema(name = "blacklisted", description = "Добавлены ли все вакансии работодателя в [список скрытых](#tag/Skrytye-rabotodateli)", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("blacklisted")
  public Boolean getBlacklisted() {
    return blacklisted;
  }

  public void setBlacklisted(Boolean blacklisted) {
    this.blacklisted = blacklisted;
  }

  public VacanciesVacancyEmployer applicantServices(IncludesEmployerApplicantServices applicantServices) {
    this.applicantServices = applicantServices;
    return this;
  }

  /**
   * Get applicantServices
   * @return applicantServices
  */
  @Valid 
  @Schema(name = "applicant_services", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("applicant_services")
  public IncludesEmployerApplicantServices getApplicantServices() {
    return applicantServices;
  }

  public void setApplicantServices(IncludesEmployerApplicantServices applicantServices) {
    this.applicantServices = applicantServices;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    VacanciesVacancyEmployer vacanciesVacancyEmployer = (VacanciesVacancyEmployer) o;
    return Objects.equals(this.accreditedItEmployer, vacanciesVacancyEmployer.accreditedItEmployer) &&
        Objects.equals(this.alternateUrl, vacanciesVacancyEmployer.alternateUrl) &&
        Objects.equals(this.employerRating, vacanciesVacancyEmployer.employerRating) &&
        Objects.equals(this.id, vacanciesVacancyEmployer.id) &&
        Objects.equals(this.logoUrls, vacanciesVacancyEmployer.logoUrls) &&
        Objects.equals(this.name, vacanciesVacancyEmployer.name) &&
        Objects.equals(this.trusted, vacanciesVacancyEmployer.trusted) &&
        Objects.equals(this.url, vacanciesVacancyEmployer.url) &&
        Objects.equals(this.vacanciesUrl, vacanciesVacancyEmployer.vacanciesUrl) &&
        Objects.equals(this.blacklisted, vacanciesVacancyEmployer.blacklisted) &&
        Objects.equals(this.applicantServices, vacanciesVacancyEmployer.applicantServices);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accreditedItEmployer, alternateUrl, employerRating, id, logoUrls, name, trusted, url, vacanciesUrl, blacklisted, applicantServices);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class VacanciesVacancyEmployer {\n");
    sb.append("    accreditedItEmployer: ").append(toIndentedString(accreditedItEmployer)).append("\n");
    sb.append("    alternateUrl: ").append(toIndentedString(alternateUrl)).append("\n");
    sb.append("    employerRating: ").append(toIndentedString(employerRating)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    logoUrls: ").append(toIndentedString(logoUrls)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    trusted: ").append(toIndentedString(trusted)).append("\n");
    sb.append("    url: ").append(toIndentedString(url)).append("\n");
    sb.append("    vacanciesUrl: ").append(toIndentedString(vacanciesUrl)).append("\n");
    sb.append("    blacklisted: ").append(toIndentedString(blacklisted)).append("\n");
    sb.append("    applicantServices: ").append(toIndentedString(applicantServices)).append("\n");
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

