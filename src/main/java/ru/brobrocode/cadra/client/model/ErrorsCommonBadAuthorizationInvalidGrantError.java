package ru.brobrocode.cadra.client.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.annotation.Generated;
import jakarta.validation.constraints.NotNull;

import java.util.Objects;

/**
 * ErrorsCommonBadAuthorizationInvalidGrantError
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2025-08-17T15:41:09.394389505+05:00[Asia/Yekaterinburg]", comments = "Generator version: 7.6.0")
public class ErrorsCommonBadAuthorizationInvalidGrantError implements ErrorsCommonBadAuthorizationBadParameters {

  /**
   * Идентификатор типа ошибки, используются значения, описанные в [документе RFC 6749](https://datatracker.ietf.org/doc/html/rfc6749#section-5.2) 
   */
  public enum ErrorEnum {
    INVALID_GRANT("invalid_grant");

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
   * Дополнительное описание ошибки * `token has already been refreshed` Ошибка возникает при попытке воспользоваться refresh-токеном второй раз * `token not expired` Ошибка возникает при попытке обновить действующий access-токен. access-токен можно обновлять только после того, как он истек * `token was revoked` Токен был отозван. Например, токен отзывается, если время действия пароля истекло * `bad token ` Передано неправильное значение токена * `code has already been used` `authorization_code` уже был использован (его можно использовать только один раз) * `code expired` `authorization_code` истек * `code was revoke` `authorization_code` был отозван (это происходит, если время действия пароля истекло) * `token deactivated ` Токен был деактивирован. Токен деактивируется после того, как пользователь сменил пароль 
   */
  public enum ErrorDescriptionEnum {
    TOKEN_HAS_ALREADY_BEEN_REFRESHED("token has already been refreshed"),
    
    TOKEN_NOT_EXPIRED("token not expired"),
    
    TOKEN_WAS_REVOKED("token was revoked"),
    
    BAD_TOKEN("bad token"),
    
    CODE_HAS_ALREADY_BEEN_USED("code has already been used"),
    
    CODE_EXPIRED("code expired"),
    
    CODE_WAS_REVOKE("code was revoke"),
    
    TOKEN_DEACTIVATED("token deactivated");

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

  public ErrorsCommonBadAuthorizationInvalidGrantError() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public ErrorsCommonBadAuthorizationInvalidGrantError(ErrorEnum error, ErrorDescriptionEnum errorDescription) {
    this.error = error;
    this.errorDescription = errorDescription;
  }

  public ErrorsCommonBadAuthorizationInvalidGrantError error(ErrorEnum error) {
    this.error = error;
    return this;
  }

  /**
   * Идентификатор типа ошибки, используются значения, описанные в [документе RFC 6749](https://datatracker.ietf.org/doc/html/rfc6749#section-5.2) 
   * @return error
  */
  @NotNull 
  @Schema(name = "error", example = "invalid_grant", description = "Идентификатор типа ошибки, используются значения, описанные в [документе RFC 6749](https://datatracker.ietf.org/doc/html/rfc6749#section-5.2) ", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("error")
  public ErrorEnum getError() {
    return error;
  }

  public void setError(ErrorEnum error) {
    this.error = error;
  }

  public ErrorsCommonBadAuthorizationInvalidGrantError errorDescription(ErrorDescriptionEnum errorDescription) {
    this.errorDescription = errorDescription;
    return this;
  }

  /**
   * Дополнительное описание ошибки * `token has already been refreshed` Ошибка возникает при попытке воспользоваться refresh-токеном второй раз * `token not expired` Ошибка возникает при попытке обновить действующий access-токен. access-токен можно обновлять только после того, как он истек * `token was revoked` Токен был отозван. Например, токен отзывается, если время действия пароля истекло * `bad token ` Передано неправильное значение токена * `code has already been used` `authorization_code` уже был использован (его можно использовать только один раз) * `code expired` `authorization_code` истек * `code was revoke` `authorization_code` был отозван (это происходит, если время действия пароля истекло) * `token deactivated ` Токен был деактивирован. Токен деактивируется после того, как пользователь сменил пароль 
   * @return errorDescription
  */
  @NotNull 
  @Schema(name = "error_description", example = "token not expired", description = "Дополнительное описание ошибки * `token has already been refreshed` Ошибка возникает при попытке воспользоваться refresh-токеном второй раз * `token not expired` Ошибка возникает при попытке обновить действующий access-токен. access-токен можно обновлять только после того, как он истек * `token was revoked` Токен был отозван. Например, токен отзывается, если время действия пароля истекло * `bad token ` Передано неправильное значение токена * `code has already been used` `authorization_code` уже был использован (его можно использовать только один раз) * `code expired` `authorization_code` истек * `code was revoke` `authorization_code` был отозван (это происходит, если время действия пароля истекло) * `token deactivated ` Токен был деактивирован. Токен деактивируется после того, как пользователь сменил пароль ", requiredMode = Schema.RequiredMode.REQUIRED)
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
    ErrorsCommonBadAuthorizationInvalidGrantError errorsCommonBadAuthorizationInvalidGrantError = (ErrorsCommonBadAuthorizationInvalidGrantError) o;
    return Objects.equals(this.error, errorsCommonBadAuthorizationInvalidGrantError.error) &&
        Objects.equals(this.errorDescription, errorsCommonBadAuthorizationInvalidGrantError.errorDescription);
  }

  @Override
  public int hashCode() {
    return Objects.hash(error, errorDescription);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ErrorsCommonBadAuthorizationInvalidGrantError {\n");
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

