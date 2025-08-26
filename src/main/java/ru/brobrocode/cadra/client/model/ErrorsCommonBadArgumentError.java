package ru.brobrocode.cadra.client.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.annotation.Generated;
import jakarta.validation.constraints.NotNull;

import java.util.Objects;

/**
 * ErrorsCommonBadArgumentError
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2025-08-17T15:41:09.394389505+05:00[Asia/Yekaterinburg]", comments = "Generator version: 7.6.0")
public class ErrorsCommonBadArgumentError {

  private String reason;

  /**
   * Текстовый идентификатор типа ошибки
   */
  public enum TypeEnum {
    BAD_ARGUMENT("bad_argument");

    private String value;

    TypeEnum(String value) {
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
    public static TypeEnum fromValue(String value) {
      for (TypeEnum b : TypeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  private TypeEnum type;

  private String value;

  public ErrorsCommonBadArgumentError() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public ErrorsCommonBadArgumentError(TypeEnum type) {
    this.type = type;
  }

  public ErrorsCommonBadArgumentError reason(String reason) {
    this.reason = reason;
    return this;
  }

  /**
   * Причина ошибки. Возможные значения:   * `too_long_value` — слишком длинное значение   * `too_many_arguments` — слишком много аргументов   * `invalid` — значение введено некорректно 
   * @return reason
  */
  
  @Schema(name = "reason", example = "too_long_value", description = "Причина ошибки. Возможные значения:   * `too_long_value` — слишком длинное значение   * `too_many_arguments` — слишком много аргументов   * `invalid` — значение введено некорректно ", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("reason")
  public String getReason() {
    return reason;
  }

  public void setReason(String reason) {
    this.reason = reason;
  }

  public ErrorsCommonBadArgumentError type(TypeEnum type) {
    this.type = type;
    return this;
  }

  /**
   * Текстовый идентификатор типа ошибки
   * @return type
  */
  @NotNull 
  @Schema(name = "type", example = "bad_argument", description = "Текстовый идентификатор типа ошибки", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("type")
  public TypeEnum getType() {
    return type;
  }

  public void setType(TypeEnum type) {
    this.type = type;
  }

  public ErrorsCommonBadArgumentError value(String value) {
    this.value = value;
    return this;
  }

  /**
   * Название поля с ошибкой 
   * @return value
  */
  
  @Schema(name = "value", example = "resume_id", description = "Название поля с ошибкой ", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("value")
  public String getValue() {
    return value;
  }

  public void setValue(String value) {
    this.value = value;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ErrorsCommonBadArgumentError errorsCommonBadArgumentError = (ErrorsCommonBadArgumentError) o;
    return Objects.equals(this.reason, errorsCommonBadArgumentError.reason) &&
        Objects.equals(this.type, errorsCommonBadArgumentError.type) &&
        Objects.equals(this.value, errorsCommonBadArgumentError.value);
  }

  @Override
  public int hashCode() {
    return Objects.hash(reason, type, value);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ErrorsCommonBadArgumentError {\n");
    sb.append("    reason: ").append(toIndentedString(reason)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    value: ").append(toIndentedString(value)).append("\n");
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

