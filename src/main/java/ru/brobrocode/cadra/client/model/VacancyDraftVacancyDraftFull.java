package ru.brobrocode.cadra.client.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.annotation.Generated;
import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * VacancyDraftVacancyDraftFull
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2025-08-17T15:41:09.394389505+05:00[Asia/Yekaterinburg]", comments = "Generator version: 7.6.0")
public class VacancyDraftVacancyDraftFull {

  private Boolean acceptHandicapped;

  private Boolean acceptIncompleteResumes;

  @Deprecated
  private Boolean acceptKids;

  private Boolean acceptTemporary = null;

  private VacancyAgeRestrictionOutput ageRestriction = null;

  private Boolean allowMessages;

  private VacancyBillingTypeOutput billingType = null;

  private String code = null;

  private VacancyDepartmentOutput department = null;

  private String description;

  @Valid
  private List<@Valid VacancyDriverLicenceTypeItem> driverLicenseTypes = new ArrayList<>();

  @Deprecated
  private VacancyEmploymentOutput employment = null;

  private VacancyEmploymentFormOutput employmentForm = null;

  private VacancyExperienceOutput experience = null;

  @Valid
  private List<@Valid VacancyFlyInFlyOutDurationFlyInFlyOutDurationItemOutput> flyInFlyOutDuration;

  private Boolean hasTest;

  private Boolean internship = null;

  @Valid
  private List<@Valid VacancyKeySkillItem> keySkills = new ArrayList<>();

  @Valid
  private List<VacancyLanguageOutput> languages = new ArrayList<>();

  private VacancyManager manager;

  private String name;

  private Boolean nightShifts = null;

  @Valid
  private List<VacancyProfessionalRoleItemOutput> professionalRoles = new ArrayList<>();

  private Boolean responseLetterRequired;

  private Boolean responseNotifications;

  private String responseUrl = null;

  @Deprecated
  private VacancySalary salary = null;

  private VacancySalaryRangeSalaryRangeOutput salaryRange = null;

  @Deprecated
  private VacancyScheduleOutput schedule;

  private VacancyDraftTest test = null;

  private VacancyTypeOutput type;

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

  private VacancyDraftAddressOutput address;

  @Valid
  private List<@Valid VacancyAreaOutput> areas = new ArrayList<>();

  private VacancyDraftAssignedManager assignedManager = null;

  private VacancyBrandedTemplate brandedTemplate = null;

  private Boolean closedForApplicants = null;

  private VacancyDraftContactsWithFullPhone contacts;

  private String customEmployerName = null;

  private VacancyDraftEmployer employer;

  private VacancyDraftVacancyDraftBase metaInfo;

  private VacancyDraftVacancyProperties vacancyProperties = null;

  private Boolean withZp;

  public VacancyDraftVacancyDraftFull() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public VacancyDraftVacancyDraftFull(Boolean acceptHandicapped, Boolean acceptIncompleteResumes, Boolean acceptKids, Boolean allowMessages, VacancyBillingTypeOutput billingType, String description, List<@Valid VacancyDriverLicenceTypeItem> driverLicenseTypes, VacancyExperienceOutput experience, Boolean hasTest, List<@Valid VacancyKeySkillItem> keySkills, List<VacancyLanguageOutput> languages, VacancyManager manager, String name, List<VacancyProfessionalRoleItemOutput> professionalRoles, Boolean responseLetterRequired, Boolean responseNotifications, VacancyScheduleOutput schedule, VacancyTypeOutput type, VacancyDraftAddressOutput address, List<@Valid VacancyAreaOutput> areas, VacancyDraftContactsWithFullPhone contacts, VacancyDraftEmployer employer, VacancyDraftVacancyDraftBase metaInfo, Boolean withZp) {
    this.acceptHandicapped = acceptHandicapped;
    this.acceptIncompleteResumes = acceptIncompleteResumes;
    this.acceptKids = acceptKids;
    this.allowMessages = allowMessages;
    this.billingType = billingType;
    this.description = description;
    this.driverLicenseTypes = driverLicenseTypes;
    this.experience = experience;
    this.hasTest = hasTest;
    this.keySkills = keySkills;
    this.languages = languages;
    this.manager = manager;
    this.name = name;
    this.professionalRoles = professionalRoles;
    this.responseLetterRequired = responseLetterRequired;
    this.responseNotifications = responseNotifications;
    this.schedule = schedule;
    this.type = type;
    this.address = address;
    this.areas = areas;
    this.contacts = contacts;
    this.employer = employer;
    this.metaInfo = metaInfo;
    this.withZp = withZp;
  }

