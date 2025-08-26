package ru.brobrocode.cadra.client.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.annotation.Generated;
import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;

import java.util.Objects;

/**
 * EmployerManagersEmployerManagerLimits
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2025-08-17T15:41:09.394389505+05:00[Asia/Yekaterinburg]", comments = "Generator version: 7.6.0")
public class EmployerManagersEmployerManagerLimits {

  private EmployerManagersResumeView left;

  private EmployerManagersResumeView limits;

  private EmployerManagersResumeView spend;

  public EmployerManagersEmployerManagerLimits() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public EmployerManagersEmployerManagerLimits(EmployerManagersResumeView left, EmployerManagersResumeView limits, EmployerManagersResumeView spend) {
    this.left = left;
    this.limits = limits;
    this.spend = spend;
  }

  public EmployerManagersEmployerManagerLimits left(EmployerManagersResumeView left) {
    this.left = left;
    return this;
  }

  /**
   * Количество оставшихся просмотров резюме. В этом параметре содержится лимит просмотров на компанию. Из-за этого он может быть меньше, чем доступно текущему пользователю
   * @return left
  */
  @NotNull @Valid 
  @Schema(name = "left", description = "Количество оставшихся просмотров резюме. В этом параметре содержится лимит просмотров на компанию. Из-за этого он может быть меньше, чем доступно текущему пользователю", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("left")
  public EmployerManagersResumeView getLeft() {
    return left;
  }

  public void setLeft(EmployerManagersResumeView left) {
    this.left = left;
  }

  public EmployerManagersEmployerManagerLimits limits(EmployerManagersResumeView limits) {
    this.limits = limits;
    return this;
  }

  /**
   * Лимит на просмотр резюме
   * @return limits
  */
  @NotNull @Valid 
  @Schema(name = "limits", description = "Лимит на просмотр резюме", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("limits")
  public EmployerManagersResumeView getLimits() {
    return limits;
  }

  public void setLimits(EmployerManagersResumeView limits) {
    this.limits = limits;
  }

  public EmployerManagersEmployerManagerLimits spend(EmployerManagersResumeView spend) {
    this.spend = spend;
    return this;
  }

  /**
   * Количество просмотренных резюме
   * @return spend
  */
  @NotNull @Valid 
  @Schema(name = "spend", description = "Количество просмотренных резюме", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("spend")
  public EmployerManagersResumeView getSpend() {
    return spend;
  }

  public void setSpend(EmployerManagersResumeView spend) {
    this.spend = spend;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EmployerManagersEmployerManagerLimits employerManagersEmployerManagerLimits = (EmployerManagersEmployerManagerLimits) o;
    return Objects.equals(this.left, employerManagersEmployerManagerLimits.left) &&
        Objects.equals(this.limits, employerManagersEmployerManagerLimits.limits) &&
        Objects.equals(this.spend, employerManagersEmployerManagerLimits.spend);
  }

  @Override
  public int hashCode() {
    return Objects.hash(left, limits, spend);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EmployerManagersEmployerManagerLimits {\n");
    sb.append("    left: ").append(toIndentedString(left)).append("\n");
    sb.append("    limits: ").append(toIndentedString(limits)).append("\n");
    sb.append("    spend: ").append(toIndentedString(spend)).append("\n");
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

