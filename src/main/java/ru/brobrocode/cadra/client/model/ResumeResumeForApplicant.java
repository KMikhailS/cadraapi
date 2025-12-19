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
 * ResumeResumeForApplicant
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2025-08-17T15:41:09.394389505+05:00[Asia/Yekaterinburg]", comments = "Generator version: 7.6.0")
public class ResumeResumeForApplicant {

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

  private String birthDate = null;

  private IncludesIdName businessTripReadiness;

  @Valid
  private List<@Valid IncludesIdNameUrl> citizenship = new ArrayList<>();

  @Valid
  private List<IncludesContact> contact = new ArrayList<>();

  private CredsCreds creds = null;

  @Valid
  private List<@Valid ResumeObjectsDriverLicenseTypes> driverLicenseTypes = new ArrayList<>();

  @Deprecated
  private IncludesIdName employment;

  @Valid
  private List<@Valid IncludesIdName> employments = new ArrayList<>();

  private Boolean hasVehicle = null;

  @Valid
  private List<IncludesLanguageLevel> language = new ArrayList<>();

  private ResumeObjectsMetroStation metro = null;

  @Valid
  private List<@Valid ResumeObjectsPaidServices> paidServices = new ArrayList<>();

  @Valid
  private List<@Valid IncludesIdName> professionalRoles;

  @Valid
  private List<@Valid ResumeObjectsRecommendation> recommendation = new ArrayList<>();

  private Object relocation;

  private Object resumeLocale;

  @Deprecated
  private IncludesIdName schedule;

  @Valid
  private List<@Valid IncludesIdName> schedules = new ArrayList<>();

  @Valid
  private List<@Valid ResumeObjectsSite> site = new ArrayList<>();

  @Valid
  private List<String> skillSet = new ArrayList<>();

  private String skills = null;

  @Valid
  private List<@Valid IncludesId> tags = new ArrayList<>();

  private IncludesIdName travelTime;

  @Valid
  private List<@Valid IncludesIdNameUrl> workTicket = new ArrayList<>();

  private Boolean blocked;

  private Boolean canPublishOrUpdate = null;

  private Boolean finished;

  private IncludesIdName status;

  @Valid
  private List<@Valid ResumeObjectsModerationNote> moderationNote = new ArrayList<>();

  private ResumeObjectsProgress progress;

  private String publishUrl;

  private ResumeObjectsAccess access;

  private ResumeObjectsActionsForOwner actions;

  private BigDecimal newViews;

  private String nextPublishAt = null;

  private BigDecimal totalViews;

  private String viewsUrl;

  private ResumeObjectsPhoto photo = null;

  @Valid
  private List<@Valid ResumeObjectsPortfolio> portfolio = new ArrayList<>();

  public ResumeResumeForApplicant() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public ResumeResumeForApplicant(String alternateUrl, String id, String title, List<@Valid ResumeObjectsCertificate> certificate, String createdAt, Object download, Object education, List<@Valid IncludesIdName> hiddenFields, String realId, String updatedAt, List<ResumeObjectsExperience> experience, IncludesIdName businessTripReadiness, List<@Valid IncludesIdNameUrl> citizenship, List<IncludesContact> contact, List<@Valid ResumeObjectsDriverLicenseTypes> driverLicenseTypes, List<@Valid IncludesIdName> employments, List<IncludesLanguageLevel> language, List<@Valid ResumeObjectsPaidServices> paidServices, List<@Valid ResumeObjectsRecommendation> recommendation, Object relocation, Object resumeLocale, IncludesIdName schedule, List<@Valid IncludesIdName> schedules, List<@Valid ResumeObjectsSite> site, List<String> skillSet, IncludesIdName travelTime, List<@Valid IncludesIdNameUrl> workTicket, Boolean blocked, Boolean finished, IncludesIdName status, List<@Valid ResumeObjectsModerationNote> moderationNote, ResumeObjectsProgress progress, String publishUrl, ResumeObjectsAccess access, ResumeObjectsActionsForOwner actions, BigDecimal newViews, BigDecimal totalViews, String viewsUrl, List<@Valid ResumeObjectsPortfolio> portfolio) {
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
    this.businessTripReadiness = businessTripReadiness;
    this.citizenship = citizenship;
    this.contact = contact;
    this.driverLicenseTypes = driverLicenseTypes;
    this.employments = employments;
    this.language = language;
    this.paidServices = paidServices;
    this.recommendation = recommendation;
    this.relocation = relocation;
    this.resumeLocale = resumeLocale;
    this.schedule = schedule;
    this.schedules = schedules;
    this.site = site;
    this.skillSet = skillSet;
    this.travelTime = travelTime;
    this.workTicket = workTicket;
    this.blocked = blocked;
    this.finished = finished;
    this.status = status;
    this.moderationNote = moderationNote;
    this.progress = progress;
    this.publishUrl = publishUrl;
    this.access = access;
    this.actions = actions;
    this.newViews = newViews;
    this.totalViews = totalViews;
    this.viewsUrl = viewsUrl;
    this.portfolio = portfolio;
  }

