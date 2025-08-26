package ru.brobrocode.cadra.client.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import jakarta.annotation.Generated;

/**
 * Gets or Sets VacancyRelationItem
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2025-08-17T15:41:09.394389505+05:00[Asia/Yekaterinburg]", comments = "Generator version: 7.6.0")
public enum VacancyRelationItem {
  
  FAVORITED("favorited"),
  
  GOT_RESPONSE("got_response"),
  
  GOT_INVITATION("got_invitation"),
  
  GOT_REJECTION("got_rejection"),
  
  BLACKLISTED("blacklisted"),
  
  NULL("null");

  private String value;

  VacancyRelationItem(String value) {
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
  public static VacancyRelationItem fromValue(String value) {
    for (VacancyRelationItem b : VacancyRelationItem.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    return null;
  }
}

