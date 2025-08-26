package ru.brobrocode.cadra.client.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.annotation.Generated;
import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * VacanciesVacancyProlongate
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2025-08-17T15:41:09.394389505+05:00[Asia/Yekaterinburg]", comments = "Generator version: 7.6.0")
public class VacanciesVacancyProlongate {

  @Valid
  private List<VacanciesVacancyProlongateActionsInner> actions = new ArrayList<>();

  private String expiresAt;

  private String id;

  public VacanciesVacancyProlongate() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public VacanciesVacancyProlongate(List<VacanciesVacancyProlongateActionsInner> actions, String expiresAt, String id) {
    this.actions = actions;
    this.expiresAt = expiresAt;
    this.id = id;
  }

  public VacanciesVacancyProlongate actions(List<VacanciesVacancyProlongateActionsInner> actions) {
    this.actions = actions;
    return this;
  }

  public VacanciesVacancyProlongate addActionsItem(VacanciesVacancyProlongateActionsInner actionsItem) {
    if (this.actions == null) {
      this.actions = new ArrayList<>();
    }
    this.actions.add(actionsItem);
    return this;
  }

  /**
   * Список действий, которые можно предпринять для продления вакансии
   * @return actions
  */
  @NotNull @Valid 
  @Schema(name = "actions", description = "Список действий, которые можно предпринять для продления вакансии", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("actions")
  public List<VacanciesVacancyProlongateActionsInner> getActions() {
    return actions;
  }

  public void setActions(List<VacanciesVacancyProlongateActionsInner> actions) {
    this.actions = actions;
  }

  public VacanciesVacancyProlongate expiresAt(String expiresAt) {
    this.expiresAt = expiresAt;
    return this;
  }

  /**
   * Дата окончания публикации вакансии
   * @return expiresAt
  */
  @NotNull 
  @Schema(name = "expires_at", description = "Дата окончания публикации вакансии", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("expires_at")
  public String getExpiresAt() {
    return expiresAt;
  }

  public void setExpiresAt(String expiresAt) {
    this.expiresAt = expiresAt;
  }

  public VacanciesVacancyProlongate id(String id) {
    this.id = id;
    return this;
  }

  /**
   * Идентификатор вакансии
   * @return id
  */
  @NotNull 
  @Schema(name = "id", description = "Идентификатор вакансии", requiredMode = Schema.RequiredMode.REQUIRED)
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
    VacanciesVacancyProlongate vacanciesVacancyProlongate = (VacanciesVacancyProlongate) o;
    return Objects.equals(this.actions, vacanciesVacancyProlongate.actions) &&
        Objects.equals(this.expiresAt, vacanciesVacancyProlongate.expiresAt) &&
        Objects.equals(this.id, vacanciesVacancyProlongate.id);
  }

  @Override
  public int hashCode() {
    return Objects.hash(actions, expiresAt, id);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class VacanciesVacancyProlongate {\n");
    sb.append("    actions: ").append(toIndentedString(actions)).append("\n");
    sb.append("    expiresAt: ").append(toIndentedString(expiresAt)).append("\n");
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

