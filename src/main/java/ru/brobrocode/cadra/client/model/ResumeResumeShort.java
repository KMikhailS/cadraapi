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
 * ResumeResumeShort
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2025-08-17T15:41:09.394389505+05:00[Asia/Yekaterinburg]", comments = "Generator version: 7.6.0")
public class ResumeResumeShort {

  private String alternateUrl;

  private String id;

  private String title = null;

  @Valid
  private List<@Valid ResumeObjectsEmploymentFormEmploymentFormItemResponse> employmentForm = new ArrayList<>();

  @Valid
  private List<@Valid ResumeObjectsWorkFormatWorkFormatItemResponse> workFormat = new ArrayList<>();

  private BigDecimal age = null;

  private IncludesIdNameUrl area = null;

  private Boolean canViewFullInfo = null;

  @Valid
  private List<@Valid ResumeObjectsCertificate> certificate = new ArrayList<>();

  private String createdAt;

  private Object download;

  private Object education;

  private String firstName = null;

  private IncludesIdName gender = null;

  @Valid
  private List<@Valid IncludesIdName> hiddenFields = new ArrayList<>();

  private String lastName = null;

  private Boolean marked;

  private String middleName = null;

  private Object platform;

  private String realId;

  private ResumeObjectsSalaryProperties salary = null;

  private ResumeObjectsTotalExperience totalExperience = null;

  private String updatedAt;

  private ResumeObjectsActions actions;

  @Valid
  private List<ResumeObjectsExperienceShort> experience = new ArrayList<>();

  private Boolean favorited;

  private Object negotiationsHistory;

  private Object owner;

  private ResumeObjectsPhotoNoId photo = null;

  @Valid
  private List<@Valid IncludesId> tags = new ArrayList<>();

  private Boolean viewed;

  public ResumeResumeShort() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public ResumeResumeShort(String alternateUrl, String id, String title, List<@Valid ResumeObjectsCertificate> certificate, String createdAt, Object download, Object education, List<@Valid IncludesIdName> hiddenFields, String realId, String updatedAt, ResumeObjectsActions actions, List<ResumeObjectsExperienceShort> experience, Boolean favorited, Object negotiationsHistory, Object owner) {
    this.alternateUrl = alternateUrl;
    this.id = id;
    this.title = title;
    this.certificate = certificate;
    this.createdAt = createdAt;
    this.download = download;
    this.education = education;
    this.hiddenFields = hiddenFields;
    this.realId = realId;
    this.updatedAt = updatedAt;
    this.actions = actions;
    this.experience = experience;
    this.favorited = favorited;
    this.negotiationsHistory = negotiationsHistory;
    this.owner = owner;
  }

  public ResumeResumeShort alternateUrl(String alternateUrl) {
    this.alternateUrl = alternateUrl;
    return this;
  }

