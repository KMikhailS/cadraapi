package ru.brobrocode.cadra.client.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.annotation.Generated;
import jakarta.validation.Valid;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * VacancyDraftVacancyDraftEdit
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2025-08-17T15:41:09.394389505+05:00[Asia/Yekaterinburg]", comments = "Generator version: 7.6.0")
public class VacancyDraftVacancyDraftEdit {

  private Boolean acceptHandicapped;

  private Boolean acceptIncompleteResumes;

  @Deprecated
  private Boolean acceptKids;

  private Boolean acceptTemporary = null;

  private VacancyDraftAddress address = null;

  private VacancyAgeRestriction ageRestriction = null;

  private Boolean allowMessages;

  private VacancyArea area = null;

  @Valid
  private List<@Valid VacancyArea> areas;

  private String assignedManagerId = null;

  private VacancyDraftBrandedTemplate brandedTemplate = null;

  private String code = null;

  private VacancyDraftContacts contacts = null;

  private String customEmployerName = null;

  private VacancyDepartment department = null;

  private String description = null;

  @Valid
  private List<@Valid VacancyDriverLicenceTypeItem> driverLicenseTypes = new ArrayList<>();

  private VacancyDraftEmployment employment = null;

  private VacancyEmploymentForm employmentForm = null;

  private VacancyExperience experience = null;

  @Valid
  private List<@Valid VacancyFlyInFlyOutDurationFlyInFlyOutDurationItem> flyInFlyOutDuration;

  private Boolean internship = null;

  @Valid
  private List<@Valid VacancyDraftKeySkillItem> keySkills;

  @Valid
  private List<@Valid VacancyLanguage> languages = new ArrayList<>();

  private String name = null;

  private Boolean nightShifts = null;

  @Valid
  private List<@Valid VacancyDraftProfessionalRoleItem> professionalRoles;

  private Boolean responseLetterRequired;

  private Boolean responseNotifications;

  private String responseUrl = null;

  @Deprecated
  private VacancySalary salary = null;

  private VacancySalaryRangeSalaryRange salaryRange = null;

  @Deprecated
  private VacancySchedule schedule = null;

  private String scheduledAt;

  private String sideJob = null;

  private VacancyDraftTest test = null;

  private Boolean withZp;

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

  private VacancyDraftBillingType billingType = null;

  private VacancyDraftType type = null;

