package ru.brobrocode.cadra.client.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.annotation.Generated;
import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;

import java.util.Objects;

/**
 * NegotiationsNegotiationTestResultsResponse
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2025-08-17T15:41:09.394389505+05:00[Asia/Yekaterinburg]", comments = "Generator version: 7.6.0")
public class NegotiationsNegotiationTestResultsResponse {

  private NegotiationsNegotiationTestResultsResponseTestResult testResult;

  public NegotiationsNegotiationTestResultsResponse() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public NegotiationsNegotiationTestResultsResponse(NegotiationsNegotiationTestResultsResponseTestResult testResult) {
    this.testResult = testResult;
  }

  public NegotiationsNegotiationTestResultsResponse testResult(NegotiationsNegotiationTestResultsResponseTestResult testResult) {
    this.testResult = testResult;
    return this;
  }

  /**
   * Get testResult
   * @return testResult
  */
  @NotNull @Valid 
  @Schema(name = "test_result", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("test_result")
  public NegotiationsNegotiationTestResultsResponseTestResult getTestResult() {
    return testResult;
  }

  public void setTestResult(NegotiationsNegotiationTestResultsResponseTestResult testResult) {
    this.testResult = testResult;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    NegotiationsNegotiationTestResultsResponse negotiationsNegotiationTestResultsResponse = (NegotiationsNegotiationTestResultsResponse) o;
    return Objects.equals(this.testResult, negotiationsNegotiationTestResultsResponse.testResult);
  }

  @Override
  public int hashCode() {
    return Objects.hash(testResult);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class NegotiationsNegotiationTestResultsResponse {\n");
    sb.append("    testResult: ").append(toIndentedString(testResult)).append("\n");
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

