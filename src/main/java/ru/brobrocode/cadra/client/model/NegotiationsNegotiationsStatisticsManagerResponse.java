package ru.brobrocode.cadra.client.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.annotation.Generated;
import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;

import java.util.Objects;

/**
 * NegotiationsNegotiationsStatisticsManagerResponse
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2025-08-17T15:41:09.394389505+05:00[Asia/Yekaterinburg]", comments = "Generator version: 7.6.0")
public class NegotiationsNegotiationsStatisticsManagerResponse {

  private NegotiationsNegotiationsStatistics managerStatistics;

  public NegotiationsNegotiationsStatisticsManagerResponse() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public NegotiationsNegotiationsStatisticsManagerResponse(NegotiationsNegotiationsStatistics managerStatistics) {
    this.managerStatistics = managerStatistics;
  }

  public NegotiationsNegotiationsStatisticsManagerResponse managerStatistics(NegotiationsNegotiationsStatistics managerStatistics) {
    this.managerStatistics = managerStatistics;
    return this;
  }

  /**
   * Get managerStatistics
   * @return managerStatistics
  */
  @NotNull @Valid 
  @Schema(name = "manager_statistics", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("manager_statistics")
  public NegotiationsNegotiationsStatistics getManagerStatistics() {
    return managerStatistics;
  }

  public void setManagerStatistics(NegotiationsNegotiationsStatistics managerStatistics) {
    this.managerStatistics = managerStatistics;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    NegotiationsNegotiationsStatisticsManagerResponse negotiationsNegotiationsStatisticsManagerResponse = (NegotiationsNegotiationsStatisticsManagerResponse) o;
    return Objects.equals(this.managerStatistics, negotiationsNegotiationsStatisticsManagerResponse.managerStatistics);
  }

  @Override
  public int hashCode() {
    return Objects.hash(managerStatistics);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class NegotiationsNegotiationsStatisticsManagerResponse {\n");
    sb.append("    managerStatistics: ").append(toIndentedString(managerStatistics)).append("\n");
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

