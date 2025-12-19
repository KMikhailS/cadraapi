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
 * VacanciesVacancyForManager
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2025-08-17T15:41:09.394389505+05:00[Asia/Yekaterinburg]", comments = "Generator version: 7.6.0")
public class VacanciesVacancyForManager {

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

  private VacancyVacancyProperties vacancyProperties;

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

  private VacanciesAddress address;

  private String archivedAt;

  private VacancyBrandedTemplate brandedTemplate = null;

  private Boolean canUpgradeBillingType;

  private VacancyCountersOutput counters;

  private String expiresAt;

  private Boolean hidden;

  private VacancyManager manager;

  private Boolean responseNotifications;

  private String previousId = null;

  public VacanciesVacancyForManager() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public VacanciesVacancyForManager(Boolean acceptHandicapped, Boolean acceptIncompleteResumes, Boolean acceptKids, Boolean allowMessages, String alternateUrl, String applyAlternateUrl, Boolean approved, Boolean archived, IncludesArea area, VacancyBillingTypeOutput billingType, String createdAt, String description, List<@Valid VacancyDriverLicenceTypeItem> driverLicenseTypes, VacancyExperienceOutput experience, Boolean hasTest, String id, String initialCreatedAt, List<@Valid VacancyKeySkillItem> keySkills, String name, Boolean premium, List<VacancyProfessionalRoleItemOutput> professionalRoles, String publishedAt, Boolean responseLetterRequired, VacancyScheduleOutput schedule, IncludesIdName type, VacanciesAddress address, VacancyBrandedTemplate brandedTemplate, Boolean canUpgradeBillingType, String expiresAt, Boolean hidden, VacancyManager manager, Boolean responseNotifications) {
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
    this.address = address;
    this.brandedTemplate = brandedTemplate;
    this.canUpgradeBillingType = canUpgradeBillingType;
    this.expiresAt = expiresAt;
    this.hidden = hidden;
    this.manager = manager;
    this.responseNotifications = responseNotifications;
  }