  public ResumeResumeForApplicant alternateUrl(String alternateUrl) {
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

  public ResumeResumeForApplicant id(String id) {
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

  public ResumeResumeForApplicant title(String title) {
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

  public ResumeResumeForApplicant employmentForm(List<@Valid ResumeObjectsEmploymentFormEmploymentFormItemResponse> employmentForm) {
    this.employmentForm = employmentForm;
    return this;
  }

  public ResumeResumeForApplicant addEmploymentFormItem(ResumeObjectsEmploymentFormEmploymentFormItemResponse employmentFormItem) {
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

  public ResumeResumeForApplicant workFormat(List<@Valid ResumeObjectsWorkFormatWorkFormatItemResponse> workFormat) {
    this.workFormat = workFormat;
    return this;
  }

  public ResumeResumeForApplicant addWorkFormatItem(ResumeObjectsWorkFormatWorkFormatItemResponse workFormatItem) {
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

  public ResumeResumeForApplicant age(BigDecimal age) {
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

  public ResumeResumeForApplicant area(IncludesIdNameUrl area) {
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

  public ResumeResumeForApplicant canViewFullInfo(Boolean canViewFullInfo) {
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

  public ResumeResumeForApplicant certificate(List<@Valid ResumeObjectsCertificate> certificate) {
    this.certificate = certificate;
    return this;
  }

  public ResumeResumeForApplicant addCertificateItem(ResumeObjectsCertificate certificateItem) {
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

  public ResumeResumeForApplicant createdAt(String createdAt) {
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

  public ResumeResumeForApplicant download(Object download) {
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

  public ResumeResumeForApplicant education(Object education) {
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

  public ResumeResumeForApplicant firstName(String firstName) {
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

  public ResumeResumeForApplicant gender(IncludesIdName gender) {
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

  public ResumeResumeForApplicant hiddenFields(List<@Valid IncludesIdName> hiddenFields) {
    this.hiddenFields = hiddenFields;
    return this;
  }

  public ResumeResumeForApplicant addHiddenFieldsItem(IncludesIdName hiddenFieldsItem) {
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

  public ResumeResumeForApplicant lastName(String lastName) {
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

  public ResumeResumeForApplicant marked(Boolean marked) {
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

  public ResumeResumeForApplicant middleName(String middleName) {
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

  public ResumeResumeForApplicant platform(Object platform) {
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

  public ResumeResumeForApplicant realId(String realId) {
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

  public ResumeResumeForApplicant salary(ResumeObjectsSalaryProperties salary) {
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

  public ResumeResumeForApplicant totalExperience(ResumeObjectsTotalExperience totalExperience) {
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

  public ResumeResumeForApplicant updatedAt(String updatedAt) {
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

  public ResumeResumeForApplicant experience(List<ResumeObjectsExperience> experience) {
    this.experience = experience;
    return this;
  }

  public ResumeResumeForApplicant addExperienceItem(ResumeObjectsExperience experienceItem) {
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

  public ResumeResumeForApplicant birthDate(String birthDate) {
    this.birthDate = birthDate;
    return this;
  }

  /**
   * День рождения (в формате `ГГГГ-ММ-ДД`)
   * @return birthDate
  */
  
  @Schema(name = "birth_date", description = "День рождения (в формате `ГГГГ-ММ-ДД`)", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("birth_date")
  public String getBirthDate() {
    return birthDate;
  }

  public void setBirthDate(String birthDate) {
    this.birthDate = birthDate;
  }

  public ResumeResumeForApplicant businessTripReadiness(IncludesIdName businessTripReadiness) {
    this.businessTripReadiness = businessTripReadiness;
    return this;
  }

  /**
   * Готовность к командировкам. Элемент справочника [business_trip_readiness](#tag/Obshie-spravochniki/operation/get-dictionaries)
   * @return businessTripReadiness
  */
  @NotNull @Valid 
  @Schema(name = "business_trip_readiness", description = "Готовность к командировкам. Элемент справочника [business_trip_readiness](#tag/Obshie-spravochniki/operation/get-dictionaries)", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("business_trip_readiness")
  public IncludesIdName getBusinessTripReadiness() {
    return businessTripReadiness;
  }

  public void setBusinessTripReadiness(IncludesIdName businessTripReadiness) {
    this.businessTripReadiness = businessTripReadiness;
  }

  public ResumeResumeForApplicant citizenship(List<@Valid IncludesIdNameUrl> citizenship) {
    this.citizenship = citizenship;
    return this;
  }

  public ResumeResumeForApplicant addCitizenshipItem(IncludesIdNameUrl citizenshipItem) {
    if (this.citizenship == null) {
      this.citizenship = new ArrayList<>();
    }
    this.citizenship.add(citizenshipItem);
    return this;
  }

  /**
   * Список гражданств соискателя. Элементы [справочника регионов](#tag/Obshie-spravochniki/operation/get-areas)
   * @return citizenship
  */
  @NotNull @Valid 
  @Schema(name = "citizenship", description = "Список гражданств соискателя. Элементы [справочника регионов](#tag/Obshie-spravochniki/operation/get-areas)", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("citizenship")
  public List<@Valid IncludesIdNameUrl> getCitizenship() {
    return citizenship;
  }

  public void setCitizenship(List<@Valid IncludesIdNameUrl> citizenship) {
    this.citizenship = citizenship;
  }

  public ResumeResumeForApplicant contact(List<IncludesContact> contact) {
    this.contact = contact;
    return this;
  }

  public ResumeResumeForApplicant addContactItem(IncludesContact contactItem) {
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

  public ResumeResumeForApplicant creds(CredsCreds creds) {
    this.creds = creds;
    return this;
  }

  /**
   * Get creds
   * @return creds
  */
  @Valid 
  @Schema(name = "creds", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("creds")
  public CredsCreds getCreds() {
    return creds;
  }

  public void setCreds(CredsCreds creds) {
    this.creds = creds;
  }

  public ResumeResumeForApplicant driverLicenseTypes(List<@Valid ResumeObjectsDriverLicenseTypes> driverLicenseTypes) {
    this.driverLicenseTypes = driverLicenseTypes;
    return this;
  }

  public ResumeResumeForApplicant addDriverLicenseTypesItem(ResumeObjectsDriverLicenseTypes driverLicenseTypesItem) {
    if (this.driverLicenseTypes == null) {
      this.driverLicenseTypes = new ArrayList<>();
    }
    this.driverLicenseTypes.add(driverLicenseTypesItem);
    return this;
  }

  /**
   * Список категорий водительских прав соискателя
   * @return driverLicenseTypes
  */
  @NotNull @Valid 
  @Schema(name = "driver_license_types", description = "Список категорий водительских прав соискателя", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("driver_license_types")
  public List<@Valid ResumeObjectsDriverLicenseTypes> getDriverLicenseTypes() {
    return driverLicenseTypes;
  }

  public void setDriverLicenseTypes(List<@Valid ResumeObjectsDriverLicenseTypes> driverLicenseTypes) {
    this.driverLicenseTypes = driverLicenseTypes;
  }

  public ResumeResumeForApplicant employment(IncludesIdName employment) {
    this.employment = employment;
    return this;
  }

  /**
   * Get employment
   * @return employment
   * @deprecated
  */
  @Valid 
  @Schema(name = "employment", deprecated = true, requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("employment")
  @Deprecated
  public IncludesIdName getEmployment() {
    return employment;
  }

  /**
   * @deprecated
  */
  @Deprecated
  public void setEmployment(IncludesIdName employment) {
    this.employment = employment;
  }

  public ResumeResumeForApplicant employments(List<@Valid IncludesIdName> employments) {
    this.employments = employments;
    return this;
  }

  public ResumeResumeForApplicant addEmploymentsItem(IncludesIdName employmentsItem) {
    if (this.employments == null) {
      this.employments = new ArrayList<>();
    }
    this.employments.add(employmentsItem);
    return this;
  }

  /**
   * Список подходящих соискателю типов занятостей. Элементы справочника [employment](#tag/Obshie-spravochniki/operation/get-dictionaries)
   * @return employments
  */
  @NotNull @Valid 
  @Schema(name = "employments", description = "Список подходящих соискателю типов занятостей. Элементы справочника [employment](#tag/Obshie-spravochniki/operation/get-dictionaries)", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("employments")
  public List<@Valid IncludesIdName> getEmployments() {
    return employments;
  }

  public void setEmployments(List<@Valid IncludesIdName> employments) {
    this.employments = employments;
  }

  public ResumeResumeForApplicant hasVehicle(Boolean hasVehicle) {
    this.hasVehicle = hasVehicle;
    return this;
  }

  /**
   * Наличие личного автомобиля у соискателя
   * @return hasVehicle
  */
  
  @Schema(name = "has_vehicle", description = "Наличие личного автомобиля у соискателя", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("has_vehicle")
  public Boolean getHasVehicle() {
    return hasVehicle;
  }

  public void setHasVehicle(Boolean hasVehicle) {
    this.hasVehicle = hasVehicle;
  }

  public ResumeResumeForApplicant language(List<IncludesLanguageLevel> language) {
    this.language = language;
    return this;
  }

  public ResumeResumeForApplicant addLanguageItem(IncludesLanguageLevel languageItem) {
    if (this.language == null) {
      this.language = new ArrayList<>();
    }
    this.language.add(languageItem);
    return this;
  }

  /**
   * Список языков, которыми владеет соискатель. Элементы справочника [languages](#tag/Obshie-spravochniki/operation/get-languages)
   * @return language
  */
  @NotNull @Valid 
  @Schema(name = "language", description = "Список языков, которыми владеет соискатель. Элементы справочника [languages](#tag/Obshie-spravochniki/operation/get-languages)", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("language")
  public List<IncludesLanguageLevel> getLanguage() {
    return language;
  }

  public void setLanguage(List<IncludesLanguageLevel> language) {
    this.language = language;
  }

  public ResumeResumeForApplicant metro(ResumeObjectsMetroStation metro) {
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
  public ResumeObjectsMetroStation getMetro() {
    return metro;
  }

  public void setMetro(ResumeObjectsMetroStation metro) {
    this.metro = metro;
  }

  public ResumeResumeForApplicant paidServices(List<@Valid ResumeObjectsPaidServices> paidServices) {
    this.paidServices = paidServices;
    return this;
  }

  public ResumeResumeForApplicant addPaidServicesItem(ResumeObjectsPaidServices paidServicesItem) {
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

  public ResumeResumeForApplicant professionalRoles(List<@Valid IncludesIdName> professionalRoles) {
    this.professionalRoles = professionalRoles;
    return this;
  }

  public ResumeResumeForApplicant addProfessionalRolesItem(IncludesIdName professionalRolesItem) {
    if (this.professionalRoles == null) {
      this.professionalRoles = new ArrayList<>();
    }
    this.professionalRoles.add(professionalRolesItem);
    return this;
  }

  /**
   * Массив объектов профролей
   * @return professionalRoles
  */
  @Valid 
  @Schema(name = "professional_roles", description = "Массив объектов профролей", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("professional_roles")
  public List<@Valid IncludesIdName> getProfessionalRoles() {
    return professionalRoles;
  }

  public void setProfessionalRoles(List<@Valid IncludesIdName> professionalRoles) {
    this.professionalRoles = professionalRoles;
  }

  public ResumeResumeForApplicant recommendation(List<@Valid ResumeObjectsRecommendation> recommendation) {
    this.recommendation = recommendation;
    return this;
  }

  public ResumeResumeForApplicant addRecommendationItem(ResumeObjectsRecommendation recommendationItem) {
    if (this.recommendation == null) {
      this.recommendation = new ArrayList<>();
    }
    this.recommendation.add(recommendationItem);
    return this;
  }

  /**
   * Список рекомендаций
   * @return recommendation
  */
  @NotNull @Valid 
  @Schema(name = "recommendation", description = "Список рекомендаций", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("recommendation")
  public List<@Valid ResumeObjectsRecommendation> getRecommendation() {
    return recommendation;
  }

  public void setRecommendation(List<@Valid ResumeObjectsRecommendation> recommendation) {
    this.recommendation = recommendation;
  }

  public ResumeResumeForApplicant relocation(Object relocation) {
    this.relocation = relocation;
    return this;
  }

  /**
   * Возможность переезда
   * @return relocation
  */
  @NotNull 
  @Schema(name = "relocation", description = "Возможность переезда", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("relocation")
  public Object getRelocation() {
    return relocation;
  }

  public void setRelocation(Object relocation) {
    this.relocation = relocation;
  }

  public ResumeResumeForApplicant resumeLocale(Object resumeLocale) {
    this.resumeLocale = resumeLocale;
    return this;
  }

  /**
   * Язык, на котором составлено резюме (локаль). Элемент справочника [локали резюме](#tag/Obshie-spravochniki/operation/get-locales)
   * @return resumeLocale
  */
  @NotNull 
  @Schema(name = "resume_locale", description = "Язык, на котором составлено резюме (локаль). Элемент справочника [локали резюме](#tag/Obshie-spravochniki/operation/get-locales)", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("resume_locale")
  public Object getResumeLocale() {
    return resumeLocale;
  }

  public void setResumeLocale(Object resumeLocale) {
    this.resumeLocale = resumeLocale;
  }

  public ResumeResumeForApplicant schedule(IncludesIdName schedule) {
    this.schedule = schedule;
    return this;
  }

  /**
   * Get schedule
   * @return schedule
   * @deprecated
  */
  @NotNull @Valid 
  @Schema(name = "schedule", deprecated = true, requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("schedule")
  @Deprecated
  public IncludesIdName getSchedule() {
    return schedule;
  }

  /**
   * @deprecated
  */
  @Deprecated
  public void setSchedule(IncludesIdName schedule) {
    this.schedule = schedule;
  }

  public ResumeResumeForApplicant schedules(List<@Valid IncludesIdName> schedules) {
    this.schedules = schedules;
    return this;
  }

  public ResumeResumeForApplicant addSchedulesItem(IncludesIdName schedulesItem) {
    if (this.schedules == null) {
      this.schedules = new ArrayList<>();
    }
    this.schedules.add(schedulesItem);
    return this;
  }

  /**
   * Список подходящих соискателю графиков работы. Элементы справочника [schedule](#tag/Obshie-spravochniki/operation/get-dictionaries)
   * @return schedules
  */
  @NotNull @Valid 
  @Schema(name = "schedules", description = "Список подходящих соискателю графиков работы. Элементы справочника [schedule](#tag/Obshie-spravochniki/operation/get-dictionaries)", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("schedules")
  public List<@Valid IncludesIdName> getSchedules() {
    return schedules;
  }

  public void setSchedules(List<@Valid IncludesIdName> schedules) {
    this.schedules = schedules;
  }

  public ResumeResumeForApplicant site(List<@Valid ResumeObjectsSite> site) {
    this.site = site;
    return this;
  }

  public ResumeResumeForApplicant addSiteItem(ResumeObjectsSite siteItem) {
    if (this.site == null) {
      this.site = new ArrayList<>();
    }
    this.site.add(siteItem);
    return this;
  }

  /**
   * Профили в соц. сетях и других сервисах
   * @return site
  */
  @NotNull @Valid 
  @Schema(name = "site", description = "Профили в соц. сетях и других сервисах", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("site")
  public List<@Valid ResumeObjectsSite> getSite() {
    return site;
  }

  public void setSite(List<@Valid ResumeObjectsSite> site) {
    this.site = site;
  }

  public ResumeResumeForApplicant skillSet(List<String> skillSet) {
    this.skillSet = skillSet;
    return this;
  }

  public ResumeResumeForApplicant addSkillSetItem(String skillSetItem) {
    if (this.skillSet == null) {
      this.skillSet = new ArrayList<>();
    }
    this.skillSet.add(skillSetItem);
    return this;
  }

  /**
   * Ключевые навыки (список уникальных строк)
   * @return skillSet
  */
  @NotNull 
  @Schema(name = "skill_set", description = "Ключевые навыки (список уникальных строк)", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("skill_set")
  public List<String> getSkillSet() {
    return skillSet;
  }

  public void setSkillSet(List<String> skillSet) {
    this.skillSet = skillSet;
  }

  public ResumeResumeForApplicant skills(String skills) {
    this.skills = skills;
    return this;
  }

  /**
   * Дополнительная информация, описание навыков в свободной форме
   * @return skills
  */
  
  @Schema(name = "skills", description = "Дополнительная информация, описание навыков в свободной форме", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("skills")
  public String getSkills() {
    return skills;
  }

  public void setSkills(String skills) {
    this.skills = skills;
  }

  public ResumeResumeForApplicant tags(List<@Valid IncludesId> tags) {
    this.tags = tags;
    return this;
  }

  public ResumeResumeForApplicant addTagsItem(IncludesId tagsItem) {
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

  public ResumeResumeForApplicant travelTime(IncludesIdName travelTime) {
    this.travelTime = travelTime;
    return this;
  }

  /**
   * Желательное время в пути до работы. Элемент справочника [travel_time](#tag/Obshie-spravochniki/operation/get-dictionaries)
   * @return travelTime
  */
  @NotNull @Valid 
  @Schema(name = "travel_time", description = "Желательное время в пути до работы. Элемент справочника [travel_time](#tag/Obshie-spravochniki/operation/get-dictionaries)", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("travel_time")
  public IncludesIdName getTravelTime() {
    return travelTime;
  }

  public void setTravelTime(IncludesIdName travelTime) {
    this.travelTime = travelTime;
  }

  public ResumeResumeForApplicant workTicket(List<@Valid IncludesIdNameUrl> workTicket) {
    this.workTicket = workTicket;
    return this;
  }

  public ResumeResumeForApplicant addWorkTicketItem(IncludesIdNameUrl workTicketItem) {
    if (this.workTicket == null) {
      this.workTicket = new ArrayList<>();
    }
    this.workTicket.add(workTicketItem);
    return this;
  }

  /**
   * Список регионов, в которых соискатель имеет разрешение на работу. Элементы [справочника регионов](#tag/Obshie-spravochniki/operation/get-areas) 
   * @return workTicket
  */
  @NotNull @Valid 
  @Schema(name = "work_ticket", description = "Список регионов, в которых соискатель имеет разрешение на работу. Элементы [справочника регионов](#tag/Obshie-spravochniki/operation/get-areas) ", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("work_ticket")
  public List<@Valid IncludesIdNameUrl> getWorkTicket() {
    return workTicket;
  }

  public void setWorkTicket(List<@Valid IncludesIdNameUrl> workTicket) {
    this.workTicket = workTicket;
  }

  public ResumeResumeForApplicant blocked(Boolean blocked) {
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

  public ResumeResumeForApplicant canPublishOrUpdate(Boolean canPublishOrUpdate) {
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

  public ResumeResumeForApplicant finished(Boolean finished) {
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

  public ResumeResumeForApplicant status(IncludesIdName status) {
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

  public ResumeResumeForApplicant moderationNote(List<@Valid ResumeObjectsModerationNote> moderationNote) {
    this.moderationNote = moderationNote;
    return this;
  }

  public ResumeResumeForApplicant addModerationNoteItem(ResumeObjectsModerationNote moderationNoteItem) {
    if (this.moderationNote == null) {
      this.moderationNote = new ArrayList<>();
    }
    this.moderationNote.add(moderationNoteItem);
    return this;
  }

  /**
   * Замечания модератора. В некоторых случаях замечания могут сопровождаться [блокировкой резюме](#tag/Rezyume.-Prosmotr-informacii/Status-rezyume). Полный список возможных замечаний доступен в поле `resume_moderation_note` [в справочнике полей](#tag/Obshie-spravochniki/operation/get-dictionaries) 
   * @return moderationNote
  */
  @NotNull @Valid 
  @Schema(name = "moderation_note", description = "Замечания модератора. В некоторых случаях замечания могут сопровождаться [блокировкой резюме](#tag/Rezyume.-Prosmotr-informacii/Status-rezyume). Полный список возможных замечаний доступен в поле `resume_moderation_note` [в справочнике полей](#tag/Obshie-spravochniki/operation/get-dictionaries) ", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("moderation_note")
  public List<@Valid ResumeObjectsModerationNote> getModerationNote() {
    return moderationNote;
  }

  public void setModerationNote(List<@Valid ResumeObjectsModerationNote> moderationNote) {
    this.moderationNote = moderationNote;
  }

  public ResumeResumeForApplicant progress(ResumeObjectsProgress progress) {
    this.progress = progress;
    return this;
  }

  /**
   * Get progress
   * @return progress
  */
  @NotNull @Valid 
  @Schema(name = "progress", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("progress")
  public ResumeObjectsProgress getProgress() {
    return progress;
  }

  public void setProgress(ResumeObjectsProgress progress) {
    this.progress = progress;
  }

  public ResumeResumeForApplicant publishUrl(String publishUrl) {
    this.publishUrl = publishUrl;
    return this;
  }

  /**
   * URL для публикации или обновления резюме
   * @return publishUrl
  */
  @NotNull 
  @Schema(name = "publish_url", description = "URL для публикации или обновления резюме", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("publish_url")
  public String getPublishUrl() {
    return publishUrl;
  }

  public void setPublishUrl(String publishUrl) {
    this.publishUrl = publishUrl;
  }

  public ResumeResumeForApplicant access(ResumeObjectsAccess access) {
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

  public ResumeResumeForApplicant actions(ResumeObjectsActionsForOwner actions) {
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

  public ResumeResumeForApplicant newViews(BigDecimal newViews) {
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

  public ResumeResumeForApplicant nextPublishAt(String nextPublishAt) {
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

  public ResumeResumeForApplicant totalViews(BigDecimal totalViews) {
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

  public ResumeResumeForApplicant viewsUrl(String viewsUrl) {
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

  public ResumeResumeForApplicant photo(ResumeObjectsPhoto photo) {
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
  public ResumeObjectsPhoto getPhoto() {
    return photo;
  }

  public void setPhoto(ResumeObjectsPhoto photo) {
    this.photo = photo;
  }

  public ResumeResumeForApplicant portfolio(List<@Valid ResumeObjectsPortfolio> portfolio) {
    this.portfolio = portfolio;
    return this;
  }

  public ResumeResumeForApplicant addPortfolioItem(ResumeObjectsPortfolio portfolioItem) {
    if (this.portfolio == null) {
      this.portfolio = new ArrayList<>();
    }
    this.portfolio.add(portfolioItem);
    return this;
  }

  /**
   * Список изображений в портфолио пользователя
   * @return portfolio
  */
  @NotNull @Valid 
  @Schema(name = "portfolio", description = "Список изображений в портфолио пользователя", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("portfolio")
  public List<@Valid ResumeObjectsPortfolio> getPortfolio() {
    return portfolio;
  }

  public void setPortfolio(List<@Valid ResumeObjectsPortfolio> portfolio) {
    this.portfolio = portfolio;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ResumeResumeForApplicant resumeResumeForApplicant = (ResumeResumeForApplicant) o;
    return Objects.equals(this.alternateUrl, resumeResumeForApplicant.alternateUrl) &&
        Objects.equals(this.id, resumeResumeForApplicant.id) &&
        Objects.equals(this.title, resumeResumeForApplicant.title) &&
        Objects.equals(this.employmentForm, resumeResumeForApplicant.employmentForm) &&
        Objects.equals(this.workFormat, resumeResumeForApplicant.workFormat) &&
        Objects.equals(this.age, resumeResumeForApplicant.age) &&
        Objects.equals(this.area, resumeResumeForApplicant.area) &&
        Objects.equals(this.canViewFullInfo, resumeResumeForApplicant.canViewFullInfo) &&
        Objects.equals(this.certificate, resumeResumeForApplicant.certificate) &&
        Objects.equals(this.createdAt, resumeResumeForApplicant.createdAt) &&
        Objects.equals(this.download, resumeResumeForApplicant.download) &&
        Objects.equals(this.education, resumeResumeForApplicant.education) &&
        Objects.equals(this.firstName, resumeResumeForApplicant.firstName) &&
        Objects.equals(this.gender, resumeResumeForApplicant.gender) &&
        Objects.equals(this.hiddenFields, resumeResumeForApplicant.hiddenFields) &&
        Objects.equals(this.lastName, resumeResumeForApplicant.lastName) &&
        Objects.equals(this.marked, resumeResumeForApplicant.marked) &&
        Objects.equals(this.middleName, resumeResumeForApplicant.middleName) &&
        Objects.equals(this.platform, resumeResumeForApplicant.platform) &&
        Objects.equals(this.realId, resumeResumeForApplicant.realId) &&
        Objects.equals(this.salary, resumeResumeForApplicant.salary) &&
        Objects.equals(this.totalExperience, resumeResumeForApplicant.totalExperience) &&
        Objects.equals(this.updatedAt, resumeResumeForApplicant.updatedAt) &&
        Objects.equals(this.experience, resumeResumeForApplicant.experience) &&
        Objects.equals(this.birthDate, resumeResumeForApplicant.birthDate) &&
        Objects.equals(this.businessTripReadiness, resumeResumeForApplicant.businessTripReadiness) &&
        Objects.equals(this.citizenship, resumeResumeForApplicant.citizenship) &&
        Objects.equals(this.contact, resumeResumeForApplicant.contact) &&
        Objects.equals(this.creds, resumeResumeForApplicant.creds) &&
        Objects.equals(this.driverLicenseTypes, resumeResumeForApplicant.driverLicenseTypes) &&
        Objects.equals(this.employment, resumeResumeForApplicant.employment) &&
        Objects.equals(this.employments, resumeResumeForApplicant.employments) &&
        Objects.equals(this.hasVehicle, resumeResumeForApplicant.hasVehicle) &&
        Objects.equals(this.language, resumeResumeForApplicant.language) &&
        Objects.equals(this.metro, resumeResumeForApplicant.metro) &&
        Objects.equals(this.paidServices, resumeResumeForApplicant.paidServices) &&
        Objects.equals(this.professionalRoles, resumeResumeForApplicant.professionalRoles) &&
        Objects.equals(this.recommendation, resumeResumeForApplicant.recommendation) &&
        Objects.equals(this.relocation, resumeResumeForApplicant.relocation) &&
        Objects.equals(this.resumeLocale, resumeResumeForApplicant.resumeLocale) &&
        Objects.equals(this.schedule, resumeResumeForApplicant.schedule) &&
        Objects.equals(this.schedules, resumeResumeForApplicant.schedules) &&
        Objects.equals(this.site, resumeResumeForApplicant.site) &&
        Objects.equals(this.skillSet, resumeResumeForApplicant.skillSet) &&
        Objects.equals(this.skills, resumeResumeForApplicant.skills) &&
        Objects.equals(this.tags, resumeResumeForApplicant.tags) &&
        Objects.equals(this.travelTime, resumeResumeForApplicant.travelTime) &&
        Objects.equals(this.workTicket, resumeResumeForApplicant.workTicket) &&
        Objects.equals(this.blocked, resumeResumeForApplicant.blocked) &&
        Objects.equals(this.canPublishOrUpdate, resumeResumeForApplicant.canPublishOrUpdate) &&
        Objects.equals(this.finished, resumeResumeForApplicant.finished) &&
        Objects.equals(this.status, resumeResumeForApplicant.status) &&
        Objects.equals(this.moderationNote, resumeResumeForApplicant.moderationNote) &&
        Objects.equals(this.progress, resumeResumeForApplicant.progress) &&
        Objects.equals(this.publishUrl, resumeResumeForApplicant.publishUrl) &&
        Objects.equals(this.access, resumeResumeForApplicant.access) &&
        Objects.equals(this.actions, resumeResumeForApplicant.actions) &&
        Objects.equals(this.newViews, resumeResumeForApplicant.newViews) &&
        Objects.equals(this.nextPublishAt, resumeResumeForApplicant.nextPublishAt) &&
        Objects.equals(this.totalViews, resumeResumeForApplicant.totalViews) &&
        Objects.equals(this.viewsUrl, resumeResumeForApplicant.viewsUrl) &&
        Objects.equals(this.photo, resumeResumeForApplicant.photo) &&
        Objects.equals(this.portfolio, resumeResumeForApplicant.portfolio);
  }

  @Override
  public int hashCode() {
    return Objects.hash(alternateUrl, id, title, employmentForm, workFormat, age, area, canViewFullInfo, certificate, createdAt, download, education, firstName, gender, hiddenFields, lastName, marked, middleName, platform, realId, salary, totalExperience, updatedAt, experience, birthDate, businessTripReadiness, citizenship, contact, creds, driverLicenseTypes, employment, employments, hasVehicle, language, metro, paidServices, professionalRoles, recommendation, relocation, resumeLocale, schedule, schedules, site, skillSet, skills, tags, travelTime, workTicket, blocked, canPublishOrUpdate, finished, status, moderationNote, progress, publishUrl, access, actions, newViews, nextPublishAt, totalViews, viewsUrl, photo, portfolio);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ResumeResumeForApplicant {\n");
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
    sb.append("    birthDate: ").append(toIndentedString(birthDate)).append("\n");
    sb.append("    businessTripReadiness: ").append(toIndentedString(businessTripReadiness)).append("\n");
    sb.append("    citizenship: ").append(toIndentedString(citizenship)).append("\n");
    sb.append("    contact: ").append(toIndentedString(contact)).append("\n");
    sb.append("    creds: ").append(toIndentedString(creds)).append("\n");
    sb.append("    driverLicenseTypes: ").append(toIndentedString(driverLicenseTypes)).append("\n");
    sb.append("    employment: ").append(toIndentedString(employment)).append("\n");
    sb.append("    employments: ").append(toIndentedString(employments)).append("\n");
    sb.append("    hasVehicle: ").append(toIndentedString(hasVehicle)).append("\n");
    sb.append("    language: ").append(toIndentedString(language)).append("\n");
    sb.append("    metro: ").append(toIndentedString(metro)).append("\n");
    sb.append("    paidServices: ").append(toIndentedString(paidServices)).append("\n");
    sb.append("    professionalRoles: ").append(toIndentedString(professionalRoles)).append("\n");
    sb.append("    recommendation: ").append(toIndentedString(recommendation)).append("\n");
    sb.append("    relocation: ").append(toIndentedString(relocation)).append("\n");
    sb.append("    resumeLocale: ").append(toIndentedString(resumeLocale)).append("\n");
    sb.append("    schedule: ").append(toIndentedString(schedule)).append("\n");
    sb.append("    schedules: ").append(toIndentedString(schedules)).append("\n");
    sb.append("    site: ").append(toIndentedString(site)).append("\n");
    sb.append("    skillSet: ").append(toIndentedString(skillSet)).append("\n");
    sb.append("    skills: ").append(toIndentedString(skills)).append("\n");
    sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
    sb.append("    travelTime: ").append(toIndentedString(travelTime)).append("\n");
    sb.append("    workTicket: ").append(toIndentedString(workTicket)).append("\n");
    sb.append("    blocked: ").append(toIndentedString(blocked)).append("\n");
    sb.append("    canPublishOrUpdate: ").append(toIndentedString(canPublishOrUpdate)).append("\n");
    sb.append("    finished: ").append(toIndentedString(finished)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    moderationNote: ").append(toIndentedString(moderationNote)).append("\n");
    sb.append("    progress: ").append(toIndentedString(progress)).append("\n");
    sb.append("    publishUrl: ").append(toIndentedString(publishUrl)).append("\n");
    sb.append("    access: ").append(toIndentedString(access)).append("\n");
    sb.append("    actions: ").append(toIndentedString(actions)).append("\n");
    sb.append("    newViews: ").append(toIndentedString(newViews)).append("\n");
    sb.append("    nextPublishAt: ").append(toIndentedString(nextPublishAt)).append("\n");
    sb.append("    totalViews: ").append(toIndentedString(totalViews)).append("\n");
    sb.append("    viewsUrl: ").append(toIndentedString(viewsUrl)).append("\n");
    sb.append("    photo: ").append(toIndentedString(photo)).append("\n");
    sb.append("    portfolio: ").append(toIndentedString(portfolio)).append("\n");
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

