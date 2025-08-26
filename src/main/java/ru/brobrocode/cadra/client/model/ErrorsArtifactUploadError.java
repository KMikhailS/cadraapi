package ru.brobrocode.cadra.client.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.annotation.Generated;
import jakarta.validation.constraints.NotNull;

import java.util.Objects;

/**
 * ErrorsArtifactUploadError
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2025-08-17T15:41:09.394389505+05:00[Asia/Yekaterinburg]", comments = "Generator version: 7.6.0")
public class ErrorsArtifactUploadError {

  /**
   * Текстовый идентификатор типа ошибки
   */
  public enum TypeEnum {
    ARTIFACTS("artifacts");

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
   * Название поля с ошибкой. Возможные значения: * `file` — не указан файл, либо указано несколько. * `type` — некорректное значение параметра `type`. * `description` — слишком длинное описание. * `limit_exceeded` — превышено количество артефактов. * `unknown_format` — неизвестный формат файла 
   */
  public enum ValueEnum {
    FILE("file"),
    
    TYPE("type"),
    
    DESCRIPTION("description"),
    
    LIMIT_EXCEEDED("limit_exceeded"),
    
    UNKNOWN_FORMAT("unknown_format");

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

  public ErrorsArtifactUploadError() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public ErrorsArtifactUploadError(TypeEnum type, ValueEnum value) {
    this.type = type;
    this.value = value;
  }

  public ErrorsArtifactUploadError type(TypeEnum type) {
    this.type = type;
    return this;
  }

  /**
   * Текстовый идентификатор типа ошибки
   * @return type
  */
  @NotNull 
  @Schema(name = "type", example = "artifacts", description = "Текстовый идентификатор типа ошибки", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("type")
  public TypeEnum getType() {
    return type;
  }

  public void setType(TypeEnum type) {
    this.type = type;
  }

  public ErrorsArtifactUploadError value(ValueEnum value) {
    this.value = value;
    return this;
  }

  /**
   * Название поля с ошибкой. Возможные значения: * `file` — не указан файл, либо указано несколько. * `type` — некорректное значение параметра `type`. * `description` — слишком длинное описание. * `limit_exceeded` — превышено количество артефактов. * `unknown_format` — неизвестный формат файла 
   * @return value
  */
  @NotNull 
  @Schema(name = "value", example = "limit_exceeded", description = "Название поля с ошибкой. Возможные значения: * `file` — не указан файл, либо указано несколько. * `type` — некорректное значение параметра `type`. * `description` — слишком длинное описание. * `limit_exceeded` — превышено количество артефактов. * `unknown_format` — неизвестный формат файла ", requiredMode = Schema.RequiredMode.REQUIRED)
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
    ErrorsArtifactUploadError errorsArtifactUploadError = (ErrorsArtifactUploadError) o;
    return Objects.equals(this.type, errorsArtifactUploadError.type) &&
        Objects.equals(this.value, errorsArtifactUploadError.value);
  }

  @Override
  public int hashCode() {
    return Objects.hash(type, value);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ErrorsArtifactUploadError {\n");
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

