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

@Schema(name = "ErrorsCommonConflictBothChangedErrors", description = "Информация о возникших ошибках")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2025-08-17T15:41:09.394389505+05:00[Asia/Yekaterinburg]", comments = "Generator version: 7.6.0")
public class ErrorsCommonConflictBothChangedErrors {

  private String requestId;

  /**
   * Имя аргумента, с которым связана ошибка
   */
  public enum BadArgumentEnum {
    NAME("name"),
    
    SUBSCRIPTION("subscription");

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

  private BadArgumentEnum badArgument;

  @Valid
  private List<@Valid IncludesNameDescription> badArguments = new ArrayList<>();

  private String description;

  @Valid
  private List<@Valid ErrorsCommonConflictBothChangedError> errors = new ArrayList<>();

  public ErrorsCommonConflictBothChangedErrors() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public ErrorsCommonConflictBothChangedErrors(String requestId, List<@Valid ErrorsCommonConflictBothChangedError> errors) {
    this.requestId = requestId;
    this.errors = errors;
  }

  public ErrorsCommonConflictBothChangedErrors requestId(String requestId) {
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

  public ErrorsCommonConflictBothChangedErrors badArgument(BadArgumentEnum badArgument) {
    this.badArgument = badArgument;
    return this;
  }

  /**
   * Имя аргумента, с которым связана ошибка
   * @return badArgument
  */
  
  @Schema(name = "bad_argument", description = "Имя аргумента, с которым связана ошибка", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("bad_argument")
  public BadArgumentEnum getBadArgument() {
    return badArgument;
  }

  public void setBadArgument(BadArgumentEnum badArgument) {
    this.badArgument = badArgument;
  }

  public ErrorsCommonConflictBothChangedErrors badArguments(List<@Valid IncludesNameDescription> badArguments) {
    this.badArguments = badArguments;
    return this;
  }

  public ErrorsCommonConflictBothChangedErrors addBadArgumentsItem(IncludesNameDescription badArgumentsItem) {
    if (this.badArguments == null) {
      this.badArguments = new ArrayList<>();
    }
    this.badArguments.add(badArgumentsItem);
    return this;
  }

  /**
   * Список аргументов, с которыми связаны ошибки
   * @return badArguments
  */
  @Valid 
  @Schema(name = "bad_arguments", description = "Список аргументов, с которыми связаны ошибки", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("bad_arguments")
  public List<@Valid IncludesNameDescription> getBadArguments() {
    return badArguments;
  }

  public void setBadArguments(List<@Valid IncludesNameDescription> badArguments) {
    this.badArguments = badArguments;
  }

  public ErrorsCommonConflictBothChangedErrors description(String description) {
    this.description = description;
    return this;
  }

  /**
   * Описание причины ошибки
   * @return description
  */
  
  @Schema(name = "description", description = "Описание причины ошибки", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("description")
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public ErrorsCommonConflictBothChangedErrors errors(List<@Valid ErrorsCommonConflictBothChangedError> errors) {
    this.errors = errors;
    return this;
  }

  public ErrorsCommonConflictBothChangedErrors addErrorsItem(ErrorsCommonConflictBothChangedError errorsItem) {
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
  public List<@Valid ErrorsCommonConflictBothChangedError> getErrors() {
    return errors;
  }

  public void setErrors(List<@Valid ErrorsCommonConflictBothChangedError> errors) {
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
    ErrorsCommonConflictBothChangedErrors errorsCommonConflictBothChangedErrors = (ErrorsCommonConflictBothChangedErrors) o;
    return Objects.equals(this.requestId, errorsCommonConflictBothChangedErrors.requestId) &&
        Objects.equals(this.badArgument, errorsCommonConflictBothChangedErrors.badArgument) &&
        Objects.equals(this.badArguments, errorsCommonConflictBothChangedErrors.badArguments) &&
        Objects.equals(this.description, errorsCommonConflictBothChangedErrors.description) &&
        Objects.equals(this.errors, errorsCommonConflictBothChangedErrors.errors);
  }

  @Override
  public int hashCode() {
    return Objects.hash(requestId, badArgument, badArguments, description, errors);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ErrorsCommonConflictBothChangedErrors {\n");
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

