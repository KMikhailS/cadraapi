package ru.brobrocode.cadra.client.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.annotation.Generated;
import jakarta.validation.Valid;

import java.math.BigDecimal;
import java.util.Objects;

/**
 * ResumeObjectsTotalExperience
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2025-08-17T15:41:09.394389505+05:00[Asia/Yekaterinburg]", comments = "Generator version: 7.6.0")
public class ResumeObjectsTotalExperience {

  private BigDecimal months = null;

  public ResumeObjectsTotalExperience months(BigDecimal months) {
    this.months = months;
    return this;
  }

  /**
   * Общий опыт работы в месяцах, с округлением до месяца
   * @return months
  */
  @Valid 
  @Schema(name = "months", description = "Общий опыт работы в месяцах, с округлением до месяца", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("months")
  public BigDecimal getMonths() {
    return months;
  }

  public void setMonths(BigDecimal months) {
    this.months = months;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ResumeObjectsTotalExperience resumeObjectsTotalExperience = (ResumeObjectsTotalExperience) o;
    return Objects.equals(this.months, resumeObjectsTotalExperience.months);
  }

  @Override
  public int hashCode() {
    return Objects.hash(months);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ResumeObjectsTotalExperience {\n");
    sb.append("    months: ").append(toIndentedString(months)).append("\n");
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

