package ru.brobrocode.cadra.client.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.annotation.Generated;
import jakarta.validation.Valid;
import jakarta.validation.constraints.Size;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * Необязательные поля при создании резюме
 */

@Schema(name = "ResumeNullableFields", description = "Необязательные поля при создании резюме")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2025-08-17T15:41:09.394389505+05:00[Asia/Yekaterinburg]", comments = "Generator version: 7.6.0")
public class ResumeNullableFields {

  private ResumeObjectsAccess access = null;

  private String birthDate = null;

  private IncludesId businessTripReadiness = null;

  @Valid
  private List<@Valid ResumeObjectsCertificate> certificate;

  @Valid
  private List<@Valid ResumeObjectsDriverLicenseTypes> driverLicenseTypes;

  @Valid
  private List<@Valid ResumeObjectsEmploymentFormEmploymentFormItem> employmentForm = new ArrayList<>();

  @Valid
  private List<@Valid IncludesIdName> employments;

  private String firstName = null;

  private Boolean hasVehicle = null;

  @Valid
  private List<@Valid IncludesIdName> hiddenFields;

  private String lastName = null;

  private IncludesId metro = null;

  private String middleName = null;

  private ResumeObjectsPhoto photo = null;

  @Valid
  private List<@Valid ResumeObjectsPortfolio> portfolio;

  @Valid
  private List<@Valid IncludesId> professionalRoles = new ArrayList<>();

  @Valid
  private List<@Valid ResumeObjectsRecommendation> recommendation;

  private ResumeObjectsRelocationPublic relocation = null;

  private IncludesIdName resumeLocale = null;

  private ResumeObjectsSalaryAddEdit salary = null;

  @Valid
  private List<@Valid IncludesIdName> schedules;

  @Valid
  private List<@Valid ResumeObjectsSite> site;

  @Valid
  private List<String> skillSet;

  private String skills = null;

  private String title = null;

  private ResumeObjectsTotalExperience totalExperience = null;

  private IncludesId travelTime = null;

  @Valid
  private List<@Valid ResumeObjectsWorkFormatWorkFormatItem> workFormat = new ArrayList<>();

  @Valid
  private List<@Valid IncludesId> workTicket;

