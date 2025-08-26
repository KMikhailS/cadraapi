package ru.brobrocode.cadra.client.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.annotation.Generated;
import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * EmployerManagersEmployerManagerInfo
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2025-08-17T15:41:09.394389505+05:00[Asia/Yekaterinburg]", comments = "Generator version: 7.6.0")
public class EmployerManagersEmployerManagerInfo {

  private EmployerManagersEmployerManagerInfoAdditionalPhone additionalPhone;

  private EmployerManagersArea area;

  private String email;

  private String firstName;

  private String fullName;

  private String id;

  private Boolean isMainContactPerson;

  private String lastName;

  private EmployerManagersManagerType managerType;

  private String middleName;

  @Deprecated
  private String name;

  @Valid
  private List<@Valid EmployerManagerTypesAvailablePermissions> permissions = new ArrayList<>();

  private EmployerManagersEmployerManagerItemPhone phone;

  private String position;

  private String specialNote1 = null;

  private String specialNote2 = null;

  private BigDecimal vacanciesCount = null;

  public EmployerManagersEmployerManagerInfo() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public EmployerManagersEmployerManagerInfo(String email, String firstName, String id, Boolean isMainContactPerson, String lastName, List<@Valid EmployerManagerTypesAvailablePermissions> permissions, EmployerManagersEmployerManagerItemPhone phone, String position) {
    this.email = email;
    this.firstName = firstName;
    this.id = id;
    this.isMainContactPerson = isMainContactPerson;
    this.lastName = lastName;
    this.permissions = permissions;
    this.phone = phone;
    this.position = position;
  }

  public EmployerManagersEmployerManagerInfo additionalPhone(EmployerManagersEmployerManagerInfoAdditionalPhone additionalPhone) {
    this.additionalPhone = additionalPhone;
    return this;
  }

