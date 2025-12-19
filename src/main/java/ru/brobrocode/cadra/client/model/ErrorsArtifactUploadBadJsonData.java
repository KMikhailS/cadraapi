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
 * ErrorsArtifactUploadBadJsonData
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2025-08-17T15:41:09.394389505+05:00[Asia/Yekaterinburg]", comments = "Generator version: 7.6.0")
public class ErrorsArtifactUploadBadJsonData {

  private String requestId;

  @Valid
  private List<@Valid ErrorsCommonBadArgumentError> errors = new ArrayList<>();

  @Deprecated
  private String badArgument;

  @Deprecated
  @Valid
  private List<@Valid ErrorsCommonBadJsonDataErrorsAllOfBadArguments> badArguments = new ArrayList<>();

  @Deprecated
  private String description;

  public ErrorsArtifactUploadBadJsonData() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public ErrorsArtifactUploadBadJsonData(String requestId, List<@Valid ErrorsCommonBadArgumentError> errors) {
    this.requestId = requestId;
    this.errors = errors;
  }

  public ErrorsArtifactUploadBadJsonData requestId(String requestId) {
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

  public ErrorsArtifactUploadBadJsonData errors(List<@Valid ErrorsCommonBadArgumentError> errors) {
    this.errors = errors;
    return this;
  }

  public ErrorsArtifactUploadBadJsonData addErrorsItem(ErrorsCommonBadArgumentError errorsItem) {
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
  public List<@Valid ErrorsCommonBadArgumentError> getErrors() {
    return errors;
  }

  public void setErrors(List<@Valid ErrorsCommonBadArgumentError> errors) {
    this.errors = errors;
  }

  public ErrorsArtifactUploadBadJsonData badArgument(String badArgument) {
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
  public String getBadArgument() {
    return badArgument;
  }

  /**
   * @deprecated
  */
  @Deprecated
  public void setBadArgument(String badArgument) {
    this.badArgument = badArgument;
  }

  public ErrorsArtifactUploadBadJsonData badArguments(List<@Valid ErrorsCommonBadJsonDataErrorsAllOfBadArguments> badArguments) {
    this.badArguments = badArguments;
    return this;
  }

  public ErrorsArtifactUploadBadJsonData addBadArgumentsItem(ErrorsCommonBadJsonDataErrorsAllOfBadArguments badArgumentsItem) {
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
  public List<@Valid ErrorsCommonBadJsonDataErrorsAllOfBadArguments> getBadArguments() {
    return badArguments;
  }

  /**
   * @deprecated
  */
  @Deprecated
  public void setBadArguments(List<@Valid ErrorsCommonBadJsonDataErrorsAllOfBadArguments> badArguments) {
    this.badArguments = badArguments;
  }

  public ErrorsArtifactUploadBadJsonData description(String description) {
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

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ErrorsArtifactUploadBadJsonData errorsArtifactUploadBadJsonData = (ErrorsArtifactUploadBadJsonData) o;
    return Objects.equals(this.requestId, errorsArtifactUploadBadJsonData.requestId) &&
        Objects.equals(this.errors, errorsArtifactUploadBadJsonData.errors) &&
        Objects.equals(this.badArgument, errorsArtifactUploadBadJsonData.badArgument) &&
        Objects.equals(this.badArguments, errorsArtifactUploadBadJsonData.badArguments) &&
        Objects.equals(this.description, errorsArtifactUploadBadJsonData.description);
  }

  @Override
  public int hashCode() {
    return Objects.hash(requestId, errors, badArgument, badArguments, description);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ErrorsArtifactUploadBadJsonData {\n");
    sb.append("    requestId: ").append(toIndentedString(requestId)).append("\n");
    sb.append("    errors: ").append(toIndentedString(errors)).append("\n");
    sb.append("    badArgument: ").append(toIndentedString(badArgument)).append("\n");
    sb.append("    badArguments: ").append(toIndentedString(badArguments)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
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

