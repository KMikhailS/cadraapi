package ru.brobrocode.cadra.client.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.annotation.Generated;
import jakarta.validation.constraints.NotNull;

import java.util.Objects;

/**
 * ResumeViewApplicantResumeAllOfPaidServices
 */

@JsonTypeName("ResumeViewApplicantResume_allOf_paid_services")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2025-08-17T15:41:09.394389505+05:00[Asia/Yekaterinburg]", comments = "Generator version: 7.6.0")
public class ResumeViewApplicantResumeAllOfPaidServices {

  private Boolean active;

  private String expires;

  private String id;

  private String name;

  public ResumeViewApplicantResumeAllOfPaidServices() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public ResumeViewApplicantResumeAllOfPaidServices(Boolean active, String id, String name) {
    this.active = active;
    this.id = id;
    this.name = name;
  }

  public ResumeViewApplicantResumeAllOfPaidServices active(Boolean active) {
    this.active = active;
    return this;
  }

  /**
   * Активна ли в данный момент услуга
   * @return active
  */
  @NotNull 
  @Schema(name = "active", description = "Активна ли в данный момент услуга", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("active")
  public Boolean getActive() {
    return active;
  }

  public void setActive(Boolean active) {
    this.active = active;
  }

  public ResumeViewApplicantResumeAllOfPaidServices expires(String expires) {
    this.expires = expires;
    return this;
  }

  /**
   * Время окончания действия услуги, если услуга активна
   * @return expires
  */
  
  @Schema(name = "expires", description = "Время окончания действия услуги, если услуга активна", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("expires")
  public String getExpires() {
    return expires;
  }

  public void setExpires(String expires) {
    this.expires = expires;
  }

  public ResumeViewApplicantResumeAllOfPaidServices id(String id) {
    this.id = id;
    return this;
  }

  /**
   * Идентификатор услуги
   * @return id
  */
  @NotNull 
  @Schema(name = "id", description = "Идентификатор услуги", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("id")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public ResumeViewApplicantResumeAllOfPaidServices name(String name) {
    this.name = name;
    return this;
  }

  /**
   * Название услуги
   * @return name
  */
  @NotNull 
  @Schema(name = "name", description = "Название услуги", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("name")
  public String getName() {
    return name;
  }

  public void setName(String name) {
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
    ResumeViewApplicantResumeAllOfPaidServices resumeViewApplicantResumeAllOfPaidServices = (ResumeViewApplicantResumeAllOfPaidServices) o;
    return Objects.equals(this.active, resumeViewApplicantResumeAllOfPaidServices.active) &&
        Objects.equals(this.expires, resumeViewApplicantResumeAllOfPaidServices.expires) &&
        Objects.equals(this.id, resumeViewApplicantResumeAllOfPaidServices.id) &&
        Objects.equals(this.name, resumeViewApplicantResumeAllOfPaidServices.name);
  }

  @Override
  public int hashCode() {
    return Objects.hash(active, expires, id, name);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ResumeViewApplicantResumeAllOfPaidServices {\n");
    sb.append("    active: ").append(toIndentedString(active)).append("\n");
    sb.append("    expires: ").append(toIndentedString(expires)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
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

