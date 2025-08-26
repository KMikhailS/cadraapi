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
 * SkillVerificationsResultScore
 */

@JsonTypeName("SkillVerificationsResult_score")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2025-08-17T15:41:09.394389505+05:00[Asia/Yekaterinburg]", comments = "Generator version: 7.6.0")
public class SkillVerificationsResultScore {

  private BigDecimal actual;

  private BigDecimal max;

  public SkillVerificationsResultScore() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public SkillVerificationsResultScore(BigDecimal actual, BigDecimal max) {
    this.actual = actual;
    this.max = max;
  }

  public SkillVerificationsResultScore actual(BigDecimal actual) {
    this.actual = actual;
    return this;
  }

  /**
   * Набранное количество очков
   * @return actual
  */
  @NotNull @Valid 
  @Schema(name = "actual", description = "Набранное количество очков", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("actual")
  public BigDecimal getActual() {
    return actual;
  }

  public void setActual(BigDecimal actual) {
    this.actual = actual;
  }

  public SkillVerificationsResultScore max(BigDecimal max) {
    this.max = max;
    return this;
  }

  /**
   * Максимальное количество очков
   * @return max
  */
  @NotNull @Valid 
  @Schema(name = "max", description = "Максимальное количество очков", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("max")
  public BigDecimal getMax() {
    return max;
  }

  public void setMax(BigDecimal max) {
    this.max = max;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SkillVerificationsResultScore skillVerificationsResultScore = (SkillVerificationsResultScore) o;
    return Objects.equals(this.actual, skillVerificationsResultScore.actual) &&
        Objects.equals(this.max, skillVerificationsResultScore.max);
  }

  @Override
  public int hashCode() {
    return Objects.hash(actual, max);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SkillVerificationsResultScore {\n");
    sb.append("    actual: ").append(toIndentedString(actual)).append("\n");
    sb.append("    max: ").append(toIndentedString(max)).append("\n");
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

