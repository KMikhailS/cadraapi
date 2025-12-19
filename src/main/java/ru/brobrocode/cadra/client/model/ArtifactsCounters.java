package ru.brobrocode.cadra.client.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.annotation.Generated;
import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;

import java.math.BigDecimal;
import java.util.Objects;

/**
 * ArtifactsCounters
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2025-08-17T15:41:09.394389505+05:00[Asia/Yekaterinburg]", comments = "Generator version: 7.6.0")
public class ArtifactsCounters {

  private BigDecimal max;

  private BigDecimal uploaded;

  public ArtifactsCounters() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public ArtifactsCounters(BigDecimal max, BigDecimal uploaded) {
    this.max = max;
    this.uploaded = uploaded;
  }

  public ArtifactsCounters max(BigDecimal max) {
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

  public ArtifactsCounters uploaded(BigDecimal uploaded) {
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
    ArtifactsCounters artifactsCounters = (ArtifactsCounters) o;
    return Objects.equals(this.max, artifactsCounters.max) &&
        Objects.equals(this.uploaded, artifactsCounters.uploaded);
  }

  @Override
  public int hashCode() {
    return Objects.hash(max, uploaded);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ArtifactsCounters {\n");
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

