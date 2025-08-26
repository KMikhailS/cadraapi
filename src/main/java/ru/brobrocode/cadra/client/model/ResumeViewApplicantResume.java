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
 * Информация о резюме для соискателя
 */

@Schema(name = "ResumeViewApplicantResume", description = "Информация о резюме для соискателя")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2025-08-17T15:41:09.394389505+05:00[Asia/Yekaterinburg]", comments = "Generator version: 7.6.0")
public class ResumeViewApplicantResume {

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

  private Boolean marked = false;

  private String middleName = null;

  private Object platform;

  private String realId;

  private ResumeObjectsSalaryProperties salary = null;

  private ResumeObjectsTotalExperience totalExperience = null;

  private String updatedAt;

  @Valid
  private List<ResumeObjectsExperience> experience = new ArrayList<>();

  private String url;

  private ResumeViewApplicantResumeAllOfAccess access;

  private Object actions;

  private IncludesIdName autoHideTime = null;

  private Boolean blocked;

  private Boolean canPublishOrUpdate;

  private Boolean finished;

  @Valid
  private List<@Valid ResumeObjectsModerationNote> moderationNote = new ArrayList<>();

  private String nextPublishAt = null;

  @Valid
  private List<@Valid ResumeViewApplicantResumeAllOfPaidServices> paidServices = new ArrayList<>();

  private ResumeObjectsPhotoShort photo = null;

  private String publishUrl;

  private IncludesIdName status;

  public ResumeViewApplicantResume() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public ResumeViewApplicantResume(String alternateUrl, String id, String title, List<@Valid ResumeObjectsCertificate> certificate, String createdAt, Object download, Object education, List<@Valid IncludesIdName> hiddenFields, String realId, String updatedAt, List<ResumeObjectsExperience> experience, String url, ResumeViewApplicantResumeAllOfAccess access, Object actions, List<@Valid ResumeViewApplicantResumeAllOfPaidServices> paidServices) {
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
    this.experience = experience;
    this.url = url;
    this.access = access;
    this.actions = actions;
    this.paidServices = paidServices;
  }

