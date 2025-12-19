package ru.brobrocode.cadra.client.model;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.annotation.Generated;
import jakarta.validation.Valid;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * Условия заполнения полей при [публикации вакансии](#tag/Upravlenie-vakansiyami/operation/publish-vacancy)
 */

@Schema(name = "VacanciesVacancyConditions", description = "Условия заполнения полей при [публикации вакансии](#tag/Upravlenie-vakansiyami/operation/publish-vacancy)")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2025-08-17T15:41:09.394389505+05:00[Asia/Yekaterinburg]", comments = "Generator version: 7.6.0")
public class VacanciesVacancyConditions {

  private VacanciesVacancyConditionFieldsRequiredWithTitle acceptHandicapped = null;

  private VacanciesVacancyConditionFieldsRequiredWithTitle acceptIncompleteResumes = null;

  private VacanciesVacancyConditionFieldsRequiredWithTitle acceptKids = null;

  private VacanciesVacancyConditionFieldsRequiredWithTitle acceptTemporary = null;

  private VacanciesVacancyConditionFieldsAddressCondition address = null;

  private VacanciesVacancyConditionFieldsRequiredWithTitle ageRestriction = null;

  private VacanciesVacancyConditionFieldsRequiredWithTitle allowMessages = null;

  private VacanciesVacancyConditionFieldsRequiredWithTitle area = null;

  private VacanciesVacancyConditionFieldsRequiredWithTitle billingType = null;

  private VacanciesVacancyConditionFieldsRequiredLengthWithTitle brandedTemplate = null;

  private VacanciesVacancyConditionFieldsRequiredLengthWithTitle code = null;

  private VacanciesVacancyConditionFieldsContactsCondition contacts = null;

  private VacanciesVacancyConditionFieldsRequiredLengthWithTitle customEmployerName = null;

  private VacanciesVacancyConditionFieldsRequiredLengthWithTitle department = null;

  private VacanciesVacancyConditionFieldsRequiredLengthWithTitle description = null;

  private VacanciesVacancyConditionFieldsRequiredCountWithTitle driverLicenseTypes = null;

  private VacanciesVacancyConditionFieldsRequiredWithTitle employment = null;

  private VacanciesVacancyConditionFieldsRequiredWithTitle employmentForm = null;

  private VacanciesVacancyConditionFieldsRequiredWithTitle experience = null;

  private VacanciesVacancyConditionFieldsRequiredCountWithTitle flyInFlyOutDuration = null;

  private VacanciesVacancyConditionFieldsRequiredCountWithTitle keySkills = null;

  private VacanciesVacancyConditionFieldsRequiredCountWithTitle languages = null;

  private VacanciesVacancyConditionFieldsRequiredWithTitle manager = null;

  private VacanciesVacancyConditionFieldsRequiredLengthWithTitle name = null;

  private VacanciesVacancyConditionFieldsRequiredCountWithTitle professionalRoles = null;

  private VacanciesVacancyConditionFieldsRequiredWithTitle responseLetterRequired = null;

  private VacanciesVacancyConditionFieldsRequiredWithTitle responseNotifications = null;

  private VacanciesVacancyConditionFieldsResponseUrlCondition responseUrl = null;

  private VacanciesVacancyConditionFieldsSalaryCondition salary = null;

  private VacanciesVacancyConditionFieldsSalaryRangeCondition salaryRange = null;

  private VacanciesVacancyConditionFieldsRequiredWithTitle schedule = null;

  private VacanciesVacancyConditionFieldsTestCondition test = null;

  private VacanciesVacancyConditionFieldsRequiredWithTitle type = null;

  private VacanciesVacancyConditionFieldsRequiredCountWithTitle workFormat = null;

  private VacanciesVacancyConditionFieldsRequiredCountWithTitle workScheduleByDays = null;

  private VacanciesVacancyConditionFieldsRequiredCountWithTitle workingDays = null;

  private VacanciesVacancyConditionFieldsRequiredCountWithTitle workingHours = null;

  private VacanciesVacancyConditionFieldsRequiredCountWithTitle workingTimeIntervals = null;

  private VacanciesVacancyConditionFieldsRequiredCountWithTitle workingTimeModes = null;

  public VacanciesVacancyConditions acceptHandicapped(VacanciesVacancyConditionFieldsRequiredWithTitle acceptHandicapped) {
    this.acceptHandicapped = acceptHandicapped;
    return this;
  }

  /**
   * Get acceptHandicapped
   * @return acceptHandicapped
  */
  @Valid 
  @Schema(name = "accept_handicapped", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("accept_handicapped")
  public VacanciesVacancyConditionFieldsRequiredWithTitle getAcceptHandicapped() {
    return acceptHandicapped;
  }

  public void setAcceptHandicapped(VacanciesVacancyConditionFieldsRequiredWithTitle acceptHandicapped) {
    this.acceptHandicapped = acceptHandicapped;
  }

  public VacanciesVacancyConditions acceptIncompleteResumes(VacanciesVacancyConditionFieldsRequiredWithTitle acceptIncompleteResumes) {
    this.acceptIncompleteResumes = acceptIncompleteResumes;
    return this;
  }

  /**
   * Get acceptIncompleteResumes
   * @return acceptIncompleteResumes
  */
  @Valid 
  @Schema(name = "accept_incomplete_resumes", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("accept_incomplete_resumes")
  public VacanciesVacancyConditionFieldsRequiredWithTitle getAcceptIncompleteResumes() {
    return acceptIncompleteResumes;
  }

  public void setAcceptIncompleteResumes(VacanciesVacancyConditionFieldsRequiredWithTitle acceptIncompleteResumes) {
    this.acceptIncompleteResumes = acceptIncompleteResumes;
  }

  public VacanciesVacancyConditions acceptKids(VacanciesVacancyConditionFieldsRequiredWithTitle acceptKids) {
    this.acceptKids = acceptKids;
    return this;
  }

  /**
   * Get acceptKids
   * @return acceptKids
  */
  @Valid 
  @Schema(name = "accept_kids", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("accept_kids")
  public VacanciesVacancyConditionFieldsRequiredWithTitle getAcceptKids() {
    return acceptKids;
  }

  public void setAcceptKids(VacanciesVacancyConditionFieldsRequiredWithTitle acceptKids) {
    this.acceptKids = acceptKids;
  }

  public VacanciesVacancyConditions acceptTemporary(VacanciesVacancyConditionFieldsRequiredWithTitle acceptTemporary) {
    this.acceptTemporary = acceptTemporary;
    return this;
  }

  /**
   * Get acceptTemporary
   * @return acceptTemporary
  */
  @Valid 
  @Schema(name = "accept_temporary", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("accept_temporary")
  public VacanciesVacancyConditionFieldsRequiredWithTitle getAcceptTemporary() {
    return acceptTemporary;
  }

  public void setAcceptTemporary(VacanciesVacancyConditionFieldsRequiredWithTitle acceptTemporary) {
    this.acceptTemporary = acceptTemporary;
  }

  public VacanciesVacancyConditions address(VacanciesVacancyConditionFieldsAddressCondition address) {
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
  public VacanciesVacancyConditionFieldsAddressCondition getAddress() {
    return address;
  }

  public void setAddress(VacanciesVacancyConditionFieldsAddressCondition address) {
    this.address = address;
  }

  public VacanciesVacancyConditions ageRestriction(VacanciesVacancyConditionFieldsRequiredWithTitle ageRestriction) {
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
  public VacanciesVacancyConditionFieldsRequiredWithTitle getAgeRestriction() {
    return ageRestriction;
  }

  public void setAgeRestriction(VacanciesVacancyConditionFieldsRequiredWithTitle ageRestriction) {
    this.ageRestriction = ageRestriction;
  }

  public VacanciesVacancyConditions allowMessages(VacanciesVacancyConditionFieldsRequiredWithTitle allowMessages) {
    this.allowMessages = allowMessages;
    return this;
  }

  /**
   * Get allowMessages
   * @return allowMessages
  */
  @Valid 
  @Schema(name = "allow_messages", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("allow_messages")
  public VacanciesVacancyConditionFieldsRequiredWithTitle getAllowMessages() {
    return allowMessages;
  }

  public void setAllowMessages(VacanciesVacancyConditionFieldsRequiredWithTitle allowMessages) {
    this.allowMessages = allowMessages;
  }

  public VacanciesVacancyConditions area(VacanciesVacancyConditionFieldsRequiredWithTitle area) {
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
  public VacanciesVacancyConditionFieldsRequiredWithTitle getArea() {
    return area;
  }

  public void setArea(VacanciesVacancyConditionFieldsRequiredWithTitle area) {
    this.area = area;
  }

  public VacanciesVacancyConditions billingType(VacanciesVacancyConditionFieldsRequiredWithTitle billingType) {
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
  public VacanciesVacancyConditionFieldsRequiredWithTitle getBillingType() {
    return billingType;
  }

  public void setBillingType(VacanciesVacancyConditionFieldsRequiredWithTitle billingType) {
    this.billingType = billingType;
  }

  public VacanciesVacancyConditions brandedTemplate(VacanciesVacancyConditionFieldsRequiredLengthWithTitle brandedTemplate) {
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
  public VacanciesVacancyConditionFieldsRequiredLengthWithTitle getBrandedTemplate() {
    return brandedTemplate;
  }

  public void setBrandedTemplate(VacanciesVacancyConditionFieldsRequiredLengthWithTitle brandedTemplate) {
    this.brandedTemplate = brandedTemplate;
  }

  public VacanciesVacancyConditions code(VacanciesVacancyConditionFieldsRequiredLengthWithTitle code) {
    this.code = code;
    return this;
  }

  /**
   * Get code
   * @return code
  */
  @Valid 
  @Schema(name = "code", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("code")
  public VacanciesVacancyConditionFieldsRequiredLengthWithTitle getCode() {
    return code;
  }

  public void setCode(VacanciesVacancyConditionFieldsRequiredLengthWithTitle code) {
    this.code = code;
  }

  public VacanciesVacancyConditions contacts(VacanciesVacancyConditionFieldsContactsCondition contacts) {
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
  public VacanciesVacancyConditionFieldsContactsCondition getContacts() {
    return contacts;
  }

  public void setContacts(VacanciesVacancyConditionFieldsContactsCondition contacts) {
    this.contacts = contacts;
  }

  public VacanciesVacancyConditions customEmployerName(VacanciesVacancyConditionFieldsRequiredLengthWithTitle customEmployerName) {
    this.customEmployerName = customEmployerName;
    return this;
  }

  /**
   * Get customEmployerName
   * @return customEmployerName
  */
  @Valid 
  @Schema(name = "custom_employer_name", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("custom_employer_name")
  public VacanciesVacancyConditionFieldsRequiredLengthWithTitle getCustomEmployerName() {
    return customEmployerName;
  }

  public void setCustomEmployerName(VacanciesVacancyConditionFieldsRequiredLengthWithTitle customEmployerName) {
    this.customEmployerName = customEmployerName;
  }

  public VacanciesVacancyConditions department(VacanciesVacancyConditionFieldsRequiredLengthWithTitle department) {
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
  public VacanciesVacancyConditionFieldsRequiredLengthWithTitle getDepartment() {
    return department;
  }

  public void setDepartment(VacanciesVacancyConditionFieldsRequiredLengthWithTitle department) {
    this.department = department;
  }

  public VacanciesVacancyConditions description(VacanciesVacancyConditionFieldsRequiredLengthWithTitle description) {
    this.description = description;
    return this;
  }

  /**
   * Get description
   * @return description
  */
  @Valid 
  @Schema(name = "description", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("description")
  public VacanciesVacancyConditionFieldsRequiredLengthWithTitle getDescription() {
    return description;
  }

  public void setDescription(VacanciesVacancyConditionFieldsRequiredLengthWithTitle description) {
    this.description = description;
  }

  public VacanciesVacancyConditions driverLicenseTypes(VacanciesVacancyConditionFieldsRequiredCountWithTitle driverLicenseTypes) {
    this.driverLicenseTypes = driverLicenseTypes;
    return this;
  }

  /**
   * Get driverLicenseTypes
   * @return driverLicenseTypes
  */
  @Valid 
  @Schema(name = "driver_license_types", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("driver_license_types")
  public VacanciesVacancyConditionFieldsRequiredCountWithTitle getDriverLicenseTypes() {
    return driverLicenseTypes;
  }

  public void setDriverLicenseTypes(VacanciesVacancyConditionFieldsRequiredCountWithTitle driverLicenseTypes) {
    this.driverLicenseTypes = driverLicenseTypes;
  }

  public VacanciesVacancyConditions employment(VacanciesVacancyConditionFieldsRequiredWithTitle employment) {
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
  public VacanciesVacancyConditionFieldsRequiredWithTitle getEmployment() {
    return employment;
  }

  public void setEmployment(VacanciesVacancyConditionFieldsRequiredWithTitle employment) {
    this.employment = employment;
  }

  public VacanciesVacancyConditions employmentForm(VacanciesVacancyConditionFieldsRequiredWithTitle employmentForm) {
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
  public VacanciesVacancyConditionFieldsRequiredWithTitle getEmploymentForm() {
    return employmentForm;
  }

  public void setEmploymentForm(VacanciesVacancyConditionFieldsRequiredWithTitle employmentForm) {
    this.employmentForm = employmentForm;
  }

  public VacanciesVacancyConditions experience(VacanciesVacancyConditionFieldsRequiredWithTitle experience) {
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
  public VacanciesVacancyConditionFieldsRequiredWithTitle getExperience() {
    return experience;
  }

  public void setExperience(VacanciesVacancyConditionFieldsRequiredWithTitle experience) {
    this.experience = experience;
  }

  public VacanciesVacancyConditions flyInFlyOutDuration(VacanciesVacancyConditionFieldsRequiredCountWithTitle flyInFlyOutDuration) {
    this.flyInFlyOutDuration = flyInFlyOutDuration;
    return this;
  }

  /**
   * Get flyInFlyOutDuration
   * @return flyInFlyOutDuration
  */
  @Valid 
  @Schema(name = "fly_in_fly_out_duration", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("fly_in_fly_out_duration")
  public VacanciesVacancyConditionFieldsRequiredCountWithTitle getFlyInFlyOutDuration() {
    return flyInFlyOutDuration;
  }

  public void setFlyInFlyOutDuration(VacanciesVacancyConditionFieldsRequiredCountWithTitle flyInFlyOutDuration) {
    this.flyInFlyOutDuration = flyInFlyOutDuration;
  }

  public VacanciesVacancyConditions keySkills(VacanciesVacancyConditionFieldsRequiredCountWithTitle keySkills) {
    this.keySkills = keySkills;
    return this;
  }

  /**
   * Get keySkills
   * @return keySkills
  */
  @Valid 
  @Schema(name = "key_skills", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("key_skills")
  public VacanciesVacancyConditionFieldsRequiredCountWithTitle getKeySkills() {
    return keySkills;
  }

  public void setKeySkills(VacanciesVacancyConditionFieldsRequiredCountWithTitle keySkills) {
    this.keySkills = keySkills;
  }

  public VacanciesVacancyConditions languages(VacanciesVacancyConditionFieldsRequiredCountWithTitle languages) {
    this.languages = languages;
    return this;
  }

  /**
   * Get languages
   * @return languages
  */
  @Valid 
  @Schema(name = "languages", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("languages")
  public VacanciesVacancyConditionFieldsRequiredCountWithTitle getLanguages() {
    return languages;
  }

  public void setLanguages(VacanciesVacancyConditionFieldsRequiredCountWithTitle languages) {
    this.languages = languages;
  }

  public VacanciesVacancyConditions manager(VacanciesVacancyConditionFieldsRequiredWithTitle manager) {
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
  public VacanciesVacancyConditionFieldsRequiredWithTitle getManager() {
    return manager;
  }

  public void setManager(VacanciesVacancyConditionFieldsRequiredWithTitle manager) {
    this.manager = manager;
  }

  public VacanciesVacancyConditions name(VacanciesVacancyConditionFieldsRequiredLengthWithTitle name) {
    this.name = name;
    return this;
  }

  /**
   * Get name
   * @return name
  */
  @Valid 
  @Schema(name = "name", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("name")
  public VacanciesVacancyConditionFieldsRequiredLengthWithTitle getName() {
    return name;
  }

  public void setName(VacanciesVacancyConditionFieldsRequiredLengthWithTitle name) {
    this.name = name;
  }

  public VacanciesVacancyConditions professionalRoles(VacanciesVacancyConditionFieldsRequiredCountWithTitle professionalRoles) {
    this.professionalRoles = professionalRoles;
    return this;
  }

  /**
   * Get professionalRoles
   * @return professionalRoles
  */
  @Valid 
  @Schema(name = "professional_roles", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("professional_roles")
  public VacanciesVacancyConditionFieldsRequiredCountWithTitle getProfessionalRoles() {
    return professionalRoles;
  }

  public void setProfessionalRoles(VacanciesVacancyConditionFieldsRequiredCountWithTitle professionalRoles) {
    this.professionalRoles = professionalRoles;
  }

  public VacanciesVacancyConditions responseLetterRequired(VacanciesVacancyConditionFieldsRequiredWithTitle responseLetterRequired) {
    this.responseLetterRequired = responseLetterRequired;
    return this;
  }

  /**
   * Get responseLetterRequired
   * @return responseLetterRequired
  */
  @Valid 
  @Schema(name = "response_letter_required", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("response_letter_required")
  public VacanciesVacancyConditionFieldsRequiredWithTitle getResponseLetterRequired() {
    return responseLetterRequired;
  }

  public void setResponseLetterRequired(VacanciesVacancyConditionFieldsRequiredWithTitle responseLetterRequired) {
    this.responseLetterRequired = responseLetterRequired;
  }

  public VacanciesVacancyConditions responseNotifications(VacanciesVacancyConditionFieldsRequiredWithTitle responseNotifications) {
    this.responseNotifications = responseNotifications;
    return this;
  }

  /**
   * Get responseNotifications
   * @return responseNotifications
  */
  @Valid 
  @Schema(name = "response_notifications", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("response_notifications")
  public VacanciesVacancyConditionFieldsRequiredWithTitle getResponseNotifications() {
    return responseNotifications;
  }

  public void setResponseNotifications(VacanciesVacancyConditionFieldsRequiredWithTitle responseNotifications) {
    this.responseNotifications = responseNotifications;
  }

  public VacanciesVacancyConditions responseUrl(VacanciesVacancyConditionFieldsResponseUrlCondition responseUrl) {
    this.responseUrl = responseUrl;
    return this;
  }

  /**
   * Get responseUrl
   * @return responseUrl
  */
  @Valid 
  @Schema(name = "response_url", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("response_url")
  public VacanciesVacancyConditionFieldsResponseUrlCondition getResponseUrl() {
    return responseUrl;
  }

  public void setResponseUrl(VacanciesVacancyConditionFieldsResponseUrlCondition responseUrl) {
    this.responseUrl = responseUrl;
  }

  public VacanciesVacancyConditions salary(VacanciesVacancyConditionFieldsSalaryCondition salary) {
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
  public VacanciesVacancyConditionFieldsSalaryCondition getSalary() {
    return salary;
  }

  public void setSalary(VacanciesVacancyConditionFieldsSalaryCondition salary) {
    this.salary = salary;
  }

  public VacanciesVacancyConditions salaryRange(VacanciesVacancyConditionFieldsSalaryRangeCondition salaryRange) {
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
  public VacanciesVacancyConditionFieldsSalaryRangeCondition getSalaryRange() {
    return salaryRange;
  }

  public void setSalaryRange(VacanciesVacancyConditionFieldsSalaryRangeCondition salaryRange) {
    this.salaryRange = salaryRange;
  }

  public VacanciesVacancyConditions schedule(VacanciesVacancyConditionFieldsRequiredWithTitle schedule) {
    this.schedule = schedule;
    return this;
  }

  /**
   * Get schedule
   * @return schedule
  */
  @Valid 
  @Schema(name = "schedule", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("schedule")
  public VacanciesVacancyConditionFieldsRequiredWithTitle getSchedule() {
    return schedule;
  }

  public void setSchedule(VacanciesVacancyConditionFieldsRequiredWithTitle schedule) {
    this.schedule = schedule;
  }

  public VacanciesVacancyConditions test(VacanciesVacancyConditionFieldsTestCondition test) {
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
  public VacanciesVacancyConditionFieldsTestCondition getTest() {
    return test;
  }

  public void setTest(VacanciesVacancyConditionFieldsTestCondition test) {
    this.test = test;
  }

  public VacanciesVacancyConditions type(VacanciesVacancyConditionFieldsRequiredWithTitle type) {
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
  public VacanciesVacancyConditionFieldsRequiredWithTitle getType() {
    return type;
  }

  public void setType(VacanciesVacancyConditionFieldsRequiredWithTitle type) {
    this.type = type;
  }

  public VacanciesVacancyConditions workFormat(VacanciesVacancyConditionFieldsRequiredCountWithTitle workFormat) {
    this.workFormat = workFormat;
    return this;
  }

  /**
   * Get workFormat
   * @return workFormat
  */
  @Valid 
  @Schema(name = "work_format", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("work_format")
  public VacanciesVacancyConditionFieldsRequiredCountWithTitle getWorkFormat() {
    return workFormat;
  }

  public void setWorkFormat(VacanciesVacancyConditionFieldsRequiredCountWithTitle workFormat) {
    this.workFormat = workFormat;
  }

  public VacanciesVacancyConditions workScheduleByDays(VacanciesVacancyConditionFieldsRequiredCountWithTitle workScheduleByDays) {
    this.workScheduleByDays = workScheduleByDays;
    return this;
  }

  /**
   * Get workScheduleByDays
   * @return workScheduleByDays
  */
  @Valid 
  @Schema(name = "work_schedule_by_days", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("work_schedule_by_days")
  public VacanciesVacancyConditionFieldsRequiredCountWithTitle getWorkScheduleByDays() {
    return workScheduleByDays;
  }

  public void setWorkScheduleByDays(VacanciesVacancyConditionFieldsRequiredCountWithTitle workScheduleByDays) {
    this.workScheduleByDays = workScheduleByDays;
  }

  public VacanciesVacancyConditions workingDays(VacanciesVacancyConditionFieldsRequiredCountWithTitle workingDays) {
    this.workingDays = workingDays;
    return this;
  }

  /**
   * Get workingDays
   * @return workingDays
  */
  @Valid 
  @Schema(name = "working_days", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("working_days")
  public VacanciesVacancyConditionFieldsRequiredCountWithTitle getWorkingDays() {
    return workingDays;
  }

  public void setWorkingDays(VacanciesVacancyConditionFieldsRequiredCountWithTitle workingDays) {
    this.workingDays = workingDays;
  }

  public VacanciesVacancyConditions workingHours(VacanciesVacancyConditionFieldsRequiredCountWithTitle workingHours) {
    this.workingHours = workingHours;
    return this;
  }

  /**
   * Get workingHours
   * @return workingHours
  */
  @Valid 
  @Schema(name = "working_hours", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("working_hours")
  public VacanciesVacancyConditionFieldsRequiredCountWithTitle getWorkingHours() {
    return workingHours;
  }

  public void setWorkingHours(VacanciesVacancyConditionFieldsRequiredCountWithTitle workingHours) {
    this.workingHours = workingHours;
  }

  public VacanciesVacancyConditions workingTimeIntervals(VacanciesVacancyConditionFieldsRequiredCountWithTitle workingTimeIntervals) {
    this.workingTimeIntervals = workingTimeIntervals;
    return this;
  }

  /**
   * Get workingTimeIntervals
   * @return workingTimeIntervals
  */
  @Valid 
  @Schema(name = "working_time_intervals", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("working_time_intervals")
  public VacanciesVacancyConditionFieldsRequiredCountWithTitle getWorkingTimeIntervals() {
    return workingTimeIntervals;
  }

  public void setWorkingTimeIntervals(VacanciesVacancyConditionFieldsRequiredCountWithTitle workingTimeIntervals) {
    this.workingTimeIntervals = workingTimeIntervals;
  }

  public VacanciesVacancyConditions workingTimeModes(VacanciesVacancyConditionFieldsRequiredCountWithTitle workingTimeModes) {
    this.workingTimeModes = workingTimeModes;
    return this;
  }

  /**
   * Get workingTimeModes
   * @return workingTimeModes
  */
  @Valid 
  @Schema(name = "working_time_modes", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("working_time_modes")
  public VacanciesVacancyConditionFieldsRequiredCountWithTitle getWorkingTimeModes() {
    return workingTimeModes;
  }

  public void setWorkingTimeModes(VacanciesVacancyConditionFieldsRequiredCountWithTitle workingTimeModes) {
    this.workingTimeModes = workingTimeModes;
  }
    /**
    * A container for additional, undeclared properties.
    * This is a holder for any undeclared properties as specified with
    * the 'additionalProperties' keyword in the OAS document.
    */
    private Map<String, Object> additionalProperties;

    /**
    * Set the additional (undeclared) property with the specified name and value.
    * If the property does not already exist, create it otherwise replace it.
    */
    @JsonAnySetter
    public VacanciesVacancyConditions putAdditionalProperty(String key, Object value) {
        if (this.additionalProperties == null) {
            this.additionalProperties = new HashMap<String, Object>();
        }
        this.additionalProperties.put(key, value);
        return this;
    }

    /**
    * Return the additional (undeclared) property.
    */
    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return additionalProperties;
    }

    /**
    * Return the additional (undeclared) property with the specified name.
    */
    public Object getAdditionalProperty(String key) {
        if (this.additionalProperties == null) {
            return null;
        }
        return this.additionalProperties.get(key);
    }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    VacanciesVacancyConditions vacanciesVacancyConditions = (VacanciesVacancyConditions) o;
    return Objects.equals(this.acceptHandicapped, vacanciesVacancyConditions.acceptHandicapped) &&
        Objects.equals(this.acceptIncompleteResumes, vacanciesVacancyConditions.acceptIncompleteResumes) &&
        Objects.equals(this.acceptKids, vacanciesVacancyConditions.acceptKids) &&
        Objects.equals(this.acceptTemporary, vacanciesVacancyConditions.acceptTemporary) &&
        Objects.equals(this.address, vacanciesVacancyConditions.address) &&
        Objects.equals(this.ageRestriction, vacanciesVacancyConditions.ageRestriction) &&
        Objects.equals(this.allowMessages, vacanciesVacancyConditions.allowMessages) &&
        Objects.equals(this.area, vacanciesVacancyConditions.area) &&
        Objects.equals(this.billingType, vacanciesVacancyConditions.billingType) &&
        Objects.equals(this.brandedTemplate, vacanciesVacancyConditions.brandedTemplate) &&
        Objects.equals(this.code, vacanciesVacancyConditions.code) &&
        Objects.equals(this.contacts, vacanciesVacancyConditions.contacts) &&
        Objects.equals(this.customEmployerName, vacanciesVacancyConditions.customEmployerName) &&
        Objects.equals(this.department, vacanciesVacancyConditions.department) &&
        Objects.equals(this.description, vacanciesVacancyConditions.description) &&
        Objects.equals(this.driverLicenseTypes, vacanciesVacancyConditions.driverLicenseTypes) &&
        Objects.equals(this.employment, vacanciesVacancyConditions.employment) &&
        Objects.equals(this.employmentForm, vacanciesVacancyConditions.employmentForm) &&
        Objects.equals(this.experience, vacanciesVacancyConditions.experience) &&
        Objects.equals(this.flyInFlyOutDuration, vacanciesVacancyConditions.flyInFlyOutDuration) &&
        Objects.equals(this.keySkills, vacanciesVacancyConditions.keySkills) &&
        Objects.equals(this.languages, vacanciesVacancyConditions.languages) &&
        Objects.equals(this.manager, vacanciesVacancyConditions.manager) &&
        Objects.equals(this.name, vacanciesVacancyConditions.name) &&
        Objects.equals(this.professionalRoles, vacanciesVacancyConditions.professionalRoles) &&
        Objects.equals(this.responseLetterRequired, vacanciesVacancyConditions.responseLetterRequired) &&
        Objects.equals(this.responseNotifications, vacanciesVacancyConditions.responseNotifications) &&
        Objects.equals(this.responseUrl, vacanciesVacancyConditions.responseUrl) &&
        Objects.equals(this.salary, vacanciesVacancyConditions.salary) &&
        Objects.equals(this.salaryRange, vacanciesVacancyConditions.salaryRange) &&
        Objects.equals(this.schedule, vacanciesVacancyConditions.schedule) &&
        Objects.equals(this.test, vacanciesVacancyConditions.test) &&
        Objects.equals(this.type, vacanciesVacancyConditions.type) &&
        Objects.equals(this.workFormat, vacanciesVacancyConditions.workFormat) &&
        Objects.equals(this.workScheduleByDays, vacanciesVacancyConditions.workScheduleByDays) &&
        Objects.equals(this.workingDays, vacanciesVacancyConditions.workingDays) &&
        Objects.equals(this.workingHours, vacanciesVacancyConditions.workingHours) &&
        Objects.equals(this.workingTimeIntervals, vacanciesVacancyConditions.workingTimeIntervals) &&
        Objects.equals(this.workingTimeModes, vacanciesVacancyConditions.workingTimeModes) &&
    Objects.equals(this.additionalProperties, vacanciesVacancyConditions.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(acceptHandicapped, acceptIncompleteResumes, acceptKids, acceptTemporary, address, ageRestriction, allowMessages, area, billingType, brandedTemplate, code, contacts, customEmployerName, department, description, driverLicenseTypes, employment, employmentForm, experience, flyInFlyOutDuration, keySkills, languages, manager, name, professionalRoles, responseLetterRequired, responseNotifications, responseUrl, salary, salaryRange, schedule, test, type, workFormat, workScheduleByDays, workingDays, workingHours, workingTimeIntervals, workingTimeModes, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class VacanciesVacancyConditions {\n");
    sb.append("    acceptHandicapped: ").append(toIndentedString(acceptHandicapped)).append("\n");
    sb.append("    acceptIncompleteResumes: ").append(toIndentedString(acceptIncompleteResumes)).append("\n");
    sb.append("    acceptKids: ").append(toIndentedString(acceptKids)).append("\n");
    sb.append("    acceptTemporary: ").append(toIndentedString(acceptTemporary)).append("\n");
    sb.append("    address: ").append(toIndentedString(address)).append("\n");
    sb.append("    ageRestriction: ").append(toIndentedString(ageRestriction)).append("\n");
    sb.append("    allowMessages: ").append(toIndentedString(allowMessages)).append("\n");
    sb.append("    area: ").append(toIndentedString(area)).append("\n");
    sb.append("    billingType: ").append(toIndentedString(billingType)).append("\n");
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
    sb.append("    keySkills: ").append(toIndentedString(keySkills)).append("\n");
    sb.append("    languages: ").append(toIndentedString(languages)).append("\n");
    sb.append("    manager: ").append(toIndentedString(manager)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
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
    
    sb.append("    additionalProperties: ").append(toIndentedString(additionalProperties)).append("\n");
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

