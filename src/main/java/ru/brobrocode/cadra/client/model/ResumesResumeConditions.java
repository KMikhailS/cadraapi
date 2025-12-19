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
 * Условия заполнения полей резюме.  Поле, представленное объектом с полями (&#x60;fields&#x60;), само по себе может не являться необходимым, но если заполнено хотя бы одно поле объекта, необходимо заполнить и другие его поля. Пример — желаемая зарплата (&#x60;salary&#x60;) может быть не указана, но если указана сумма, то необходимо указать и валюту 
 */

@Schema(name = "ResumesResumeConditions", description = "Условия заполнения полей резюме.  Поле, представленное объектом с полями (`fields`), само по себе может не являться необходимым, но если заполнено хотя бы одно поле объекта, необходимо заполнить и другие его поля. Пример — желаемая зарплата (`salary`) может быть не указана, но если указана сумма, то необходимо указать и валюту ")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2025-08-17T15:41:09.394389505+05:00[Asia/Yekaterinburg]", comments = "Generator version: 7.6.0")
public class ResumesResumeConditions {

  private ResumesResumeConditionFieldsAccessCondition access = null;

  private ResumesResumeConditionFieldsRequiredWithTitle area = null;

  private ResumesResumeConditionFieldsRequiredWithTitle autoHideTime = null;

  private ResumesResumeConditionFieldsRequiredDateWithTitle birthDate = null;

  private ResumesResumeConditionFieldsRequiredWithTitle businessTripReadiness = null;

  private ResumesResumeConditionFieldsRequiredCountWithTitle citizenship = null;

  private ResumesResumeConditionFieldsContactCondition contact = null;

  private ResumesResumeConditionFieldsRequiredWithTitle district = null;

  private ResumesResumeConditionFieldsRequiredCountWithTitle driverLicenseTypes = null;

  private ResumesResumeConditionFieldsEducationCondition education = null;

  private ResumesResumeConditionFieldsRequiredWithTitle employment = null;

  private ResumesResumeConditionFieldsRequiredCountWithTitle employments = null;

  private ResumesResumeConditionFieldsExperienceCondition experience = null;

  private ResumesResumeConditionFieldsRequiredLengthTitleRegexp firstName = null;

  private ResumesResumeConditionFieldsRequiredWithTitle gender = null;

  private ResumesResumeConditionFieldsRequiredWithTitle hasVehicle = null;

  private ResumesResumeConditionFieldsRequiredCountWithTitle hiddenFields = null;

  private ResumesResumeConditionFieldsLanguageCondition language = null;

  private ResumesResumeConditionFieldsRequiredLengthTitleRegexp lastName = null;

  private ResumesResumeConditionFieldsRequiredWithTitle metro = null;

  private ResumesResumeConditionFieldsRequiredLengthTitleRegexp middleName = null;

  private ResumesResumeConditionFieldsRequiredWithTitle photo = null;

  private ResumesResumeConditionFieldsRequiredCountWithTitle portfolio = null;

  private ResumesResumeConditionFieldsRequiredCountWithTitle professionalRoles = null;

  private ResumesResumeConditionFieldsRecommendationCondition recommendation = null;

  private ResumesResumeConditionFieldsRelocationCondition relocation = null;

  private ResumesResumeConditionFieldsRequiredWithTitle resumeLocale = null;

  private ResumesResumeConditionFieldsSalaryCondition salary = null;

  private ResumesResumeConditionFieldsRequiredWithTitle schedule = null;

  private ResumesResumeConditionFieldsRequiredCountWithTitle schedules = null;

  private ResumesResumeConditionFieldsSiteCondition site = null;

  private ResumesResumeConditionFieldsRequiredCountAndLengthTitle skillSet = null;

  private ResumesResumeConditionFieldsRequiredLengthWithTitle skills = null;

  private ResumesResumeConditionFieldsRequiredCountWithTitle specialization = null;

  private ResumesResumeConditionFieldsRequiredLengthTitleNotInt title = null;

  private ResumesResumeConditionFieldsRequiredWithTitle travelTime = null;

  private ResumesResumeConditionFieldsRequiredCountWithTitle workTicket = null;

  public ResumesResumeConditions access(ResumesResumeConditionFieldsAccessCondition access) {
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
  public ResumesResumeConditionFieldsAccessCondition getAccess() {
    return access;
  }

  public void setAccess(ResumesResumeConditionFieldsAccessCondition access) {
    this.access = access;
  }

  public ResumesResumeConditions area(ResumesResumeConditionFieldsRequiredWithTitle area) {
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
  public ResumesResumeConditionFieldsRequiredWithTitle getArea() {
    return area;
  }

  public void setArea(ResumesResumeConditionFieldsRequiredWithTitle area) {
    this.area = area;
  }

  public ResumesResumeConditions autoHideTime(ResumesResumeConditionFieldsRequiredWithTitle autoHideTime) {
    this.autoHideTime = autoHideTime;
    return this;
  }

  /**
   * Get autoHideTime
   * @return autoHideTime
  */
  @Valid 
  @Schema(name = "auto_hide_time", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("auto_hide_time")
  public ResumesResumeConditionFieldsRequiredWithTitle getAutoHideTime() {
    return autoHideTime;
  }

  public void setAutoHideTime(ResumesResumeConditionFieldsRequiredWithTitle autoHideTime) {
    this.autoHideTime = autoHideTime;
  }

  public ResumesResumeConditions birthDate(ResumesResumeConditionFieldsRequiredDateWithTitle birthDate) {
    this.birthDate = birthDate;
    return this;
  }

  /**
   * Get birthDate
   * @return birthDate
  */
  @Valid 
  @Schema(name = "birth_date", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("birth_date")
  public ResumesResumeConditionFieldsRequiredDateWithTitle getBirthDate() {
    return birthDate;
  }

  public void setBirthDate(ResumesResumeConditionFieldsRequiredDateWithTitle birthDate) {
    this.birthDate = birthDate;
  }

  public ResumesResumeConditions businessTripReadiness(ResumesResumeConditionFieldsRequiredWithTitle businessTripReadiness) {
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
  public ResumesResumeConditionFieldsRequiredWithTitle getBusinessTripReadiness() {
    return businessTripReadiness;
  }

  public void setBusinessTripReadiness(ResumesResumeConditionFieldsRequiredWithTitle businessTripReadiness) {
    this.businessTripReadiness = businessTripReadiness;
  }

  public ResumesResumeConditions citizenship(ResumesResumeConditionFieldsRequiredCountWithTitle citizenship) {
    this.citizenship = citizenship;
    return this;
  }

  /**
   * Get citizenship
   * @return citizenship
  */
  @Valid 
  @Schema(name = "citizenship", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("citizenship")
  public ResumesResumeConditionFieldsRequiredCountWithTitle getCitizenship() {
    return citizenship;
  }

  public void setCitizenship(ResumesResumeConditionFieldsRequiredCountWithTitle citizenship) {
    this.citizenship = citizenship;
  }

  public ResumesResumeConditions contact(ResumesResumeConditionFieldsContactCondition contact) {
    this.contact = contact;
    return this;
  }

  /**
   * Get contact
   * @return contact
  */
  @Valid 
  @Schema(name = "contact", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("contact")
  public ResumesResumeConditionFieldsContactCondition getContact() {
    return contact;
  }

  public void setContact(ResumesResumeConditionFieldsContactCondition contact) {
    this.contact = contact;
  }

  public ResumesResumeConditions district(ResumesResumeConditionFieldsRequiredWithTitle district) {
    this.district = district;
    return this;
  }

  /**
   * Get district
   * @return district
  */
  @Valid 
  @Schema(name = "district", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("district")
  public ResumesResumeConditionFieldsRequiredWithTitle getDistrict() {
    return district;
  }

  public void setDistrict(ResumesResumeConditionFieldsRequiredWithTitle district) {
    this.district = district;
  }

  public ResumesResumeConditions driverLicenseTypes(ResumesResumeConditionFieldsRequiredCountWithTitle driverLicenseTypes) {
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
  public ResumesResumeConditionFieldsRequiredCountWithTitle getDriverLicenseTypes() {
    return driverLicenseTypes;
  }

  public void setDriverLicenseTypes(ResumesResumeConditionFieldsRequiredCountWithTitle driverLicenseTypes) {
    this.driverLicenseTypes = driverLicenseTypes;
  }

  public ResumesResumeConditions education(ResumesResumeConditionFieldsEducationCondition education) {
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
  public ResumesResumeConditionFieldsEducationCondition getEducation() {
    return education;
  }

  public void setEducation(ResumesResumeConditionFieldsEducationCondition education) {
    this.education = education;
  }

  public ResumesResumeConditions employment(ResumesResumeConditionFieldsRequiredWithTitle employment) {
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
  public ResumesResumeConditionFieldsRequiredWithTitle getEmployment() {
    return employment;
  }

  public void setEmployment(ResumesResumeConditionFieldsRequiredWithTitle employment) {
    this.employment = employment;
  }

  public ResumesResumeConditions employments(ResumesResumeConditionFieldsRequiredCountWithTitle employments) {
    this.employments = employments;
    return this;
  }

  /**
   * Get employments
   * @return employments
  */
  @Valid 
  @Schema(name = "employments", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("employments")
  public ResumesResumeConditionFieldsRequiredCountWithTitle getEmployments() {
    return employments;
  }

  public void setEmployments(ResumesResumeConditionFieldsRequiredCountWithTitle employments) {
    this.employments = employments;
  }

  public ResumesResumeConditions experience(ResumesResumeConditionFieldsExperienceCondition experience) {
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
  public ResumesResumeConditionFieldsExperienceCondition getExperience() {
    return experience;
  }

  public void setExperience(ResumesResumeConditionFieldsExperienceCondition experience) {
    this.experience = experience;
  }

  public ResumesResumeConditions firstName(ResumesResumeConditionFieldsRequiredLengthTitleRegexp firstName) {
    this.firstName = firstName;
    return this;
  }

  /**
   * Get firstName
   * @return firstName
  */
  @Valid 
  @Schema(name = "first_name", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("first_name")
  public ResumesResumeConditionFieldsRequiredLengthTitleRegexp getFirstName() {
    return firstName;
  }

  public void setFirstName(ResumesResumeConditionFieldsRequiredLengthTitleRegexp firstName) {
    this.firstName = firstName;
  }

  public ResumesResumeConditions gender(ResumesResumeConditionFieldsRequiredWithTitle gender) {
    this.gender = gender;
    return this;
  }

  /**
   * Get gender
   * @return gender
  */
  @Valid 
  @Schema(name = "gender", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("gender")
  public ResumesResumeConditionFieldsRequiredWithTitle getGender() {
    return gender;
  }

  public void setGender(ResumesResumeConditionFieldsRequiredWithTitle gender) {
    this.gender = gender;
  }

  public ResumesResumeConditions hasVehicle(ResumesResumeConditionFieldsRequiredWithTitle hasVehicle) {
    this.hasVehicle = hasVehicle;
    return this;
  }

  /**
   * Get hasVehicle
   * @return hasVehicle
  */
  @Valid 
  @Schema(name = "has_vehicle", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("has_vehicle")
  public ResumesResumeConditionFieldsRequiredWithTitle getHasVehicle() {
    return hasVehicle;
  }

  public void setHasVehicle(ResumesResumeConditionFieldsRequiredWithTitle hasVehicle) {
    this.hasVehicle = hasVehicle;
  }

  public ResumesResumeConditions hiddenFields(ResumesResumeConditionFieldsRequiredCountWithTitle hiddenFields) {
    this.hiddenFields = hiddenFields;
    return this;
  }

  /**
   * Get hiddenFields
   * @return hiddenFields
  */
  @Valid 
  @Schema(name = "hidden_fields", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("hidden_fields")
  public ResumesResumeConditionFieldsRequiredCountWithTitle getHiddenFields() {
    return hiddenFields;
  }

  public void setHiddenFields(ResumesResumeConditionFieldsRequiredCountWithTitle hiddenFields) {
    this.hiddenFields = hiddenFields;
  }

  public ResumesResumeConditions language(ResumesResumeConditionFieldsLanguageCondition language) {
    this.language = language;
    return this;
  }

  /**
   * Get language
   * @return language
  */
  @Valid 
  @Schema(name = "language", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("language")
  public ResumesResumeConditionFieldsLanguageCondition getLanguage() {
    return language;
  }

  public void setLanguage(ResumesResumeConditionFieldsLanguageCondition language) {
    this.language = language;
  }

  public ResumesResumeConditions lastName(ResumesResumeConditionFieldsRequiredLengthTitleRegexp lastName) {
    this.lastName = lastName;
    return this;
  }

  /**
   * Get lastName
   * @return lastName
  */
  @Valid 
  @Schema(name = "last_name", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("last_name")
  public ResumesResumeConditionFieldsRequiredLengthTitleRegexp getLastName() {
    return lastName;
  }

  public void setLastName(ResumesResumeConditionFieldsRequiredLengthTitleRegexp lastName) {
    this.lastName = lastName;
  }

  public ResumesResumeConditions metro(ResumesResumeConditionFieldsRequiredWithTitle metro) {
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
  public ResumesResumeConditionFieldsRequiredWithTitle getMetro() {
    return metro;
  }

  public void setMetro(ResumesResumeConditionFieldsRequiredWithTitle metro) {
    this.metro = metro;
  }

  public ResumesResumeConditions middleName(ResumesResumeConditionFieldsRequiredLengthTitleRegexp middleName) {
    this.middleName = middleName;
    return this;
  }

  /**
   * Get middleName
   * @return middleName
  */
  @Valid 
  @Schema(name = "middle_name", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("middle_name")
  public ResumesResumeConditionFieldsRequiredLengthTitleRegexp getMiddleName() {
    return middleName;
  }

  public void setMiddleName(ResumesResumeConditionFieldsRequiredLengthTitleRegexp middleName) {
    this.middleName = middleName;
  }

  public ResumesResumeConditions photo(ResumesResumeConditionFieldsRequiredWithTitle photo) {
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
  public ResumesResumeConditionFieldsRequiredWithTitle getPhoto() {
    return photo;
  }

  public void setPhoto(ResumesResumeConditionFieldsRequiredWithTitle photo) {
    this.photo = photo;
  }

  public ResumesResumeConditions portfolio(ResumesResumeConditionFieldsRequiredCountWithTitle portfolio) {
    this.portfolio = portfolio;
    return this;
  }

  /**
   * Get portfolio
   * @return portfolio
  */
  @Valid 
  @Schema(name = "portfolio", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("portfolio")
  public ResumesResumeConditionFieldsRequiredCountWithTitle getPortfolio() {
    return portfolio;
  }

  public void setPortfolio(ResumesResumeConditionFieldsRequiredCountWithTitle portfolio) {
    this.portfolio = portfolio;
  }

  public ResumesResumeConditions professionalRoles(ResumesResumeConditionFieldsRequiredCountWithTitle professionalRoles) {
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
  public ResumesResumeConditionFieldsRequiredCountWithTitle getProfessionalRoles() {
    return professionalRoles;
  }

  public void setProfessionalRoles(ResumesResumeConditionFieldsRequiredCountWithTitle professionalRoles) {
    this.professionalRoles = professionalRoles;
  }

  public ResumesResumeConditions recommendation(ResumesResumeConditionFieldsRecommendationCondition recommendation) {
    this.recommendation = recommendation;
    return this;
  }

  /**
   * Get recommendation
   * @return recommendation
  */
  @Valid 
  @Schema(name = "recommendation", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("recommendation")
  public ResumesResumeConditionFieldsRecommendationCondition getRecommendation() {
    return recommendation;
  }

  public void setRecommendation(ResumesResumeConditionFieldsRecommendationCondition recommendation) {
    this.recommendation = recommendation;
  }

  public ResumesResumeConditions relocation(ResumesResumeConditionFieldsRelocationCondition relocation) {
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
  public ResumesResumeConditionFieldsRelocationCondition getRelocation() {
    return relocation;
  }

  public void setRelocation(ResumesResumeConditionFieldsRelocationCondition relocation) {
    this.relocation = relocation;
  }

  public ResumesResumeConditions resumeLocale(ResumesResumeConditionFieldsRequiredWithTitle resumeLocale) {
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
  public ResumesResumeConditionFieldsRequiredWithTitle getResumeLocale() {
    return resumeLocale;
  }

  public void setResumeLocale(ResumesResumeConditionFieldsRequiredWithTitle resumeLocale) {
    this.resumeLocale = resumeLocale;
  }

  public ResumesResumeConditions salary(ResumesResumeConditionFieldsSalaryCondition salary) {
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
  public ResumesResumeConditionFieldsSalaryCondition getSalary() {
    return salary;
  }

  public void setSalary(ResumesResumeConditionFieldsSalaryCondition salary) {
    this.salary = salary;
  }

  public ResumesResumeConditions schedule(ResumesResumeConditionFieldsRequiredWithTitle schedule) {
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
  public ResumesResumeConditionFieldsRequiredWithTitle getSchedule() {
    return schedule;
  }

  public void setSchedule(ResumesResumeConditionFieldsRequiredWithTitle schedule) {
    this.schedule = schedule;
  }

  public ResumesResumeConditions schedules(ResumesResumeConditionFieldsRequiredCountWithTitle schedules) {
    this.schedules = schedules;
    return this;
  }

  /**
   * Get schedules
   * @return schedules
  */
  @Valid 
  @Schema(name = "schedules", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("schedules")
  public ResumesResumeConditionFieldsRequiredCountWithTitle getSchedules() {
    return schedules;
  }

  public void setSchedules(ResumesResumeConditionFieldsRequiredCountWithTitle schedules) {
    this.schedules = schedules;
  }

  public ResumesResumeConditions site(ResumesResumeConditionFieldsSiteCondition site) {
    this.site = site;
    return this;
  }

  /**
   * Get site
   * @return site
  */
  @Valid 
  @Schema(name = "site", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("site")
  public ResumesResumeConditionFieldsSiteCondition getSite() {
    return site;
  }

  public void setSite(ResumesResumeConditionFieldsSiteCondition site) {
    this.site = site;
  }

  public ResumesResumeConditions skillSet(ResumesResumeConditionFieldsRequiredCountAndLengthTitle skillSet) {
    this.skillSet = skillSet;
    return this;
  }

  /**
   * Get skillSet
   * @return skillSet
  */
  @Valid 
  @Schema(name = "skill_set", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("skill_set")
  public ResumesResumeConditionFieldsRequiredCountAndLengthTitle getSkillSet() {
    return skillSet;
  }

  public void setSkillSet(ResumesResumeConditionFieldsRequiredCountAndLengthTitle skillSet) {
    this.skillSet = skillSet;
  }

  public ResumesResumeConditions skills(ResumesResumeConditionFieldsRequiredLengthWithTitle skills) {
    this.skills = skills;
    return this;
  }

  /**
   * Get skills
   * @return skills
  */
  @Valid 
  @Schema(name = "skills", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("skills")
  public ResumesResumeConditionFieldsRequiredLengthWithTitle getSkills() {
    return skills;
  }

  public void setSkills(ResumesResumeConditionFieldsRequiredLengthWithTitle skills) {
    this.skills = skills;
  }

  public ResumesResumeConditions specialization(ResumesResumeConditionFieldsRequiredCountWithTitle specialization) {
    this.specialization = specialization;
    return this;
  }

  /**
   * Get specialization
   * @return specialization
  */
  @Valid 
  @Schema(name = "specialization", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("specialization")
  public ResumesResumeConditionFieldsRequiredCountWithTitle getSpecialization() {
    return specialization;
  }

  public void setSpecialization(ResumesResumeConditionFieldsRequiredCountWithTitle specialization) {
    this.specialization = specialization;
  }

  public ResumesResumeConditions title(ResumesResumeConditionFieldsRequiredLengthTitleNotInt title) {
    this.title = title;
    return this;
  }

  /**
   * Get title
   * @return title
  */
  @Valid 
  @Schema(name = "title", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("title")
  public ResumesResumeConditionFieldsRequiredLengthTitleNotInt getTitle() {
    return title;
  }

  public void setTitle(ResumesResumeConditionFieldsRequiredLengthTitleNotInt title) {
    this.title = title;
  }

  public ResumesResumeConditions travelTime(ResumesResumeConditionFieldsRequiredWithTitle travelTime) {
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
  public ResumesResumeConditionFieldsRequiredWithTitle getTravelTime() {
    return travelTime;
  }

  public void setTravelTime(ResumesResumeConditionFieldsRequiredWithTitle travelTime) {
    this.travelTime = travelTime;
  }

  public ResumesResumeConditions workTicket(ResumesResumeConditionFieldsRequiredCountWithTitle workTicket) {
    this.workTicket = workTicket;
    return this;
  }

  /**
   * Get workTicket
   * @return workTicket
  */
  @Valid 
  @Schema(name = "work_ticket", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("work_ticket")
  public ResumesResumeConditionFieldsRequiredCountWithTitle getWorkTicket() {
    return workTicket;
  }

  public void setWorkTicket(ResumesResumeConditionFieldsRequiredCountWithTitle workTicket) {
    this.workTicket = workTicket;
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
    public ResumesResumeConditions putAdditionalProperty(String key, Object value) {
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
    ResumesResumeConditions resumesResumeConditions = (ResumesResumeConditions) o;
    return Objects.equals(this.access, resumesResumeConditions.access) &&
        Objects.equals(this.area, resumesResumeConditions.area) &&
        Objects.equals(this.autoHideTime, resumesResumeConditions.autoHideTime) &&
        Objects.equals(this.birthDate, resumesResumeConditions.birthDate) &&
        Objects.equals(this.businessTripReadiness, resumesResumeConditions.businessTripReadiness) &&
        Objects.equals(this.citizenship, resumesResumeConditions.citizenship) &&
        Objects.equals(this.contact, resumesResumeConditions.contact) &&
        Objects.equals(this.district, resumesResumeConditions.district) &&
        Objects.equals(this.driverLicenseTypes, resumesResumeConditions.driverLicenseTypes) &&
        Objects.equals(this.education, resumesResumeConditions.education) &&
        Objects.equals(this.employment, resumesResumeConditions.employment) &&
        Objects.equals(this.employments, resumesResumeConditions.employments) &&
        Objects.equals(this.experience, resumesResumeConditions.experience) &&
        Objects.equals(this.firstName, resumesResumeConditions.firstName) &&
        Objects.equals(this.gender, resumesResumeConditions.gender) &&
        Objects.equals(this.hasVehicle, resumesResumeConditions.hasVehicle) &&
        Objects.equals(this.hiddenFields, resumesResumeConditions.hiddenFields) &&
        Objects.equals(this.language, resumesResumeConditions.language) &&
        Objects.equals(this.lastName, resumesResumeConditions.lastName) &&
        Objects.equals(this.metro, resumesResumeConditions.metro) &&
        Objects.equals(this.middleName, resumesResumeConditions.middleName) &&
        Objects.equals(this.photo, resumesResumeConditions.photo) &&
        Objects.equals(this.portfolio, resumesResumeConditions.portfolio) &&
        Objects.equals(this.professionalRoles, resumesResumeConditions.professionalRoles) &&
        Objects.equals(this.recommendation, resumesResumeConditions.recommendation) &&
        Objects.equals(this.relocation, resumesResumeConditions.relocation) &&
        Objects.equals(this.resumeLocale, resumesResumeConditions.resumeLocale) &&
        Objects.equals(this.salary, resumesResumeConditions.salary) &&
        Objects.equals(this.schedule, resumesResumeConditions.schedule) &&
        Objects.equals(this.schedules, resumesResumeConditions.schedules) &&
        Objects.equals(this.site, resumesResumeConditions.site) &&
        Objects.equals(this.skillSet, resumesResumeConditions.skillSet) &&
        Objects.equals(this.skills, resumesResumeConditions.skills) &&
        Objects.equals(this.specialization, resumesResumeConditions.specialization) &&
        Objects.equals(this.title, resumesResumeConditions.title) &&
        Objects.equals(this.travelTime, resumesResumeConditions.travelTime) &&
        Objects.equals(this.workTicket, resumesResumeConditions.workTicket) &&
    Objects.equals(this.additionalProperties, resumesResumeConditions.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(access, area, autoHideTime, birthDate, businessTripReadiness, citizenship, contact, district, driverLicenseTypes, education, employment, employments, experience, firstName, gender, hasVehicle, hiddenFields, language, lastName, metro, middleName, photo, portfolio, professionalRoles, recommendation, relocation, resumeLocale, salary, schedule, schedules, site, skillSet, skills, specialization, title, travelTime, workTicket, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ResumesResumeConditions {\n");
    sb.append("    access: ").append(toIndentedString(access)).append("\n");
    sb.append("    area: ").append(toIndentedString(area)).append("\n");
    sb.append("    autoHideTime: ").append(toIndentedString(autoHideTime)).append("\n");
    sb.append("    birthDate: ").append(toIndentedString(birthDate)).append("\n");
    sb.append("    businessTripReadiness: ").append(toIndentedString(businessTripReadiness)).append("\n");
    sb.append("    citizenship: ").append(toIndentedString(citizenship)).append("\n");
    sb.append("    contact: ").append(toIndentedString(contact)).append("\n");
    sb.append("    district: ").append(toIndentedString(district)).append("\n");
    sb.append("    driverLicenseTypes: ").append(toIndentedString(driverLicenseTypes)).append("\n");
    sb.append("    education: ").append(toIndentedString(education)).append("\n");
    sb.append("    employment: ").append(toIndentedString(employment)).append("\n");
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
    sb.append("    portfolio: ").append(toIndentedString(portfolio)).append("\n");
    sb.append("    professionalRoles: ").append(toIndentedString(professionalRoles)).append("\n");
    sb.append("    recommendation: ").append(toIndentedString(recommendation)).append("\n");
    sb.append("    relocation: ").append(toIndentedString(relocation)).append("\n");
    sb.append("    resumeLocale: ").append(toIndentedString(resumeLocale)).append("\n");
    sb.append("    salary: ").append(toIndentedString(salary)).append("\n");
    sb.append("    schedule: ").append(toIndentedString(schedule)).append("\n");
    sb.append("    schedules: ").append(toIndentedString(schedules)).append("\n");
    sb.append("    site: ").append(toIndentedString(site)).append("\n");
    sb.append("    skillSet: ").append(toIndentedString(skillSet)).append("\n");
    sb.append("    skills: ").append(toIndentedString(skills)).append("\n");
    sb.append("    specialization: ").append(toIndentedString(specialization)).append("\n");
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
    sb.append("    travelTime: ").append(toIndentedString(travelTime)).append("\n");
    sb.append("    workTicket: ").append(toIndentedString(workTicket)).append("\n");
    
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

