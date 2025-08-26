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
 * ResumeResumeFull
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2025-08-17T15:41:09.394389505+05:00[Asia/Yekaterinburg]", comments = "Generator version: 7.6.0")
public class ResumeResumeFull {

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

  public ResumeResumeFull() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public ResumeResumeFull(String alternateUrl, String id, String title, List<@Valid ResumeObjectsCertificate> certificate, String createdAt, Object download, Object education, List<@Valid IncludesIdName> hiddenFields, String realId, String updatedAt, List<ResumeObjectsExperience> experience, IncludesIdName businessTripReadiness, List<@Valid IncludesIdNameUrl> citizenship, List<IncludesContact> contact, List<@Valid ResumeObjectsDriverLicenseTypes> driverLicenseTypes, List<@Valid IncludesIdName> employments, List<IncludesLanguageLevel> language, List<@Valid ResumeObjectsPaidServices> paidServices, List<@Valid ResumeObjectsRecommendation> recommendation, Object relocation, Object resumeLocale, IncludesIdName schedule, List<@Valid IncludesIdName> schedules, List<@Valid ResumeObjectsSite> site, List<String> skillSet, IncludesIdName travelTime, List<@Valid IncludesIdNameUrl> workTicket) {
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
  }

  public ResumeResumeFull alternateUrl(String alternateUrl) {
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

  public ResumeResumeFull id(String id) {
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

  public ResumeResumeFull title(String title) {
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

  public ResumeResumeFull employmentForm(List<@Valid ResumeObjectsEmploymentFormEmploymentFormItemResponse> employmentForm) {
    this.employmentForm = employmentForm;
    return this;
  }

  public ResumeResumeFull addEmploymentFormItem(ResumeObjectsEmploymentFormEmploymentFormItemResponse employmentFormItem) {
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

  public ResumeResumeFull workFormat(List<@Valid ResumeObjectsWorkFormatWorkFormatItemResponse> workFormat) {
    this.workFormat = workFormat;
    return this;
  }

  public ResumeResumeFull addWorkFormatItem(ResumeObjectsWorkFormatWorkFormatItemResponse workFormatItem) {
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

  public ResumeResumeFull age(BigDecimal age) {
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

  public ResumeResumeFull area(IncludesIdNameUrl area) {
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

  public ResumeResumeFull canViewFullInfo(Boolean canViewFullInfo) {
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

  public ResumeResumeFull certificate(List<@Valid ResumeObjectsCertificate> certificate) {
    this.certificate = certificate;
    return this;
  }

  public ResumeResumeFull addCertificateItem(ResumeObjectsCertificate certificateItem) {
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

  public ResumeResumeFull createdAt(String createdAt) {
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

  public ResumeResumeFull download(Object download) {
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

  public ResumeResumeFull education(Object education) {
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

  public ResumeResumeFull firstName(String firstName) {
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

  public ResumeResumeFull gender(IncludesIdName gender) {
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

  public ResumeResumeFull hiddenFields(List<@Valid IncludesIdName> hiddenFields) {
    this.hiddenFields = hiddenFields;
    return this;
  }

  public ResumeResumeFull addHiddenFieldsItem(IncludesIdName hiddenFieldsItem) {
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

  public ResumeResumeFull lastName(String lastName) {
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

  public ResumeResumeFull marked(Boolean marked) {
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

  public ResumeResumeFull middleName(String middleName) {
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

  public ResumeResumeFull platform(Object platform) {
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

  public ResumeResumeFull realId(String realId) {
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

  public ResumeResumeFull salary(ResumeObjectsSalaryProperties salary) {
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

  public ResumeResumeFull totalExperience(ResumeObjectsTotalExperience totalExperience) {
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

  public ResumeResumeFull updatedAt(String updatedAt) {
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

  public ResumeResumeFull experience(List<ResumeObjectsExperience> experience) {
    this.experience = experience;
    return this;
  }

  public ResumeResumeFull addExperienceItem(ResumeObjectsExperience experienceItem) {
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

  public ResumeResumeFull birthDate(String birthDate) {
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

  public ResumeResumeFull businessTripReadiness(IncludesIdName businessTripReadiness) {
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

  public ResumeResumeFull citizenship(List<@Valid IncludesIdNameUrl> citizenship) {
    this.citizenship = citizenship;
    return this;
  }

  public ResumeResumeFull addCitizenshipItem(IncludesIdNameUrl citizenshipItem) {
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

  public ResumeResumeFull contact(List<IncludesContact> contact) {
    this.contact = contact;
    return this;
  }

  public ResumeResumeFull addContactItem(IncludesContact contactItem) {
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

  public ResumeResumeFull creds(CredsCreds creds) {
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

  public ResumeResumeFull driverLicenseTypes(List<@Valid ResumeObjectsDriverLicenseTypes> driverLicenseTypes) {
    this.driverLicenseTypes = driverLicenseTypes;
    return this;
  }

  public ResumeResumeFull addDriverLicenseTypesItem(ResumeObjectsDriverLicenseTypes driverLicenseTypesItem) {
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

  public ResumeResumeFull employment(IncludesIdName employment) {
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

  public ResumeResumeFull employments(List<@Valid IncludesIdName> employments) {
    this.employments = employments;
    return this;
  }

  public ResumeResumeFull addEmploymentsItem(IncludesIdName employmentsItem) {
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

  public ResumeResumeFull hasVehicle(Boolean hasVehicle) {
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

  public ResumeResumeFull language(List<IncludesLanguageLevel> language) {
    this.language = language;
    return this;
  }

  public ResumeResumeFull addLanguageItem(IncludesLanguageLevel languageItem) {
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

  public ResumeResumeFull metro(ResumeObjectsMetroStation metro) {
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

  public ResumeResumeFull paidServices(List<@Valid ResumeObjectsPaidServices> paidServices) {
    this.paidServices = paidServices;
    return this;
  }

  public ResumeResumeFull addPaidServicesItem(ResumeObjectsPaidServices paidServicesItem) {
    if (this.paidServices == null) {
      this.paidServices = new ArrayList<>();
    }
    this.paidServices.add(paidServicesItem);
    return this;
  }

  /**
   * Платные услуги по резюме
   * @return paidServices
  */
  @NotNull @Valid 
  @Schema(name = "paid_services", description = "Платные услуги по резюме", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("paid_services")
  public List<@Valid ResumeObjectsPaidServices> getPaidServices() {
    return paidServices;
  }

  public void setPaidServices(List<@Valid ResumeObjectsPaidServices> paidServices) {
    this.paidServices = paidServices;
  }

  public ResumeResumeFull professionalRoles(List<@Valid IncludesIdName> professionalRoles) {
    this.professionalRoles = professionalRoles;
    return this;
  }

  public ResumeResumeFull addProfessionalRolesItem(IncludesIdName professionalRolesItem) {
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

  public ResumeResumeFull recommendation(List<@Valid ResumeObjectsRecommendation> recommendation) {
    this.recommendation = recommendation;
    return this;
  }

  public ResumeResumeFull addRecommendationItem(ResumeObjectsRecommendation recommendationItem) {
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

  public ResumeResumeFull relocation(Object relocation) {
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

  public ResumeResumeFull resumeLocale(Object resumeLocale) {
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

  public ResumeResumeFull schedule(IncludesIdName schedule) {
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

  public ResumeResumeFull schedules(List<@Valid IncludesIdName> schedules) {
    this.schedules = schedules;
    return this;
  }

  public ResumeResumeFull addSchedulesItem(IncludesIdName schedulesItem) {
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

  public ResumeResumeFull site(List<@Valid ResumeObjectsSite> site) {
    this.site = site;
    return this;
  }

  public ResumeResumeFull addSiteItem(ResumeObjectsSite siteItem) {
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

  public ResumeResumeFull skillSet(List<String> skillSet) {
    this.skillSet = skillSet;
    return this;
  }

  public ResumeResumeFull addSkillSetItem(String skillSetItem) {
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

  public ResumeResumeFull skills(String skills) {
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

  public ResumeResumeFull tags(List<@Valid IncludesId> tags) {
    this.tags = tags;
    return this;
  }

  public ResumeResumeFull addTagsItem(IncludesId tagsItem) {
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

  public ResumeResumeFull travelTime(IncludesIdName travelTime) {
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

  public ResumeResumeFull workTicket(List<@Valid IncludesIdNameUrl> workTicket) {
    this.workTicket = workTicket;
    return this;
  }

  public ResumeResumeFull addWorkTicketItem(IncludesIdNameUrl workTicketItem) {
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

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ResumeResumeFull resumeResumeFull = (ResumeResumeFull) o;
    return Objects.equals(this.alternateUrl, resumeResumeFull.alternateUrl) &&
        Objects.equals(this.id, resumeResumeFull.id) &&
        Objects.equals(this.title, resumeResumeFull.title) &&
        Objects.equals(this.employmentForm, resumeResumeFull.employmentForm) &&
        Objects.equals(this.workFormat, resumeResumeFull.workFormat) &&
        Objects.equals(this.age, resumeResumeFull.age) &&
        Objects.equals(this.area, resumeResumeFull.area) &&
        Objects.equals(this.canViewFullInfo, resumeResumeFull.canViewFullInfo) &&
        Objects.equals(this.certificate, resumeResumeFull.certificate) &&
        Objects.equals(this.createdAt, resumeResumeFull.createdAt) &&
        Objects.equals(this.download, resumeResumeFull.download) &&
        Objects.equals(this.education, resumeResumeFull.education) &&
        Objects.equals(this.firstName, resumeResumeFull.firstName) &&
        Objects.equals(this.gender, resumeResumeFull.gender) &&
        Objects.equals(this.hiddenFields, resumeResumeFull.hiddenFields) &&
        Objects.equals(this.lastName, resumeResumeFull.lastName) &&
        Objects.equals(this.marked, resumeResumeFull.marked) &&
        Objects.equals(this.middleName, resumeResumeFull.middleName) &&
        Objects.equals(this.platform, resumeResumeFull.platform) &&
        Objects.equals(this.realId, resumeResumeFull.realId) &&
        Objects.equals(this.salary, resumeResumeFull.salary) &&
        Objects.equals(this.totalExperience, resumeResumeFull.totalExperience) &&
        Objects.equals(this.updatedAt, resumeResumeFull.updatedAt) &&
        Objects.equals(this.experience, resumeResumeFull.experience) &&
        Objects.equals(this.birthDate, resumeResumeFull.birthDate) &&
        Objects.equals(this.businessTripReadiness, resumeResumeFull.businessTripReadiness) &&
        Objects.equals(this.citizenship, resumeResumeFull.citizenship) &&
        Objects.equals(this.contact, resumeResumeFull.contact) &&
        Objects.equals(this.creds, resumeResumeFull.creds) &&
        Objects.equals(this.driverLicenseTypes, resumeResumeFull.driverLicenseTypes) &&
        Objects.equals(this.employment, resumeResumeFull.employment) &&
        Objects.equals(this.employments, resumeResumeFull.employments) &&
        Objects.equals(this.hasVehicle, resumeResumeFull.hasVehicle) &&
        Objects.equals(this.language, resumeResumeFull.language) &&
        Objects.equals(this.metro, resumeResumeFull.metro) &&
        Objects.equals(this.paidServices, resumeResumeFull.paidServices) &&
        Objects.equals(this.professionalRoles, resumeResumeFull.professionalRoles) &&
        Objects.equals(this.recommendation, resumeResumeFull.recommendation) &&
        Objects.equals(this.relocation, resumeResumeFull.relocation) &&
        Objects.equals(this.resumeLocale, resumeResumeFull.resumeLocale) &&
        Objects.equals(this.schedule, resumeResumeFull.schedule) &&
        Objects.equals(this.schedules, resumeResumeFull.schedules) &&
        Objects.equals(this.site, resumeResumeFull.site) &&
        Objects.equals(this.skillSet, resumeResumeFull.skillSet) &&
        Objects.equals(this.skills, resumeResumeFull.skills) &&
        Objects.equals(this.tags, resumeResumeFull.tags) &&
        Objects.equals(this.travelTime, resumeResumeFull.travelTime) &&
        Objects.equals(this.workTicket, resumeResumeFull.workTicket);
  }

  @Override
  public int hashCode() {
    return Objects.hash(alternateUrl, id, title, employmentForm, workFormat, age, area, canViewFullInfo, certificate, createdAt, download, education, firstName, gender, hiddenFields, lastName, marked, middleName, platform, realId, salary, totalExperience, updatedAt, experience, birthDate, businessTripReadiness, citizenship, contact, creds, driverLicenseTypes, employment, employments, hasVehicle, language, metro, paidServices, professionalRoles, recommendation, relocation, resumeLocale, schedule, schedules, site, skillSet, skills, tags, travelTime, workTicket);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ResumeResumeFull {\n");
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