  public VacancyDraftVacancyDraftFull acceptHandicapped(Boolean acceptHandicapped) {
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

  public VacancyDraftVacancyDraftFull acceptIncompleteResumes(Boolean acceptIncompleteResumes) {
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

  public VacancyDraftVacancyDraftFull acceptKids(Boolean acceptKids) {
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

  public VacancyDraftVacancyDraftFull acceptTemporary(Boolean acceptTemporary) {
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

  public VacancyDraftVacancyDraftFull ageRestriction(VacancyAgeRestrictionOutput ageRestriction) {
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

  public VacancyDraftVacancyDraftFull allowMessages(Boolean allowMessages) {
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

  public VacancyDraftVacancyDraftFull billingType(VacancyBillingTypeOutput billingType) {
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

  public VacancyDraftVacancyDraftFull code(String code) {
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

  public VacancyDraftVacancyDraftFull department(VacancyDepartmentOutput department) {
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

  public VacancyDraftVacancyDraftFull description(String description) {
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

  public VacancyDraftVacancyDraftFull driverLicenseTypes(List<@Valid VacancyDriverLicenceTypeItem> driverLicenseTypes) {
    this.driverLicenseTypes = driverLicenseTypes;
    return this;
  }

  public VacancyDraftVacancyDraftFull addDriverLicenseTypesItem(VacancyDriverLicenceTypeItem driverLicenseTypesItem) {
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

  public VacancyDraftVacancyDraftFull employment(VacancyEmploymentOutput employment) {
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

  public VacancyDraftVacancyDraftFull employmentForm(VacancyEmploymentFormOutput employmentForm) {
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

  public VacancyDraftVacancyDraftFull experience(VacancyExperienceOutput experience) {
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

  public VacancyDraftVacancyDraftFull flyInFlyOutDuration(List<@Valid VacancyFlyInFlyOutDurationFlyInFlyOutDurationItemOutput> flyInFlyOutDuration) {
    this.flyInFlyOutDuration = flyInFlyOutDuration;
    return this;
  }

  public VacancyDraftVacancyDraftFull addFlyInFlyOutDurationItem(VacancyFlyInFlyOutDurationFlyInFlyOutDurationItemOutput flyInFlyOutDurationItem) {
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

  public VacancyDraftVacancyDraftFull hasTest(Boolean hasTest) {
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

  public VacancyDraftVacancyDraftFull internship(Boolean internship) {
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

  public VacancyDraftVacancyDraftFull keySkills(List<@Valid VacancyKeySkillItem> keySkills) {
    this.keySkills = keySkills;
    return this;
  }

  public VacancyDraftVacancyDraftFull addKeySkillsItem(VacancyKeySkillItem keySkillsItem) {
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

  public VacancyDraftVacancyDraftFull languages(List<VacancyLanguageOutput> languages) {
    this.languages = languages;
    return this;
  }

  public VacancyDraftVacancyDraftFull addLanguagesItem(VacancyLanguageOutput languagesItem) {
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
  @NotNull @Valid 
  @Schema(name = "languages", description = "Список языков вакансии. Значения из справочника [/languages](#tag/Obshie-spravochniki/operation/get-dictionaries)", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("languages")
  public List<VacancyLanguageOutput> getLanguages() {
    return languages;
  }

  public void setLanguages(List<VacancyLanguageOutput> languages) {
    this.languages = languages;
  }

  public VacancyDraftVacancyDraftFull manager(VacancyManager manager) {
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

  public VacancyDraftVacancyDraftFull name(String name) {
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

  public VacancyDraftVacancyDraftFull nightShifts(Boolean nightShifts) {
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

  public VacancyDraftVacancyDraftFull professionalRoles(List<VacancyProfessionalRoleItemOutput> professionalRoles) {
    this.professionalRoles = professionalRoles;
    return this;
  }

  public VacancyDraftVacancyDraftFull addProfessionalRolesItem(VacancyProfessionalRoleItemOutput professionalRolesItem) {
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

  public VacancyDraftVacancyDraftFull responseLetterRequired(Boolean responseLetterRequired) {
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

  public VacancyDraftVacancyDraftFull responseNotifications(Boolean responseNotifications) {
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

  public VacancyDraftVacancyDraftFull responseUrl(String responseUrl) {
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

  public VacancyDraftVacancyDraftFull salary(VacancySalary salary) {
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

  public VacancyDraftVacancyDraftFull salaryRange(VacancySalaryRangeSalaryRangeOutput salaryRange) {
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

  public VacancyDraftVacancyDraftFull schedule(VacancyScheduleOutput schedule) {
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

  public VacancyDraftVacancyDraftFull test(VacancyDraftTest test) {
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

  public VacancyDraftVacancyDraftFull type(VacancyTypeOutput type) {
    this.type = type;
    return this;
  }

  /**
   * Get type
   * @return type
  */
  @NotNull @Valid 
  @Schema(name = "type", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("type")
  public VacancyTypeOutput getType() {
    return type;
  }

  public void setType(VacancyTypeOutput type) {
    this.type = type;
  }

  public VacancyDraftVacancyDraftFull workFormat(List<@Valid VacancyWorkFormatWorkFormatItemOutput> workFormat) {
    this.workFormat = workFormat;
    return this;
  }

  public VacancyDraftVacancyDraftFull addWorkFormatItem(VacancyWorkFormatWorkFormatItemOutput workFormatItem) {
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

  public VacancyDraftVacancyDraftFull workScheduleByDays(List<@Valid VacancyWorkScheduleByDaysWorkScheduleByDaysItemOutput> workScheduleByDays) {
    this.workScheduleByDays = workScheduleByDays;
    return this;
  }

  public VacancyDraftVacancyDraftFull addWorkScheduleByDaysItem(VacancyWorkScheduleByDaysWorkScheduleByDaysItemOutput workScheduleByDaysItem) {
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

  public VacancyDraftVacancyDraftFull workingDays(List<@Valid VacancyWorkingDayItemOutput> workingDays) {
    this.workingDays = workingDays;
    return this;
  }

  public VacancyDraftVacancyDraftFull addWorkingDaysItem(VacancyWorkingDayItemOutput workingDaysItem) {
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

  public VacancyDraftVacancyDraftFull workingHours(List<@Valid VacancyWorkingHoursWorkingHoursItemOutput> workingHours) {
    this.workingHours = workingHours;
    return this;
  }

  public VacancyDraftVacancyDraftFull addWorkingHoursItem(VacancyWorkingHoursWorkingHoursItemOutput workingHoursItem) {
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

  public VacancyDraftVacancyDraftFull workingTimeIntervals(List<@Valid VacancyWorkingTimeIntervalItemOutput> workingTimeIntervals) {
    this.workingTimeIntervals = workingTimeIntervals;
    return this;
  }

  public VacancyDraftVacancyDraftFull addWorkingTimeIntervalsItem(VacancyWorkingTimeIntervalItemOutput workingTimeIntervalsItem) {
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

  public VacancyDraftVacancyDraftFull workingTimeModes(List<@Valid VacancyWorkingTimeModeItemOutput> workingTimeModes) {
    this.workingTimeModes = workingTimeModes;
    return this;
  }

  public VacancyDraftVacancyDraftFull addWorkingTimeModesItem(VacancyWorkingTimeModeItemOutput workingTimeModesItem) {
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

  public VacancyDraftVacancyDraftFull address(VacancyDraftAddressOutput address) {
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
  public VacancyDraftAddressOutput getAddress() {
    return address;
  }

  public void setAddress(VacancyDraftAddressOutput address) {
    this.address = address;
  }

  public VacancyDraftVacancyDraftFull areas(List<@Valid VacancyAreaOutput> areas) {
    this.areas = areas;
    return this;
  }

  public VacancyDraftVacancyDraftFull addAreasItem(VacancyAreaOutput areasItem) {
    if (this.areas == null) {
      this.areas = new ArrayList<>();
    }
    this.areas.add(areasItem);
    return this;
  }

  /**
   * Коды и названия регионов (фед. округа, субъекты федерации, города)
   * @return areas
  */
  @NotNull @Valid @Size(min = 1) 
  @Schema(name = "areas", description = "Коды и названия регионов (фед. округа, субъекты федерации, города)", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("areas")
  public List<@Valid VacancyAreaOutput> getAreas() {
    return areas;
  }

  public void setAreas(List<@Valid VacancyAreaOutput> areas) {
    this.areas = areas;
  }

  public VacancyDraftVacancyDraftFull assignedManager(VacancyDraftAssignedManager assignedManager) {
    this.assignedManager = assignedManager;
    return this;
  }

  /**
   * Get assignedManager
   * @return assignedManager
  */
  @Valid 
  @Schema(name = "assigned_manager", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("assigned_manager")
  public VacancyDraftAssignedManager getAssignedManager() {
    return assignedManager;
  }

  public void setAssignedManager(VacancyDraftAssignedManager assignedManager) {
    this.assignedManager = assignedManager;
  }

  public VacancyDraftVacancyDraftFull brandedTemplate(VacancyBrandedTemplate brandedTemplate) {
    this.brandedTemplate = brandedTemplate;
    return this;
  }

  /**
   * Get brandedTemplate
   * @return brandedTemplate
  */
  @Valid 
  @Schema(name = "branded_template", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("branded_template")
  public VacancyBrandedTemplate getBrandedTemplate() {
    return brandedTemplate;
  }

  public void setBrandedTemplate(VacancyBrandedTemplate brandedTemplate) {
    this.brandedTemplate = brandedTemplate;
  }

  public VacancyDraftVacancyDraftFull closedForApplicants(Boolean closedForApplicants) {
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

  public VacancyDraftVacancyDraftFull contacts(VacancyDraftContactsWithFullPhone contacts) {
    this.contacts = contacts;
    return this;
  }

  /**
   * Get contacts
   * @return contacts
  */
  @NotNull @Valid 
  @Schema(name = "contacts", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("contacts")
  public VacancyDraftContactsWithFullPhone getContacts() {
    return contacts;
  }

  public void setContacts(VacancyDraftContactsWithFullPhone contacts) {
    this.contacts = contacts;
  }

  public VacancyDraftVacancyDraftFull customEmployerName(String customEmployerName) {
    this.customEmployerName = customEmployerName;
    return this;
  }

  /**
   * Название компании для анонимных вакансий (`type.id=anonymous`), например \"крупный российский банк\". Поле становится обязательным при публикации вакансии **анонимного** типа
   * @return customEmployerName
  */
  
  @Schema(name = "custom_employer_name", description = "Название компании для анонимных вакансий (`type.id=anonymous`), например \"крупный российский банк\". Поле становится обязательным при публикации вакансии **анонимного** типа", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("custom_employer_name")
  public String getCustomEmployerName() {
    return customEmployerName;
  }

  public void setCustomEmployerName(String customEmployerName) {
    this.customEmployerName = customEmployerName;
  }

  public VacancyDraftVacancyDraftFull employer(VacancyDraftEmployer employer) {
    this.employer = employer;
    return this;
  }

  /**
   * Get employer
   * @return employer
  */
  @NotNull @Valid 
  @Schema(name = "employer", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("employer")
  public VacancyDraftEmployer getEmployer() {
    return employer;
  }

  public void setEmployer(VacancyDraftEmployer employer) {
    this.employer = employer;
  }

  public VacancyDraftVacancyDraftFull metaInfo(VacancyDraftVacancyDraftBase metaInfo) {
    this.metaInfo = metaInfo;
    return this;
  }

  /**
   * Get metaInfo
   * @return metaInfo
  */
  @NotNull @Valid 
  @Schema(name = "meta_info", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("meta_info")
  public VacancyDraftVacancyDraftBase getMetaInfo() {
    return metaInfo;
  }

  public void setMetaInfo(VacancyDraftVacancyDraftBase metaInfo) {
    this.metaInfo = metaInfo;
  }

  public VacancyDraftVacancyDraftFull vacancyProperties(VacancyDraftVacancyProperties vacancyProperties) {
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
  public VacancyDraftVacancyProperties getVacancyProperties() {
    return vacancyProperties;
  }

  public void setVacancyProperties(VacancyDraftVacancyProperties vacancyProperties) {
    this.vacancyProperties = vacancyProperties;
  }

  public VacancyDraftVacancyDraftFull withZp(Boolean withZp) {
    this.withZp = withZp;
    return this;
  }

  /**
   * Вашу вакансию увидят больше людей. Мы разместим ее дополнительно на сервисе Зарплата.ру
   * @return withZp
  */
  @NotNull 
  @Schema(name = "with_zp", description = "Вашу вакансию увидят больше людей. Мы разместим ее дополнительно на сервисе Зарплата.ру", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("with_zp")
  public Boolean getWithZp() {
    return withZp;
  }

  public void setWithZp(Boolean withZp) {
    this.withZp = withZp;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    VacancyDraftVacancyDraftFull vacancyDraftVacancyDraftFull = (VacancyDraftVacancyDraftFull) o;
    return Objects.equals(this.acceptHandicapped, vacancyDraftVacancyDraftFull.acceptHandicapped) &&
        Objects.equals(this.acceptIncompleteResumes, vacancyDraftVacancyDraftFull.acceptIncompleteResumes) &&
        Objects.equals(this.acceptKids, vacancyDraftVacancyDraftFull.acceptKids) &&
        Objects.equals(this.acceptTemporary, vacancyDraftVacancyDraftFull.acceptTemporary) &&
        Objects.equals(this.ageRestriction, vacancyDraftVacancyDraftFull.ageRestriction) &&
        Objects.equals(this.allowMessages, vacancyDraftVacancyDraftFull.allowMessages) &&
        Objects.equals(this.billingType, vacancyDraftVacancyDraftFull.billingType) &&
        Objects.equals(this.code, vacancyDraftVacancyDraftFull.code) &&
        Objects.equals(this.department, vacancyDraftVacancyDraftFull.department) &&
        Objects.equals(this.description, vacancyDraftVacancyDraftFull.description) &&
        Objects.equals(this.driverLicenseTypes, vacancyDraftVacancyDraftFull.driverLicenseTypes) &&
        Objects.equals(this.employment, vacancyDraftVacancyDraftFull.employment) &&
        Objects.equals(this.employmentForm, vacancyDraftVacancyDraftFull.employmentForm) &&
        Objects.equals(this.experience, vacancyDraftVacancyDraftFull.experience) &&
        Objects.equals(this.flyInFlyOutDuration, vacancyDraftVacancyDraftFull.flyInFlyOutDuration) &&
        Objects.equals(this.hasTest, vacancyDraftVacancyDraftFull.hasTest) &&
        Objects.equals(this.internship, vacancyDraftVacancyDraftFull.internship) &&
        Objects.equals(this.keySkills, vacancyDraftVacancyDraftFull.keySkills) &&
        Objects.equals(this.languages, vacancyDraftVacancyDraftFull.languages) &&
        Objects.equals(this.manager, vacancyDraftVacancyDraftFull.manager) &&
        Objects.equals(this.name, vacancyDraftVacancyDraftFull.name) &&
        Objects.equals(this.nightShifts, vacancyDraftVacancyDraftFull.nightShifts) &&
        Objects.equals(this.professionalRoles, vacancyDraftVacancyDraftFull.professionalRoles) &&
        Objects.equals(this.responseLetterRequired, vacancyDraftVacancyDraftFull.responseLetterRequired) &&
        Objects.equals(this.responseNotifications, vacancyDraftVacancyDraftFull.responseNotifications) &&
        Objects.equals(this.responseUrl, vacancyDraftVacancyDraftFull.responseUrl) &&
        Objects.equals(this.salary, vacancyDraftVacancyDraftFull.salary) &&
        Objects.equals(this.salaryRange, vacancyDraftVacancyDraftFull.salaryRange) &&
        Objects.equals(this.schedule, vacancyDraftVacancyDraftFull.schedule) &&
        Objects.equals(this.test, vacancyDraftVacancyDraftFull.test) &&
        Objects.equals(this.type, vacancyDraftVacancyDraftFull.type) &&
        Objects.equals(this.workFormat, vacancyDraftVacancyDraftFull.workFormat) &&
        Objects.equals(this.workScheduleByDays, vacancyDraftVacancyDraftFull.workScheduleByDays) &&
        Objects.equals(this.workingDays, vacancyDraftVacancyDraftFull.workingDays) &&
        Objects.equals(this.workingHours, vacancyDraftVacancyDraftFull.workingHours) &&
        Objects.equals(this.workingTimeIntervals, vacancyDraftVacancyDraftFull.workingTimeIntervals) &&
        Objects.equals(this.workingTimeModes, vacancyDraftVacancyDraftFull.workingTimeModes) &&
        Objects.equals(this.address, vacancyDraftVacancyDraftFull.address) &&
        Objects.equals(this.areas, vacancyDraftVacancyDraftFull.areas) &&
        Objects.equals(this.assignedManager, vacancyDraftVacancyDraftFull.assignedManager) &&
        Objects.equals(this.brandedTemplate, vacancyDraftVacancyDraftFull.brandedTemplate) &&
        Objects.equals(this.closedForApplicants, vacancyDraftVacancyDraftFull.closedForApplicants) &&
        Objects.equals(this.contacts, vacancyDraftVacancyDraftFull.contacts) &&
        Objects.equals(this.customEmployerName, vacancyDraftVacancyDraftFull.customEmployerName) &&
        Objects.equals(this.employer, vacancyDraftVacancyDraftFull.employer) &&
        Objects.equals(this.metaInfo, vacancyDraftVacancyDraftFull.metaInfo) &&
        Objects.equals(this.vacancyProperties, vacancyDraftVacancyDraftFull.vacancyProperties) &&
        Objects.equals(this.withZp, vacancyDraftVacancyDraftFull.withZp);
  }

  @Override
  public int hashCode() {
    return Objects.hash(acceptHandicapped, acceptIncompleteResumes, acceptKids, acceptTemporary, ageRestriction, allowMessages, billingType, code, department, description, driverLicenseTypes, employment, employmentForm, experience, flyInFlyOutDuration, hasTest, internship, keySkills, languages, manager, name, nightShifts, professionalRoles, responseLetterRequired, responseNotifications, responseUrl, salary, salaryRange, schedule, test, type, workFormat, workScheduleByDays, workingDays, workingHours, workingTimeIntervals, workingTimeModes, address, areas, assignedManager, brandedTemplate, closedForApplicants, contacts, customEmployerName, employer, metaInfo, vacancyProperties, withZp);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class VacancyDraftVacancyDraftFull {\n");
    sb.append("    acceptHandicapped: ").append(toIndentedString(acceptHandicapped)).append("\n");
    sb.append("    acceptIncompleteResumes: ").append(toIndentedString(acceptIncompleteResumes)).append("\n");
    sb.append("    acceptKids: ").append(toIndentedString(acceptKids)).append("\n");
    sb.append("    acceptTemporary: ").append(toIndentedString(acceptTemporary)).append("\n");
    sb.append("    ageRestriction: ").append(toIndentedString(ageRestriction)).append("\n");
    sb.append("    allowMessages: ").append(toIndentedString(allowMessages)).append("\n");
    sb.append("    billingType: ").append(toIndentedString(billingType)).append("\n");
    sb.append("    code: ").append(toIndentedString(code)).append("\n");
    sb.append("    department: ").append(toIndentedString(department)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    driverLicenseTypes: ").append(toIndentedString(driverLicenseTypes)).append("\n");
    sb.append("    employment: ").append(toIndentedString(employment)).append("\n");
    sb.append("    employmentForm: ").append(toIndentedString(employmentForm)).append("\n");
    sb.append("    experience: ").append(toIndentedString(experience)).append("\n");
    sb.append("    flyInFlyOutDuration: ").append(toIndentedString(flyInFlyOutDuration)).append("\n");
    sb.append("    hasTest: ").append(toIndentedString(hasTest)).append("\n");
    sb.append("    internship: ").append(toIndentedString(internship)).append("\n");
    sb.append("    keySkills: ").append(toIndentedString(keySkills)).append("\n");
    sb.append("    languages: ").append(toIndentedString(languages)).append("\n");
    sb.append("    manager: ").append(toIndentedString(manager)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    nightShifts: ").append(toIndentedString(nightShifts)).append("\n");
    sb.append("    professionalRoles: ").append(toIndentedString(professionalRoles)).append("\n");
    sb.append("    responseLetterRequired: ").append(toIndentedString(responseLetterRequired)).append("\n");
    sb.append("    responseNotifications: ").append(toIndentedString(responseNotifications)).append("\n");
    sb.append("    responseUrl: ").append(toIndentedString(responseUrl)).append("\n");
    sb.append("    salary: ").append(toIndentedString(salary)).append("\n");
    sb.append("    salaryRange: ").append(toIndentedString(salaryRange)).append("\n");
    sb.append("    schedule: ").append(toIndentedString(schedule)).append("\n");
    sb.append("    test: ").append(toIndentedString(test)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    workFormat: ").append(toIndentedString(workFormat)).append("\n");
    sb.append("    workScheduleByDays: ").append(toIndentedString(workScheduleByDays)).append("\n");
    sb.append("    workingDays: ").append(toIndentedString(workingDays)).append("\n");
    sb.append("    workingHours: ").append(toIndentedString(workingHours)).append("\n");
    sb.append("    workingTimeIntervals: ").append(toIndentedString(workingTimeIntervals)).append("\n");
    sb.append("    workingTimeModes: ").append(toIndentedString(workingTimeModes)).append("\n");
    sb.append("    address: ").append(toIndentedString(address)).append("\n");
    sb.append("    areas: ").append(toIndentedString(areas)).append("\n");
    sb.append("    assignedManager: ").append(toIndentedString(assignedManager)).append("\n");
    sb.append("    brandedTemplate: ").append(toIndentedString(brandedTemplate)).append("\n");
    sb.append("    closedForApplicants: ").append(toIndentedString(closedForApplicants)).append("\n");
    sb.append("    contacts: ").append(toIndentedString(contacts)).append("\n");
    sb.append("    customEmployerName: ").append(toIndentedString(customEmployerName)).append("\n");
    sb.append("    employer: ").append(toIndentedString(employer)).append("\n");
    sb.append("    metaInfo: ").append(toIndentedString(metaInfo)).append("\n");
    sb.append("    vacancyProperties: ").append(toIndentedString(vacancyProperties)).append("\n");
    sb.append("    withZp: ").append(toIndentedString(withZp)).append("\n");
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

