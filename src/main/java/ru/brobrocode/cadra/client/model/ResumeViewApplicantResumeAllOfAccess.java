package ru.brobrocode.cadra.client.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.annotation.Generated;
import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;

import java.util.Objects;

/**
 * Документация [Видимость резюме](#tag/Prosmotr-rezyume/operation/get-resume) (атрибут &#39;access&#39;) 
 */

@Schema(name = "ResumeViewApplicantResume_allOf_access", description = "Документация [Видимость резюме](#tag/Prosmotr-rezyume/operation/get-resume) (атрибут 'access') ")
@JsonTypeName("ResumeViewApplicantResume_allOf_access")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2025-08-17T15:41:09.394389505+05:00[Asia/Yekaterinburg]", comments = "Generator version: 7.6.0")
public class ResumeViewApplicantResumeAllOfAccess {

  private IncludesIdName type;

  public ResumeViewApplicantResumeAllOfAccess() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public ResumeViewApplicantResumeAllOfAccess(IncludesIdName type) {
    this.type = type;
  }

  public ResumeViewApplicantResumeAllOfAccess type(IncludesIdName type) {
    this.type = type;
    return this;
  }

  /**
   * Тип видимости
   * @return type
  */
  @NotNull @Valid 
  @Schema(name = "type", description = "Тип видимости", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("type")
  public IncludesIdName getType() {
    return type;
  }

  public void setType(IncludesIdName type) {
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
    ResumeViewApplicantResumeAllOfAccess resumeViewApplicantResumeAllOfAccess = (ResumeViewApplicantResumeAllOfAccess) o;
    return Objects.equals(this.type, resumeViewApplicantResumeAllOfAccess.type);
  }

  @Override
  public int hashCode() {
    return Objects.hash(type);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ResumeViewApplicantResumeAllOfAccess {\n");
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

