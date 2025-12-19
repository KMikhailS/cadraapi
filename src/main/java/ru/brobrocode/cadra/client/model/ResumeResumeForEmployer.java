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
 * ResumeResumeForEmployer
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2025-08-17T15:41:09.394389505+05:00[Asia/Yekaterinburg]", comments = "Generator version: 7.6.0")
public class ResumeResumeForEmployer {

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
  private List<@Valid ResumeObjectsEmployerPaidServicesInner> paidServices = new ArrayList<>();

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

  private ResumeObjectsActions actions;

  private String contactsOpenUntilDate = null;

  private Boolean favorited;

  private IncludesIdNameLastChangeTime jobSearchStatus;

  private ResumeObjectsNegotiationsHistoryForEmployer negotiationsHistory;

  private ResumeObjectsOwner owner;

  private ResumeObjectsPhotoNoId photo = null;

  @Valid
  private List<@Valid ResumeObjectsPortfolioNoId> portfolio = new ArrayList<>();

  private String viewWithoutContactsReason = null;

  public ResumeResumeForEmployer() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public ResumeResumeForEmployer(String alternateUrl, String id, String title, List<@Valid ResumeObjectsCertificate> certificate, String createdAt, Object download, Object education, List<@Valid IncludesIdName> hiddenFields, String realId, String updatedAt, List<ResumeObjectsExperience> experience, IncludesIdName businessTripReadiness, List<@Valid IncludesIdNameUrl> citizenship, List<IncludesContact> contact, List<@Valid ResumeObjectsDriverLicenseTypes> driverLicenseTypes, List<@Valid IncludesIdName> employments, List<IncludesLanguageLevel> language, List<@Valid ResumeObjectsEmployerPaidServicesInner> paidServices, List<@Valid ResumeObjectsRecommendation> recommendation, Object relocation, Object resumeLocale, IncludesIdName schedule, List<@Valid IncludesIdName> schedules, List<@Valid ResumeObjectsSite> site, List<String> skillSet, IncludesIdName travelTime, List<@Valid IncludesIdNameUrl> workTicket, ResumeObjectsActions actions, Boolean favorited, ResumeObjectsOwner owner, List<@Valid ResumeObjectsPortfolioNoId> portfolio) {
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
    this.actions = actions;
    this.favorited = favorited;
    this.owner = owner;
    this.portfolio = portfolio;
  }

