package ru.brobrocode.cadra.client.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.annotation.Generated;
import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;

import java.util.Objects;

/**
 * NegotiationsNegotiationsStatisticsEmployerResponse
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2025-08-17T15:41:09.394389505+05:00[Asia/Yekaterinburg]", comments = "Generator version: 7.6.0")
public class NegotiationsNegotiationsStatisticsEmployerResponse {

  private NegotiationsNegotiationsStatistics employerStatistics;

  public NegotiationsNegotiationsStatisticsEmployerResponse() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public NegotiationsNegotiationsStatisticsEmployerResponse(NegotiationsNegotiationsStatistics employerStatistics) {
    this.employerStatistics = employerStatistics;
  }

  public NegotiationsNegotiationsStatisticsEmployerResponse employerStatistics(NegotiationsNegotiationsStatistics employerStatistics) {
    this.employerStatistics = employerStatistics;
    return this;
  }

  /**
   * Get employerStatistics
   * @return employerStatistics
  */
  @NotNull @Valid 
  @Schema(name = "employer_statistics", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("employer_statistics")
  public NegotiationsNegotiationsStatistics getEmployerStatistics() {
    return employerStatistics;
  }

  public void setEmployerStatistics(NegotiationsNegotiationsStatistics employerStatistics) {
    this.employerStatistics = employerStatistics;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    NegotiationsNegotiationsStatisticsEmployerResponse negotiationsNegotiationsStatisticsEmployerResponse = (NegotiationsNegotiationsStatisticsEmployerResponse) o;
    return Objects.equals(this.employerStatistics, negotiationsNegotiationsStatisticsEmployerResponse.employerStatistics);
  }

  @Override
  public int hashCode() {
    return Objects.hash(employerStatistics);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class NegotiationsNegotiationsStatisticsEmployerResponse {\n");
    sb.append("    employerStatistics: ").append(toIndentedString(employerStatistics)).append("\n");
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

