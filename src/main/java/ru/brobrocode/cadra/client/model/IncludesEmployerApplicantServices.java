package ru.brobrocode.cadra.client.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.annotation.Generated;
import jakarta.validation.Valid;

import java.util.Objects;

/**
 * Информация о подключенных услугах соискателя, относящихся к данному работодателю
 */

@Schema(name = "_IncludesEmployerApplicantServices", description = "Информация о подключенных услугах соискателя, относящихся к данному работодателю")
@JsonTypeName("_IncludesEmployerApplicantServices")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2025-08-17T15:41:09.394389505+05:00[Asia/Yekaterinburg]", comments = "Generator version: 7.6.0")
public class IncludesEmployerApplicantServices {

  private IncludesEmployerApplicantServicesTargetEmployer targetEmployer;

  public IncludesEmployerApplicantServices targetEmployer(IncludesEmployerApplicantServicesTargetEmployer targetEmployer) {
    this.targetEmployer = targetEmployer;
    return this;
  }

  /**
   * Get targetEmployer
   * @return targetEmployer
  */
  @Valid 
  @Schema(name = "target_employer", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("target_employer")
  public IncludesEmployerApplicantServicesTargetEmployer getTargetEmployer() {
    return targetEmployer;
  }

  public void setTargetEmployer(IncludesEmployerApplicantServicesTargetEmployer targetEmployer) {
    this.targetEmployer = targetEmployer;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    IncludesEmployerApplicantServices includesEmployerApplicantServices = (IncludesEmployerApplicantServices) o;
    return Objects.equals(this.targetEmployer, includesEmployerApplicantServices.targetEmployer);
  }

  @Override
  public int hashCode() {
    return Objects.hash(targetEmployer);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IncludesEmployerApplicantServices {\n");
    sb.append("    targetEmployer: ").append(toIndentedString(targetEmployer)).append("\n");
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