  /**
   * Get additionalPhone
   * @return additionalPhone
  */
  @Valid 
  @Schema(name = "additional_phone", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("additional_phone")
  public EmployerManagersEmployerManagerInfoAdditionalPhone getAdditionalPhone() {
    return additionalPhone;
  }

  public void setAdditionalPhone(EmployerManagersEmployerManagerInfoAdditionalPhone additionalPhone) {
    this.additionalPhone = additionalPhone;
  }

  public EmployerManagersEmployerManagerInfo area(EmployerManagersArea area) {
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
  public EmployerManagersArea getArea() {
    return area;
  }

  public void setArea(EmployerManagersArea area) {
    this.area = area;
  }

  public EmployerManagersEmployerManagerInfo email(String email) {
    this.email = email;
    return this;
  }

  /**
   * Адрес электронной почты менеджера
   * @return email
  */
  @NotNull 
  @Schema(name = "email", description = "Адрес электронной почты менеджера", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("email")
  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public EmployerManagersEmployerManagerInfo firstName(String firstName) {
    this.firstName = firstName;
    return this;
  }

  /**
   * Имя менеджера
   * @return firstName
  */
  @NotNull 
  @Schema(name = "first_name", description = "Имя менеджера", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("first_name")
  public String getFirstName() {
    return firstName;
  }

  public void setFirstName(String firstName) {
    this.firstName = firstName;
  }

  public EmployerManagersEmployerManagerInfo fullName(String fullName) {
    this.fullName = fullName;
    return this;
  }

  /**
   * Полное имя менеджера
   * @return fullName
  */
  
  @Schema(name = "full_name", description = "Полное имя менеджера", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("full_name")
  public String getFullName() {
    return fullName;
  }

  public void setFullName(String fullName) {
    this.fullName = fullName;
  }

  public EmployerManagersEmployerManagerInfo id(String id) {
    this.id = id;
    return this;
  }

  /**
   * Идентификатор менеджера
   * @return id
  */
  @NotNull 
  @Schema(name = "id", description = "Идентификатор менеджера", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("id")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public EmployerManagersEmployerManagerInfo isMainContactPerson(Boolean isMainContactPerson) {
    this.isMainContactPerson = isMainContactPerson;
    return this;
  }

  /**
   * Является ли менеджер основным контактным лицом
   * @return isMainContactPerson
  */
  @NotNull 
  @Schema(name = "is_main_contact_person", description = "Является ли менеджер основным контактным лицом", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("is_main_contact_person")
  public Boolean getIsMainContactPerson() {
    return isMainContactPerson;
  }

  public void setIsMainContactPerson(Boolean isMainContactPerson) {
    this.isMainContactPerson = isMainContactPerson;
  }

  public EmployerManagersEmployerManagerInfo lastName(String lastName) {
    this.lastName = lastName;
    return this;
  }

  /**
   * Фамилия менеджера
   * @return lastName
  */
  @NotNull 
  @Schema(name = "last_name", description = "Фамилия менеджера", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("last_name")
  public String getLastName() {
    return lastName;
  }

  public void setLastName(String lastName) {
    this.lastName = lastName;
  }

  public EmployerManagersEmployerManagerInfo managerType(EmployerManagersManagerType managerType) {
    this.managerType = managerType;
    return this;
  }

  /**
   * Get managerType
   * @return managerType
  */
  @Valid 
  @Schema(name = "manager_type", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("manager_type")
  public EmployerManagersManagerType getManagerType() {
    return managerType;
  }

  public void setManagerType(EmployerManagersManagerType managerType) {
    this.managerType = managerType;
  }

  public EmployerManagersEmployerManagerInfo middleName(String middleName) {
    this.middleName = middleName;
    return this;
  }

  /**
   * Отчество менеджера
   * @return middleName
  */
  
  @Schema(name = "middle_name", description = "Отчество менеджера", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("middle_name")
  public String getMiddleName() {
    return middleName;
  }

  public void setMiddleName(String middleName) {
    this.middleName = middleName;
  }

  public EmployerManagersEmployerManagerInfo name(String name) {
    this.name = name;
    return this;
  }

  /**
   * Полное имя менеджера
   * @return name
   * @deprecated
  */
  
  @Schema(name = "name", description = "Полное имя менеджера", deprecated = true, requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("name")
  @Deprecated
  public String getName() {
    return name;
  }

  /**
   * @deprecated
  */
  @Deprecated
  public void setName(String name) {
    this.name = name;
  }

  public EmployerManagersEmployerManagerInfo permissions(List<@Valid EmployerManagerTypesAvailablePermissions> permissions) {
    this.permissions = permissions;
    return this;
  }

  public EmployerManagersEmployerManagerInfo addPermissionsItem(EmployerManagerTypesAvailablePermissions permissionsItem) {
    if (this.permissions == null) {
      this.permissions = new ArrayList<>();
    }
    this.permissions.add(permissionsItem);
    return this;
  }

  /**
   * Список [прав менеджера](#tag/Menedzhery-rabotodatelya/operation/get-employer-manager-types)
   * @return permissions
  */
  @NotNull @Valid 
  @Schema(name = "permissions", description = "Список [прав менеджера](#tag/Menedzhery-rabotodatelya/operation/get-employer-manager-types)", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("permissions")
  public List<@Valid EmployerManagerTypesAvailablePermissions> getPermissions() {
    return permissions;
  }

  public void setPermissions(List<@Valid EmployerManagerTypesAvailablePermissions> permissions) {
    this.permissions = permissions;
  }

  public EmployerManagersEmployerManagerInfo phone(EmployerManagersEmployerManagerItemPhone phone) {
    this.phone = phone;
    return this;
  }

  /**
   * Get phone
   * @return phone
  */
  @NotNull @Valid 
  @Schema(name = "phone", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("phone")
  public EmployerManagersEmployerManagerItemPhone getPhone() {
    return phone;
  }

  public void setPhone(EmployerManagersEmployerManagerItemPhone phone) {
    this.phone = phone;
  }

  public EmployerManagersEmployerManagerInfo position(String position) {
    this.position = position;
    return this;
  }

  /**
   * Должность менеджера
   * @return position
  */
  @NotNull 
  @Schema(name = "position", description = "Должность менеджера", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("position")
  public String getPosition() {
    return position;
  }

  public void setPosition(String position) {
    this.position = position;
  }

  public EmployerManagersEmployerManagerInfo specialNote1(String specialNote1) {
    this.specialNote1 = specialNote1;
    return this;
  }

  /**
   * Первый спецпризнак менеджера
   * @return specialNote1
  */
  
  @Schema(name = "special_note_1", description = "Первый спецпризнак менеджера", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("special_note_1")
  public String getSpecialNote1() {
    return specialNote1;
  }

  public void setSpecialNote1(String specialNote1) {
    this.specialNote1 = specialNote1;
  }

  public EmployerManagersEmployerManagerInfo specialNote2(String specialNote2) {
    this.specialNote2 = specialNote2;
    return this;
  }

  /**
   * Второй спецпризнак менеджера
   * @return specialNote2
  */
  
  @Schema(name = "special_note_2", description = "Второй спецпризнак менеджера", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("special_note_2")
  public String getSpecialNote2() {
    return specialNote2;
  }

  public void setSpecialNote2(String specialNote2) {
    this.specialNote2 = specialNote2;
  }

  public EmployerManagersEmployerManagerInfo vacanciesCount(BigDecimal vacanciesCount) {
    this.vacanciesCount = vacanciesCount;
    return this;
  }

  /**
   * Количество опубликованных (активных) вакансий у данного менеджера. `null` — если у пользователя нет прав на просмотр вакансий этого менеджера
   * @return vacanciesCount
  */
  @Valid 
  @Schema(name = "vacancies_count", description = "Количество опубликованных (активных) вакансий у данного менеджера. `null` — если у пользователя нет прав на просмотр вакансий этого менеджера", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("vacancies_count")
  public BigDecimal getVacanciesCount() {
    return vacanciesCount;
  }

  public void setVacanciesCount(BigDecimal vacanciesCount) {
    this.vacanciesCount = vacanciesCount;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EmployerManagersEmployerManagerInfo employerManagersEmployerManagerInfo = (EmployerManagersEmployerManagerInfo) o;
    return Objects.equals(this.additionalPhone, employerManagersEmployerManagerInfo.additionalPhone) &&
        Objects.equals(this.area, employerManagersEmployerManagerInfo.area) &&
        Objects.equals(this.email, employerManagersEmployerManagerInfo.email) &&
        Objects.equals(this.firstName, employerManagersEmployerManagerInfo.firstName) &&
        Objects.equals(this.fullName, employerManagersEmployerManagerInfo.fullName) &&
        Objects.equals(this.id, employerManagersEmployerManagerInfo.id) &&
        Objects.equals(this.isMainContactPerson, employerManagersEmployerManagerInfo.isMainContactPerson) &&
        Objects.equals(this.lastName, employerManagersEmployerManagerInfo.lastName) &&
        Objects.equals(this.managerType, employerManagersEmployerManagerInfo.managerType) &&
        Objects.equals(this.middleName, employerManagersEmployerManagerInfo.middleName) &&
        Objects.equals(this.name, employerManagersEmployerManagerInfo.name) &&
        Objects.equals(this.permissions, employerManagersEmployerManagerInfo.permissions) &&
        Objects.equals(this.phone, employerManagersEmployerManagerInfo.phone) &&
        Objects.equals(this.position, employerManagersEmployerManagerInfo.position) &&
        Objects.equals(this.specialNote1, employerManagersEmployerManagerInfo.specialNote1) &&
        Objects.equals(this.specialNote2, employerManagersEmployerManagerInfo.specialNote2) &&
        Objects.equals(this.vacanciesCount, employerManagersEmployerManagerInfo.vacanciesCount);
  }

  @Override
  public int hashCode() {
    return Objects.hash(additionalPhone, area, email, firstName, fullName, id, isMainContactPerson, lastName, managerType, middleName, name, permissions, phone, position, specialNote1, specialNote2, vacanciesCount);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EmployerManagersEmployerManagerInfo {\n");
    sb.append("    additionalPhone: ").append(toIndentedString(additionalPhone)).append("\n");
    sb.append("    area: ").append(toIndentedString(area)).append("\n");
    sb.append("    email: ").append(toIndentedString(email)).append("\n");
    sb.append("    firstName: ").append(toIndentedString(firstName)).append("\n");
    sb.append("    fullName: ").append(toIndentedString(fullName)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    isMainContactPerson: ").append(toIndentedString(isMainContactPerson)).append("\n");
    sb.append("    lastName: ").append(toIndentedString(lastName)).append("\n");
    sb.append("    managerType: ").append(toIndentedString(managerType)).append("\n");
    sb.append("    middleName: ").append(toIndentedString(middleName)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    permissions: ").append(toIndentedString(permissions)).append("\n");
    sb.append("    phone: ").append(toIndentedString(phone)).append("\n");
    sb.append("    position: ").append(toIndentedString(position)).append("\n");
    sb.append("    specialNote1: ").append(toIndentedString(specialNote1)).append("\n");
    sb.append("    specialNote2: ").append(toIndentedString(specialNote2)).append("\n");
    sb.append("    vacanciesCount: ").append(toIndentedString(vacanciesCount)).append("\n");
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

