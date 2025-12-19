package ru.brobrocode.cadra.client.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.annotation.Generated;
import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;

import java.util.Objects;

/**
 * SalaryStatisticsEvaluationResponse
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2025-08-17T15:41:09.394389505+05:00[Asia/Yekaterinburg]", comments = "Generator version: 7.6.0")
public class SalaryStatisticsEvaluationResponse {

  private SalaryStatisticsMarketSalary marketSalary;

  private SalaryStatisticsResultingParameters resultingParameters;

  public SalaryStatisticsEvaluationResponse() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public SalaryStatisticsEvaluationResponse(SalaryStatisticsMarketSalary marketSalary, SalaryStatisticsResultingParameters resultingParameters) {
    this.marketSalary = marketSalary;
    this.resultingParameters = resultingParameters;
  }

  public SalaryStatisticsEvaluationResponse marketSalary(SalaryStatisticsMarketSalary marketSalary) {
    this.marketSalary = marketSalary;
    return this;
  }

  /**
   * Get marketSalary
   * @return marketSalary
  */
  @NotNull @Valid 
  @Schema(name = "market_salary", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("market_salary")
  public SalaryStatisticsMarketSalary getMarketSalary() {
    return marketSalary;
  }

  public void setMarketSalary(SalaryStatisticsMarketSalary marketSalary) {
    this.marketSalary = marketSalary;
  }

  public SalaryStatisticsEvaluationResponse resultingParameters(SalaryStatisticsResultingParameters resultingParameters) {
    this.resultingParameters = resultingParameters;
    return this;
  }

  /**
   * Get resultingParameters
   * @return resultingParameters
  */
  @NotNull @Valid 
  @Schema(name = "resulting_parameters", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("resulting_parameters")
  public SalaryStatisticsResultingParameters getResultingParameters() {
    return resultingParameters;
  }

  public void setResultingParameters(SalaryStatisticsResultingParameters resultingParameters) {
    this.resultingParameters = resultingParameters;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SalaryStatisticsEvaluationResponse salaryStatisticsEvaluationResponse = (SalaryStatisticsEvaluationResponse) o;
    return Objects.equals(this.marketSalary, salaryStatisticsEvaluationResponse.marketSalary) &&
        Objects.equals(this.resultingParameters, salaryStatisticsEvaluationResponse.resultingParameters);
  }

  @Override
  public int hashCode() {
    return Objects.hash(marketSalary, resultingParameters);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SalaryStatisticsEvaluationResponse {\n");
    sb.append("    marketSalary: ").append(toIndentedString(marketSalary)).append("\n");
    sb.append("    resultingParameters: ").append(toIndentedString(resultingParameters)).append("\n");
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

