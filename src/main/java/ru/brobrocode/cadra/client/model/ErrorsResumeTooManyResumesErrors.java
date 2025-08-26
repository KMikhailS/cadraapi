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

@Schema(name = "ErrorsResumeTooManyResumesErrors", description = "Информация о возникших ошибках")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2025-08-17T15:41:09.394389505+05:00[Asia/Yekaterinburg]", comments = "Generator version: 7.6.0")
public class ErrorsResumeTooManyResumesErrors {

  private String requestId;

  @Deprecated
  private String description;

  @Valid
  private List<@Valid ErrorsResumeTooManyResumesError> errors = new ArrayList<>();

  public ErrorsResumeTooManyResumesErrors() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public ErrorsResumeTooManyResumesErrors(String requestId, List<@Valid ErrorsResumeTooManyResumesError> errors) {
    this.requestId = requestId;
    this.errors = errors;
  }

  public ErrorsResumeTooManyResumesErrors requestId(String requestId) {
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

  public ErrorsResumeTooManyResumesErrors description(String description) {
    this.description = description;
    return this;
  }

  /**
   * Описание ошибки
   * @return description
   * @deprecated
  */
  
  @Schema(name = "description", description = "Описание ошибки", deprecated = true, requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("description")
  @Deprecated
  public String getDescription() {
    return description;
  }

  /**
   * @deprecated
  */
  @Deprecated
  public void setDescription(String description) {
    this.description = description;
  }

  public ErrorsResumeTooManyResumesErrors errors(List<@Valid ErrorsResumeTooManyResumesError> errors) {
    this.errors = errors;
    return this;
  }

  public ErrorsResumeTooManyResumesErrors addErrorsItem(ErrorsResumeTooManyResumesError errorsItem) {
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
  public List<@Valid ErrorsResumeTooManyResumesError> getErrors() {
    return errors;
  }

  public void setErrors(List<@Valid ErrorsResumeTooManyResumesError> errors) {
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
    ErrorsResumeTooManyResumesErrors errorsResumeTooManyResumesErrors = (ErrorsResumeTooManyResumesErrors) o;
    return Objects.equals(this.requestId, errorsResumeTooManyResumesErrors.requestId) &&
        Objects.equals(this.description, errorsResumeTooManyResumesErrors.description) &&
        Objects.equals(this.errors, errorsResumeTooManyResumesErrors.errors);
  }

  @Override
  public int hashCode() {
    return Objects.hash(requestId, description, errors);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ErrorsResumeTooManyResumesErrors {\n");
    sb.append("    requestId: ").append(toIndentedString(requestId)).append("\n");
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

