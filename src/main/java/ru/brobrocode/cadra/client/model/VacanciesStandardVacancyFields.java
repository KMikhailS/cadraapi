package ru.brobrocode.cadra.client.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.annotation.Generated;
import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * VacanciesStandardVacancyFields
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2025-08-17T15:41:09.394389505+05:00[Asia/Yekaterinburg]", comments = "Generator version: 7.6.0")
public class VacanciesStandardVacancyFields {

  private Boolean acceptIncompleteResumes;

  private Boolean acceptTemporary = null;

  private VacancyAddressRawOutput address = null;

  private String alternateUrl;

  private String applyAlternateUrl;

  private Boolean archived = null;

  private IncludesArea area;

  private VacancyContactsOutput contacts = null;

  private String createdAt;

  private VacancyDepartmentOutput department = null;

  private VacanciesEmployerPublic employer;

  @Valid
  private List<@Valid VacancyFlyInFlyOutDurationFlyInFlyOutDurationItemOutput> flyInFlyOutDuration;

  private Boolean hasTest;

  private String id;

  private VacancyInsiderInterview insiderInterview = null;

  private Boolean internship = null;

  private IncludesMetroStation metroStations;

  private String name;

  private Boolean nightShifts = null;

  private Boolean premium = null;

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
  private VacancyScheduleOutput schedule = null;

  private Boolean showContacts = null;

  private BigDecimal sortPointDistance = null;

  private VacancyTypeOutput type;

  private String url;

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

  public VacanciesStandardVacancyFields() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public VacanciesStandardVacancyFields(Boolean acceptIncompleteResumes, String alternateUrl, String applyAlternateUrl, IncludesArea area, VacancyDepartmentOutput department, VacanciesEmployerPublic employer, Boolean hasTest, String id, String name, List<VacancyProfessionalRoleItemOutput> professionalRoles, String publishedAt, List<VacancyRelationItem> relations, Boolean responseLetterRequired, VacancySalary salary, VacancySalaryRangeSalaryRangeOutput salaryRange, VacancyTypeOutput type, String url) {
    this.acceptIncompleteResumes = acceptIncompleteResumes;
    this.alternateUrl = alternateUrl;
    this.applyAlternateUrl = applyAlternateUrl;
    this.area = area;
    this.department = department;
    this.employer = employer;
    this.hasTest = hasTest;
    this.id = id;
    this.name = name;
    this.professionalRoles = professionalRoles;
    this.publishedAt = publishedAt;
    this.relations = relations;
    this.responseLetterRequired = responseLetterRequired;
    this.salary = salary;
    this.salaryRange = salaryRange;
    this.type = type;
    this.url = url;
  }

