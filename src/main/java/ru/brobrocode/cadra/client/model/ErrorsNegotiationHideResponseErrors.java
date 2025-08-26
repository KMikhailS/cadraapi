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

@Schema(name = "ErrorsNegotiationHideResponseErrors", description = "Информация о возникших ошибках")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2025-08-17T15:41:09.394389505+05:00[Asia/Yekaterinburg]", comments = "Generator version: 7.6.0")
public class ErrorsNegotiationHideResponseErrors {

  private String requestId;

  @Valid
  private List<@Valid ErrorsNegotiationHideResponseError> errors = new ArrayList<>();

  public ErrorsNegotiationHideResponseErrors() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public ErrorsNegotiationHideResponseErrors(String requestId, List<@Valid ErrorsNegotiationHideResponseError> errors) {
    this.requestId = requestId;
    this.errors = errors;
  }

  public ErrorsNegotiationHideResponseErrors requestId(String requestId) {
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

  public ErrorsNegotiationHideResponseErrors errors(List<@Valid ErrorsNegotiationHideResponseError> errors) {
    this.errors = errors;
    return this;
  }

  public ErrorsNegotiationHideResponseErrors addErrorsItem(ErrorsNegotiationHideResponseError errorsItem) {
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
  public List<@Valid ErrorsNegotiationHideResponseError> getErrors() {
    return errors;
  }

  public void setErrors(List<@Valid ErrorsNegotiationHideResponseError> errors) {
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
    ErrorsNegotiationHideResponseErrors errorsNegotiationHideResponseErrors = (ErrorsNegotiationHideResponseErrors) o;
    return Objects.equals(this.requestId, errorsNegotiationHideResponseErrors.requestId) &&
        Objects.equals(this.errors, errorsNegotiationHideResponseErrors.errors);
  }

  @Override
  public int hashCode() {
    return Objects.hash(requestId, errors);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ErrorsNegotiationHideResponseErrors {\n");
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

