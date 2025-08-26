package ru.brobrocode.cadra.client.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.annotation.Generated;
import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;

import java.math.BigDecimal;
import java.util.Objects;

/**
 * EmployerManagersEmployerManagerItem
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2025-08-17T15:41:09.394389505+05:00[Asia/Yekaterinburg]", comments = "Generator version: 7.6.0")
public class EmployerManagersEmployerManagerItem {

  private EmployerManagersEmployerManagerItemAdditionalPhone additionalPhone = null;

  private EmployerManagersArea area;

  private String email;

  private String firstName;

  private String fullName;

  private String id;

  private Boolean isMainContactPerson;

  private String lastName;

  private String middleName = null;

  @Deprecated
  private String name;

  private EmployerManagersEmployerManagerItemPhone phone;

  private String position;

  private String specialNote1 = null;

  private String specialNote2 = null;

  private BigDecimal vacanciesCount = null;

  public EmployerManagersEmployerManagerItem() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public EmployerManagersEmployerManagerItem(EmployerManagersArea area, String email, String id, String position) {
    this.area = area;
    this.email = email;
    this.id = id;
    this.position = position;
  }

  public EmployerManagersEmployerManagerItem additionalPhone(EmployerManagersEmployerManagerItemAdditionalPhone additionalPhone) {
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
  public EmployerManagersEmployerManagerItemAdditionalPhone getAdditionalPhone() {
    return additionalPhone;
  }

  public void setAdditionalPhone(EmployerManagersEmployerManagerItemAdditionalPhone additionalPhone) {
    this.additionalPhone = additionalPhone;
  }

  public EmployerManagersEmployerManagerItem area(EmployerManagersArea area) {
    this.area = area;
    return this;
  }

  /**
   * Get area
   * @return area
  */
  @NotNull @Valid 
  @Schema(name = "area", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("area")
  public EmployerManagersArea getArea() {
    return area;
  }

  public void setArea(EmployerManagersArea area) {
    this.area = area;
  }

  public EmployerManagersEmployerManagerItem email(String email) {
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

  public EmployerManagersEmployerManagerItem firstName(String firstName) {
    this.firstName = firstName;
    return this;
  }

  /**
   * Имя менеджера
   * @return firstName
  */
  
  @Schema(name = "first_name", description = "Имя менеджера", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("first_name")
  public String getFirstName() {
    return firstName;
  }

  public void setFirstName(String firstName) {
    this.firstName = firstName;
  }

  public EmployerManagersEmployerManagerItem fullName(String fullName) {
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

  public EmployerManagersEmployerManagerItem id(String id) {
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

  public EmployerManagersEmployerManagerItem isMainContactPerson(Boolean isMainContactPerson) {
    this.isMainContactPerson = isMainContactPerson;
    return this;
  }

  /**
   * Является ли менеджер основным контактным лицом
   * @return isMainContactPerson
  */
  
  @Schema(name = "is_main_contact_person", description = "Является ли менеджер основным контактным лицом", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("is_main_contact_person")
  public Boolean getIsMainContactPerson() {
    return isMainContactPerson;
  }

  public void setIsMainContactPerson(Boolean isMainContactPerson) {
    this.isMainContactPerson = isMainContactPerson;
  }

  public EmployerManagersEmployerManagerItem lastName(String lastName) {
    this.lastName = lastName;
    return this;
  }

  /**
   * Фамилия менеджера
   * @return lastName
  */
  
  @Schema(name = "last_name", description = "Фамилия менеджера", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("last_name")
  public String getLastName() {
    return lastName;
  }

  public void setLastName(String lastName) {
    this.lastName = lastName;
  }

  public EmployerManagersEmployerManagerItem middleName(String middleName) {
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

  public EmployerManagersEmployerManagerItem name(String name) {
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

  public EmployerManagersEmployerManagerItem phone(EmployerManagersEmployerManagerItemPhone phone) {
    this.phone = phone;
    return this;
  }

  /**
   * Get phone
   * @return phone
  */
  @Valid 
  @Schema(name = "phone", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("phone")
  public EmployerManagersEmployerManagerItemPhone getPhone() {
    return phone;
  }

  public void setPhone(EmployerManagersEmployerManagerItemPhone phone) {
    this.phone = phone;
  }

  public EmployerManagersEmployerManagerItem position(String position) {
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

  public EmployerManagersEmployerManagerItem specialNote1(String specialNote1) {
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

  public EmployerManagersEmployerManagerItem specialNote2(String specialNote2) {
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

  public EmployerManagersEmployerManagerItem vacanciesCount(BigDecimal vacanciesCount) {
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
    EmployerManagersEmployerManagerItem employerManagersEmployerManagerItem = (EmployerManagersEmployerManagerItem) o;
    return Objects.equals(this.additionalPhone, employerManagersEmployerManagerItem.additionalPhone) &&
        Objects.equals(this.area, employerManagersEmployerManagerItem.area) &&
        Objects.equals(this.email, employerManagersEmployerManagerItem.email) &&
        Objects.equals(this.firstName, employerManagersEmployerManagerItem.firstName) &&
        Objects.equals(this.fullName, employerManagersEmployerManagerItem.fullName) &&
        Objects.equals(this.id, employerManagersEmployerManagerItem.id) &&
        Objects.equals(this.isMainContactPerson, employerManagersEmployerManagerItem.isMainContactPerson) &&
        Objects.equals(this.lastName, employerManagersEmployerManagerItem.lastName) &&
        Objects.equals(this.middleName, employerManagersEmployerManagerItem.middleName) &&
        Objects.equals(this.name, employerManagersEmployerManagerItem.name) &&
        Objects.equals(this.phone, employerManagersEmployerManagerItem.phone) &&
        Objects.equals(this.position, employerManagersEmployerManagerItem.position) &&
        Objects.equals(this.specialNote1, employerManagersEmployerManagerItem.specialNote1) &&
        Objects.equals(this.specialNote2, employerManagersEmployerManagerItem.specialNote2) &&
        Objects.equals(this.vacanciesCount, employerManagersEmployerManagerItem.vacanciesCount);
  }

  @Override
  public int hashCode() {
    return Objects.hash(additionalPhone, area, email, firstName, fullName, id, isMainContactPerson, lastName, middleName, name, phone, position, specialNote1, specialNote2, vacanciesCount);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EmployerManagersEmployerManagerItem {\n");
    sb.append("    additionalPhone: ").append(toIndentedString(additionalPhone)).append("\n");
    sb.append("    area: ").append(toIndentedString(area)).append("\n");
    sb.append("    email: ").append(toIndentedString(email)).append("\n");
    sb.append("    firstName: ").append(toIndentedString(firstName)).append("\n");
    sb.append("    fullName: ").append(toIndentedString(fullName)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    isMainContactPerson: ").append(toIndentedString(isMainContactPerson)).append("\n");
    sb.append("    lastName: ").append(toIndentedString(lastName)).append("\n");
    sb.append("    middleName: ").append(toIndentedString(middleName)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
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

