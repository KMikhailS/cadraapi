package ru.brobrocode.cadra.client.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.annotation.Generated;
import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;

import java.util.Objects;

/**
 * ArtifactsArtifactConditions
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2025-08-17T15:41:09.394389505+05:00[Asia/Yekaterinburg]", comments = "Generator version: 7.6.0")
public class ArtifactsArtifactConditions {

  private ArtifactsArtifactConditionsCounters counters;

  private ArtifactsArtifactConditionsFields fields;

  public ArtifactsArtifactConditions() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public ArtifactsArtifactConditions(ArtifactsArtifactConditionsCounters counters, ArtifactsArtifactConditionsFields fields) {
    this.counters = counters;
    this.fields = fields;
  }

  public ArtifactsArtifactConditions counters(ArtifactsArtifactConditionsCounters counters) {
    this.counters = counters;
    return this;
  }

  /**
   * Get counters
   * @return counters
  */
  @NotNull @Valid 
  @Schema(name = "counters", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("counters")
  public ArtifactsArtifactConditionsCounters getCounters() {
    return counters;
  }

  public void setCounters(ArtifactsArtifactConditionsCounters counters) {
    this.counters = counters;
  }

  public ArtifactsArtifactConditions fields(ArtifactsArtifactConditionsFields fields) {
    this.fields = fields;
    return this;
  }

  /**
   * Get fields
   * @return fields
  */
  @NotNull @Valid 
  @Schema(name = "fields", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("fields")
  public ArtifactsArtifactConditionsFields getFields() {
    return fields;
  }

  public void setFields(ArtifactsArtifactConditionsFields fields) {
    this.fields = fields;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ArtifactsArtifactConditions artifactsArtifactConditions = (ArtifactsArtifactConditions) o;
    return Objects.equals(this.counters, artifactsArtifactConditions.counters) &&
        Objects.equals(this.fields, artifactsArtifactConditions.fields);
  }

  @Override
  public int hashCode() {
    return Objects.hash(counters, fields);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ArtifactsArtifactConditions {\n");
    sb.append("    counters: ").append(toIndentedString(counters)).append("\n");
    sb.append("    fields: ").append(toIndentedString(fields)).append("\n");
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

