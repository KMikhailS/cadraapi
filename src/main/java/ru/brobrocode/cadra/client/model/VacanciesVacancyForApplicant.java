package ru.brobrocode.cadra.client.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.annotation.Generated;
import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * VacanciesVacancyForApplicant
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2025-08-17T15:41:09.394389505+05:00[Asia/Yekaterinburg]", comments = "Generator version: 7.6.0")
public class VacanciesVacancyForApplicant {

  private Boolean acceptHandicapped;

  private Boolean acceptIncompleteResumes;

  @Deprecated
  private Boolean acceptKids;

  private Boolean acceptTemporary = null;

  private VacancyAgeRestrictionOutput ageRestriction = null;

  private Boolean allowMessages;

  private String alternateUrl;

  private String applyAlternateUrl;

  private Boolean approved;

  private Boolean archived;

  private IncludesArea area;

  private VacancyBillingTypeOutput billingType = null;

  private String brandedDescription;

  private Boolean closedForApplicants = null;

  private String code = null;

  private VacancyContactsOutput contacts = null;

  @Deprecated
  private String createdAt;

  private VacancyDepartmentOutput department = null;

  private String description;

  @Valid
  private List<@Valid VacancyDriverLicenceTypeItem> driverLicenseTypes = new ArrayList<>();

  private VacanciesVacancyEmployer employer = null;

  @Deprecated
  private VacancyEmploymentOutput employment = null;

  private VacancyEmploymentFormOutput employmentForm = null;

  private VacancyExperienceOutput experience = null;

  @Valid
  private List<@Valid VacancyFlyInFlyOutDurationFlyInFlyOutDurationItemOutput> flyInFlyOutDuration;

  private Boolean hasTest;

  private String id;

  private String initialCreatedAt;

  private VacancyInsiderInterview insiderInterview = null;

  private Boolean internship = null;

  @Valid
  private List<@Valid VacancyKeySkillItem> keySkills = new ArrayList<>();

  @Valid
  private List<VacancyLanguageOutput> languages = new ArrayList<>();

  private String name;

  private String negotiationsUrl = null;

  private Boolean nightShifts = null;

  private Boolean premium;

  @Valid
  private List<VacancyProfessionalRoleItemOutput> professionalRoles = new ArrayList<>();

  private String publishedAt;

  @Valid
  private List<VacancyRelationItem> relations = new ArrayList<>();

  private Boolean responseLetterRequired;

  private String responseUrl = null;

  @Deprecated
  private VacancySalary salary = null;

  private VacancySalaryRangeSalaryRangeOutput salaryRange = null;

  @Deprecated
  private VacancyScheduleOutput schedule;

  private Boolean showContacts = null;

  private String suitableResumesUrl = null;

  private VacancyDraftTest test = null;

  private IncludesIdName type;

  private VacancyVacancyConstructorTemplate vacancyConstructorTemplate = null;

  private VacancyPublicationVacancyProperties vacancyProperties = null;

  private VacancyVideoVacancyVideoVacancyItem videoVacancy = null;

  @Valid
  private List<@Valid VacancyWorkFormatWorkFormatItemOutput> workFormat;

  @Valid
  private List<@Valid VacancyWorkScheduleByDaysWorkScheduleByDaysItemOutput> workScheduleByDays;

  @Deprecated
  @Valid
  private List<@Valid VacancyWorkingDayItemOutput> workingDays;

  @Valid
  private List<@Valid VacancyWorkingHoursWorkingHoursItemOutput> workingHours;

  @Deprecated
  @Valid
  private List<@Valid VacancyWorkingTimeIntervalItemOutput> workingTimeIntervals;

  @Deprecated
  @Valid
  private List<@Valid VacancyWorkingTimeModeItemOutput> workingTimeModes;

  @Deprecated
  private Boolean hidden;

  private VacancyAddressOutput address = null;

  public VacanciesVacancyForApplicant() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public VacanciesVacancyForApplicant(Boolean acceptHandicapped, Boolean acceptIncompleteResumes, Boolean acceptKids, Boolean allowMessages, String alternateUrl, String applyAlternateUrl, Boolean approved, Boolean archived, IncludesArea area, VacancyBillingTypeOutput billingType, String createdAt, String description, List<@Valid VacancyDriverLicenceTypeItem> driverLicenseTypes, VacancyExperienceOutput experience, Boolean hasTest, String id, String initialCreatedAt, List<@Valid VacancyKeySkillItem> keySkills, String name, Boolean premium, List<VacancyProfessionalRoleItemOutput> professionalRoles, String publishedAt, Boolean responseLetterRequired, VacancyScheduleOutput schedule, IncludesIdName type) {
    this.acceptHandicapped = acceptHandicapped;
    this.acceptIncompleteResumes = acceptIncompleteResumes;
    this.acceptKids = acceptKids;
    this.allowMessages = allowMessages;
    this.alternateUrl = alternateUrl;
    this.applyAlternateUrl = applyAlternateUrl;
    this.approved = approved;
    this.archived = archived;
    this.area = area;
    this.billingType = billingType;
    this.createdAt = createdAt;
    this.description = description;
    this.driverLicenseTypes = driverLicenseTypes;
    this.experience = experience;
    this.hasTest = hasTest;
    this.id = id;
    this.initialCreatedAt = initialCreatedAt;
    this.keySkills = keySkills;
    this.name = name;
    this.premium = premium;
    this.professionalRoles = professionalRoles;
    this.publishedAt = publishedAt;
    this.responseLetterRequired = responseLetterRequired;
    this.schedule = schedule;
    this.type = type;
  }

  public VacanciesVacancyForApplicant acceptHandicapped(Boolean acceptHandicapped) {
    this.acceptHandicapped = acceptHandicapped;
    return this;
  }

