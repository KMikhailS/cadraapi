package ru.brobrocode.cadra.client.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.annotation.Generated;

import java.util.Objects;

/**
 * EmployersBrandingBrandingType
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2025-08-17T15:41:09.394389505+05:00[Asia/Yekaterinburg]", comments = "Generator version: 7.6.0")
public class EmployersBrandingBrandingType {

  /**
   * Тип брендирования:    * `CONSTRUCTOR` — брендирование типом «конструктор»;   * `MAKEUP` — брендирование типом «makeup» (хамелеон) 
   */
  public enum TypeEnum {
    CONSTRUCTOR("CONSTRUCTOR"),
    
    MAKEUP("MAKEUP");

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

  public EmployersBrandingBrandingType type(TypeEnum type) {
    this.type = type;
    return this;
  }

  /**
   * Тип брендирования:    * `CONSTRUCTOR` — брендирование типом «конструктор»;   * `MAKEUP` — брендирование типом «makeup» (хамелеон) 
   * @return type
  */
  
  @Schema(name = "type", description = "Тип брендирования:    * `CONSTRUCTOR` — брендирование типом «конструктор»;   * `MAKEUP` — брендирование типом «makeup» (хамелеон) ", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("type")
  public TypeEnum getType() {
    return type;
  }

  public void setType(TypeEnum type) {
    this.type = type;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EmployersBrandingBrandingType employersBrandingBrandingType = (EmployersBrandingBrandingType) o;
    return Objects.equals(this.type, employersBrandingBrandingType.type);
  }

  @Override
  public int hashCode() {
    return Objects.hash(type);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EmployersBrandingBrandingType {\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
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

