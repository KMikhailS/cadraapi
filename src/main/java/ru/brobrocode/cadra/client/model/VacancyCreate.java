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
 * Поля, передаваемые в запросе на создание вакансии
 */

@Schema(name = "VacancyCreate", description = "Поля, передаваемые в запросе на создание вакансии")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2025-08-17T15:41:09.394389505+05:00[Asia/Yekaterinburg]", comments = "Generator version: 7.6.0")
public class VacancyCreate {

  private Boolean acceptHandicapped;

  private Boolean acceptIncompleteResumes;

  @Deprecated
  private Boolean acceptKids;

  private Boolean acceptTemporary = null;

  private VacancyAddress address = null;

  private VacancyAgeRestriction ageRestriction = null;

  private Boolean allowMessages;

  private VacancyBrandedTemplate brandedTemplate = null;

  private String code = null;

  private VacancyContacts contacts = null;

  private String customEmployerName = null;

  private VacancyDepartment department = null;

  @Valid
  private List<@Valid VacancyDriverLicenceTypeItem> driverLicenseTypes = new ArrayList<>();

  @Deprecated
  private VacancyEmployment employment = null;

  private VacancyEmploymentForm employmentForm = null;

  private VacancyExperience experience = null;

  @Valid
  private List<@Valid VacancyFlyInFlyOutDurationFlyInFlyOutDurationItem> flyInFlyOutDuration;

  private Boolean internship = null;

  @Valid
  private List<@Valid VacancyKeySkillItem> keySkills = new ArrayList<>();

  @Valid
  private List<@Valid VacancyLanguage> languages = new ArrayList<>();

  private Boolean nightShifts = null;

  @Valid
  private List<@Valid VacancyProfessionalRoleItem> professionalRoles = new ArrayList<>();

  private Boolean responseLetterRequired;

  private Boolean responseNotifications;

  private String responseUrl = null;

  @Deprecated
  private VacancySalary salary = null;

  private VacancySalaryRangeSalaryRange salaryRange = null;

  @Deprecated
  private VacancySchedule schedule = null;

  private Boolean showContacts = null;

  private VacancyDraftTest test = null;

  @Valid
  private List<@Valid VacancyWorkFormatWorkFormatItem> workFormat;

  @Valid
  private List<@Valid VacancyWorkScheduleByDaysWorkScheduleByDaysItem> workScheduleByDays;

  @Deprecated
  @Valid
  private List<@Valid VacancyWorkingDayItem> workingDays;

  @Valid
  private List<@Valid VacancyWorkingHoursWorkingHoursItem> workingHours;

  @Deprecated
  @Valid
  private List<@Valid VacancyWorkingTimeIntervalItem> workingTimeIntervals;

  @Deprecated
  @Valid
  private List<@Valid VacancyWorkingTimeModeItem> workingTimeModes;

  private VacancyArea area;

  private VacancyBillingType billingType;

  private String description;

  private VacancyManager manager = null;

  private String name;

  private String previousId = null;

  private VacancyType type;

  public VacancyCreate() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public VacancyCreate(List<@Valid VacancyProfessionalRoleItem> professionalRoles, VacancyArea area, VacancyBillingType billingType, String description, String name, VacancyType type) {
    this.professionalRoles = professionalRoles;
    this.area = area;
    this.billingType = billingType;
    this.description = description;
    this.name = name;
    this.type = type;
  }

  public VacancyCreate acceptHandicapped(Boolean acceptHandicapped) {
    this.acceptHandicapped = acceptHandicapped;
    return this;
  }

  /**
   * Указание, что вакансия доступна для соискателей с инвалидностью
   * @return acceptHandicapped
  */
  
