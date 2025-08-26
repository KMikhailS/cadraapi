package ru.brobrocode.cadra.client.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.annotation.Generated;

import java.util.Objects;

/**
 * ResumeProfileScreenFieldsOptionsValue
 */

@JsonTypeName("ResumeProfileScreen_fields_options_value")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2025-08-17T15:41:09.394389505+05:00[Asia/Yekaterinburg]", comments = "Generator version: 7.6.0")
public class ResumeProfileScreenFieldsOptionsValue {

  private Object fields;

  /**
   * Видимость поля на экране
   */
  public enum VisibilityEnum {
    SHOW("show"),
    
    HIDE("hide");

    private String value;

    VisibilityEnum(String value) {
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
    public static VisibilityEnum fromValue(String value) {
      for (VisibilityEnum b : VisibilityEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  private VisibilityEnum visibility;

  public ResumeProfileScreenFieldsOptionsValue fields(Object fields) {
    this.fields = fields;
    return this;
  }

  /**
   * Get fields
   * @return fields
  */
  
  @Schema(name = "fields", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("fields")
  public Object getFields() {
    return fields;
  }

  public void setFields(Object fields) {
    this.fields = fields;
  }

  public ResumeProfileScreenFieldsOptionsValue visibility(VisibilityEnum visibility) {
    this.visibility = visibility;
    return this;
  }

  /**
   * Видимость поля на экране
   * @return visibility
  */
  
  @Schema(name = "visibility", description = "Видимость поля на экране", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("visibility")
  public VisibilityEnum getVisibility() {
    return visibility;
  }

  public void setVisibility(VisibilityEnum visibility) {
    this.visibility = visibility;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ResumeProfileScreenFieldsOptionsValue resumeProfileScreenFieldsOptionsValue = (ResumeProfileScreenFieldsOptionsValue) o;
    return Objects.equals(this.fields, resumeProfileScreenFieldsOptionsValue.fields) &&
        Objects.equals(this.visibility, resumeProfileScreenFieldsOptionsValue.visibility);
  }

  @Override
  public int hashCode() {
    return Objects.hash(fields, visibility);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ResumeProfileScreenFieldsOptionsValue {\n");
    sb.append("    fields: ").append(toIndentedString(fields)).append("\n");
    sb.append("    visibility: ").append(toIndentedString(visibility)).append("\n");
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

