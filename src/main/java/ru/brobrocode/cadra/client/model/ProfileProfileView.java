package ru.brobrocode.cadra.client.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.annotation.Generated;
import jakarta.validation.Valid;
import org.springframework.format.annotation.DateTimeFormat;

import java.time.LocalDate;
import java.util.*;

/**
 * Информация о профиле для соискателя
 */

@Schema(name = "ProfileProfileView", description = "Информация о профиле для соискателя")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2025-08-17T15:41:09.394389505+05:00[Asia/Yekaterinburg]", comments = "Generator version: 7.6.0")
public class ProfileProfileView {

  private ProfileFieldsAddressCoordinates addressCoordinates = null;

  private ProfileFieldsArea area = null;

  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE)
  private LocalDate birthDate = null;

  @Valid
  private List<@Valid IncludesArea> citizenship = new ArrayList<>();

  @Valid
  private Map<String, ProfileFieldsCommunicationMethod> communicationMethods;

  @Valid
  private List<@Valid IncludesId> driverLicenseTypes = new ArrayList<>();

  private ProfileFieldsEducation education;

  private String firstName = null;

  private IncludesIdName gender = null;

  private Boolean hasVehicle = null;

  @Valid
  private List<IncludesLanguageLevel> language = new ArrayList<>();

  private String lastName = null;

  private MetroLineStation metro = null;

  private String middleName = null;

  @Valid
  private List<@Valid ProfileFieldsOtherCommunicationMethod> otherCommunicationMethods;

  private Boolean preferredWorkAllAreas = null;

  @Valid
  private List<@Valid ProfileFieldsPreferredWorkArea> preferredWorkAreas;

  private ResumeObjectsRelocation relocation;

  private IncludesIdName status;

  @Valid
  private List<@Valid IncludesArea> workTicket = new ArrayList<>();

  public ProfileProfileView addressCoordinates(ProfileFieldsAddressCoordinates addressCoordinates) {
    this.addressCoordinates = addressCoordinates;
    return this;
  }

  /**
   * Get addressCoordinates
   * @return addressCoordinates
  */
  @Valid 
  @Schema(name = "address_coordinates", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("address_coordinates")
  public ProfileFieldsAddressCoordinates getAddressCoordinates() {
    return addressCoordinates;
  }

  public void setAddressCoordinates(ProfileFieldsAddressCoordinates addressCoordinates) {
    this.addressCoordinates = addressCoordinates;
  }

  public ProfileProfileView area(ProfileFieldsArea area) {
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
  public ProfileFieldsArea getArea() {
    return area;
  }

  public void setArea(ProfileFieldsArea area) {
    this.area = area;
  }

  public ProfileProfileView birthDate(LocalDate birthDate) {
    this.birthDate = birthDate;
    return this;
  }

  /**
   * Дата рождения
   * @return birthDate
  */
  @Valid 
  @Schema(name = "birth_date", description = "Дата рождения", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("birth_date")
  public LocalDate getBirthDate() {
    return birthDate;
  }

  public void setBirthDate(LocalDate birthDate) {
    this.birthDate = birthDate;
  }

  public ProfileProfileView citizenship(List<@Valid IncludesArea> citizenship) {
    this.citizenship = citizenship;
    return this;
  }

  public ProfileProfileView addCitizenshipItem(IncludesArea citizenshipItem) {
    if (this.citizenship == null) {
      this.citizenship = new ArrayList<>();
    }
    this.citizenship.add(citizenshipItem);
    return this;
  }

  /**
   * Список гражданств
   * @return citizenship
  */
  @Valid 
  @Schema(name = "citizenship", description = "Список гражданств", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("citizenship")
  public List<@Valid IncludesArea> getCitizenship() {
    return citizenship;
  }

  public void setCitizenship(List<@Valid IncludesArea> citizenship) {
    this.citizenship = citizenship;
  }

  public ProfileProfileView communicationMethods(Map<String, ProfileFieldsCommunicationMethod> communicationMethods) {
    this.communicationMethods = communicationMethods;
    return this;
  }

  public ProfileProfileView putCommunicationMethodsItem(String key, ProfileFieldsCommunicationMethod communicationMethodsItem) {
    if (this.communicationMethods == null) {
      this.communicationMethods = new HashMap<>();
    }
    this.communicationMethods.put(key, communicationMethodsItem);
    return this;
  }

  /**
   * Способы коммуникации
   * @return communicationMethods
  */
  @Valid 
  @Schema(name = "communication_methods", description = "Способы коммуникации", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("communication_methods")
  public Map<String, ProfileFieldsCommunicationMethod> getCommunicationMethods() {
    return communicationMethods;
  }

  public void setCommunicationMethods(Map<String, ProfileFieldsCommunicationMethod> communicationMethods) {
    this.communicationMethods = communicationMethods;
  }

  public ProfileProfileView driverLicenseTypes(List<@Valid IncludesId> driverLicenseTypes) {
    this.driverLicenseTypes = driverLicenseTypes;
    return this;
  }

  public ProfileProfileView addDriverLicenseTypesItem(IncludesId driverLicenseTypesItem) {
    if (this.driverLicenseTypes == null) {
      this.driverLicenseTypes = new ArrayList<>();
    }
    this.driverLicenseTypes.add(driverLicenseTypesItem);
    return this;
  }

  /**
   * Список категорий прав на вождение ТС
   * @return driverLicenseTypes
  */
  @Valid 
  @Schema(name = "driver_license_types", description = "Список категорий прав на вождение ТС", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("driver_license_types")
  public List<@Valid IncludesId> getDriverLicenseTypes() {
    return driverLicenseTypes;
  }

  public void setDriverLicenseTypes(List<@Valid IncludesId> driverLicenseTypes) {
    this.driverLicenseTypes = driverLicenseTypes;
  }

  public ProfileProfileView education(ProfileFieldsEducation education) {
    this.education = education;
    return this;
  }

  /**
   * Образование соискателя.   Особенности сохранения образования:  * Если передать и высшее и среднее образование и уровень образования \"среднее\", то сохранится только среднее образование. * Если передать и высшее и среднее образование и уровень образования \"высшее\", то сохранится только высшее образование 
   * @return education
  */
  @Valid 
  @Schema(name = "education", description = "Образование соискателя.   Особенности сохранения образования:  * Если передать и высшее и среднее образование и уровень образования \"среднее\", то сохранится только среднее образование. * Если передать и высшее и среднее образование и уровень образования \"высшее\", то сохранится только высшее образование ", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("education")
  public ProfileFieldsEducation getEducation() {
    return education;
  }

  public void setEducation(ProfileFieldsEducation education) {
    this.education = education;
  }

  public ProfileProfileView firstName(String firstName) {
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

  public ProfileProfileView gender(IncludesIdName gender) {
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

  public ProfileProfileView hasVehicle(Boolean hasVehicle) {
    this.hasVehicle = hasVehicle;
    return this;
  }

  /**
   * Есть ли личный автомобиль
   * @return hasVehicle
  */
  
  @Schema(name = "has_vehicle", description = "Есть ли личный автомобиль", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("has_vehicle")
  public Boolean getHasVehicle() {
    return hasVehicle;
  }

  public void setHasVehicle(Boolean hasVehicle) {
    this.hasVehicle = hasVehicle;
  }

  public ProfileProfileView language(List<IncludesLanguageLevel> language) {
    this.language = language;
    return this;
  }

  public ProfileProfileView addLanguageItem(IncludesLanguageLevel languageItem) {
    if (this.language == null) {
      this.language = new ArrayList<>();
    }
    this.language.add(languageItem);
    return this;
  }

  /**
   * Список уровней владения языками
   * @return language
  */
  @Valid 
  @Schema(name = "language", description = "Список уровней владения языками", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("language")
  public List<IncludesLanguageLevel> getLanguage() {
    return language;
  }

  public void setLanguage(List<IncludesLanguageLevel> language) {
    this.language = language;
  }

  public ProfileProfileView lastName(String lastName) {
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

  public ProfileProfileView metro(MetroLineStation metro) {
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
  public MetroLineStation getMetro() {
    return metro;
  }

  public void setMetro(MetroLineStation metro) {
    this.metro = metro;
  }

  public ProfileProfileView middleName(String middleName) {
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

  public ProfileProfileView otherCommunicationMethods(List<@Valid ProfileFieldsOtherCommunicationMethod> otherCommunicationMethods) {
    this.otherCommunicationMethods = otherCommunicationMethods;
    return this;
  }

  public ProfileProfileView addOtherCommunicationMethodsItem(ProfileFieldsOtherCommunicationMethod otherCommunicationMethodsItem) {
    if (this.otherCommunicationMethods == null) {
      this.otherCommunicationMethods = new ArrayList<>();
    }
    this.otherCommunicationMethods.add(otherCommunicationMethodsItem);
    return this;
  }

  /**
   * Другие способы коммуникации
   * @return otherCommunicationMethods
  */
  @Valid 
  @Schema(name = "other_communication_methods", description = "Другие способы коммуникации", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("other_communication_methods")
  public List<@Valid ProfileFieldsOtherCommunicationMethod> getOtherCommunicationMethods() {
    return otherCommunicationMethods;
  }

  public void setOtherCommunicationMethods(List<@Valid ProfileFieldsOtherCommunicationMethod> otherCommunicationMethods) {
    this.otherCommunicationMethods = otherCommunicationMethods;
  }

  public ProfileProfileView preferredWorkAllAreas(Boolean preferredWorkAllAreas) {
    this.preferredWorkAllAreas = preferredWorkAllAreas;
    return this;
  }

  /**
   * Выбор всех регионов в районах поиска работы
   * @return preferredWorkAllAreas
  */
  
  @Schema(name = "preferred_work_all_areas", description = "Выбор всех регионов в районах поиска работы", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("preferred_work_all_areas")
  public Boolean getPreferredWorkAllAreas() {
    return preferredWorkAllAreas;
  }

  public void setPreferredWorkAllAreas(Boolean preferredWorkAllAreas) {
    this.preferredWorkAllAreas = preferredWorkAllAreas;
  }

  public ProfileProfileView preferredWorkAreas(List<@Valid ProfileFieldsPreferredWorkArea> preferredWorkAreas) {
    this.preferredWorkAreas = preferredWorkAreas;
    return this;
  }

  public ProfileProfileView addPreferredWorkAreasItem(ProfileFieldsPreferredWorkArea preferredWorkAreasItem) {
    if (this.preferredWorkAreas == null) {
      this.preferredWorkAreas = new ArrayList<>();
    }
    this.preferredWorkAreas.add(preferredWorkAreasItem);
    return this;
  }

  /**
   * Предпочтительные районы поиска работы
   * @return preferredWorkAreas
  */
  @Valid 
  @Schema(name = "preferred_work_areas", description = "Предпочтительные районы поиска работы", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("preferred_work_areas")
  public List<@Valid ProfileFieldsPreferredWorkArea> getPreferredWorkAreas() {
    return preferredWorkAreas;
  }

  public void setPreferredWorkAreas(List<@Valid ProfileFieldsPreferredWorkArea> preferredWorkAreas) {
    this.preferredWorkAreas = preferredWorkAreas;
  }

  public ProfileProfileView relocation(ResumeObjectsRelocation relocation) {
    this.relocation = relocation;
    return this;
  }

  /**
   * Возможность переезда
   * @return relocation
  */
  @Valid 
  @Schema(name = "relocation", description = "Возможность переезда", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("relocation")
  public ResumeObjectsRelocation getRelocation() {
    return relocation;
  }

  public void setRelocation(ResumeObjectsRelocation relocation) {
    this.relocation = relocation;
  }

  public ProfileProfileView status(IncludesIdName status) {
    this.status = status;
    return this;
  }

  /**
   * Раздел [Статус профиля](#tag/Rezyume.-Prosmotr-informacii/Status-rezyume) 
   * @return status
  */
  @Valid 
  @Schema(name = "status", description = "Раздел [Статус профиля](#tag/Rezyume.-Prosmotr-informacii/Status-rezyume) ", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("status")
  public IncludesIdName getStatus() {
    return status;
  }

  public void setStatus(IncludesIdName status) {
    this.status = status;
  }

  public ProfileProfileView workTicket(List<@Valid IncludesArea> workTicket) {
    this.workTicket = workTicket;
    return this;
  }

  public ProfileProfileView addWorkTicketItem(IncludesArea workTicketItem) {
    if (this.workTicket == null) {
      this.workTicket = new ArrayList<>();
    }
    this.workTicket.add(workTicketItem);
    return this;
  }

  /**
   * Список стран, в которых есть разрешение на работу
   * @return workTicket
  */
  @Valid 
  @Schema(name = "work_ticket", description = "Список стран, в которых есть разрешение на работу", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("work_ticket")
  public List<@Valid IncludesArea> getWorkTicket() {
    return workTicket;
  }

  public void setWorkTicket(List<@Valid IncludesArea> workTicket) {
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
    ProfileProfileView profileProfileView = (ProfileProfileView) o;
    return Objects.equals(this.addressCoordinates, profileProfileView.addressCoordinates) &&
        Objects.equals(this.area, profileProfileView.area) &&
        Objects.equals(this.birthDate, profileProfileView.birthDate) &&
        Objects.equals(this.citizenship, profileProfileView.citizenship) &&
        Objects.equals(this.communicationMethods, profileProfileView.communicationMethods) &&
        Objects.equals(this.driverLicenseTypes, profileProfileView.driverLicenseTypes) &&
        Objects.equals(this.education, profileProfileView.education) &&
        Objects.equals(this.firstName, profileProfileView.firstName) &&
        Objects.equals(this.gender, profileProfileView.gender) &&
        Objects.equals(this.hasVehicle, profileProfileView.hasVehicle) &&
        Objects.equals(this.language, profileProfileView.language) &&
        Objects.equals(this.lastName, profileProfileView.lastName) &&
        Objects.equals(this.metro, profileProfileView.metro) &&
        Objects.equals(this.middleName, profileProfileView.middleName) &&
        Objects.equals(this.otherCommunicationMethods, profileProfileView.otherCommunicationMethods) &&
        Objects.equals(this.preferredWorkAllAreas, profileProfileView.preferredWorkAllAreas) &&
        Objects.equals(this.preferredWorkAreas, profileProfileView.preferredWorkAreas) &&
        Objects.equals(this.relocation, profileProfileView.relocation) &&
        Objects.equals(this.status, profileProfileView.status) &&
        Objects.equals(this.workTicket, profileProfileView.workTicket);
  }

  @Override
  public int hashCode() {
    return Objects.hash(addressCoordinates, area, birthDate, citizenship, communicationMethods, driverLicenseTypes, education, firstName, gender, hasVehicle, language, lastName, metro, middleName, otherCommunicationMethods, preferredWorkAllAreas, preferredWorkAreas, relocation, status, workTicket);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ProfileProfileView {\n");
    sb.append("    addressCoordinates: ").append(toIndentedString(addressCoordinates)).append("\n");
    sb.append("    area: ").append(toIndentedString(area)).append("\n");
    sb.append("    birthDate: ").append(toIndentedString(birthDate)).append("\n");
    sb.append("    citizenship: ").append(toIndentedString(citizenship)).append("\n");
    sb.append("    communicationMethods: ").append(toIndentedString(communicationMethods)).append("\n");
    sb.append("    driverLicenseTypes: ").append(toIndentedString(driverLicenseTypes)).append("\n");
    sb.append("    education: ").append(toIndentedString(education)).append("\n");
    sb.append("    firstName: ").append(toIndentedString(firstName)).append("\n");
    sb.append("    gender: ").append(toIndentedString(gender)).append("\n");
    sb.append("    hasVehicle: ").append(toIndentedString(hasVehicle)).append("\n");
    sb.append("    language: ").append(toIndentedString(language)).append("\n");
    sb.append("    lastName: ").append(toIndentedString(lastName)).append("\n");
    sb.append("    metro: ").append(toIndentedString(metro)).append("\n");
    sb.append("    middleName: ").append(toIndentedString(middleName)).append("\n");
    sb.append("    otherCommunicationMethods: ").append(toIndentedString(otherCommunicationMethods)).append("\n");
    sb.append("    preferredWorkAllAreas: ").append(toIndentedString(preferredWorkAllAreas)).append("\n");
    sb.append("    preferredWorkAreas: ").append(toIndentedString(preferredWorkAreas)).append("\n");
    sb.append("    relocation: ").append(toIndentedString(relocation)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
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

