package ru.brobrocode.cadra.client.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.annotation.Generated;
import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * Информация о рабочих аккаунтах менеджера
 */

@Schema(name = "ManagerAccounts", description = "Информация о рабочих аккаунтах менеджера")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2025-08-17T15:41:09.394389505+05:00[Asia/Yekaterinburg]", comments = "Generator version: 7.6.0")
public class ManagerAccounts {

  private String currentAccountId;

  private Boolean isPrimaryAccountBlocked;

  @Valid
  private List<@Valid ManagerAccount> items = new ArrayList<>();

  private String primaryAccountId;

  public ManagerAccounts() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public ManagerAccounts(String currentAccountId, Boolean isPrimaryAccountBlocked, List<@Valid ManagerAccount> items, String primaryAccountId) {
    this.currentAccountId = currentAccountId;
    this.isPrimaryAccountBlocked = isPrimaryAccountBlocked;
    this.items = items;
    this.primaryAccountId = primaryAccountId;
  }

  public ManagerAccounts currentAccountId(String currentAccountId) {
    this.currentAccountId = currentAccountId;
    return this;
  }

  /**
   * Идентификатор текущего рабочего аккаунта менеджера. Совпадает со значением переданного в заголовке `X-Manager-Account-Id` 
   * @return currentAccountId
  */
  @NotNull 
  @Schema(name = "current_account_id", example = "87654321", description = "Идентификатор текущего рабочего аккаунта менеджера. Совпадает со значением переданного в заголовке `X-Manager-Account-Id` ", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("current_account_id")
  public String getCurrentAccountId() {
    return currentAccountId;
  }

  public void setCurrentAccountId(String currentAccountId) {
    this.currentAccountId = currentAccountId;
  }

  public ManagerAccounts isPrimaryAccountBlocked(Boolean isPrimaryAccountBlocked) {
    this.isPrimaryAccountBlocked = isPrimaryAccountBlocked;
    return this;
  }

  /**
   * Заблокирован ли главный рабочий аккаунт менеджера
   * @return isPrimaryAccountBlocked
  */
  @NotNull 
  @Schema(name = "is_primary_account_blocked", example = "false", description = "Заблокирован ли главный рабочий аккаунт менеджера", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("is_primary_account_blocked")
  public Boolean getIsPrimaryAccountBlocked() {
    return isPrimaryAccountBlocked;
  }

  public void setIsPrimaryAccountBlocked(Boolean isPrimaryAccountBlocked) {
    this.isPrimaryAccountBlocked = isPrimaryAccountBlocked;
  }

  public ManagerAccounts items(List<@Valid ManagerAccount> items) {
    this.items = items;
    return this;
  }

  public ManagerAccounts addItemsItem(ManagerAccount itemsItem) {
    if (this.items == null) {
      this.items = new ArrayList<>();
    }
    this.items.add(itemsItem);
    return this;
  }

  /**
   * Список рабочих аккаунтов менеджера
   * @return items
  */
  @NotNull @Valid @Size(min = 0) 
  @Schema(name = "items", description = "Список рабочих аккаунтов менеджера", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("items")
  public List<@Valid ManagerAccount> getItems() {
    return items;
  }

  public void setItems(List<@Valid ManagerAccount> items) {
    this.items = items;
  }

  public ManagerAccounts primaryAccountId(String primaryAccountId) {
    this.primaryAccountId = primaryAccountId;
    return this;
  }

  /**
   * Идентификатор главного рабочего аккаунта менеджера
   * @return primaryAccountId
  */
  @NotNull 
  @Schema(name = "primary_account_id", example = "12345678", description = "Идентификатор главного рабочего аккаунта менеджера", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("primary_account_id")
  public String getPrimaryAccountId() {
    return primaryAccountId;
  }

  public void setPrimaryAccountId(String primaryAccountId) {
    this.primaryAccountId = primaryAccountId;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ManagerAccounts managerAccounts = (ManagerAccounts) o;
    return Objects.equals(this.currentAccountId, managerAccounts.currentAccountId) &&
        Objects.equals(this.isPrimaryAccountBlocked, managerAccounts.isPrimaryAccountBlocked) &&
        Objects.equals(this.items, managerAccounts.items) &&
        Objects.equals(this.primaryAccountId, managerAccounts.primaryAccountId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(currentAccountId, isPrimaryAccountBlocked, items, primaryAccountId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ManagerAccounts {\n");
    sb.append("    currentAccountId: ").append(toIndentedString(currentAccountId)).append("\n");
    sb.append("    isPrimaryAccountBlocked: ").append(toIndentedString(isPrimaryAccountBlocked)).append("\n");
    sb.append("    items: ").append(toIndentedString(items)).append("\n");
    sb.append("    primaryAccountId: ").append(toIndentedString(primaryAccountId)).append("\n");
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

