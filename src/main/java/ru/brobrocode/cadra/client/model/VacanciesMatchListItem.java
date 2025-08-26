package ru.brobrocode.cadra.client.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.annotation.Generated;
import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * VacanciesMatchListItem
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2025-08-17T15:41:09.394389505+05:00[Asia/Yekaterinburg]", comments = "Generator version: 7.6.0")
public class VacanciesMatchListItem {

  private VacanciesAddress address = null;

  private String alternateUrl;

  private String applyAlternateUrl;

  private Boolean archived;

  private IncludesArea area;

  private VacancyDepartmentOutput department = null;

  private VacanciesEmployerPublic employer;

  private Boolean hasTest;

  private String id;

  private String name;

  private Boolean premium;

  private String publishedAt;

  @Valid
  private List<VacancyRelationItem> relations = new ArrayList<>();

  private Boolean responseLetterRequired;

  private String responseUrl = null;

  @Deprecated
  private VacancySalary salary = null;

  private VacancySalaryRangeSalaryRangeOutput salaryRange = null;

  private Boolean showContacts = null;

  private Boolean showLogoInSearch = null;

  private VacancyTypeOutput type;

  private String url;

  private Boolean canInvite;

  private String createdAt;

  private IncludesIdName employerNegotiationsState = null;

  private VacancyManagerOutput manager;

  @Valid
  private List<@Valid VacancyNegotiationActions> negotiationsActions = new ArrayList<>();

  private IncludesIdName negotiationsState = null;

  private BigDecimal sortPointDistance = null;

  @Valid
  private List<@Valid VacancyTemplates> templates = new ArrayList<>();

  private VacancyVacancyConstructorTemplate vacancyConstructorTemplate = null;

  private VacancyVacancyProperties vacancyProperties;

  public VacanciesMatchListItem() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public VacanciesMatchListItem(String alternateUrl, String applyAlternateUrl, Boolean archived, IncludesArea area, VacancyDepartmentOutput department, VacanciesEmployerPublic employer, Boolean hasTest, String id, String name, Boolean premium, String publishedAt, List<VacancyRelationItem> relations, Boolean responseLetterRequired, VacancySalary salary, VacancySalaryRangeSalaryRangeOutput salaryRange, VacancyTypeOutput type, String url, Boolean canInvite, String createdAt, IncludesIdName employerNegotiationsState, VacancyManagerOutput manager, List<@Valid VacancyNegotiationActions> negotiationsActions, IncludesIdName negotiationsState) {
    this.alternateUrl = alternateUrl;
    this.applyAlternateUrl = applyAlternateUrl;
    this.archived = archived;
    this.area = area;
    this.department = department;
    this.employer = employer;
    this.hasTest = hasTest;
    this.id = id;
    this.name = name;
    this.premium = premium;
    this.publishedAt = publishedAt;
    this.relations = relations;
    this.responseLetterRequired = responseLetterRequired;
    this.salary = salary;
    this.salaryRange = salaryRange;
    this.type = type;
    this.url = url;
    this.canInvite = canInvite;
    this.createdAt = createdAt;
    this.employerNegotiationsState = employerNegotiationsState;
    this.manager = manager;
    this.negotiationsActions = negotiationsActions;
    this.negotiationsState = negotiationsState;
  }

