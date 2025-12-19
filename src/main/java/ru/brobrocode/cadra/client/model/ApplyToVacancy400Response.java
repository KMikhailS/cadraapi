package ru.brobrocode.cadra.client.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.annotation.Generated;
import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * ApplyToVacancy400Response
 */

@JsonTypeName("apply_to_vacancy_400_response")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2025-08-17T15:41:09.394389505+05:00[Asia/Yekaterinburg]", comments = "Generator version: 7.6.0")
public class ApplyToVacancy400Response {

  private String requestId;

  @Deprecated
  private String badArgument;

  @Deprecated
  @Valid
  private List<@Valid ErrorsCommonBadJsonDataErrorsAllOfBadArguments> badArguments = new ArrayList<>();

  @Deprecated
  private String description;

  @Valid
  private List<@Valid ErrorsCommonBadArgumentError> errors = new ArrayList<>();

  public ApplyToVacancy400Response() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public ApplyToVacancy400Response(String requestId, List<@Valid ErrorsCommonBadArgumentError> errors) {
    this.requestId = requestId;
    this.errors = errors;
  }

  public ApplyToVacancy400Response requestId(String requestId) {
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

  public ApplyToVacancy400Response badArgument(String badArgument) {
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

  public ApplyToVacancy400Response badArguments(List<@Valid ErrorsCommonBadJsonDataErrorsAllOfBadArguments> badArguments) {
    this.badArguments = badArguments;
    return this;
  }

  public ApplyToVacancy400Response addBadArgumentsItem(ErrorsCommonBadJsonDataErrorsAllOfBadArguments badArgumentsItem) {
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

  public ApplyToVacancy400Response description(String description) {
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

  public ApplyToVacancy400Response errors(List<@Valid ErrorsCommonBadArgumentError> errors) {
    this.errors = errors;
    return this;
  }

  public ApplyToVacancy400Response addErrorsItem(ErrorsCommonBadArgumentError errorsItem) {
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

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ApplyToVacancy400Response applyToVacancy400Response = (ApplyToVacancy400Response) o;
    return Objects.equals(this.requestId, applyToVacancy400Response.requestId) &&
        Objects.equals(this.badArgument, applyToVacancy400Response.badArgument) &&
        Objects.equals(this.badArguments, applyToVacancy400Response.badArguments) &&
        Objects.equals(this.description, applyToVacancy400Response.description) &&
        Objects.equals(this.errors, applyToVacancy400Response.errors);
  }

  @Override
  public int hashCode() {
    return Objects.hash(requestId, badArgument, badArguments, description, errors);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ApplyToVacancy400Response {\n");
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

