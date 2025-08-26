package ru.brobrocode.cadra.client.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.annotation.Generated;
import jakarta.validation.constraints.NotNull;

import java.util.Objects;

/**
 * ErrorsResumeVisibilityError
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2025-08-17T15:41:09.394389505+05:00[Asia/Yekaterinburg]", comments = "Generator version: 7.6.0")
public class ErrorsResumeVisibilityError {

  /**
   * Текстовый идентификатор типа ошибки
   */
  public enum TypeEnum {
    BAD_ARGUMENT("bad_argument"),
    
    RESUME_VISIBILITY_LIST("resume_visibility_list");

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
   * Название поля с ошибкой:  - `per_page` — передано невалидное количество элементов на странице (максимум 100). - `unknown_employer` — передан неизвестный идентификатор работодателя. - `limit_exceeded` — превышен лимит списка видимости. - `too_many_employers` — передано слишком много работодателей. - `id` — передан невалидный идентификатор работодателя 
   */
  public enum ValueEnum {
    PER_PAGE("per_page"),
    
    UNKNOWN_EMPLOYER("unknown_employer"),
    
    LIMIT_EXCEEDED("limit_exceeded"),
    
    TOO_MANY_EMPLOYERS("too_many_employers");

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

  public ErrorsResumeVisibilityError() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public ErrorsResumeVisibilityError(TypeEnum type, ValueEnum value) {
    this.type = type;
    this.value = value;
  }

  public ErrorsResumeVisibilityError type(TypeEnum type) {
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

  public ErrorsResumeVisibilityError value(ValueEnum value) {
    this.value = value;
    return this;
  }

  /**
   * Название поля с ошибкой:  - `per_page` — передано невалидное количество элементов на странице (максимум 100). - `unknown_employer` — передан неизвестный идентификатор работодателя. - `limit_exceeded` — превышен лимит списка видимости. - `too_many_employers` — передано слишком много работодателей. - `id` — передан невалидный идентификатор работодателя 
   * @return value
  */
  @NotNull 
  @Schema(name = "value", example = "per_page", description = "Название поля с ошибкой:  - `per_page` — передано невалидное количество элементов на странице (максимум 100). - `unknown_employer` — передан неизвестный идентификатор работодателя. - `limit_exceeded` — превышен лимит списка видимости. - `too_many_employers` — передано слишком много работодателей. - `id` — передан невалидный идентификатор работодателя ", requiredMode = Schema.RequiredMode.REQUIRED)
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
    ErrorsResumeVisibilityError errorsResumeVisibilityError = (ErrorsResumeVisibilityError) o;
    return Objects.equals(this.type, errorsResumeVisibilityError.type) &&
        Objects.equals(this.value, errorsResumeVisibilityError.value);
  }

  @Override
  public int hashCode() {
    return Objects.hash(type, value);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ErrorsResumeVisibilityError {\n");
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

