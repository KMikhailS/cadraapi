package ru.brobrocode.cadra.client.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.annotation.Generated;
import jakarta.validation.constraints.NotNull;

import java.util.Objects;

/**
 * Ресурс на котором было размещено резюме
 */

@Schema(name = "ResumeViewPlatform", description = "Ресурс на котором было размещено резюме")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2025-08-17T15:41:09.394389505+05:00[Asia/Yekaterinburg]", comments = "Generator version: 7.6.0")
public class ResumeViewPlatform {

  /**
   * Идентификатор ресурса (значения могут быть расширены)
   */
  public enum IdEnum {
    HEADHUNTER("headhunter"),
    
    ZARPLATA("zarplata"),
    
    RABOTA("rabota");

    private String value;

    IdEnum(String value) {
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
    public static IdEnum fromValue(String value) {
      for (IdEnum b : IdEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  private IdEnum id;

  public ResumeViewPlatform() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public ResumeViewPlatform(IdEnum id) {
    this.id = id;
  }

  public ResumeViewPlatform id(IdEnum id) {
    this.id = id;
    return this;
  }

  /**
   * Идентификатор ресурса (значения могут быть расширены)
   * @return id
  */
  @NotNull 
  @Schema(name = "id", description = "Идентификатор ресурса (значения могут быть расширены)", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("id")
  public IdEnum getId() {
    return id;
  }

  public void setId(IdEnum id) {
    this.id = id;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ResumeViewPlatform resumeViewPlatform = (ResumeViewPlatform) o;
    return Objects.equals(this.id, resumeViewPlatform.id);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ResumeViewPlatform {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
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

