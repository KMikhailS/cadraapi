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
 * VacanciesVacanciesFavoritedItem
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2025-08-17T15:41:09.394389505+05:00[Asia/Yekaterinburg]", comments = "Generator version: 7.6.0")
public class VacanciesVacanciesFavoritedItem {

  private VacancyAddressRawOutput address = null;

  private String advResponseUrl = null;

  private String alternateUrl;

  private String applyAlternateUrl;

  private Boolean archived;

  private IncludesArea area;

  private String createdAt;

  private VacancyDepartmentOutput department = null;

  private VacanciesVacanciesFavoritedItemEmployer employer;

  private Boolean hasTest;

  private String id;

  private VacancyInsiderInterview insiderInterview = null;

  private String name;

  private String negotiationsUrl = null;

  private Boolean premium;

  private String publishedAt;

  @Valid
  private List<VacancyRelationItem> relations = new ArrayList<>();

  private Boolean responseLetterRequired;

  private String responseUrl = null;

  @Deprecated
  private VacancySalary salary = null;

  private VacancySalaryRangeSalaryRangeOutput salaryRange = null;

  private Boolean showContacts;

  private BigDecimal sortPointDistance = null;

  private String suitableResumesUrl = null;

  private VacancyTypeOutput type;

  private String url;

  public VacanciesVacanciesFavoritedItem() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public VacanciesVacanciesFavoritedItem(String alternateUrl, String applyAlternateUrl, Boolean archived, IncludesArea area, VacancyDepartmentOutput department, VacanciesVacanciesFavoritedItemEmployer employer, Boolean hasTest, String id, String name, Boolean premium, String publishedAt, List<VacancyRelationItem> relations, Boolean responseLetterRequired, VacancySalary salary, VacancySalaryRangeSalaryRangeOutput salaryRange, VacancyTypeOutput type, String url) {
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
  }

