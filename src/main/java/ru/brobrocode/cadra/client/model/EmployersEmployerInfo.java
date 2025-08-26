package ru.brobrocode.cadra.client.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.annotation.Generated;
import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * EmployersEmployerInfo
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2025-08-17T15:41:09.394389505+05:00[Asia/Yekaterinburg]", comments = "Generator version: 7.6.0")
public class EmployersEmployerInfo {

  private Boolean accreditedItEmployer;

  private String alternateUrl;

  private IncludesEmployerApplicantServices applicantServices;

  private EmployersEmployerInfoArea area;

  @Deprecated
  private String brandedDescription = null;

  private EmployersBrandingEmployerBranding branding = null;

  private String description = null;

  private String id;

  @Valid
  private List<@Valid IncludesIdName> industries = new ArrayList<>();

  @Valid
  private List<@Valid EmployersInsiderInterviews> insiderInterviews = new ArrayList<>();

  private IncludesLogoUrls logoUrls = null;

  private String name;

  private BigDecimal openVacancies = null;

  /**
   * Gets or Sets relations
   */
  public enum RelationsEnum {
    BLACKLISTED("blacklisted"),
    
    NULL("null");

    private String value;

    RelationsEnum(String value) {
      this.value = value;
    }

    @JsonValue
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static RelationsEnum fromValue(String value) {
      for (RelationsEnum b : RelationsEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      return null;
    }
  }

  @Valid
  private List<RelationsEnum> relations = new ArrayList<>();

  private String siteUrl;

  private Boolean trusted;

  private String type = null;

  private String vacanciesUrl;

  public EmployersEmployerInfo() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public EmployersEmployerInfo(String alternateUrl, EmployersEmployerInfoArea area, String id, List<@Valid IncludesIdName> industries, List<@Valid EmployersInsiderInterviews> insiderInterviews, String name, List<RelationsEnum> relations, String siteUrl, Boolean trusted, String vacanciesUrl) {
    this.alternateUrl = alternateUrl;
    this.area = area;
    this.id = id;
    this.industries = industries;
    this.insiderInterviews = insiderInterviews;
    this.name = name;
    this.relations = relations;
    this.siteUrl = siteUrl;
    this.trusted = trusted;
    this.vacanciesUrl = vacanciesUrl;
  }

  public EmployersEmployerInfo accreditedItEmployer(Boolean accreditedItEmployer) {
    this.accreditedItEmployer = accreditedItEmployer;
    return this;
  }

  /**
   * Флаг, показывающий, прошел ли работодатель [IT аккредитацию](https://feedback.hh.ru/knowledge-base/article/00038)
   * @return accreditedItEmployer
  */
  
