package ru.brobrocode.cadra.client.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.annotation.Generated;
import jakarta.validation.constraints.NotNull;

import java.util.Objects;

/**
 * ErrorsResumePhoneGenerateCodeForbiddenError
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2025-08-17T15:41:09.394389505+05:00[Asia/Yekaterinburg]", comments = "Generator version: 7.6.0")
public class ErrorsResumePhoneGenerateCodeForbiddenError {

  /**
   * Текстовый идентификатор типа ошибки
   */
  public enum TypeEnum {
    RESUME_PHONE_GENERATE("resume_phone_generate");

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

  /**
   * Описание ошибки. Возможные значения:   * `too_early` — Не закончилось время до следующей возможной генерации кода 
   */
  public enum ValueEnum {
    TOO_EARLY("too_early");

    private String value;

    ValueEnum(String value) {
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
    public static ValueEnum fromValue(String value) {
      for (ValueEnum b : ValueEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  private ValueEnum value;

  public ErrorsResumePhoneGenerateCodeForbiddenError() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public ErrorsResumePhoneGenerateCodeForbiddenError(TypeEnum type, ValueEnum value) {
    this.type = type;
    this.value = value;
  }

  public ErrorsResumePhoneGenerateCodeForbiddenError type(TypeEnum type) {
    this.type = type;
    return this;
  }

  /**
   * Текстовый идентификатор типа ошибки
   * @return type
  */
  @NotNull 
  @Schema(name = "type", example = "resume_phone_generate", description = "Текстовый идентификатор типа ошибки", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("type")
  public TypeEnum getType() {
    return type;
  }

  public void setType(TypeEnum type) {
    this.type = type;
  }

  public ErrorsResumePhoneGenerateCodeForbiddenError value(ValueEnum value) {
    this.value = value;
    return this;
  }

  /**
   * Описание ошибки. Возможные значения:   * `too_early` — Не закончилось время до следующей возможной генерации кода 
   * @return value
  */
  @NotNull 
  @Schema(name = "value", example = "too_early", description = "Описание ошибки. Возможные значения:   * `too_early` — Не закончилось время до следующей возможной генерации кода ", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("value")
  public ValueEnum getValue() {
    return value;
  }

  public void setValue(ValueEnum value) {
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
    ErrorsResumePhoneGenerateCodeForbiddenError errorsResumePhoneGenerateCodeForbiddenError = (ErrorsResumePhoneGenerateCodeForbiddenError) o;
    return Objects.equals(this.type, errorsResumePhoneGenerateCodeForbiddenError.type) &&
        Objects.equals(this.value, errorsResumePhoneGenerateCodeForbiddenError.value);
  }

  @Override
  public int hashCode() {
    return Objects.hash(type, value);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ErrorsResumePhoneGenerateCodeForbiddenError {\n");
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

