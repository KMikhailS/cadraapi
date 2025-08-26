package ru.brobrocode.cadra.client.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.annotation.Generated;
import jakarta.validation.constraints.NotNull;

import java.util.Objects;

/**
 * VacancyDraftDraftVacancyError
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2025-08-17T15:41:09.394389505+05:00[Asia/Yekaterinburg]", comments = "Generator version: 7.6.0")
public class VacancyDraftDraftVacancyError {

  private String reason;

  private String value;

  public VacancyDraftDraftVacancyError() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public VacancyDraftDraftVacancyError(String value) {
    this.value = value;
  }

  public VacancyDraftDraftVacancyError reason(String reason) {
    this.reason = reason;
    return this;
  }

  /**
   * Причина ошибки
   * @return reason
  */
  
  @Schema(name = "reason", description = "Причина ошибки", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("reason")
  public String getReason() {
    return reason;
  }

  public void setReason(String reason) {
    this.reason = reason;
  }

  public VacancyDraftDraftVacancyError value(String value) {
    this.value = value;
    return this;
  }

  /**
   * Название поля, в котором допущена ошибка
   * @return value
  */
  @NotNull 
  @Schema(name = "value", description = "Название поля, в котором допущена ошибка", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("value")
  public String getValue() {
    return value;
  }

  public void setValue(String value) {
    this.value = value;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    VacancyDraftDraftVacancyError vacancyDraftDraftVacancyError = (VacancyDraftDraftVacancyError) o;
    return Objects.equals(this.reason, vacancyDraftDraftVacancyError.reason) &&
        Objects.equals(this.value, vacancyDraftDraftVacancyError.value);
  }

  @Override
  public int hashCode() {
    return Objects.hash(reason, value);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class VacancyDraftDraftVacancyError {\n");
    sb.append("    reason: ").append(toIndentedString(reason)).append("\n");
    sb.append("    value: ").append(toIndentedString(value)).append("\n");
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

