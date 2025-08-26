package ru.brobrocode.cadra.client.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.annotation.Generated;

import java.util.Objects;

/**
 * SuggestsErrorsAllOfErrors
 */

@JsonTypeName("SuggestsErrors_allOf_errors")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2025-08-17T15:41:09.394389505+05:00[Asia/Yekaterinburg]", comments = "Generator version: 7.6.0")
public class SuggestsErrorsAllOfErrors {

  /**
   * Gets or Sets type
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

  /**
   * Поле, в котором допущена ошибка.  Возможные значения: * `locale` — указан неподдерживаемый язык * `text` — искомый текст должен быть длиной от 2 до 30000 символов * `area_id` - указан не валидный идентификатор 
   */
  public enum ValueEnum {
    LOCALE("locale"),
    
    TEXT("text"),
    
    AREA_ID("area_id");

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

  public SuggestsErrorsAllOfErrors type(TypeEnum type) {
    this.type = type;
    return this;
  }

  /**
   * Get type
   * @return type
  */
  
  @Schema(name = "type", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("type")
  public TypeEnum getType() {
    return type;
  }

  public void setType(TypeEnum type) {
    this.type = type;
  }

  public SuggestsErrorsAllOfErrors value(ValueEnum value) {
    this.value = value;
    return this;
  }

  /**
   * Поле, в котором допущена ошибка.  Возможные значения: * `locale` — указан неподдерживаемый язык * `text` — искомый текст должен быть длиной от 2 до 30000 символов * `area_id` - указан не валидный идентификатор 
   * @return value
  */
  
  @Schema(name = "value", description = "Поле, в котором допущена ошибка.  Возможные значения: * `locale` — указан неподдерживаемый язык * `text` — искомый текст должен быть длиной от 2 до 30000 символов * `area_id` - указан не валидный идентификатор ", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
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
    SuggestsErrorsAllOfErrors suggestsErrorsAllOfErrors = (SuggestsErrorsAllOfErrors) o;
    return Objects.equals(this.type, suggestsErrorsAllOfErrors.type) &&
        Objects.equals(this.value, suggestsErrorsAllOfErrors.value);
  }

  @Override
  public int hashCode() {
    return Objects.hash(type, value);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SuggestsErrorsAllOfErrors {\n");
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

