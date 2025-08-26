package ru.brobrocode.cadra.client.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.annotation.Generated;
import jakarta.validation.Valid;

import java.util.Objects;

/**
 * IncludesEmployerApplicantServicesObject
 */

@JsonTypeName("_IncludesEmployerApplicantServicesObject")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2025-08-17T15:41:09.394389505+05:00[Asia/Yekaterinburg]", comments = "Generator version: 7.6.0")
public class IncludesEmployerApplicantServicesObject {

  private IncludesEmployerApplicantServices applicantServices;

  public IncludesEmployerApplicantServicesObject applicantServices(IncludesEmployerApplicantServices applicantServices) {
    this.applicantServices = applicantServices;
    return this;
  }

  /**
   * Get applicantServices
   * @return applicantServices
  */
  @Valid 
  @Schema(name = "applicant_services", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("applicant_services")
  public IncludesEmployerApplicantServices getApplicantServices() {
    return applicantServices;
  }

  public void setApplicantServices(IncludesEmployerApplicantServices applicantServices) {
    this.applicantServices = applicantServices;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    IncludesEmployerApplicantServicesObject includesEmployerApplicantServicesObject = (IncludesEmployerApplicantServicesObject) o;
    return Objects.equals(this.applicantServices, includesEmployerApplicantServicesObject.applicantServices);
  }

  @Override
  public int hashCode() {
    return Objects.hash(applicantServices);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IncludesEmployerApplicantServicesObject {\n");
    sb.append("    applicantServices: ").append(toIndentedString(applicantServices)).append("\n");
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

