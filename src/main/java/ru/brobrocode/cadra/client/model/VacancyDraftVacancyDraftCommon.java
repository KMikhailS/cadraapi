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
 * VacancyDraftVacancyDraftCommon
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2025-08-17T15:41:09.394389505+05:00[Asia/Yekaterinburg]", comments = "Generator version: 7.6.0")
public class VacancyDraftVacancyDraftCommon {

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

  public VacancyDraftVacancyDraftCommon() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public VacancyDraftVacancyDraftCommon(Boolean acceptHandicapped, Boolean acceptIncompleteResumes, Boolean acceptKids, Boolean allowMessages, VacancyBillingTypeOutput billingType, String description, List<@Valid VacancyDriverLicenceTypeItem> driverLicenseTypes, VacancyExperienceOutput experience, Boolean hasTest, List<@Valid VacancyKeySkillItem> keySkills, List<VacancyLanguageOutput> languages, VacancyManager manager, String name, List<VacancyProfessionalRoleItemOutput> professionalRoles, Boolean responseLetterRequired, Boolean responseNotifications, VacancyScheduleOutput schedule, VacancyTypeOutput type) {
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
  }

  public VacancyDraftVacancyDraftCommon acceptHandicapped(Boolean acceptHandicapped) {
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

  public VacancyDraftVacancyDraftCommon acceptIncompleteResumes(Boolean acceptIncompleteResumes) {
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

  public VacancyDraftVacancyDraftCommon acceptKids(Boolean acceptKids) {
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

  public VacancyDraftVacancyDraftCommon acceptTemporary(Boolean acceptTemporary) {
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

  public VacancyDraftVacancyDraftCommon ageRestriction(VacancyAgeRestrictionOutput ageRestriction) {
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

  public VacancyDraftVacancyDraftCommon allowMessages(Boolean allowMessages) {
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

  public VacancyDraftVacancyDraftCommon billingType(VacancyBillingTypeOutput billingType) {
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

  public VacancyDraftVacancyDraftCommon code(String code) {
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

  public VacancyDraftVacancyDraftCommon department(VacancyDepartmentOutput department) {
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

  public VacancyDraftVacancyDraftCommon description(String description) {
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

  public VacancyDraftVacancyDraftCommon driverLicenseTypes(List<@Valid VacancyDriverLicenceTypeItem> driverLicenseTypes) {
    this.driverLicenseTypes = driverLicenseTypes;
    return this;
  }

  public VacancyDraftVacancyDraftCommon addDriverLicenseTypesItem(VacancyDriverLicenceTypeItem driverLicenseTypesItem) {
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

  public VacancyDraftVacancyDraftCommon employment(VacancyEmploymentOutput employment) {
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

  public VacancyDraftVacancyDraftCommon employmentForm(VacancyEmploymentFormOutput employmentForm) {
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

  public VacancyDraftVacancyDraftCommon experience(VacancyExperienceOutput experience) {
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

  public VacancyDraftVacancyDraftCommon flyInFlyOutDuration(List<@Valid VacancyFlyInFlyOutDurationFlyInFlyOutDurationItemOutput> flyInFlyOutDuration) {
    this.flyInFlyOutDuration = flyInFlyOutDuration;
    return this;
  }

  public VacancyDraftVacancyDraftCommon addFlyInFlyOutDurationItem(VacancyFlyInFlyOutDurationFlyInFlyOutDurationItemOutput flyInFlyOutDurationItem) {
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

  public VacancyDraftVacancyDraftCommon hasTest(Boolean hasTest) {
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

  public VacancyDraftVacancyDraftCommon internship(Boolean internship) {
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

  public VacancyDraftVacancyDraftCommon keySkills(List<@Valid VacancyKeySkillItem> keySkills) {
    this.keySkills = keySkills;
    return this;
  }

  public VacancyDraftVacancyDraftCommon addKeySkillsItem(VacancyKeySkillItem keySkillsItem) {
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

  public VacancyDraftVacancyDraftCommon languages(List<VacancyLanguageOutput> languages) {
    this.languages = languages;
    return this;
  }

  public VacancyDraftVacancyDraftCommon addLanguagesItem(VacancyLanguageOutput languagesItem) {
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

  public VacancyDraftVacancyDraftCommon manager(VacancyManager manager) {
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

  public VacancyDraftVacancyDraftCommon name(String name) {
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

  public VacancyDraftVacancyDraftCommon nightShifts(Boolean nightShifts) {
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

  public VacancyDraftVacancyDraftCommon professionalRoles(List<VacancyProfessionalRoleItemOutput> professionalRoles) {
    this.professionalRoles = professionalRoles;
    return this;
  }

  public VacancyDraftVacancyDraftCommon addProfessionalRolesItem(VacancyProfessionalRoleItemOutput professionalRolesItem) {
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

  public VacancyDraftVacancyDraftCommon responseLetterRequired(Boolean responseLetterRequired) {
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

  public VacancyDraftVacancyDraftCommon responseNotifications(Boolean responseNotifications) {
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

  public VacancyDraftVacancyDraftCommon responseUrl(String responseUrl) {
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

  public VacancyDraftVacancyDraftCommon salary(VacancySalary salary) {
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

  public VacancyDraftVacancyDraftCommon salaryRange(VacancySalaryRangeSalaryRangeOutput salaryRange) {
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

  public VacancyDraftVacancyDraftCommon schedule(VacancyScheduleOutput schedule) {
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

  public VacancyDraftVacancyDraftCommon test(VacancyDraftTest test) {
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

  public VacancyDraftVacancyDraftCommon type(VacancyTypeOutput type) {
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

  public VacancyDraftVacancyDraftCommon workFormat(List<@Valid VacancyWorkFormatWorkFormatItemOutput> workFormat) {
    this.workFormat = workFormat;
    return this;
  }

  public VacancyDraftVacancyDraftCommon addWorkFormatItem(VacancyWorkFormatWorkFormatItemOutput workFormatItem) {
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

  public VacancyDraftVacancyDraftCommon workScheduleByDays(List<@Valid VacancyWorkScheduleByDaysWorkScheduleByDaysItemOutput> workScheduleByDays) {
    this.workScheduleByDays = workScheduleByDays;
    return this;
  }

  public VacancyDraftVacancyDraftCommon addWorkScheduleByDaysItem(VacancyWorkScheduleByDaysWorkScheduleByDaysItemOutput workScheduleByDaysItem) {
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

  public VacancyDraftVacancyDraftCommon workingDays(List<@Valid VacancyWorkingDayItemOutput> workingDays) {
    this.workingDays = workingDays;
    return this;
  }

  public VacancyDraftVacancyDraftCommon addWorkingDaysItem(VacancyWorkingDayItemOutput workingDaysItem) {
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

  public VacancyDraftVacancyDraftCommon workingHours(List<@Valid VacancyWorkingHoursWorkingHoursItemOutput> workingHours) {
    this.workingHours = workingHours;
    return this;
  }

  public VacancyDraftVacancyDraftCommon addWorkingHoursItem(VacancyWorkingHoursWorkingHoursItemOutput workingHoursItem) {
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

  public VacancyDraftVacancyDraftCommon workingTimeIntervals(List<@Valid VacancyWorkingTimeIntervalItemOutput> workingTimeIntervals) {
    this.workingTimeIntervals = workingTimeIntervals;
    return this;
  }

  public VacancyDraftVacancyDraftCommon addWorkingTimeIntervalsItem(VacancyWorkingTimeIntervalItemOutput workingTimeIntervalsItem) {
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

  public VacancyDraftVacancyDraftCommon workingTimeModes(List<@Valid VacancyWorkingTimeModeItemOutput> workingTimeModes) {
    this.workingTimeModes = workingTimeModes;
    return this;
  }

  public VacancyDraftVacancyDraftCommon addWorkingTimeModesItem(VacancyWorkingTimeModeItemOutput workingTimeModesItem) {
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

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    VacancyDraftVacancyDraftCommon vacancyDraftVacancyDraftCommon = (VacancyDraftVacancyDraftCommon) o;
    return Objects.equals(this.acceptHandicapped, vacancyDraftVacancyDraftCommon.acceptHandicapped) &&
        Objects.equals(this.acceptIncompleteResumes, vacancyDraftVacancyDraftCommon.acceptIncompleteResumes) &&
        Objects.equals(this.acceptKids, vacancyDraftVacancyDraftCommon.acceptKids) &&
        Objects.equals(this.acceptTemporary, vacancyDraftVacancyDraftCommon.acceptTemporary) &&
        Objects.equals(this.ageRestriction, vacancyDraftVacancyDraftCommon.ageRestriction) &&
        Objects.equals(this.allowMessages, vacancyDraftVacancyDraftCommon.allowMessages) &&
        Objects.equals(this.billingType, vacancyDraftVacancyDraftCommon.billingType) &&
        Objects.equals(this.code, vacancyDraftVacancyDraftCommon.code) &&
        Objects.equals(this.department, vacancyDraftVacancyDraftCommon.department) &&
        Objects.equals(this.description, vacancyDraftVacancyDraftCommon.description) &&
        Objects.equals(this.driverLicenseTypes, vacancyDraftVacancyDraftCommon.driverLicenseTypes) &&
        Objects.equals(this.employment, vacancyDraftVacancyDraftCommon.employment) &&
        Objects.equals(this.employmentForm, vacancyDraftVacancyDraftCommon.employmentForm) &&
        Objects.equals(this.experience, vacancyDraftVacancyDraftCommon.experience) &&
        Objects.equals(this.flyInFlyOutDuration, vacancyDraftVacancyDraftCommon.flyInFlyOutDuration) &&
        Objects.equals(this.hasTest, vacancyDraftVacancyDraftCommon.hasTest) &&
        Objects.equals(this.internship, vacancyDraftVacancyDraftCommon.internship) &&
        Objects.equals(this.keySkills, vacancyDraftVacancyDraftCommon.keySkills) &&
        Objects.equals(this.languages, vacancyDraftVacancyDraftCommon.languages) &&
        Objects.equals(this.manager, vacancyDraftVacancyDraftCommon.manager) &&
        Objects.equals(this.name, vacancyDraftVacancyDraftCommon.name) &&
        Objects.equals(this.nightShifts, vacancyDraftVacancyDraftCommon.nightShifts) &&
        Objects.equals(this.professionalRoles, vacancyDraftVacancyDraftCommon.professionalRoles) &&
        Objects.equals(this.responseLetterRequired, vacancyDraftVacancyDraftCommon.responseLetterRequired) &&
        Objects.equals(this.responseNotifications, vacancyDraftVacancyDraftCommon.responseNotifications) &&
        Objects.equals(this.responseUrl, vacancyDraftVacancyDraftCommon.responseUrl) &&
        Objects.equals(this.salary, vacancyDraftVacancyDraftCommon.salary) &&
        Objects.equals(this.salaryRange, vacancyDraftVacancyDraftCommon.salaryRange) &&
        Objects.equals(this.schedule, vacancyDraftVacancyDraftCommon.schedule) &&
        Objects.equals(this.test, vacancyDraftVacancyDraftCommon.test) &&
        Objects.equals(this.type, vacancyDraftVacancyDraftCommon.type) &&
        Objects.equals(this.workFormat, vacancyDraftVacancyDraftCommon.workFormat) &&
        Objects.equals(this.workScheduleByDays, vacancyDraftVacancyDraftCommon.workScheduleByDays) &&
        Objects.equals(this.workingDays, vacancyDraftVacancyDraftCommon.workingDays) &&
        Objects.equals(this.workingHours, vacancyDraftVacancyDraftCommon.workingHours) &&
        Objects.equals(this.workingTimeIntervals, vacancyDraftVacancyDraftCommon.workingTimeIntervals) &&
        Objects.equals(this.workingTimeModes, vacancyDraftVacancyDraftCommon.workingTimeModes);
  }

  @Override
  public int hashCode() {
    return Objects.hash(acceptHandicapped, acceptIncompleteResumes, acceptKids, acceptTemporary, ageRestriction, allowMessages, billingType, code, department, description, driverLicenseTypes, employment, employmentForm, experience, flyInFlyOutDuration, hasTest, internship, keySkills, languages, manager, name, nightShifts, professionalRoles, responseLetterRequired, responseNotifications, responseUrl, salary, salaryRange, schedule, test, type, workFormat, workScheduleByDays, workingDays, workingHours, workingTimeIntervals, workingTimeModes);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class VacancyDraftVacancyDraftCommon {\n");
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