  /**
   * URL резюме на сайте
   * @return alternateUrl
  */
  @NotNull 
  @Schema(name = "alternate_url", description = "URL резюме на сайте", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("alternate_url")
  public String getAlternateUrl() {
    return alternateUrl;
  }

  public void setAlternateUrl(String alternateUrl) {
    this.alternateUrl = alternateUrl;
  }

  public ResumeResumeShort id(String id) {
    this.id = id;
    return this;
  }

  /**
   * Идентификатор резюме
   * @return id
  */
  @NotNull 
  @Schema(name = "id", description = "Идентификатор резюме", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("id")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public ResumeResumeShort title(String title) {
    this.title = title;
    return this;
  }

  /**
   * Желаемая должность
   * @return title
  */
  @NotNull 
  @Schema(name = "title", description = "Желаемая должность", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("title")
  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public ResumeResumeShort employmentForm(List<@Valid ResumeObjectsEmploymentFormEmploymentFormItemResponse> employmentForm) {
    this.employmentForm = employmentForm;
    return this;
  }

  public ResumeResumeShort addEmploymentFormItem(ResumeObjectsEmploymentFormEmploymentFormItemResponse employmentFormItem) {
    if (this.employmentForm == null) {
      this.employmentForm = new ArrayList<>();
    }
    this.employmentForm.add(employmentFormItem);
    return this;
  }

  /**
   * Список типов занятости
   * @return employmentForm
  */
  @Valid 
  @Schema(name = "employment_form", description = "Список типов занятости", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("employment_form")
  public List<@Valid ResumeObjectsEmploymentFormEmploymentFormItemResponse> getEmploymentForm() {
    return employmentForm;
  }

  public void setEmploymentForm(List<@Valid ResumeObjectsEmploymentFormEmploymentFormItemResponse> employmentForm) {
    this.employmentForm = employmentForm;
  }

  public ResumeResumeShort workFormat(List<@Valid ResumeObjectsWorkFormatWorkFormatItemResponse> workFormat) {
    this.workFormat = workFormat;
    return this;
  }

  public ResumeResumeShort addWorkFormatItem(ResumeObjectsWorkFormatWorkFormatItemResponse workFormatItem) {
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
  public List<@Valid ResumeObjectsWorkFormatWorkFormatItemResponse> getWorkFormat() {
    return workFormat;
  }

  public void setWorkFormat(List<@Valid ResumeObjectsWorkFormatWorkFormatItemResponse> workFormat) {
    this.workFormat = workFormat;
  }

  public ResumeResumeShort age(BigDecimal age) {
    this.age = age;
    return this;
  }

  /**
   * Возраст
   * @return age
  */
  @Valid 
  @Schema(name = "age", description = "Возраст", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("age")
  public BigDecimal getAge() {
    return age;
  }

  public void setAge(BigDecimal age) {
    this.age = age;
  }

  public ResumeResumeShort area(IncludesIdNameUrl area) {
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
  public IncludesIdNameUrl getArea() {
    return area;
  }

  public void setArea(IncludesIdNameUrl area) {
    this.area = area;
  }

  public ResumeResumeShort canViewFullInfo(Boolean canViewFullInfo) {
    this.canViewFullInfo = canViewFullInfo;
    return this;
  }

  /**
   * Доступен ли просмотр контактной информации в резюме текущему работодателю
   * @return canViewFullInfo
  */
  
  @Schema(name = "can_view_full_info", description = "Доступен ли просмотр контактной информации в резюме текущему работодателю", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("can_view_full_info")
  public Boolean getCanViewFullInfo() {
    return canViewFullInfo;
  }

  public void setCanViewFullInfo(Boolean canViewFullInfo) {
    this.canViewFullInfo = canViewFullInfo;
  }

  public ResumeResumeShort certificate(List<@Valid ResumeObjectsCertificate> certificate) {
    this.certificate = certificate;
    return this;
  }

  public ResumeResumeShort addCertificateItem(ResumeObjectsCertificate certificateItem) {
    if (this.certificate == null) {
      this.certificate = new ArrayList<>();
    }
    this.certificate.add(certificateItem);
    return this;
  }

  /**
   * Список сертификатов соискателя
   * @return certificate
  */
  @NotNull @Valid @Size(min = 0) 
  @Schema(name = "certificate", description = "Список сертификатов соискателя", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("certificate")
  public List<@Valid ResumeObjectsCertificate> getCertificate() {
    return certificate;
  }

  public void setCertificate(List<@Valid ResumeObjectsCertificate> certificate) {
    this.certificate = certificate;
  }

  public ResumeResumeShort createdAt(String createdAt) {
    this.createdAt = createdAt;
    return this;
  }

  /**
   * Дата и время создания резюме
   * @return createdAt
  */
  @NotNull 
  @Schema(name = "created_at", description = "Дата и время создания резюме", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("created_at")
  public String getCreatedAt() {
    return createdAt;
  }

  public void setCreatedAt(String createdAt) {
    this.createdAt = createdAt;
  }

  public ResumeResumeShort download(Object download) {
    this.download = download;
    return this;
  }

  /**
   * Ссылки для скачивания резюме в разных форматах
   * @return download
  */
  @NotNull 
  @Schema(name = "download", description = "Ссылки для скачивания резюме в разных форматах", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("download")
  public Object getDownload() {
    return download;
  }

  public void setDownload(Object download) {
    this.download = download;
  }

  public ResumeResumeShort education(Object education) {
    this.education = education;
    return this;
  }

  /**
   * Образование соискателя.   Особенности сохранения образования:  * Если передать и высшее и среднее образование и уровень образования \"средний\", то сохранится только среднее образование. * Если передать и высшее и среднее образование и уровень образования \"высшее\", то сохранится только высшее образование 
   * @return education
  */
  @NotNull 
  @Schema(name = "education", description = "Образование соискателя.   Особенности сохранения образования:  * Если передать и высшее и среднее образование и уровень образования \"средний\", то сохранится только среднее образование. * Если передать и высшее и среднее образование и уровень образования \"высшее\", то сохранится только высшее образование ", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("education")
  public Object getEducation() {
    return education;
  }

  public void setEducation(Object education) {
    this.education = education;
  }

  public ResumeResumeShort firstName(String firstName) {
    this.firstName = firstName;
    return this;
  }

  /**
   * Имя
   * @return firstName
  */
  
  @Schema(name = "first_name", description = "Имя", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("first_name")
  public String getFirstName() {
    return firstName;
  }

  public void setFirstName(String firstName) {
    this.firstName = firstName;
  }

  public ResumeResumeShort gender(IncludesIdName gender) {
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
  public IncludesIdName getGender() {
    return gender;
  }

  public void setGender(IncludesIdName gender) {
    this.gender = gender;
  }

  public ResumeResumeShort hiddenFields(List<@Valid IncludesIdName> hiddenFields) {
    this.hiddenFields = hiddenFields;
    return this;
  }

  public ResumeResumeShort addHiddenFieldsItem(IncludesIdName hiddenFieldsItem) {
    if (this.hiddenFields == null) {
      this.hiddenFields = new ArrayList<>();
    }
    this.hiddenFields.add(hiddenFieldsItem);
    return this;
  }

  /**
   * Справочник [Список скрытых полей](https://github.com/hhru/api/blob/master/docs/employer_resumes.md#hidden-fields). Возможные значения элементов приведены в поле `resume_hidden_fields` [справочника полей](#tag/Obshie-spravochniki/operation/get-dictionaries)
   * @return hiddenFields
  */
  @NotNull @Valid @Size(min = 0) 
  @Schema(name = "hidden_fields", description = "Справочник [Список скрытых полей](https://github.com/hhru/api/blob/master/docs/employer_resumes.md#hidden-fields). Возможные значения элементов приведены в поле `resume_hidden_fields` [справочника полей](#tag/Obshie-spravochniki/operation/get-dictionaries)", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("hidden_fields")
  public List<@Valid IncludesIdName> getHiddenFields() {
    return hiddenFields;
  }

  public void setHiddenFields(List<@Valid IncludesIdName> hiddenFields) {
    this.hiddenFields = hiddenFields;
  }

  public ResumeResumeShort lastName(String lastName) {
    this.lastName = lastName;
    return this;
  }

  /**
   * Фамилия
   * @return lastName
  */
  
  @Schema(name = "last_name", description = "Фамилия", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("last_name")
  public String getLastName() {
    return lastName;
  }

  public void setLastName(String lastName) {
    this.lastName = lastName;
  }

  public ResumeResumeShort marked(Boolean marked) {
    this.marked = marked;
    return this;
  }

  /**
   * Выделено ли резюме в поиске
   * @return marked
  */
  
  @Schema(name = "marked", description = "Выделено ли резюме в поиске", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("marked")
  public Boolean getMarked() {
    return marked;
  }

  public void setMarked(Boolean marked) {
    this.marked = marked;
  }

  public ResumeResumeShort middleName(String middleName) {
    this.middleName = middleName;
    return this;
  }

  /**
   * Отчество
   * @return middleName
  */
  
  @Schema(name = "middle_name", description = "Отчество", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("middle_name")
  public String getMiddleName() {
    return middleName;
  }

  public void setMiddleName(String middleName) {
    this.middleName = middleName;
  }

  public ResumeResumeShort platform(Object platform) {
    this.platform = platform;
    return this;
  }

  /**
   * Ресурс, на котором было размещено резюме
   * @return platform
  */
  
  @Schema(name = "platform", description = "Ресурс, на котором было размещено резюме", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("platform")
  public Object getPlatform() {
    return platform;
  }

  public void setPlatform(Object platform) {
    this.platform = platform;
  }

  public ResumeResumeShort realId(String realId) {
    this.realId = realId;
    return this;
  }

  /**
   * Уникальный идентификатор резюме
   * @return realId
  */
  @NotNull 
  @Schema(name = "real_id", description = "Уникальный идентификатор резюме", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("real_id")
  public String getRealId() {
    return realId;
  }

  public void setRealId(String realId) {
    this.realId = realId;
  }

  public ResumeResumeShort salary(ResumeObjectsSalaryProperties salary) {
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
  public ResumeObjectsSalaryProperties getSalary() {
    return salary;
  }

  public void setSalary(ResumeObjectsSalaryProperties salary) {
    this.salary = salary;
  }

  public ResumeResumeShort totalExperience(ResumeObjectsTotalExperience totalExperience) {
    this.totalExperience = totalExperience;
    return this;
  }

  /**
   * Get totalExperience
   * @return totalExperience
  */
  @Valid 
  @Schema(name = "total_experience", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("total_experience")
  public ResumeObjectsTotalExperience getTotalExperience() {
    return totalExperience;
  }

  public void setTotalExperience(ResumeObjectsTotalExperience totalExperience) {
    this.totalExperience = totalExperience;
  }

  public ResumeResumeShort updatedAt(String updatedAt) {
    this.updatedAt = updatedAt;
    return this;
  }

  /**
   * Дата и время обновления резюме
   * @return updatedAt
  */
  @NotNull 
  @Schema(name = "updated_at", description = "Дата и время обновления резюме", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("updated_at")
  public String getUpdatedAt() {
    return updatedAt;
  }

  public void setUpdatedAt(String updatedAt) {
    this.updatedAt = updatedAt;
  }

  public ResumeResumeShort actions(ResumeObjectsActions actions) {
    this.actions = actions;
    return this;
  }

  /**
   * Get actions
   * @return actions
  */
  @NotNull @Valid 
  @Schema(name = "actions", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("actions")
  public ResumeObjectsActions getActions() {
    return actions;
  }

  public void setActions(ResumeObjectsActions actions) {
    this.actions = actions;
  }

  public ResumeResumeShort experience(List<ResumeObjectsExperienceShort> experience) {
    this.experience = experience;
    return this;
  }

  public ResumeResumeShort addExperienceItem(ResumeObjectsExperienceShort experienceItem) {
    if (this.experience == null) {
      this.experience = new ArrayList<>();
    }
    this.experience.add(experienceItem);
    return this;
  }

  /**
   * Опыт работы. В объекте опыта отсутствует описание (поле description), а также должность (поле position) доступна только в последнем опыте
   * @return experience
  */
  @NotNull @Valid @Size(min = 0) 
  @Schema(name = "experience", description = "Опыт работы. В объекте опыта отсутствует описание (поле description), а также должность (поле position) доступна только в последнем опыте", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("experience")
  public List<ResumeObjectsExperienceShort> getExperience() {
    return experience;
  }

  public void setExperience(List<ResumeObjectsExperienceShort> experience) {
    this.experience = experience;
  }

  public ResumeResumeShort favorited(Boolean favorited) {
    this.favorited = favorited;
    return this;
  }

  /**
   * Добавлено ли резюме в избранные
   * @return favorited
  */
  @NotNull 
  @Schema(name = "favorited", description = "Добавлено ли резюме в избранные", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("favorited")
  public Boolean getFavorited() {
    return favorited;
  }

  public void setFavorited(Boolean favorited) {
    this.favorited = favorited;
  }

  public ResumeResumeShort negotiationsHistory(Object negotiationsHistory) {
    this.negotiationsHistory = negotiationsHistory;
    return this;
  }

  /**
   * Краткая история откликов/приглашений по резюме
   * @return negotiationsHistory
  */
  @NotNull 
  @Schema(name = "negotiations_history", description = "Краткая история откликов/приглашений по резюме", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("negotiations_history")
  public Object getNegotiationsHistory() {
    return negotiationsHistory;
  }

  public void setNegotiationsHistory(Object negotiationsHistory) {
    this.negotiationsHistory = negotiationsHistory;
  }

  public ResumeResumeShort owner(Object owner) {
    this.owner = owner;
    return this;
  }

  /**
   * Информация о владельце резюме
   * @return owner
  */
  @NotNull 
  @Schema(name = "owner", description = "Информация о владельце резюме", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("owner")
  public Object getOwner() {
    return owner;
  }

  public void setOwner(Object owner) {
    this.owner = owner;
  }

  public ResumeResumeShort photo(ResumeObjectsPhotoNoId photo) {
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
  public ResumeObjectsPhotoNoId getPhoto() {
    return photo;
  }

  public void setPhoto(ResumeObjectsPhotoNoId photo) {
    this.photo = photo;
  }

  public ResumeResumeShort tags(List<@Valid IncludesId> tags) {
    this.tags = tags;
    return this;
  }

  public ResumeResumeShort addTagsItem(IncludesId tagsItem) {
    if (this.tags == null) {
      this.tags = new ArrayList<>();
    }
    this.tags.add(tagsItem);
    return this;
  }

  /**
   * Теги к резюме
   * @return tags
  */
  @Valid 
  @Schema(name = "tags", description = "Теги к резюме", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("tags")
  public List<@Valid IncludesId> getTags() {
    return tags;
  }

  public void setTags(List<@Valid IncludesId> tags) {
    this.tags = tags;
  }

  public ResumeResumeShort viewed(Boolean viewed) {
    this.viewed = viewed;
    return this;
  }

  /**
   * Было ли резюме уже просмотрено работодателем
   * @return viewed
  */
  
  @Schema(name = "viewed", description = "Было ли резюме уже просмотрено работодателем", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("viewed")
  public Boolean getViewed() {
    return viewed;
  }

  public void setViewed(Boolean viewed) {
    this.viewed = viewed;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ResumeResumeShort resumeResumeShort = (ResumeResumeShort) o;
    return Objects.equals(this.alternateUrl, resumeResumeShort.alternateUrl) &&
        Objects.equals(this.id, resumeResumeShort.id) &&
        Objects.equals(this.title, resumeResumeShort.title) &&
        Objects.equals(this.employmentForm, resumeResumeShort.employmentForm) &&
        Objects.equals(this.workFormat, resumeResumeShort.workFormat) &&
        Objects.equals(this.age, resumeResumeShort.age) &&
        Objects.equals(this.area, resumeResumeShort.area) &&
        Objects.equals(this.canViewFullInfo, resumeResumeShort.canViewFullInfo) &&
        Objects.equals(this.certificate, resumeResumeShort.certificate) &&
        Objects.equals(this.createdAt, resumeResumeShort.createdAt) &&
        Objects.equals(this.download, resumeResumeShort.download) &&
        Objects.equals(this.education, resumeResumeShort.education) &&
        Objects.equals(this.firstName, resumeResumeShort.firstName) &&
        Objects.equals(this.gender, resumeResumeShort.gender) &&
        Objects.equals(this.hiddenFields, resumeResumeShort.hiddenFields) &&
        Objects.equals(this.lastName, resumeResumeShort.lastName) &&
        Objects.equals(this.marked, resumeResumeShort.marked) &&
        Objects.equals(this.middleName, resumeResumeShort.middleName) &&
        Objects.equals(this.platform, resumeResumeShort.platform) &&
        Objects.equals(this.realId, resumeResumeShort.realId) &&
        Objects.equals(this.salary, resumeResumeShort.salary) &&
        Objects.equals(this.totalExperience, resumeResumeShort.totalExperience) &&
        Objects.equals(this.updatedAt, resumeResumeShort.updatedAt) &&
        Objects.equals(this.actions, resumeResumeShort.actions) &&
        Objects.equals(this.experience, resumeResumeShort.experience) &&
        Objects.equals(this.favorited, resumeResumeShort.favorited) &&
        Objects.equals(this.negotiationsHistory, resumeResumeShort.negotiationsHistory) &&
        Objects.equals(this.owner, resumeResumeShort.owner) &&
        Objects.equals(this.photo, resumeResumeShort.photo) &&
        Objects.equals(this.tags, resumeResumeShort.tags) &&
        Objects.equals(this.viewed, resumeResumeShort.viewed);
  }

  @Override
  public int hashCode() {
    return Objects.hash(alternateUrl, id, title, employmentForm, workFormat, age, area, canViewFullInfo, certificate, createdAt, download, education, firstName, gender, hiddenFields, lastName, marked, middleName, platform, realId, salary, totalExperience, updatedAt, actions, experience, favorited, negotiationsHistory, owner, photo, tags, viewed);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ResumeResumeShort {\n");
    sb.append("    alternateUrl: ").append(toIndentedString(alternateUrl)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
    sb.append("    employmentForm: ").append(toIndentedString(employmentForm)).append("\n");
    sb.append("    workFormat: ").append(toIndentedString(workFormat)).append("\n");
    sb.append("    age: ").append(toIndentedString(age)).append("\n");
    sb.append("    area: ").append(toIndentedString(area)).append("\n");
    sb.append("    canViewFullInfo: ").append(toIndentedString(canViewFullInfo)).append("\n");
    sb.append("    certificate: ").append(toIndentedString(certificate)).append("\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    download: ").append(toIndentedString(download)).append("\n");
    sb.append("    education: ").append(toIndentedString(education)).append("\n");
    sb.append("    firstName: ").append(toIndentedString(firstName)).append("\n");
    sb.append("    gender: ").append(toIndentedString(gender)).append("\n");
    sb.append("    hiddenFields: ").append(toIndentedString(hiddenFields)).append("\n");
    sb.append("    lastName: ").append(toIndentedString(lastName)).append("\n");
    sb.append("    marked: ").append(toIndentedString(marked)).append("\n");
    sb.append("    middleName: ").append(toIndentedString(middleName)).append("\n");
    sb.append("    platform: ").append(toIndentedString(platform)).append("\n");
    sb.append("    realId: ").append(toIndentedString(realId)).append("\n");
    sb.append("    salary: ").append(toIndentedString(salary)).append("\n");
    sb.append("    totalExperience: ").append(toIndentedString(totalExperience)).append("\n");
    sb.append("    updatedAt: ").append(toIndentedString(updatedAt)).append("\n");
    sb.append("    actions: ").append(toIndentedString(actions)).append("\n");
    sb.append("    experience: ").append(toIndentedString(experience)).append("\n");
    sb.append("    favorited: ").append(toIndentedString(favorited)).append("\n");
    sb.append("    negotiationsHistory: ").append(toIndentedString(negotiationsHistory)).append("\n");
    sb.append("    owner: ").append(toIndentedString(owner)).append("\n");
    sb.append("    photo: ").append(toIndentedString(photo)).append("\n");
    sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
    sb.append("    viewed: ").append(toIndentedString(viewed)).append("\n");
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

