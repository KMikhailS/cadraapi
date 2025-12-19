package ru.brobrocode.cadra.client.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.annotation.Generated;
import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;

import java.math.BigDecimal;
import java.util.Objects;

/**
 * ResumeObjectsOwnerCommentsCounters
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2025-08-17T15:41:09.394389505+05:00[Asia/Yekaterinburg]", comments = "Generator version: 7.6.0")
public class ResumeObjectsOwnerCommentsCounters {

  private BigDecimal total;

  public ResumeObjectsOwnerCommentsCounters() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public ResumeObjectsOwnerCommentsCounters(BigDecimal total) {
    this.total = total;
  }

  public ResumeObjectsOwnerCommentsCounters total(BigDecimal total) {
    this.total = total;
    return this;
  }

  /**
   * Общее количество комментариев
   * @return total
  */
  @NotNull @Valid 
  @Schema(name = "total", description = "Общее количество комментариев", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("total")
  public BigDecimal getTotal() {
    return total;
  }

  public void setTotal(BigDecimal total) {
    this.total = total;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ResumeObjectsOwnerCommentsCounters resumeObjectsOwnerCommentsCounters = (ResumeObjectsOwnerCommentsCounters) o;
    return Objects.equals(this.total, resumeObjectsOwnerCommentsCounters.total);
  }

  @Override
  public int hashCode() {
    return Objects.hash(total);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ResumeObjectsOwnerCommentsCounters {\n");
    sb.append("    total: ").append(toIndentedString(total)).append("\n");
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

