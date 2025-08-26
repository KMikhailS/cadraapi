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
 * VacancyNegotiationActions
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2025-08-17T15:41:09.394389505+05:00[Asia/Yekaterinburg]", comments = "Generator version: 7.6.0")
public class VacancyNegotiationActions {

  @Valid
  private List<@Valid VacancyArguments> arguments = new ArrayList<>();

  private Boolean enabled;

  private Boolean hidden;

  private String id;

  private String method;

  private String name;

  private IncludesIdName resultingEmployerState = null;

  @Valid
  private List<@Valid VacancyNegotiationSubActions> subActions = new ArrayList<>();

  @Valid
  private List<@Valid VacancyTemplates> templates = new ArrayList<>();

  private String url;

  public VacancyNegotiationActions() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public VacancyNegotiationActions(List<@Valid VacancyArguments> arguments, Boolean enabled, Boolean hidden, String id, String method, String name, List<@Valid VacancyTemplates> templates, String url) {
    this.arguments = arguments;
    this.enabled = enabled;
    this.hidden = hidden;
    this.id = id;
    this.method = method;
    this.name = name;
    this.templates = templates;
    this.url = url;
  }

  public VacancyNegotiationActions arguments(List<@Valid VacancyArguments> arguments) {
    this.arguments = arguments;
    return this;
  }

  public VacancyNegotiationActions addArgumentsItem(VacancyArguments argumentsItem) {
    if (this.arguments == null) {
      this.arguments = new ArrayList<>();
    }
    this.arguments.add(argumentsItem);
    return this;
  }

  /**
   * Обязательные и дополнительные аргументы для запроса
   * @return arguments
  */
  @NotNull @Valid 
  @Schema(name = "arguments", description = "Обязательные и дополнительные аргументы для запроса", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("arguments")
  public List<@Valid VacancyArguments> getArguments() {
    return arguments;
  }

  public void setArguments(List<@Valid VacancyArguments> arguments) {
    this.arguments = arguments;
  }

  public VacancyNegotiationActions enabled(Boolean enabled) {
    this.enabled = enabled;
    return this;
  }

  /**
   * Возможно ли совершить действие
   * @return enabled
  */
  @NotNull 
  @Schema(name = "enabled", description = "Возможно ли совершить действие", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("enabled")
  public Boolean getEnabled() {
    return enabled;
  }

  public void setEnabled(Boolean enabled) {
    this.enabled = enabled;
  }

  public VacancyNegotiationActions hidden(Boolean hidden) {
    this.hidden = hidden;
    return this;
  }

  /**
   * Является ли данная коллекция скрытой
   * @return hidden
  */
  @NotNull 
  @Schema(name = "hidden", description = "Является ли данная коллекция скрытой", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("hidden")
  public Boolean getHidden() {
    return hidden;
  }

  public void setHidden(Boolean hidden) {
    this.hidden = hidden;
  }

  public VacancyNegotiationActions id(String id) {
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

  public VacancyNegotiationActions method(String method) {
    this.method = method;
    return this;
  }

  /**
   * HTTP метод, который необходимо выполнить
   * @return method
  */
  @NotNull 
  @Schema(name = "method", description = "HTTP метод, который необходимо выполнить", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("method")
  public String getMethod() {
    return method;
  }

  public void setMethod(String method) {
    this.method = method;
  }

  public VacancyNegotiationActions name(String name) {
    this.name = name;
    return this;
  }

  /**
   * Название действия
   * @return name
  */
  @NotNull 
  @Schema(name = "name", description = "Название действия", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("name")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public VacancyNegotiationActions resultingEmployerState(IncludesIdName resultingEmployerState) {
    this.resultingEmployerState = resultingEmployerState;
    return this;
  }

  /**
   * Get resultingEmployerState
   * @return resultingEmployerState
  */
  @Valid 
  @Schema(name = "resulting_employer_state", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("resulting_employer_state")
  public IncludesIdName getResultingEmployerState() {
    return resultingEmployerState;
  }

  public void setResultingEmployerState(IncludesIdName resultingEmployerState) {
    this.resultingEmployerState = resultingEmployerState;
  }

  public VacancyNegotiationActions subActions(List<@Valid VacancyNegotiationSubActions> subActions) {
    this.subActions = subActions;
    return this;
  }

  public VacancyNegotiationActions addSubActionsItem(VacancyNegotiationSubActions subActionsItem) {
    if (this.subActions == null) {
      this.subActions = new ArrayList<>();
    }
    this.subActions.add(subActionsItem);
    return this;
  }

  /**
   * Действия для перевода отклика/приглашения в подстатус
   * @return subActions
  */
  @Valid @Size(min = 0) 
  @Schema(name = "sub_actions", description = "Действия для перевода отклика/приглашения в подстатус", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("sub_actions")
  public List<@Valid VacancyNegotiationSubActions> getSubActions() {
    return subActions;
  }

  public void setSubActions(List<@Valid VacancyNegotiationSubActions> subActions) {
    this.subActions = subActions;
  }

  public VacancyNegotiationActions templates(List<@Valid VacancyTemplates> templates) {
    this.templates = templates;
    return this;
  }

  public VacancyNegotiationActions addTemplatesItem(VacancyTemplates templatesItem) {
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
  @NotNull @Valid 
  @Schema(name = "templates", description = "Шаблоны писем", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("templates")
  public List<@Valid VacancyTemplates> getTemplates() {
    return templates;
  }

  public void setTemplates(List<@Valid VacancyTemplates> templates) {
    this.templates = templates;
  }

  public VacancyNegotiationActions url(String url) {
    this.url = url;
    return this;
  }

  /**
   * URL, на который необходимо выполнить запрос
   * @return url
  */
  @NotNull 
  @Schema(name = "url", description = "URL, на который необходимо выполнить запрос", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("url")
  public String getUrl() {
    return url;
  }

  public void setUrl(String url) {
    this.url = url;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    VacancyNegotiationActions vacancyNegotiationActions = (VacancyNegotiationActions) o;
    return Objects.equals(this.arguments, vacancyNegotiationActions.arguments) &&
        Objects.equals(this.enabled, vacancyNegotiationActions.enabled) &&
        Objects.equals(this.hidden, vacancyNegotiationActions.hidden) &&
        Objects.equals(this.id, vacancyNegotiationActions.id) &&
        Objects.equals(this.method, vacancyNegotiationActions.method) &&
        Objects.equals(this.name, vacancyNegotiationActions.name) &&
        Objects.equals(this.resultingEmployerState, vacancyNegotiationActions.resultingEmployerState) &&
        Objects.equals(this.subActions, vacancyNegotiationActions.subActions) &&
        Objects.equals(this.templates, vacancyNegotiationActions.templates) &&
        Objects.equals(this.url, vacancyNegotiationActions.url);
  }

  @Override
  public int hashCode() {
    return Objects.hash(arguments, enabled, hidden, id, method, name, resultingEmployerState, subActions, templates, url);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class VacancyNegotiationActions {\n");
    sb.append("    arguments: ").append(toIndentedString(arguments)).append("\n");
    sb.append("    enabled: ").append(toIndentedString(enabled)).append("\n");
    sb.append("    hidden: ").append(toIndentedString(hidden)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    method: ").append(toIndentedString(method)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    resultingEmployerState: ").append(toIndentedString(resultingEmployerState)).append("\n");
    sb.append("    subActions: ").append(toIndentedString(subActions)).append("\n");
    sb.append("    templates: ").append(toIndentedString(templates)).append("\n");
    sb.append("    url: ").append(toIndentedString(url)).append("\n");
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

