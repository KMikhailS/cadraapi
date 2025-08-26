package ru.brobrocode.cadra.client.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.annotation.Generated;
import jakarta.validation.Valid;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * EmployerManagersManagerData
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2025-08-17T15:41:09.394389505+05:00[Asia/Yekaterinburg]", comments = "Generator version: 7.6.0")
public class EmployerManagersManagerData {

  private EmployerManagersEmployerManagerInfoAdditionalPhone additionalPhone;

  @Valid
  private List<@Valid EmployerManagerTypesAvailablePermissions> permissions = new ArrayList<>();

  private EmployerManagersEmployerManagerItemPhone phone;

  private String position;

  public EmployerManagersManagerData additionalPhone(EmployerManagersEmployerManagerInfoAdditionalPhone additionalPhone) {
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

  public EmployerManagersManagerData permissions(List<@Valid EmployerManagerTypesAvailablePermissions> permissions) {
    this.permissions = permissions;
    return this;
  }

  public EmployerManagersManagerData addPermissionsItem(EmployerManagerTypesAvailablePermissions permissionsItem) {
    if (this.permissions == null) {
      this.permissions = new ArrayList<>();
    }
    this.permissions.add(permissionsItem);
    return this;
  }

  /**
   * Список прав, которые можно дать данному типу менеджера
   * @return permissions
  */
  @Valid 
  @Schema(name = "permissions", description = "Список прав, которые можно дать данному типу менеджера", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("permissions")
  public List<@Valid EmployerManagerTypesAvailablePermissions> getPermissions() {
    return permissions;
  }

  public void setPermissions(List<@Valid EmployerManagerTypesAvailablePermissions> permissions) {
    this.permissions = permissions;
  }

  public EmployerManagersManagerData phone(EmployerManagersEmployerManagerItemPhone phone) {
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

  public EmployerManagersManagerData position(String position) {
    this.position = position;
    return this;
  }

  /**
   * Get position
   * @return position
  */
  
  @Schema(name = "position", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
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
    EmployerManagersManagerData employerManagersManagerData = (EmployerManagersManagerData) o;
    return Objects.equals(this.additionalPhone, employerManagersManagerData.additionalPhone) &&
        Objects.equals(this.permissions, employerManagersManagerData.permissions) &&
        Objects.equals(this.phone, employerManagersManagerData.phone) &&
        Objects.equals(this.position, employerManagersManagerData.position);
  }

  @Override
  public int hashCode() {
    return Objects.hash(additionalPhone, permissions, phone, position);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EmployerManagersManagerData {\n");
    sb.append("    additionalPhone: ").append(toIndentedString(additionalPhone)).append("\n");
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

