package ru.brobrocode.cadra.client.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.annotation.Generated;
import jakarta.validation.Valid;

import java.math.BigDecimal;
import java.util.Objects;

/**
 * Услуга \\\&quot;Хочу тут работать\\\&quot;
 */

@Schema(name = "_IncludesEmployerApplicantServices_target_employer", description = "Услуга \\\"Хочу тут работать\\\"")
@JsonTypeName("_IncludesEmployerApplicantServices_target_employer")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2025-08-17T15:41:09.394389505+05:00[Asia/Yekaterinburg]", comments = "Generator version: 7.6.0")
public class IncludesEmployerApplicantServicesTargetEmployer {

  private BigDecimal count;

  public IncludesEmployerApplicantServicesTargetEmployer count(BigDecimal count) {
    this.count = count;
    return this;
  }

  /**
   * Количество резюме текущего соискателя, к которым подключена услуга \\\"Хочу тут работать\\\"
   * @return count
  */
  @Valid 
  @Schema(name = "count", description = "Количество резюме текущего соискателя, к которым подключена услуга \\\"Хочу тут работать\\\"", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("count")
  public BigDecimal getCount() {
    return count;
  }

  public void setCount(BigDecimal count) {
    this.count = count;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    IncludesEmployerApplicantServicesTargetEmployer includesEmployerApplicantServicesTargetEmployer = (IncludesEmployerApplicantServicesTargetEmployer) o;
    return Objects.equals(this.count, includesEmployerApplicantServicesTargetEmployer.count);
  }

  @Override
  public int hashCode() {
    return Objects.hash(count);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IncludesEmployerApplicantServicesTargetEmployer {\n");
    sb.append("    count: ").append(toIndentedString(count)).append("\n");
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

