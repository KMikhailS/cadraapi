package ru.brobrocode.cadra.client.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.annotation.Generated;
import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;

import java.util.Objects;

/**
 * VacanciesVacancyProlongateUnavailableActions
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2025-08-17T15:41:09.394389505+05:00[Asia/Yekaterinburg]", comments = "Generator version: 7.6.0")
public class VacanciesVacancyProlongateUnavailableActions implements VacanciesVacancyProlongateActionsInner {

  private VacanciesVacancyProlongateUnavailableActionsDisableReason disableReason;

  private Boolean enabled;

  private String id;

  public VacanciesVacancyProlongateUnavailableActions() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public VacanciesVacancyProlongateUnavailableActions(VacanciesVacancyProlongateUnavailableActionsDisableReason disableReason, Boolean enabled, String id) {
    this.disableReason = disableReason;
    this.enabled = enabled;
    this.id = id;
  }

  public VacanciesVacancyProlongateUnavailableActions disableReason(VacanciesVacancyProlongateUnavailableActionsDisableReason disableReason) {
    this.disableReason = disableReason;
    return this;
  }

  /**
   * Get disableReason
   * @return disableReason
  */
  @NotNull @Valid 
  @Schema(name = "disable_reason", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("disable_reason")
  public VacanciesVacancyProlongateUnavailableActionsDisableReason getDisableReason() {
    return disableReason;
  }

  public void setDisableReason(VacanciesVacancyProlongateUnavailableActionsDisableReason disableReason) {
    this.disableReason = disableReason;
  }

  public VacanciesVacancyProlongateUnavailableActions enabled(Boolean enabled) {
    this.enabled = enabled;
    return this;
  }

  /**
   * Возможно ли выполнить действие
   * @return enabled
  */
  @NotNull 
  @Schema(name = "enabled", description = "Возможно ли выполнить действие", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("enabled")
  public Boolean getEnabled() {
    return enabled;
  }

  public void setEnabled(Boolean enabled) {
    this.enabled = enabled;
  }

  public VacanciesVacancyProlongateUnavailableActions id(String id) {
    this.id = id;
    return this;
  }

  /**
   * Идентификатор действия
   * @return id
  */
  @NotNull 
  @Schema(name = "id", description = "Идентификатор действия", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("id")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    VacanciesVacancyProlongateUnavailableActions vacanciesVacancyProlongateUnavailableActions = (VacanciesVacancyProlongateUnavailableActions) o;
    return Objects.equals(this.disableReason, vacanciesVacancyProlongateUnavailableActions.disableReason) &&
        Objects.equals(this.enabled, vacanciesVacancyProlongateUnavailableActions.enabled) &&
        Objects.equals(this.id, vacanciesVacancyProlongateUnavailableActions.id);
  }

  @Override
  public int hashCode() {
    return Objects.hash(disableReason, enabled, id);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class VacanciesVacancyProlongateUnavailableActions {\n");
    sb.append("    disableReason: ").append(toIndentedString(disableReason)).append("\n");
    sb.append("    enabled: ").append(toIndentedString(enabled)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
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