  public VacanciesVacanciesFavoritedItem address(VacancyAddressRawOutput address) {
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

  public VacanciesVacanciesFavoritedItem advResponseUrl(String advResponseUrl) {
    this.advResponseUrl = advResponseUrl;
    return this;
  }

  /**
   * URL для регистрации нажатия кнопки отклика
   * @return advResponseUrl
  */
  
  @Schema(name = "adv_response_url", description = "URL для регистрации нажатия кнопки отклика", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("adv_response_url")
  public String getAdvResponseUrl() {
    return advResponseUrl;
  }

  public void setAdvResponseUrl(String advResponseUrl) {
    this.advResponseUrl = advResponseUrl;
  }

  public VacanciesVacanciesFavoritedItem alternateUrl(String alternateUrl) {
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

  public VacanciesVacanciesFavoritedItem applyAlternateUrl(String applyAlternateUrl) {
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

  public VacanciesVacanciesFavoritedItem archived(Boolean archived) {
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

  public VacanciesVacanciesFavoritedItem area(IncludesArea area) {
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

  public VacanciesVacanciesFavoritedItem createdAt(String createdAt) {
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

  public VacanciesVacanciesFavoritedItem department(VacancyDepartmentOutput department) {
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

  public VacanciesVacanciesFavoritedItem employer(VacanciesVacanciesFavoritedItemEmployer employer) {
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
  public VacanciesVacanciesFavoritedItemEmployer getEmployer() {
    return employer;
  }

  public void setEmployer(VacanciesVacanciesFavoritedItemEmployer employer) {
    this.employer = employer;
  }

  public VacanciesVacanciesFavoritedItem hasTest(Boolean hasTest) {
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

  public VacanciesVacanciesFavoritedItem id(String id) {
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

  public VacanciesVacanciesFavoritedItem insiderInterview(VacancyInsiderInterview insiderInterview) {
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

  public VacanciesVacanciesFavoritedItem name(String name) {
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

  public VacanciesVacanciesFavoritedItem negotiationsUrl(String negotiationsUrl) {
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

  public VacanciesVacanciesFavoritedItem premium(Boolean premium) {
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

  public VacanciesVacanciesFavoritedItem publishedAt(String publishedAt) {
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

  public VacanciesVacanciesFavoritedItem relations(List<VacancyRelationItem> relations) {
    this.relations = relations;
    return this;
  }

  public VacanciesVacanciesFavoritedItem addRelationsItem(VacancyRelationItem relationsItem) {
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

  public VacanciesVacanciesFavoritedItem responseLetterRequired(Boolean responseLetterRequired) {
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

  public VacanciesVacanciesFavoritedItem responseUrl(String responseUrl) {
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

  public VacanciesVacanciesFavoritedItem salary(VacancySalary salary) {
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

  public VacanciesVacanciesFavoritedItem salaryRange(VacancySalaryRangeSalaryRangeOutput salaryRange) {
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

  public VacanciesVacanciesFavoritedItem showContacts(Boolean showContacts) {
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

  public VacanciesVacanciesFavoritedItem sortPointDistance(BigDecimal sortPointDistance) {
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

  public VacanciesVacanciesFavoritedItem suitableResumesUrl(String suitableResumesUrl) {
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

  public VacanciesVacanciesFavoritedItem type(VacancyTypeOutput type) {
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

  public VacanciesVacanciesFavoritedItem url(String url) {
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

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    VacanciesVacanciesFavoritedItem vacanciesVacanciesFavoritedItem = (VacanciesVacanciesFavoritedItem) o;
    return Objects.equals(this.address, vacanciesVacanciesFavoritedItem.address) &&
        Objects.equals(this.advResponseUrl, vacanciesVacanciesFavoritedItem.advResponseUrl) &&
        Objects.equals(this.alternateUrl, vacanciesVacanciesFavoritedItem.alternateUrl) &&
        Objects.equals(this.applyAlternateUrl, vacanciesVacanciesFavoritedItem.applyAlternateUrl) &&
        Objects.equals(this.archived, vacanciesVacanciesFavoritedItem.archived) &&
        Objects.equals(this.area, vacanciesVacanciesFavoritedItem.area) &&
        Objects.equals(this.createdAt, vacanciesVacanciesFavoritedItem.createdAt) &&
        Objects.equals(this.department, vacanciesVacanciesFavoritedItem.department) &&
        Objects.equals(this.employer, vacanciesVacanciesFavoritedItem.employer) &&
        Objects.equals(this.hasTest, vacanciesVacanciesFavoritedItem.hasTest) &&
        Objects.equals(this.id, vacanciesVacanciesFavoritedItem.id) &&
        Objects.equals(this.insiderInterview, vacanciesVacanciesFavoritedItem.insiderInterview) &&
        Objects.equals(this.name, vacanciesVacanciesFavoritedItem.name) &&
        Objects.equals(this.negotiationsUrl, vacanciesVacanciesFavoritedItem.negotiationsUrl) &&
        Objects.equals(this.premium, vacanciesVacanciesFavoritedItem.premium) &&
        Objects.equals(this.publishedAt, vacanciesVacanciesFavoritedItem.publishedAt) &&
        Objects.equals(this.relations, vacanciesVacanciesFavoritedItem.relations) &&
        Objects.equals(this.responseLetterRequired, vacanciesVacanciesFavoritedItem.responseLetterRequired) &&
        Objects.equals(this.responseUrl, vacanciesVacanciesFavoritedItem.responseUrl) &&
        Objects.equals(this.salary, vacanciesVacanciesFavoritedItem.salary) &&
        Objects.equals(this.salaryRange, vacanciesVacanciesFavoritedItem.salaryRange) &&
        Objects.equals(this.showContacts, vacanciesVacanciesFavoritedItem.showContacts) &&
        Objects.equals(this.sortPointDistance, vacanciesVacanciesFavoritedItem.sortPointDistance) &&
        Objects.equals(this.suitableResumesUrl, vacanciesVacanciesFavoritedItem.suitableResumesUrl) &&
        Objects.equals(this.type, vacanciesVacanciesFavoritedItem.type) &&
        Objects.equals(this.url, vacanciesVacanciesFavoritedItem.url);
  }

  @Override
  public int hashCode() {
    return Objects.hash(address, advResponseUrl, alternateUrl, applyAlternateUrl, archived, area, createdAt, department, employer, hasTest, id, insiderInterview, name, negotiationsUrl, premium, publishedAt, relations, responseLetterRequired, responseUrl, salary, salaryRange, showContacts, sortPointDistance, suitableResumesUrl, type, url);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class VacanciesVacanciesFavoritedItem {\n");
    sb.append("    address: ").append(toIndentedString(address)).append("\n");
    sb.append("    advResponseUrl: ").append(toIndentedString(advResponseUrl)).append("\n");
    sb.append("    alternateUrl: ").append(toIndentedString(alternateUrl)).append("\n");
    sb.append("    applyAlternateUrl: ").append(toIndentedString(applyAlternateUrl)).append("\n");
    sb.append("    archived: ").append(toIndentedString(archived)).append("\n");
    sb.append("    area: ").append(toIndentedString(area)).append("\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    department: ").append(toIndentedString(department)).append("\n");
    sb.append("    employer: ").append(toIndentedString(employer)).append("\n");
    sb.append("    hasTest: ").append(toIndentedString(hasTest)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    insiderInterview: ").append(toIndentedString(insiderInterview)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    negotiationsUrl: ").append(toIndentedString(negotiationsUrl)).append("\n");
    sb.append("    premium: ").append(toIndentedString(premium)).append("\n");
    sb.append("    publishedAt: ").append(toIndentedString(publishedAt)).append("\n");
    sb.append("    relations: ").append(toIndentedString(relations)).append("\n");
    sb.append("    responseLetterRequired: ").append(toIndentedString(responseLetterRequired)).append("\n");
    sb.append("    responseUrl: ").append(toIndentedString(responseUrl)).append("\n");
    sb.append("    salary: ").append(toIndentedString(salary)).append("\n");
    sb.append("    salaryRange: ").append(toIndentedString(salaryRange)).append("\n");
    sb.append("    showContacts: ").append(toIndentedString(showContacts)).append("\n");
    sb.append("    sortPointDistance: ").append(toIndentedString(sortPointDistance)).append("\n");
    sb.append("    suitableResumesUrl: ").append(toIndentedString(suitableResumesUrl)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    url: ").append(toIndentedString(url)).append("\n");
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

