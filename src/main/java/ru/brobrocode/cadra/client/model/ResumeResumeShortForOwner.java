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
 * ResumeResumeShortForOwner
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2025-08-17T15:41:09.394389505+05:00[Asia/Yekaterinburg]", comments = "Generator version: 7.6.0")
public class ResumeResumeShortForOwner {

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

  public ResumeResumeShortForOwner() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public ResumeResumeShortForOwner(ResumeObjectsActionsForOwner actions, String alternateUrl, List<@Valid ResumeObjectsCertificate> certificate, String createdAt, ResumeObjectsDownload download, ResumeObjectsEducation education, List<@Valid ResumeObjectsExperienceForOwner> experience, List<@Valid IncludesIdName> hiddenFields, String id, Boolean marked, String realId, String updatedAt, String url) {
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
  }

  public ResumeResumeShortForOwner actions(ResumeObjectsActionsForOwner actions) {
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

  public ResumeResumeShortForOwner age(BigDecimal age) {
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

  public ResumeResumeShortForOwner alternateUrl(String alternateUrl) {
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

  public ResumeResumeShortForOwner area(IncludesIdNameUrl area) {
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

  public ResumeResumeShortForOwner autoHideTime(IncludesIdName autoHideTime) {
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

  public ResumeResumeShortForOwner canViewFullInfo(Boolean canViewFullInfo) {
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

  public ResumeResumeShortForOwner certificate(List<@Valid ResumeObjectsCertificate> certificate) {
    this.certificate = certificate;
    return this;
  }

  public ResumeResumeShortForOwner addCertificateItem(ResumeObjectsCertificate certificateItem) {
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

  public ResumeResumeShortForOwner createdAt(String createdAt) {
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

  public ResumeResumeShortForOwner download(ResumeObjectsDownload download) {
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

  public ResumeResumeShortForOwner education(ResumeObjectsEducation education) {
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

  public ResumeResumeShortForOwner experience(List<@Valid ResumeObjectsExperienceForOwner> experience) {
    this.experience = experience;
    return this;
  }

  public ResumeResumeShortForOwner addExperienceItem(ResumeObjectsExperienceForOwner experienceItem) {
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

  public ResumeResumeShortForOwner firstName(String firstName) {
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

  public ResumeResumeShortForOwner gender(IncludesIdName gender) {
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

  public ResumeResumeShortForOwner hiddenFields(List<@Valid IncludesIdName> hiddenFields) {
    this.hiddenFields = hiddenFields;
    return this;
  }

  public ResumeResumeShortForOwner addHiddenFieldsItem(IncludesIdName hiddenFieldsItem) {
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

  public ResumeResumeShortForOwner id(String id) {
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

  public ResumeResumeShortForOwner lastName(String lastName) {
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

  public ResumeResumeShortForOwner marked(Boolean marked) {
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

  public ResumeResumeShortForOwner middleName(String middleName) {
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

  public ResumeResumeShortForOwner photo(ProfilePhoto photo) {
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

  public ResumeResumeShortForOwner platform(IncludesId platform) {
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

  public ResumeResumeShortForOwner realId(String realId) {
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

  public ResumeResumeShortForOwner salary(ResumeObjectsSalaryProperties salary) {
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

  public ResumeResumeShortForOwner title(String title) {
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

  public ResumeResumeShortForOwner totalExperience(ResumeObjectsTotalExperience totalExperience) {
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

  public ResumeResumeShortForOwner updatedAt(String updatedAt) {
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

  public ResumeResumeShortForOwner url(String url) {
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

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ResumeResumeShortForOwner resumeResumeShortForOwner = (ResumeResumeShortForOwner) o;
    return Objects.equals(this.actions, resumeResumeShortForOwner.actions) &&
        Objects.equals(this.age, resumeResumeShortForOwner.age) &&
        Objects.equals(this.alternateUrl, resumeResumeShortForOwner.alternateUrl) &&
        Objects.equals(this.area, resumeResumeShortForOwner.area) &&
        Objects.equals(this.autoHideTime, resumeResumeShortForOwner.autoHideTime) &&
        Objects.equals(this.canViewFullInfo, resumeResumeShortForOwner.canViewFullInfo) &&
        Objects.equals(this.certificate, resumeResumeShortForOwner.certificate) &&
        Objects.equals(this.createdAt, resumeResumeShortForOwner.createdAt) &&
        Objects.equals(this.download, resumeResumeShortForOwner.download) &&
        Objects.equals(this.education, resumeResumeShortForOwner.education) &&
        Objects.equals(this.experience, resumeResumeShortForOwner.experience) &&
        Objects.equals(this.firstName, resumeResumeShortForOwner.firstName) &&
        Objects.equals(this.gender, resumeResumeShortForOwner.gender) &&
        Objects.equals(this.hiddenFields, resumeResumeShortForOwner.hiddenFields) &&
        Objects.equals(this.id, resumeResumeShortForOwner.id) &&
        Objects.equals(this.lastName, resumeResumeShortForOwner.lastName) &&
        Objects.equals(this.marked, resumeResumeShortForOwner.marked) &&
        Objects.equals(this.middleName, resumeResumeShortForOwner.middleName) &&
        Objects.equals(this.photo, resumeResumeShortForOwner.photo) &&
        Objects.equals(this.platform, resumeResumeShortForOwner.platform) &&
        Objects.equals(this.realId, resumeResumeShortForOwner.realId) &&
        Objects.equals(this.salary, resumeResumeShortForOwner.salary) &&
        Objects.equals(this.title, resumeResumeShortForOwner.title) &&
        Objects.equals(this.totalExperience, resumeResumeShortForOwner.totalExperience) &&
        Objects.equals(this.updatedAt, resumeResumeShortForOwner.updatedAt) &&
        Objects.equals(this.url, resumeResumeShortForOwner.url);
  }

  @Override
  public int hashCode() {
    return Objects.hash(actions, age, alternateUrl, area, autoHideTime, canViewFullInfo, certificate, createdAt, download, education, experience, firstName, gender, hiddenFields, id, lastName, marked, middleName, photo, platform, realId, salary, title, totalExperience, updatedAt, url);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ResumeResumeShortForOwner {\n");
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

