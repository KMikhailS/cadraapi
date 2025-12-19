package ru.brobrocode.cadra.client.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.annotation.Generated;
import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * ErrorsEmployerManagerBadAuthorizationError
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2025-08-17T15:41:09.394389505+05:00[Asia/Yekaterinburg]", comments = "Generator version: 7.6.0")
public class ErrorsEmployerManagerBadAuthorizationError {

  @Valid
  private List<@Valid ManagerAccount> allowedAccounts = new ArrayList<>();

  /**
   * Ошибки при создании или редактировании менеджера работодателя:   * `already_exist` — Менеджер с такой почтой уже существует   * `creation_limit_exceeded` — Достигнут лимит на создание менеджеров   * `not_editable` — Поле *field_name* недоступно для редактирования 
   */
  public enum ReasonEnum {
    ALREADY_EXIST("already_exist"),
    
    CREATION_LIMIT_EXCEEDED("creation_limit_exceeded"),
    
    NOT_EDITABLE("not_editable");

    private String value;

    ReasonEnum(String value) {
      this.value = value;
    }

    @JsonValue
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static ReasonEnum fromValue(String value) {
      for (ReasonEnum b : ReasonEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  private ReasonEnum reason;

  /**
   * Текстовый идентификатор типа ошибки
   */
  public enum TypeEnum {
    FORBIDDEN("forbidden"),
    
    OAUTH("oauth"),
    
    MANAGER_EXTRA_ACCOUNTS("manager_extra_accounts"),
    
    MANAGER_ACCOUNTS("manager_accounts"),
    
    MANAGERS("managers");

    private String value;

    TypeEnum(String value) {
      this.value = value;
    }

    @JsonValue
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static TypeEnum fromValue(String value) {
      for (TypeEnum b : TypeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  private TypeEnum type;

  /**
   * Общие ошибки:   * `bad_authorization` — Токен авторизации не существует или не валидный   * `token_expired` — Время жизни access_token завершилось, необходимо [выполнить обновление access_token](#section/Avtorizaciya/Obnovlenie-pary-access-i-refresh-tokenov)   * `token_revoked` — Токен отозван пользователем или сервером, приложению необходимо [запросить новую авторизацию](#section/Tipy-avtorizacij)   * `application_not_found` — Ваше приложение было удалено   * `used_manager_account_forbidden` — [Рабочий аккаунт заблокирован](https://github.com/hhru/api/blob/master/docs/errors.md#manager-accounts-blocked)   * `manager_extra_account_not_found` — В заголовке передан некорректный id аккаунта   * `email` — Менеджер с такой почтой уже существует   * `user_auth_expected` — Ожидается авторизация пользователя, передана авторизация приложения   * `manager_type` — Поле manager_type недоступно для редактирования   * `area` — Поле area недоступно для редактирования   * `last_name` — Поле lastName недоступно для редактирования   * `first_name` — Поле firstName недоступно для редактирования   * `middle_name` — Поле middleName недоступно для редактирования 
   */
  public enum ValueEnum {
    BAD_AUTHORIZATION("bad_authorization"),
    
    TOKEN_EXPIRED("token_expired"),
    
    TOKEN_REVOKED("token_revoked"),
    
    APPLICATION_NOT_FOUND("application_not_found"),
    
    MANAGER_EXTRA_ACCOUNT_NOT_FOUND("manager_extra_account_not_found"),
    
    USED_MANAGER_ACCOUNT_FORBIDDEN("used_manager_account_forbidden"),
    
    EMAIL("email"),
    
    USER_AUTH_EXPECTED("user_auth_expected"),
    
    MANAGER_TYPE("manager_type"),
    
    AREA("area"),
    
    LAST_NAME("last_name"),
    
    FIRST_NAME("first_name"),
    
    MIDDLE_NAME("middle_name");

    private String value;

    ValueEnum(String value) {
      this.value = value;
    }

    @JsonValue
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static ValueEnum fromValue(String value) {
      for (ValueEnum b : ValueEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  private ValueEnum value;

  public ErrorsEmployerManagerBadAuthorizationError() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public ErrorsEmployerManagerBadAuthorizationError(TypeEnum type) {
    this.type = type;
  }

  public ErrorsEmployerManagerBadAuthorizationError allowedAccounts(List<@Valid ManagerAccount> allowedAccounts) {
    this.allowedAccounts = allowedAccounts;
    return this;
  }

  public ErrorsEmployerManagerBadAuthorizationError addAllowedAccountsItem(ManagerAccount allowedAccountsItem) {
    if (this.allowedAccounts == null) {
      this.allowedAccounts = new ArrayList<>();
    }
    this.allowedAccounts.add(allowedAccountsItem);
    return this;
  }

  /**
   * Список доступных для токена аккаунтов менеджера в случае, если используемый рабочий аккаунт заблокирован. Актуально только в случае авторизации работодателя 
   * @return allowedAccounts
  */
  @Valid @Size(min = 1) 
  @Schema(name = "allowed_accounts", description = "Список доступных для токена аккаунтов менеджера в случае, если используемый рабочий аккаунт заблокирован. Актуально только в случае авторизации работодателя ", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("allowed_accounts")
  public List<@Valid ManagerAccount> getAllowedAccounts() {
    return allowedAccounts;
  }

  public void setAllowedAccounts(List<@Valid ManagerAccount> allowedAccounts) {
    this.allowedAccounts = allowedAccounts;
  }

  public ErrorsEmployerManagerBadAuthorizationError reason(ReasonEnum reason) {
    this.reason = reason;
    return this;
  }

  /**
   * Ошибки при создании или редактировании менеджера работодателя:   * `already_exist` — Менеджер с такой почтой уже существует   * `creation_limit_exceeded` — Достигнут лимит на создание менеджеров   * `not_editable` — Поле *field_name* недоступно для редактирования 
   * @return reason
  */
  
  @Schema(name = "reason", example = "already_exist", description = "Ошибки при создании или редактировании менеджера работодателя:   * `already_exist` — Менеджер с такой почтой уже существует   * `creation_limit_exceeded` — Достигнут лимит на создание менеджеров   * `not_editable` — Поле *field_name* недоступно для редактирования ", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("reason")
  public ReasonEnum getReason() {
    return reason;
  }

  public void setReason(ReasonEnum reason) {
    this.reason = reason;
  }

  public ErrorsEmployerManagerBadAuthorizationError type(TypeEnum type) {
    this.type = type;
    return this;
  }

  /**
   * Текстовый идентификатор типа ошибки
   * @return type
  */
  @NotNull 
  @Schema(name = "type", example = "oauth", description = "Текстовый идентификатор типа ошибки", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("type")
  public TypeEnum getType() {
    return type;
  }

  public void setType(TypeEnum type) {
    this.type = type;
  }

  public ErrorsEmployerManagerBadAuthorizationError value(ValueEnum value) {
    this.value = value;
    return this;
  }

  /**
   * Общие ошибки:   * `bad_authorization` — Токен авторизации не существует или не валидный   * `token_expired` — Время жизни access_token завершилось, необходимо [выполнить обновление access_token](#section/Avtorizaciya/Obnovlenie-pary-access-i-refresh-tokenov)   * `token_revoked` — Токен отозван пользователем или сервером, приложению необходимо [запросить новую авторизацию](#section/Tipy-avtorizacij)   * `application_not_found` — Ваше приложение было удалено   * `used_manager_account_forbidden` — [Рабочий аккаунт заблокирован](https://github.com/hhru/api/blob/master/docs/errors.md#manager-accounts-blocked)   * `manager_extra_account_not_found` — В заголовке передан некорректный id аккаунта   * `email` — Менеджер с такой почтой уже существует   * `user_auth_expected` — Ожидается авторизация пользователя, передана авторизация приложения   * `manager_type` — Поле manager_type недоступно для редактирования   * `area` — Поле area недоступно для редактирования   * `last_name` — Поле lastName недоступно для редактирования   * `first_name` — Поле firstName недоступно для редактирования   * `middle_name` — Поле middleName недоступно для редактирования 
   * @return value
  */
  
  @Schema(name = "value", example = "bad_authorization", description = "Общие ошибки:   * `bad_authorization` — Токен авторизации не существует или не валидный   * `token_expired` — Время жизни access_token завершилось, необходимо [выполнить обновление access_token](#section/Avtorizaciya/Obnovlenie-pary-access-i-refresh-tokenov)   * `token_revoked` — Токен отозван пользователем или сервером, приложению необходимо [запросить новую авторизацию](#section/Tipy-avtorizacij)   * `application_not_found` — Ваше приложение было удалено   * `used_manager_account_forbidden` — [Рабочий аккаунт заблокирован](https://github.com/hhru/api/blob/master/docs/errors.md#manager-accounts-blocked)   * `manager_extra_account_not_found` — В заголовке передан некорректный id аккаунта   * `email` — Менеджер с такой почтой уже существует   * `user_auth_expected` — Ожидается авторизация пользователя, передана авторизация приложения   * `manager_type` — Поле manager_type недоступно для редактирования   * `area` — Поле area недоступно для редактирования   * `last_name` — Поле lastName недоступно для редактирования   * `first_name` — Поле firstName недоступно для редактирования   * `middle_name` — Поле middleName недоступно для редактирования ", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("value")
  public ValueEnum getValue() {
    return value;
  }

  public void setValue(ValueEnum value) {
    this.value = value;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ErrorsEmployerManagerBadAuthorizationError errorsEmployerManagerBadAuthorizationError = (ErrorsEmployerManagerBadAuthorizationError) o;
    return Objects.equals(this.allowedAccounts, errorsEmployerManagerBadAuthorizationError.allowedAccounts) &&
        Objects.equals(this.reason, errorsEmployerManagerBadAuthorizationError.reason) &&
        Objects.equals(this.type, errorsEmployerManagerBadAuthorizationError.type) &&
        Objects.equals(this.value, errorsEmployerManagerBadAuthorizationError.value);
  }

  @Override
  public int hashCode() {
    return Objects.hash(allowedAccounts, reason, type, value);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ErrorsEmployerManagerBadAuthorizationError {\n");
    sb.append("    allowedAccounts: ").append(toIndentedString(allowedAccounts)).append("\n");
    sb.append("    reason: ").append(toIndentedString(reason)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    value: ").append(toIndentedString(value)).append("\n");
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

