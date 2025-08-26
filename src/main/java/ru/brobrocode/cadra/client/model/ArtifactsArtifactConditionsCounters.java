package ru.brobrocode.cadra.client.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.annotation.Generated;
import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;

import java.math.BigDecimal;
import java.util.Objects;

/**
 * Счетчик артефактов данного типа
 */

@Schema(name = "ArtifactsArtifactConditions_counters", description = "Счетчик артефактов данного типа")
@JsonTypeName("ArtifactsArtifactConditions_counters")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2025-08-17T15:41:09.394389505+05:00[Asia/Yekaterinburg]", comments = "Generator version: 7.6.0")
public class ArtifactsArtifactConditionsCounters {

  private BigDecimal max;

  private BigDecimal uploaded;

  public ArtifactsArtifactConditionsCounters() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public ArtifactsArtifactConditionsCounters(BigDecimal max, BigDecimal uploaded) {
    this.max = max;
    this.uploaded = uploaded;
  }

  public ArtifactsArtifactConditionsCounters max(BigDecimal max) {
    this.max = max;
    return this;
  }

  /**
   * Максимально возможное количество артефактов данного типа, которое можно загрузить
   * @return max
  */
  @NotNull @Valid 
  @Schema(name = "max", description = "Максимально возможное количество артефактов данного типа, которое можно загрузить", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("max")
  public BigDecimal getMax() {
    return max;
  }

  public void setMax(BigDecimal max) {
    this.max = max;
  }

  public ArtifactsArtifactConditionsCounters uploaded(BigDecimal uploaded) {
    this.uploaded = uploaded;
    return this;
  }

  /**
   * Количество уже загруженных артефактов данного типа
   * @return uploaded
  */
  @NotNull @Valid 
  @Schema(name = "uploaded", description = "Количество уже загруженных артефактов данного типа", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("uploaded")
  public BigDecimal getUploaded() {
    return uploaded;
  }

  public void setUploaded(BigDecimal uploaded) {
    this.uploaded = uploaded;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ArtifactsArtifactConditionsCounters artifactsArtifactConditionsCounters = (ArtifactsArtifactConditionsCounters) o;
    return Objects.equals(this.max, artifactsArtifactConditionsCounters.max) &&
        Objects.equals(this.uploaded, artifactsArtifactConditionsCounters.uploaded);
  }

  @Override
  public int hashCode() {
    return Objects.hash(max, uploaded);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ArtifactsArtifactConditionsCounters {\n");
    sb.append("    max: ").append(toIndentedString(max)).append("\n");
    sb.append("    uploaded: ").append(toIndentedString(uploaded)).append("\n");
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

