package ru.brobrocode.cadra.client.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.annotation.Generated;
import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;

import java.util.Objects;

/**
 * Раздел [Видимость резюме](#tag/Rezyume.-Spiski-vidimosti/operation/get-resume-access-types) 
 */

@Schema(name = "ResumeEditResume_access", description = "Раздел [Видимость резюме](#tag/Rezyume.-Spiski-vidimosti/operation/get-resume-access-types) ")
@JsonTypeName("ResumeEditResume_access")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2025-08-17T15:41:09.394389505+05:00[Asia/Yekaterinburg]", comments = "Generator version: 7.6.0")
public class ResumeEditResumeAccess {

  private IncludesId type;

  public ResumeEditResumeAccess() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public ResumeEditResumeAccess(IncludesId type) {
    this.type = type;
  }

  public ResumeEditResumeAccess type(IncludesId type) {
    this.type = type;
    return this;
  }

  /**
   * Тип видимости. Элемент справочника [resume_access_type](#tag/Obshie-spravochniki/operation/get-dictionaries)
   * @return type
  */
  @NotNull @Valid 
  @Schema(name = "type", description = "Тип видимости. Элемент справочника [resume_access_type](#tag/Obshie-spravochniki/operation/get-dictionaries)", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("type")
  public IncludesId getType() {
    return type;
  }

  public void setType(IncludesId type) {
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
    ResumeEditResumeAccess resumeEditResumeAccess = (ResumeEditResumeAccess) o;
    return Objects.equals(this.type, resumeEditResumeAccess.type);
  }

  @Override
  public int hashCode() {
    return Objects.hash(type);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ResumeEditResumeAccess {\n");
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