  public VacanciesMatchListItem address(VacanciesAddress address) {
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
  public VacanciesAddress getAddress() {
    return address;
  }

  public void setAddress(VacanciesAddress address) {
    this.address = address;
  }

  public VacanciesMatchListItem alternateUrl(String alternateUrl) {
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

  public VacanciesMatchListItem applyAlternateUrl(String applyAlternateUrl) {
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

  public VacanciesMatchListItem archived(Boolean archived) {
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

  public VacanciesMatchListItem area(IncludesArea area) {
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

  public VacanciesMatchListItem department(VacancyDepartmentOutput department) {
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

  public VacanciesMatchListItem employer(VacanciesEmployerPublic employer) {
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

  public VacanciesMatchListItem hasTest(Boolean hasTest) {
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

  public VacanciesMatchListItem id(String id) {
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

  public VacanciesMatchListItem name(String name) {
    this.name = name;
    return this;
  }

  /**
   * Название вакансии
   * @return name
  */
  @NotNull 
  @Schema(name = "name", description = "Название вакансии", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("name")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public VacanciesMatchListItem premium(Boolean premium) {
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

  public VacanciesMatchListItem publishedAt(String publishedAt) {
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

  public VacanciesMatchListItem relations(List<VacancyRelationItem> relations) {
    this.relations = relations;
    return this;
  }

  public VacanciesMatchListItem addRelationsItem(VacancyRelationItem relationsItem) {
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

  public VacanciesMatchListItem responseLetterRequired(Boolean responseLetterRequired) {
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

  public VacanciesMatchListItem responseUrl(String responseUrl) {
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

  public VacanciesMatchListItem salary(VacancySalary salary) {
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

  public VacanciesMatchListItem salaryRange(VacancySalaryRangeSalaryRangeOutput salaryRange) {
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

  public VacanciesMatchListItem showContacts(Boolean showContacts) {
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

  public VacanciesMatchListItem showLogoInSearch(Boolean showLogoInSearch) {
    this.showLogoInSearch = showLogoInSearch;
    return this;
  }

  /**
   * Отображать ли лого для вакансии в поисковой выдаче
   * @return showLogoInSearch
  */
  
  @Schema(name = "show_logo_in_search", description = "Отображать ли лого для вакансии в поисковой выдаче", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("show_logo_in_search")
  public Boolean getShowLogoInSearch() {
    return showLogoInSearch;
  }

  public void setShowLogoInSearch(Boolean showLogoInSearch) {
    this.showLogoInSearch = showLogoInSearch;
  }

  public VacanciesMatchListItem type(VacancyTypeOutput type) {
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

  public VacanciesMatchListItem url(String url) {
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

  public VacanciesMatchListItem canInvite(Boolean canInvite) {
    this.canInvite = canInvite;
    return this;
  }

  /**
   * Можно ли пригласить соискателя на данную вакансию
   * @return canInvite
  */
  @NotNull 
  @Schema(name = "can_invite", description = "Можно ли пригласить соискателя на данную вакансию", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("can_invite")
  public Boolean getCanInvite() {
    return canInvite;
  }

  public void setCanInvite(Boolean canInvite) {
    this.canInvite = canInvite;
  }

  public VacanciesMatchListItem createdAt(String createdAt) {
    this.createdAt = createdAt;
    return this;
  }

  /**
   * Дата и время публикации вакансии
   * @return createdAt
  */
  @NotNull 
  @Schema(name = "created_at", description = "Дата и время публикации вакансии", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("created_at")
  public String getCreatedAt() {
    return createdAt;
  }

  public void setCreatedAt(String createdAt) {
    this.createdAt = createdAt;
  }

  public VacanciesMatchListItem employerNegotiationsState(IncludesIdName employerNegotiationsState) {
    this.employerNegotiationsState = employerNegotiationsState;
    return this;
  }

  /**
   * Get employerNegotiationsState
   * @return employerNegotiationsState
  */
  @NotNull @Valid 
  @Schema(name = "employer_negotiations_state", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("employer_negotiations_state")
  public IncludesIdName getEmployerNegotiationsState() {
    return employerNegotiationsState;
  }

  public void setEmployerNegotiationsState(IncludesIdName employerNegotiationsState) {
    this.employerNegotiationsState = employerNegotiationsState;
  }

  public VacanciesMatchListItem manager(VacancyManagerOutput manager) {
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
  public VacancyManagerOutput getManager() {
    return manager;
  }

  public void setManager(VacancyManagerOutput manager) {
    this.manager = manager;
  }

  public VacanciesMatchListItem negotiationsActions(List<@Valid VacancyNegotiationActions> negotiationsActions) {
    this.negotiationsActions = negotiationsActions;
    return this;
  }

  public VacanciesMatchListItem addNegotiationsActionsItem(VacancyNegotiationActions negotiationsActionsItem) {
    if (this.negotiationsActions == null) {
      this.negotiationsActions = new ArrayList<>();
    }
    this.negotiationsActions.add(negotiationsActionsItem);
    return this;
  }

  /**
   * Действия для [создания отклика](#tag/Otklikipriglasheniya-rabotodatelya/operation/invite-applicant-to-vacancy). Если создать отклик невозможно (например, нет нужных услуг), то вернется пустой массив
   * @return negotiationsActions
  */
  @NotNull @Valid @Size(min = 0) 
  @Schema(name = "negotiations_actions", description = "Действия для [создания отклика](#tag/Otklikipriglasheniya-rabotodatelya/operation/invite-applicant-to-vacancy). Если создать отклик невозможно (например, нет нужных услуг), то вернется пустой массив", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("negotiations_actions")
  public List<@Valid VacancyNegotiationActions> getNegotiationsActions() {
    return negotiationsActions;
  }

  public void setNegotiationsActions(List<@Valid VacancyNegotiationActions> negotiationsActions) {
    this.negotiationsActions = negotiationsActions;
  }

  public VacanciesMatchListItem negotiationsState(IncludesIdName negotiationsState) {
    this.negotiationsState = negotiationsState;
    return this;
  }

  /**
   * Get negotiationsState
   * @return negotiationsState
  */
  @NotNull @Valid 
  @Schema(name = "negotiations_state", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("negotiations_state")
  public IncludesIdName getNegotiationsState() {
    return negotiationsState;
  }

  public void setNegotiationsState(IncludesIdName negotiationsState) {
    this.negotiationsState = negotiationsState;
  }

  public VacanciesMatchListItem sortPointDistance(BigDecimal sortPointDistance) {
    this.sortPointDistance = sortPointDistance;
    return this;
  }

  /**
   * Расстояние в метрах между центром сортировки (заданной параметрами `sort_point_lat`, `sort_point_lng`) и указанным в вакансии адресом. В случае, если в адресе указаны только станции метро, выдается расстояние между центром сортировки и средней геометрической точкой указанных станций. Значение `sort_point_distance` выдается только в случае, если заданы параметры `sort_point_lat`, `sort_point_lng`, `order_by=distance` 
   * @return sortPointDistance
  */
  @Valid 
  @Schema(name = "sort_point_distance", description = "Расстояние в метрах между центром сортировки (заданной параметрами `sort_point_lat`, `sort_point_lng`) и указанным в вакансии адресом. В случае, если в адресе указаны только станции метро, выдается расстояние между центром сортировки и средней геометрической точкой указанных станций. Значение `sort_point_distance` выдается только в случае, если заданы параметры `sort_point_lat`, `sort_point_lng`, `order_by=distance` ", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("sort_point_distance")
  public BigDecimal getSortPointDistance() {
    return sortPointDistance;
  }

  public void setSortPointDistance(BigDecimal sortPointDistance) {
    this.sortPointDistance = sortPointDistance;
  }

  public VacanciesMatchListItem templates(List<@Valid VacancyTemplates> templates) {
    this.templates = templates;
    return this;
  }

  public VacanciesMatchListItem addTemplatesItem(VacancyTemplates templatesItem) {
    if (this.templates == null) {
      this.templates = new ArrayList<>();
    }
    this.templates.add(templatesItem);
    return this;
  }

  /**
   * Шаблоны писем
   * @return templates
  */
  @Valid 
  @Schema(name = "templates", description = "Шаблоны писем", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("templates")
  public List<@Valid VacancyTemplates> getTemplates() {
    return templates;
  }

  public void setTemplates(List<@Valid VacancyTemplates> templates) {
    this.templates = templates;
  }

  public VacanciesMatchListItem vacancyConstructorTemplate(VacancyVacancyConstructorTemplate vacancyConstructorTemplate) {
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

  public VacanciesMatchListItem vacancyProperties(VacancyVacancyProperties vacancyProperties) {
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

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    VacanciesMatchListItem vacanciesMatchListItem = (VacanciesMatchListItem) o;
    return Objects.equals(this.address, vacanciesMatchListItem.address) &&
        Objects.equals(this.alternateUrl, vacanciesMatchListItem.alternateUrl) &&
        Objects.equals(this.applyAlternateUrl, vacanciesMatchListItem.applyAlternateUrl) &&
        Objects.equals(this.archived, vacanciesMatchListItem.archived) &&
        Objects.equals(this.area, vacanciesMatchListItem.area) &&
        Objects.equals(this.department, vacanciesMatchListItem.department) &&
        Objects.equals(this.employer, vacanciesMatchListItem.employer) &&
        Objects.equals(this.hasTest, vacanciesMatchListItem.hasTest) &&
        Objects.equals(this.id, vacanciesMatchListItem.id) &&
        Objects.equals(this.name, vacanciesMatchListItem.name) &&
        Objects.equals(this.premium, vacanciesMatchListItem.premium) &&
        Objects.equals(this.publishedAt, vacanciesMatchListItem.publishedAt) &&
        Objects.equals(this.relations, vacanciesMatchListItem.relations) &&
        Objects.equals(this.responseLetterRequired, vacanciesMatchListItem.responseLetterRequired) &&
        Objects.equals(this.responseUrl, vacanciesMatchListItem.responseUrl) &&
        Objects.equals(this.salary, vacanciesMatchListItem.salary) &&
        Objects.equals(this.salaryRange, vacanciesMatchListItem.salaryRange) &&
        Objects.equals(this.showContacts, vacanciesMatchListItem.showContacts) &&
        Objects.equals(this.showLogoInSearch, vacanciesMatchListItem.showLogoInSearch) &&
        Objects.equals(this.type, vacanciesMatchListItem.type) &&
        Objects.equals(this.url, vacanciesMatchListItem.url) &&
        Objects.equals(this.canInvite, vacanciesMatchListItem.canInvite) &&
        Objects.equals(this.createdAt, vacanciesMatchListItem.createdAt) &&
        Objects.equals(this.employerNegotiationsState, vacanciesMatchListItem.employerNegotiationsState) &&
        Objects.equals(this.manager, vacanciesMatchListItem.manager) &&
        Objects.equals(this.negotiationsActions, vacanciesMatchListItem.negotiationsActions) &&
        Objects.equals(this.negotiationsState, vacanciesMatchListItem.negotiationsState) &&
        Objects.equals(this.sortPointDistance, vacanciesMatchListItem.sortPointDistance) &&
        Objects.equals(this.templates, vacanciesMatchListItem.templates) &&
        Objects.equals(this.vacancyConstructorTemplate, vacanciesMatchListItem.vacancyConstructorTemplate) &&
        Objects.equals(this.vacancyProperties, vacanciesMatchListItem.vacancyProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(address, alternateUrl, applyAlternateUrl, archived, area, department, employer, hasTest, id, name, premium, publishedAt, relations, responseLetterRequired, responseUrl, salary, salaryRange, showContacts, showLogoInSearch, type, url, canInvite, createdAt, employerNegotiationsState, manager, negotiationsActions, negotiationsState, sortPointDistance, templates, vacancyConstructorTemplate, vacancyProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class VacanciesMatchListItem {\n");
    sb.append("    address: ").append(toIndentedString(address)).append("\n");
    sb.append("    alternateUrl: ").append(toIndentedString(alternateUrl)).append("\n");
    sb.append("    applyAlternateUrl: ").append(toIndentedString(applyAlternateUrl)).append("\n");
    sb.append("    archived: ").append(toIndentedString(archived)).append("\n");
    sb.append("    area: ").append(toIndentedString(area)).append("\n");
    sb.append("    department: ").append(toIndentedString(department)).append("\n");
    sb.append("    employer: ").append(toIndentedString(employer)).append("\n");
    sb.append("    hasTest: ").append(toIndentedString(hasTest)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    premium: ").append(toIndentedString(premium)).append("\n");
    sb.append("    publishedAt: ").append(toIndentedString(publishedAt)).append("\n");
    sb.append("    relations: ").append(toIndentedString(relations)).append("\n");
    sb.append("    responseLetterRequired: ").append(toIndentedString(responseLetterRequired)).append("\n");
    sb.append("    responseUrl: ").append(toIndentedString(responseUrl)).append("\n");
    sb.append("    salary: ").append(toIndentedString(salary)).append("\n");
    sb.append("    salaryRange: ").append(toIndentedString(salaryRange)).append("\n");
    sb.append("    showContacts: ").append(toIndentedString(showContacts)).append("\n");
    sb.append("    showLogoInSearch: ").append(toIndentedString(showLogoInSearch)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    url: ").append(toIndentedString(url)).append("\n");
    sb.append("    canInvite: ").append(toIndentedString(canInvite)).append("\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    employerNegotiationsState: ").append(toIndentedString(employerNegotiationsState)).append("\n");
    sb.append("    manager: ").append(toIndentedString(manager)).append("\n");
    sb.append("    negotiationsActions: ").append(toIndentedString(negotiationsActions)).append("\n");
    sb.append("    negotiationsState: ").append(toIndentedString(negotiationsState)).append("\n");
    sb.append("    sortPointDistance: ").append(toIndentedString(sortPointDistance)).append("\n");
    sb.append("    templates: ").append(toIndentedString(templates)).append("\n");
    sb.append("    vacancyConstructorTemplate: ").append(toIndentedString(vacancyConstructorTemplate)).append("\n");
    sb.append("    vacancyProperties: ").append(toIndentedString(vacancyProperties)).append("\n");
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

