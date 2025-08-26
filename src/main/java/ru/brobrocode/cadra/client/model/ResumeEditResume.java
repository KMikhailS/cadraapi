package ru.brobrocode.cadra.client.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.annotation.Generated;
import jakarta.validation.Valid;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * Информация о резюме
 */

@Schema(name = "ResumeEditResume", description = "Информация о резюме")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2025-08-17T15:41:09.394389505+05:00[Asia/Yekaterinburg]", comments = "Generator version: 7.6.0")
public class ResumeEditResume {

  private ResumeEditResumeAccess access;

  private Id area;

  private String birthDate;

  private IncludesId businessTripReadiness;

  @Valid
  private List<@Valid ResumeEditResumeCertificateInner> certificate = new ArrayList<>();

  @Valid
  private List<@Valid IncludesId> citizenship = new ArrayList<>();

  @Valid
  private List<@Valid ResumeEditResumeContactInner> contact = new ArrayList<>();

  @Valid
  private List<@Valid ResumeEditResumeDriverLicenseTypesInner> driverLicenseTypes = new ArrayList<>();

  private ResumeEditResumeEducation education;

  @Valid
  private List<@Valid ResumeObjectsEmploymentFormEmploymentFormItem> employmentForm = new ArrayList<>();

  @Valid
  private List<@Valid IncludesId> employments = new ArrayList<>();

  @Valid
  private List<@Valid ResumeEditResumeExperienceInner> experience = new ArrayList<>();

  private String firstName;

  private Id gender;

  private Boolean hasVehicle;

  @Valid
  private List<@Valid IncludesId> hiddenFields = new ArrayList<>();

  @Valid
  private List<@Valid ResumeEditResumeLanguageInner> language = new ArrayList<>();

  private String lastName;

  private IncludesId metro;

  private String middleName;

  private IncludesId photo;

  private ResumeViewPlatform platform;

  @Valid
  private List<@Valid IncludesId> portfolio = new ArrayList<>();

  @Valid
  private List<@Valid IncludesId> professionalRoles = new ArrayList<>();

  @Valid
  private List<@Valid ResumeEditResumeRecommendationInner> recommendation = new ArrayList<>();

  private ResumeEditResumeRelocation relocation;

  private IncludesId resumeLocale;

  private ResumeEditResumeSalary salary;

  @Valid
  private List<@Valid IncludesId> schedules = new ArrayList<>();

  @Valid
  private List<@Valid ResumeEditResumeSiteInner> site = new ArrayList<>();

  @Valid
  private List<String> skillSet = new ArrayList<>();

  private String skills;

  @Valid
  private List<@Valid IncludesId> specialization = new ArrayList<>();

  private String title;

  private IncludesId travelTime;

  @Valid
  private List<@Valid ResumeObjectsWorkFormatWorkFormatItem> workFormat = new ArrayList<>();

  @Valid
  private List<@Valid IncludesId> workTicket = new ArrayList<>();

  public ResumeEditResume access(ResumeEditResumeAccess access) {
    this.access = access;
    return this;
  }

