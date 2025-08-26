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
 * ErrorsNegotiationEditMessageForbiddenErrors
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2025-08-17T15:41:09.394389505+05:00[Asia/Yekaterinburg]", comments = "Generator version: 7.6.0")
public class ErrorsNegotiationEditMessageForbiddenErrors {

  private String requestId;

  private String description;

  @Valid
  private List<@Valid ErrorsNegotiationEditMessageError> errors = new ArrayList<>();

  /**
   * Ошибки авторизации:   * `token-revoked` — Токен отозван пользователем или сервером, приложению необходимо [запросить новую авторизацию](#tag/Avtorizaciya-rabotodatelya/operation/authorize)   * `token-expired` — Время жизни `access_token` завершилось, необходимо [получить `refresh_token`](#tag/Avtorizaciya-rabotodatelya/operation/authorize)   * `bad-auth-type` — Некорректный токен   * `client-id-deleted` — Приложение удалено. Токен не действителен 
   */
  public enum OauthErrorEnum {
    TOKEN_REVOKED("token-revoked"),
    
    TOKEN_EXPIRED("token-expired"),
    
    BAD_AUTH_TYPE("bad-auth-type"),
    
    CLIENT_ID_DELETED("client-id-deleted");

    private String value;

    OauthErrorEnum(String value) {
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
    public static OauthErrorEnum fromValue(String value) {
      for (OauthErrorEnum b : OauthErrorEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  private OauthErrorEnum oauthError;

  public ErrorsNegotiationEditMessageForbiddenErrors() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public ErrorsNegotiationEditMessageForbiddenErrors(String requestId, List<@Valid ErrorsNegotiationEditMessageError> errors) {
    this.requestId = requestId;
    this.errors = errors;
  }

  public ErrorsNegotiationEditMessageForbiddenErrors requestId(String requestId) {
    this.requestId = requestId;
    return this;
  }

  /**
   * Идентификатор запроса
   * @return requestId
  */
  @NotNull 
  @Schema(name = "request_id", example = "q1ww2e2r4ty", description = "Идентификатор запроса", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("request_id")
  public String getRequestId() {
    return requestId;
  }

  public void setRequestId(String requestId) {
    this.requestId = requestId;
  }

  public ErrorsNegotiationEditMessageForbiddenErrors description(String description) {
    this.description = description;
    return this;
  }

  /**
   * Описание ошибок
   * @return description
  */
  
  @Schema(name = "description", description = "Описание ошибок", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("description")
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public ErrorsNegotiationEditMessageForbiddenErrors errors(List<@Valid ErrorsNegotiationEditMessageError> errors) {
    this.errors = errors;
    return this;
  }

  public ErrorsNegotiationEditMessageForbiddenErrors addErrorsItem(ErrorsNegotiationEditMessageError errorsItem) {
    if (this.errors == null) {
      this.errors = new ArrayList<>();
    }
    this.errors.add(errorsItem);
    return this;
  }

  /**
   * Массив с данными ошибок
   * @return errors
  */
  @NotNull @Valid @Size(min = 1) 
  @Schema(name = "errors", description = "Массив с данными ошибок", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("errors")
  public List<@Valid ErrorsNegotiationEditMessageError> getErrors() {
    return errors;
  }

  public void setErrors(List<@Valid ErrorsNegotiationEditMessageError> errors) {
    this.errors = errors;
  }

  public ErrorsNegotiationEditMessageForbiddenErrors oauthError(OauthErrorEnum oauthError) {
    this.oauthError = oauthError;
    return this;
  }

  /**
   * Ошибки авторизации:   * `token-revoked` — Токен отозван пользователем или сервером, приложению необходимо [запросить новую авторизацию](#tag/Avtorizaciya-rabotodatelya/operation/authorize)   * `token-expired` — Время жизни `access_token` завершилось, необходимо [получить `refresh_token`](#tag/Avtorizaciya-rabotodatelya/operation/authorize)   * `bad-auth-type` — Некорректный токен   * `client-id-deleted` — Приложение удалено. Токен не действителен 
   * @return oauthError
  */
  
  @Schema(name = "oauth_error", example = "token-revoked", description = "Ошибки авторизации:   * `token-revoked` — Токен отозван пользователем или сервером, приложению необходимо [запросить новую авторизацию](#tag/Avtorizaciya-rabotodatelya/operation/authorize)   * `token-expired` — Время жизни `access_token` завершилось, необходимо [получить `refresh_token`](#tag/Avtorizaciya-rabotodatelya/operation/authorize)   * `bad-auth-type` — Некорректный токен   * `client-id-deleted` — Приложение удалено. Токен не действителен ", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("oauth_error")
  public OauthErrorEnum getOauthError() {
    return oauthError;
  }

  public void setOauthError(OauthErrorEnum oauthError) {
    this.oauthError = oauthError;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ErrorsNegotiationEditMessageForbiddenErrors errorsNegotiationEditMessageForbiddenErrors = (ErrorsNegotiationEditMessageForbiddenErrors) o;
    return Objects.equals(this.requestId, errorsNegotiationEditMessageForbiddenErrors.requestId) &&
        Objects.equals(this.description, errorsNegotiationEditMessageForbiddenErrors.description) &&
        Objects.equals(this.errors, errorsNegotiationEditMessageForbiddenErrors.errors) &&
        Objects.equals(this.oauthError, errorsNegotiationEditMessageForbiddenErrors.oauthError);
  }

  @Override
  public int hashCode() {
    return Objects.hash(requestId, description, errors, oauthError);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ErrorsNegotiationEditMessageForbiddenErrors {\n");
    sb.append("    requestId: ").append(toIndentedString(requestId)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    errors: ").append(toIndentedString(errors)).append("\n");
    sb.append("    oauthError: ").append(toIndentedString(oauthError)).append("\n");
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

