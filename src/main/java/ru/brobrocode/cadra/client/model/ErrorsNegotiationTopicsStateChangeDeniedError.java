package ru.brobrocode.cadra.client.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.annotation.Generated;
import jakarta.validation.constraints.NotNull;

import java.util.Objects;

/**
 * ErrorsNegotiationTopicsStateChangeDeniedError
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2025-08-17T15:41:09.394389505+05:00[Asia/Yekaterinburg]", comments = "Generator version: 7.6.0")
public class ErrorsNegotiationTopicsStateChangeDeniedError {

  /**
   * Текстовый идентификатор типа ошибки
   */
  public enum TypeEnum {
    NEGOTIATIONS("negotiations");

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
   * Ошибки при переводе откликов по вакансии:   * `application_denied` — ошибка доступа к отклику. Может возникнуть в случае перевода нескольких откликов в другой статус, если,  как минимум один из откликов принадлежит другой вакансии 
   */
  public enum ValueEnum {
    APPLICATION_DENIED("application_denied");

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

  public ErrorsNegotiationTopicsStateChangeDeniedError() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public ErrorsNegotiationTopicsStateChangeDeniedError(TypeEnum type, ValueEnum value) {
    this.type = type;
    this.value = value;
  }

  public ErrorsNegotiationTopicsStateChangeDeniedError type(TypeEnum type) {
    this.type = type;
    return this;
  }

  /**
   * Текстовый идентификатор типа ошибки
   * @return type
  */
  @NotNull 
  @Schema(name = "type", example = "negotiations", description = "Текстовый идентификатор типа ошибки", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("type")
  public TypeEnum getType() {
    return type;
  }

  public void setType(TypeEnum type) {
    this.type = type;
  }

  public ErrorsNegotiationTopicsStateChangeDeniedError value(ValueEnum value) {
    this.value = value;
    return this;
  }

  /**
   * Ошибки при переводе откликов по вакансии:   * `application_denied` — ошибка доступа к отклику. Может возникнуть в случае перевода нескольких откликов в другой статус, если,  как минимум один из откликов принадлежит другой вакансии 
   * @return value
  */
  @NotNull 
  @Schema(name = "value", example = "application_denied", description = "Ошибки при переводе откликов по вакансии:   * `application_denied` — ошибка доступа к отклику. Может возникнуть в случае перевода нескольких откликов в другой статус, если,  как минимум один из откликов принадлежит другой вакансии ", requiredMode = Schema.RequiredMode.REQUIRED)
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
    ErrorsNegotiationTopicsStateChangeDeniedError errorsNegotiationTopicsStateChangeDeniedError = (ErrorsNegotiationTopicsStateChangeDeniedError) o;
    return Objects.equals(this.type, errorsNegotiationTopicsStateChangeDeniedError.type) &&
        Objects.equals(this.value, errorsNegotiationTopicsStateChangeDeniedError.value);
  }

  @Override
  public int hashCode() {
    return Objects.hash(type, value);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ErrorsNegotiationTopicsStateChangeDeniedError {\n");
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

