package ru.brobrocode.cadra.client.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import jakarta.annotation.Generated;

/**
 * Объект, значение которого null
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2025-08-17T15:41:09.394389505+05:00[Asia/Yekaterinburg]", comments = "Generator version: 7.6.0")
public enum IncludesNullableObject {
  
  NULL("null");

  private String value;

  IncludesNullableObject(String value) {
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
  public static IncludesNullableObject fromValue(String value) {
    for (IncludesNullableObject b : IncludesNullableObject.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    return null;
  }
}

