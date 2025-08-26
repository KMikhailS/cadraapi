package ru.brobrocode.cadra.client.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.annotation.Generated;
import jakarta.validation.constraints.NotNull;

import java.util.Objects;

/**
 * ErrorsCommonBadAuthorizationUnsupportedGrantTypeError
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2025-08-17T15:41:09.394389505+05:00[Asia/Yekaterinburg]", comments = "Generator version: 7.6.0")
public class ErrorsCommonBadAuthorizationUnsupportedGrantTypeError implements ErrorsCommonBadAuthorizationBadParameters {

  /**
   * Идентификатор типа ошибки, используются значения, описанные в [документе RFC 6749](https://datatracker.ietf.org/doc/html/rfc6749#section-5.2) 
   */
  public enum ErrorEnum {
    UNSUPPORTED_GRANT_TYPE("unsupported_grant_type");

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
   * Дополнительное описание ошибки * `unsupported grant_type` Возникает, если передать неправильное значение в поле `grant_type` 
   */
  public enum ErrorDescriptionEnum {
    UNSUPPORTED_GRANT_TYPE("unsupported grant_type");

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

  public ErrorsCommonBadAuthorizationUnsupportedGrantTypeError() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public ErrorsCommonBadAuthorizationUnsupportedGrantTypeError(ErrorEnum error, ErrorDescriptionEnum errorDescription) {
    this.error = error;
    this.errorDescription = errorDescription;
  }

  public ErrorsCommonBadAuthorizationUnsupportedGrantTypeError error(ErrorEnum error) {
    this.error = error;
    return this;
  }

  /**
   * Идентификатор типа ошибки, используются значения, описанные в [документе RFC 6749](https://datatracker.ietf.org/doc/html/rfc6749#section-5.2) 
   * @return error
  */
  @NotNull 
  @Schema(name = "error", example = "unsupported_grant_type", description = "Идентификатор типа ошибки, используются значения, описанные в [документе RFC 6749](https://datatracker.ietf.org/doc/html/rfc6749#section-5.2) ", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("error")
  public ErrorEnum getError() {
    return error;
  }

  public void setError(ErrorEnum error) {
    this.error = error;
  }

  public ErrorsCommonBadAuthorizationUnsupportedGrantTypeError errorDescription(ErrorDescriptionEnum errorDescription) {
    this.errorDescription = errorDescription;
    return this;
  }

  /**
   * Дополнительное описание ошибки * `unsupported grant_type` Возникает, если передать неправильное значение в поле `grant_type` 
   * @return errorDescription
  */
  @NotNull 
  @Schema(name = "error_description", example = "unsupported grant_type", description = "Дополнительное описание ошибки * `unsupported grant_type` Возникает, если передать неправильное значение в поле `grant_type` ", requiredMode = Schema.RequiredMode.REQUIRED)
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
    ErrorsCommonBadAuthorizationUnsupportedGrantTypeError errorsCommonBadAuthorizationUnsupportedGrantTypeError = (ErrorsCommonBadAuthorizationUnsupportedGrantTypeError) o;
    return Objects.equals(this.error, errorsCommonBadAuthorizationUnsupportedGrantTypeError.error) &&
        Objects.equals(this.errorDescription, errorsCommonBadAuthorizationUnsupportedGrantTypeError.errorDescription);
  }

  @Override
  public int hashCode() {
    return Objects.hash(error, errorDescription);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ErrorsCommonBadAuthorizationUnsupportedGrantTypeError {\n");
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