  public VacanciesStandardVacancyFields acceptIncompleteResumes(Boolean acceptIncompleteResumes) {
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

  public VacanciesStandardVacancyFields acceptTemporary(Boolean acceptTemporary) {
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

  public VacanciesStandardVacancyFields address(VacancyAddressRawOutput address) {
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
  public VacancyAddressRawOutput getAddress() {
    return address;
  }

  public void setAddress(VacancyAddressRawOutput address) {
    this.address = address;
  }

  public VacanciesStandardVacancyFields alternateUrl(String alternateUrl) {
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

  public VacanciesStandardVacancyFields applyAlternateUrl(String applyAlternateUrl) {
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

  public VacanciesStandardVacancyFields archived(Boolean archived) {
    this.archived = archived;
    return this;
  }

  /**
   * Находится ли данная вакансия в архиве
   * @return archived
  */
  
  @Schema(name = "archived", description = "Находится ли данная вакансия в архиве", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("archived")
  public Boolean getArchived() {
    return archived;
  }

  public void setArchived(Boolean archived) {
    this.archived = archived;
  }

  public VacanciesStandardVacancyFields area(IncludesArea area) {
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

  public VacanciesStandardVacancyFields contacts(VacancyContactsOutput contacts) {
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

  public VacanciesStandardVacancyFields createdAt(String createdAt) {
    this.createdAt = createdAt;
    return this;
  }

  /**
   * Дата и время публикации вакансии
   * @return createdAt
  */
  
  @Schema(name = "created_at", description = "Дата и время публикации вакансии", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("created_at")
  public String getCreatedAt() {
    return createdAt;
  }

  public void setCreatedAt(String createdAt) {
    this.createdAt = createdAt;
  }

  public VacanciesStandardVacancyFields department(VacancyDepartmentOutput department) {
    this.department = department;
    return this;
  }

  /**
   * Get department
   * @return department
  */
  @NotNull @Valid 
  @Schema(name = "department", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("department")
  public VacancyDepartmentOutput getDepartment() {
    return department;
  }

  public void setDepartment(VacancyDepartmentOutput department) {
    this.department = department;
  }

  public VacanciesStandardVacancyFields employer(VacanciesEmployerPublic employer) {
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
  public VacanciesEmployerPublic getEmployer() {
    return employer;
  }

  public void setEmployer(VacanciesEmployerPublic employer) {
    this.employer = employer;
  }

  public VacanciesStandardVacancyFields flyInFlyOutDuration(List<@Valid VacancyFlyInFlyOutDurationFlyInFlyOutDurationItemOutput> flyInFlyOutDuration) {
    this.flyInFlyOutDuration = flyInFlyOutDuration;
    return this;
  }

  public VacanciesStandardVacancyFields addFlyInFlyOutDurationItem(VacancyFlyInFlyOutDurationFlyInFlyOutDurationItemOutput flyInFlyOutDurationItem) {
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

  public VacanciesStandardVacancyFields hasTest(Boolean hasTest) {
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

  public VacanciesStandardVacancyFields id(String id) {
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

  public VacanciesStandardVacancyFields insiderInterview(VacancyInsiderInterview insiderInterview) {
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

  public VacanciesStandardVacancyFields internship(Boolean internship) {
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

  public VacanciesStandardVacancyFields metroStations(IncludesMetroStation metroStations) {
    this.metroStations = metroStations;
    return this;
  }

  /**
   * Get metroStations
   * @return metroStations
  */
  @Valid 
  @Schema(name = "metro_stations", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("metro_stations")
  public IncludesMetroStation getMetroStations() {
    return metroStations;
  }

  public void setMetroStations(IncludesMetroStation metroStations) {
    this.metroStations = metroStations;
  }

  public VacanciesStandardVacancyFields name(String name) {
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

  public VacanciesStandardVacancyFields nightShifts(Boolean nightShifts) {
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

  public VacanciesStandardVacancyFields premium(Boolean premium) {
    this.premium = premium;
    return this;
  }

  /**
   * Является ли данная вакансия премиум-вакансией
   * @return premium
  */
  
  @Schema(name = "premium", description = "Является ли данная вакансия премиум-вакансией", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("premium")
  public Boolean getPremium() {
    return premium;
  }

  public void setPremium(Boolean premium) {
    this.premium = premium;
  }

  public VacanciesStandardVacancyFields professionalRoles(List<VacancyProfessionalRoleItemOutput> professionalRoles) {
    this.professionalRoles = professionalRoles;
    return this;
  }

  public VacanciesStandardVacancyFields addProfessionalRolesItem(VacancyProfessionalRoleItemOutput professionalRolesItem) {
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

  public VacanciesStandardVacancyFields publishedAt(String publishedAt) {
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

  public VacanciesStandardVacancyFields relations(List<VacancyRelationItem> relations) {
    this.relations = relations;
    return this;
  }

  public VacanciesStandardVacancyFields addRelationsItem(VacancyRelationItem relationsItem) {
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
  @NotNull @Valid 
  @Schema(name = "relations", description = "Возвращает связи соискателя с вакансией. Значения из поля `vacancy_relation` в [справочнике полей](#tag/Obshie-spravochniki/operation/get-dictionaries)", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("relations")
  public List<VacancyRelationItem> getRelations() {
    return relations;
  }

  public void setRelations(List<VacancyRelationItem> relations) {
    this.relations = relations;
  }

  public VacanciesStandardVacancyFields responseLetterRequired(Boolean responseLetterRequired) {
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

  public VacanciesStandardVacancyFields responseUrl(String responseUrl) {
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

  public VacanciesStandardVacancyFields salary(VacancySalary salary) {
    this.salary = salary;
    return this;
  }

  /**
   * Get salary
   * @return salary
   * @deprecated
  */
  @NotNull @Valid 
  @Schema(name = "salary", deprecated = true, requiredMode = Schema.RequiredMode.REQUIRED)
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

  public VacanciesStandardVacancyFields salaryRange(VacancySalaryRangeSalaryRangeOutput salaryRange) {
    this.salaryRange = salaryRange;
    return this;
  }

  /**
   * Get salaryRange
   * @return salaryRange
  */
  @NotNull @Valid 
  @Schema(name = "salary_range", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("salary_range")
  public VacancySalaryRangeSalaryRangeOutput getSalaryRange() {
    return salaryRange;
  }

  public void setSalaryRange(VacancySalaryRangeSalaryRangeOutput salaryRange) {
    this.salaryRange = salaryRange;
  }

  public VacanciesStandardVacancyFields schedule(VacancyScheduleOutput schedule) {
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

  public VacanciesStandardVacancyFields showContacts(Boolean showContacts) {
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

  public VacanciesStandardVacancyFields sortPointDistance(BigDecimal sortPointDistance) {
    this.sortPointDistance = sortPointDistance;
    return this;
  }

  /**
   * Расстояние в метрах между центром сортировки (заданной параметрами `sort_point_lat`, `sort_point_lng`) и указанным в вакансии адресом. В случае, если в адресе указаны только станции метро, выдается расстояние между центром сортировки и средней геометрической точкой указанных станций.  Значение `sort_point_distance` выдается только в случае, если заданы параметры `sort_point_lat`, `sort_point_lng`, `order_by=distance`
   * @return sortPointDistance
  */
  @Valid 
  @Schema(name = "sort_point_distance", description = "Расстояние в метрах между центром сортировки (заданной параметрами `sort_point_lat`, `sort_point_lng`) и указанным в вакансии адресом. В случае, если в адресе указаны только станции метро, выдается расстояние между центром сортировки и средней геометрической точкой указанных станций.  Значение `sort_point_distance` выдается только в случае, если заданы параметры `sort_point_lat`, `sort_point_lng`, `order_by=distance`", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("sort_point_distance")
  public BigDecimal getSortPointDistance() {
    return sortPointDistance;
  }

  public void setSortPointDistance(BigDecimal sortPointDistance) {
    this.sortPointDistance = sortPointDistance;
  }

  public VacanciesStandardVacancyFields type(VacancyTypeOutput type) {
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

  public VacanciesStandardVacancyFields url(String url) {
    this.url = url;
    return this;
  }

  /**
   * URL вакансии
   * @return url
  */
  @NotNull 
  @Schema(name = "url", description = "URL вакансии", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("url")
  public String getUrl() {
    return url;
  }

  public void setUrl(String url) {
    this.url = url;
  }

  public VacanciesStandardVacancyFields workFormat(List<@Valid VacancyWorkFormatWorkFormatItemOutput> workFormat) {
    this.workFormat = workFormat;
    return this;
  }

  public VacanciesStandardVacancyFields addWorkFormatItem(VacancyWorkFormatWorkFormatItemOutput workFormatItem) {
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

  public VacanciesStandardVacancyFields workScheduleByDays(List<@Valid VacancyWorkScheduleByDaysWorkScheduleByDaysItemOutput> workScheduleByDays) {
    this.workScheduleByDays = workScheduleByDays;
    return this;
  }

  public VacanciesStandardVacancyFields addWorkScheduleByDaysItem(VacancyWorkScheduleByDaysWorkScheduleByDaysItemOutput workScheduleByDaysItem) {
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

  public VacanciesStandardVacancyFields workingDays(List<@Valid VacancyWorkingDayItemOutput> workingDays) {
    this.workingDays = workingDays;
    return this;
  }

  public VacanciesStandardVacancyFields addWorkingDaysItem(VacancyWorkingDayItemOutput workingDaysItem) {
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

  public VacanciesStandardVacancyFields workingHours(List<@Valid VacancyWorkingHoursWorkingHoursItemOutput> workingHours) {
    this.workingHours = workingHours;
    return this;
  }

  public VacanciesStandardVacancyFields addWorkingHoursItem(VacancyWorkingHoursWorkingHoursItemOutput workingHoursItem) {
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

  public VacanciesStandardVacancyFields workingTimeIntervals(List<@Valid VacancyWorkingTimeIntervalItemOutput> workingTimeIntervals) {
    this.workingTimeIntervals = workingTimeIntervals;
    return this;
  }

  public VacanciesStandardVacancyFields addWorkingTimeIntervalsItem(VacancyWorkingTimeIntervalItemOutput workingTimeIntervalsItem) {
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

  public VacanciesStandardVacancyFields workingTimeModes(List<@Valid VacancyWorkingTimeModeItemOutput> workingTimeModes) {
    this.workingTimeModes = workingTimeModes;
    return this;
  }

  public VacanciesStandardVacancyFields addWorkingTimeModesItem(VacancyWorkingTimeModeItemOutput workingTimeModesItem) {
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
    VacanciesStandardVacancyFields vacanciesStandardVacancyFields = (VacanciesStandardVacancyFields) o;
    return Objects.equals(this.acceptIncompleteResumes, vacanciesStandardVacancyFields.acceptIncompleteResumes) &&
        Objects.equals(this.acceptTemporary, vacanciesStandardVacancyFields.acceptTemporary) &&
        Objects.equals(this.address, vacanciesStandardVacancyFields.address) &&
        Objects.equals(this.alternateUrl, vacanciesStandardVacancyFields.alternateUrl) &&
        Objects.equals(this.applyAlternateUrl, vacanciesStandardVacancyFields.applyAlternateUrl) &&
        Objects.equals(this.archived, vacanciesStandardVacancyFields.archived) &&
        Objects.equals(this.area, vacanciesStandardVacancyFields.area) &&
        Objects.equals(this.contacts, vacanciesStandardVacancyFields.contacts) &&
        Objects.equals(this.createdAt, vacanciesStandardVacancyFields.createdAt) &&
        Objects.equals(this.department, vacanciesStandardVacancyFields.department) &&
        Objects.equals(this.employer, vacanciesStandardVacancyFields.employer) &&
        Objects.equals(this.flyInFlyOutDuration, vacanciesStandardVacancyFields.flyInFlyOutDuration) &&
        Objects.equals(this.hasTest, vacanciesStandardVacancyFields.hasTest) &&
        Objects.equals(this.id, vacanciesStandardVacancyFields.id) &&
        Objects.equals(this.insiderInterview, vacanciesStandardVacancyFields.insiderInterview) &&
        Objects.equals(this.internship, vacanciesStandardVacancyFields.internship) &&
        Objects.equals(this.metroStations, vacanciesStandardVacancyFields.metroStations) &&
        Objects.equals(this.name, vacanciesStandardVacancyFields.name) &&
        Objects.equals(this.nightShifts, vacanciesStandardVacancyFields.nightShifts) &&
        Objects.equals(this.premium, vacanciesStandardVacancyFields.premium) &&
        Objects.equals(this.professionalRoles, vacanciesStandardVacancyFields.professionalRoles) &&
        Objects.equals(this.publishedAt, vacanciesStandardVacancyFields.publishedAt) &&
        Objects.equals(this.relations, vacanciesStandardVacancyFields.relations) &&
        Objects.equals(this.responseLetterRequired, vacanciesStandardVacancyFields.responseLetterRequired) &&
        Objects.equals(this.responseUrl, vacanciesStandardVacancyFields.responseUrl) &&
        Objects.equals(this.salary, vacanciesStandardVacancyFields.salary) &&
        Objects.equals(this.salaryRange, vacanciesStandardVacancyFields.salaryRange) &&
        Objects.equals(this.schedule, vacanciesStandardVacancyFields.schedule) &&
        Objects.equals(this.showContacts, vacanciesStandardVacancyFields.showContacts) &&
        Objects.equals(this.sortPointDistance, vacanciesStandardVacancyFields.sortPointDistance) &&
        Objects.equals(this.type, vacanciesStandardVacancyFields.type) &&
        Objects.equals(this.url, vacanciesStandardVacancyFields.url) &&
        Objects.equals(this.workFormat, vacanciesStandardVacancyFields.workFormat) &&
        Objects.equals(this.workScheduleByDays, vacanciesStandardVacancyFields.workScheduleByDays) &&
        Objects.equals(this.workingDays, vacanciesStandardVacancyFields.workingDays) &&
        Objects.equals(this.workingHours, vacanciesStandardVacancyFields.workingHours) &&
        Objects.equals(this.workingTimeIntervals, vacanciesStandardVacancyFields.workingTimeIntervals) &&
        Objects.equals(this.workingTimeModes, vacanciesStandardVacancyFields.workingTimeModes);
  }

  @Override
  public int hashCode() {
    return Objects.hash(acceptIncompleteResumes, acceptTemporary, address, alternateUrl, applyAlternateUrl, archived, area, contacts, createdAt, department, employer, flyInFlyOutDuration, hasTest, id, insiderInterview, internship, metroStations, name, nightShifts, premium, professionalRoles, publishedAt, relations, responseLetterRequired, responseUrl, salary, salaryRange, schedule, showContacts, sortPointDistance, type, url, workFormat, workScheduleByDays, workingDays, workingHours, workingTimeIntervals, workingTimeModes);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class VacanciesStandardVacancyFields {\n");
    sb.append("    acceptIncompleteResumes: ").append(toIndentedString(acceptIncompleteResumes)).append("\n");
    sb.append("    acceptTemporary: ").append(toIndentedString(acceptTemporary)).append("\n");
    sb.append("    address: ").append(toIndentedString(address)).append("\n");
    sb.append("    alternateUrl: ").append(toIndentedString(alternateUrl)).append("\n");
    sb.append("    applyAlternateUrl: ").append(toIndentedString(applyAlternateUrl)).append("\n");
    sb.append("    archived: ").append(toIndentedString(archived)).append("\n");
    sb.append("    area: ").append(toIndentedString(area)).append("\n");
    sb.append("    contacts: ").append(toIndentedString(contacts)).append("\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    department: ").append(toIndentedString(department)).append("\n");
    sb.append("    employer: ").append(toIndentedString(employer)).append("\n");
    sb.append("    flyInFlyOutDuration: ").append(toIndentedString(flyInFlyOutDuration)).append("\n");
    sb.append("    hasTest: ").append(toIndentedString(hasTest)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    insiderInterview: ").append(toIndentedString(insiderInterview)).append("\n");
    sb.append("    internship: ").append(toIndentedString(internship)).append("\n");
    sb.append("    metroStations: ").append(toIndentedString(metroStations)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
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
    sb.append("    sortPointDistance: ").append(toIndentedString(sortPointDistance)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    url: ").append(toIndentedString(url)).append("\n");
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

