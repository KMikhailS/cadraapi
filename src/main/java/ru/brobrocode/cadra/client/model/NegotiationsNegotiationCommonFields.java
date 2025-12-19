package ru.brobrocode.cadra.client.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.annotation.Generated;
import jakarta.validation.Valid;
import jakarta.validation.constraints.Size;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * NegotiationsNegotiationCommonFields
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2025-08-17T15:41:09.394389505+05:00[Asia/Yekaterinburg]", comments = "Generator version: 7.6.0")
public class NegotiationsNegotiationCommonFields {

  @Valid
  private List<@Valid VacancyNegotiationActions> actions = new ArrayList<>();

  private EmployersEmployersState employerState;

  private EmployersFunnelStage funnelStage = null;

  @Valid
  private List<@Valid IncludesId> tags = new ArrayList<>();

  @Valid
  private List<@Valid VacancyTemplates> templates = new ArrayList<>();

  private SkillVerificationsTestResultWithUrl testResult = null;

  public NegotiationsNegotiationCommonFields actions(List<@Valid VacancyNegotiationActions> actions) {
    this.actions = actions;
    return this;
  }

  public NegotiationsNegotiationCommonFields addActionsItem(VacancyNegotiationActions actionsItem) {
    if (this.actions == null) {
      this.actions = new ArrayList<>();
    }
    this.actions.add(actionsItem);
    return this;
  }

  /**
   * Возможные [действия по отклику/приглашению](https://github.com/hhru/api/blob/master/docs/employer_negotiations.md#actions-info) 
   * @return actions
  */
  @Valid @Size(min = 0) 
  @Schema(name = "actions", description = "Возможные [действия по отклику/приглашению](https://github.com/hhru/api/blob/master/docs/employer_negotiations.md#actions-info) ", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("actions")
  public List<@Valid VacancyNegotiationActions> getActions() {
    return actions;
  }

  public void setActions(List<@Valid VacancyNegotiationActions> actions) {
    this.actions = actions;
  }

  public NegotiationsNegotiationCommonFields employerState(EmployersEmployersState employerState) {
    this.employerState = employerState;
    return this;
  }

  /**
   * Get employerState
   * @return employerState
  */
  @Valid 
  @Schema(name = "employer_state", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("employer_state")
  public EmployersEmployersState getEmployerState() {
    return employerState;
  }

  public void setEmployerState(EmployersEmployersState employerState) {
    this.employerState = employerState;
  }

  public NegotiationsNegotiationCommonFields funnelStage(EmployersFunnelStage funnelStage) {
    this.funnelStage = funnelStage;
    return this;
  }

  /**
   * Get funnelStage
   * @return funnelStage
  */
  @Valid 
  @Schema(name = "funnel_stage", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("funnel_stage")
  public EmployersFunnelStage getFunnelStage() {
    return funnelStage;
  }

  public void setFunnelStage(EmployersFunnelStage funnelStage) {
    this.funnelStage = funnelStage;
  }

  public NegotiationsNegotiationCommonFields tags(List<@Valid IncludesId> tags) {
    this.tags = tags;
    return this;
  }

  public NegotiationsNegotiationCommonFields addTagsItem(IncludesId tagsItem) {
    if (this.tags == null) {
      this.tags = new ArrayList<>();
    }
    this.tags.add(tagsItem);
    return this;
  }

  /**
   * Теги к работадательскому отклику
   * @return tags
  */
  @Valid 
  @Schema(name = "tags", description = "Теги к работадательскому отклику", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("tags")
  public List<@Valid IncludesId> getTags() {
    return tags;
  }

  public void setTags(List<@Valid IncludesId> tags) {
    this.tags = tags;
  }

  public NegotiationsNegotiationCommonFields templates(List<@Valid VacancyTemplates> templates) {
    this.templates = templates;
    return this;
  }

  public NegotiationsNegotiationCommonFields addTemplatesItem(VacancyTemplates templatesItem) {
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

  public NegotiationsNegotiationCommonFields testResult(SkillVerificationsTestResultWithUrl testResult) {
    this.testResult = testResult;
    return this;
  }

  /**
   * Get testResult
   * @return testResult
  */
  @Valid 
  @Schema(name = "test_result", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("test_result")
  public SkillVerificationsTestResultWithUrl getTestResult() {
    return testResult;
  }

  public void setTestResult(SkillVerificationsTestResultWithUrl testResult) {
    this.testResult = testResult;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    NegotiationsNegotiationCommonFields negotiationsNegotiationCommonFields = (NegotiationsNegotiationCommonFields) o;
    return Objects.equals(this.actions, negotiationsNegotiationCommonFields.actions) &&
        Objects.equals(this.employerState, negotiationsNegotiationCommonFields.employerState) &&
        Objects.equals(this.funnelStage, negotiationsNegotiationCommonFields.funnelStage) &&
        Objects.equals(this.tags, negotiationsNegotiationCommonFields.tags) &&
        Objects.equals(this.templates, negotiationsNegotiationCommonFields.templates) &&
        Objects.equals(this.testResult, negotiationsNegotiationCommonFields.testResult);
  }

  @Override
  public int hashCode() {
    return Objects.hash(actions, employerState, funnelStage, tags, templates, testResult);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class NegotiationsNegotiationCommonFields {\n");
    sb.append("    actions: ").append(toIndentedString(actions)).append("\n");
    sb.append("    employerState: ").append(toIndentedString(employerState)).append("\n");
    sb.append("    funnelStage: ").append(toIndentedString(funnelStage)).append("\n");
    sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
    sb.append("    templates: ").append(toIndentedString(templates)).append("\n");
    sb.append("    testResult: ").append(toIndentedString(testResult)).append("\n");
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

