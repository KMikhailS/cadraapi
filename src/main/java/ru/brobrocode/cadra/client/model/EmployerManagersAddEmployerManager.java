package ru.brobrocode.cadra.client.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.annotation.Generated;
import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * EmployerManagersAddEmployerManager
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2025-08-17T15:41:09.394389505+05:00[Asia/Yekaterinburg]", comments = "Generator version: 7.6.0")
public class EmployerManagersAddEmployerManager {

  private EmployerManagersEmployerManagerInfoAdditionalPhone additionalPhone;

  private EmployerManagersAreaId area;

  private String email;

  private String firstName;

  private Boolean isMainContactPerson;

  private String lastName;

  private EmployerManagersManagerTypeId managerType;

  private String middleName;

  @Valid
  private List<@Valid EmployerManagersPermissions> permissions = new ArrayList<>();

  private EmployerManagersEmployerManagerItemPhone phone;

  private String position;

  public EmployerManagersAddEmployerManager() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public EmployerManagersAddEmployerManager(EmployerManagersAreaId area, String email, String firstName, Boolean isMainContactPerson, String lastName, EmployerManagersManagerTypeId managerType, EmployerManagersEmployerManagerItemPhone phone, String position) {
    this.area = area;
    this.email = email;
    this.firstName = firstName;
    this.isMainContactPerson = isMainContactPerson;
    this.lastName = lastName;
    this.managerType = managerType;
    this.phone = phone;
    this.position = position;
  }

  public EmployerManagersAddEmployerManager additionalPhone(EmployerManagersEmployerManagerInfoAdditionalPhone additionalPhone) {
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

  public EmployerManagersAddEmployerManager area(EmployerManagersAreaId area) {
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
  public EmployerManagersAreaId getArea() {
    return area;
  }

  public void setArea(EmployerManagersAreaId area) {
    this.area = area;
  }

  public EmployerManagersAddEmployerManager email(String email) {
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

  public EmployerManagersAddEmployerManager firstName(String firstName) {
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

  public EmployerManagersAddEmployerManager isMainContactPerson(Boolean isMainContactPerson) {
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

  public EmployerManagersAddEmployerManager lastName(String lastName) {
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

  public EmployerManagersAddEmployerManager managerType(EmployerManagersManagerTypeId managerType) {
    this.managerType = managerType;
    return this;
  }

  /**
   * Get managerType
   * @return managerType
  */
  @NotNull @Valid 
  @Schema(name = "manager_type", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("manager_type")
  public EmployerManagersManagerTypeId getManagerType() {
    return managerType;
  }

  public void setManagerType(EmployerManagersManagerTypeId managerType) {
    this.managerType = managerType;
  }

  public EmployerManagersAddEmployerManager middleName(String middleName) {
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

  public EmployerManagersAddEmployerManager permissions(List<@Valid EmployerManagersPermissions> permissions) {
    this.permissions = permissions;
    return this;
  }

  public EmployerManagersAddEmployerManager addPermissionsItem(EmployerManagersPermissions permissionsItem) {
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
  @Valid 
  @Schema(name = "permissions", description = "Список [прав менеджера](#tag/Menedzhery-rabotodatelya/operation/get-employer-manager-types)", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("permissions")
  public List<@Valid EmployerManagersPermissions> getPermissions() {
    return permissions;
  }

  public void setPermissions(List<@Valid EmployerManagersPermissions> permissions) {
    this.permissions = permissions;
  }

  public EmployerManagersAddEmployerManager phone(EmployerManagersEmployerManagerItemPhone phone) {
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

  public EmployerManagersAddEmployerManager position(String position) {
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

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EmployerManagersAddEmployerManager employerManagersAddEmployerManager = (EmployerManagersAddEmployerManager) o;
    return Objects.equals(this.additionalPhone, employerManagersAddEmployerManager.additionalPhone) &&
        Objects.equals(this.area, employerManagersAddEmployerManager.area) &&
        Objects.equals(this.email, employerManagersAddEmployerManager.email) &&
        Objects.equals(this.firstName, employerManagersAddEmployerManager.firstName) &&
        Objects.equals(this.isMainContactPerson, employerManagersAddEmployerManager.isMainContactPerson) &&
        Objects.equals(this.lastName, employerManagersAddEmployerManager.lastName) &&
        Objects.equals(this.managerType, employerManagersAddEmployerManager.managerType) &&
        Objects.equals(this.middleName, employerManagersAddEmployerManager.middleName) &&
        Objects.equals(this.permissions, employerManagersAddEmployerManager.permissions) &&
        Objects.equals(this.phone, employerManagersAddEmployerManager.phone) &&
        Objects.equals(this.position, employerManagersAddEmployerManager.position);
  }

  @Override
  public int hashCode() {
    return Objects.hash(additionalPhone, area, email, firstName, isMainContactPerson, lastName, managerType, middleName, permissions, phone, position);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EmployerManagersAddEmployerManager {\n");
    sb.append("    additionalPhone: ").append(toIndentedString(additionalPhone)).append("\n");
    sb.append("    area: ").append(toIndentedString(area)).append("\n");
    sb.append("    email: ").append(toIndentedString(email)).append("\n");
    sb.append("    firstName: ").append(toIndentedString(firstName)).append("\n");
    sb.append("    isMainContactPerson: ").append(toIndentedString(isMainContactPerson)).append("\n");
    sb.append("    lastName: ").append(toIndentedString(lastName)).append("\n");
    sb.append("    managerType: ").append(toIndentedString(managerType)).append("\n");
    sb.append("    middleName: ").append(toIndentedString(middleName)).append("\n");
    sb.append("    permissions: ").append(toIndentedString(permissions)).append("\n");
    sb.append("    phone: ").append(toIndentedString(phone)).append("\n");
    sb.append("    position: ").append(toIndentedString(position)).append("\n");
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

