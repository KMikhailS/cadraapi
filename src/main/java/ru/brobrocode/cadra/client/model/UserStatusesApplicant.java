package ru.brobrocode.cadra.client.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.annotation.Generated;
import jakarta.validation.Valid;

import java.util.Objects;

/**
 * UserStatusesApplicant
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2025-08-17T15:41:09.394389505+05:00[Asia/Yekaterinburg]", comments = "Generator version: 7.6.0")
public class UserStatusesApplicant {

  private UserStatusesJobSearchStatus jobSearchStatus;

  public UserStatusesApplicant jobSearchStatus(UserStatusesJobSearchStatus jobSearchStatus) {
    this.jobSearchStatus = jobSearchStatus;
    return this;
  }

  /**
   * Get jobSearchStatus
   * @return jobSearchStatus
  */
  @Valid 
  @Schema(name = "job_search_status", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("job_search_status")
  public UserStatusesJobSearchStatus getJobSearchStatus() {
    return jobSearchStatus;
  }

  public void setJobSearchStatus(UserStatusesJobSearchStatus jobSearchStatus) {
    this.jobSearchStatus = jobSearchStatus;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UserStatusesApplicant userStatusesApplicant = (UserStatusesApplicant) o;
    return Objects.equals(this.jobSearchStatus, userStatusesApplicant.jobSearchStatus);
  }

  @Override
  public int hashCode() {
    return Objects.hash(jobSearchStatus);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UserStatusesApplicant {\n");
    sb.append("    jobSearchStatus: ").append(toIndentedString(jobSearchStatus)).append("\n");
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

