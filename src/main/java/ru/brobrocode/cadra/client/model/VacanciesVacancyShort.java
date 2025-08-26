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
 * VacanciesVacancyShort
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2025-08-17T15:41:09.394389505+05:00[Asia/Yekaterinburg]", comments = "Generator version: 7.6.0")
public class VacanciesVacancyShort {

  private VacancyAddressRawOutput address = null;

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

  public VacanciesVacancyShort() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public VacanciesVacancyShort(String alternateUrl, String applyAlternateUrl, Boolean archived, IncludesArea area, VacancyDepartmentOutput department, VacanciesEmployerPublic employer, Boolean hasTest, String id, String name, Boolean premium, String publishedAt, List<VacancyRelationItem> relations, Boolean responseLetterRequired, VacancySalary salary, VacancySalaryRangeSalaryRangeOutput salaryRange, VacancyTypeOutput type, String url) {
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

  public VacanciesVacancyShort address(VacancyAddressRawOutput address) {
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

  public VacanciesVacancyShort alternateUrl(String alternateUrl) {
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

  public VacanciesVacancyShort applyAlternateUrl(String applyAlternateUrl) {
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

  public VacanciesVacancyShort archived(Boolean archived) {
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

  public VacanciesVacancyShort area(IncludesArea area) {
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

  public VacanciesVacancyShort department(VacancyDepartmentOutput department) {
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

  public VacanciesVacancyShort employer(VacanciesEmployerPublic employer) {
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

  public VacanciesVacancyShort hasTest(Boolean hasTest) {
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

  public VacanciesVacancyShort id(String id) {
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

  public VacanciesVacancyShort name(String name) {
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

  public VacanciesVacancyShort premium(Boolean premium) {
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

  public VacanciesVacancyShort publishedAt(String publishedAt) {
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

  public VacanciesVacancyShort relations(List<VacancyRelationItem> relations) {
    this.relations = relations;
    return this;
  }

  public VacanciesVacancyShort addRelationsItem(VacancyRelationItem relationsItem) {
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

  public VacanciesVacancyShort responseLetterRequired(Boolean responseLetterRequired) {
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

  public VacanciesVacancyShort responseUrl(String responseUrl) {
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

  public VacanciesVacancyShort salary(VacancySalary salary) {
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

  public VacanciesVacancyShort salaryRange(VacancySalaryRangeSalaryRangeOutput salaryRange) {
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

  public VacanciesVacancyShort showContacts(Boolean showContacts) {
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

  public VacanciesVacancyShort showLogoInSearch(Boolean showLogoInSearch) {
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

  public VacanciesVacancyShort type(VacancyTypeOutput type) {
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

  public VacanciesVacancyShort url(String url) {
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
    VacanciesVacancyShort vacanciesVacancyShort = (VacanciesVacancyShort) o;
    return Objects.equals(this.address, vacanciesVacancyShort.address) &&
        Objects.equals(this.alternateUrl, vacanciesVacancyShort.alternateUrl) &&
        Objects.equals(this.applyAlternateUrl, vacanciesVacancyShort.applyAlternateUrl) &&
        Objects.equals(this.archived, vacanciesVacancyShort.archived) &&
        Objects.equals(this.area, vacanciesVacancyShort.area) &&
        Objects.equals(this.department, vacanciesVacancyShort.department) &&
        Objects.equals(this.employer, vacanciesVacancyShort.employer) &&
        Objects.equals(this.hasTest, vacanciesVacancyShort.hasTest) &&
        Objects.equals(this.id, vacanciesVacancyShort.id) &&
        Objects.equals(this.name, vacanciesVacancyShort.name) &&
        Objects.equals(this.premium, vacanciesVacancyShort.premium) &&
        Objects.equals(this.publishedAt, vacanciesVacancyShort.publishedAt) &&
        Objects.equals(this.relations, vacanciesVacancyShort.relations) &&
        Objects.equals(this.responseLetterRequired, vacanciesVacancyShort.responseLetterRequired) &&
        Objects.equals(this.responseUrl, vacanciesVacancyShort.responseUrl) &&
        Objects.equals(this.salary, vacanciesVacancyShort.salary) &&
        Objects.equals(this.salaryRange, vacanciesVacancyShort.salaryRange) &&
        Objects.equals(this.showContacts, vacanciesVacancyShort.showContacts) &&
        Objects.equals(this.showLogoInSearch, vacanciesVacancyShort.showLogoInSearch) &&
        Objects.equals(this.type, vacanciesVacancyShort.type) &&
        Objects.equals(this.url, vacanciesVacancyShort.url);
  }

  @Override
  public int hashCode() {
    return Objects.hash(address, alternateUrl, applyAlternateUrl, archived, area, department, employer, hasTest, id, name, premium, publishedAt, relations, responseLetterRequired, responseUrl, salary, salaryRange, showContacts, showLogoInSearch, type, url);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class VacanciesVacancyShort {\n");
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

