package ru.brobrocode.cadra.client.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.annotation.Generated;
import jakarta.validation.constraints.NotNull;

import java.util.Objects;

/**
 * ErrorsNegotiationHideResponseError
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2025-08-17T15:41:09.394389505+05:00[Asia/Yekaterinburg]", comments = "Generator version: 7.6.0")
public class ErrorsNegotiationHideResponseError {

  /**
   * Тип ошибки
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
   * Причина ошибки: * `wrong_state` — действие по отклику/приглашению в данном статусе невозможно * `no_invitation` — переписка недоступна, так как в отклике ещё не было приглашения * `disabled_by_employer` — возможность переписки по отклику отключена работодателем * `chat_is_not_ready` — чат отклика/приглашения еще не готов 
   */
  public enum ValueEnum {
    WRONG_STATE("wrong_state"),
    
    NO_INVITATION("no_invitation"),
    
    DISABLED_BY_EMPLOYER("disabled_by_employer"),
    
    CHAT_IS_NOT_READY("chat_is_not_ready");

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

  public ErrorsNegotiationHideResponseError() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public ErrorsNegotiationHideResponseError(TypeEnum type, ValueEnum value) {
    this.type = type;
    this.value = value;
  }

  public ErrorsNegotiationHideResponseError type(TypeEnum type) {
    this.type = type;
    return this;
  }

  /**
   * Тип ошибки
   * @return type
  */
  @NotNull 
  @Schema(name = "type", example = "negotiations", description = "Тип ошибки", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("type")
  public TypeEnum getType() {
    return type;
  }

  public void setType(TypeEnum type) {
    this.type = type;
  }

  public ErrorsNegotiationHideResponseError value(ValueEnum value) {
    this.value = value;
    return this;
  }

  /**
   * Причина ошибки: * `wrong_state` — действие по отклику/приглашению в данном статусе невозможно * `no_invitation` — переписка недоступна, так как в отклике ещё не было приглашения * `disabled_by_employer` — возможность переписки по отклику отключена работодателем * `chat_is_not_ready` — чат отклика/приглашения еще не готов 
   * @return value
  */
  @NotNull 
  @Schema(name = "value", example = "wrong_state", description = "Причина ошибки: * `wrong_state` — действие по отклику/приглашению в данном статусе невозможно * `no_invitation` — переписка недоступна, так как в отклике ещё не было приглашения * `disabled_by_employer` — возможность переписки по отклику отключена работодателем * `chat_is_not_ready` — чат отклика/приглашения еще не готов ", requiredMode = Schema.RequiredMode.REQUIRED)
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
    ErrorsNegotiationHideResponseError errorsNegotiationHideResponseError = (ErrorsNegotiationHideResponseError) o;
    return Objects.equals(this.type, errorsNegotiationHideResponseError.type) &&
        Objects.equals(this.value, errorsNegotiationHideResponseError.value);
  }

  @Override
  public int hashCode() {
    return Objects.hash(type, value);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ErrorsNegotiationHideResponseError {\n");
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