  public VacanciesVacancyForManager acceptHandicapped(Boolean acceptHandicapped) {
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

  public VacanciesVacancyForManager acceptIncompleteResumes(Boolean acceptIncompleteResumes) {
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

  public VacanciesVacancyForManager acceptKids(Boolean acceptKids) {
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

  public VacanciesVacancyForManager acceptTemporary(Boolean acceptTemporary) {
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

  public VacanciesVacancyForManager ageRestriction(VacancyAgeRestrictionOutput ageRestriction) {
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

  public VacanciesVacancyForManager allowMessages(Boolean allowMessages) {
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

  public VacanciesVacancyForManager alternateUrl(String alternateUrl) {
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

  public VacanciesVacancyForManager applyAlternateUrl(String applyAlternateUrl) {
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

  public VacanciesVacancyForManager approved(Boolean approved) {
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

  public VacanciesVacancyForManager archived(Boolean archived) {
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

  public VacanciesVacancyForManager area(IncludesArea area) {
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

  public VacanciesVacancyForManager billingType(VacancyBillingTypeOutput billingType) {
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

  public VacanciesVacancyForManager brandedDescription(String brandedDescription) {
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

  public VacanciesVacancyForManager closedForApplicants(Boolean closedForApplicants) {
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

  public VacanciesVacancyForManager code(String code) {
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

  public VacanciesVacancyForManager contacts(VacancyContactsOutput contacts) {
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

  public VacanciesVacancyForManager createdAt(String createdAt) {
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

  public VacanciesVacancyForManager department(VacancyDepartmentOutput department) {
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

  public VacanciesVacancyForManager description(String description) {
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

  public VacanciesVacancyForManager driverLicenseTypes(List<@Valid VacancyDriverLicenceTypeItem> driverLicenseTypes) {
    this.driverLicenseTypes = driverLicenseTypes;
    return this;
  }

  public VacanciesVacancyForManager addDriverLicenseTypesItem(VacancyDriverLicenceTypeItem driverLicenseTypesItem) {
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

  public VacanciesVacancyForManager employer(VacanciesVacancyEmployer employer) {
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

  public VacanciesVacancyForManager employment(VacancyEmploymentOutput employment) {
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

  public VacanciesVacancyForManager employmentForm(VacancyEmploymentFormOutput employmentForm) {
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

  public VacanciesVacancyForManager experience(VacancyExperienceOutput experience) {
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

  public VacanciesVacancyForManager flyInFlyOutDuration(List<@Valid VacancyFlyInFlyOutDurationFlyInFlyOutDurationItemOutput> flyInFlyOutDuration) {
    this.flyInFlyOutDuration = flyInFlyOutDuration;
    return this;
  }

  public VacanciesVacancyForManager addFlyInFlyOutDurationItem(VacancyFlyInFlyOutDurationFlyInFlyOutDurationItemOutput flyInFlyOutDurationItem) {
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

  public VacanciesVacancyForManager hasTest(Boolean hasTest) {
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

  public VacanciesVacancyForManager id(String id) {
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

  public VacanciesVacancyForManager initialCreatedAt(String initialCreatedAt) {
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

  public VacanciesVacancyForManager insiderInterview(VacancyInsiderInterview insiderInterview) {
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

  public VacanciesVacancyForManager internship(Boolean internship) {
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

  public VacanciesVacancyForManager keySkills(List<@Valid VacancyKeySkillItem> keySkills) {
    this.keySkills = keySkills;
    return this;
  }

  public VacanciesVacancyForManager addKeySkillsItem(VacancyKeySkillItem keySkillsItem) {
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

  public VacanciesVacancyForManager languages(List<VacancyLanguageOutput> languages) {
    this.languages = languages;
    return this;
  }

  public VacanciesVacancyForManager addLanguagesItem(VacancyLanguageOutput languagesItem) {
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

  public VacanciesVacancyForManager name(String name) {
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

  public VacanciesVacancyForManager negotiationsUrl(String negotiationsUrl) {
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

  public VacanciesVacancyForManager nightShifts(Boolean nightShifts) {
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

  public VacanciesVacancyForManager premium(Boolean premium) {
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

  public VacanciesVacancyForManager professionalRoles(List<VacancyProfessionalRoleItemOutput> professionalRoles) {
    this.professionalRoles = professionalRoles;
    return this;
  }

  public VacanciesVacancyForManager addProfessionalRolesItem(VacancyProfessionalRoleItemOutput professionalRolesItem) {
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

  public VacanciesVacancyForManager publishedAt(String publishedAt) {
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

  public VacanciesVacancyForManager relations(List<VacancyRelationItem> relations) {
    this.relations = relations;
    return this;
  }

  public VacanciesVacancyForManager addRelationsItem(VacancyRelationItem relationsItem) {
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

  public VacanciesVacancyForManager responseLetterRequired(Boolean responseLetterRequired) {
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

  public VacanciesVacancyForManager responseUrl(String responseUrl) {
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

  public VacanciesVacancyForManager salary(VacancySalary salary) {
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

  public VacanciesVacancyForManager salaryRange(VacancySalaryRangeSalaryRangeOutput salaryRange) {
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

  public VacanciesVacancyForManager schedule(VacancyScheduleOutput schedule) {
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

  public VacanciesVacancyForManager showContacts(Boolean showContacts) {
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

  public VacanciesVacancyForManager suitableResumesUrl(String suitableResumesUrl) {
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

  public VacanciesVacancyForManager test(VacancyDraftTest test) {
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

  public VacanciesVacancyForManager type(IncludesIdName type) {
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

  public VacanciesVacancyForManager vacancyConstructorTemplate(VacancyVacancyConstructorTemplate vacancyConstructorTemplate) {
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

  public VacanciesVacancyForManager vacancyProperties(VacancyVacancyProperties vacancyProperties) {
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
  public VacancyVacancyProperties getVacancyProperties() {
    return vacancyProperties;
  }

  public void setVacancyProperties(VacancyVacancyProperties vacancyProperties) {
    this.vacancyProperties = vacancyProperties;
  }

  public VacanciesVacancyForManager videoVacancy(VacancyVideoVacancyVideoVacancyItem videoVacancy) {
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

  public VacanciesVacancyForManager workFormat(List<@Valid VacancyWorkFormatWorkFormatItemOutput> workFormat) {
    this.workFormat = workFormat;
    return this;
  }

  public VacanciesVacancyForManager addWorkFormatItem(VacancyWorkFormatWorkFormatItemOutput workFormatItem) {
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

  public VacanciesVacancyForManager workScheduleByDays(List<@Valid VacancyWorkScheduleByDaysWorkScheduleByDaysItemOutput> workScheduleByDays) {
    this.workScheduleByDays = workScheduleByDays;
    return this;
  }

  public VacanciesVacancyForManager addWorkScheduleByDaysItem(VacancyWorkScheduleByDaysWorkScheduleByDaysItemOutput workScheduleByDaysItem) {
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

  public VacanciesVacancyForManager workingDays(List<@Valid VacancyWorkingDayItemOutput> workingDays) {
    this.workingDays = workingDays;
    return this;
  }

  public VacanciesVacancyForManager addWorkingDaysItem(VacancyWorkingDayItemOutput workingDaysItem) {
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

  public VacanciesVacancyForManager workingHours(List<@Valid VacancyWorkingHoursWorkingHoursItemOutput> workingHours) {
    this.workingHours = workingHours;
    return this;
  }

  public VacanciesVacancyForManager addWorkingHoursItem(VacancyWorkingHoursWorkingHoursItemOutput workingHoursItem) {
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

  public VacanciesVacancyForManager workingTimeIntervals(List<@Valid VacancyWorkingTimeIntervalItemOutput> workingTimeIntervals) {
    this.workingTimeIntervals = workingTimeIntervals;
    return this;
  }

  public VacanciesVacancyForManager addWorkingTimeIntervalsItem(VacancyWorkingTimeIntervalItemOutput workingTimeIntervalsItem) {
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

  public VacanciesVacancyForManager workingTimeModes(List<@Valid VacancyWorkingTimeModeItemOutput> workingTimeModes) {
    this.workingTimeModes = workingTimeModes;
    return this;
  }

  public VacanciesVacancyForManager addWorkingTimeModesItem(VacancyWorkingTimeModeItemOutput workingTimeModesItem) {
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

  public VacanciesVacancyForManager address(VacanciesAddress address) {
    this.address = address;
    return this;
  }

  /**
   * Get address
   * @return address
  */
  @NotNull @Valid 
  @Schema(name = "address", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("address")
  public VacanciesAddress getAddress() {
    return address;
  }

  public void setAddress(VacanciesAddress address) {
    this.address = address;
  }

  public VacanciesVacancyForManager archivedAt(String archivedAt) {
    this.archivedAt = archivedAt;
    return this;
  }

  /**
   * Дата архивации вакансии
   * @return archivedAt
  */
  
  @Schema(name = "archived_at", description = "Дата архивации вакансии", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("archived_at")
  public String getArchivedAt() {
    return archivedAt;
  }

  public void setArchivedAt(String archivedAt) {
    this.archivedAt = archivedAt;
  }

  public VacanciesVacancyForManager brandedTemplate(VacancyBrandedTemplate brandedTemplate) {
    this.brandedTemplate = brandedTemplate;
    return this;
  }

  /**
   * Get brandedTemplate
   * @return brandedTemplate
  */
  @NotNull @Valid 
  @Schema(name = "branded_template", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("branded_template")
  public VacancyBrandedTemplate getBrandedTemplate() {
    return brandedTemplate;
  }

  public void setBrandedTemplate(VacancyBrandedTemplate brandedTemplate) {
    this.brandedTemplate = brandedTemplate;
  }

  public VacanciesVacancyForManager canUpgradeBillingType(Boolean canUpgradeBillingType) {
    this.canUpgradeBillingType = canUpgradeBillingType;
    return this;
  }

  /**
   * Можно ли улучшить биллинговый тип вакансии
   * @return canUpgradeBillingType
  */
  @NotNull 
  @Schema(name = "can_upgrade_billing_type", description = "Можно ли улучшить биллинговый тип вакансии", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("can_upgrade_billing_type")
  public Boolean getCanUpgradeBillingType() {
    return canUpgradeBillingType;
  }

  public void setCanUpgradeBillingType(Boolean canUpgradeBillingType) {
    this.canUpgradeBillingType = canUpgradeBillingType;
  }

  public VacanciesVacancyForManager counters(VacancyCountersOutput counters) {
    this.counters = counters;
    return this;
  }

  /**
   * Get counters
   * @return counters
  */
  @Valid 
  @Schema(name = "counters", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("counters")
  public VacancyCountersOutput getCounters() {
    return counters;
  }

  public void setCounters(VacancyCountersOutput counters) {
    this.counters = counters;
  }

  public VacanciesVacancyForManager expiresAt(String expiresAt) {
    this.expiresAt = expiresAt;
    return this;
  }

  /**
   * Дата и время окончания публикации вакансии
   * @return expiresAt
  */
  @NotNull 
  @Schema(name = "expires_at", description = "Дата и время окончания публикации вакансии", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("expires_at")
  public String getExpiresAt() {
    return expiresAt;
  }

  public void setExpiresAt(String expiresAt) {
    this.expiresAt = expiresAt;
  }

  public VacanciesVacancyForManager hidden(Boolean hidden) {
    this.hidden = hidden;
    return this;
  }

  /**
   * Удалена ли вакансия (скрыта из архива)
   * @return hidden
  */
  @NotNull 
  @Schema(name = "hidden", description = "Удалена ли вакансия (скрыта из архива)", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("hidden")
  public Boolean getHidden() {
    return hidden;
  }

  public void setHidden(Boolean hidden) {
    this.hidden = hidden;
  }

  public VacanciesVacancyForManager manager(VacancyManager manager) {
    this.manager = manager;
    return this;
  }

  /**
   * Get manager
   * @return manager
  */
  @NotNull @Valid 
  @Schema(name = "manager", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("manager")
  public VacancyManager getManager() {
    return manager;
  }

  public void setManager(VacancyManager manager) {
    this.manager = manager;
  }

  public VacanciesVacancyForManager responseNotifications(Boolean responseNotifications) {
    this.responseNotifications = responseNotifications;
    return this;
  }

  /**
   * Уведомлять ли менеджера о новых откликах
   * @return responseNotifications
  */
  @NotNull 
  @Schema(name = "response_notifications", description = "Уведомлять ли менеджера о новых откликах", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("response_notifications")
  public Boolean getResponseNotifications() {
    return responseNotifications;
  }

  public void setResponseNotifications(Boolean responseNotifications) {
    this.responseNotifications = responseNotifications;
  }

  public VacanciesVacancyForManager previousId(String previousId) {
    this.previousId = previousId;
    return this;
  }

  /**
   * Идентификатор архивной вакансии, на основе которой была опубликована текущая вакансия. Если вакансия была создана самостоятельно - null
   * @return previousId
  */
  
  @Schema(name = "previous_id", description = "Идентификатор архивной вакансии, на основе которой была опубликована текущая вакансия. Если вакансия была создана самостоятельно - null", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("previous_id")
  public String getPreviousId() {
    return previousId;
  }

  public void setPreviousId(String previousId) {
    this.previousId = previousId;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    VacanciesVacancyForManager vacanciesVacancyForManager = (VacanciesVacancyForManager) o;
    return Objects.equals(this.acceptHandicapped, vacanciesVacancyForManager.acceptHandicapped) &&
        Objects.equals(this.acceptIncompleteResumes, vacanciesVacancyForManager.acceptIncompleteResumes) &&
        Objects.equals(this.acceptKids, vacanciesVacancyForManager.acceptKids) &&
        Objects.equals(this.acceptTemporary, vacanciesVacancyForManager.acceptTemporary) &&
        Objects.equals(this.ageRestriction, vacanciesVacancyForManager.ageRestriction) &&
        Objects.equals(this.allowMessages, vacanciesVacancyForManager.allowMessages) &&
        Objects.equals(this.alternateUrl, vacanciesVacancyForManager.alternateUrl) &&
        Objects.equals(this.applyAlternateUrl, vacanciesVacancyForManager.applyAlternateUrl) &&
        Objects.equals(this.approved, vacanciesVacancyForManager.approved) &&
        Objects.equals(this.archived, vacanciesVacancyForManager.archived) &&
        Objects.equals(this.area, vacanciesVacancyForManager.area) &&
        Objects.equals(this.billingType, vacanciesVacancyForManager.billingType) &&
        Objects.equals(this.brandedDescription, vacanciesVacancyForManager.brandedDescription) &&
        Objects.equals(this.closedForApplicants, vacanciesVacancyForManager.closedForApplicants) &&
        Objects.equals(this.code, vacanciesVacancyForManager.code) &&
        Objects.equals(this.contacts, vacanciesVacancyForManager.contacts) &&
        Objects.equals(this.createdAt, vacanciesVacancyForManager.createdAt) &&
        Objects.equals(this.department, vacanciesVacancyForManager.department) &&
        Objects.equals(this.description, vacanciesVacancyForManager.description) &&
        Objects.equals(this.driverLicenseTypes, vacanciesVacancyForManager.driverLicenseTypes) &&
        Objects.equals(this.employer, vacanciesVacancyForManager.employer) &&
        Objects.equals(this.employment, vacanciesVacancyForManager.employment) &&
        Objects.equals(this.employmentForm, vacanciesVacancyForManager.employmentForm) &&
        Objects.equals(this.experience, vacanciesVacancyForManager.experience) &&
        Objects.equals(this.flyInFlyOutDuration, vacanciesVacancyForManager.flyInFlyOutDuration) &&
        Objects.equals(this.hasTest, vacanciesVacancyForManager.hasTest) &&
        Objects.equals(this.id, vacanciesVacancyForManager.id) &&
        Objects.equals(this.initialCreatedAt, vacanciesVacancyForManager.initialCreatedAt) &&
        Objects.equals(this.insiderInterview, vacanciesVacancyForManager.insiderInterview) &&
        Objects.equals(this.internship, vacanciesVacancyForManager.internship) &&
        Objects.equals(this.keySkills, vacanciesVacancyForManager.keySkills) &&
        Objects.equals(this.languages, vacanciesVacancyForManager.languages) &&
        Objects.equals(this.name, vacanciesVacancyForManager.name) &&
        Objects.equals(this.negotiationsUrl, vacanciesVacancyForManager.negotiationsUrl) &&
        Objects.equals(this.nightShifts, vacanciesVacancyForManager.nightShifts) &&
        Objects.equals(this.premium, vacanciesVacancyForManager.premium) &&
        Objects.equals(this.professionalRoles, vacanciesVacancyForManager.professionalRoles) &&
        Objects.equals(this.publishedAt, vacanciesVacancyForManager.publishedAt) &&
        Objects.equals(this.relations, vacanciesVacancyForManager.relations) &&
        Objects.equals(this.responseLetterRequired, vacanciesVacancyForManager.responseLetterRequired) &&
        Objects.equals(this.responseUrl, vacanciesVacancyForManager.responseUrl) &&
        Objects.equals(this.salary, vacanciesVacancyForManager.salary) &&
        Objects.equals(this.salaryRange, vacanciesVacancyForManager.salaryRange) &&
        Objects.equals(this.schedule, vacanciesVacancyForManager.schedule) &&
        Objects.equals(this.showContacts, vacanciesVacancyForManager.showContacts) &&
        Objects.equals(this.suitableResumesUrl, vacanciesVacancyForManager.suitableResumesUrl) &&
        Objects.equals(this.test, vacanciesVacancyForManager.test) &&
        Objects.equals(this.type, vacanciesVacancyForManager.type) &&
        Objects.equals(this.vacancyConstructorTemplate, vacanciesVacancyForManager.vacancyConstructorTemplate) &&
        Objects.equals(this.vacancyProperties, vacanciesVacancyForManager.vacancyProperties) &&
        Objects.equals(this.videoVacancy, vacanciesVacancyForManager.videoVacancy) &&
        Objects.equals(this.workFormat, vacanciesVacancyForManager.workFormat) &&
        Objects.equals(this.workScheduleByDays, vacanciesVacancyForManager.workScheduleByDays) &&
        Objects.equals(this.workingDays, vacanciesVacancyForManager.workingDays) &&
        Objects.equals(this.workingHours, vacanciesVacancyForManager.workingHours) &&
        Objects.equals(this.workingTimeIntervals, vacanciesVacancyForManager.workingTimeIntervals) &&
        Objects.equals(this.workingTimeModes, vacanciesVacancyForManager.workingTimeModes) &&
        Objects.equals(this.address, vacanciesVacancyForManager.address) &&
        Objects.equals(this.archivedAt, vacanciesVacancyForManager.archivedAt) &&
        Objects.equals(this.brandedTemplate, vacanciesVacancyForManager.brandedTemplate) &&
        Objects.equals(this.canUpgradeBillingType, vacanciesVacancyForManager.canUpgradeBillingType) &&
        Objects.equals(this.counters, vacanciesVacancyForManager.counters) &&
        Objects.equals(this.expiresAt, vacanciesVacancyForManager.expiresAt) &&
        Objects.equals(this.hidden, vacanciesVacancyForManager.hidden) &&
        Objects.equals(this.manager, vacanciesVacancyForManager.manager) &&
        Objects.equals(this.responseNotifications, vacanciesVacancyForManager.responseNotifications) &&
        Objects.equals(this.previousId, vacanciesVacancyForManager.previousId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(acceptHandicapped, acceptIncompleteResumes, acceptKids, acceptTemporary, ageRestriction, allowMessages, alternateUrl, applyAlternateUrl, approved, archived, area, billingType, brandedDescription, closedForApplicants, code, contacts, createdAt, department, description, driverLicenseTypes, employer, employment, employmentForm, experience, flyInFlyOutDuration, hasTest, id, initialCreatedAt, insiderInterview, internship, keySkills, languages, name, negotiationsUrl, nightShifts, premium, professionalRoles, publishedAt, relations, responseLetterRequired, responseUrl, salary, salaryRange, schedule, showContacts, suitableResumesUrl, test, type, vacancyConstructorTemplate, vacancyProperties, videoVacancy, workFormat, workScheduleByDays, workingDays, workingHours, workingTimeIntervals, workingTimeModes, address, archivedAt, brandedTemplate, canUpgradeBillingType, counters, expiresAt, hidden, manager, responseNotifications, previousId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class VacanciesVacancyForManager {\n");
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
    sb.append("    address: ").append(toIndentedString(address)).append("\n");
    sb.append("    archivedAt: ").append(toIndentedString(archivedAt)).append("\n");
    sb.append("    brandedTemplate: ").append(toIndentedString(brandedTemplate)).append("\n");
    sb.append("    canUpgradeBillingType: ").append(toIndentedString(canUpgradeBillingType)).append("\n");
    sb.append("    counters: ").append(toIndentedString(counters)).append("\n");
    sb.append("    expiresAt: ").append(toIndentedString(expiresAt)).append("\n");
    sb.append("    hidden: ").append(toIndentedString(hidden)).append("\n");
    sb.append("    manager: ").append(toIndentedString(manager)).append("\n");
    sb.append("    responseNotifications: ").append(toIndentedString(responseNotifications)).append("\n");
    sb.append("    previousId: ").append(toIndentedString(previousId)).append("\n");
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

