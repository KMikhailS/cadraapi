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
 * Информация о возникших ошибках
 */

@Schema(name = "ErrorsVacancyApplyForbiddenErrors", description = "Информация о возникших ошибках")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2025-08-17T15:41:09.394389505+05:00[Asia/Yekaterinburg]", comments = "Generator version: 7.6.0")
public class ErrorsVacancyApplyForbiddenErrors implements ErrorsNegotiationNegotiationsBadAuthorizationErrors {

  private String requestId;

  /**
   * Gets or Sets badArgument
   */
  public enum BadArgumentEnum {
    VACANCY_ID("vacancy_id"),
    
    RESUME_ID("resume_id");

    private String value;

    BadArgumentEnum(String value) {
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
    public static BadArgumentEnum fromValue(String value) {
      for (BadArgumentEnum b : BadArgumentEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  @Deprecated
  private BadArgumentEnum badArgument;

  @Deprecated
  @Valid
  private List<@Valid ErrorsVacancyApplyForbiddenErrorsAllOfBadArguments> badArguments = new ArrayList<>();

  private String description;

  @Valid
  private List<@Valid ErrorsVacancyApplyForbiddenError> errors = new ArrayList<>();

  public ErrorsVacancyApplyForbiddenErrors() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public ErrorsVacancyApplyForbiddenErrors(String requestId, List<@Valid ErrorsVacancyApplyForbiddenError> errors) {
    this.requestId = requestId;
    this.errors = errors;
  }

  public ErrorsVacancyApplyForbiddenErrors requestId(String requestId) {
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

  public ErrorsVacancyApplyForbiddenErrors badArgument(BadArgumentEnum badArgument) {
    this.badArgument = badArgument;
    return this;
  }

  /**
   * Get badArgument
   * @return badArgument
   * @deprecated
  */
  
  @Schema(name = "bad_argument", deprecated = true, requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("bad_argument")
  @Deprecated
  public BadArgumentEnum getBadArgument() {
    return badArgument;
  }

  /**
   * @deprecated
  */
  @Deprecated
  public void setBadArgument(BadArgumentEnum badArgument) {
    this.badArgument = badArgument;
  }

  public ErrorsVacancyApplyForbiddenErrors badArguments(List<@Valid ErrorsVacancyApplyForbiddenErrorsAllOfBadArguments> badArguments) {
    this.badArguments = badArguments;
    return this;
  }

  public ErrorsVacancyApplyForbiddenErrors addBadArgumentsItem(ErrorsVacancyApplyForbiddenErrorsAllOfBadArguments badArgumentsItem) {
    if (this.badArguments == null) {
      this.badArguments = new ArrayList<>();
    }
    this.badArguments.add(badArgumentsItem);
    return this;
  }

  /**
   * Get badArguments
   * @return badArguments
   * @deprecated
  */
  @Valid 
  @Schema(name = "bad_arguments", deprecated = true, requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("bad_arguments")
  @Deprecated
  public List<@Valid ErrorsVacancyApplyForbiddenErrorsAllOfBadArguments> getBadArguments() {
    return badArguments;
  }

  /**
   * @deprecated
  */
  @Deprecated
  public void setBadArguments(List<@Valid ErrorsVacancyApplyForbiddenErrorsAllOfBadArguments> badArguments) {
    this.badArguments = badArguments;
  }

  public ErrorsVacancyApplyForbiddenErrors description(String description) {
    this.description = description;
    return this;
  }

  /**
   * Описание ошибки
   * @return description
  */
  
  @Schema(name = "description", example = "Forbidden", description = "Описание ошибки", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("description")
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public ErrorsVacancyApplyForbiddenErrors errors(List<@Valid ErrorsVacancyApplyForbiddenError> errors) {
    this.errors = errors;
    return this;
  }

  public ErrorsVacancyApplyForbiddenErrors addErrorsItem(ErrorsVacancyApplyForbiddenError errorsItem) {
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
  public List<@Valid ErrorsVacancyApplyForbiddenError> getErrors() {
    return errors;
  }

  public void setErrors(List<@Valid ErrorsVacancyApplyForbiddenError> errors) {
    this.errors = errors;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ErrorsVacancyApplyForbiddenErrors errorsVacancyApplyForbiddenErrors = (ErrorsVacancyApplyForbiddenErrors) o;
    return Objects.equals(this.requestId, errorsVacancyApplyForbiddenErrors.requestId) &&
        Objects.equals(this.badArgument, errorsVacancyApplyForbiddenErrors.badArgument) &&
        Objects.equals(this.badArguments, errorsVacancyApplyForbiddenErrors.badArguments) &&
        Objects.equals(this.description, errorsVacancyApplyForbiddenErrors.description) &&
        Objects.equals(this.errors, errorsVacancyApplyForbiddenErrors.errors);
  }

  @Override
  public int hashCode() {
    return Objects.hash(requestId, badArgument, badArguments, description, errors);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ErrorsVacancyApplyForbiddenErrors {\n");
    sb.append("    requestId: ").append(toIndentedString(requestId)).append("\n");
    sb.append("    badArgument: ").append(toIndentedString(badArgument)).append("\n");
    sb.append("    badArguments: ").append(toIndentedString(badArguments)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    errors: ").append(toIndentedString(errors)).append("\n");
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

