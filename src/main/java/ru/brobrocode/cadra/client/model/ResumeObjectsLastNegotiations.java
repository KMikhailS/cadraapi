package ru.brobrocode.cadra.client.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.annotation.Generated;
import jakarta.validation.Valid;

import java.util.Objects;

/**
 * ResumeObjectsLastNegotiations
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2025-08-17T15:41:09.394389505+05:00[Asia/Yekaterinburg]", comments = "Generator version: 7.6.0")
public class ResumeObjectsLastNegotiations {

  private ResumesNegotiationNano lastNegotiation = null;

  public ResumeObjectsLastNegotiations lastNegotiation(ResumesNegotiationNano lastNegotiation) {
    this.lastNegotiation = lastNegotiation;
    return this;
  }

  /**
   * Get lastNegotiation
   * @return lastNegotiation
  */
  @Valid 
  @Schema(name = "last_negotiation", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("last_negotiation")
  public ResumesNegotiationNano getLastNegotiation() {
    return lastNegotiation;
  }

  public void setLastNegotiation(ResumesNegotiationNano lastNegotiation) {
    this.lastNegotiation = lastNegotiation;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ResumeObjectsLastNegotiations resumeObjectsLastNegotiations = (ResumeObjectsLastNegotiations) o;
    return Objects.equals(this.lastNegotiation, resumeObjectsLastNegotiations.lastNegotiation);
  }

  @Override
  public int hashCode() {
    return Objects.hash(lastNegotiation);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ResumeObjectsLastNegotiations {\n");
    sb.append("    lastNegotiation: ").append(toIndentedString(lastNegotiation)).append("\n");
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

