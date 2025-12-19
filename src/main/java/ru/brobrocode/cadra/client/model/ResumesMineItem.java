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
 * ResumesMineItem
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2025-08-17T15:41:09.394389505+05:00[Asia/Yekaterinburg]", comments = "Generator version: 7.6.0")
public class ResumesMineItem {

  private ResumeObjectsActionsForOwner actions;

  private BigDecimal age = null;

  private String alternateUrl;

  private IncludesIdNameUrl area = null;

  private IncludesIdName autoHideTime = null;

  private Boolean canViewFullInfo = null;

  @Valid
  private List<@Valid ResumeObjectsCertificate> certificate = new ArrayList<>();

  private String createdAt;

  private ResumeObjectsDownload download;

  private ResumeObjectsEducation education;

  @Valid
  private List<@Valid ResumeObjectsExperienceForOwner> experience = new ArrayList<>();

  private String firstName = null;

  private IncludesIdName gender = null;

  @Valid
  private List<@Valid IncludesIdName> hiddenFields = new ArrayList<>();

  private String id;

  private String lastName = null;

  private Boolean marked;

  private String middleName = null;

  private ProfilePhoto photo = null;

  private IncludesId platform;

  private String realId;

  private ResumeObjectsSalaryProperties salary = null;

  private String title = null;

  private ResumeObjectsTotalExperience totalExperience = null;

  private String updatedAt;

  private String url;

  @Valid
  private List<@Valid ResumeObjectsEmploymentFormEmploymentFormItemResponse> employmentForm = new ArrayList<>();

  @Valid
  private List<@Valid ResumeObjectsWorkFormatWorkFormatItemResponse> workFormat = new ArrayList<>();

  private Boolean blocked;

  private Boolean canPublishOrUpdate = null;

  private Boolean finished;

  private IncludesIdName status;

  private ResumeObjectsAccess access;

  private BigDecimal newViews;

  private String nextPublishAt = null;

  @Valid
  private List<@Valid ResumeObjectsPaidServices> paidServices = new ArrayList<>();

  private BigDecimal totalViews;

  private String viewsUrl;

  @Valid
  private List<IncludesContact> contact = new ArrayList<>();

  @Deprecated
  private String created;

  private ResumeObjectsSimilarVacancies similarVacancies;

  @Valid
  private List<@Valid IncludesId> tags = new ArrayList<>();

  @Deprecated
  private String updated;

  @Deprecated
  private Boolean visible;

  public ResumesMineItem() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public ResumesMineItem(ResumeObjectsActionsForOwner actions, String alternateUrl, List<@Valid ResumeObjectsCertificate> certificate, String createdAt, ResumeObjectsDownload download, ResumeObjectsEducation education, List<@Valid ResumeObjectsExperienceForOwner> experience, List<@Valid IncludesIdName> hiddenFields, String id, Boolean marked, String realId, String updatedAt, String url, Boolean blocked, Boolean finished, IncludesIdName status, ResumeObjectsAccess access, BigDecimal newViews, List<@Valid ResumeObjectsPaidServices> paidServices, BigDecimal totalViews, String viewsUrl, List<IncludesContact> contact, String created, ResumeObjectsSimilarVacancies similarVacancies, String updated, Boolean visible) {
    this.actions = actions;
    this.alternateUrl = alternateUrl;
    this.certificate = certificate;
    this.createdAt = createdAt;
    this.download = download;
    this.education = education;
    this.experience = experience;
    this.hiddenFields = hiddenFields;
    this.id = id;
    this.marked = marked;
    this.realId = realId;
    this.updatedAt = updatedAt;
    this.url = url;
    this.blocked = blocked;
    this.finished = finished;
    this.status = status;
    this.access = access;
    this.newViews = newViews;
    this.paidServices = paidServices;
    this.totalViews = totalViews;
    this.viewsUrl = viewsUrl;
    this.contact = contact;
    this.created = created;
    this.similarVacancies = similarVacancies;
    this.updated = updated;
    this.visible = visible;
  }

