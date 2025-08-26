package ru.brobrocode.cadra.client.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.annotation.Generated;

import java.util.Objects;

/**
 * SuggestsErrorsAllOfBadArguments
 */

@JsonTypeName("SuggestsErrors_allOf_bad_arguments")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2025-08-17T15:41:09.394389505+05:00[Asia/Yekaterinburg]", comments = "Generator version: 7.6.0")
public class SuggestsErrorsAllOfBadArguments {

  private String description;

  /**
   * Поле, в котором допущена ошибка.  Возможные значения: * `locale` — указан неподдерживаемый язык * `text` — искомый текст должен быть длиной от 2 до 30000 символов * `area_id` - указан не валидный идентификатор 
   */
  public enum NameEnum {
    LOCALE("locale"),
    
    TEXT("text"),
    
    AREA_ID("area_id");

    private String value;

    NameEnum(String value) {
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
    public static NameEnum fromValue(String value) {
      for (NameEnum b : NameEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  private NameEnum name;

  public SuggestsErrorsAllOfBadArguments description(String description) {
    this.description = description;
    return this;
  }

  /**
   * Get description
   * @return description
  */
  
  @Schema(name = "description", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("description")
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public SuggestsErrorsAllOfBadArguments name(NameEnum name) {
    this.name = name;
    return this;
  }

  /**
   * Поле, в котором допущена ошибка.  Возможные значения: * `locale` — указан неподдерживаемый язык * `text` — искомый текст должен быть длиной от 2 до 30000 символов * `area_id` - указан не валидный идентификатор 
   * @return name
  */
  
  @Schema(name = "name", description = "Поле, в котором допущена ошибка.  Возможные значения: * `locale` — указан неподдерживаемый язык * `text` — искомый текст должен быть длиной от 2 до 30000 символов * `area_id` - указан не валидный идентификатор ", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("name")
  public NameEnum getName() {
    return name;
  }

  public void setName(NameEnum name) {
    this.name = name;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SuggestsErrorsAllOfBadArguments suggestsErrorsAllOfBadArguments = (SuggestsErrorsAllOfBadArguments) o;
    return Objects.equals(this.description, suggestsErrorsAllOfBadArguments.description) &&
        Objects.equals(this.name, suggestsErrorsAllOfBadArguments.name);
  }

  @Override
  public int hashCode() {
    return Objects.hash(description, name);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SuggestsErrorsAllOfBadArguments {\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
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

