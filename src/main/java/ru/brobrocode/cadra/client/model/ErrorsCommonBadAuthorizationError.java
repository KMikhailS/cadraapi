package ru.brobrocode.cadra.client.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.annotation.Generated;
import jakarta.validation.constraints.NotNull;

import java.util.Objects;

/**
 * ErrorsCommonBadAuthorizationError
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2025-08-17T15:41:09.394389505+05:00[Asia/Yekaterinburg]", comments = "Generator version: 7.6.0")
public class ErrorsCommonBadAuthorizationError {

  /**
   * Текстовый идентификатор типа ошибки
   */
  public enum TypeEnum {
    FORBIDDEN("forbidden"),
    
    OAUTH("oauth");

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
   * Общие ошибки:   * `bad_authorization` — Токен авторизации не существует или не валидный   * `token_expired` — Время жизни access_token завершилось, необходимо [выполнить обновление access_token](#section/Avtorizaciya/Obnovlenie-pary-access-i-refresh-tokenov)   * `token_revoked` — Токен отозван пользователем или сервером, приложению необходимо [запросить новую авторизацию](#section/Tipy-avtorizacij)   * `application_not_found` — Ваше приложение было удалено   * `user_auth_expected` — Передана авторизация приложения, метод требует [авторизации пользователя](#get-auth)   * `application_auth_expected` — Передана авторизация пользователя, метод требует [авторизации приложения](#get-client-auth)   * `used_manager_account_forbidden` — [Рабочий аккаунт заблокирован](https://github.com/hhru/api/blob/master/docs/errors.md#manager-accounts-blocked)   * `manager_extra_account_not_found` — В заголовке передан некорректный id аккаунта   * `user_auth_expected` — Передана авторизация приложения, метод требует [авторизации пользователя](#section/Avtorizaciya/Avtorizaciya-polzovatelya)   * `application_auth_expected` — Передана авторизация пользователя, метод требует [авторизации приложения](##section/Avtorizaciya/Avtorizaciya-prilozheniya) 
   */
  public enum ValueEnum {
    BAD_AUTHORIZATION("bad_authorization"),
    
    TOKEN_EXPIRED("token_expired"),
    
    TOKEN_REVOKED("token_revoked"),
    
    APPLICATION_NOT_FOUND("application_not_found"),
    
    USER_AUTH_EXPECTED("user_auth_expected"),
    
    APPLICATION_AUTH_EXPECTED("application_auth_expected");

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

  public ErrorsCommonBadAuthorizationError() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public ErrorsCommonBadAuthorizationError(TypeEnum type) {
    this.type = type;
  }

  public ErrorsCommonBadAuthorizationError type(TypeEnum type) {
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

  public ErrorsCommonBadAuthorizationError value(ValueEnum value) {
    this.value = value;
    return this;
  }

  /**
   * Общие ошибки:   * `bad_authorization` — Токен авторизации не существует или не валидный   * `token_expired` — Время жизни access_token завершилось, необходимо [выполнить обновление access_token](#section/Avtorizaciya/Obnovlenie-pary-access-i-refresh-tokenov)   * `token_revoked` — Токен отозван пользователем или сервером, приложению необходимо [запросить новую авторизацию](#section/Tipy-avtorizacij)   * `application_not_found` — Ваше приложение было удалено   * `user_auth_expected` — Передана авторизация приложения, метод требует [авторизации пользователя](#get-auth)   * `application_auth_expected` — Передана авторизация пользователя, метод требует [авторизации приложения](#get-client-auth)   * `used_manager_account_forbidden` — [Рабочий аккаунт заблокирован](https://github.com/hhru/api/blob/master/docs/errors.md#manager-accounts-blocked)   * `manager_extra_account_not_found` — В заголовке передан некорректный id аккаунта   * `user_auth_expected` — Передана авторизация приложения, метод требует [авторизации пользователя](#section/Avtorizaciya/Avtorizaciya-polzovatelya)   * `application_auth_expected` — Передана авторизация пользователя, метод требует [авторизации приложения](##section/Avtorizaciya/Avtorizaciya-prilozheniya) 
   * @return value
  */
  
  @Schema(name = "value", example = "bad_authorization", description = "Общие ошибки:   * `bad_authorization` — Токен авторизации не существует или не валидный   * `token_expired` — Время жизни access_token завершилось, необходимо [выполнить обновление access_token](#section/Avtorizaciya/Obnovlenie-pary-access-i-refresh-tokenov)   * `token_revoked` — Токен отозван пользователем или сервером, приложению необходимо [запросить новую авторизацию](#section/Tipy-avtorizacij)   * `application_not_found` — Ваше приложение было удалено   * `user_auth_expected` — Передана авторизация приложения, метод требует [авторизации пользователя](#get-auth)   * `application_auth_expected` — Передана авторизация пользователя, метод требует [авторизации приложения](#get-client-auth)   * `used_manager_account_forbidden` — [Рабочий аккаунт заблокирован](https://github.com/hhru/api/blob/master/docs/errors.md#manager-accounts-blocked)   * `manager_extra_account_not_found` — В заголовке передан некорректный id аккаунта   * `user_auth_expected` — Передана авторизация приложения, метод требует [авторизации пользователя](#section/Avtorizaciya/Avtorizaciya-polzovatelya)   * `application_auth_expected` — Передана авторизация пользователя, метод требует [авторизации приложения](##section/Avtorizaciya/Avtorizaciya-prilozheniya) ", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
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
    ErrorsCommonBadAuthorizationError errorsCommonBadAuthorizationError = (ErrorsCommonBadAuthorizationError) o;
    return Objects.equals(this.type, errorsCommonBadAuthorizationError.type) &&
        Objects.equals(this.value, errorsCommonBadAuthorizationError.value);
  }

  @Override
  public int hashCode() {
    return Objects.hash(type, value);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ErrorsCommonBadAuthorizationError {\n");
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