  public ResumesMineItem actions(ResumeObjectsActionsForOwner actions) {
    this.actions = actions;
    return this;
  }

  /**
   * Дополнительные действия
   * @return actions
  */
  @NotNull @Valid 
  @Schema(name = "actions", description = "Дополнительные действия", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("actions")
  public ResumeObjectsActionsForOwner getActions() {
    return actions;
  }

  public void setActions(ResumeObjectsActionsForOwner actions) {
    this.actions = actions;
  }

  public ResumesMineItem age(BigDecimal age) {
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

  public ResumesMineItem alternateUrl(String alternateUrl) {
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

  public ResumesMineItem area(IncludesIdNameUrl area) {
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

  public ResumesMineItem autoHideTime(IncludesIdName autoHideTime) {
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
  public IncludesIdName getAutoHideTime() {
    return autoHideTime;
  }

  public void setAutoHideTime(IncludesIdName autoHideTime) {
    this.autoHideTime = autoHideTime;
  }

  public ResumesMineItem canViewFullInfo(Boolean canViewFullInfo) {
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

  public ResumesMineItem certificate(List<@Valid ResumeObjectsCertificate> certificate) {
    this.certificate = certificate;
    return this;
  }

  public ResumesMineItem addCertificateItem(ResumeObjectsCertificate certificateItem) {
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

  public ResumesMineItem createdAt(String createdAt) {
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

  public ResumesMineItem download(ResumeObjectsDownload download) {
    this.download = download;
    return this;
  }

  /**
   * Ссылки для скачивания резюме в разных форматах
   * @return download
  */
  @NotNull @Valid 
  @Schema(name = "download", description = "Ссылки для скачивания резюме в разных форматах", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("download")
  public ResumeObjectsDownload getDownload() {
    return download;
  }

  public void setDownload(ResumeObjectsDownload download) {
    this.download = download;
  }

  public ResumesMineItem education(ResumeObjectsEducation education) {
    this.education = education;
    return this;
  }

  /**
   * Образование соискателя.   Особенности сохранения образования:  * Если передать и высшее и среднее образование и уровень образования \"средний\", то сохранится только среднее образование. * Если передать и высшее и среднее образование и уровень образования \"высшее\", то сохранится только высшее образование 
   * @return education
  */
  @NotNull @Valid 
  @Schema(name = "education", description = "Образование соискателя.   Особенности сохранения образования:  * Если передать и высшее и среднее образование и уровень образования \"средний\", то сохранится только среднее образование. * Если передать и высшее и среднее образование и уровень образования \"высшее\", то сохранится только высшее образование ", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("education")
  public ResumeObjectsEducation getEducation() {
    return education;
  }

  public void setEducation(ResumeObjectsEducation education) {
    this.education = education;
  }

  public ResumesMineItem experience(List<@Valid ResumeObjectsExperienceForOwner> experience) {
    this.experience = experience;
    return this;
  }

  public ResumesMineItem addExperienceItem(ResumeObjectsExperienceForOwner experienceItem) {
    if (this.experience == null) {
      this.experience = new ArrayList<>();
    }
    this.experience.add(experienceItem);
    return this;
  }

  /**
   * Опыт работы
   * @return experience
  */
  @NotNull @Valid @Size(min = 0) 
  @Schema(name = "experience", description = "Опыт работы", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("experience")
  public List<@Valid ResumeObjectsExperienceForOwner> getExperience() {
    return experience;
  }

  public void setExperience(List<@Valid ResumeObjectsExperienceForOwner> experience) {
    this.experience = experience;
  }

  public ResumesMineItem firstName(String firstName) {
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

  public ResumesMineItem gender(IncludesIdName gender) {
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

  public ResumesMineItem hiddenFields(List<@Valid IncludesIdName> hiddenFields) {
    this.hiddenFields = hiddenFields;
    return this;
  }

  public ResumesMineItem addHiddenFieldsItem(IncludesIdName hiddenFieldsItem) {
    if (this.hiddenFields == null) {
      this.hiddenFields = new ArrayList<>();
    }
    this.hiddenFields.add(hiddenFieldsItem);
    return this;
  }

  /**
   * Документация [Список скрытых полей](https://github.com/hhru/api/blob/master/docs/employer_resumes.md#hidden-fields). Возможные значения элементов приведены в поле `resume_hidden_fields` [справочника полей](#tag/Obshie-spravochniki/operation/get-dictionaries)
   * @return hiddenFields
  */
  @NotNull @Valid @Size(min = 0) 
  @Schema(name = "hidden_fields", description = "Документация [Список скрытых полей](https://github.com/hhru/api/blob/master/docs/employer_resumes.md#hidden-fields). Возможные значения элементов приведены в поле `resume_hidden_fields` [справочника полей](#tag/Obshie-spravochniki/operation/get-dictionaries)", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("hidden_fields")
  public List<@Valid IncludesIdName> getHiddenFields() {
    return hiddenFields;
  }

  public void setHiddenFields(List<@Valid IncludesIdName> hiddenFields) {
    this.hiddenFields = hiddenFields;
  }

  public ResumesMineItem id(String id) {
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

  public ResumesMineItem lastName(String lastName) {
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

  public ResumesMineItem marked(Boolean marked) {
    this.marked = marked;
    return this;
  }

  /**
   * Выделено ли резюме в поиске
   * @return marked
  */
  @NotNull 
  @Schema(name = "marked", description = "Выделено ли резюме в поиске", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("marked")
  public Boolean getMarked() {
    return marked;
  }

  public void setMarked(Boolean marked) {
    this.marked = marked;
  }

  public ResumesMineItem middleName(String middleName) {
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

  public ResumesMineItem photo(ProfilePhoto photo) {
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
  public ProfilePhoto getPhoto() {
    return photo;
  }

  public void setPhoto(ProfilePhoto photo) {
    this.photo = photo;
  }

  public ResumesMineItem platform(IncludesId platform) {
    this.platform = platform;
    return this;
  }

  /**
   * Ресурс, на котором было размещено резюме
   * @return platform
  */
  @Valid 
  @Schema(name = "platform", description = "Ресурс, на котором было размещено резюме", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("platform")
  public IncludesId getPlatform() {
    return platform;
  }

  public void setPlatform(IncludesId platform) {
    this.platform = platform;
  }

  public ResumesMineItem realId(String realId) {
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

  public ResumesMineItem salary(ResumeObjectsSalaryProperties salary) {
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

  public ResumesMineItem title(String title) {
    this.title = title;
    return this;
  }

  /**
   * Желаемая должность
   * @return title
  */
  
  @Schema(name = "title", description = "Желаемая должность", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("title")
  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public ResumesMineItem totalExperience(ResumeObjectsTotalExperience totalExperience) {
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

  public ResumesMineItem updatedAt(String updatedAt) {
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

  public ResumesMineItem url(String url) {
    this.url = url;
    return this;
  }

  /**
   * URL резюме на сайте
   * @return url
  */
  @NotNull 
  @Schema(name = "url", description = "URL резюме на сайте", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("url")
  public String getUrl() {
    return url;
  }

  public void setUrl(String url) {
    this.url = url;
  }

  public ResumesMineItem employmentForm(List<@Valid ResumeObjectsEmploymentFormEmploymentFormItemResponse> employmentForm) {
    this.employmentForm = employmentForm;
    return this;
  }

  public ResumesMineItem addEmploymentFormItem(ResumeObjectsEmploymentFormEmploymentFormItemResponse employmentFormItem) {
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

  public ResumesMineItem workFormat(List<@Valid ResumeObjectsWorkFormatWorkFormatItemResponse> workFormat) {
    this.workFormat = workFormat;
    return this;
  }

  public ResumesMineItem addWorkFormatItem(ResumeObjectsWorkFormatWorkFormatItemResponse workFormatItem) {
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

  public ResumesMineItem blocked(Boolean blocked) {
    this.blocked = blocked;
    return this;
  }

  /**
   * Заблокировано ли резюме ([подробнее](#tag/Rezyume.-Prosmotr-informacii/Status-rezyume))
   * @return blocked
  */
  @NotNull 
  @Schema(name = "blocked", description = "Заблокировано ли резюме ([подробнее](#tag/Rezyume.-Prosmotr-informacii/Status-rezyume))", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("blocked")
  public Boolean getBlocked() {
    return blocked;
  }

  public void setBlocked(Boolean blocked) {
    this.blocked = blocked;
  }

  public ResumesMineItem canPublishOrUpdate(Boolean canPublishOrUpdate) {
    this.canPublishOrUpdate = canPublishOrUpdate;
    return this;
  }

  /**
   * Можно ли опубликовать или обновить данное резюме
   * @return canPublishOrUpdate
  */
  
  @Schema(name = "can_publish_or_update", description = "Можно ли опубликовать или обновить данное резюме", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("can_publish_or_update")
  public Boolean getCanPublishOrUpdate() {
    return canPublishOrUpdate;
  }

  public void setCanPublishOrUpdate(Boolean canPublishOrUpdate) {
    this.canPublishOrUpdate = canPublishOrUpdate;
  }

  public ResumesMineItem finished(Boolean finished) {
    this.finished = finished;
    return this;
  }

  /**
   * Заполнено ли резюме
   * @return finished
  */
  @NotNull 
  @Schema(name = "finished", description = "Заполнено ли резюме", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("finished")
  public Boolean getFinished() {
    return finished;
  }

  public void setFinished(Boolean finished) {
    this.finished = finished;
  }

  public ResumesMineItem status(IncludesIdName status) {
    this.status = status;
    return this;
  }

  /**
   * Get status
   * @return status
  */
  @NotNull @Valid 
  @Schema(name = "status", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("status")
  public IncludesIdName getStatus() {
    return status;
  }

  public void setStatus(IncludesIdName status) {
    this.status = status;
  }

  public ResumesMineItem access(ResumeObjectsAccess access) {
    this.access = access;
    return this;
  }

  /**
   * Get access
   * @return access
  */
  @NotNull @Valid 
  @Schema(name = "access", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("access")
  public ResumeObjectsAccess getAccess() {
    return access;
  }

  public void setAccess(ResumeObjectsAccess access) {
    this.access = access;
  }

  public ResumesMineItem newViews(BigDecimal newViews) {
    this.newViews = newViews;
    return this;
  }

  /**
   * Число новых просмотров. Данный счетчик сбрасывается при получении [детальной истории просмотров](#tag/Rezyume.-Prosmotr-informacii/operation/get-resume-view-history) 
   * @return newViews
  */
  @NotNull @Valid 
  @Schema(name = "new_views", description = "Число новых просмотров. Данный счетчик сбрасывается при получении [детальной истории просмотров](#tag/Rezyume.-Prosmotr-informacii/operation/get-resume-view-history) ", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("new_views")
  public BigDecimal getNewViews() {
    return newViews;
  }

  public void setNewViews(BigDecimal newViews) {
    this.newViews = newViews;
  }

  public ResumesMineItem nextPublishAt(String nextPublishAt) {
    this.nextPublishAt = nextPublishAt;
    return this;
  }

  /**
   * Дата и время следующей возможной публикации/обновления. Для неопубликованных резюме возвращается `null`
   * @return nextPublishAt
  */
  
  @Schema(name = "next_publish_at", description = "Дата и время следующей возможной публикации/обновления. Для неопубликованных резюме возвращается `null`", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("next_publish_at")
  public String getNextPublishAt() {
    return nextPublishAt;
  }

  public void setNextPublishAt(String nextPublishAt) {
    this.nextPublishAt = nextPublishAt;
  }

  public ResumesMineItem paidServices(List<@Valid ResumeObjectsPaidServices> paidServices) {
    this.paidServices = paidServices;
    return this;
  }

  public ResumesMineItem addPaidServicesItem(ResumeObjectsPaidServices paidServicesItem) {
    if (this.paidServices == null) {
      this.paidServices = new ArrayList<>();
    }
    this.paidServices.add(paidServicesItem);
    return this;
  }

  /**
   * Платные услуги по резюме для автора
   * @return paidServices
  */
  @NotNull @Valid 
  @Schema(name = "paid_services", description = "Платные услуги по резюме для автора", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("paid_services")
  public List<@Valid ResumeObjectsPaidServices> getPaidServices() {
    return paidServices;
  }

  public void setPaidServices(List<@Valid ResumeObjectsPaidServices> paidServices) {
    this.paidServices = paidServices;
  }

  public ResumesMineItem totalViews(BigDecimal totalViews) {
    this.totalViews = totalViews;
    return this;
  }

  /**
   * Число просмотров резюме
   * @return totalViews
  */
  @NotNull @Valid 
  @Schema(name = "total_views", description = "Число просмотров резюме", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("total_views")
  public BigDecimal getTotalViews() {
    return totalViews;
  }

  public void setTotalViews(BigDecimal totalViews) {
    this.totalViews = totalViews;
  }

  public ResumesMineItem viewsUrl(String viewsUrl) {
    this.viewsUrl = viewsUrl;
    return this;
  }

  /**
   * URL, по которому необходимо сделать GET-запрос для получения [детальной истории просмотров](#tag/Rezyume.-Prosmotr-informacii/operation/get-resume-view-history) 
   * @return viewsUrl
  */
  @NotNull 
  @Schema(name = "views_url", description = "URL, по которому необходимо сделать GET-запрос для получения [детальной истории просмотров](#tag/Rezyume.-Prosmotr-informacii/operation/get-resume-view-history) ", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("views_url")
  public String getViewsUrl() {
    return viewsUrl;
  }

  public void setViewsUrl(String viewsUrl) {
    this.viewsUrl = viewsUrl;
  }

  public ResumesMineItem contact(List<IncludesContact> contact) {
    this.contact = contact;
    return this;
  }

  public ResumesMineItem addContactItem(IncludesContact contactItem) {
    if (this.contact == null) {
      this.contact = new ArrayList<>();
    }
    this.contact.add(contactItem);
    return this;
  }

  /**
   * Список контактов соискателя
   * @return contact
  */
  @NotNull @Valid 
  @Schema(name = "contact", description = "Список контактов соискателя", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("contact")
  public List<IncludesContact> getContact() {
    return contact;
  }

  public void setContact(List<IncludesContact> contact) {
    this.contact = contact;
  }

  public ResumesMineItem created(String created) {
    this.created = created;
    return this;
  }

  /**
   * Дата и время создания резюме
   * @return created
   * @deprecated
  */
  @NotNull 
  @Schema(name = "created", description = "Дата и время создания резюме", deprecated = true, requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("created")
  @Deprecated
  public String getCreated() {
    return created;
  }

  /**
   * @deprecated
  */
  @Deprecated
  public void setCreated(String created) {
    this.created = created;
  }

  public ResumesMineItem similarVacancies(ResumeObjectsSimilarVacancies similarVacancies) {
    this.similarVacancies = similarVacancies;
    return this;
  }

  /**
   * Get similarVacancies
   * @return similarVacancies
  */
  @NotNull @Valid 
  @Schema(name = "similar_vacancies", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("similar_vacancies")
  public ResumeObjectsSimilarVacancies getSimilarVacancies() {
    return similarVacancies;
  }

  public void setSimilarVacancies(ResumeObjectsSimilarVacancies similarVacancies) {
    this.similarVacancies = similarVacancies;
  }

  public ResumesMineItem tags(List<@Valid IncludesId> tags) {
    this.tags = tags;
    return this;
  }

  public ResumesMineItem addTagsItem(IncludesId tagsItem) {
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

  public ResumesMineItem updated(String updated) {
    this.updated = updated;
    return this;
  }

  /**
   * Дата и время обновления резюме
   * @return updated
   * @deprecated
  */
  @NotNull 
  @Schema(name = "updated", description = "Дата и время обновления резюме", deprecated = true, requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("updated")
  @Deprecated
  public String getUpdated() {
    return updated;
  }

  /**
   * @deprecated
  */
  @Deprecated
  public void setUpdated(String updated) {
    this.updated = updated;
  }

  public ResumesMineItem visible(Boolean visible) {
    this.visible = visible;
    return this;
  }

  /**
   * Видно ли резюме в поиске
   * @return visible
   * @deprecated
  */
  @NotNull 
  @Schema(name = "visible", description = "Видно ли резюме в поиске", deprecated = true, requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("visible")
  @Deprecated
  public Boolean getVisible() {
    return visible;
  }

  /**
   * @deprecated
  */
  @Deprecated
  public void setVisible(Boolean visible) {
    this.visible = visible;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ResumesMineItem resumesMineItem = (ResumesMineItem) o;
    return Objects.equals(this.actions, resumesMineItem.actions) &&
        Objects.equals(this.age, resumesMineItem.age) &&
        Objects.equals(this.alternateUrl, resumesMineItem.alternateUrl) &&
        Objects.equals(this.area, resumesMineItem.area) &&
        Objects.equals(this.autoHideTime, resumesMineItem.autoHideTime) &&
        Objects.equals(this.canViewFullInfo, resumesMineItem.canViewFullInfo) &&
        Objects.equals(this.certificate, resumesMineItem.certificate) &&
        Objects.equals(this.createdAt, resumesMineItem.createdAt) &&
        Objects.equals(this.download, resumesMineItem.download) &&
        Objects.equals(this.education, resumesMineItem.education) &&
        Objects.equals(this.experience, resumesMineItem.experience) &&
        Objects.equals(this.firstName, resumesMineItem.firstName) &&
        Objects.equals(this.gender, resumesMineItem.gender) &&
        Objects.equals(this.hiddenFields, resumesMineItem.hiddenFields) &&
        Objects.equals(this.id, resumesMineItem.id) &&
        Objects.equals(this.lastName, resumesMineItem.lastName) &&
        Objects.equals(this.marked, resumesMineItem.marked) &&
        Objects.equals(this.middleName, resumesMineItem.middleName) &&
        Objects.equals(this.photo, resumesMineItem.photo) &&
        Objects.equals(this.platform, resumesMineItem.platform) &&
        Objects.equals(this.realId, resumesMineItem.realId) &&
        Objects.equals(this.salary, resumesMineItem.salary) &&
        Objects.equals(this.title, resumesMineItem.title) &&
        Objects.equals(this.totalExperience, resumesMineItem.totalExperience) &&
        Objects.equals(this.updatedAt, resumesMineItem.updatedAt) &&
        Objects.equals(this.url, resumesMineItem.url) &&
        Objects.equals(this.employmentForm, resumesMineItem.employmentForm) &&
        Objects.equals(this.workFormat, resumesMineItem.workFormat) &&
        Objects.equals(this.blocked, resumesMineItem.blocked) &&
        Objects.equals(this.canPublishOrUpdate, resumesMineItem.canPublishOrUpdate) &&
        Objects.equals(this.finished, resumesMineItem.finished) &&
        Objects.equals(this.status, resumesMineItem.status) &&
        Objects.equals(this.access, resumesMineItem.access) &&
        Objects.equals(this.newViews, resumesMineItem.newViews) &&
        Objects.equals(this.nextPublishAt, resumesMineItem.nextPublishAt) &&
        Objects.equals(this.paidServices, resumesMineItem.paidServices) &&
        Objects.equals(this.totalViews, resumesMineItem.totalViews) &&
        Objects.equals(this.viewsUrl, resumesMineItem.viewsUrl) &&
        Objects.equals(this.contact, resumesMineItem.contact) &&
        Objects.equals(this.created, resumesMineItem.created) &&
        Objects.equals(this.similarVacancies, resumesMineItem.similarVacancies) &&
        Objects.equals(this.tags, resumesMineItem.tags) &&
        Objects.equals(this.updated, resumesMineItem.updated) &&
        Objects.equals(this.visible, resumesMineItem.visible);
  }

  @Override
  public int hashCode() {
    return Objects.hash(actions, age, alternateUrl, area, autoHideTime, canViewFullInfo, certificate, createdAt, download, education, experience, firstName, gender, hiddenFields, id, lastName, marked, middleName, photo, platform, realId, salary, title, totalExperience, updatedAt, url, employmentForm, workFormat, blocked, canPublishOrUpdate, finished, status, access, newViews, nextPublishAt, paidServices, totalViews, viewsUrl, contact, created, similarVacancies, tags, updated, visible);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ResumesMineItem {\n");
    sb.append("    actions: ").append(toIndentedString(actions)).append("\n");
    sb.append("    age: ").append(toIndentedString(age)).append("\n");
    sb.append("    alternateUrl: ").append(toIndentedString(alternateUrl)).append("\n");
    sb.append("    area: ").append(toIndentedString(area)).append("\n");
    sb.append("    autoHideTime: ").append(toIndentedString(autoHideTime)).append("\n");
    sb.append("    canViewFullInfo: ").append(toIndentedString(canViewFullInfo)).append("\n");
    sb.append("    certificate: ").append(toIndentedString(certificate)).append("\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    download: ").append(toIndentedString(download)).append("\n");
    sb.append("    education: ").append(toIndentedString(education)).append("\n");
    sb.append("    experience: ").append(toIndentedString(experience)).append("\n");
    sb.append("    firstName: ").append(toIndentedString(firstName)).append("\n");
    sb.append("    gender: ").append(toIndentedString(gender)).append("\n");
    sb.append("    hiddenFields: ").append(toIndentedString(hiddenFields)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    lastName: ").append(toIndentedString(lastName)).append("\n");
    sb.append("    marked: ").append(toIndentedString(marked)).append("\n");
    sb.append("    middleName: ").append(toIndentedString(middleName)).append("\n");
    sb.append("    photo: ").append(toIndentedString(photo)).append("\n");
    sb.append("    platform: ").append(toIndentedString(platform)).append("\n");
    sb.append("    realId: ").append(toIndentedString(realId)).append("\n");
    sb.append("    salary: ").append(toIndentedString(salary)).append("\n");
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
    sb.append("    totalExperience: ").append(toIndentedString(totalExperience)).append("\n");
    sb.append("    updatedAt: ").append(toIndentedString(updatedAt)).append("\n");
    sb.append("    url: ").append(toIndentedString(url)).append("\n");
    sb.append("    employmentForm: ").append(toIndentedString(employmentForm)).append("\n");
    sb.append("    workFormat: ").append(toIndentedString(workFormat)).append("\n");
    sb.append("    blocked: ").append(toIndentedString(blocked)).append("\n");
    sb.append("    canPublishOrUpdate: ").append(toIndentedString(canPublishOrUpdate)).append("\n");
    sb.append("    finished: ").append(toIndentedString(finished)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    access: ").append(toIndentedString(access)).append("\n");
    sb.append("    newViews: ").append(toIndentedString(newViews)).append("\n");
    sb.append("    nextPublishAt: ").append(toIndentedString(nextPublishAt)).append("\n");
    sb.append("    paidServices: ").append(toIndentedString(paidServices)).append("\n");
    sb.append("    totalViews: ").append(toIndentedString(totalViews)).append("\n");
    sb.append("    viewsUrl: ").append(toIndentedString(viewsUrl)).append("\n");
    sb.append("    contact: ").append(toIndentedString(contact)).append("\n");
    sb.append("    created: ").append(toIndentedString(created)).append("\n");
    sb.append("    similarVacancies: ").append(toIndentedString(similarVacancies)).append("\n");
    sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
    sb.append("    updated: ").append(toIndentedString(updated)).append("\n");
    sb.append("    visible: ").append(toIndentedString(visible)).append("\n");
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