  public ResumeNullableFields access(ResumeObjectsAccess access) {
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
  public ResumeObjectsAccess getAccess() {
    return access;
  }

  public void setAccess(ResumeObjectsAccess access) {
    this.access = access;
  }

  public ResumeNullableFields birthDate(String birthDate) {
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

  public ResumeNullableFields businessTripReadiness(IncludesId businessTripReadiness) {
    this.businessTripReadiness = businessTripReadiness;
    return this;
  }

  /**
   * Get businessTripReadiness
   * @return businessTripReadiness
  */
  @Valid 
  @Schema(name = "business_trip_readiness", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("business_trip_readiness")
  public IncludesId getBusinessTripReadiness() {
    return businessTripReadiness;
  }

  public void setBusinessTripReadiness(IncludesId businessTripReadiness) {
    this.businessTripReadiness = businessTripReadiness;
  }

  public ResumeNullableFields certificate(List<@Valid ResumeObjectsCertificate> certificate) {
    this.certificate = certificate;
    return this;
  }

  public ResumeNullableFields addCertificateItem(ResumeObjectsCertificate certificateItem) {
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
  @Valid @Size(min = 0) 
  @Schema(name = "certificate", description = "Список сертификатов соискателя", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("certificate")
  public List<@Valid ResumeObjectsCertificate> getCertificate() {
    return certificate;
  }

  public void setCertificate(List<@Valid ResumeObjectsCertificate> certificate) {
    this.certificate = certificate;
  }

  public ResumeNullableFields driverLicenseTypes(List<@Valid ResumeObjectsDriverLicenseTypes> driverLicenseTypes) {
    this.driverLicenseTypes = driverLicenseTypes;
    return this;
  }

  public ResumeNullableFields addDriverLicenseTypesItem(ResumeObjectsDriverLicenseTypes driverLicenseTypesItem) {
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
  public List<@Valid ResumeObjectsDriverLicenseTypes> getDriverLicenseTypes() {
    return driverLicenseTypes;
  }

  public void setDriverLicenseTypes(List<@Valid ResumeObjectsDriverLicenseTypes> driverLicenseTypes) {
    this.driverLicenseTypes = driverLicenseTypes;
  }

  public ResumeNullableFields employmentForm(List<@Valid ResumeObjectsEmploymentFormEmploymentFormItem> employmentForm) {
    this.employmentForm = employmentForm;
    return this;
  }

  public ResumeNullableFields addEmploymentFormItem(ResumeObjectsEmploymentFormEmploymentFormItem employmentFormItem) {
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

  public ResumeNullableFields employments(List<@Valid IncludesIdName> employments) {
    this.employments = employments;
    return this;
  }

  public ResumeNullableFields addEmploymentsItem(IncludesIdName employmentsItem) {
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
  public List<@Valid IncludesIdName> getEmployments() {
    return employments;
  }

  public void setEmployments(List<@Valid IncludesIdName> employments) {
    this.employments = employments;
  }

  public ResumeNullableFields firstName(String firstName) {
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

  public ResumeNullableFields hasVehicle(Boolean hasVehicle) {
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

  public ResumeNullableFields hiddenFields(List<@Valid IncludesIdName> hiddenFields) {
    this.hiddenFields = hiddenFields;
    return this;
  }

  public ResumeNullableFields addHiddenFieldsItem(IncludesIdName hiddenFieldsItem) {
    if (this.hiddenFields == null) {
      this.hiddenFields = new ArrayList<>();
    }
    this.hiddenFields.add(hiddenFieldsItem);
    return this;
  }

  /**
   * Документация [Список скрытых полей](https://github.com/hhru/api/blob/master/docs/employer_resumes.md#hidden-fields). Возможные значения элементов приведены в поле `resume_hidden_fields` [справочника полей](#tag/Obshie-spravochniki/operation/get-dictionaries)
   * @return hiddenFields
  */
  @Valid 
  @Schema(name = "hidden_fields", description = "Документация [Список скрытых полей](https://github.com/hhru/api/blob/master/docs/employer_resumes.md#hidden-fields). Возможные значения элементов приведены в поле `resume_hidden_fields` [справочника полей](#tag/Obshie-spravochniki/operation/get-dictionaries)", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("hidden_fields")
  public List<@Valid IncludesIdName> getHiddenFields() {
    return hiddenFields;
  }

  public void setHiddenFields(List<@Valid IncludesIdName> hiddenFields) {
    this.hiddenFields = hiddenFields;
  }

  public ResumeNullableFields lastName(String lastName) {
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

  public ResumeNullableFields metro(IncludesId metro) {
    this.metro = metro;
    return this;
  }

  /**
   * Get metro
   * @return metro
  */
  @Valid 
  @Schema(name = "metro", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("metro")
  public IncludesId getMetro() {
    return metro;
  }

  public void setMetro(IncludesId metro) {
    this.metro = metro;
  }

  public ResumeNullableFields middleName(String middleName) {
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

  public ResumeNullableFields photo(ResumeObjectsPhoto photo) {
    this.photo = photo;
    return this;
  }

  /**
   * Get photo
   * @return photo
  */
  @Valid 
  @Schema(name = "photo", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("photo")
  public ResumeObjectsPhoto getPhoto() {
    return photo;
  }

  public void setPhoto(ResumeObjectsPhoto photo) {
    this.photo = photo;
  }

  public ResumeNullableFields portfolio(List<@Valid ResumeObjectsPortfolio> portfolio) {
    this.portfolio = portfolio;
    return this;
  }

  public ResumeNullableFields addPortfolioItem(ResumeObjectsPortfolio portfolioItem) {
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
  public List<@Valid ResumeObjectsPortfolio> getPortfolio() {
    return portfolio;
  }

  public void setPortfolio(List<@Valid ResumeObjectsPortfolio> portfolio) {
    this.portfolio = portfolio;
  }

  public ResumeNullableFields professionalRoles(List<@Valid IncludesId> professionalRoles) {
    this.professionalRoles = professionalRoles;
    return this;
  }

  public ResumeNullableFields addProfessionalRolesItem(IncludesId professionalRolesItem) {
    if (this.professionalRoles == null) {
      this.professionalRoles = new ArrayList<>();
    }
    this.professionalRoles.add(professionalRolesItem);
    return this;
  }

  /**
   * Массив объектов профролей. Элемент справочника [professional_roles](#tag/Obshie-spravochniki/operation/get-professional-roles-dictionary)
   * @return professionalRoles
  */
  @Valid 
  @Schema(name = "professional_roles", description = "Массив объектов профролей. Элемент справочника [professional_roles](#tag/Obshie-spravochniki/operation/get-professional-roles-dictionary)", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("professional_roles")
  public List<@Valid IncludesId> getProfessionalRoles() {
    return professionalRoles;
  }

  public void setProfessionalRoles(List<@Valid IncludesId> professionalRoles) {
    this.professionalRoles = professionalRoles;
  }

  public ResumeNullableFields recommendation(List<@Valid ResumeObjectsRecommendation> recommendation) {
    this.recommendation = recommendation;
    return this;
  }

  public ResumeNullableFields addRecommendationItem(ResumeObjectsRecommendation recommendationItem) {
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
  public List<@Valid ResumeObjectsRecommendation> getRecommendation() {
    return recommendation;
  }

  public void setRecommendation(List<@Valid ResumeObjectsRecommendation> recommendation) {
    this.recommendation = recommendation;
  }

  public ResumeNullableFields relocation(ResumeObjectsRelocationPublic relocation) {
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
  public ResumeObjectsRelocationPublic getRelocation() {
    return relocation;
  }

  public void setRelocation(ResumeObjectsRelocationPublic relocation) {
    this.relocation = relocation;
  }

  public ResumeNullableFields resumeLocale(IncludesIdName resumeLocale) {
    this.resumeLocale = resumeLocale;
    return this;
  }

  /**
   * Get resumeLocale
   * @return resumeLocale
  */
  @Valid 
  @Schema(name = "resume_locale", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("resume_locale")
  public IncludesIdName getResumeLocale() {
    return resumeLocale;
  }

  public void setResumeLocale(IncludesIdName resumeLocale) {
    this.resumeLocale = resumeLocale;
  }

  public ResumeNullableFields salary(ResumeObjectsSalaryAddEdit salary) {
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
  public ResumeObjectsSalaryAddEdit getSalary() {
    return salary;
  }

  public void setSalary(ResumeObjectsSalaryAddEdit salary) {
    this.salary = salary;
  }

  public ResumeNullableFields schedules(List<@Valid IncludesIdName> schedules) {
    this.schedules = schedules;
    return this;
  }

  public ResumeNullableFields addSchedulesItem(IncludesIdName schedulesItem) {
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
  public List<@Valid IncludesIdName> getSchedules() {
    return schedules;
  }

  public void setSchedules(List<@Valid IncludesIdName> schedules) {
    this.schedules = schedules;
  }

  public ResumeNullableFields site(List<@Valid ResumeObjectsSite> site) {
    this.site = site;
    return this;
  }

  public ResumeNullableFields addSiteItem(ResumeObjectsSite siteItem) {
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
  public List<@Valid ResumeObjectsSite> getSite() {
    return site;
  }

  public void setSite(List<@Valid ResumeObjectsSite> site) {
    this.site = site;
  }

  public ResumeNullableFields skillSet(List<String> skillSet) {
    this.skillSet = skillSet;
    return this;
  }

  public ResumeNullableFields addSkillSetItem(String skillSetItem) {
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

  public ResumeNullableFields skills(String skills) {
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

  public ResumeNullableFields title(String title) {
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

  public ResumeNullableFields totalExperience(ResumeObjectsTotalExperience totalExperience) {
    this.totalExperience = totalExperience;
    return this;
  }

  /**
   * Get totalExperience
   * @return totalExperience
  */
  @Valid 
  @Schema(name = "total_experience", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("total_experience")
  public ResumeObjectsTotalExperience getTotalExperience() {
    return totalExperience;
  }

  public void setTotalExperience(ResumeObjectsTotalExperience totalExperience) {
    this.totalExperience = totalExperience;
  }

  public ResumeNullableFields travelTime(IncludesId travelTime) {
    this.travelTime = travelTime;
    return this;
  }

  /**
   * Get travelTime
   * @return travelTime
  */
  @Valid 
  @Schema(name = "travel_time", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("travel_time")
  public IncludesId getTravelTime() {
    return travelTime;
  }

  public void setTravelTime(IncludesId travelTime) {
    this.travelTime = travelTime;
  }

  public ResumeNullableFields workFormat(List<@Valid ResumeObjectsWorkFormatWorkFormatItem> workFormat) {
    this.workFormat = workFormat;
    return this;
  }

  public ResumeNullableFields addWorkFormatItem(ResumeObjectsWorkFormatWorkFormatItem workFormatItem) {
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

  public ResumeNullableFields workTicket(List<@Valid IncludesId> workTicket) {
    this.workTicket = workTicket;
    return this;
  }

  public ResumeNullableFields addWorkTicketItem(IncludesId workTicketItem) {
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
    ResumeNullableFields resumeNullableFields = (ResumeNullableFields) o;
    return Objects.equals(this.access, resumeNullableFields.access) &&
        Objects.equals(this.birthDate, resumeNullableFields.birthDate) &&
        Objects.equals(this.businessTripReadiness, resumeNullableFields.businessTripReadiness) &&
        Objects.equals(this.certificate, resumeNullableFields.certificate) &&
        Objects.equals(this.driverLicenseTypes, resumeNullableFields.driverLicenseTypes) &&
        Objects.equals(this.employmentForm, resumeNullableFields.employmentForm) &&
        Objects.equals(this.employments, resumeNullableFields.employments) &&
        Objects.equals(this.firstName, resumeNullableFields.firstName) &&
        Objects.equals(this.hasVehicle, resumeNullableFields.hasVehicle) &&
        Objects.equals(this.hiddenFields, resumeNullableFields.hiddenFields) &&
        Objects.equals(this.lastName, resumeNullableFields.lastName) &&
        Objects.equals(this.metro, resumeNullableFields.metro) &&
        Objects.equals(this.middleName, resumeNullableFields.middleName) &&
        Objects.equals(this.photo, resumeNullableFields.photo) &&
        Objects.equals(this.portfolio, resumeNullableFields.portfolio) &&
        Objects.equals(this.professionalRoles, resumeNullableFields.professionalRoles) &&
        Objects.equals(this.recommendation, resumeNullableFields.recommendation) &&
        Objects.equals(this.relocation, resumeNullableFields.relocation) &&
        Objects.equals(this.resumeLocale, resumeNullableFields.resumeLocale) &&
        Objects.equals(this.salary, resumeNullableFields.salary) &&
        Objects.equals(this.schedules, resumeNullableFields.schedules) &&
        Objects.equals(this.site, resumeNullableFields.site) &&
        Objects.equals(this.skillSet, resumeNullableFields.skillSet) &&
        Objects.equals(this.skills, resumeNullableFields.skills) &&
        Objects.equals(this.title, resumeNullableFields.title) &&
        Objects.equals(this.totalExperience, resumeNullableFields.totalExperience) &&
        Objects.equals(this.travelTime, resumeNullableFields.travelTime) &&
        Objects.equals(this.workFormat, resumeNullableFields.workFormat) &&
        Objects.equals(this.workTicket, resumeNullableFields.workTicket);
  }

  @Override
  public int hashCode() {
    return Objects.hash(access, birthDate, businessTripReadiness, certificate, driverLicenseTypes, employmentForm, employments, firstName, hasVehicle, hiddenFields, lastName, metro, middleName, photo, portfolio, professionalRoles, recommendation, relocation, resumeLocale, salary, schedules, site, skillSet, skills, title, totalExperience, travelTime, workFormat, workTicket);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ResumeNullableFields {\n");
    sb.append("    access: ").append(toIndentedString(access)).append("\n");
    sb.append("    birthDate: ").append(toIndentedString(birthDate)).append("\n");
    sb.append("    businessTripReadiness: ").append(toIndentedString(businessTripReadiness)).append("\n");
    sb.append("    certificate: ").append(toIndentedString(certificate)).append("\n");
    sb.append("    driverLicenseTypes: ").append(toIndentedString(driverLicenseTypes)).append("\n");
    sb.append("    employmentForm: ").append(toIndentedString(employmentForm)).append("\n");
    sb.append("    employments: ").append(toIndentedString(employments)).append("\n");
    sb.append("    firstName: ").append(toIndentedString(firstName)).append("\n");
    sb.append("    hasVehicle: ").append(toIndentedString(hasVehicle)).append("\n");
    sb.append("    hiddenFields: ").append(toIndentedString(hiddenFields)).append("\n");
    sb.append("    lastName: ").append(toIndentedString(lastName)).append("\n");
    sb.append("    metro: ").append(toIndentedString(metro)).append("\n");
    sb.append("    middleName: ").append(toIndentedString(middleName)).append("\n");
    sb.append("    photo: ").append(toIndentedString(photo)).append("\n");
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
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
    sb.append("    totalExperience: ").append(toIndentedString(totalExperience)).append("\n");
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

