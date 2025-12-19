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
 * ErrorsCommonBadAuthorizationEmployerError
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2025-08-17T15:41:09.394389505+05:00[Asia/Yekaterinburg]", comments = "Generator version: 7.6.0")
public class ErrorsCommonBadAuthorizationEmployerError {

  @Valid
  private List<@Valid ManagerAccount> allowedAccounts = new ArrayList<>();

  /**
   * Текстовый идентификатор типа ошибки
   */
  public enum TypeEnum {
    FORBIDDEN("forbidden"),
    
    OAUTH("oauth"),
    
    MANAGER_EXTRA_ACCOUNTS("manager_extra_accounts"),
    
    MANAGER_ACCOUNTS("manager_accounts"),
    
    NEGOTIATIONS("negotiations");

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
   * Общие ошибки:   * `bad_authorization` — Токен авторизации не существует или не валидный   * `token_expired` — Время жизни access_token завершилось, необходимо [выполнить обновление access_token](#refresh_token)   * `token_revoked` — Токен отозван пользователем или сервером, приложению необходимо [запросить новую авторизацию](#section/Tipy-avtorizacij)   * `application_not_found` — Ваше приложение было удалено   * `used_manager_account_forbidden` — [Рабочий аккаунт заблокирован](https://github.com/hhru/api/blob/master/docs/errors.md#manager-accounts-blocked)   * `manager_extra_account_not_found` — В заголовке передан некорректный id аккаунта   * `user_auth_expected` — Передана авторизация приложения, метод требует [авторизации пользователя](#get-auth)   * `application_auth_expected` — Передана авторизация пользователя, метод требует [авторизации приложения](#get-client-auth)   * `employer_on_additional_check_restricted` — Работодатель находится на доп.проверке 
   */
  public enum ValueEnum {
    BAD_AUTHORIZATION("bad_authorization"),
    
    TOKEN_EXPIRED("token_expired"),
    
    TOKEN_REVOKED("token_revoked"),
    
    APPLICATION_NOT_FOUND("application_not_found"),
    
    MANAGER_EXTRA_ACCOUNT_NOT_FOUND("manager_extra_account_not_found"),
    
    USED_MANAGER_ACCOUNT_FORBIDDEN("used_manager_account_forbidden"),
    
    USER_AUTH_EXPECTED("user_auth_expected"),
    
    APPLICATION_AUTH_EXPECTED("application_auth_expected"),
    
    EMPLOYER_ON_ADDITIONAL_CHECK_RESTRICTED("employer_on_additional_check_restricted");

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

  public ErrorsCommonBadAuthorizationEmployerError() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public ErrorsCommonBadAuthorizationEmployerError(TypeEnum type) {
    this.type = type;
  }

  public ErrorsCommonBadAuthorizationEmployerError allowedAccounts(List<@Valid ManagerAccount> allowedAccounts) {
    this.allowedAccounts = allowedAccounts;
    return this;
  }

  public ErrorsCommonBadAuthorizationEmployerError addAllowedAccountsItem(ManagerAccount allowedAccountsItem) {
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

  public ErrorsCommonBadAuthorizationEmployerError type(TypeEnum type) {
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

  public ErrorsCommonBadAuthorizationEmployerError value(ValueEnum value) {
    this.value = value;
    return this;
  }

  /**
   * Общие ошибки:   * `bad_authorization` — Токен авторизации не существует или не валидный   * `token_expired` — Время жизни access_token завершилось, необходимо [выполнить обновление access_token](#refresh_token)   * `token_revoked` — Токен отозван пользователем или сервером, приложению необходимо [запросить новую авторизацию](#section/Tipy-avtorizacij)   * `application_not_found` — Ваше приложение было удалено   * `used_manager_account_forbidden` — [Рабочий аккаунт заблокирован](https://github.com/hhru/api/blob/master/docs/errors.md#manager-accounts-blocked)   * `manager_extra_account_not_found` — В заголовке передан некорректный id аккаунта   * `user_auth_expected` — Передана авторизация приложения, метод требует [авторизации пользователя](#get-auth)   * `application_auth_expected` — Передана авторизация пользователя, метод требует [авторизации приложения](#get-client-auth)   * `employer_on_additional_check_restricted` — Работодатель находится на доп.проверке 
   * @return value
  */
  
  @Schema(name = "value", example = "bad_authorization", description = "Общие ошибки:   * `bad_authorization` — Токен авторизации не существует или не валидный   * `token_expired` — Время жизни access_token завершилось, необходимо [выполнить обновление access_token](#refresh_token)   * `token_revoked` — Токен отозван пользователем или сервером, приложению необходимо [запросить новую авторизацию](#section/Tipy-avtorizacij)   * `application_not_found` — Ваше приложение было удалено   * `used_manager_account_forbidden` — [Рабочий аккаунт заблокирован](https://github.com/hhru/api/blob/master/docs/errors.md#manager-accounts-blocked)   * `manager_extra_account_not_found` — В заголовке передан некорректный id аккаунта   * `user_auth_expected` — Передана авторизация приложения, метод требует [авторизации пользователя](#get-auth)   * `application_auth_expected` — Передана авторизация пользователя, метод требует [авторизации приложения](#get-client-auth)   * `employer_on_additional_check_restricted` — Работодатель находится на доп.проверке ", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
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
    ErrorsCommonBadAuthorizationEmployerError errorsCommonBadAuthorizationEmployerError = (ErrorsCommonBadAuthorizationEmployerError) o;
    return Objects.equals(this.allowedAccounts, errorsCommonBadAuthorizationEmployerError.allowedAccounts) &&
        Objects.equals(this.type, errorsCommonBadAuthorizationEmployerError.type) &&
        Objects.equals(this.value, errorsCommonBadAuthorizationEmployerError.value);
  }

  @Override
  public int hashCode() {
    return Objects.hash(allowedAccounts, type, value);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ErrorsCommonBadAuthorizationEmployerError {\n");
    sb.append("    allowedAccounts: ").append(toIndentedString(allowedAccounts)).append("\n");
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

