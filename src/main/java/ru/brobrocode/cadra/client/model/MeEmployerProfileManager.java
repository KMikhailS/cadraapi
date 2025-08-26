package ru.brobrocode.cadra.client.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.annotation.Generated;
import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;

import java.net.URI;
import java.util.Objects;

/**
 * Информация о пользователе, как о менеджере компании
 */

@Schema(name = "MeEmployerProfileManager", description = "Информация о пользователе, как о менеджере компании")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2025-08-17T15:41:09.394389505+05:00[Asia/Yekaterinburg]", comments = "Generator version: 7.6.0")
public class MeEmployerProfileManager {

  private Boolean hasAdminRights;

  private Boolean hasMultipleManagerAccounts;

  private String id;

  private Boolean isMainContactPerson;

  private URI managerSettingsUrl;

  public MeEmployerProfileManager() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public MeEmployerProfileManager(Boolean hasAdminRights, Boolean hasMultipleManagerAccounts, String id, Boolean isMainContactPerson, URI managerSettingsUrl) {
    this.hasAdminRights = hasAdminRights;
    this.hasMultipleManagerAccounts = hasMultipleManagerAccounts;
    this.id = id;
    this.isMainContactPerson = isMainContactPerson;
    this.managerSettingsUrl = managerSettingsUrl;
  }

  public MeEmployerProfileManager hasAdminRights(Boolean hasAdminRights) {
    this.hasAdminRights = hasAdminRights;
    return this;
  }

  /**
   * Обладает ли текущий менеджер правами администратора
   * @return hasAdminRights
  */
  @NotNull 
  @Schema(name = "has_admin_rights", example = "true", description = "Обладает ли текущий менеджер правами администратора", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("has_admin_rights")
  public Boolean getHasAdminRights() {
    return hasAdminRights;
  }

  public void setHasAdminRights(Boolean hasAdminRights) {
    this.hasAdminRights = hasAdminRights;
  }

  public MeEmployerProfileManager hasMultipleManagerAccounts(Boolean hasMultipleManagerAccounts) {
    this.hasMultipleManagerAccounts = hasMultipleManagerAccounts;
    return this;
  }

  /**
   * Существует ли у пользователя несколько [рабочих аккаунтов](#tag/Menedzhery-rabotodatelya/operation/get-manager-accounts)
   * @return hasMultipleManagerAccounts
  */
  @NotNull 
  @Schema(name = "has_multiple_manager_accounts", example = "true", description = "Существует ли у пользователя несколько [рабочих аккаунтов](#tag/Menedzhery-rabotodatelya/operation/get-manager-accounts)", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("has_multiple_manager_accounts")
  public Boolean getHasMultipleManagerAccounts() {
    return hasMultipleManagerAccounts;
  }

  public void setHasMultipleManagerAccounts(Boolean hasMultipleManagerAccounts) {
    this.hasMultipleManagerAccounts = hasMultipleManagerAccounts;
  }

  public MeEmployerProfileManager id(String id) {
    this.id = id;
    return this;
  }

  /**
   * Идентификатор менеджера
   * @return id
  */
  @NotNull 
  @Schema(name = "id", example = "87654321", description = "Идентификатор менеджера", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("id")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public MeEmployerProfileManager isMainContactPerson(Boolean isMainContactPerson) {
    this.isMainContactPerson = isMainContactPerson;
    return this;
  }

  /**
   * Является ли текущий менеджер главным контактным лицом компании
   * @return isMainContactPerson
  */
  @NotNull 
  @Schema(name = "is_main_contact_person", example = "true", description = "Является ли текущий менеджер главным контактным лицом компании", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("is_main_contact_person")
  public Boolean getIsMainContactPerson() {
    return isMainContactPerson;
  }

  public void setIsMainContactPerson(Boolean isMainContactPerson) {
    this.isMainContactPerson = isMainContactPerson;
  }

  public MeEmployerProfileManager managerSettingsUrl(URI managerSettingsUrl) {
    this.managerSettingsUrl = managerSettingsUrl;
    return this;
  }

  /**
   * URL, на который нужно сделать GET запрос, чтобы получить [предпочтения менеджера](#tag/Menedzhery-rabotodatelya/operation/get-manager-settings)
   * @return managerSettingsUrl
  */
  @NotNull @Valid 
  @Schema(name = "manager_settings_url", example = "https://api.hh.ru/employers/1455/managers/87654321/settings", description = "URL, на который нужно сделать GET запрос, чтобы получить [предпочтения менеджера](#tag/Menedzhery-rabotodatelya/operation/get-manager-settings)", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("manager_settings_url")
  public URI getManagerSettingsUrl() {
    return managerSettingsUrl;
  }

  public void setManagerSettingsUrl(URI managerSettingsUrl) {
    this.managerSettingsUrl = managerSettingsUrl;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MeEmployerProfileManager meEmployerProfileManager = (MeEmployerProfileManager) o;
    return Objects.equals(this.hasAdminRights, meEmployerProfileManager.hasAdminRights) &&
        Objects.equals(this.hasMultipleManagerAccounts, meEmployerProfileManager.hasMultipleManagerAccounts) &&
        Objects.equals(this.id, meEmployerProfileManager.id) &&
        Objects.equals(this.isMainContactPerson, meEmployerProfileManager.isMainContactPerson) &&
        Objects.equals(this.managerSettingsUrl, meEmployerProfileManager.managerSettingsUrl);
  }

  @Override
  public int hashCode() {
    return Objects.hash(hasAdminRights, hasMultipleManagerAccounts, id, isMainContactPerson, managerSettingsUrl);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MeEmployerProfileManager {\n");
    sb.append("    hasAdminRights: ").append(toIndentedString(hasAdminRights)).append("\n");
    sb.append("    hasMultipleManagerAccounts: ").append(toIndentedString(hasMultipleManagerAccounts)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    isMainContactPerson: ").append(toIndentedString(isMainContactPerson)).append("\n");
    sb.append("    managerSettingsUrl: ").append(toIndentedString(managerSettingsUrl)).append("\n");
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