  @Schema(name = "accredited_it_employer", description = "Флаг, показывающий, прошел ли работодатель [IT аккредитацию](https://feedback.hh.ru/knowledge-base/article/00038)", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("accredited_it_employer")
  public Boolean getAccreditedItEmployer() {
    return accreditedItEmployer;
  }

  public void setAccreditedItEmployer(Boolean accreditedItEmployer) {
    this.accreditedItEmployer = accreditedItEmployer;
  }

  public EmployersEmployerInfo alternateUrl(String alternateUrl) {
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

  public EmployersEmployerInfo applicantServices(IncludesEmployerApplicantServices applicantServices) {
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

  public EmployersEmployerInfo area(EmployersEmployerInfoArea area) {
    this.area = area;
    return this;
  }

  /**
   * Get area
   * @return area
  */
  @NotNull @Valid 
  @Schema(name = "area", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("area")
  public EmployersEmployerInfoArea getArea() {
    return area;
  }

  public void setArea(EmployersEmployerInfoArea area) {
    this.area = area;
  }

  public EmployersEmployerInfo brandedDescription(String brandedDescription) {
    this.brandedDescription = brandedDescription;
    return this;
  }

  /**
   * Строка с кодом HTML (возможно наличие `<script/>` и `<style/>`), которая является альтернативой стандартному описанию работодателя. HTML адаптирован для мобильных устройств и корректно отображается без поддержки Javascript.   При этом:  - Контент тянется по ширине на 100% ширины контейнера и умещается без прокрутки в 300px. - Контент рассчитан на то, что он будет вставлен в обвязку, в которую входит название, логотип, сайт и ссылка на вакансии работодателя. - Изображения, которые могут встретиться в таком описании, адаптированы под retina-дисплеи. - Размер шрифта не меньше 12px, размер межстрочного интервала не меньше 16px.  Значение может быть `null`, если у работодателя отсутствует индивидуальное описание 
   * @return brandedDescription
   * @deprecated
  */
  
  @Schema(name = "branded_description", description = "Строка с кодом HTML (возможно наличие `<script/>` и `<style/>`), которая является альтернативой стандартному описанию работодателя. HTML адаптирован для мобильных устройств и корректно отображается без поддержки Javascript.   При этом:  - Контент тянется по ширине на 100% ширины контейнера и умещается без прокрутки в 300px. - Контент рассчитан на то, что он будет вставлен в обвязку, в которую входит название, логотип, сайт и ссылка на вакансии работодателя. - Изображения, которые могут встретиться в таком описании, адаптированы под retina-дисплеи. - Размер шрифта не меньше 12px, размер межстрочного интервала не меньше 16px.  Значение может быть `null`, если у работодателя отсутствует индивидуальное описание ", deprecated = true, requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("branded_description")
  @Deprecated
  public String getBrandedDescription() {
    return brandedDescription;
  }

  /**
   * @deprecated
  */
  @Deprecated
  public void setBrandedDescription(String brandedDescription) {
    this.brandedDescription = brandedDescription;
  }

  public EmployersEmployerInfo branding(EmployersBrandingEmployerBranding branding) {
    this.branding = branding;
    return this;
  }

  /**
   * Get branding
   * @return branding
  */
  @Valid 
  @Schema(name = "branding", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("branding")
  public EmployersBrandingEmployerBranding getBranding() {
    return branding;
  }

  public void setBranding(EmployersBrandingEmployerBranding branding) {
    this.branding = branding;
  }

  public EmployersEmployerInfo description(String description) {
    this.description = description;
    return this;
  }

  /**
   * Описание работодателя в виде строки с кодом HTML (без `<script/>` и `<style/>`)
   * @return description
  */
  
  @Schema(name = "description", description = "Описание работодателя в виде строки с кодом HTML (без `<script/>` и `<style/>`)", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("description")
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public EmployersEmployerInfo id(String id) {
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

  public EmployersEmployerInfo industries(List<@Valid IncludesIdName> industries) {
    this.industries = industries;
    return this;
  }

  public EmployersEmployerInfo addIndustriesItem(IncludesIdName industriesItem) {
    if (this.industries == null) {
      this.industries = new ArrayList<>();
    }
    this.industries.add(industriesItem);
    return this;
  }

  /**
   * Список отраслей работодателя. Элементы [справочника индустрий](https://api.hh.ru/openapi/redoc#tag/Obshie-spravochniki/operation/get-industries)
   * @return industries
  */
  @NotNull @Valid 
  @Schema(name = "industries", description = "Список отраслей работодателя. Элементы [справочника индустрий](https://api.hh.ru/openapi/redoc#tag/Obshie-spravochniki/operation/get-industries)", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("industries")
  public List<@Valid IncludesIdName> getIndustries() {
    return industries;
  }

  public void setIndustries(List<@Valid IncludesIdName> industries) {
    this.industries = industries;
  }

  public EmployersEmployerInfo insiderInterviews(List<@Valid EmployersInsiderInterviews> insiderInterviews) {
    this.insiderInterviews = insiderInterviews;
    return this;
  }

  public EmployersEmployerInfo addInsiderInterviewsItem(EmployersInsiderInterviews insiderInterviewsItem) {
    if (this.insiderInterviews == null) {
      this.insiderInterviews = new ArrayList<>();
    }
    this.insiderInterviews.add(insiderInterviewsItem);
    return this;
  }

  /**
   * Список интервью
   * @return insiderInterviews
  */
  @NotNull @Valid @Size(min = 0) 
  @Schema(name = "insider_interviews", description = "Список интервью", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("insider_interviews")
  public List<@Valid EmployersInsiderInterviews> getInsiderInterviews() {
    return insiderInterviews;
  }

  public void setInsiderInterviews(List<@Valid EmployersInsiderInterviews> insiderInterviews) {
    this.insiderInterviews = insiderInterviews;
  }

  public EmployersEmployerInfo logoUrls(IncludesLogoUrls logoUrls) {
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

  public EmployersEmployerInfo name(String name) {
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

  public EmployersEmployerInfo openVacancies(BigDecimal openVacancies) {
    this.openVacancies = openVacancies;
    return this;
  }

  /**
   * Количество открытых вакансий у работодателя
   * @return openVacancies
  */
  @Valid 
  @Schema(name = "open_vacancies", description = "Количество открытых вакансий у работодателя", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("open_vacancies")
  public BigDecimal getOpenVacancies() {
    return openVacancies;
  }

  public void setOpenVacancies(BigDecimal openVacancies) {
    this.openVacancies = openVacancies;
  }

  public EmployersEmployerInfo relations(List<RelationsEnum> relations) {
    this.relations = relations;
    return this;
  }

  public EmployersEmployerInfo addRelationsItem(RelationsEnum relationsItem) {
    if (this.relations == null) {
      this.relations = new ArrayList<>();
    }
    this.relations.add(relationsItem);
    return this;
  }

  /**
   * Если работодатель добавлен в черный список, то вернется `['blacklisted']`, иначе `[]`
   * @return relations
  */
  @NotNull 
  @Schema(name = "relations", description = "Если работодатель добавлен в черный список, то вернется `['blacklisted']`, иначе `[]`", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("relations")
  public List<RelationsEnum> getRelations() {
    return relations;
  }

  public void setRelations(List<RelationsEnum> relations) {
    this.relations = relations;
  }

  public EmployersEmployerInfo siteUrl(String siteUrl) {
    this.siteUrl = siteUrl;
    return this;
  }

  /**
   * Адрес сайта работодателя
   * @return siteUrl
  */
  @NotNull 
  @Schema(name = "site_url", description = "Адрес сайта работодателя", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("site_url")
  public String getSiteUrl() {
    return siteUrl;
  }

  public void setSiteUrl(String siteUrl) {
    this.siteUrl = siteUrl;
  }

  public EmployersEmployerInfo trusted(Boolean trusted) {
    this.trusted = trusted;
    return this;
  }

  /**
   * Флаг, показывающий, прошел ли работодатель [проверку на сайте](https://feedback.hh.ru/knowledge-base/article/5951)
   * @return trusted
  */
  @NotNull 
  @Schema(name = "trusted", description = "Флаг, показывающий, прошел ли работодатель [проверку на сайте](https://feedback.hh.ru/knowledge-base/article/5951)", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("trusted")
  public Boolean getTrusted() {
    return trusted;
  }

  public void setTrusted(Boolean trusted) {
    this.trusted = trusted;
  }

  public EmployersEmployerInfo type(String type) {
    this.type = type;
    return this;
  }

  /**
   * Тип работодателя (прямой работодатель, кадровое агентство и т.п.). Возможные значения описаны в [справочнике](#tag/Obshie-spravochniki/operation/get-dictionaries) в поле `employer_type`. Возвращает `null`, если тип работодателя скрыт
   * @return type
  */
  
  @Schema(name = "type", description = "Тип работодателя (прямой работодатель, кадровое агентство и т.п.). Возможные значения описаны в [справочнике](#tag/Obshie-spravochniki/operation/get-dictionaries) в поле `employer_type`. Возвращает `null`, если тип работодателя скрыт", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("type")
  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }

  public EmployersEmployerInfo vacanciesUrl(String vacanciesUrl) {
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
    EmployersEmployerInfo employersEmployerInfo = (EmployersEmployerInfo) o;
    return Objects.equals(this.accreditedItEmployer, employersEmployerInfo.accreditedItEmployer) &&
        Objects.equals(this.alternateUrl, employersEmployerInfo.alternateUrl) &&
        Objects.equals(this.applicantServices, employersEmployerInfo.applicantServices) &&
        Objects.equals(this.area, employersEmployerInfo.area) &&
        Objects.equals(this.brandedDescription, employersEmployerInfo.brandedDescription) &&
        Objects.equals(this.branding, employersEmployerInfo.branding) &&
        Objects.equals(this.description, employersEmployerInfo.description) &&
        Objects.equals(this.id, employersEmployerInfo.id) &&
        Objects.equals(this.industries, employersEmployerInfo.industries) &&
        Objects.equals(this.insiderInterviews, employersEmployerInfo.insiderInterviews) &&
        Objects.equals(this.logoUrls, employersEmployerInfo.logoUrls) &&
        Objects.equals(this.name, employersEmployerInfo.name) &&
        Objects.equals(this.openVacancies, employersEmployerInfo.openVacancies) &&
        Objects.equals(this.relations, employersEmployerInfo.relations) &&
        Objects.equals(this.siteUrl, employersEmployerInfo.siteUrl) &&
        Objects.equals(this.trusted, employersEmployerInfo.trusted) &&
        Objects.equals(this.type, employersEmployerInfo.type) &&
        Objects.equals(this.vacanciesUrl, employersEmployerInfo.vacanciesUrl);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accreditedItEmployer, alternateUrl, applicantServices, area, brandedDescription, branding, description, id, industries, insiderInterviews, logoUrls, name, openVacancies, relations, siteUrl, trusted, type, vacanciesUrl);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EmployersEmployerInfo {\n");
    sb.append("    accreditedItEmployer: ").append(toIndentedString(accreditedItEmployer)).append("\n");
    sb.append("    alternateUrl: ").append(toIndentedString(alternateUrl)).append("\n");
    sb.append("    applicantServices: ").append(toIndentedString(applicantServices)).append("\n");
    sb.append("    area: ").append(toIndentedString(area)).append("\n");
    sb.append("    brandedDescription: ").append(toIndentedString(brandedDescription)).append("\n");
    sb.append("    branding: ").append(toIndentedString(branding)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    industries: ").append(toIndentedString(industries)).append("\n");
    sb.append("    insiderInterviews: ").append(toIndentedString(insiderInterviews)).append("\n");
    sb.append("    logoUrls: ").append(toIndentedString(logoUrls)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    openVacancies: ").append(toIndentedString(openVacancies)).append("\n");
    sb.append("    relations: ").append(toIndentedString(relations)).append("\n");
    sb.append("    siteUrl: ").append(toIndentedString(siteUrl)).append("\n");
    sb.append("    trusted: ").append(toIndentedString(trusted)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
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

