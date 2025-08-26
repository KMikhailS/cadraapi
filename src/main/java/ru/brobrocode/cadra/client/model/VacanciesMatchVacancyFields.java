package ru.brobrocode.cadra.client.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.annotation.Generated;
import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * VacanciesMatchVacancyFields
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2025-08-17T15:41:09.394389505+05:00[Asia/Yekaterinburg]", comments = "Generator version: 7.6.0")
public class VacanciesMatchVacancyFields {

  private VacanciesAddress address = null;

  private Boolean canInvite;

  private String createdAt;

  private IncludesIdName employerNegotiationsState = null;

  private VacancyManagerOutput manager;

  @Valid
  private List<@Valid VacancyNegotiationActions> negotiationsActions = new ArrayList<>();

  private IncludesIdName negotiationsState = null;

  private BigDecimal sortPointDistance = null;

  @Valid
  private List<@Valid VacancyTemplates> templates = new ArrayList<>();

  public VacanciesMatchVacancyFields() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public VacanciesMatchVacancyFields(Boolean canInvite, String createdAt, IncludesIdName employerNegotiationsState, VacancyManagerOutput manager, List<@Valid VacancyNegotiationActions> negotiationsActions, IncludesIdName negotiationsState) {
    this.canInvite = canInvite;
    this.createdAt = createdAt;
    this.employerNegotiationsState = employerNegotiationsState;
    this.manager = manager;
    this.negotiationsActions = negotiationsActions;
    this.negotiationsState = negotiationsState;
  }

  public VacanciesMatchVacancyFields address(VacanciesAddress address) {
    this.address = address;
    return this;
  }