  public ResumeViewApplicantResume alternateUrl(String alternateUrl) {
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

  public ResumeViewApplicantResume id(String id) {
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

  public ResumeViewApplicantResume title(String title) {
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

  public ResumeViewApplicantResume employmentForm(List<@Valid ResumeObjectsEmploymentFormEmploymentFormItemResponse> employmentForm) {
    this.employmentForm = employmentForm;
    return this;
  }

  public ResumeViewApplicantResume addEmploymentFormItem(ResumeObjectsEmploymentFormEmploymentFormItemResponse employmentFormItem) {
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

  public ResumeViewApplicantResume workFormat(List<@Valid ResumeObjectsWorkFormatWorkFormatItemResponse> workFormat) {
    this.workFormat = workFormat;
    return this;
  }

  public ResumeViewApplicantResume addWorkFormatItem(ResumeObjectsWorkFormatWorkFormatItemResponse workFormatItem) {
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

  public ResumeViewApplicantResume age(BigDecimal age) {
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

  public ResumeViewApplicantResume area(IncludesIdNameUrl area) {
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

  public ResumeViewApplicantResume canViewFullInfo(Boolean canViewFullInfo) {
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

  public ResumeViewApplicantResume certificate(List<@Valid ResumeObjectsCertificate> certificate) {
    this.certificate = certificate;
    return this;
  }

  public ResumeViewApplicantResume addCertificateItem(ResumeObjectsCertificate certificateItem) {
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

  public ResumeViewApplicantResume createdAt(String createdAt) {
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

  public ResumeViewApplicantResume download(Object download) {
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

  public ResumeViewApplicantResume education(Object education) {
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

  public ResumeViewApplicantResume firstName(String firstName) {
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

  public ResumeViewApplicantResume gender(IncludesIdName gender) {
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

  public ResumeViewApplicantResume hiddenFields(List<@Valid IncludesIdName> hiddenFields) {
    this.hiddenFields = hiddenFields;
    return this;
  }

  public ResumeViewApplicantResume addHiddenFieldsItem(IncludesIdName hiddenFieldsItem) {
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

  public ResumeViewApplicantResume lastName(String lastName) {
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

  public ResumeViewApplicantResume marked(Boolean marked) {
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

  public ResumeViewApplicantResume middleName(String middleName) {
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

  public ResumeViewApplicantResume platform(Object platform) {
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

  public ResumeViewApplicantResume realId(String realId) {
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

  public ResumeViewApplicantResume salary(ResumeObjectsSalaryProperties salary) {
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

  public ResumeViewApplicantResume totalExperience(ResumeObjectsTotalExperience totalExperience) {
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

  public ResumeViewApplicantResume updatedAt(String updatedAt) {
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

  public ResumeViewApplicantResume experience(List<ResumeObjectsExperience> experience) {
    this.experience = experience;
    return this;
  }

  public ResumeViewApplicantResume addExperienceItem(ResumeObjectsExperience experienceItem) {
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
  public List<ResumeObjectsExperience> getExperience() {
    return experience;
  }

  public void setExperience(List<ResumeObjectsExperience> experience) {
    this.experience = experience;
  }

  public ResumeViewApplicantResume url(String url) {
    this.url = url;
    return this;
  }

  /**
   * Ссылка на получение элементов
   * @return url
  */
  @NotNull 
  @Schema(name = "url", description = "Ссылка на получение элементов", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("url")
  public String getUrl() {
    return url;
  }

  public void setUrl(String url) {
    this.url = url;
  }

  public ResumeViewApplicantResume access(ResumeViewApplicantResumeAllOfAccess access) {
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
  public ResumeViewApplicantResumeAllOfAccess getAccess() {
    return access;
  }

  public void setAccess(ResumeViewApplicantResumeAllOfAccess access) {
    this.access = access;
  }

  public ResumeViewApplicantResume actions(Object actions) {
    this.actions = actions;
    return this;
  }

  /**
   * Дополнительные действия
   * @return actions
  */
  @NotNull 
  @Schema(name = "actions", description = "Дополнительные действия", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("actions")
  public Object getActions() {
    return actions;
  }

  public void setActions(Object actions) {
    this.actions = actions;
  }

  public ResumeViewApplicantResume autoHideTime(IncludesIdName autoHideTime) {
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

  public ResumeViewApplicantResume blocked(Boolean blocked) {
    this.blocked = blocked;
    return this;
  }

  /**
   * Заблокировано ли резюме ([подробнее](#tag/Rezyume.-Prosmotr-informacii/Status-rezyume))
   * @return blocked
  */
  
  @Schema(name = "blocked", description = "Заблокировано ли резюме ([подробнее](#tag/Rezyume.-Prosmotr-informacii/Status-rezyume))", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("blocked")
  public Boolean getBlocked() {
    return blocked;
  }

  public void setBlocked(Boolean blocked) {
    this.blocked = blocked;
  }

  public ResumeViewApplicantResume canPublishOrUpdate(Boolean canPublishOrUpdate) {
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

  public ResumeViewApplicantResume finished(Boolean finished) {
    this.finished = finished;
    return this;
  }

  /**
   * Заполнено ли резюме
   * @return finished
  */
  
  @Schema(name = "finished", description = "Заполнено ли резюме", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("finished")
  public Boolean getFinished() {
    return finished;
  }

  public void setFinished(Boolean finished) {
    this.finished = finished;
  }

  public ResumeViewApplicantResume moderationNote(List<@Valid ResumeObjectsModerationNote> moderationNote) {
    this.moderationNote = moderationNote;
    return this;
  }

  public ResumeViewApplicantResume addModerationNoteItem(ResumeObjectsModerationNote moderationNoteItem) {
    if (this.moderationNote == null) {
      this.moderationNote = new ArrayList<>();
    }
    this.moderationNote.add(moderationNoteItem);
    return this;
  }

  /**
   * Замечания модератора.  В некоторых случаях замечания могут сопровождаться [блокировкой резюме](#tag/Rezyume.-Prosmotr-informacii/Status-rezyume).  Полный список возможных замечаний доступен в поле `resume_moderation_note` [в справочнике полей](#tag/Obshie-spravochniki/operation/get-dictionaries) 
   * @return moderationNote
  */
  @Valid 
  @Schema(name = "moderation_note", description = "Замечания модератора.  В некоторых случаях замечания могут сопровождаться [блокировкой резюме](#tag/Rezyume.-Prosmotr-informacii/Status-rezyume).  Полный список возможных замечаний доступен в поле `resume_moderation_note` [в справочнике полей](#tag/Obshie-spravochniki/operation/get-dictionaries) ", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("moderation_note")
  public List<@Valid ResumeObjectsModerationNote> getModerationNote() {
    return moderationNote;
  }

  public void setModerationNote(List<@Valid ResumeObjectsModerationNote> moderationNote) {
    this.moderationNote = moderationNote;
  }

  public ResumeViewApplicantResume nextPublishAt(String nextPublishAt) {
    this.nextPublishAt = nextPublishAt;
    return this;
  }

  /**
   * Дата и время следующей возможной публикации/обновления
   * @return nextPublishAt
  */
  
  @Schema(name = "next_publish_at", description = "Дата и время следующей возможной публикации/обновления", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("next_publish_at")
  public String getNextPublishAt() {
    return nextPublishAt;
  }

  public void setNextPublishAt(String nextPublishAt) {
    this.nextPublishAt = nextPublishAt;
  }

  public ResumeViewApplicantResume paidServices(List<@Valid ResumeViewApplicantResumeAllOfPaidServices> paidServices) {
    this.paidServices = paidServices;
    return this;
  }

  public ResumeViewApplicantResume addPaidServicesItem(ResumeViewApplicantResumeAllOfPaidServices paidServicesItem) {
    if (this.paidServices == null) {
      this.paidServices = new ArrayList<>();
    }
    this.paidServices.add(paidServicesItem);
    return this;
  }

  /**
   * Документация [Платные услуги по резюме для автора](#tag/Prosmotr-rezyume/operation/get-resume) (атрибут 'paid_services') 
   * @return paidServices
  */
  @NotNull @Valid 
  @Schema(name = "paid_services", description = "Документация [Платные услуги по резюме для автора](#tag/Prosmotr-rezyume/operation/get-resume) (атрибут 'paid_services') ", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("paid_services")
  public List<@Valid ResumeViewApplicantResumeAllOfPaidServices> getPaidServices() {
    return paidServices;
  }

  public void setPaidServices(List<@Valid ResumeViewApplicantResumeAllOfPaidServices> paidServices) {
    this.paidServices = paidServices;
  }

  public ResumeViewApplicantResume photo(ResumeObjectsPhotoShort photo) {
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
  public ResumeObjectsPhotoShort getPhoto() {
    return photo;
  }

  public void setPhoto(ResumeObjectsPhotoShort photo) {
    this.photo = photo;
  }

  public ResumeViewApplicantResume publishUrl(String publishUrl) {
    this.publishUrl = publishUrl;
    return this;
  }

  /**
   * URL для публикации или обновления резюме
   * @return publishUrl
  */
  
  @Schema(name = "publish_url", description = "URL для публикации или обновления резюме", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("publish_url")
  public String getPublishUrl() {
    return publishUrl;
  }

  public void setPublishUrl(String publishUrl) {
    this.publishUrl = publishUrl;
  }

  public ResumeViewApplicantResume status(IncludesIdName status) {
    this.status = status;
    return this;
  }

  /**
   * Раздел [Статус резюме](#tag/Rezyume.-Prosmotr-informacii/Status-rezyume) 
   * @return status
  */
  @Valid 
  @Schema(name = "status", description = "Раздел [Статус резюме](#tag/Rezyume.-Prosmotr-informacii/Status-rezyume) ", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("status")
  public IncludesIdName getStatus() {
    return status;
  }

  public void setStatus(IncludesIdName status) {
    this.status = status;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ResumeViewApplicantResume resumeViewApplicantResume = (ResumeViewApplicantResume) o;
    return Objects.equals(this.alternateUrl, resumeViewApplicantResume.alternateUrl) &&
        Objects.equals(this.id, resumeViewApplicantResume.id) &&
        Objects.equals(this.title, resumeViewApplicantResume.title) &&
        Objects.equals(this.employmentForm, resumeViewApplicantResume.employmentForm) &&
        Objects.equals(this.workFormat, resumeViewApplicantResume.workFormat) &&
        Objects.equals(this.age, resumeViewApplicantResume.age) &&
        Objects.equals(this.area, resumeViewApplicantResume.area) &&
        Objects.equals(this.canViewFullInfo, resumeViewApplicantResume.canViewFullInfo) &&
        Objects.equals(this.certificate, resumeViewApplicantResume.certificate) &&
        Objects.equals(this.createdAt, resumeViewApplicantResume.createdAt) &&
        Objects.equals(this.download, resumeViewApplicantResume.download) &&
        Objects.equals(this.education, resumeViewApplicantResume.education) &&
        Objects.equals(this.firstName, resumeViewApplicantResume.firstName) &&
        Objects.equals(this.gender, resumeViewApplicantResume.gender) &&
        Objects.equals(this.hiddenFields, resumeViewApplicantResume.hiddenFields) &&
        Objects.equals(this.lastName, resumeViewApplicantResume.lastName) &&
        Objects.equals(this.marked, resumeViewApplicantResume.marked) &&
        Objects.equals(this.middleName, resumeViewApplicantResume.middleName) &&
        Objects.equals(this.platform, resumeViewApplicantResume.platform) &&
        Objects.equals(this.realId, resumeViewApplicantResume.realId) &&
        Objects.equals(this.salary, resumeViewApplicantResume.salary) &&
        Objects.equals(this.totalExperience, resumeViewApplicantResume.totalExperience) &&
        Objects.equals(this.updatedAt, resumeViewApplicantResume.updatedAt) &&
        Objects.equals(this.experience, resumeViewApplicantResume.experience) &&
        Objects.equals(this.url, resumeViewApplicantResume.url) &&
        Objects.equals(this.access, resumeViewApplicantResume.access) &&
        Objects.equals(this.actions, resumeViewApplicantResume.actions) &&
        Objects.equals(this.autoHideTime, resumeViewApplicantResume.autoHideTime) &&
        Objects.equals(this.blocked, resumeViewApplicantResume.blocked) &&
        Objects.equals(this.canPublishOrUpdate, resumeViewApplicantResume.canPublishOrUpdate) &&
        Objects.equals(this.finished, resumeViewApplicantResume.finished) &&
        Objects.equals(this.moderationNote, resumeViewApplicantResume.moderationNote) &&
        Objects.equals(this.nextPublishAt, resumeViewApplicantResume.nextPublishAt) &&
        Objects.equals(this.paidServices, resumeViewApplicantResume.paidServices) &&
        Objects.equals(this.photo, resumeViewApplicantResume.photo) &&
        Objects.equals(this.publishUrl, resumeViewApplicantResume.publishUrl) &&
        Objects.equals(this.status, resumeViewApplicantResume.status);
  }

  @Override
  public int hashCode() {
    return Objects.hash(alternateUrl, id, title, employmentForm, workFormat, age, area, canViewFullInfo, certificate, createdAt, download, education, firstName, gender, hiddenFields, lastName, marked, middleName, platform, realId, salary, totalExperience, updatedAt, experience, url, access, actions, autoHideTime, blocked, canPublishOrUpdate, finished, moderationNote, nextPublishAt, paidServices, photo, publishUrl, status);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ResumeViewApplicantResume {\n");
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
    sb.append("    experience: ").append(toIndentedString(experience)).append("\n");
    sb.append("    url: ").append(toIndentedString(url)).append("\n");
    sb.append("    access: ").append(toIndentedString(access)).append("\n");
    sb.append("    actions: ").append(toIndentedString(actions)).append("\n");
    sb.append("    autoHideTime: ").append(toIndentedString(autoHideTime)).append("\n");
    sb.append("    blocked: ").append(toIndentedString(blocked)).append("\n");
    sb.append("    canPublishOrUpdate: ").append(toIndentedString(canPublishOrUpdate)).append("\n");
    sb.append("    finished: ").append(toIndentedString(finished)).append("\n");
    sb.append("    moderationNote: ").append(toIndentedString(moderationNote)).append("\n");
    sb.append("    nextPublishAt: ").append(toIndentedString(nextPublishAt)).append("\n");
    sb.append("    paidServices: ").append(toIndentedString(paidServices)).append("\n");
    sb.append("    photo: ").append(toIndentedString(photo)).append("\n");
    sb.append("    publishUrl: ").append(toIndentedString(publishUrl)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
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