  public ResumeResumeForEmployer alternateUrl(String alternateUrl) {
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

  public ResumeResumeForEmployer id(String id) {
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

  public ResumeResumeForEmployer title(String title) {
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

  public ResumeResumeForEmployer employmentForm(List<@Valid ResumeObjectsEmploymentFormEmploymentFormItemResponse> employmentForm) {
    this.employmentForm = employmentForm;
    return this;
  }

  public ResumeResumeForEmployer addEmploymentFormItem(ResumeObjectsEmploymentFormEmploymentFormItemResponse employmentFormItem) {
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

  public ResumeResumeForEmployer workFormat(List<@Valid ResumeObjectsWorkFormatWorkFormatItemResponse> workFormat) {
    this.workFormat = workFormat;
    return this;
  }

  public ResumeResumeForEmployer addWorkFormatItem(ResumeObjectsWorkFormatWorkFormatItemResponse workFormatItem) {
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

  public ResumeResumeForEmployer age(BigDecimal age) {
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

  public ResumeResumeForEmployer area(IncludesIdNameUrl area) {
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

  public ResumeResumeForEmployer canViewFullInfo(Boolean canViewFullInfo) {
    this.canViewFullInfo = canViewFullInfo;
    return this;
  }

  /**
   * Наличие права просмотра контактной информации в резюме
   * @return canViewFullInfo
  */
  
  @Schema(name = "can_view_full_info", description = "Наличие права просмотра контактной информации в резюме", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("can_view_full_info")
  public Boolean getCanViewFullInfo() {
    return canViewFullInfo;
  }

  public void setCanViewFullInfo(Boolean canViewFullInfo) {
    this.canViewFullInfo = canViewFullInfo;
  }

  public ResumeResumeForEmployer certificate(List<@Valid ResumeObjectsCertificate> certificate) {
    this.certificate = certificate;
    return this;
  }

  public ResumeResumeForEmployer addCertificateItem(ResumeObjectsCertificate certificateItem) {
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

  public ResumeResumeForEmployer createdAt(String createdAt) {
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

  public ResumeResumeForEmployer download(Object download) {
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

  public ResumeResumeForEmployer education(Object education) {
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

  public ResumeResumeForEmployer firstName(String firstName) {
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

  public ResumeResumeForEmployer gender(IncludesIdName gender) {
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

  public ResumeResumeForEmployer hiddenFields(List<@Valid IncludesIdName> hiddenFields) {
    this.hiddenFields = hiddenFields;
    return this;
  }

  public ResumeResumeForEmployer addHiddenFieldsItem(IncludesIdName hiddenFieldsItem) {
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

  public ResumeResumeForEmployer lastName(String lastName) {
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

  public ResumeResumeForEmployer marked(Boolean marked) {
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

  public ResumeResumeForEmployer middleName(String middleName) {
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

  public ResumeResumeForEmployer platform(Object platform) {
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

  public ResumeResumeForEmployer realId(String realId) {
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

  public ResumeResumeForEmployer salary(ResumeObjectsSalaryProperties salary) {
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

  public ResumeResumeForEmployer totalExperience(ResumeObjectsTotalExperience totalExperience) {
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

  public ResumeResumeForEmployer updatedAt(String updatedAt) {
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

  public ResumeResumeForEmployer experience(List<ResumeObjectsExperience> experience) {
    this.experience = experience;
    return this;
  }

  public ResumeResumeForEmployer addExperienceItem(ResumeObjectsExperience experienceItem) {
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

  public ResumeResumeForEmployer birthDate(String birthDate) {
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

  public ResumeResumeForEmployer businessTripReadiness(IncludesIdName businessTripReadiness) {
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

  public ResumeResumeForEmployer citizenship(List<@Valid IncludesIdNameUrl> citizenship) {
    this.citizenship = citizenship;
    return this;
  }

  public ResumeResumeForEmployer addCitizenshipItem(IncludesIdNameUrl citizenshipItem) {
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

  public ResumeResumeForEmployer contact(List<IncludesContact> contact) {
    this.contact = contact;
    return this;
  }

  public ResumeResumeForEmployer addContactItem(IncludesContact contactItem) {
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

  public ResumeResumeForEmployer creds(CredsCreds creds) {
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

  public ResumeResumeForEmployer driverLicenseTypes(List<@Valid ResumeObjectsDriverLicenseTypes> driverLicenseTypes) {
    this.driverLicenseTypes = driverLicenseTypes;
    return this;
  }

  public ResumeResumeForEmployer addDriverLicenseTypesItem(ResumeObjectsDriverLicenseTypes driverLicenseTypesItem) {
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

  public ResumeResumeForEmployer employment(IncludesIdName employment) {
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

  public ResumeResumeForEmployer employments(List<@Valid IncludesIdName> employments) {
    this.employments = employments;
    return this;
  }

  public ResumeResumeForEmployer addEmploymentsItem(IncludesIdName employmentsItem) {
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

  public ResumeResumeForEmployer hasVehicle(Boolean hasVehicle) {
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

  public ResumeResumeForEmployer language(List<IncludesLanguageLevel> language) {
    this.language = language;
    return this;
  }

  public ResumeResumeForEmployer addLanguageItem(IncludesLanguageLevel languageItem) {
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

  public ResumeResumeForEmployer metro(ResumeObjectsMetroStation metro) {
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

  public ResumeResumeForEmployer paidServices(List<@Valid ResumeObjectsEmployerPaidServicesInner> paidServices) {
    this.paidServices = paidServices;
    return this;
  }

  public ResumeResumeForEmployer addPaidServicesItem(ResumeObjectsEmployerPaidServicesInner paidServicesItem) {
    if (this.paidServices == null) {
      this.paidServices = new ArrayList<>();
    }
    this.paidServices.add(paidServicesItem);
    return this;
  }

  /**
   * Платные услуги по резюме для работодателя  Работодателю может быть предложен список платных услуг по резюме.  Например, если полные данные по резюме недоступны, то будет выдано предложение покупки рекомендованной услуги, чтобы такой доступ получить 
   * @return paidServices
  */
  @NotNull @Valid 
  @Schema(name = "paid_services", description = "Платные услуги по резюме для работодателя  Работодателю может быть предложен список платных услуг по резюме.  Например, если полные данные по резюме недоступны, то будет выдано предложение покупки рекомендованной услуги, чтобы такой доступ получить ", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("paid_services")
  public List<@Valid ResumeObjectsEmployerPaidServicesInner> getPaidServices() {
    return paidServices;
  }

  public void setPaidServices(List<@Valid ResumeObjectsEmployerPaidServicesInner> paidServices) {
    this.paidServices = paidServices;
  }

  public ResumeResumeForEmployer professionalRoles(List<@Valid IncludesIdName> professionalRoles) {
    this.professionalRoles = professionalRoles;
    return this;
  }

  public ResumeResumeForEmployer addProfessionalRolesItem(IncludesIdName professionalRolesItem) {
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

  public ResumeResumeForEmployer recommendation(List<@Valid ResumeObjectsRecommendation> recommendation) {
    this.recommendation = recommendation;
    return this;
  }

  public ResumeResumeForEmployer addRecommendationItem(ResumeObjectsRecommendation recommendationItem) {
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

  public ResumeResumeForEmployer relocation(Object relocation) {
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

  public ResumeResumeForEmployer resumeLocale(Object resumeLocale) {
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

  public ResumeResumeForEmployer schedule(IncludesIdName schedule) {
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

  public ResumeResumeForEmployer schedules(List<@Valid IncludesIdName> schedules) {
    this.schedules = schedules;
    return this;
  }

  public ResumeResumeForEmployer addSchedulesItem(IncludesIdName schedulesItem) {
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

  public ResumeResumeForEmployer site(List<@Valid ResumeObjectsSite> site) {
    this.site = site;
    return this;
  }

  public ResumeResumeForEmployer addSiteItem(ResumeObjectsSite siteItem) {
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

  public ResumeResumeForEmployer skillSet(List<String> skillSet) {
    this.skillSet = skillSet;
    return this;
  }

  public ResumeResumeForEmployer addSkillSetItem(String skillSetItem) {
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

  public ResumeResumeForEmployer skills(String skills) {
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

  public ResumeResumeForEmployer tags(List<@Valid IncludesId> tags) {
    this.tags = tags;
    return this;
  }

  public ResumeResumeForEmployer addTagsItem(IncludesId tagsItem) {
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

  public ResumeResumeForEmployer travelTime(IncludesIdName travelTime) {
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

  public ResumeResumeForEmployer workTicket(List<@Valid IncludesIdNameUrl> workTicket) {
    this.workTicket = workTicket;
    return this;
  }

  public ResumeResumeForEmployer addWorkTicketItem(IncludesIdNameUrl workTicketItem) {
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

  public ResumeResumeForEmployer actions(ResumeObjectsActions actions) {
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
  public ResumeObjectsActions getActions() {
    return actions;
  }

  public void setActions(ResumeObjectsActions actions) {
    this.actions = actions;
  }

  public ResumeResumeForEmployer contactsOpenUntilDate(String contactsOpenUntilDate) {
    this.contactsOpenUntilDate = contactsOpenUntilDate;
    return this;
  }

  /**
   * Дата скрытия контактов резюме в формате `YYYY-MM-DD`
   * @return contactsOpenUntilDate
  */
  
  @Schema(name = "contacts_open_until_date", description = "Дата скрытия контактов резюме в формате `YYYY-MM-DD`", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("contacts_open_until_date")
  public String getContactsOpenUntilDate() {
    return contactsOpenUntilDate;
  }

  public void setContactsOpenUntilDate(String contactsOpenUntilDate) {
    this.contactsOpenUntilDate = contactsOpenUntilDate;
  }

  public ResumeResumeForEmployer favorited(Boolean favorited) {
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

  public ResumeResumeForEmployer jobSearchStatus(IncludesIdNameLastChangeTime jobSearchStatus) {
    this.jobSearchStatus = jobSearchStatus;
    return this;
  }

  /**
   * Для получения данных нужно передать параметр `with_job_search_status=true`.  Возможные значения перечислены в поле `job_search_statuses_employer` в [справочнике полей](#tag/Obshie-spravochniki/operation/get-dictionaries) 
   * @return jobSearchStatus
  */
  @Valid 
  @Schema(name = "job_search_status", description = "Для получения данных нужно передать параметр `with_job_search_status=true`.  Возможные значения перечислены в поле `job_search_statuses_employer` в [справочнике полей](#tag/Obshie-spravochniki/operation/get-dictionaries) ", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("job_search_status")
  public IncludesIdNameLastChangeTime getJobSearchStatus() {
    return jobSearchStatus;
  }

  public void setJobSearchStatus(IncludesIdNameLastChangeTime jobSearchStatus) {
    this.jobSearchStatus = jobSearchStatus;
  }

  public ResumeResumeForEmployer negotiationsHistory(ResumeObjectsNegotiationsHistoryForEmployer negotiationsHistory) {
    this.negotiationsHistory = negotiationsHistory;
    return this;
  }

  /**
   * Краткая история откликов/приглашений по резюме
   * @return negotiationsHistory
  */
  @Valid 
  @Schema(name = "negotiations_history", description = "Краткая история откликов/приглашений по резюме", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("negotiations_history")
  public ResumeObjectsNegotiationsHistoryForEmployer getNegotiationsHistory() {
    return negotiationsHistory;
  }

  public void setNegotiationsHistory(ResumeObjectsNegotiationsHistoryForEmployer negotiationsHistory) {
    this.negotiationsHistory = negotiationsHistory;
  }

  public ResumeResumeForEmployer owner(ResumeObjectsOwner owner) {
    this.owner = owner;
    return this;
  }

  /**
   * Информация о владельце резюме
   * @return owner
  */
  @NotNull @Valid 
  @Schema(name = "owner", description = "Информация о владельце резюме", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("owner")
  public ResumeObjectsOwner getOwner() {
    return owner;
  }

  public void setOwner(ResumeObjectsOwner owner) {
    this.owner = owner;
  }

  public ResumeResumeForEmployer photo(ResumeObjectsPhotoNoId photo) {
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

  public ResumeResumeForEmployer portfolio(List<@Valid ResumeObjectsPortfolioNoId> portfolio) {
    this.portfolio = portfolio;
    return this;
  }

  public ResumeResumeForEmployer addPortfolioItem(ResumeObjectsPortfolioNoId portfolioItem) {
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
  public List<@Valid ResumeObjectsPortfolioNoId> getPortfolio() {
    return portfolio;
  }

  public void setPortfolio(List<@Valid ResumeObjectsPortfolioNoId> portfolio) {
    this.portfolio = portfolio;
  }

  public ResumeResumeForEmployer viewWithoutContactsReason(String viewWithoutContactsReason) {
    this.viewWithoutContactsReason = viewWithoutContactsReason;
    return this;
  }

  /**
   * Причина скрытия контактов
   * @return viewWithoutContactsReason
  */
  
  @Schema(name = "view_without_contacts_reason", description = "Причина скрытия контактов", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("view_without_contacts_reason")
  public String getViewWithoutContactsReason() {
    return viewWithoutContactsReason;
  }

  public void setViewWithoutContactsReason(String viewWithoutContactsReason) {
    this.viewWithoutContactsReason = viewWithoutContactsReason;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ResumeResumeForEmployer resumeResumeForEmployer = (ResumeResumeForEmployer) o;
    return Objects.equals(this.alternateUrl, resumeResumeForEmployer.alternateUrl) &&
        Objects.equals(this.id, resumeResumeForEmployer.id) &&
        Objects.equals(this.title, resumeResumeForEmployer.title) &&
        Objects.equals(this.employmentForm, resumeResumeForEmployer.employmentForm) &&
        Objects.equals(this.workFormat, resumeResumeForEmployer.workFormat) &&
        Objects.equals(this.age, resumeResumeForEmployer.age) &&
        Objects.equals(this.area, resumeResumeForEmployer.area) &&
        Objects.equals(this.canViewFullInfo, resumeResumeForEmployer.canViewFullInfo) &&
        Objects.equals(this.certificate, resumeResumeForEmployer.certificate) &&
        Objects.equals(this.createdAt, resumeResumeForEmployer.createdAt) &&
        Objects.equals(this.download, resumeResumeForEmployer.download) &&
        Objects.equals(this.education, resumeResumeForEmployer.education) &&
        Objects.equals(this.firstName, resumeResumeForEmployer.firstName) &&
        Objects.equals(this.gender, resumeResumeForEmployer.gender) &&
        Objects.equals(this.hiddenFields, resumeResumeForEmployer.hiddenFields) &&
        Objects.equals(this.lastName, resumeResumeForEmployer.lastName) &&
        Objects.equals(this.marked, resumeResumeForEmployer.marked) &&
        Objects.equals(this.middleName, resumeResumeForEmployer.middleName) &&
        Objects.equals(this.platform, resumeResumeForEmployer.platform) &&
        Objects.equals(this.realId, resumeResumeForEmployer.realId) &&
        Objects.equals(this.salary, resumeResumeForEmployer.salary) &&
        Objects.equals(this.totalExperience, resumeResumeForEmployer.totalExperience) &&
        Objects.equals(this.updatedAt, resumeResumeForEmployer.updatedAt) &&
        Objects.equals(this.experience, resumeResumeForEmployer.experience) &&
        Objects.equals(this.birthDate, resumeResumeForEmployer.birthDate) &&
        Objects.equals(this.businessTripReadiness, resumeResumeForEmployer.businessTripReadiness) &&
        Objects.equals(this.citizenship, resumeResumeForEmployer.citizenship) &&
        Objects.equals(this.contact, resumeResumeForEmployer.contact) &&
        Objects.equals(this.creds, resumeResumeForEmployer.creds) &&
        Objects.equals(this.driverLicenseTypes, resumeResumeForEmployer.driverLicenseTypes) &&
        Objects.equals(this.employment, resumeResumeForEmployer.employment) &&
        Objects.equals(this.employments, resumeResumeForEmployer.employments) &&
        Objects.equals(this.hasVehicle, resumeResumeForEmployer.hasVehicle) &&
        Objects.equals(this.language, resumeResumeForEmployer.language) &&
        Objects.equals(this.metro, resumeResumeForEmployer.metro) &&
        Objects.equals(this.paidServices, resumeResumeForEmployer.paidServices) &&
        Objects.equals(this.professionalRoles, resumeResumeForEmployer.professionalRoles) &&
        Objects.equals(this.recommendation, resumeResumeForEmployer.recommendation) &&
        Objects.equals(this.relocation, resumeResumeForEmployer.relocation) &&
        Objects.equals(this.resumeLocale, resumeResumeForEmployer.resumeLocale) &&
        Objects.equals(this.schedule, resumeResumeForEmployer.schedule) &&
        Objects.equals(this.schedules, resumeResumeForEmployer.schedules) &&
        Objects.equals(this.site, resumeResumeForEmployer.site) &&
        Objects.equals(this.skillSet, resumeResumeForEmployer.skillSet) &&
        Objects.equals(this.skills, resumeResumeForEmployer.skills) &&
        Objects.equals(this.tags, resumeResumeForEmployer.tags) &&
        Objects.equals(this.travelTime, resumeResumeForEmployer.travelTime) &&
        Objects.equals(this.workTicket, resumeResumeForEmployer.workTicket) &&
        Objects.equals(this.actions, resumeResumeForEmployer.actions) &&
        Objects.equals(this.contactsOpenUntilDate, resumeResumeForEmployer.contactsOpenUntilDate) &&
        Objects.equals(this.favorited, resumeResumeForEmployer.favorited) &&
        Objects.equals(this.jobSearchStatus, resumeResumeForEmployer.jobSearchStatus) &&
        Objects.equals(this.negotiationsHistory, resumeResumeForEmployer.negotiationsHistory) &&
        Objects.equals(this.owner, resumeResumeForEmployer.owner) &&
        Objects.equals(this.photo, resumeResumeForEmployer.photo) &&
        Objects.equals(this.portfolio, resumeResumeForEmployer.portfolio) &&
        Objects.equals(this.viewWithoutContactsReason, resumeResumeForEmployer.viewWithoutContactsReason);
  }

  @Override
  public int hashCode() {
    return Objects.hash(alternateUrl, id, title, employmentForm, workFormat, age, area, canViewFullInfo, certificate, createdAt, download, education, firstName, gender, hiddenFields, lastName, marked, middleName, platform, realId, salary, totalExperience, updatedAt, experience, birthDate, businessTripReadiness, citizenship, contact, creds, driverLicenseTypes, employment, employments, hasVehicle, language, metro, paidServices, professionalRoles, recommendation, relocation, resumeLocale, schedule, schedules, site, skillSet, skills, tags, travelTime, workTicket, actions, contactsOpenUntilDate, favorited, jobSearchStatus, negotiationsHistory, owner, photo, portfolio, viewWithoutContactsReason);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ResumeResumeForEmployer {\n");
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
    sb.append("    actions: ").append(toIndentedString(actions)).append("\n");
    sb.append("    contactsOpenUntilDate: ").append(toIndentedString(contactsOpenUntilDate)).append("\n");
    sb.append("    favorited: ").append(toIndentedString(favorited)).append("\n");
    sb.append("    jobSearchStatus: ").append(toIndentedString(jobSearchStatus)).append("\n");
    sb.append("    negotiationsHistory: ").append(toIndentedString(negotiationsHistory)).append("\n");
    sb.append("    owner: ").append(toIndentedString(owner)).append("\n");
    sb.append("    photo: ").append(toIndentedString(photo)).append("\n");
    sb.append("    portfolio: ").append(toIndentedString(portfolio)).append("\n");
    sb.append("    viewWithoutContactsReason: ").append(toIndentedString(viewWithoutContactsReason)).append("\n");
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