  public VacancyDraftVacancyDraftEdit acceptHandicapped(Boolean acceptHandicapped) {
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

  public VacancyDraftVacancyDraftEdit acceptIncompleteResumes(Boolean acceptIncompleteResumes) {
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

  public VacancyDraftVacancyDraftEdit acceptKids(Boolean acceptKids) {
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

  public VacancyDraftVacancyDraftEdit acceptTemporary(Boolean acceptTemporary) {
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

  public VacancyDraftVacancyDraftEdit address(VacancyDraftAddress address) {
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
  public VacancyDraftAddress getAddress() {
    return address;
  }

  public void setAddress(VacancyDraftAddress address) {
    this.address = address;
  }

  public VacancyDraftVacancyDraftEdit ageRestriction(VacancyAgeRestriction ageRestriction) {
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

  public VacancyDraftVacancyDraftEdit allowMessages(Boolean allowMessages) {
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

  public VacancyDraftVacancyDraftEdit area(VacancyArea area) {
    this.area = area;
    return this;
  }

  /**
   * Get area
   * @return area
  */
  @Valid 
  @Schema(name = "area", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("area")
  public VacancyArea getArea() {
    return area;
  }

  public void setArea(VacancyArea area) {
    this.area = area;
  }

  public VacancyDraftVacancyDraftEdit areas(List<@Valid VacancyArea> areas) {
    this.areas = areas;
    return this;
  }

  public VacancyDraftVacancyDraftEdit addAreasItem(VacancyArea areasItem) {
    if (this.areas == null) {
      this.areas = new ArrayList<>();
    }
    this.areas.add(areasItem);
    return this;
  }

  /**
   * Список регионов
   * @return areas
  */
  @Valid 
  @Schema(name = "areas", description = "Список регионов", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("areas")
  public List<@Valid VacancyArea> getAreas() {
    return areas;
  }

  public void setAreas(List<@Valid VacancyArea> areas) {
    this.areas = areas;
  }

  public VacancyDraftVacancyDraftEdit assignedManagerId(String assignedManagerId) {
    this.assignedManagerId = assignedManagerId;
    return this;
  }

  /**
   * Идентификатор рабочего аккаунта менеджера, которому перейдет вакансия после публикации
   * @return assignedManagerId
  */
  
  @Schema(name = "assigned_manager_id", description = "Идентификатор рабочего аккаунта менеджера, которому перейдет вакансия после публикации", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("assigned_manager_id")
  public String getAssignedManagerId() {
    return assignedManagerId;
  }

  public void setAssignedManagerId(String assignedManagerId) {
    this.assignedManagerId = assignedManagerId;
  }

  public VacancyDraftVacancyDraftEdit brandedTemplate(VacancyDraftBrandedTemplate brandedTemplate) {
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
  public VacancyDraftBrandedTemplate getBrandedTemplate() {
    return brandedTemplate;
  }

  public void setBrandedTemplate(VacancyDraftBrandedTemplate brandedTemplate) {
    this.brandedTemplate = brandedTemplate;
  }

  public VacancyDraftVacancyDraftEdit code(String code) {
    this.code = code;
    return this;
  }

  /**
   * Внутренний код вакансии
   * @return code
  */
  @Size(min = 1) 
  @Schema(name = "code", description = "Внутренний код вакансии", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("code")
  public String getCode() {
    return code;
  }

  public void setCode(String code) {
    this.code = code;
  }

  public VacancyDraftVacancyDraftEdit contacts(VacancyDraftContacts contacts) {
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
  public VacancyDraftContacts getContacts() {
    return contacts;
  }

  public void setContacts(VacancyDraftContacts contacts) {
    this.contacts = contacts;
  }

  public VacancyDraftVacancyDraftEdit customEmployerName(String customEmployerName) {
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

  public VacancyDraftVacancyDraftEdit department(VacancyDepartment department) {
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

  public VacancyDraftVacancyDraftEdit description(String description) {
    this.description = description;
    return this;
  }

  /**
   * Описание в html, минимум 1 символ, для успешной публикации вакансии не менее 200 символов
   * @return description
  */
  @Size(min = 1) 
  @Schema(name = "description", description = "Описание в html, минимум 1 символ, для успешной публикации вакансии не менее 200 символов", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("description")
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public VacancyDraftVacancyDraftEdit driverLicenseTypes(List<@Valid VacancyDriverLicenceTypeItem> driverLicenseTypes) {
    this.driverLicenseTypes = driverLicenseTypes;
    return this;
  }

  public VacancyDraftVacancyDraftEdit addDriverLicenseTypesItem(VacancyDriverLicenceTypeItem driverLicenseTypesItem) {
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

  public VacancyDraftVacancyDraftEdit employment(VacancyDraftEmployment employment) {
    this.employment = employment;
    return this;
  }

  /**
   * Get employment
   * @return employment
  */
  @Valid 
  @Schema(name = "employment", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("employment")
  public VacancyDraftEmployment getEmployment() {
    return employment;
  }

  public void setEmployment(VacancyDraftEmployment employment) {
    this.employment = employment;
  }

  public VacancyDraftVacancyDraftEdit employmentForm(VacancyEmploymentForm employmentForm) {
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

  public VacancyDraftVacancyDraftEdit experience(VacancyExperience experience) {
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

  public VacancyDraftVacancyDraftEdit flyInFlyOutDuration(List<@Valid VacancyFlyInFlyOutDurationFlyInFlyOutDurationItem> flyInFlyOutDuration) {
    this.flyInFlyOutDuration = flyInFlyOutDuration;
    return this;
  }

  public VacancyDraftVacancyDraftEdit addFlyInFlyOutDurationItem(VacancyFlyInFlyOutDurationFlyInFlyOutDurationItem flyInFlyOutDurationItem) {
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

  public VacancyDraftVacancyDraftEdit internship(Boolean internship) {
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

  public VacancyDraftVacancyDraftEdit keySkills(List<@Valid VacancyDraftKeySkillItem> keySkills) {
    this.keySkills = keySkills;
    return this;
  }

  public VacancyDraftVacancyDraftEdit addKeySkillsItem(VacancyDraftKeySkillItem keySkillsItem) {
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
  public List<@Valid VacancyDraftKeySkillItem> getKeySkills() {
    return keySkills;
  }

  public void setKeySkills(List<@Valid VacancyDraftKeySkillItem> keySkills) {
    this.keySkills = keySkills;
  }

  public VacancyDraftVacancyDraftEdit languages(List<@Valid VacancyLanguage> languages) {
    this.languages = languages;
    return this;
  }

  public VacancyDraftVacancyDraftEdit addLanguagesItem(VacancyLanguage languagesItem) {
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

  public VacancyDraftVacancyDraftEdit name(String name) {
    this.name = name;
    return this;
  }

  /**
   * Название
   * @return name
  */
  @Size(min = 1) 
  @Schema(name = "name", description = "Название", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("name")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public VacancyDraftVacancyDraftEdit nightShifts(Boolean nightShifts) {
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

  public VacancyDraftVacancyDraftEdit professionalRoles(List<@Valid VacancyDraftProfessionalRoleItem> professionalRoles) {
    this.professionalRoles = professionalRoles;
    return this;
  }

  public VacancyDraftVacancyDraftEdit addProfessionalRolesItem(VacancyDraftProfessionalRoleItem professionalRolesItem) {
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
  @Valid 
  @Schema(name = "professional_roles", description = "Список профессиональных ролей", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("professional_roles")
  public List<@Valid VacancyDraftProfessionalRoleItem> getProfessionalRoles() {
    return professionalRoles;
  }

  public void setProfessionalRoles(List<@Valid VacancyDraftProfessionalRoleItem> professionalRoles) {
    this.professionalRoles = professionalRoles;
  }

  public VacancyDraftVacancyDraftEdit responseLetterRequired(Boolean responseLetterRequired) {
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

  public VacancyDraftVacancyDraftEdit responseNotifications(Boolean responseNotifications) {
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

  public VacancyDraftVacancyDraftEdit responseUrl(String responseUrl) {
    this.responseUrl = responseUrl;
    return this;
  }

  /**
   * URL отклика для прямых вакансий (`type.id=direct`)
   * @return responseUrl
  */
  @Size(min = 1) 
  @Schema(name = "response_url", description = "URL отклика для прямых вакансий (`type.id=direct`)", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("response_url")
  public String getResponseUrl() {
    return responseUrl;
  }

  public void setResponseUrl(String responseUrl) {
    this.responseUrl = responseUrl;
  }

  public VacancyDraftVacancyDraftEdit salary(VacancySalary salary) {
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

  public VacancyDraftVacancyDraftEdit salaryRange(VacancySalaryRangeSalaryRange salaryRange) {
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

  public VacancyDraftVacancyDraftEdit schedule(VacancySchedule schedule) {
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

  public VacancyDraftVacancyDraftEdit scheduledAt(String scheduledAt) {
    this.scheduledAt = scheduledAt;
    return this;
  }

  /**
   * Время запланированной публикации вакансии (в формате [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601) с точностью до секунды: `YYYY-MM-DDThh:mm:ss±hhmm`
   * @return scheduledAt
  */
  @Pattern(regexp = "^\\d{4}-[01]\\d-[0-3]\\dT[0-2]\\d:[0-5]\\d:[0-5]\\d(?:\\.\\d+)?((\\+|-)[0-1][0-9]{3})?$") 
  @Schema(name = "scheduled_at", description = "Время запланированной публикации вакансии (в формате [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601) с точностью до секунды: `YYYY-MM-DDThh:mm:ss±hhmm`", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("scheduled_at")
  public String getScheduledAt() {
    return scheduledAt;
  }

  public void setScheduledAt(String scheduledAt) {
    this.scheduledAt = scheduledAt;
  }

  public VacancyDraftVacancyDraftEdit sideJob(String sideJob) {
    this.sideJob = sideJob;
    return this;
  }

  /**
   * Get sideJob
   * @return sideJob
  */
  @Valid 
  @Schema(name = "side_job", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("side_job")
  public String getSideJob() {
    return sideJob;
  }

  public void setSideJob(String sideJob) {
    this.sideJob = sideJob;
  }

  public VacancyDraftVacancyDraftEdit test(VacancyDraftTest test) {
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

  public VacancyDraftVacancyDraftEdit withZp(Boolean withZp) {
    this.withZp = withZp;
    return this;
  }

  /**
   * Вашу вакансию увидят больше людей. Мы разместим ее дополнительно на сервисе Зарплата.ру
   * @return withZp
  */
  
  @Schema(name = "with_zp", description = "Вашу вакансию увидят больше людей. Мы разместим ее дополнительно на сервисе Зарплата.ру", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("with_zp")
  public Boolean getWithZp() {
    return withZp;
  }

  public void setWithZp(Boolean withZp) {
    this.withZp = withZp;
  }

  public VacancyDraftVacancyDraftEdit workFormat(List<@Valid VacancyWorkFormatWorkFormatItem> workFormat) {
    this.workFormat = workFormat;
    return this;
  }

  public VacancyDraftVacancyDraftEdit addWorkFormatItem(VacancyWorkFormatWorkFormatItem workFormatItem) {
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

  public VacancyDraftVacancyDraftEdit workScheduleByDays(List<@Valid VacancyWorkScheduleByDaysWorkScheduleByDaysItem> workScheduleByDays) {
    this.workScheduleByDays = workScheduleByDays;
    return this;
  }

  public VacancyDraftVacancyDraftEdit addWorkScheduleByDaysItem(VacancyWorkScheduleByDaysWorkScheduleByDaysItem workScheduleByDaysItem) {
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

  public VacancyDraftVacancyDraftEdit workingDays(List<@Valid VacancyWorkingDayItem> workingDays) {
    this.workingDays = workingDays;
    return this;
  }

  public VacancyDraftVacancyDraftEdit addWorkingDaysItem(VacancyWorkingDayItem workingDaysItem) {
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

  public VacancyDraftVacancyDraftEdit workingHours(List<@Valid VacancyWorkingHoursWorkingHoursItem> workingHours) {
    this.workingHours = workingHours;
    return this;
  }

  public VacancyDraftVacancyDraftEdit addWorkingHoursItem(VacancyWorkingHoursWorkingHoursItem workingHoursItem) {
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

  public VacancyDraftVacancyDraftEdit workingTimeIntervals(List<@Valid VacancyWorkingTimeIntervalItem> workingTimeIntervals) {
    this.workingTimeIntervals = workingTimeIntervals;
    return this;
  }

  public VacancyDraftVacancyDraftEdit addWorkingTimeIntervalsItem(VacancyWorkingTimeIntervalItem workingTimeIntervalsItem) {
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

  public VacancyDraftVacancyDraftEdit workingTimeModes(List<@Valid VacancyWorkingTimeModeItem> workingTimeModes) {
    this.workingTimeModes = workingTimeModes;
    return this;
  }

  public VacancyDraftVacancyDraftEdit addWorkingTimeModesItem(VacancyWorkingTimeModeItem workingTimeModesItem) {
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

  public VacancyDraftVacancyDraftEdit billingType(VacancyDraftBillingType billingType) {
    this.billingType = billingType;
    return this;
  }

  /**
   * Get billingType
   * @return billingType
  */
  @Valid 
  @Schema(name = "billing_type", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("billing_type")
  public VacancyDraftBillingType getBillingType() {
    return billingType;
  }

  public void setBillingType(VacancyDraftBillingType billingType) {
    this.billingType = billingType;
  }

  public VacancyDraftVacancyDraftEdit type(VacancyDraftType type) {
    this.type = type;
    return this;
  }

  /**
   * Get type
   * @return type
  */
  @Valid 
  @Schema(name = "type", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("type")
  public VacancyDraftType getType() {
    return type;
  }

  public void setType(VacancyDraftType type) {
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
    VacancyDraftVacancyDraftEdit vacancyDraftVacancyDraftEdit = (VacancyDraftVacancyDraftEdit) o;
    return Objects.equals(this.acceptHandicapped, vacancyDraftVacancyDraftEdit.acceptHandicapped) &&
        Objects.equals(this.acceptIncompleteResumes, vacancyDraftVacancyDraftEdit.acceptIncompleteResumes) &&
        Objects.equals(this.acceptKids, vacancyDraftVacancyDraftEdit.acceptKids) &&
        Objects.equals(this.acceptTemporary, vacancyDraftVacancyDraftEdit.acceptTemporary) &&
        Objects.equals(this.address, vacancyDraftVacancyDraftEdit.address) &&
        Objects.equals(this.ageRestriction, vacancyDraftVacancyDraftEdit.ageRestriction) &&
        Objects.equals(this.allowMessages, vacancyDraftVacancyDraftEdit.allowMessages) &&
        Objects.equals(this.area, vacancyDraftVacancyDraftEdit.area) &&
        Objects.equals(this.areas, vacancyDraftVacancyDraftEdit.areas) &&
        Objects.equals(this.assignedManagerId, vacancyDraftVacancyDraftEdit.assignedManagerId) &&
        Objects.equals(this.brandedTemplate, vacancyDraftVacancyDraftEdit.brandedTemplate) &&
        Objects.equals(this.code, vacancyDraftVacancyDraftEdit.code) &&
        Objects.equals(this.contacts, vacancyDraftVacancyDraftEdit.contacts) &&
        Objects.equals(this.customEmployerName, vacancyDraftVacancyDraftEdit.customEmployerName) &&
        Objects.equals(this.department, vacancyDraftVacancyDraftEdit.department) &&
        Objects.equals(this.description, vacancyDraftVacancyDraftEdit.description) &&
        Objects.equals(this.driverLicenseTypes, vacancyDraftVacancyDraftEdit.driverLicenseTypes) &&
        Objects.equals(this.employment, vacancyDraftVacancyDraftEdit.employment) &&
        Objects.equals(this.employmentForm, vacancyDraftVacancyDraftEdit.employmentForm) &&
        Objects.equals(this.experience, vacancyDraftVacancyDraftEdit.experience) &&
        Objects.equals(this.flyInFlyOutDuration, vacancyDraftVacancyDraftEdit.flyInFlyOutDuration) &&
        Objects.equals(this.internship, vacancyDraftVacancyDraftEdit.internship) &&
        Objects.equals(this.keySkills, vacancyDraftVacancyDraftEdit.keySkills) &&
        Objects.equals(this.languages, vacancyDraftVacancyDraftEdit.languages) &&
        Objects.equals(this.name, vacancyDraftVacancyDraftEdit.name) &&
        Objects.equals(this.nightShifts, vacancyDraftVacancyDraftEdit.nightShifts) &&
        Objects.equals(this.professionalRoles, vacancyDraftVacancyDraftEdit.professionalRoles) &&
        Objects.equals(this.responseLetterRequired, vacancyDraftVacancyDraftEdit.responseLetterRequired) &&
        Objects.equals(this.responseNotifications, vacancyDraftVacancyDraftEdit.responseNotifications) &&
        Objects.equals(this.responseUrl, vacancyDraftVacancyDraftEdit.responseUrl) &&
        Objects.equals(this.salary, vacancyDraftVacancyDraftEdit.salary) &&
        Objects.equals(this.salaryRange, vacancyDraftVacancyDraftEdit.salaryRange) &&
        Objects.equals(this.schedule, vacancyDraftVacancyDraftEdit.schedule) &&
        Objects.equals(this.scheduledAt, vacancyDraftVacancyDraftEdit.scheduledAt) &&
        Objects.equals(this.sideJob, vacancyDraftVacancyDraftEdit.sideJob) &&
        Objects.equals(this.test, vacancyDraftVacancyDraftEdit.test) &&
        Objects.equals(this.withZp, vacancyDraftVacancyDraftEdit.withZp) &&
        Objects.equals(this.workFormat, vacancyDraftVacancyDraftEdit.workFormat) &&
        Objects.equals(this.workScheduleByDays, vacancyDraftVacancyDraftEdit.workScheduleByDays) &&
        Objects.equals(this.workingDays, vacancyDraftVacancyDraftEdit.workingDays) &&
        Objects.equals(this.workingHours, vacancyDraftVacancyDraftEdit.workingHours) &&
        Objects.equals(this.workingTimeIntervals, vacancyDraftVacancyDraftEdit.workingTimeIntervals) &&
        Objects.equals(this.workingTimeModes, vacancyDraftVacancyDraftEdit.workingTimeModes) &&
        Objects.equals(this.billingType, vacancyDraftVacancyDraftEdit.billingType) &&
        Objects.equals(this.type, vacancyDraftVacancyDraftEdit.type);
  }

  @Override
  public int hashCode() {
    return Objects.hash(acceptHandicapped, acceptIncompleteResumes, acceptKids, acceptTemporary, address, ageRestriction, allowMessages, area, areas, assignedManagerId, brandedTemplate, code, contacts, customEmployerName, department, description, driverLicenseTypes, employment, employmentForm, experience, flyInFlyOutDuration, internship, keySkills, languages, name, nightShifts, professionalRoles, responseLetterRequired, responseNotifications, responseUrl, salary, salaryRange, schedule, scheduledAt, sideJob, test, withZp, workFormat, workScheduleByDays, workingDays, workingHours, workingTimeIntervals, workingTimeModes, billingType, type);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class VacancyDraftVacancyDraftEdit {\n");
    sb.append("    acceptHandicapped: ").append(toIndentedString(acceptHandicapped)).append("\n");
    sb.append("    acceptIncompleteResumes: ").append(toIndentedString(acceptIncompleteResumes)).append("\n");
    sb.append("    acceptKids: ").append(toIndentedString(acceptKids)).append("\n");
    sb.append("    acceptTemporary: ").append(toIndentedString(acceptTemporary)).append("\n");
    sb.append("    address: ").append(toIndentedString(address)).append("\n");
    sb.append("    ageRestriction: ").append(toIndentedString(ageRestriction)).append("\n");
    sb.append("    allowMessages: ").append(toIndentedString(allowMessages)).append("\n");
    sb.append("    area: ").append(toIndentedString(area)).append("\n");
    sb.append("    areas: ").append(toIndentedString(areas)).append("\n");
    sb.append("    assignedManagerId: ").append(toIndentedString(assignedManagerId)).append("\n");
    sb.append("    brandedTemplate: ").append(toIndentedString(brandedTemplate)).append("\n");
    sb.append("    code: ").append(toIndentedString(code)).append("\n");
    sb.append("    contacts: ").append(toIndentedString(contacts)).append("\n");
    sb.append("    customEmployerName: ").append(toIndentedString(customEmployerName)).append("\n");
    sb.append("    department: ").append(toIndentedString(department)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    driverLicenseTypes: ").append(toIndentedString(driverLicenseTypes)).append("\n");
    sb.append("    employment: ").append(toIndentedString(employment)).append("\n");
    sb.append("    employmentForm: ").append(toIndentedString(employmentForm)).append("\n");
    sb.append("    experience: ").append(toIndentedString(experience)).append("\n");
    sb.append("    flyInFlyOutDuration: ").append(toIndentedString(flyInFlyOutDuration)).append("\n");
    sb.append("    internship: ").append(toIndentedString(internship)).append("\n");
    sb.append("    keySkills: ").append(toIndentedString(keySkills)).append("\n");
    sb.append("    languages: ").append(toIndentedString(languages)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    nightShifts: ").append(toIndentedString(nightShifts)).append("\n");
    sb.append("    professionalRoles: ").append(toIndentedString(professionalRoles)).append("\n");
    sb.append("    responseLetterRequired: ").append(toIndentedString(responseLetterRequired)).append("\n");
    sb.append("    responseNotifications: ").append(toIndentedString(responseNotifications)).append("\n");
    sb.append("    responseUrl: ").append(toIndentedString(responseUrl)).append("\n");
    sb.append("    salary: ").append(toIndentedString(salary)).append("\n");
    sb.append("    salaryRange: ").append(toIndentedString(salaryRange)).append("\n");
    sb.append("    schedule: ").append(toIndentedString(schedule)).append("\n");
    sb.append("    scheduledAt: ").append(toIndentedString(scheduledAt)).append("\n");
    sb.append("    sideJob: ").append(toIndentedString(sideJob)).append("\n");
    sb.append("    test: ").append(toIndentedString(test)).append("\n");
    sb.append("    withZp: ").append(toIndentedString(withZp)).append("\n");
    sb.append("    workFormat: ").append(toIndentedString(workFormat)).append("\n");
    sb.append("    workScheduleByDays: ").append(toIndentedString(workScheduleByDays)).append("\n");
    sb.append("    workingDays: ").append(toIndentedString(workingDays)).append("\n");
    sb.append("    workingHours: ").append(toIndentedString(workingHours)).append("\n");
    sb.append("    workingTimeIntervals: ").append(toIndentedString(workingTimeIntervals)).append("\n");
    sb.append("    workingTimeModes: ").append(toIndentedString(workingTimeModes)).append("\n");
    sb.append("    billingType: ").append(toIndentedString(billingType)).append("\n");
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