  @Schema(name = "accept_handicapped", description = "Указание, что вакансия доступна для соискателей с инвалидностью", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("accept_handicapped")
  public Boolean getAcceptHandicapped() {
    return acceptHandicapped;
  }

  public void setAcceptHandicapped(Boolean acceptHandicapped) {
    this.acceptHandicapped = acceptHandicapped;
  }

  public VacancyCreate acceptIncompleteResumes(Boolean acceptIncompleteResumes) {
    this.acceptIncompleteResumes = acceptIncompleteResumes;
    return this;
  }

  /**
   * Разрешен ли отклик на вакансию неполным резюме
   * @return acceptIncompleteResumes
  */
  
  @Schema(name = "accept_incomplete_resumes", description = "Разрешен ли отклик на вакансию неполным резюме", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("accept_incomplete_resumes")
  public Boolean getAcceptIncompleteResumes() {
    return acceptIncompleteResumes;
  }

  public void setAcceptIncompleteResumes(Boolean acceptIncompleteResumes) {
    this.acceptIncompleteResumes = acceptIncompleteResumes;
  }

  public VacancyCreate acceptKids(Boolean acceptKids) {
    this.acceptKids = acceptKids;
    return this;
  }

  /**
   * Depreceted. Для вакансии с возрастными ограничениями используйте поле **age_restriction**  Указание, что вакансия доступна для соискателей старше 14 лет [подробнее](https://github.com/hhru/api/blob/master/docs/employer_vacancies_accept_kids.md#accept-kids) 
   * @return acceptKids
   * @deprecated
  */
  
  @Schema(name = "accept_kids", description = "Depreceted. Для вакансии с возрастными ограничениями используйте поле **age_restriction**  Указание, что вакансия доступна для соискателей старше 14 лет [подробнее](https://github.com/hhru/api/blob/master/docs/employer_vacancies_accept_kids.md#accept-kids) ", deprecated = true, requiredMode = Schema.RequiredMode.NOT_REQUIRED)
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

  public VacancyCreate acceptTemporary(Boolean acceptTemporary) {
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

  public VacancyCreate address(VacancyAddress address) {
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
  public VacancyAddress getAddress() {
    return address;
  }

  public void setAddress(VacancyAddress address) {
    this.address = address;
  }

  public VacancyCreate ageRestriction(VacancyAgeRestriction ageRestriction) {
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
  public VacancyAgeRestriction getAgeRestriction() {
    return ageRestriction;
  }

  public void setAgeRestriction(VacancyAgeRestriction ageRestriction) {
    this.ageRestriction = ageRestriction;
  }

  public VacancyCreate allowMessages(Boolean allowMessages) {
    this.allowMessages = allowMessages;
    return this;
  }

  /**
   * Возможность [переписки с кандидатами](https://hh.ru/article/inboxemp) по данной вакансии
   * @return allowMessages
  */
  
  @Schema(name = "allow_messages", description = "Возможность [переписки с кандидатами](https://hh.ru/article/inboxemp) по данной вакансии", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("allow_messages")
  public Boolean getAllowMessages() {
    return allowMessages;
  }

  public void setAllowMessages(Boolean allowMessages) {
    this.allowMessages = allowMessages;
  }

  public VacancyCreate brandedTemplate(VacancyBrandedTemplate brandedTemplate) {
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

  public VacancyCreate code(String code) {
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

  public VacancyCreate contacts(VacancyContacts contacts) {
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
  public VacancyContacts getContacts() {
    return contacts;
  }

  public void setContacts(VacancyContacts contacts) {
    this.contacts = contacts;
  }

  public VacancyCreate customEmployerName(String customEmployerName) {
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

  public VacancyCreate department(VacancyDepartment department) {
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
  public VacancyDepartment getDepartment() {
    return department;
  }

  public void setDepartment(VacancyDepartment department) {
    this.department = department;
  }

  public VacancyCreate driverLicenseTypes(List<@Valid VacancyDriverLicenceTypeItem> driverLicenseTypes) {
    this.driverLicenseTypes = driverLicenseTypes;
    return this;
  }

  public VacancyCreate addDriverLicenseTypesItem(VacancyDriverLicenceTypeItem driverLicenseTypesItem) {
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
  @Valid 
  @Schema(name = "driver_license_types", description = "Список требуемых категорий водительских прав", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("driver_license_types")
  public List<@Valid VacancyDriverLicenceTypeItem> getDriverLicenseTypes() {
    return driverLicenseTypes;
  }

  public void setDriverLicenseTypes(List<@Valid VacancyDriverLicenceTypeItem> driverLicenseTypes) {
    this.driverLicenseTypes = driverLicenseTypes;
  }

  public VacancyCreate employment(VacancyEmployment employment) {
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
  public VacancyEmployment getEmployment() {
    return employment;
  }

  /**
   * @deprecated
  */
  @Deprecated
  public void setEmployment(VacancyEmployment employment) {
    this.employment = employment;
  }

  public VacancyCreate employmentForm(VacancyEmploymentForm employmentForm) {
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
  public VacancyEmploymentForm getEmploymentForm() {
    return employmentForm;
  }

  public void setEmploymentForm(VacancyEmploymentForm employmentForm) {
    this.employmentForm = employmentForm;
  }

  public VacancyCreate experience(VacancyExperience experience) {
    this.experience = experience;
    return this;
  }

  /**
   * Get experience
   * @return experience
  */
  @Valid 
  @Schema(name = "experience", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("experience")
  public VacancyExperience getExperience() {
    return experience;
  }

  public void setExperience(VacancyExperience experience) {
    this.experience = experience;
  }

  public VacancyCreate flyInFlyOutDuration(List<@Valid VacancyFlyInFlyOutDurationFlyInFlyOutDurationItem> flyInFlyOutDuration) {
    this.flyInFlyOutDuration = flyInFlyOutDuration;
    return this;
  }

  public VacancyCreate addFlyInFlyOutDurationItem(VacancyFlyInFlyOutDurationFlyInFlyOutDurationItem flyInFlyOutDurationItem) {
    if (this.flyInFlyOutDuration == null) {
      this.flyInFlyOutDuration = new ArrayList<>();
    }
    this.flyInFlyOutDuration.add(flyInFlyOutDurationItem);
    return this;
  }

  /**
   * Список вариантов длительности вахты (в ближайшие полгода станет обязательным полем!)
   * @return flyInFlyOutDuration
  */
  @Valid 
  @Schema(name = "fly_in_fly_out_duration", description = "Список вариантов длительности вахты (в ближайшие полгода станет обязательным полем!)", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("fly_in_fly_out_duration")
  public List<@Valid VacancyFlyInFlyOutDurationFlyInFlyOutDurationItem> getFlyInFlyOutDuration() {
    return flyInFlyOutDuration;
  }

  public void setFlyInFlyOutDuration(List<@Valid VacancyFlyInFlyOutDurationFlyInFlyOutDurationItem> flyInFlyOutDuration) {
    this.flyInFlyOutDuration = flyInFlyOutDuration;
  }

  public VacancyCreate internship(Boolean internship) {
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

  public VacancyCreate keySkills(List<@Valid VacancyKeySkillItem> keySkills) {
    this.keySkills = keySkills;
    return this;
  }

  public VacancyCreate addKeySkillsItem(VacancyKeySkillItem keySkillsItem) {
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
  @Valid 
  @Schema(name = "key_skills", description = "Список ключевых навыков, не более 30", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("key_skills")
  public List<@Valid VacancyKeySkillItem> getKeySkills() {
    return keySkills;
  }

  public void setKeySkills(List<@Valid VacancyKeySkillItem> keySkills) {
    this.keySkills = keySkills;
  }

  public VacancyCreate languages(List<@Valid VacancyLanguage> languages) {
    this.languages = languages;
    return this;
  }

  public VacancyCreate addLanguagesItem(VacancyLanguage languagesItem) {
    if (this.languages == null) {
      this.languages = new ArrayList<>();
    }
    this.languages.add(languagesItem);
    return this;
  }

  /**
   * Список языков вакансии
   * @return languages
  */
  @Valid 
  @Schema(name = "languages", description = "Список языков вакансии", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("languages")
  public List<@Valid VacancyLanguage> getLanguages() {
    return languages;
  }

  public void setLanguages(List<@Valid VacancyLanguage> languages) {
    this.languages = languages;
  }

  public VacancyCreate nightShifts(Boolean nightShifts) {
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

  public VacancyCreate professionalRoles(List<@Valid VacancyProfessionalRoleItem> professionalRoles) {
    this.professionalRoles = professionalRoles;
    return this;
  }

  public VacancyCreate addProfessionalRolesItem(VacancyProfessionalRoleItem professionalRolesItem) {
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
  public List<@Valid VacancyProfessionalRoleItem> getProfessionalRoles() {
    return professionalRoles;
  }

  public void setProfessionalRoles(List<@Valid VacancyProfessionalRoleItem> professionalRoles) {
    this.professionalRoles = professionalRoles;
  }

  public VacancyCreate responseLetterRequired(Boolean responseLetterRequired) {
    this.responseLetterRequired = responseLetterRequired;
    return this;
  }

  /**
   * Обязательно ли заполнять сообщение при отклике на вакансию
   * @return responseLetterRequired
  */
  
  @Schema(name = "response_letter_required", description = "Обязательно ли заполнять сообщение при отклике на вакансию", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("response_letter_required")
  public Boolean getResponseLetterRequired() {
    return responseLetterRequired;
  }

  public void setResponseLetterRequired(Boolean responseLetterRequired) {
    this.responseLetterRequired = responseLetterRequired;
  }

  public VacancyCreate responseNotifications(Boolean responseNotifications) {
    this.responseNotifications = responseNotifications;
    return this;
  }

  /**
   * Уведомлять ли менеджера о новых откликах
   * @return responseNotifications
  */
  
  @Schema(name = "response_notifications", description = "Уведомлять ли менеджера о новых откликах", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("response_notifications")
  public Boolean getResponseNotifications() {
    return responseNotifications;
  }

  public void setResponseNotifications(Boolean responseNotifications) {
    this.responseNotifications = responseNotifications;
  }

  public VacancyCreate responseUrl(String responseUrl) {
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

  public VacancyCreate salary(VacancySalary salary) {
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

  public VacancyCreate salaryRange(VacancySalaryRangeSalaryRange salaryRange) {
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
  public VacancySalaryRangeSalaryRange getSalaryRange() {
    return salaryRange;
  }

  public void setSalaryRange(VacancySalaryRangeSalaryRange salaryRange) {
    this.salaryRange = salaryRange;
  }

  public VacancyCreate schedule(VacancySchedule schedule) {
    this.schedule = schedule;
    return this;
  }

  /**
   * Get schedule
   * @return schedule
   * @deprecated
  */
  @Valid 
  @Schema(name = "schedule", deprecated = true, requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("schedule")
  @Deprecated
  public VacancySchedule getSchedule() {
    return schedule;
  }

  /**
   * @deprecated
  */
  @Deprecated
  public void setSchedule(VacancySchedule schedule) {
    this.schedule = schedule;
  }

  public VacancyCreate showContacts(Boolean showContacts) {
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

  public VacancyCreate test(VacancyDraftTest test) {
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

  public VacancyCreate workFormat(List<@Valid VacancyWorkFormatWorkFormatItem> workFormat) {
    this.workFormat = workFormat;
    return this;
  }

  public VacancyCreate addWorkFormatItem(VacancyWorkFormatWorkFormatItem workFormatItem) {
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
  public List<@Valid VacancyWorkFormatWorkFormatItem> getWorkFormat() {
    return workFormat;
  }

  public void setWorkFormat(List<@Valid VacancyWorkFormatWorkFormatItem> workFormat) {
    this.workFormat = workFormat;
  }

  public VacancyCreate workScheduleByDays(List<@Valid VacancyWorkScheduleByDaysWorkScheduleByDaysItem> workScheduleByDays) {
    this.workScheduleByDays = workScheduleByDays;
    return this;
  }

  public VacancyCreate addWorkScheduleByDaysItem(VacancyWorkScheduleByDaysWorkScheduleByDaysItem workScheduleByDaysItem) {
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
  public List<@Valid VacancyWorkScheduleByDaysWorkScheduleByDaysItem> getWorkScheduleByDays() {
    return workScheduleByDays;
  }

  public void setWorkScheduleByDays(List<@Valid VacancyWorkScheduleByDaysWorkScheduleByDaysItem> workScheduleByDays) {
    this.workScheduleByDays = workScheduleByDays;
  }

  public VacancyCreate workingDays(List<@Valid VacancyWorkingDayItem> workingDays) {
    this.workingDays = workingDays;
    return this;
  }

  public VacancyCreate addWorkingDaysItem(VacancyWorkingDayItem workingDaysItem) {
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
  public List<@Valid VacancyWorkingDayItem> getWorkingDays() {
    return workingDays;
  }

  /**
   * @deprecated
  */
  @Deprecated
  public void setWorkingDays(List<@Valid VacancyWorkingDayItem> workingDays) {
    this.workingDays = workingDays;
  }

  public VacancyCreate workingHours(List<@Valid VacancyWorkingHoursWorkingHoursItem> workingHours) {
    this.workingHours = workingHours;
    return this;
  }

  public VacancyCreate addWorkingHoursItem(VacancyWorkingHoursWorkingHoursItem workingHoursItem) {
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
  public List<@Valid VacancyWorkingHoursWorkingHoursItem> getWorkingHours() {
    return workingHours;
  }

  public void setWorkingHours(List<@Valid VacancyWorkingHoursWorkingHoursItem> workingHours) {
    this.workingHours = workingHours;
  }

  public VacancyCreate workingTimeIntervals(List<@Valid VacancyWorkingTimeIntervalItem> workingTimeIntervals) {
    this.workingTimeIntervals = workingTimeIntervals;
    return this;
  }

  public VacancyCreate addWorkingTimeIntervalsItem(VacancyWorkingTimeIntervalItem workingTimeIntervalsItem) {
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
  public List<@Valid VacancyWorkingTimeIntervalItem> getWorkingTimeIntervals() {
    return workingTimeIntervals;
  }

  /**
   * @deprecated
  */
  @Deprecated
  public void setWorkingTimeIntervals(List<@Valid VacancyWorkingTimeIntervalItem> workingTimeIntervals) {
    this.workingTimeIntervals = workingTimeIntervals;
  }

  public VacancyCreate workingTimeModes(List<@Valid VacancyWorkingTimeModeItem> workingTimeModes) {
    this.workingTimeModes = workingTimeModes;
    return this;
  }

  public VacancyCreate addWorkingTimeModesItem(VacancyWorkingTimeModeItem workingTimeModesItem) {
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
  public List<@Valid VacancyWorkingTimeModeItem> getWorkingTimeModes() {
    return workingTimeModes;
  }

  /**
   * @deprecated
  */
  @Deprecated
  public void setWorkingTimeModes(List<@Valid VacancyWorkingTimeModeItem> workingTimeModes) {
    this.workingTimeModes = workingTimeModes;
  }

  public VacancyCreate area(VacancyArea area) {
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
  public VacancyArea getArea() {
    return area;
  }

  public void setArea(VacancyArea area) {
    this.area = area;
  }

  public VacancyCreate billingType(VacancyBillingType billingType) {
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
  public VacancyBillingType getBillingType() {
    return billingType;
  }

  public void setBillingType(VacancyBillingType billingType) {
    this.billingType = billingType;
  }

  public VacancyCreate description(String description) {
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

  public VacancyCreate manager(VacancyManager manager) {
    this.manager = manager;
    return this;
  }

  /**
   * Get manager
   * @return manager
  */
  @Valid 
  @Schema(name = "manager", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("manager")
  public VacancyManager getManager() {
    return manager;
  }

  public void setManager(VacancyManager manager) {
    this.manager = manager;
  }

  public VacancyCreate name(String name) {
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

  public VacancyCreate previousId(String previousId) {
    this.previousId = previousId;
    return this;
  }

  /**
   * Если этот параметр передан, то у новой вакансии дополнительно будет создана связь с предыдущей вакансией (поле previous_id). Этот параметр не влияет на другие и не связан с ними, их всё равно необходимо передавать.  Должен быть равен только ID архивной вакансии. ID архивной вакансии можно получить, запросив [список архивных вакансий](#tag/Upravlenie-vakansiyami/operation/get-archived-vacancies) <a name='previous_id'></a> 
   * @return previousId
  */
  
  @Schema(name = "previous_id", description = "Если этот параметр передан, то у новой вакансии дополнительно будет создана связь с предыдущей вакансией (поле previous_id). Этот параметр не влияет на другие и не связан с ними, их всё равно необходимо передавать.  Должен быть равен только ID архивной вакансии. ID архивной вакансии можно получить, запросив [список архивных вакансий](#tag/Upravlenie-vakansiyami/operation/get-archived-vacancies) <a name='previous_id'></a> ", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("previous_id")
  public String getPreviousId() {
    return previousId;
  }

  public void setPreviousId(String previousId) {
    this.previousId = previousId;
  }

  public VacancyCreate type(VacancyType type) {
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
  public VacancyType getType() {
    return type;
  }

  public void setType(VacancyType type) {
    this.type = type;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    VacancyCreate vacancyCreate = (VacancyCreate) o;
    return Objects.equals(this.acceptHandicapped, vacancyCreate.acceptHandicapped) &&
        Objects.equals(this.acceptIncompleteResumes, vacancyCreate.acceptIncompleteResumes) &&
        Objects.equals(this.acceptKids, vacancyCreate.acceptKids) &&
        Objects.equals(this.acceptTemporary, vacancyCreate.acceptTemporary) &&
        Objects.equals(this.address, vacancyCreate.address) &&
        Objects.equals(this.ageRestriction, vacancyCreate.ageRestriction) &&
        Objects.equals(this.allowMessages, vacancyCreate.allowMessages) &&
        Objects.equals(this.brandedTemplate, vacancyCreate.brandedTemplate) &&
        Objects.equals(this.code, vacancyCreate.code) &&
        Objects.equals(this.contacts, vacancyCreate.contacts) &&
        Objects.equals(this.customEmployerName, vacancyCreate.customEmployerName) &&
        Objects.equals(this.department, vacancyCreate.department) &&
        Objects.equals(this.driverLicenseTypes, vacancyCreate.driverLicenseTypes) &&
        Objects.equals(this.employment, vacancyCreate.employment) &&
        Objects.equals(this.employmentForm, vacancyCreate.employmentForm) &&
        Objects.equals(this.experience, vacancyCreate.experience) &&
        Objects.equals(this.flyInFlyOutDuration, vacancyCreate.flyInFlyOutDuration) &&
        Objects.equals(this.internship, vacancyCreate.internship) &&
        Objects.equals(this.keySkills, vacancyCreate.keySkills) &&
        Objects.equals(this.languages, vacancyCreate.languages) &&
        Objects.equals(this.nightShifts, vacancyCreate.nightShifts) &&
        Objects.equals(this.professionalRoles, vacancyCreate.professionalRoles) &&
        Objects.equals(this.responseLetterRequired, vacancyCreate.responseLetterRequired) &&
        Objects.equals(this.responseNotifications, vacancyCreate.responseNotifications) &&
        Objects.equals(this.responseUrl, vacancyCreate.responseUrl) &&
        Objects.equals(this.salary, vacancyCreate.salary) &&
        Objects.equals(this.salaryRange, vacancyCreate.salaryRange) &&
        Objects.equals(this.schedule, vacancyCreate.schedule) &&
        Objects.equals(this.showContacts, vacancyCreate.showContacts) &&
        Objects.equals(this.test, vacancyCreate.test) &&
        Objects.equals(this.workFormat, vacancyCreate.workFormat) &&
        Objects.equals(this.workScheduleByDays, vacancyCreate.workScheduleByDays) &&
        Objects.equals(this.workingDays, vacancyCreate.workingDays) &&
        Objects.equals(this.workingHours, vacancyCreate.workingHours) &&
        Objects.equals(this.workingTimeIntervals, vacancyCreate.workingTimeIntervals) &&
        Objects.equals(this.workingTimeModes, vacancyCreate.workingTimeModes) &&
        Objects.equals(this.area, vacancyCreate.area) &&
        Objects.equals(this.billingType, vacancyCreate.billingType) &&
        Objects.equals(this.description, vacancyCreate.description) &&
        Objects.equals(this.manager, vacancyCreate.manager) &&
        Objects.equals(this.name, vacancyCreate.name) &&
        Objects.equals(this.previousId, vacancyCreate.previousId) &&
        Objects.equals(this.type, vacancyCreate.type);
  }

  @Override
  public int hashCode() {
    return Objects.hash(acceptHandicapped, acceptIncompleteResumes, acceptKids, acceptTemporary, address, ageRestriction, allowMessages, brandedTemplate, code, contacts, customEmployerName, department, driverLicenseTypes, employment, employmentForm, experience, flyInFlyOutDuration, internship, keySkills, languages, nightShifts, professionalRoles, responseLetterRequired, responseNotifications, responseUrl, salary, salaryRange, schedule, showContacts, test, workFormat, workScheduleByDays, workingDays, workingHours, workingTimeIntervals, workingTimeModes, area, billingType, description, manager, name, previousId, type);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class VacancyCreate {\n");
    sb.append("    acceptHandicapped: ").append(toIndentedString(acceptHandicapped)).append("\n");
    sb.append("    acceptIncompleteResumes: ").append(toIndentedString(acceptIncompleteResumes)).append("\n");
    sb.append("    acceptKids: ").append(toIndentedString(acceptKids)).append("\n");
    sb.append("    acceptTemporary: ").append(toIndentedString(acceptTemporary)).append("\n");
    sb.append("    address: ").append(toIndentedString(address)).append("\n");
    sb.append("    ageRestriction: ").append(toIndentedString(ageRestriction)).append("\n");
    sb.append("    allowMessages: ").append(toIndentedString(allowMessages)).append("\n");
    sb.append("    brandedTemplate: ").append(toIndentedString(brandedTemplate)).append("\n");
    sb.append("    code: ").append(toIndentedString(code)).append("\n");
    sb.append("    contacts: ").append(toIndentedString(contacts)).append("\n");
    sb.append("    customEmployerName: ").append(toIndentedString(customEmployerName)).append("\n");
    sb.append("    department: ").append(toIndentedString(department)).append("\n");
    sb.append("    driverLicenseTypes: ").append(toIndentedString(driverLicenseTypes)).append("\n");
    sb.append("    employment: ").append(toIndentedString(employment)).append("\n");
    sb.append("    employmentForm: ").append(toIndentedString(employmentForm)).append("\n");
    sb.append("    experience: ").append(toIndentedString(experience)).append("\n");
    sb.append("    flyInFlyOutDuration: ").append(toIndentedString(flyInFlyOutDuration)).append("\n");
    sb.append("    internship: ").append(toIndentedString(internship)).append("\n");
    sb.append("    keySkills: ").append(toIndentedString(keySkills)).append("\n");
    sb.append("    languages: ").append(toIndentedString(languages)).append("\n");
    sb.append("    nightShifts: ").append(toIndentedString(nightShifts)).append("\n");
    sb.append("    professionalRoles: ").append(toIndentedString(professionalRoles)).append("\n");
    sb.append("    responseLetterRequired: ").append(toIndentedString(responseLetterRequired)).append("\n");
    sb.append("    responseNotifications: ").append(toIndentedString(responseNotifications)).append("\n");
    sb.append("    responseUrl: ").append(toIndentedString(responseUrl)).append("\n");
    sb.append("    salary: ").append(toIndentedString(salary)).append("\n");
    sb.append("    salaryRange: ").append(toIndentedString(salaryRange)).append("\n");
    sb.append("    schedule: ").append(toIndentedString(schedule)).append("\n");
    sb.append("    showContacts: ").append(toIndentedString(showContacts)).append("\n");
    sb.append("    test: ").append(toIndentedString(test)).append("\n");
    sb.append("    workFormat: ").append(toIndentedString(workFormat)).append("\n");
    sb.append("    workScheduleByDays: ").append(toIndentedString(workScheduleByDays)).append("\n");
    sb.append("    workingDays: ").append(toIndentedString(workingDays)).append("\n");
    sb.append("    workingHours: ").append(toIndentedString(workingHours)).append("\n");
    sb.append("    workingTimeIntervals: ").append(toIndentedString(workingTimeIntervals)).append("\n");
    sb.append("    workingTimeModes: ").append(toIndentedString(workingTimeModes)).append("\n");
    sb.append("    area: ").append(toIndentedString(area)).append("\n");
    sb.append("    billingType: ").append(toIndentedString(billingType)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    manager: ").append(toIndentedString(manager)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    previousId: ").append(toIndentedString(previousId)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
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

