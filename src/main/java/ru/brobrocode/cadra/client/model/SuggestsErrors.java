package ru.brobrocode.cadra.client.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.annotation.Generated;
import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * SuggestsErrors
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2025-08-17T15:41:09.394389505+05:00[Asia/Yekaterinburg]", comments = "Generator version: 7.6.0")
public class SuggestsErrors {

  private String requestId;

  /**
   * Gets or Sets badArgument
   */
  public enum BadArgumentEnum {
    LOCALE("locale"),
    
    TEXT("text"),
    
    AREA_ID("area_id");

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
  private List<@Valid SuggestsErrorsAllOfBadArguments> badArguments = new ArrayList<>();

  @Deprecated
  private String description;

  @Valid
  private List<@Valid SuggestsErrorsAllOfErrors> errors = new ArrayList<>();

  public SuggestsErrors() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public SuggestsErrors(String requestId, List<@Valid SuggestsErrorsAllOfErrors> errors) {
    this.requestId = requestId;
    this.errors = errors;
  }

  public SuggestsErrors requestId(String requestId) {
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

  public SuggestsErrors badArgument(BadArgumentEnum badArgument) {
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

  public SuggestsErrors badArguments(List<@Valid SuggestsErrorsAllOfBadArguments> badArguments) {
    this.badArguments = badArguments;
    return this;
  }

  public SuggestsErrors addBadArgumentsItem(SuggestsErrorsAllOfBadArguments badArgumentsItem) {
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
  public List<@Valid SuggestsErrorsAllOfBadArguments> getBadArguments() {
    return badArguments;
  }

  /**
   * @deprecated
  */
  @Deprecated
  public void setBadArguments(List<@Valid SuggestsErrorsAllOfBadArguments> badArguments) {
    this.badArguments = badArguments;
  }

  public SuggestsErrors description(String description) {
    this.description = description;
    return this;
  }

  /**
   * Get description
   * @return description
   * @deprecated
  */
  
  @Schema(name = "description", deprecated = true, requiredMode = Schema.RequiredMode.NOT_REQUIRED)
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

  public SuggestsErrors errors(List<@Valid SuggestsErrorsAllOfErrors> errors) {
    this.errors = errors;
    return this;
  }

  public SuggestsErrors addErrorsItem(SuggestsErrorsAllOfErrors errorsItem) {
    if (this.errors == null) {
      this.errors = new ArrayList<>();
    }
    this.errors.add(errorsItem);
    return this;
  }

  /**
   * Get errors
   * @return errors
  */
  @NotNull @Valid 
  @Schema(name = "errors", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("errors")
  public List<@Valid SuggestsErrorsAllOfErrors> getErrors() {
    return errors;
  }

  public void setErrors(List<@Valid SuggestsErrorsAllOfErrors> errors) {
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
    SuggestsErrors suggestsErrors = (SuggestsErrors) o;
    return Objects.equals(this.requestId, suggestsErrors.requestId) &&
        Objects.equals(this.badArgument, suggestsErrors.badArgument) &&
        Objects.equals(this.badArguments, suggestsErrors.badArguments) &&
        Objects.equals(this.description, suggestsErrors.description) &&
        Objects.equals(this.errors, suggestsErrors.errors);
  }

  @Override
  public int hashCode() {
    return Objects.hash(requestId, badArgument, badArguments, description, errors);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SuggestsErrors {\n");
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

