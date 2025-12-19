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
 * Информация о возникших ошибках
 */

@Schema(name = "ErrorsEmployerManagerBadArgumentErrors", description = "Информация о возникших ошибках")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2025-08-17T15:41:09.394389505+05:00[Asia/Yekaterinburg]", comments = "Generator version: 7.6.0")
public class ErrorsEmployerManagerBadArgumentErrors implements ErrorsEmployerManagerBadRequestAndBadArgumentErrors {

  private String requestId;

  @Valid
  private List<@Valid ErrorsEmployerManagerBadArgumentError> errors = new ArrayList<>();

  public ErrorsEmployerManagerBadArgumentErrors() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public ErrorsEmployerManagerBadArgumentErrors(String requestId, List<@Valid ErrorsEmployerManagerBadArgumentError> errors) {
    this.requestId = requestId;
    this.errors = errors;
  }

  public ErrorsEmployerManagerBadArgumentErrors requestId(String requestId) {
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

  public ErrorsEmployerManagerBadArgumentErrors errors(List<@Valid ErrorsEmployerManagerBadArgumentError> errors) {
    this.errors = errors;
    return this;
  }

  public ErrorsEmployerManagerBadArgumentErrors addErrorsItem(ErrorsEmployerManagerBadArgumentError errorsItem) {
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
  public List<@Valid ErrorsEmployerManagerBadArgumentError> getErrors() {
    return errors;
  }

  public void setErrors(List<@Valid ErrorsEmployerManagerBadArgumentError> errors) {
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
    ErrorsEmployerManagerBadArgumentErrors errorsEmployerManagerBadArgumentErrors = (ErrorsEmployerManagerBadArgumentErrors) o;
    return Objects.equals(this.requestId, errorsEmployerManagerBadArgumentErrors.requestId) &&
        Objects.equals(this.errors, errorsEmployerManagerBadArgumentErrors.errors);
  }

  @Override
  public int hashCode() {
    return Objects.hash(requestId, errors);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ErrorsEmployerManagerBadArgumentErrors {\n");
    sb.append("    requestId: ").append(toIndentedString(requestId)).append("\n");
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

