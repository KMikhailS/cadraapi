package ru.brobrocode.cadra.client.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.annotation.Generated;
import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * VacanciesVacancyUpgradeListItem
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2025-08-17T15:41:09.394389505+05:00[Asia/Yekaterinburg]", comments = "Generator version: 7.6.0")
public class VacanciesVacancyUpgradeListItem {

  @Valid
  private List<@Valid VacanciesUpgradeFieldsAction> actions = new ArrayList<>();

  private VacanciesUpgradeFieldsBillingTypeFull vacancyBillingType;

  @Valid
  private List<VacanciesVacancyUpgradeListItemWithoutActionInner> withoutAction;

  public VacanciesVacancyUpgradeListItem() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public VacanciesVacancyUpgradeListItem(List<@Valid VacanciesUpgradeFieldsAction> actions, VacanciesUpgradeFieldsBillingTypeFull vacancyBillingType) {
    this.actions = actions;
    this.vacancyBillingType = vacancyBillingType;
  }

  public VacanciesVacancyUpgradeListItem actions(List<@Valid VacanciesUpgradeFieldsAction> actions) {
    this.actions = actions;
    return this;
  }

  public VacanciesVacancyUpgradeListItem addActionsItem(VacanciesUpgradeFieldsAction actionsItem) {
    if (this.actions == null) {
      this.actions = new ArrayList<>();
    }
    this.actions.add(actionsItem);
    return this;
  }

  /**
   * Список возможных действий
   * @return actions
  */
  @NotNull @Valid @Size(min = 0) 
  @Schema(name = "actions", description = "Список возможных действий", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("actions")
  public List<@Valid VacanciesUpgradeFieldsAction> getActions() {
    return actions;
  }

  public void setActions(List<@Valid VacanciesUpgradeFieldsAction> actions) {
    this.actions = actions;
  }

  public VacanciesVacancyUpgradeListItem vacancyBillingType(VacanciesUpgradeFieldsBillingTypeFull vacancyBillingType) {
    this.vacancyBillingType = vacancyBillingType;
    return this;
  }

  /**
   * Get vacancyBillingType
   * @return vacancyBillingType
  */
  @NotNull @Valid 
  @Schema(name = "vacancy_billing_type", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("vacancy_billing_type")
  public VacanciesUpgradeFieldsBillingTypeFull getVacancyBillingType() {
    return vacancyBillingType;
  }

  public void setVacancyBillingType(VacanciesUpgradeFieldsBillingTypeFull vacancyBillingType) {
    this.vacancyBillingType = vacancyBillingType;
  }

  public VacanciesVacancyUpgradeListItem withoutAction(List<VacanciesVacancyUpgradeListItemWithoutActionInner> withoutAction) {
    this.withoutAction = withoutAction;
    return this;
  }

  public VacanciesVacancyUpgradeListItem addWithoutActionItem(VacanciesVacancyUpgradeListItemWithoutActionInner withoutActionItem) {
    if (this.withoutAction == null) {
      this.withoutAction = new ArrayList<>();
    }
    this.withoutAction.add(withoutActionItem);
    return this;
  }

  /**
   * Объект с описанием причины, по которой невозможно улучшить вакансию до данного типа. `Null`, если массив `actions` не пустой
   * @return withoutAction
  */
  @Valid 
  @Schema(name = "without_action", description = "Объект с описанием причины, по которой невозможно улучшить вакансию до данного типа. `Null`, если массив `actions` не пустой", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("without_action")
  public List<VacanciesVacancyUpgradeListItemWithoutActionInner> getWithoutAction() {
    return withoutAction;
  }

  public void setWithoutAction(List<VacanciesVacancyUpgradeListItemWithoutActionInner> withoutAction) {
    this.withoutAction = withoutAction;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    VacanciesVacancyUpgradeListItem vacanciesVacancyUpgradeListItem = (VacanciesVacancyUpgradeListItem) o;
    return Objects.equals(this.actions, vacanciesVacancyUpgradeListItem.actions) &&
        Objects.equals(this.vacancyBillingType, vacanciesVacancyUpgradeListItem.vacancyBillingType) &&
        Objects.equals(this.withoutAction, vacanciesVacancyUpgradeListItem.withoutAction);
  }

  @Override
  public int hashCode() {
    return Objects.hash(actions, vacancyBillingType, withoutAction);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class VacanciesVacancyUpgradeListItem {\n");
    sb.append("    actions: ").append(toIndentedString(actions)).append("\n");
    sb.append("    vacancyBillingType: ").append(toIndentedString(vacancyBillingType)).append("\n");
    sb.append("    withoutAction: ").append(toIndentedString(withoutAction)).append("\n");
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

