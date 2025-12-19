package ru.brobrocode.cadra.client.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.annotation.Generated;
import jakarta.validation.Valid;
import org.springframework.format.annotation.DateTimeFormat;

import java.time.LocalDate;
import java.util.*;

/**
 * Информация о профиле
 */

@Schema(name = "ProfileProfileUpdate", description = "Информация о профиле")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2025-08-17T15:41:09.394389505+05:00[Asia/Yekaterinburg]", comments = "Generator version: 7.6.0")
public class ProfileProfileUpdate {

  private ProfileProfileUpdateAddressCoordinates addressCoordinates = null;

  private IncludesArea area;

  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE)
  private LocalDate birthDate;

  @Valid
  private List<@Valid IncludesArea> citizenship = new ArrayList<>();

  @Valid
  private Map<String, ProfileFieldsCommunicationMethod> communicationMethods;

  @Valid
  private List<@Valid IncludesId> driverLicenseTypes = new ArrayList<>();

  private ProfileFieldsEducation education = null;

  private String firstName;

  private IncludesIdName gender;

  private Boolean hasVehicle;

  @Valid
  private List<IncludesLanguageLevel> language = new ArrayList<>();

  private String lastName;

  private MetroLineStation metro;

  private String middleName;

  @Valid
  private List<@Valid ProfileFieldsOtherCommunicationMethod> otherCommunicationMethods;

  private Boolean preferredWorkAllAreas = null;

  @Valid
  private List<@Valid ProfileFieldsPreferredWorkArea> preferredWorkAreas;

  private ResumeObjectsRelocation relocation;

  @Valid
  private List<@Valid IncludesArea> workTicket = new ArrayList<>();

  public ProfileProfileUpdate addressCoordinates(ProfileProfileUpdateAddressCoordinates addressCoordinates) {
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
  public ProfileProfileUpdateAddressCoordinates getAddressCoordinates() {
    return addressCoordinates;
  }

  public void setAddressCoordinates(ProfileProfileUpdateAddressCoordinates addressCoordinates) {
    this.addressCoordinates = addressCoordinates;
  }

  public ProfileProfileUpdate area(IncludesArea area) {
    this.area = area;
    return this;
  }

  /**
   * Город проживания
   * @return area
  */
  @Valid 
  @Schema(name = "area", description = "Город проживания", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("area")
  public IncludesArea getArea() {
    return area;
  }

  public void setArea(IncludesArea area) {
    this.area = area;
  }

  public ProfileProfileUpdate birthDate(LocalDate birthDate) {
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

  public ProfileProfileUpdate citizenship(List<@Valid IncludesArea> citizenship) {
    this.citizenship = citizenship;
    return this;
  }

  public ProfileProfileUpdate addCitizenshipItem(IncludesArea citizenshipItem) {
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

  public ProfileProfileUpdate communicationMethods(Map<String, ProfileFieldsCommunicationMethod> communicationMethods) {
    this.communicationMethods = communicationMethods;
    return this;
  }

  public ProfileProfileUpdate putCommunicationMethodsItem(String key, ProfileFieldsCommunicationMethod communicationMethodsItem) {
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

  public ProfileProfileUpdate driverLicenseTypes(List<@Valid IncludesId> driverLicenseTypes) {
    this.driverLicenseTypes = driverLicenseTypes;
    return this;
  }

  public ProfileProfileUpdate addDriverLicenseTypesItem(IncludesId driverLicenseTypesItem) {
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

  public ProfileProfileUpdate education(ProfileFieldsEducation education) {
    this.education = education;
    return this;
  }

  /**
   * Образование соискателя.  Особенности сохранения образования:  * Если передать и высшее и среднее образование и уровень образования \"средний\", то сохранится только среднее образование. * Если передать и высшее и среднее образование и уровень образования \"высшее\", то сохранится только высшее образование 
   * @return education
  */
  @Valid 
  @Schema(name = "education", description = "Образование соискателя.  Особенности сохранения образования:  * Если передать и высшее и среднее образование и уровень образования \"средний\", то сохранится только среднее образование. * Если передать и высшее и среднее образование и уровень образования \"высшее\", то сохранится только высшее образование ", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("education")
  public ProfileFieldsEducation getEducation() {
    return education;
  }

  public void setEducation(ProfileFieldsEducation education) {
    this.education = education;
  }

  public ProfileProfileUpdate firstName(String firstName) {
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

  public ProfileProfileUpdate gender(IncludesIdName gender) {
    this.gender = gender;
    return this;
  }

  /**
   * Пол. Элемент справочника [gender](#tag/Obshie-spravochniki/operation/get-dictionaries)
   * @return gender
  */
  @Valid 
  @Schema(name = "gender", description = "Пол. Элемент справочника [gender](#tag/Obshie-spravochniki/operation/get-dictionaries)", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("gender")
  public IncludesIdName getGender() {
    return gender;
  }

  public void setGender(IncludesIdName gender) {
    this.gender = gender;
  }

  public ProfileProfileUpdate hasVehicle(Boolean hasVehicle) {
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

  public ProfileProfileUpdate language(List<IncludesLanguageLevel> language) {
    this.language = language;
    return this;
  }

  public ProfileProfileUpdate addLanguageItem(IncludesLanguageLevel languageItem) {
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

  public ProfileProfileUpdate lastName(String lastName) {
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

  public ProfileProfileUpdate metro(MetroLineStation metro) {
    this.metro = metro;
    return this;
  }

  /**
   * Станция метро
   * @return metro
  */
  @Valid 
  @Schema(name = "metro", description = "Станция метро", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("metro")
  public MetroLineStation getMetro() {
    return metro;
  }

  public void setMetro(MetroLineStation metro) {
    this.metro = metro;
  }

  public ProfileProfileUpdate middleName(String middleName) {
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

  public ProfileProfileUpdate otherCommunicationMethods(List<@Valid ProfileFieldsOtherCommunicationMethod> otherCommunicationMethods) {
    this.otherCommunicationMethods = otherCommunicationMethods;
    return this;
  }

  public ProfileProfileUpdate addOtherCommunicationMethodsItem(ProfileFieldsOtherCommunicationMethod otherCommunicationMethodsItem) {
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

  public ProfileProfileUpdate preferredWorkAllAreas(Boolean preferredWorkAllAreas) {
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

  public ProfileProfileUpdate preferredWorkAreas(List<@Valid ProfileFieldsPreferredWorkArea> preferredWorkAreas) {
    this.preferredWorkAreas = preferredWorkAreas;
    return this;
  }

  public ProfileProfileUpdate addPreferredWorkAreasItem(ProfileFieldsPreferredWorkArea preferredWorkAreasItem) {
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

  public ProfileProfileUpdate relocation(ResumeObjectsRelocation relocation) {
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

  public ProfileProfileUpdate workTicket(List<@Valid IncludesArea> workTicket) {
    this.workTicket = workTicket;
    return this;
  }

  public ProfileProfileUpdate addWorkTicketItem(IncludesArea workTicketItem) {
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
    ProfileProfileUpdate profileProfileUpdate = (ProfileProfileUpdate) o;
    return Objects.equals(this.addressCoordinates, profileProfileUpdate.addressCoordinates) &&
        Objects.equals(this.area, profileProfileUpdate.area) &&
        Objects.equals(this.birthDate, profileProfileUpdate.birthDate) &&
        Objects.equals(this.citizenship, profileProfileUpdate.citizenship) &&
        Objects.equals(this.communicationMethods, profileProfileUpdate.communicationMethods) &&
        Objects.equals(this.driverLicenseTypes, profileProfileUpdate.driverLicenseTypes) &&
        Objects.equals(this.education, profileProfileUpdate.education) &&
        Objects.equals(this.firstName, profileProfileUpdate.firstName) &&
        Objects.equals(this.gender, profileProfileUpdate.gender) &&
        Objects.equals(this.hasVehicle, profileProfileUpdate.hasVehicle) &&
        Objects.equals(this.language, profileProfileUpdate.language) &&
        Objects.equals(this.lastName, profileProfileUpdate.lastName) &&
        Objects.equals(this.metro, profileProfileUpdate.metro) &&
        Objects.equals(this.middleName, profileProfileUpdate.middleName) &&
        Objects.equals(this.otherCommunicationMethods, profileProfileUpdate.otherCommunicationMethods) &&
        Objects.equals(this.preferredWorkAllAreas, profileProfileUpdate.preferredWorkAllAreas) &&
        Objects.equals(this.preferredWorkAreas, profileProfileUpdate.preferredWorkAreas) &&
        Objects.equals(this.relocation, profileProfileUpdate.relocation) &&
        Objects.equals(this.workTicket, profileProfileUpdate.workTicket);
  }

  @Override
  public int hashCode() {
    return Objects.hash(addressCoordinates, area, birthDate, citizenship, communicationMethods, driverLicenseTypes, education, firstName, gender, hasVehicle, language, lastName, metro, middleName, otherCommunicationMethods, preferredWorkAllAreas, preferredWorkAreas, relocation, workTicket);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ProfileProfileUpdate {\n");
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

