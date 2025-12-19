package ru.brobrocode.cadra.client.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.annotation.Generated;
import jakarta.validation.constraints.NotNull;

import java.util.Objects;

/**
 * VacanciesUpgradeFieldsWithoutAction
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2025-08-17T15:41:09.394389505+05:00[Asia/Yekaterinburg]", comments = "Generator version: 7.6.0")
public class VacanciesUpgradeFieldsWithoutAction implements VacanciesVacancyUpgradeListItemWithoutActionInner {

  private String reason;

  public VacanciesUpgradeFieldsWithoutAction() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public VacanciesUpgradeFieldsWithoutAction(String reason) {
    this.reason = reason;
  }

  public VacanciesUpgradeFieldsWithoutAction reason(String reason) {
    this.reason = reason;
    return this;
  }

  /**
   * Описание причины, по которой улучшение вакансии до данного типа невозможно
   * @return reason
  */
  @NotNull 
  @Schema(name = "reason", description = "Описание причины, по которой улучшение вакансии до данного типа невозможно", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("reason")
  public String getReason() {
    return reason;
  }

  public void setReason(String reason) {
    this.reason = reason;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    VacanciesUpgradeFieldsWithoutAction vacanciesUpgradeFieldsWithoutAction = (VacanciesUpgradeFieldsWithoutAction) o;
    return Objects.equals(this.reason, vacanciesUpgradeFieldsWithoutAction.reason);
  }

  @Override
  public int hashCode() {
    return Objects.hash(reason);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class VacanciesUpgradeFieldsWithoutAction {\n");
    sb.append("    reason: ").append(toIndentedString(reason)).append("\n");
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