  /**
   * Get access
   * @return access
  */
  @Valid 
  @Schema(name = "access", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("access")
  public ResumeEditResumeAccess getAccess() {
    return access;
  }

  public void setAccess(ResumeEditResumeAccess access) {
    this.access = access;
  }

  public ResumeEditResume area(Id area) {
    this.area = area;
    return this;
  }

  /**
   * Город проживания. Элемент справочника [areas](#tag/Obshie-spravochniki/operation/get-areas)
   * @return area
  */
  @Valid 
  @Schema(name = "area", description = "Город проживания. Элемент справочника [areas](#tag/Obshie-spravochniki/operation/get-areas)", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("area")
  public Id getArea() {
    return area;
  }

  public void setArea(Id area) {
    this.area = area;
  }

  public ResumeEditResume birthDate(String birthDate) {
    this.birthDate = birthDate;
    return this;
  }

  /**
   * День рождения (в формате `ГГГГ-ММ-ДД`)
   * @return birthDate
  */
  
  @Schema(name = "birth_date", description = "День рождения (в формате `ГГГГ-ММ-ДД`)", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("birth_date")
  public String getBirthDate() {
    return birthDate;
  }

  public void setBirthDate(String birthDate) {
    this.birthDate = birthDate;
  }

  public ResumeEditResume businessTripReadiness(IncludesId businessTripReadiness) {
    this.businessTripReadiness = businessTripReadiness;
    return this;
  }

  /**
   * Готовность к командировкам. Элемент справочника [business_trip_readiness](#tag/Obshie-spravochniki/operation/get-dictionaries)
   * @return businessTripReadiness
  */
  @Valid 
  @Schema(name = "business_trip_readiness", description = "Готовность к командировкам. Элемент справочника [business_trip_readiness](#tag/Obshie-spravochniki/operation/get-dictionaries)", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("business_trip_readiness")
  public IncludesId getBusinessTripReadiness() {
    return businessTripReadiness;
  }

  public void setBusinessTripReadiness(IncludesId businessTripReadiness) {
    this.businessTripReadiness = businessTripReadiness;
  }

  public ResumeEditResume certificate(List<@Valid ResumeEditResumeCertificateInner> certificate) {
    this.certificate = certificate;
    return this;
  }

  public ResumeEditResume addCertificateItem(ResumeEditResumeCertificateInner certificateItem) {
    if (this.certificate == null) {
      this.certificate = new ArrayList<>();
    }
    this.certificate.add(certificateItem);
    return this;
  }

  /**
   * Список сертификатов соискателя
   * @return certificate
  */
  @Valid 
  @Schema(name = "certificate", description = "Список сертификатов соискателя", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("certificate")
  public List<@Valid ResumeEditResumeCertificateInner> getCertificate() {
    return certificate;
  }

  public void setCertificate(List<@Valid ResumeEditResumeCertificateInner> certificate) {
    this.certificate = certificate;
  }

  public ResumeEditResume citizenship(List<@Valid IncludesId> citizenship) {
    this.citizenship = citizenship;
    return this;
  }

  public ResumeEditResume addCitizenshipItem(IncludesId citizenshipItem) {
    if (this.citizenship == null) {
      this.citizenship = new ArrayList<>();
    }
    this.citizenship.add(citizenshipItem);
    return this;
  }

  /**
   * Список гражданств соискателя. Элементы [справочника регионов](#tag/Obshie-spravochniki/operation/get-areas)
   * @return citizenship
  */
  @Valid 
  @Schema(name = "citizenship", description = "Список гражданств соискателя. Элементы [справочника регионов](#tag/Obshie-spravochniki/operation/get-areas)", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("citizenship")
  public List<@Valid IncludesId> getCitizenship() {
    return citizenship;
  }

  public void setCitizenship(List<@Valid IncludesId> citizenship) {
    this.citizenship = citizenship;
  }

  public ResumeEditResume contact(List<@Valid ResumeEditResumeContactInner> contact) {
    this.contact = contact;
    return this;
  }

  public ResumeEditResume addContactItem(ResumeEditResumeContactInner contactItem) {
    if (this.contact == null) {
      this.contact = new ArrayList<>();
    }
    this.contact.add(contactItem);
    return this;
  }

  /**
   * Список контактов соискателя
   * @return contact
  */
  @Valid 
  @Schema(name = "contact", description = "Список контактов соискателя", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("contact")
  public List<@Valid ResumeEditResumeContactInner> getContact() {
    return contact;
  }

  public void setContact(List<@Valid ResumeEditResumeContactInner> contact) {
    this.contact = contact;
  }

  public ResumeEditResume driverLicenseTypes(List<@Valid ResumeEditResumeDriverLicenseTypesInner> driverLicenseTypes) {
    this.driverLicenseTypes = driverLicenseTypes;
    return this;
  }

  public ResumeEditResume addDriverLicenseTypesItem(ResumeEditResumeDriverLicenseTypesInner driverLicenseTypesItem) {
    if (this.driverLicenseTypes == null) {
      this.driverLicenseTypes = new ArrayList<>();
    }
    this.driverLicenseTypes.add(driverLicenseTypesItem);
    return this;
  }

  /**
   * Список категорий водительских прав соискателя
   * @return driverLicenseTypes
  */
  @Valid 
  @Schema(name = "driver_license_types", description = "Список категорий водительских прав соискателя", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("driver_license_types")
  public List<@Valid ResumeEditResumeDriverLicenseTypesInner> getDriverLicenseTypes() {
    return driverLicenseTypes;
  }

  public void setDriverLicenseTypes(List<@Valid ResumeEditResumeDriverLicenseTypesInner> driverLicenseTypes) {
    this.driverLicenseTypes = driverLicenseTypes;
  }

  public ResumeEditResume education(ResumeEditResumeEducation education) {
    this.education = education;
    return this;
  }

  /**
   * Get education
   * @return education
  */
  @Valid 
  @Schema(name = "education", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("education")
  public ResumeEditResumeEducation getEducation() {
    return education;
  }

  public void setEducation(ResumeEditResumeEducation education) {
    this.education = education;
  }

  public ResumeEditResume employmentForm(List<@Valid ResumeObjectsEmploymentFormEmploymentFormItem> employmentForm) {
    this.employmentForm = employmentForm;
    return this;
  }

  public ResumeEditResume addEmploymentFormItem(ResumeObjectsEmploymentFormEmploymentFormItem employmentFormItem) {
    if (this.employmentForm == null) {
      this.employmentForm = new ArrayList<>();
    }
    this.employmentForm.add(employmentFormItem);
    return this;
  }

  /**
   * Список типов занятости
   * @return employmentForm
  */
  @Valid 
  @Schema(name = "employment_form", description = "Список типов занятости", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("employment_form")
  public List<@Valid ResumeObjectsEmploymentFormEmploymentFormItem> getEmploymentForm() {
    return employmentForm;
  }

  public void setEmploymentForm(List<@Valid ResumeObjectsEmploymentFormEmploymentFormItem> employmentForm) {
    this.employmentForm = employmentForm;
  }

  public ResumeEditResume employments(List<@Valid IncludesId> employments) {
    this.employments = employments;
    return this;
  }

  public ResumeEditResume addEmploymentsItem(IncludesId employmentsItem) {
    if (this.employments == null) {
      this.employments = new ArrayList<>();
    }
    this.employments.add(employmentsItem);
    return this;
  }

  /**
   * Список подходящих соискателю типов занятостей. Элементы справочника [employment](#tag/Obshie-spravochniki/operation/get-dictionaries)
   * @return employments
  */
  @Valid 
  @Schema(name = "employments", description = "Список подходящих соискателю типов занятостей. Элементы справочника [employment](#tag/Obshie-spravochniki/operation/get-dictionaries)", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("employments")
  public List<@Valid IncludesId> getEmployments() {
    return employments;
  }

  public void setEmployments(List<@Valid IncludesId> employments) {
    this.employments = employments;
  }

  public ResumeEditResume experience(List<@Valid ResumeEditResumeExperienceInner> experience) {
    this.experience = experience;
    return this;
  }

  public ResumeEditResume addExperienceItem(ResumeEditResumeExperienceInner experienceItem) {
    if (this.experience == null) {
      this.experience = new ArrayList<>();
    }
    this.experience.add(experienceItem);
    return this;
  }

  /**
   * Опыт работы
   * @return experience
  */
  @Valid 
  @Schema(name = "experience", description = "Опыт работы", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("experience")
  public List<@Valid ResumeEditResumeExperienceInner> getExperience() {
    return experience;
  }

  public void setExperience(List<@Valid ResumeEditResumeExperienceInner> experience) {
    this.experience = experience;
  }

  public ResumeEditResume firstName(String firstName) {
    this.firstName = firstName;
    return this;
  }

  /**
   * Имя
   * @return firstName
  */
  
  @Schema(name = "first_name", description = "Имя", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("first_name")
  public String getFirstName() {
    return firstName;
  }

  public void setFirstName(String firstName) {
    this.firstName = firstName;
  }

  public ResumeEditResume gender(Id gender) {
    this.gender = gender;
    return this;
  }

  /**
   * Пол. Элемент справочника [gender](#tag/Obshie-spravochniki/operation/get-dictionaries)
   * @return gender
  */
  @Valid 
  @Schema(name = "gender", description = "Пол. Элемент справочника [gender](#tag/Obshie-spravochniki/operation/get-dictionaries)", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("gender")
  public Id getGender() {
    return gender;
  }

  public void setGender(Id gender) {
    this.gender = gender;
  }

  public ResumeEditResume hasVehicle(Boolean hasVehicle) {
    this.hasVehicle = hasVehicle;
    return this;
  }

  /**
   * Наличие личного автомобиля у соискателя
   * @return hasVehicle
  */
  
  @Schema(name = "has_vehicle", description = "Наличие личного автомобиля у соискателя", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("has_vehicle")
  public Boolean getHasVehicle() {
    return hasVehicle;
  }

  public void setHasVehicle(Boolean hasVehicle) {
    this.hasVehicle = hasVehicle;
  }

  public ResumeEditResume hiddenFields(List<@Valid IncludesId> hiddenFields) {
    this.hiddenFields = hiddenFields;
    return this;
  }

  public ResumeEditResume addHiddenFieldsItem(IncludesId hiddenFieldsItem) {
    if (this.hiddenFields == null) {
      this.hiddenFields = new ArrayList<>();
    }
    this.hiddenFields.add(hiddenFieldsItem);
    return this;
  }

  /**
   * Список скрытых полей. Элемент справочника [resume_hidden_fields](#tag/Obshie-spravochniki/operation/get-dictionaries) 
   * @return hiddenFields
  */
  @Valid 
  @Schema(name = "hidden_fields", description = "Список скрытых полей. Элемент справочника [resume_hidden_fields](#tag/Obshie-spravochniki/operation/get-dictionaries) ", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("hidden_fields")
  public List<@Valid IncludesId> getHiddenFields() {
    return hiddenFields;
  }

  public void setHiddenFields(List<@Valid IncludesId> hiddenFields) {
    this.hiddenFields = hiddenFields;
  }

  public ResumeEditResume language(List<@Valid ResumeEditResumeLanguageInner> language) {
    this.language = language;
    return this;
  }

  public ResumeEditResume addLanguageItem(ResumeEditResumeLanguageInner languageItem) {
    if (this.language == null) {
      this.language = new ArrayList<>();
    }
    this.language.add(languageItem);
    return this;
  }

  /**
   * Список языков, которыми владеет соискатель
   * @return language
  */
  @Valid 
  @Schema(name = "language", description = "Список языков, которыми владеет соискатель", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("language")
  public List<@Valid ResumeEditResumeLanguageInner> getLanguage() {
    return language;
  }

  public void setLanguage(List<@Valid ResumeEditResumeLanguageInner> language) {
    this.language = language;
  }

  public ResumeEditResume lastName(String lastName) {
    this.lastName = lastName;
    return this;
  }

  /**
   * Фамилия
   * @return lastName
  */
  
  @Schema(name = "last_name", description = "Фамилия", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("last_name")
  public String getLastName() {
    return lastName;
  }

  public void setLastName(String lastName) {
    this.lastName = lastName;
  }

  public ResumeEditResume metro(IncludesId metro) {
    this.metro = metro;
    return this;
  }

  /**
   * Ближайшая станция метро. Элемент справочника [metro](#tag/Obshie-spravochniki/operation/get-metro-stations). Если передать метро, не принадлежащее переданной area, поле проигнорируется. Имеет смысл указывать только для `area` с метро 
   * @return metro
  */
  @Valid 
  @Schema(name = "metro", description = "Ближайшая станция метро. Элемент справочника [metro](#tag/Obshie-spravochniki/operation/get-metro-stations). Если передать метро, не принадлежащее переданной area, поле проигнорируется. Имеет смысл указывать только для `area` с метро ", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("metro")
  public IncludesId getMetro() {
    return metro;
  }

  public void setMetro(IncludesId metro) {
    this.metro = metro;
  }

  public ResumeEditResume middleName(String middleName) {
    this.middleName = middleName;
    return this;
  }

  /**
   * Отчество
   * @return middleName
  */
  
  @Schema(name = "middle_name", description = "Отчество", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("middle_name")
  public String getMiddleName() {
    return middleName;
  }

  public void setMiddleName(String middleName) {
    this.middleName = middleName;
  }

  public ResumeEditResume photo(IncludesId photo) {
    this.photo = photo;
    return this;
  }

  /**
   * Фотография пользователя (см. [Артефакты](#tag/Rabota-s-artefaktami))
   * @return photo
  */
  @Valid 
  @Schema(name = "photo", description = "Фотография пользователя (см. [Артефакты](#tag/Rabota-s-artefaktami))", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("photo")
  public IncludesId getPhoto() {
    return photo;
  }

  public void setPhoto(IncludesId photo) {
    this.photo = photo;
  }

  public ResumeEditResume platform(ResumeViewPlatform platform) {
    this.platform = platform;
    return this;
  }

  /**
   * Get platform
   * @return platform
  */
  @Valid 
  @Schema(name = "platform", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("platform")
  public ResumeViewPlatform getPlatform() {
    return platform;
  }

  public void setPlatform(ResumeViewPlatform platform) {
    this.platform = platform;
  }

  public ResumeEditResume portfolio(List<@Valid IncludesId> portfolio) {
    this.portfolio = portfolio;
    return this;
  }

  public ResumeEditResume addPortfolioItem(IncludesId portfolioItem) {
    if (this.portfolio == null) {
      this.portfolio = new ArrayList<>();
    }
    this.portfolio.add(portfolioItem);
    return this;
  }

  /**
   * Список изображений в портфолио пользователя
   * @return portfolio
  */
  @Valid 
  @Schema(name = "portfolio", description = "Список изображений в портфолио пользователя", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("portfolio")
  public List<@Valid IncludesId> getPortfolio() {
    return portfolio;
  }

  public void setPortfolio(List<@Valid IncludesId> portfolio) {
    this.portfolio = portfolio;
  }

  public ResumeEditResume professionalRoles(List<@Valid IncludesId> professionalRoles) {
    this.professionalRoles = professionalRoles;
    return this;
  }

  public ResumeEditResume addProfessionalRolesItem(IncludesId professionalRolesItem) {
    if (this.professionalRoles == null) {
      this.professionalRoles = new ArrayList<>();
    }
    this.professionalRoles.add(professionalRolesItem);
    return this;
  }

  /**
   * Массив объектов профролей. Элемент справочника [professional_roles](/openapi/redoc#tag/Obshie-spravochniki/operation/get-professional-roles-dictionary)
   * @return professionalRoles
  */
  @Valid 
  @Schema(name = "professional_roles", description = "Массив объектов профролей. Элемент справочника [professional_roles](/openapi/redoc#tag/Obshie-spravochniki/operation/get-professional-roles-dictionary)", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("professional_roles")
  public List<@Valid IncludesId> getProfessionalRoles() {
    return professionalRoles;
  }

  public void setProfessionalRoles(List<@Valid IncludesId> professionalRoles) {
    this.professionalRoles = professionalRoles;
  }

  public ResumeEditResume recommendation(List<@Valid ResumeEditResumeRecommendationInner> recommendation) {
    this.recommendation = recommendation;
    return this;
  }

  public ResumeEditResume addRecommendationItem(ResumeEditResumeRecommendationInner recommendationItem) {
    if (this.recommendation == null) {
      this.recommendation = new ArrayList<>();
    }
    this.recommendation.add(recommendationItem);
    return this;
  }

  /**
   * Список рекомендаций
   * @return recommendation
  */
  @Valid 
  @Schema(name = "recommendation", description = "Список рекомендаций", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("recommendation")
  public List<@Valid ResumeEditResumeRecommendationInner> getRecommendation() {
    return recommendation;
  }

  public void setRecommendation(List<@Valid ResumeEditResumeRecommendationInner> recommendation) {
    this.recommendation = recommendation;
  }

  public ResumeEditResume relocation(ResumeEditResumeRelocation relocation) {
    this.relocation = relocation;
    return this;
  }

  /**
   * Get relocation
   * @return relocation
  */
  @Valid 
  @Schema(name = "relocation", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("relocation")
  public ResumeEditResumeRelocation getRelocation() {
    return relocation;
  }

  public void setRelocation(ResumeEditResumeRelocation relocation) {
    this.relocation = relocation;
  }

  public ResumeEditResume resumeLocale(IncludesId resumeLocale) {
    this.resumeLocale = resumeLocale;
    return this;
  }

  /**
   * Язык, на котором составлено резюме (локаль). Элемент справочника [локали резюме](#tag/Obshie-spravochniki/operation/get-locales)
   * @return resumeLocale
  */
  @Valid 
  @Schema(name = "resume_locale", description = "Язык, на котором составлено резюме (локаль). Элемент справочника [локали резюме](#tag/Obshie-spravochniki/operation/get-locales)", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("resume_locale")
  public IncludesId getResumeLocale() {
    return resumeLocale;
  }

  public void setResumeLocale(IncludesId resumeLocale) {
    this.resumeLocale = resumeLocale;
  }

  public ResumeEditResume salary(ResumeEditResumeSalary salary) {
    this.salary = salary;
    return this;
  }

  /**
   * Get salary
   * @return salary
  */
  @Valid 
  @Schema(name = "salary", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("salary")
  public ResumeEditResumeSalary getSalary() {
    return salary;
  }

  public void setSalary(ResumeEditResumeSalary salary) {
    this.salary = salary;
  }

  public ResumeEditResume schedules(List<@Valid IncludesId> schedules) {
    this.schedules = schedules;
    return this;
  }

  public ResumeEditResume addSchedulesItem(IncludesId schedulesItem) {
    if (this.schedules == null) {
      this.schedules = new ArrayList<>();
    }
    this.schedules.add(schedulesItem);
    return this;
  }

  /**
   * Список подходящих соискателю графиков работы. Элементы справочника [schedule](#tag/Obshie-spravochniki/operation/get-dictionaries)
   * @return schedules
  */
  @Valid 
  @Schema(name = "schedules", description = "Список подходящих соискателю графиков работы. Элементы справочника [schedule](#tag/Obshie-spravochniki/operation/get-dictionaries)", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("schedules")
  public List<@Valid IncludesId> getSchedules() {
    return schedules;
  }

  public void setSchedules(List<@Valid IncludesId> schedules) {
    this.schedules = schedules;
  }

  public ResumeEditResume site(List<@Valid ResumeEditResumeSiteInner> site) {
    this.site = site;
    return this;
  }

  public ResumeEditResume addSiteItem(ResumeEditResumeSiteInner siteItem) {
    if (this.site == null) {
      this.site = new ArrayList<>();
    }
    this.site.add(siteItem);
    return this;
  }

  /**
   * Профили в соц. сетях и других сервисах
   * @return site
  */
  @Valid 
  @Schema(name = "site", description = "Профили в соц. сетях и других сервисах", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("site")
  public List<@Valid ResumeEditResumeSiteInner> getSite() {
    return site;
  }

  public void setSite(List<@Valid ResumeEditResumeSiteInner> site) {
    this.site = site;
  }

  public ResumeEditResume skillSet(List<String> skillSet) {
    this.skillSet = skillSet;
    return this;
  }

  public ResumeEditResume addSkillSetItem(String skillSetItem) {
    if (this.skillSet == null) {
      this.skillSet = new ArrayList<>();
    }
    this.skillSet.add(skillSetItem);
    return this;
  }

  /**
   * Ключевые навыки (список уникальных строк)
   * @return skillSet
  */
  
  @Schema(name = "skill_set", description = "Ключевые навыки (список уникальных строк)", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("skill_set")
  public List<String> getSkillSet() {
    return skillSet;
  }

  public void setSkillSet(List<String> skillSet) {
    this.skillSet = skillSet;
  }

  public ResumeEditResume skills(String skills) {
    this.skills = skills;
    return this;
  }

  /**
   * Дополнительная информация, описание навыков в свободной форме
   * @return skills
  */
  
  @Schema(name = "skills", description = "Дополнительная информация, описание навыков в свободной форме", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("skills")
  public String getSkills() {
    return skills;
  }

  public void setSkills(String skills) {
    this.skills = skills;
  }

  public ResumeEditResume specialization(List<@Valid IncludesId> specialization) {
    this.specialization = specialization;
    return this;
  }

  public ResumeEditResume addSpecializationItem(IncludesId specializationItem) {
    if (this.specialization == null) {
      this.specialization = new ArrayList<>();
    }
    this.specialization.add(specializationItem);
    return this;
  }

  /**
   * Специализации соискателя. Элементы справочника [specializations](https://github.com/hhru/api/blob/461b16c0b96291bda8db22d3364f42b7fa34eba6/docs/specializations.md)
   * @return specialization
  */
  @Valid 
  @Schema(name = "specialization", description = "Специализации соискателя. Элементы справочника [specializations](https://github.com/hhru/api/blob/461b16c0b96291bda8db22d3364f42b7fa34eba6/docs/specializations.md)", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("specialization")
  public List<@Valid IncludesId> getSpecialization() {
    return specialization;
  }

  public void setSpecialization(List<@Valid IncludesId> specialization) {
    this.specialization = specialization;
  }

  public ResumeEditResume title(String title) {
    this.title = title;
    return this;
  }

  /**
   * Желаемая должность
   * @return title
  */
  
  @Schema(name = "title", description = "Желаемая должность", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("title")
  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public ResumeEditResume travelTime(IncludesId travelTime) {
    this.travelTime = travelTime;
    return this;
  }

  /**
   * Желательное время в пути до работы. Элемент справочника [travel_time](#tag/Obshie-spravochniki/operation/get-dictionaries)
   * @return travelTime
  */
  @Valid 
  @Schema(name = "travel_time", description = "Желательное время в пути до работы. Элемент справочника [travel_time](#tag/Obshie-spravochniki/operation/get-dictionaries)", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("travel_time")
  public IncludesId getTravelTime() {
    return travelTime;
  }

  public void setTravelTime(IncludesId travelTime) {
    this.travelTime = travelTime;
  }

  public ResumeEditResume workFormat(List<@Valid ResumeObjectsWorkFormatWorkFormatItem> workFormat) {
    this.workFormat = workFormat;
    return this;
  }

  public ResumeEditResume addWorkFormatItem(ResumeObjectsWorkFormatWorkFormatItem workFormatItem) {
    if (this.workFormat == null) {
      this.workFormat = new ArrayList<>();
    }
    this.workFormat.add(workFormatItem);
    return this;
  }

  /**
   * Список форматов работы
   * @return workFormat
  */
  @Valid 
  @Schema(name = "work_format", description = "Список форматов работы", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("work_format")
  public List<@Valid ResumeObjectsWorkFormatWorkFormatItem> getWorkFormat() {
    return workFormat;
  }

  public void setWorkFormat(List<@Valid ResumeObjectsWorkFormatWorkFormatItem> workFormat) {
    this.workFormat = workFormat;
  }

  public ResumeEditResume workTicket(List<@Valid IncludesId> workTicket) {
    this.workTicket = workTicket;
    return this;
  }

  public ResumeEditResume addWorkTicketItem(IncludesId workTicketItem) {
    if (this.workTicket == null) {
      this.workTicket = new ArrayList<>();
    }
    this.workTicket.add(workTicketItem);
    return this;
  }

  /**
   * Список регионов, в который соискатель имеет разрешение на работу. Элементы [справочника регионов](#tag/Obshie-spravochniki/operation/get-areas) 
   * @return workTicket
  */
  @Valid 
  @Schema(name = "work_ticket", description = "Список регионов, в который соискатель имеет разрешение на работу. Элементы [справочника регионов](#tag/Obshie-spravochniki/operation/get-areas) ", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("work_ticket")
  public List<@Valid IncludesId> getWorkTicket() {
    return workTicket;
  }

  public void setWorkTicket(List<@Valid IncludesId> workTicket) {
    this.workTicket = workTicket;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ResumeEditResume resumeEditResume = (ResumeEditResume) o;
    return Objects.equals(this.access, resumeEditResume.access) &&
        Objects.equals(this.area, resumeEditResume.area) &&
        Objects.equals(this.birthDate, resumeEditResume.birthDate) &&
        Objects.equals(this.businessTripReadiness, resumeEditResume.businessTripReadiness) &&
        Objects.equals(this.certificate, resumeEditResume.certificate) &&
        Objects.equals(this.citizenship, resumeEditResume.citizenship) &&
        Objects.equals(this.contact, resumeEditResume.contact) &&
        Objects.equals(this.driverLicenseTypes, resumeEditResume.driverLicenseTypes) &&
        Objects.equals(this.education, resumeEditResume.education) &&
        Objects.equals(this.employmentForm, resumeEditResume.employmentForm) &&
        Objects.equals(this.employments, resumeEditResume.employments) &&
        Objects.equals(this.experience, resumeEditResume.experience) &&
        Objects.equals(this.firstName, resumeEditResume.firstName) &&
        Objects.equals(this.gender, resumeEditResume.gender) &&
        Objects.equals(this.hasVehicle, resumeEditResume.hasVehicle) &&
        Objects.equals(this.hiddenFields, resumeEditResume.hiddenFields) &&
        Objects.equals(this.language, resumeEditResume.language) &&
        Objects.equals(this.lastName, resumeEditResume.lastName) &&
        Objects.equals(this.metro, resumeEditResume.metro) &&
        Objects.equals(this.middleName, resumeEditResume.middleName) &&
        Objects.equals(this.photo, resumeEditResume.photo) &&
        Objects.equals(this.platform, resumeEditResume.platform) &&
        Objects.equals(this.portfolio, resumeEditResume.portfolio) &&
        Objects.equals(this.professionalRoles, resumeEditResume.professionalRoles) &&
        Objects.equals(this.recommendation, resumeEditResume.recommendation) &&
        Objects.equals(this.relocation, resumeEditResume.relocation) &&
        Objects.equals(this.resumeLocale, resumeEditResume.resumeLocale) &&
        Objects.equals(this.salary, resumeEditResume.salary) &&
        Objects.equals(this.schedules, resumeEditResume.schedules) &&
        Objects.equals(this.site, resumeEditResume.site) &&
        Objects.equals(this.skillSet, resumeEditResume.skillSet) &&
        Objects.equals(this.skills, resumeEditResume.skills) &&
        Objects.equals(this.specialization, resumeEditResume.specialization) &&
        Objects.equals(this.title, resumeEditResume.title) &&
        Objects.equals(this.travelTime, resumeEditResume.travelTime) &&
        Objects.equals(this.workFormat, resumeEditResume.workFormat) &&
        Objects.equals(this.workTicket, resumeEditResume.workTicket);
  }

  @Override
  public int hashCode() {
    return Objects.hash(access, area, birthDate, businessTripReadiness, certificate, citizenship, contact, driverLicenseTypes, education, employmentForm, employments, experience, firstName, gender, hasVehicle, hiddenFields, language, lastName, metro, middleName, photo, platform, portfolio, professionalRoles, recommendation, relocation, resumeLocale, salary, schedules, site, skillSet, skills, specialization, title, travelTime, workFormat, workTicket);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ResumeEditResume {\n");
    sb.append("    access: ").append(toIndentedString(access)).append("\n");
    sb.append("    area: ").append(toIndentedString(area)).append("\n");
    sb.append("    birthDate: ").append(toIndentedString(birthDate)).append("\n");
    sb.append("    businessTripReadiness: ").append(toIndentedString(businessTripReadiness)).append("\n");
    sb.append("    certificate: ").append(toIndentedString(certificate)).append("\n");
    sb.append("    citizenship: ").append(toIndentedString(citizenship)).append("\n");
    sb.append("    contact: ").append(toIndentedString(contact)).append("\n");
    sb.append("    driverLicenseTypes: ").append(toIndentedString(driverLicenseTypes)).append("\n");
    sb.append("    education: ").append(toIndentedString(education)).append("\n");
    sb.append("    employmentForm: ").append(toIndentedString(employmentForm)).append("\n");
    sb.append("    employments: ").append(toIndentedString(employments)).append("\n");
    sb.append("    experience: ").append(toIndentedString(experience)).append("\n");
    sb.append("    firstName: ").append(toIndentedString(firstName)).append("\n");
    sb.append("    gender: ").append(toIndentedString(gender)).append("\n");
    sb.append("    hasVehicle: ").append(toIndentedString(hasVehicle)).append("\n");
    sb.append("    hiddenFields: ").append(toIndentedString(hiddenFields)).append("\n");
    sb.append("    language: ").append(toIndentedString(language)).append("\n");
    sb.append("    lastName: ").append(toIndentedString(lastName)).append("\n");
    sb.append("    metro: ").append(toIndentedString(metro)).append("\n");
    sb.append("    middleName: ").append(toIndentedString(middleName)).append("\n");
    sb.append("    photo: ").append(toIndentedString(photo)).append("\n");
    sb.append("    platform: ").append(toIndentedString(platform)).append("\n");
    sb.append("    portfolio: ").append(toIndentedString(portfolio)).append("\n");
    sb.append("    professionalRoles: ").append(toIndentedString(professionalRoles)).append("\n");
    sb.append("    recommendation: ").append(toIndentedString(recommendation)).append("\n");
    sb.append("    relocation: ").append(toIndentedString(relocation)).append("\n");
    sb.append("    resumeLocale: ").append(toIndentedString(resumeLocale)).append("\n");
    sb.append("    salary: ").append(toIndentedString(salary)).append("\n");
    sb.append("    schedules: ").append(toIndentedString(schedules)).append("\n");
    sb.append("    site: ").append(toIndentedString(site)).append("\n");
    sb.append("    skillSet: ").append(toIndentedString(skillSet)).append("\n");
    sb.append("    skills: ").append(toIndentedString(skills)).append("\n");
    sb.append("    specialization: ").append(toIndentedString(specialization)).append("\n");
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
    sb.append("    travelTime: ").append(toIndentedString(travelTime)).append("\n");
    sb.append("    workFormat: ").append(toIndentedString(workFormat)).append("\n");
    sb.append("    workTicket: ").append(toIndentedString(workTicket)).append("\n");
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

