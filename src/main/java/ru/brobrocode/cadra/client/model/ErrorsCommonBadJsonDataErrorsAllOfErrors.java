package ru.brobrocode.cadra.client.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.annotation.Generated;
import jakarta.validation.constraints.NotNull;

import java.util.Objects;

/**
 * ErrorsCommonBadJsonDataErrorsAllOfErrors
 */

@JsonTypeName("ErrorsCommonBadJsonDataErrors_allOf_errors")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2025-08-17T15:41:09.394389505+05:00[Asia/Yekaterinburg]", comments = "Generator version: 7.6.0")
public class ErrorsCommonBadJsonDataErrorsAllOfErrors {

  private String description = null;

  private String pointer;

  /**
   * Причина ошибки. Возможные значения:   * `required` — отсутствует обязательное поле;   * `invalid` — значение введено некорректно;   * `size_less_than_min` — пустой массив;   * `unexpected` — поле не ожидается;   * `greater_than_max` — значение больше максимума   * `deprecated` — значение устарело и больше не используется 
   */
  public enum ReasonEnum {
    REQUIRED("required"),
    
    INVALID("invalid"),
    
    SIZE_LESS_THAN_MIN("size_less_than_min"),
    
    GREATER_THAN_MAX("greater_than_max"),
    
    UNEXPECTED("unexpected"),
    
    DEPRECATED("deprecated");

    private String value;

    ReasonEnum(String value) {
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
    public static ReasonEnum fromValue(String value) {
      for (ReasonEnum b : ReasonEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  private ReasonEnum reason;

  /**
   * Текстовый идентификатор типа ошибки
   */
  public enum TypeEnum {
    BAD_JSON_DATA("bad_json_data");

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

  public ErrorsCommonBadJsonDataErrorsAllOfErrors() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public ErrorsCommonBadJsonDataErrorsAllOfErrors(TypeEnum type) {
    this.type = type;
  }

  public ErrorsCommonBadJsonDataErrorsAllOfErrors description(String description) {
    this.description = description;
    return this;
  }

  /**
   * Описание ошибки
   * @return description
  */
  
  @Schema(name = "description", example = "Значение неправильное", description = "Описание ошибки", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("description")
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public ErrorsCommonBadJsonDataErrorsAllOfErrors pointer(String pointer) {
    this.pointer = pointer;
    return this;
  }

  /**
   * Путь до параметра, в котором возникла ошибка.  Для указания параметра используется формат JsonPointer [RFC 6901](https://datatracker.ietf.org/doc/html/rfc6901) 
   * @return pointer
  */
  
  @Schema(name = "pointer", example = "/contacts/phones/1/number", description = "Путь до параметра, в котором возникла ошибка.  Для указания параметра используется формат JsonPointer [RFC 6901](https://datatracker.ietf.org/doc/html/rfc6901) ", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("pointer")
  public String getPointer() {
    return pointer;
  }

  public void setPointer(String pointer) {
    this.pointer = pointer;
  }

  public ErrorsCommonBadJsonDataErrorsAllOfErrors reason(ReasonEnum reason) {
    this.reason = reason;
    return this;
  }

  /**
   * Причина ошибки. Возможные значения:   * `required` — отсутствует обязательное поле;   * `invalid` — значение введено некорректно;   * `size_less_than_min` — пустой массив;   * `unexpected` — поле не ожидается;   * `greater_than_max` — значение больше максимума   * `deprecated` — значение устарело и больше не используется 
   * @return reason
  */
  
  @Schema(name = "reason", example = "required", description = "Причина ошибки. Возможные значения:   * `required` — отсутствует обязательное поле;   * `invalid` — значение введено некорректно;   * `size_less_than_min` — пустой массив;   * `unexpected` — поле не ожидается;   * `greater_than_max` — значение больше максимума   * `deprecated` — значение устарело и больше не используется ", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("reason")
  public ReasonEnum getReason() {
    return reason;
  }

  public void setReason(ReasonEnum reason) {
    this.reason = reason;
  }

  public ErrorsCommonBadJsonDataErrorsAllOfErrors type(TypeEnum type) {
    this.type = type;
    return this;
  }

  /**
   * Текстовый идентификатор типа ошибки
   * @return type
  */
  @NotNull 
  @Schema(name = "type", example = "bad_json_data", description = "Текстовый идентификатор типа ошибки", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("type")
  public TypeEnum getType() {
    return type;
  }

  public void setType(TypeEnum type) {
    this.type = type;
  }

  public ErrorsCommonBadJsonDataErrorsAllOfErrors value(String value) {
    this.value = value;
    return this;
  }

  /**
   * Название поля с ошибкой
   * @return value
  */
  
  @Schema(name = "value", example = "employer_id", description = "Название поля с ошибкой", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
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
    ErrorsCommonBadJsonDataErrorsAllOfErrors errorsCommonBadJsonDataErrorsAllOfErrors = (ErrorsCommonBadJsonDataErrorsAllOfErrors) o;
    return Objects.equals(this.description, errorsCommonBadJsonDataErrorsAllOfErrors.description) &&
        Objects.equals(this.pointer, errorsCommonBadJsonDataErrorsAllOfErrors.pointer) &&
        Objects.equals(this.reason, errorsCommonBadJsonDataErrorsAllOfErrors.reason) &&
        Objects.equals(this.type, errorsCommonBadJsonDataErrorsAllOfErrors.type) &&
        Objects.equals(this.value, errorsCommonBadJsonDataErrorsAllOfErrors.value);
  }

  @Override
  public int hashCode() {
    return Objects.hash(description, pointer, reason, type, value);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ErrorsCommonBadJsonDataErrorsAllOfErrors {\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    pointer: ").append(toIndentedString(pointer)).append("\n");
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

