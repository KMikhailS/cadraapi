package ru.brobrocode.cadra.client.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.annotation.Generated;
import jakarta.validation.constraints.NotNull;

import java.util.Objects;

/**
 * ErrorsSavedSearchNotFoundError
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2025-08-17T15:41:09.394389505+05:00[Asia/Yekaterinburg]", comments = "Generator version: 7.6.0")
public class ErrorsSavedSearchNotFoundError {

  /**
   * Текстовый идентификатор типа ошибки
   */
  public enum TypeEnum {
    SAVED_SEARCHES("saved_searches"),
    
    NOT_FOUND("not_found");

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
   * Название поля запроса с ошибкой. Возможные значения: * `saved_search_not_found` — автопоиск не найден или не принадлежит текущему пользователю. * `manager_not_found` — менеджер не найден 
   */
  public enum ValueEnum {
    SAVED_SEARCH_NOT_FOUND("saved_search_not_found"),
    
    MANAGER_NOT_FOUND("manager_not_found");

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

  public ErrorsSavedSearchNotFoundError() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public ErrorsSavedSearchNotFoundError(TypeEnum type) {
    this.type = type;
  }

  public ErrorsSavedSearchNotFoundError type(TypeEnum type) {
    this.type = type;
    return this;
  }

  /**
   * Текстовый идентификатор типа ошибки
   * @return type
  */
  @NotNull 
  @Schema(name = "type", example = "saved_searches", description = "Текстовый идентификатор типа ошибки", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("type")
  public TypeEnum getType() {
    return type;
  }

  public void setType(TypeEnum type) {
    this.type = type;
  }

  public ErrorsSavedSearchNotFoundError value(ValueEnum value) {
    this.value = value;
    return this;
  }

  /**
   * Название поля запроса с ошибкой. Возможные значения: * `saved_search_not_found` — автопоиск не найден или не принадлежит текущему пользователю. * `manager_not_found` — менеджер не найден 
   * @return value
  */
  
  @Schema(name = "value", example = "saved_search_not_found", description = "Название поля запроса с ошибкой. Возможные значения: * `saved_search_not_found` — автопоиск не найден или не принадлежит текущему пользователю. * `manager_not_found` — менеджер не найден ", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
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
    ErrorsSavedSearchNotFoundError errorsSavedSearchNotFoundError = (ErrorsSavedSearchNotFoundError) o;
    return Objects.equals(this.type, errorsSavedSearchNotFoundError.type) &&
        Objects.equals(this.value, errorsSavedSearchNotFoundError.value);
  }

  @Override
  public int hashCode() {
    return Objects.hash(type, value);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ErrorsSavedSearchNotFoundError {\n");
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