  /**
   * Get address
   * @return address
  */
  @Valid 
  @Schema(name = "address", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("address")
  public VacanciesAddress getAddress() {
    return address;
  }

  public void setAddress(VacanciesAddress address) {
    this.address = address;
  }

  public VacanciesMatchVacancyFields canInvite(Boolean canInvite) {
    this.canInvite = canInvite;
    return this;
  }

  /**
   * Можно ли пригласить соискателя на данную вакансию
   * @return canInvite
  */
  @NotNull 
  @Schema(name = "can_invite", description = "Можно ли пригласить соискателя на данную вакансию", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("can_invite")
  public Boolean getCanInvite() {
    return canInvite;
  }

  public void setCanInvite(Boolean canInvite) {
    this.canInvite = canInvite;
  }

  public VacanciesMatchVacancyFields createdAt(String createdAt) {
    this.createdAt = createdAt;
    return this;
  }

  /**
   * Дата и время публикации вакансии
   * @return createdAt
  */
  @NotNull 
  @Schema(name = "created_at", description = "Дата и время публикации вакансии", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("created_at")
  public String getCreatedAt() {
    return createdAt;
  }

  public void setCreatedAt(String createdAt) {
    this.createdAt = createdAt;
  }

  public VacanciesMatchVacancyFields employerNegotiationsState(IncludesIdName employerNegotiationsState) {
    this.employerNegotiationsState = employerNegotiationsState;
    return this;
  }

  /**
   * Get employerNegotiationsState
   * @return employerNegotiationsState
  */
  @NotNull @Valid 
  @Schema(name = "employer_negotiations_state", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("employer_negotiations_state")
  public IncludesIdName getEmployerNegotiationsState() {
    return employerNegotiationsState;
  }

  public void setEmployerNegotiationsState(IncludesIdName employerNegotiationsState) {
    this.employerNegotiationsState = employerNegotiationsState;
  }

  public VacanciesMatchVacancyFields manager(VacancyManagerOutput manager) {
    this.manager = manager;
    return this;
  }

  /**
   * Get manager
   * @return manager
  */
  @NotNull @Valid 
  @Schema(name = "manager", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("manager")
  public VacancyManagerOutput getManager() {
    return manager;
  }

  public void setManager(VacancyManagerOutput manager) {
    this.manager = manager;
  }

  public VacanciesMatchVacancyFields negotiationsActions(List<@Valid VacancyNegotiationActions> negotiationsActions) {
    this.negotiationsActions = negotiationsActions;
    return this;
  }

  public VacanciesMatchVacancyFields addNegotiationsActionsItem(VacancyNegotiationActions negotiationsActionsItem) {
    if (this.negotiationsActions == null) {
      this.negotiationsActions = new ArrayList<>();
    }
    this.negotiationsActions.add(negotiationsActionsItem);
    return this;
  }

  /**
   * Действия для [создания отклика](#tag/Otklikipriglasheniya-rabotodatelya/operation/invite-applicant-to-vacancy). Если создать отклик невозможно (например, нет нужных услуг), то вернется пустой массив
   * @return negotiationsActions
  */
  @NotNull @Valid @Size(min = 0) 
  @Schema(name = "negotiations_actions", description = "Действия для [создания отклика](#tag/Otklikipriglasheniya-rabotodatelya/operation/invite-applicant-to-vacancy). Если создать отклик невозможно (например, нет нужных услуг), то вернется пустой массив", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("negotiations_actions")
  public List<@Valid VacancyNegotiationActions> getNegotiationsActions() {
    return negotiationsActions;
  }

  public void setNegotiationsActions(List<@Valid VacancyNegotiationActions> negotiationsActions) {
    this.negotiationsActions = negotiationsActions;
  }

  public VacanciesMatchVacancyFields negotiationsState(IncludesIdName negotiationsState) {
    this.negotiationsState = negotiationsState;
    return this;
  }

  /**
   * Get negotiationsState
   * @return negotiationsState
  */
  @NotNull @Valid 
  @Schema(name = "negotiations_state", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("negotiations_state")
  public IncludesIdName getNegotiationsState() {
    return negotiationsState;
  }

  public void setNegotiationsState(IncludesIdName negotiationsState) {
    this.negotiationsState = negotiationsState;
  }

  public VacanciesMatchVacancyFields sortPointDistance(BigDecimal sortPointDistance) {
    this.sortPointDistance = sortPointDistance;
    return this;
  }

  /**
   * Расстояние в метрах между центром сортировки (заданной параметрами `sort_point_lat`, `sort_point_lng`) и указанным в вакансии адресом. В случае, если в адресе указаны только станции метро, выдается расстояние между центром сортировки и средней геометрической точкой указанных станций. Значение `sort_point_distance` выдается только в случае, если заданы параметры `sort_point_lat`, `sort_point_lng`, `order_by=distance` 
   * @return sortPointDistance
  */
  @Valid 
  @Schema(name = "sort_point_distance", description = "Расстояние в метрах между центром сортировки (заданной параметрами `sort_point_lat`, `sort_point_lng`) и указанным в вакансии адресом. В случае, если в адресе указаны только станции метро, выдается расстояние между центром сортировки и средней геометрической точкой указанных станций. Значение `sort_point_distance` выдается только в случае, если заданы параметры `sort_point_lat`, `sort_point_lng`, `order_by=distance` ", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("sort_point_distance")
  public BigDecimal getSortPointDistance() {
    return sortPointDistance;
  }

  public void setSortPointDistance(BigDecimal sortPointDistance) {
    this.sortPointDistance = sortPointDistance;
  }

  public VacanciesMatchVacancyFields templates(List<@Valid VacancyTemplates> templates) {
    this.templates = templates;
    return this;
  }

  public VacanciesMatchVacancyFields addTemplatesItem(VacancyTemplates templatesItem) {
    if (this.templates == null) {
      this.templates = new ArrayList<>();
    }
    this.templates.add(templatesItem);
    return this;
  }

  /**
   * Шаблоны писем
   * @return templates
  */
  @Valid 
  @Schema(name = "templates", description = "Шаблоны писем", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("templates")
  public List<@Valid VacancyTemplates> getTemplates() {
    return templates;
  }

  public void setTemplates(List<@Valid VacancyTemplates> templates) {
    this.templates = templates;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    VacanciesMatchVacancyFields vacanciesMatchVacancyFields = (VacanciesMatchVacancyFields) o;
    return Objects.equals(this.address, vacanciesMatchVacancyFields.address) &&
        Objects.equals(this.canInvite, vacanciesMatchVacancyFields.canInvite) &&
        Objects.equals(this.createdAt, vacanciesMatchVacancyFields.createdAt) &&
        Objects.equals(this.employerNegotiationsState, vacanciesMatchVacancyFields.employerNegotiationsState) &&
        Objects.equals(this.manager, vacanciesMatchVacancyFields.manager) &&
        Objects.equals(this.negotiationsActions, vacanciesMatchVacancyFields.negotiationsActions) &&
        Objects.equals(this.negotiationsState, vacanciesMatchVacancyFields.negotiationsState) &&
        Objects.equals(this.sortPointDistance, vacanciesMatchVacancyFields.sortPointDistance) &&
        Objects.equals(this.templates, vacanciesMatchVacancyFields.templates);
  }

  @Override
  public int hashCode() {
    return Objects.hash(address, canInvite, createdAt, employerNegotiationsState, manager, negotiationsActions, negotiationsState, sortPointDistance, templates);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class VacanciesMatchVacancyFields {\n");
    sb.append("    address: ").append(toIndentedString(address)).append("\n");
    sb.append("    canInvite: ").append(toIndentedString(canInvite)).append("\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    employerNegotiationsState: ").append(toIndentedString(employerNegotiationsState)).append("\n");
    sb.append("    manager: ").append(toIndentedString(manager)).append("\n");
    sb.append("    negotiationsActions: ").append(toIndentedString(negotiationsActions)).append("\n");
    sb.append("    negotiationsState: ").append(toIndentedString(negotiationsState)).append("\n");
    sb.append("    sortPointDistance: ").append(toIndentedString(sortPointDistance)).append("\n");
    sb.append("    templates: ").append(toIndentedString(templates)).append("\n");
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

