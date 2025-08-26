package ru.brobrocode.cadra.client.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.annotation.Generated;
import jakarta.validation.constraints.NotNull;

import java.util.Objects;

/**
 * ErrorsCommonBadAuthorizationInvalidRequestError
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2025-08-17T15:41:09.394389505+05:00[Asia/Yekaterinburg]", comments = "Generator version: 7.6.0")
public class ErrorsCommonBadAuthorizationInvalidRequestError implements ErrorsCommonBadAuthorizationBadParameters {

  /**
   * Идентификатор типа ошибки, используются значения, описанные в [документе RFC 6749](https://datatracker.ietf.org/doc/html/rfc6749#section-5.2) 
   */
  public enum ErrorEnum {
    INVALID_REQUEST("invalid_request");

    private String value;

    ErrorEnum(String value) {
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
    public static ErrorEnum fromValue(String value) {
      for (ErrorEnum b : ErrorEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  private ErrorEnum error;

  /**
   * Дополнительное описание ошибки * `account not found` Ошибка может возникнуть, если передана неправильная пара `client_id` и `client_secret` * `account is locked` Пользовательский аккаунт заблокирован. Пользователь должен обратиться в службу поддержки сайта * `password invalidated` Пароль от пользовательского аккаунта устарел. Пользователь должен восстановить пароль на сайте `https://hh.ru` * `login not verified` Пользовательский аккаунт не подтвержден. Пользователь должен обратиться в службу поддержки сайта * `bad redirect url` передан неправильный `redirect_url` * `token is empty` Не передан `refresh_token` * `token not found` передан не правильный `refresh_token` * `code not found ` переданный `authorization_code` не найден 
   */
  public enum ErrorDescriptionEnum {
    ACCOUNT_NOT_FOUND("account not found"),
    
    ACCOUNT_IS_LOCKED("account is locked"),
    
    PASSWORD_INVALIDATED("password invalidated"),
    
    LOGIN_NOT_VERIFIED("login not verified"),
    
    BAD_REDIRECT_URL("bad redirect url"),
    
    TOKEN_IS_EMPTY("token is empty"),
    
    TOKEN_NOT_FOUND("token not found"),
    
    CODE_NOT_FOUND("code not found");

    private String value;

    ErrorDescriptionEnum(String value) {
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
    public static ErrorDescriptionEnum fromValue(String value) {
      for (ErrorDescriptionEnum b : ErrorDescriptionEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  private ErrorDescriptionEnum errorDescription;

  public ErrorsCommonBadAuthorizationInvalidRequestError() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public ErrorsCommonBadAuthorizationInvalidRequestError(ErrorEnum error, ErrorDescriptionEnum errorDescription) {
    this.error = error;
    this.errorDescription = errorDescription;
  }

  public ErrorsCommonBadAuthorizationInvalidRequestError error(ErrorEnum error) {
    this.error = error;
    return this;
  }

  /**
   * Идентификатор типа ошибки, используются значения, описанные в [документе RFC 6749](https://datatracker.ietf.org/doc/html/rfc6749#section-5.2) 
   * @return error
  */
  @NotNull 
  @Schema(name = "error", example = "invalid_request", description = "Идентификатор типа ошибки, используются значения, описанные в [документе RFC 6749](https://datatracker.ietf.org/doc/html/rfc6749#section-5.2) ", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("error")
  public ErrorEnum getError() {
    return error;
  }

  public void setError(ErrorEnum error) {
    this.error = error;
  }

  public ErrorsCommonBadAuthorizationInvalidRequestError errorDescription(ErrorDescriptionEnum errorDescription) {
    this.errorDescription = errorDescription;
    return this;
  }

  /**
   * Дополнительное описание ошибки * `account not found` Ошибка может возникнуть, если передана неправильная пара `client_id` и `client_secret` * `account is locked` Пользовательский аккаунт заблокирован. Пользователь должен обратиться в службу поддержки сайта * `password invalidated` Пароль от пользовательского аккаунта устарел. Пользователь должен восстановить пароль на сайте `https://hh.ru` * `login not verified` Пользовательский аккаунт не подтвержден. Пользователь должен обратиться в службу поддержки сайта * `bad redirect url` передан неправильный `redirect_url` * `token is empty` Не передан `refresh_token` * `token not found` передан не правильный `refresh_token` * `code not found ` переданный `authorization_code` не найден 
   * @return errorDescription
  */
  @NotNull 
  @Schema(name = "error_description", example = "account not found", description = "Дополнительное описание ошибки * `account not found` Ошибка может возникнуть, если передана неправильная пара `client_id` и `client_secret` * `account is locked` Пользовательский аккаунт заблокирован. Пользователь должен обратиться в службу поддержки сайта * `password invalidated` Пароль от пользовательского аккаунта устарел. Пользователь должен восстановить пароль на сайте `https://hh.ru` * `login not verified` Пользовательский аккаунт не подтвержден. Пользователь должен обратиться в службу поддержки сайта * `bad redirect url` передан неправильный `redirect_url` * `token is empty` Не передан `refresh_token` * `token not found` передан не правильный `refresh_token` * `code not found ` переданный `authorization_code` не найден ", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("error_description")
  public ErrorDescriptionEnum getErrorDescription() {
    return errorDescription;
  }

  public void setErrorDescription(ErrorDescriptionEnum errorDescription) {
    this.errorDescription = errorDescription;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ErrorsCommonBadAuthorizationInvalidRequestError errorsCommonBadAuthorizationInvalidRequestError = (ErrorsCommonBadAuthorizationInvalidRequestError) o;
    return Objects.equals(this.error, errorsCommonBadAuthorizationInvalidRequestError.error) &&
        Objects.equals(this.errorDescription, errorsCommonBadAuthorizationInvalidRequestError.errorDescription);
  }

  @Override
  public int hashCode() {
    return Objects.hash(error, errorDescription);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ErrorsCommonBadAuthorizationInvalidRequestError {\n");
    sb.append("    error: ").append(toIndentedString(error)).append("\n");
    sb.append("    errorDescription: ").append(toIndentedString(errorDescription)).append("\n");
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