  /**
   * Указание, что вакансия доступна для соискателей с инвалидностью
   * @return acceptHandicapped
  */
  @NotNull 
  @Schema(name = "accept_handicapped", description = "Указание, что вакансия доступна для соискателей с инвалидностью", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("accept_handicapped")
  public Boolean getAcceptHandicapped() {
    return acceptHandicapped;
  }

  public void setAcceptHandicapped(Boolean acceptHandicapped) {
    this.acceptHandicapped = acceptHandicapped;
  }

  public VacanciesVacancyForApplicant acceptIncompleteResumes(Boolean acceptIncompleteResumes) {
    this.acceptIncompleteResumes = acceptIncompleteResumes;
    return this;
  }

  /**
   * Разрешен ли отклик на вакансию неполным резюме
   * @return acceptIncompleteResumes
  */
  @NotNull 
  @Schema(name = "accept_incomplete_resumes", description = "Разрешен ли отклик на вакансию неполным резюме", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("accept_incomplete_resumes")
  public Boolean getAcceptIncompleteResumes() {
    return acceptIncompleteResumes;
  }

  public void setAcceptIncompleteResumes(Boolean acceptIncompleteResumes) {
    this.acceptIncompleteResumes = acceptIncompleteResumes;
  }

  public VacanciesVacancyForApplicant acceptKids(Boolean acceptKids) {
    this.acceptKids = acceptKids;
    return this;
  }

  /**
   * Depreceted. Для вакансии с возрастными ограничениями используйте поле **age_restriction**  Указание, что вакансия доступна для соискателей старше 14 лет [подробнее](https://github.com/hhru/api/blob/master/docs/employer_vacancies_accept_kids.md#accept-kids) 
   * @return acceptKids
   * @deprecated
  */
  @NotNull 
  @Schema(name = "accept_kids", description = "Depreceted. Для вакансии с возрастными ограничениями используйте поле **age_restriction**  Указание, что вакансия доступна для соискателей старше 14 лет [подробнее](https://github.com/hhru/api/blob/master/docs/employer_vacancies_accept_kids.md#accept-kids) ", deprecated = true, requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("accept_kids")
  @Deprecated
  public Boolean getAcceptKids() {
    return acceptKids;
  }

  /**
   * @deprecated
  */
  @Deprecated
  public void setAcceptKids(Boolean acceptKids) {
    this.acceptKids = acceptKids;
  }

  public VacanciesVacancyForApplicant acceptTemporary(Boolean acceptTemporary) {
    this.acceptTemporary = acceptTemporary;
    return this;
  }

  /**
   * Указание, что вакансия доступна с временным трудоустройством
   * @return acceptTemporary
  */
  
  @Schema(name = "accept_temporary", description = "Указание, что вакансия доступна с временным трудоустройством", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("accept_temporary")
  public Boolean getAcceptTemporary() {
    return acceptTemporary;
  }

  public void setAcceptTemporary(Boolean acceptTemporary) {
    this.acceptTemporary = acceptTemporary;
  }

  public VacanciesVacancyForApplicant ageRestriction(VacancyAgeRestrictionOutput ageRestriction) {
    this.ageRestriction = ageRestriction;
    return this;
  }

  /**
   * Get ageRestriction
   * @return ageRestriction
  */
  @Valid 
  @Schema(name = "age_restriction", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("age_restriction")
  public VacancyAgeRestrictionOutput getAgeRestriction() {
    return ageRestriction;
  }

  public void setAgeRestriction(VacancyAgeRestrictionOutput ageRestriction) {
    this.ageRestriction = ageRestriction;
  }

  public VacanciesVacancyForApplicant allowMessages(Boolean allowMessages) {
    this.allowMessages = allowMessages;
    return this;
  }

  /**
   * Возможность [переписки с кандидатами](https://hh.ru/article/inboxemp) по данной вакансии
   * @return allowMessages
  */
  @NotNull 
  @Schema(name = "allow_messages", description = "Возможность [переписки с кандидатами](https://hh.ru/article/inboxemp) по данной вакансии", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("allow_messages")
  public Boolean getAllowMessages() {
    return allowMessages;
  }

  public void setAllowMessages(Boolean allowMessages) {
    this.allowMessages = allowMessages;
  }

  public VacanciesVacancyForApplicant alternateUrl(String alternateUrl) {
    this.alternateUrl = alternateUrl;
    return this;
  }

  /**
   * Ссылка на представление вакансии на сайте
   * @return alternateUrl
  */
  @NotNull 
  @Schema(name = "alternate_url", description = "Ссылка на представление вакансии на сайте", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("alternate_url")
  public String getAlternateUrl() {
    return alternateUrl;
  }

  public void setAlternateUrl(String alternateUrl) {
    this.alternateUrl = alternateUrl;
  }

  public VacanciesVacancyForApplicant applyAlternateUrl(String applyAlternateUrl) {
    this.applyAlternateUrl = applyAlternateUrl;
    return this;
  }

  /**
   * Ссылка на отклик на вакансию на сайте
   * @return applyAlternateUrl
  */
  @NotNull 
  @Schema(name = "apply_alternate_url", description = "Ссылка на отклик на вакансию на сайте", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("apply_alternate_url")
  public String getApplyAlternateUrl() {
    return applyAlternateUrl;
  }

  public void setApplyAlternateUrl(String applyAlternateUrl) {
    this.applyAlternateUrl = applyAlternateUrl;
  }

  public VacanciesVacancyForApplicant approved(Boolean approved) {
    this.approved = approved;
    return this;
  }

  /**
   * Прошла ли вакансия модерацию
   * @return approved
  */
  @NotNull 
  @Schema(name = "approved", description = "Прошла ли вакансия модерацию", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("approved")
  public Boolean getApproved() {
    return approved;
  }

  public void setApproved(Boolean approved) {
    this.approved = approved;
  }

  public VacanciesVacancyForApplicant archived(Boolean archived) {
    this.archived = archived;
    return this;
  }

  /**
   * Находится ли данная вакансия в архиве
   * @return archived
  */
  @NotNull 
  @Schema(name = "archived", description = "Находится ли данная вакансия в архиве", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("archived")
  public Boolean getArchived() {
    return archived;
  }

  public void setArchived(Boolean archived) {
    this.archived = archived;
  }

  public VacanciesVacancyForApplicant area(IncludesArea area) {
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
  public IncludesArea getArea() {
    return area;
  }

  public void setArea(IncludesArea area) {
    this.area = area;
  }

  public VacanciesVacancyForApplicant billingType(VacancyBillingTypeOutput billingType) {
    this.billingType = billingType;
    return this;
  }

  /**
   * Get billingType
   * @return billingType
  */
  @NotNull @Valid 
  @Schema(name = "billing_type", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("billing_type")
  public VacancyBillingTypeOutput getBillingType() {
    return billingType;
  }

  public void setBillingType(VacancyBillingTypeOutput billingType) {
    this.billingType = billingType;
  }

  public VacanciesVacancyForApplicant brandedDescription(String brandedDescription) {
    this.brandedDescription = brandedDescription;
    return this;
  }

  /**
   * Строка с кодом HTML (возможно наличие `<script/>` и `<style/>`), которая является альтернативой стандартному описанию вакансии.  HTML адаптирован для мобильных устройств и корректно отображается без поддержки JavaScript. При этом:  * Содержимое растягивается на 100% ширины контейнера и умещается в 300px без прокрутки. * Содержимое рассчитано на то, что оно будет вставлено в обвязку, в которую входит название, требуемый опыт работы, регион, тип занятости и рабочего дня вакансии, а также ссылка на компанию, опубликовавшую вакансию. * Изображения, которые могут встретиться в таком описании, адаптированы под Retina-дисплеи. * Размер шрифта не меньше 12px, размер межстрочного интервала не меньше 16px.  Значение может быть `null`, если у вакансии отсутствует индивидуальное описание
   * @return brandedDescription
  */
  
  @Schema(name = "branded_description", description = "Строка с кодом HTML (возможно наличие `<script/>` и `<style/>`), которая является альтернативой стандартному описанию вакансии.  HTML адаптирован для мобильных устройств и корректно отображается без поддержки JavaScript. При этом:  * Содержимое растягивается на 100% ширины контейнера и умещается в 300px без прокрутки. * Содержимое рассчитано на то, что оно будет вставлено в обвязку, в которую входит название, требуемый опыт работы, регион, тип занятости и рабочего дня вакансии, а также ссылка на компанию, опубликовавшую вакансию. * Изображения, которые могут встретиться в таком описании, адаптированы под Retina-дисплеи. * Размер шрифта не меньше 12px, размер межстрочного интервала не меньше 16px.  Значение может быть `null`, если у вакансии отсутствует индивидуальное описание", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("branded_description")
  public String getBrandedDescription() {
    return brandedDescription;
  }

  public void setBrandedDescription(String brandedDescription) {
    this.brandedDescription = brandedDescription;
  }

  public VacanciesVacancyForApplicant closedForApplicants(Boolean closedForApplicants) {
    this.closedForApplicants = closedForApplicants;
    return this;
  }

  /**
   * Закрытая или открытая вакансия
   * @return closedForApplicants
  */
  
  @Schema(name = "closed_for_applicants", description = "Закрытая или открытая вакансия", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("closed_for_applicants")
  public Boolean getClosedForApplicants() {
    return closedForApplicants;
  }

  public void setClosedForApplicants(Boolean closedForApplicants) {
    this.closedForApplicants = closedForApplicants;
  }

  public VacanciesVacancyForApplicant code(String code) {
    this.code = code;
    return this;
  }

  /**
   * Внутренний код вакансии
   * @return code
  */
  
  @Schema(name = "code", description = "Внутренний код вакансии", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("code")
  public String getCode() {
    return code;
  }

  public void setCode(String code) {
    this.code = code;
  }

  public VacanciesVacancyForApplicant contacts(VacancyContactsOutput contacts) {
    this.contacts = contacts;
    return this;
  }

  /**
   * Get contacts
   * @return contacts
  */
  @Valid 
  @Schema(name = "contacts", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("contacts")
  public VacancyContactsOutput getContacts() {
    return contacts;
  }

  public void setContacts(VacancyContactsOutput contacts) {
    this.contacts = contacts;
  }

  public VacanciesVacancyForApplicant createdAt(String createdAt) {
    this.createdAt = createdAt;
    return this;
  }

  /**
   * Дата и время публикации вакансии
   * @return createdAt
   * @deprecated
  */
  @NotNull 
  @Schema(name = "created_at", description = "Дата и время публикации вакансии", deprecated = true, requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("created_at")
  @Deprecated
  public String getCreatedAt() {
    return createdAt;
  }

  /**
   * @deprecated
  */
  @Deprecated
  public void setCreatedAt(String createdAt) {
    this.createdAt = createdAt;
  }

  public VacanciesVacancyForApplicant department(VacancyDepartmentOutput department) {
    this.department = department;
    return this;
  }

  /**
   * Get department
   * @return department
  */
  @Valid 
  @Schema(name = "department", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("department")
  public VacancyDepartmentOutput getDepartment() {
    return department;
  }

  public void setDepartment(VacancyDepartmentOutput department) {
    this.department = department;
  }

  public VacanciesVacancyForApplicant description(String description) {
    this.description = description;
    return this;
  }

  /**
   * Описание в html, не менее 200 символов
   * @return description
  */
  @NotNull 
  @Schema(name = "description", description = "Описание в html, не менее 200 символов", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("description")
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public VacanciesVacancyForApplicant driverLicenseTypes(List<@Valid VacancyDriverLicenceTypeItem> driverLicenseTypes) {
    this.driverLicenseTypes = driverLicenseTypes;
    return this;
  }

  public VacanciesVacancyForApplicant addDriverLicenseTypesItem(VacancyDriverLicenceTypeItem driverLicenseTypesItem) {
    if (this.driverLicenseTypes == null) {
      this.driverLicenseTypes = new ArrayList<>();
    }
    this.driverLicenseTypes.add(driverLicenseTypesItem);
    return this;
  }

  /**
   * Список требуемых категорий водительских прав
   * @return driverLicenseTypes
  */
  @NotNull @Valid 
  @Schema(name = "driver_license_types", description = "Список требуемых категорий водительских прав", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("driver_license_types")
  public List<@Valid VacancyDriverLicenceTypeItem> getDriverLicenseTypes() {
    return driverLicenseTypes;
  }

  public void setDriverLicenseTypes(List<@Valid VacancyDriverLicenceTypeItem> driverLicenseTypes) {
    this.driverLicenseTypes = driverLicenseTypes;
  }

  public VacanciesVacancyForApplicant employer(VacanciesVacancyEmployer employer) {
    this.employer = employer;
    return this;
  }

  /**
   * Get employer
   * @return employer
  */
  @Valid 
  @Schema(name = "employer", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("employer")
  public VacanciesVacancyEmployer getEmployer() {
    return employer;
  }

  public void setEmployer(VacanciesVacancyEmployer employer) {
    this.employer = employer;
  }

  public VacanciesVacancyForApplicant employment(VacancyEmploymentOutput employment) {
    this.employment = employment;
    return this;
  }

  /**
   * Get employment
   * @return employment
   * @deprecated
  */
  @Valid 
  @Schema(name = "employment", deprecated = true, requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("employment")
  @Deprecated
  public VacancyEmploymentOutput getEmployment() {
    return employment;
  }

  /**
   * @deprecated
  */
  @Deprecated
  public void setEmployment(VacancyEmploymentOutput employment) {
    this.employment = employment;
  }

  public VacanciesVacancyForApplicant employmentForm(VacancyEmploymentFormOutput employmentForm) {
    this.employmentForm = employmentForm;
    return this;
  }

  /**
   * Get employmentForm
   * @return employmentForm
  */
  @Valid 
  @Schema(name = "employment_form", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("employment_form")
  public VacancyEmploymentFormOutput getEmploymentForm() {
    return employmentForm;
  }

  public void setEmploymentForm(VacancyEmploymentFormOutput employmentForm) {
    this.employmentForm = employmentForm;
  }

  public VacanciesVacancyForApplicant experience(VacancyExperienceOutput experience) {
    this.experience = experience;
    return this;
  }

  /**
   * Get experience
   * @return experience
  */
  @NotNull @Valid 
  @Schema(name = "experience", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("experience")
  public VacancyExperienceOutput getExperience() {
    return experience;
  }

  public void setExperience(VacancyExperienceOutput experience) {
    this.experience = experience;
  }

  public VacanciesVacancyForApplicant flyInFlyOutDuration(List<@Valid VacancyFlyInFlyOutDurationFlyInFlyOutDurationItemOutput> flyInFlyOutDuration) {
    this.flyInFlyOutDuration = flyInFlyOutDuration;
    return this;
  }

  public VacanciesVacancyForApplicant addFlyInFlyOutDurationItem(VacancyFlyInFlyOutDurationFlyInFlyOutDurationItemOutput flyInFlyOutDurationItem) {
    if (this.flyInFlyOutDuration == null) {
      this.flyInFlyOutDuration = new ArrayList<>();
    }
    this.flyInFlyOutDuration.add(flyInFlyOutDurationItem);
    return this;
  }

  /**
   * Варианты длительности вахты
   * @return flyInFlyOutDuration
  */
  @Valid 
  @Schema(name = "fly_in_fly_out_duration", description = "Варианты длительности вахты", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("fly_in_fly_out_duration")
  public List<@Valid VacancyFlyInFlyOutDurationFlyInFlyOutDurationItemOutput> getFlyInFlyOutDuration() {
    return flyInFlyOutDuration;
  }

  public void setFlyInFlyOutDuration(List<@Valid VacancyFlyInFlyOutDurationFlyInFlyOutDurationItemOutput> flyInFlyOutDuration) {
    this.flyInFlyOutDuration = flyInFlyOutDuration;
  }

  public VacanciesVacancyForApplicant hasTest(Boolean hasTest) {
    this.hasTest = hasTest;
    return this;
  }

  /**
   * Информация о наличии прикрепленного тестового задании к вакансии
   * @return hasTest
  */
  @NotNull 
  @Schema(name = "has_test", description = "Информация о наличии прикрепленного тестового задании к вакансии", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("has_test")
  public Boolean getHasTest() {
    return hasTest;
  }

  public void setHasTest(Boolean hasTest) {
    this.hasTest = hasTest;
  }

  public VacanciesVacancyForApplicant id(String id) {
    this.id = id;
    return this;
  }

  /**
   * Идентификатор вакансии
   * @return id
  */
  @NotNull 
  @Schema(name = "id", description = "Идентификатор вакансии", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("id")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public VacanciesVacancyForApplicant initialCreatedAt(String initialCreatedAt) {
    this.initialCreatedAt = initialCreatedAt;
    return this;
  }

  /**
   * Дата и время создания вакансии
   * @return initialCreatedAt
  */
  @NotNull 
  @Schema(name = "initial_created_at", description = "Дата и время создания вакансии", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("initial_created_at")
  public String getInitialCreatedAt() {
    return initialCreatedAt;
  }

  public void setInitialCreatedAt(String initialCreatedAt) {
    this.initialCreatedAt = initialCreatedAt;
  }

  public VacanciesVacancyForApplicant insiderInterview(VacancyInsiderInterview insiderInterview) {
    this.insiderInterview = insiderInterview;
    return this;
  }

  /**
   * Get insiderInterview
   * @return insiderInterview
  */
  @Valid 
  @Schema(name = "insider_interview", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("insider_interview")
  public VacancyInsiderInterview getInsiderInterview() {
    return insiderInterview;
  }

  public void setInsiderInterview(VacancyInsiderInterview insiderInterview) {
    this.insiderInterview = insiderInterview;
  }

  public VacanciesVacancyForApplicant internship(Boolean internship) {
    this.internship = internship;
    return this;
  }

  /**
   * Стажировка
   * @return internship
  */
  
  @Schema(name = "internship", description = "Стажировка", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("internship")
  public Boolean getInternship() {
    return internship;
  }

  public void setInternship(Boolean internship) {
    this.internship = internship;
  }

  public VacanciesVacancyForApplicant keySkills(List<@Valid VacancyKeySkillItem> keySkills) {
    this.keySkills = keySkills;
    return this;
  }

  public VacanciesVacancyForApplicant addKeySkillsItem(VacancyKeySkillItem keySkillsItem) {
    if (this.keySkills == null) {
      this.keySkills = new ArrayList<>();
    }
    this.keySkills.add(keySkillsItem);
    return this;
  }

  /**
   * Список ключевых навыков, не более 30
   * @return keySkills
  */
  @NotNull @Valid 
  @Schema(name = "key_skills", description = "Список ключевых навыков, не более 30", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("key_skills")
  public List<@Valid VacancyKeySkillItem> getKeySkills() {
    return keySkills;
  }

  public void setKeySkills(List<@Valid VacancyKeySkillItem> keySkills) {
    this.keySkills = keySkills;
  }

  public VacanciesVacancyForApplicant languages(List<VacancyLanguageOutput> languages) {
    this.languages = languages;
    return this;
  }

  public VacanciesVacancyForApplicant addLanguagesItem(VacancyLanguageOutput languagesItem) {
    if (this.languages == null) {
      this.languages = new ArrayList<>();
    }
    this.languages.add(languagesItem);
    return this;
  }

  /**
   * Список языков вакансии. Значения из справочника [/languages](#tag/Obshie-spravochniki/operation/get-dictionaries)
   * @return languages
  */
  @Valid 
  @Schema(name = "languages", description = "Список языков вакансии. Значения из справочника [/languages](#tag/Obshie-spravochniki/operation/get-dictionaries)", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("languages")
  public List<VacancyLanguageOutput> getLanguages() {
    return languages;
  }

  public void setLanguages(List<VacancyLanguageOutput> languages) {
    this.languages = languages;
  }

  public VacanciesVacancyForApplicant name(String name) {
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

  public VacanciesVacancyForApplicant negotiationsUrl(String negotiationsUrl) {
    this.negotiationsUrl = negotiationsUrl;
    return this;
  }

  /**
   * Ссылка для получения списка откликов/приглашений
   * @return negotiationsUrl
  */
  
  @Schema(name = "negotiations_url", description = "Ссылка для получения списка откликов/приглашений", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("negotiations_url")
  public String getNegotiationsUrl() {
    return negotiationsUrl;
  }

  public void setNegotiationsUrl(String negotiationsUrl) {
    this.negotiationsUrl = negotiationsUrl;
  }

  public VacanciesVacancyForApplicant nightShifts(Boolean nightShifts) {
    this.nightShifts = nightShifts;
    return this;
  }

  /**
   * Ночные смены
   * @return nightShifts
  */
  
  @Schema(name = "night_shifts", description = "Ночные смены", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("night_shifts")
  public Boolean getNightShifts() {
    return nightShifts;
  }

  public void setNightShifts(Boolean nightShifts) {
    this.nightShifts = nightShifts;
  }

  public VacanciesVacancyForApplicant premium(Boolean premium) {
    this.premium = premium;
    return this;
  }

  /**
   * Является ли данная вакансия премиум-вакансией
   * @return premium
  */
  @NotNull 
  @Schema(name = "premium", description = "Является ли данная вакансия премиум-вакансией", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("premium")
  public Boolean getPremium() {
    return premium;
  }

  public void setPremium(Boolean premium) {
    this.premium = premium;
  }

  public VacanciesVacancyForApplicant professionalRoles(List<VacancyProfessionalRoleItemOutput> professionalRoles) {
    this.professionalRoles = professionalRoles;
    return this;
  }

  public VacanciesVacancyForApplicant addProfessionalRolesItem(VacancyProfessionalRoleItemOutput professionalRolesItem) {
    if (this.professionalRoles == null) {
      this.professionalRoles = new ArrayList<>();
    }
    this.professionalRoles.add(professionalRolesItem);
    return this;
  }

  /**
   * Список профессиональных ролей
   * @return professionalRoles
  */
  @NotNull @Valid 
  @Schema(name = "professional_roles", description = "Список профессиональных ролей", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("professional_roles")
  public List<VacancyProfessionalRoleItemOutput> getProfessionalRoles() {
    return professionalRoles;
  }

  public void setProfessionalRoles(List<VacancyProfessionalRoleItemOutput> professionalRoles) {
    this.professionalRoles = professionalRoles;
  }

  public VacanciesVacancyForApplicant publishedAt(String publishedAt) {
    this.publishedAt = publishedAt;
    return this;
  }

  /**
   * Дата и время публикации вакансии
   * @return publishedAt
  */
  @NotNull 
  @Schema(name = "published_at", description = "Дата и время публикации вакансии", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("published_at")
  public String getPublishedAt() {
    return publishedAt;
  }

  public void setPublishedAt(String publishedAt) {
    this.publishedAt = publishedAt;
  }

  public VacanciesVacancyForApplicant relations(List<VacancyRelationItem> relations) {
    this.relations = relations;
    return this;
  }

  public VacanciesVacancyForApplicant addRelationsItem(VacancyRelationItem relationsItem) {
    if (this.relations == null) {
      this.relations = new ArrayList<>();
    }
    this.relations.add(relationsItem);
    return this;
  }

  /**
   * Возвращает связи соискателя с вакансией. Значения из поля `vacancy_relation` в [справочнике полей](#tag/Obshie-spravochniki/operation/get-dictionaries)
   * @return relations
  */
  @Valid 
  @Schema(name = "relations", description = "Возвращает связи соискателя с вакансией. Значения из поля `vacancy_relation` в [справочнике полей](#tag/Obshie-spravochniki/operation/get-dictionaries)", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("relations")
  public List<VacancyRelationItem> getRelations() {
    return relations;
  }

  public void setRelations(List<VacancyRelationItem> relations) {
    this.relations = relations;
  }

  public VacanciesVacancyForApplicant responseLetterRequired(Boolean responseLetterRequired) {
    this.responseLetterRequired = responseLetterRequired;
    return this;
  }

  /**
   * Обязательно ли заполнять сообщение при отклике на вакансию
   * @return responseLetterRequired
  */
  @NotNull 
  @Schema(name = "response_letter_required", description = "Обязательно ли заполнять сообщение при отклике на вакансию", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("response_letter_required")
  public Boolean getResponseLetterRequired() {
    return responseLetterRequired;
  }

  public void setResponseLetterRequired(Boolean responseLetterRequired) {
    this.responseLetterRequired = responseLetterRequired;
  }

  public VacanciesVacancyForApplicant responseUrl(String responseUrl) {
    this.responseUrl = responseUrl;
    return this;
  }

  /**
   * URL отклика для прямых вакансий (`type.id=direct`)
   * @return responseUrl
  */
  
  @Schema(name = "response_url", description = "URL отклика для прямых вакансий (`type.id=direct`)", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("response_url")
  public String getResponseUrl() {
    return responseUrl;
  }

  public void setResponseUrl(String responseUrl) {
    this.responseUrl = responseUrl;
  }

  public VacanciesVacancyForApplicant salary(VacancySalary salary) {
    this.salary = salary;
    return this;
  }

  /**
   * Get salary
   * @return salary
   * @deprecated
  */
  @Valid 
  @Schema(name = "salary", deprecated = true, requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("salary")
  @Deprecated
  public VacancySalary getSalary() {
    return salary;
  }

  /**
   * @deprecated
  */
  @Deprecated
  public void setSalary(VacancySalary salary) {
    this.salary = salary;
  }

  public VacanciesVacancyForApplicant salaryRange(VacancySalaryRangeSalaryRangeOutput salaryRange) {
    this.salaryRange = salaryRange;
    return this;
  }

  /**
   * Get salaryRange
   * @return salaryRange
  */
  @Valid 
  @Schema(name = "salary_range", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("salary_range")
  public VacancySalaryRangeSalaryRangeOutput getSalaryRange() {
    return salaryRange;
  }

  public void setSalaryRange(VacancySalaryRangeSalaryRangeOutput salaryRange) {
    this.salaryRange = salaryRange;
  }

  public VacanciesVacancyForApplicant schedule(VacancyScheduleOutput schedule) {
    this.schedule = schedule;
    return this;
  }

  /**
   * Get schedule
   * @return schedule
   * @deprecated
  */
  @NotNull @Valid 
  @Schema(name = "schedule", deprecated = true, requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("schedule")
  @Deprecated
  public VacancyScheduleOutput getSchedule() {
    return schedule;
  }

  /**
   * @deprecated
  */
  @Deprecated
  public void setSchedule(VacancyScheduleOutput schedule) {
    this.schedule = schedule;
  }

  public VacanciesVacancyForApplicant showContacts(Boolean showContacts) {
    this.showContacts = showContacts;
    return this;
  }

  /**
   * Доступны ли контакты в вакансии
   * @return showContacts
  */
  
  @Schema(name = "show_contacts", description = "Доступны ли контакты в вакансии", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("show_contacts")
  public Boolean getShowContacts() {
    return showContacts;
  }

  public void setShowContacts(Boolean showContacts) {
    this.showContacts = showContacts;
  }

  public VacanciesVacancyForApplicant suitableResumesUrl(String suitableResumesUrl) {
    this.suitableResumesUrl = suitableResumesUrl;
    return this;
  }

  /**
   * Подходящие резюме на вакансию
   * @return suitableResumesUrl
  */
  
  @Schema(name = "suitable_resumes_url", description = "Подходящие резюме на вакансию", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("suitable_resumes_url")
  public String getSuitableResumesUrl() {
    return suitableResumesUrl;
  }

  public void setSuitableResumesUrl(String suitableResumesUrl) {
    this.suitableResumesUrl = suitableResumesUrl;
  }

  public VacanciesVacancyForApplicant test(VacancyDraftTest test) {
    this.test = test;
    return this;
  }

  /**
   * Get test
   * @return test
  */
  @Valid 
  @Schema(name = "test", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("test")
  public VacancyDraftTest getTest() {
    return test;
  }

  public void setTest(VacancyDraftTest test) {
    this.test = test;
  }

  public VacanciesVacancyForApplicant type(IncludesIdName type) {
    this.type = type;
    return this;
  }

  /**
   * Идентификатор типа вакансии из справочника [`vacancy_type`](https://api.hh.ru/openapi/redoc#tag/Obshie-spravochniki/operation/get-dictionaries)
   * @return type
  */
  @NotNull @Valid 
  @Schema(name = "type", description = "Идентификатор типа вакансии из справочника [`vacancy_type`](https://api.hh.ru/openapi/redoc#tag/Obshie-spravochniki/operation/get-dictionaries)", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("type")
  public IncludesIdName getType() {
    return type;
  }

  public void setType(IncludesIdName type) {
    this.type = type;
  }

  public VacanciesVacancyForApplicant vacancyConstructorTemplate(VacancyVacancyConstructorTemplate vacancyConstructorTemplate) {
    this.vacancyConstructorTemplate = vacancyConstructorTemplate;
    return this;
  }

  /**
   * Get vacancyConstructorTemplate
   * @return vacancyConstructorTemplate
  */
  @Valid 
  @Schema(name = "vacancy_constructor_template", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("vacancy_constructor_template")
  public VacancyVacancyConstructorTemplate getVacancyConstructorTemplate() {
    return vacancyConstructorTemplate;
  }

  public void setVacancyConstructorTemplate(VacancyVacancyConstructorTemplate vacancyConstructorTemplate) {
    this.vacancyConstructorTemplate = vacancyConstructorTemplate;
  }

  public VacanciesVacancyForApplicant vacancyProperties(VacancyPublicationVacancyProperties vacancyProperties) {
    this.vacancyProperties = vacancyProperties;
    return this;
  }

  /**
   * Get vacancyProperties
   * @return vacancyProperties
  */
  @Valid 
  @Schema(name = "vacancy_properties", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("vacancy_properties")
  public VacancyPublicationVacancyProperties getVacancyProperties() {
    return vacancyProperties;
  }

  public void setVacancyProperties(VacancyPublicationVacancyProperties vacancyProperties) {
    this.vacancyProperties = vacancyProperties;
  }

  public VacanciesVacancyForApplicant videoVacancy(VacancyVideoVacancyVideoVacancyItem videoVacancy) {
    this.videoVacancy = videoVacancy;
    return this;
  }

  /**
   * Get videoVacancy
   * @return videoVacancy
  */
  @Valid 
  @Schema(name = "video_vacancy", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("video_vacancy")
  public VacancyVideoVacancyVideoVacancyItem getVideoVacancy() {
    return videoVacancy;
  }

  public void setVideoVacancy(VacancyVideoVacancyVideoVacancyItem videoVacancy) {
    this.videoVacancy = videoVacancy;
  }

  public VacanciesVacancyForApplicant workFormat(List<@Valid VacancyWorkFormatWorkFormatItemOutput> workFormat) {
    this.workFormat = workFormat;
    return this;
  }

  public VacanciesVacancyForApplicant addWorkFormatItem(VacancyWorkFormatWorkFormatItemOutput workFormatItem) {
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
  public List<@Valid VacancyWorkFormatWorkFormatItemOutput> getWorkFormat() {
    return workFormat;
  }

  public void setWorkFormat(List<@Valid VacancyWorkFormatWorkFormatItemOutput> workFormat) {
    this.workFormat = workFormat;
  }

  public VacanciesVacancyForApplicant workScheduleByDays(List<@Valid VacancyWorkScheduleByDaysWorkScheduleByDaysItemOutput> workScheduleByDays) {
    this.workScheduleByDays = workScheduleByDays;
    return this;
  }

  public VacanciesVacancyForApplicant addWorkScheduleByDaysItem(VacancyWorkScheduleByDaysWorkScheduleByDaysItemOutput workScheduleByDaysItem) {
    if (this.workScheduleByDays == null) {
      this.workScheduleByDays = new ArrayList<>();
    }
    this.workScheduleByDays.add(workScheduleByDaysItem);
    return this;
  }

  /**
   * Список графиков работы
   * @return workScheduleByDays
  */
  @Valid 
  @Schema(name = "work_schedule_by_days", description = "Список графиков работы", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("work_schedule_by_days")
  public List<@Valid VacancyWorkScheduleByDaysWorkScheduleByDaysItemOutput> getWorkScheduleByDays() {
    return workScheduleByDays;
  }

  public void setWorkScheduleByDays(List<@Valid VacancyWorkScheduleByDaysWorkScheduleByDaysItemOutput> workScheduleByDays) {
    this.workScheduleByDays = workScheduleByDays;
  }

  public VacanciesVacancyForApplicant workingDays(List<@Valid VacancyWorkingDayItemOutput> workingDays) {
    this.workingDays = workingDays;
    return this;
  }

  public VacanciesVacancyForApplicant addWorkingDaysItem(VacancyWorkingDayItemOutput workingDaysItem) {
    if (this.workingDays == null) {
      this.workingDays = new ArrayList<>();
    }
    this.workingDays.add(workingDaysItem);
    return this;
  }

  /**
   * Список рабочих дней
   * @return workingDays
   * @deprecated
  */
  @Valid 
  @Schema(name = "working_days", description = "Список рабочих дней", deprecated = true, requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("working_days")
  @Deprecated
  public List<@Valid VacancyWorkingDayItemOutput> getWorkingDays() {
    return workingDays;
  }

  /**
   * @deprecated
  */
  @Deprecated
  public void setWorkingDays(List<@Valid VacancyWorkingDayItemOutput> workingDays) {
    this.workingDays = workingDays;
  }

  public VacanciesVacancyForApplicant workingHours(List<@Valid VacancyWorkingHoursWorkingHoursItemOutput> workingHours) {
    this.workingHours = workingHours;
    return this;
  }

  public VacanciesVacancyForApplicant addWorkingHoursItem(VacancyWorkingHoursWorkingHoursItemOutput workingHoursItem) {
    if (this.workingHours == null) {
      this.workingHours = new ArrayList<>();
    }
    this.workingHours.add(workingHoursItem);
    return this;
  }

  /**
   * Список вариантов рабочих часов в день
   * @return workingHours
  */
  @Valid 
  @Schema(name = "working_hours", description = "Список вариантов рабочих часов в день", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("working_hours")
  public List<@Valid VacancyWorkingHoursWorkingHoursItemOutput> getWorkingHours() {
    return workingHours;
  }

  public void setWorkingHours(List<@Valid VacancyWorkingHoursWorkingHoursItemOutput> workingHours) {
    this.workingHours = workingHours;
  }

  public VacanciesVacancyForApplicant workingTimeIntervals(List<@Valid VacancyWorkingTimeIntervalItemOutput> workingTimeIntervals) {
    this.workingTimeIntervals = workingTimeIntervals;
    return this;
  }

  public VacanciesVacancyForApplicant addWorkingTimeIntervalsItem(VacancyWorkingTimeIntervalItemOutput workingTimeIntervalsItem) {
    if (this.workingTimeIntervals == null) {
      this.workingTimeIntervals = new ArrayList<>();
    }
    this.workingTimeIntervals.add(workingTimeIntervalsItem);
    return this;
  }

  /**
   * Список с временными интервалами работы
   * @return workingTimeIntervals
   * @deprecated
  */
  @Valid 
  @Schema(name = "working_time_intervals", description = "Список с временными интервалами работы", deprecated = true, requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("working_time_intervals")
  @Deprecated
  public List<@Valid VacancyWorkingTimeIntervalItemOutput> getWorkingTimeIntervals() {
    return workingTimeIntervals;
  }

  /**
   * @deprecated
  */
  @Deprecated
  public void setWorkingTimeIntervals(List<@Valid VacancyWorkingTimeIntervalItemOutput> workingTimeIntervals) {
    this.workingTimeIntervals = workingTimeIntervals;
  }

  public VacanciesVacancyForApplicant workingTimeModes(List<@Valid VacancyWorkingTimeModeItemOutput> workingTimeModes) {
    this.workingTimeModes = workingTimeModes;
    return this;
  }

  public VacanciesVacancyForApplicant addWorkingTimeModesItem(VacancyWorkingTimeModeItemOutput workingTimeModesItem) {
    if (this.workingTimeModes == null) {
      this.workingTimeModes = new ArrayList<>();
    }
    this.workingTimeModes.add(workingTimeModesItem);
    return this;
  }

  /**
   * Список режимов времени работы
   * @return workingTimeModes
   * @deprecated
  */
  @Valid 
  @Schema(name = "working_time_modes", description = "Список режимов времени работы", deprecated = true, requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("working_time_modes")
  @Deprecated
  public List<@Valid VacancyWorkingTimeModeItemOutput> getWorkingTimeModes() {
    return workingTimeModes;
  }

  /**
   * @deprecated
  */
  @Deprecated
  public void setWorkingTimeModes(List<@Valid VacancyWorkingTimeModeItemOutput> workingTimeModes) {
    this.workingTimeModes = workingTimeModes;
  }

  public VacanciesVacancyForApplicant hidden(Boolean hidden) {
    this.hidden = hidden;
    return this;
  }

  /**
   * Удалена ли вакансия (скрыта из архива). Оставлено для обеспечения обратной совместимости
   * @return hidden
   * @deprecated
  */
  
  @Schema(name = "hidden", description = "Удалена ли вакансия (скрыта из архива). Оставлено для обеспечения обратной совместимости", deprecated = true, requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("hidden")
  @Deprecated
  public Boolean getHidden() {
    return hidden;
  }

  /**
   * @deprecated
  */
  @Deprecated
  public void setHidden(Boolean hidden) {
    this.hidden = hidden;
  }

  public VacanciesVacancyForApplicant address(VacancyAddressOutput address) {
    this.address = address;
    return this;
  }

  /**
   * Get address
   * @return address
  */
  @Valid 
  @Schema(name = "address", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("address")
  public VacancyAddressOutput getAddress() {
    return address;
  }

  public void setAddress(VacancyAddressOutput address) {
    this.address = address;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    VacanciesVacancyForApplicant vacanciesVacancyForApplicant = (VacanciesVacancyForApplicant) o;
    return Objects.equals(this.acceptHandicapped, vacanciesVacancyForApplicant.acceptHandicapped) &&
        Objects.equals(this.acceptIncompleteResumes, vacanciesVacancyForApplicant.acceptIncompleteResumes) &&
        Objects.equals(this.acceptKids, vacanciesVacancyForApplicant.acceptKids) &&
        Objects.equals(this.acceptTemporary, vacanciesVacancyForApplicant.acceptTemporary) &&
        Objects.equals(this.ageRestriction, vacanciesVacancyForApplicant.ageRestriction) &&
        Objects.equals(this.allowMessages, vacanciesVacancyForApplicant.allowMessages) &&
        Objects.equals(this.alternateUrl, vacanciesVacancyForApplicant.alternateUrl) &&
        Objects.equals(this.applyAlternateUrl, vacanciesVacancyForApplicant.applyAlternateUrl) &&
        Objects.equals(this.approved, vacanciesVacancyForApplicant.approved) &&
        Objects.equals(this.archived, vacanciesVacancyForApplicant.archived) &&
        Objects.equals(this.area, vacanciesVacancyForApplicant.area) &&
        Objects.equals(this.billingType, vacanciesVacancyForApplicant.billingType) &&
        Objects.equals(this.brandedDescription, vacanciesVacancyForApplicant.brandedDescription) &&
        Objects.equals(this.closedForApplicants, vacanciesVacancyForApplicant.closedForApplicants) &&
        Objects.equals(this.code, vacanciesVacancyForApplicant.code) &&
        Objects.equals(this.contacts, vacanciesVacancyForApplicant.contacts) &&
        Objects.equals(this.createdAt, vacanciesVacancyForApplicant.createdAt) &&
        Objects.equals(this.department, vacanciesVacancyForApplicant.department) &&
        Objects.equals(this.description, vacanciesVacancyForApplicant.description) &&
        Objects.equals(this.driverLicenseTypes, vacanciesVacancyForApplicant.driverLicenseTypes) &&
        Objects.equals(this.employer, vacanciesVacancyForApplicant.employer) &&
        Objects.equals(this.employment, vacanciesVacancyForApplicant.employment) &&
        Objects.equals(this.employmentForm, vacanciesVacancyForApplicant.employmentForm) &&
        Objects.equals(this.experience, vacanciesVacancyForApplicant.experience) &&
        Objects.equals(this.flyInFlyOutDuration, vacanciesVacancyForApplicant.flyInFlyOutDuration) &&
        Objects.equals(this.hasTest, vacanciesVacancyForApplicant.hasTest) &&
        Objects.equals(this.id, vacanciesVacancyForApplicant.id) &&
        Objects.equals(this.initialCreatedAt, vacanciesVacancyForApplicant.initialCreatedAt) &&
        Objects.equals(this.insiderInterview, vacanciesVacancyForApplicant.insiderInterview) &&
        Objects.equals(this.internship, vacanciesVacancyForApplicant.internship) &&
        Objects.equals(this.keySkills, vacanciesVacancyForApplicant.keySkills) &&
        Objects.equals(this.languages, vacanciesVacancyForApplicant.languages) &&
        Objects.equals(this.name, vacanciesVacancyForApplicant.name) &&
        Objects.equals(this.negotiationsUrl, vacanciesVacancyForApplicant.negotiationsUrl) &&
        Objects.equals(this.nightShifts, vacanciesVacancyForApplicant.nightShifts) &&
        Objects.equals(this.premium, vacanciesVacancyForApplicant.premium) &&
        Objects.equals(this.professionalRoles, vacanciesVacancyForApplicant.professionalRoles) &&
        Objects.equals(this.publishedAt, vacanciesVacancyForApplicant.publishedAt) &&
        Objects.equals(this.relations, vacanciesVacancyForApplicant.relations) &&
        Objects.equals(this.responseLetterRequired, vacanciesVacancyForApplicant.responseLetterRequired) &&
        Objects.equals(this.responseUrl, vacanciesVacancyForApplicant.responseUrl) &&
        Objects.equals(this.salary, vacanciesVacancyForApplicant.salary) &&
        Objects.equals(this.salaryRange, vacanciesVacancyForApplicant.salaryRange) &&
        Objects.equals(this.schedule, vacanciesVacancyForApplicant.schedule) &&
        Objects.equals(this.showContacts, vacanciesVacancyForApplicant.showContacts) &&
        Objects.equals(this.suitableResumesUrl, vacanciesVacancyForApplicant.suitableResumesUrl) &&
        Objects.equals(this.test, vacanciesVacancyForApplicant.test) &&
        Objects.equals(this.type, vacanciesVacancyForApplicant.type) &&
        Objects.equals(this.vacancyConstructorTemplate, vacanciesVacancyForApplicant.vacancyConstructorTemplate) &&
        Objects.equals(this.vacancyProperties, vacanciesVacancyForApplicant.vacancyProperties) &&
        Objects.equals(this.videoVacancy, vacanciesVacancyForApplicant.videoVacancy) &&
        Objects.equals(this.workFormat, vacanciesVacancyForApplicant.workFormat) &&
        Objects.equals(this.workScheduleByDays, vacanciesVacancyForApplicant.workScheduleByDays) &&
        Objects.equals(this.workingDays, vacanciesVacancyForApplicant.workingDays) &&
        Objects.equals(this.workingHours, vacanciesVacancyForApplicant.workingHours) &&
        Objects.equals(this.workingTimeIntervals, vacanciesVacancyForApplicant.workingTimeIntervals) &&
        Objects.equals(this.workingTimeModes, vacanciesVacancyForApplicant.workingTimeModes) &&
        Objects.equals(this.hidden, vacanciesVacancyForApplicant.hidden) &&
        Objects.equals(this.address, vacanciesVacancyForApplicant.address);
  }

  @Override
  public int hashCode() {
    return Objects.hash(acceptHandicapped, acceptIncompleteResumes, acceptKids, acceptTemporary, ageRestriction, allowMessages, alternateUrl, applyAlternateUrl, approved, archived, area, billingType, brandedDescription, closedForApplicants, code, contacts, createdAt, department, description, driverLicenseTypes, employer, employment, employmentForm, experience, flyInFlyOutDuration, hasTest, id, initialCreatedAt, insiderInterview, internship, keySkills, languages, name, negotiationsUrl, nightShifts, premium, professionalRoles, publishedAt, relations, responseLetterRequired, responseUrl, salary, salaryRange, schedule, showContacts, suitableResumesUrl, test, type, vacancyConstructorTemplate, vacancyProperties, videoVacancy, workFormat, workScheduleByDays, workingDays, workingHours, workingTimeIntervals, workingTimeModes, hidden, address);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class VacanciesVacancyForApplicant {\n");
    sb.append("    acceptHandicapped: ").append(toIndentedString(acceptHandicapped)).append("\n");
    sb.append("    acceptIncompleteResumes: ").append(toIndentedString(acceptIncompleteResumes)).append("\n");
    sb.append("    acceptKids: ").append(toIndentedString(acceptKids)).append("\n");
    sb.append("    acceptTemporary: ").append(toIndentedString(acceptTemporary)).append("\n");
    sb.append("    ageRestriction: ").append(toIndentedString(ageRestriction)).append("\n");
    sb.append("    allowMessages: ").append(toIndentedString(allowMessages)).append("\n");
    sb.append("    alternateUrl: ").append(toIndentedString(alternateUrl)).append("\n");
    sb.append("    applyAlternateUrl: ").append(toIndentedString(applyAlternateUrl)).append("\n");
    sb.append("    approved: ").append(toIndentedString(approved)).append("\n");
    sb.append("    archived: ").append(toIndentedString(archived)).append("\n");
    sb.append("    area: ").append(toIndentedString(area)).append("\n");
    sb.append("    billingType: ").append(toIndentedString(billingType)).append("\n");
    sb.append("    brandedDescription: ").append(toIndentedString(brandedDescription)).append("\n");
    sb.append("    closedForApplicants: ").append(toIndentedString(closedForApplicants)).append("\n");
    sb.append("    code: ").append(toIndentedString(code)).append("\n");
    sb.append("    contacts: ").append(toIndentedString(contacts)).append("\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    department: ").append(toIndentedString(department)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    driverLicenseTypes: ").append(toIndentedString(driverLicenseTypes)).append("\n");
    sb.append("    employer: ").append(toIndentedString(employer)).append("\n");
    sb.append("    employment: ").append(toIndentedString(employment)).append("\n");
    sb.append("    employmentForm: ").append(toIndentedString(employmentForm)).append("\n");
    sb.append("    experience: ").append(toIndentedString(experience)).append("\n");
    sb.append("    flyInFlyOutDuration: ").append(toIndentedString(flyInFlyOutDuration)).append("\n");
    sb.append("    hasTest: ").append(toIndentedString(hasTest)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    initialCreatedAt: ").append(toIndentedString(initialCreatedAt)).append("\n");
    sb.append("    insiderInterview: ").append(toIndentedString(insiderInterview)).append("\n");
    sb.append("    internship: ").append(toIndentedString(internship)).append("\n");
    sb.append("    keySkills: ").append(toIndentedString(keySkills)).append("\n");
    sb.append("    languages: ").append(toIndentedString(languages)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    negotiationsUrl: ").append(toIndentedString(negotiationsUrl)).append("\n");
    sb.append("    nightShifts: ").append(toIndentedString(nightShifts)).append("\n");
    sb.append("    premium: ").append(toIndentedString(premium)).append("\n");
    sb.append("    professionalRoles: ").append(toIndentedString(professionalRoles)).append("\n");
    sb.append("    publishedAt: ").append(toIndentedString(publishedAt)).append("\n");
    sb.append("    relations: ").append(toIndentedString(relations)).append("\n");
    sb.append("    responseLetterRequired: ").append(toIndentedString(responseLetterRequired)).append("\n");
    sb.append("    responseUrl: ").append(toIndentedString(responseUrl)).append("\n");
    sb.append("    salary: ").append(toIndentedString(salary)).append("\n");
    sb.append("    salaryRange: ").append(toIndentedString(salaryRange)).append("\n");
    sb.append("    schedule: ").append(toIndentedString(schedule)).append("\n");
    sb.append("    showContacts: ").append(toIndentedString(showContacts)).append("\n");
    sb.append("    suitableResumesUrl: ").append(toIndentedString(suitableResumesUrl)).append("\n");
    sb.append("    test: ").append(toIndentedString(test)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    vacancyConstructorTemplate: ").append(toIndentedString(vacancyConstructorTemplate)).append("\n");
    sb.append("    vacancyProperties: ").append(toIndentedString(vacancyProperties)).append("\n");
    sb.append("    videoVacancy: ").append(toIndentedString(videoVacancy)).append("\n");
    sb.append("    workFormat: ").append(toIndentedString(workFormat)).append("\n");
    sb.append("    workScheduleByDays: ").append(toIndentedString(workScheduleByDays)).append("\n");
    sb.append("    workingDays: ").append(toIndentedString(workingDays)).append("\n");
    sb.append("    workingHours: ").append(toIndentedString(workingHours)).append("\n");
    sb.append("    workingTimeIntervals: ").append(toIndentedString(workingTimeIntervals)).append("\n");
    sb.append("    workingTimeModes: ").append(toIndentedString(workingTimeModes)).append("\n");
    sb.append("    hidden: ").append(toIndentedString(hidden)).append("\n");
    sb.append("    address: ").append(toIndentedString(address)).append("\n");
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

