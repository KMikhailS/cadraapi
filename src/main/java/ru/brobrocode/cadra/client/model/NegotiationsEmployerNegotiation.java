package ru.brobrocode.cadra.client.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.annotation.Generated;
import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * NegotiationsEmployerNegotiation
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2025-08-17T15:41:09.394389505+05:00[Asia/Yekaterinburg]", comments = "Generator version: 7.6.0")
public class NegotiationsEmployerNegotiation {

  private Boolean applicantQuestionState;

  private NegotiationsObjectsCounters counters;

  private String createdAt;

  private Boolean hasUpdates;

  private String id;

  @Deprecated
  private String messagesUrl;

  private String messagingStatus;

  @Valid
  private List<@Valid VacancyProfessionalRoleItem> professionalRoles = new ArrayList<>();

  /**
   * Источник отклика/приглашения
   */
  public enum SourceEnum {
    NEGOTIATION("NEGOTIATION"),
    
    PHONE_CALL("PHONE_CALL"),
    
    CHAT("CHAT"),
    
    VR("VR"),
    
    AUTO_INVITE("AUTO_INVITE"),
    
    APPLICANT_QUESTIONS("APPLICANT_QUESTIONS"),
    
    AUTO_RESPONSE("AUTO_RESPONSE"),
    
    AUTO_RESPONSE_HH_PRO("AUTO_RESPONSE_HH_PRO"),
    
    CLICKME_CPA("CLICKME_CPA"),
    
    REGISTRATION("REGISTRATION");

    private String value;

    SourceEnum(String value) {
      this.value = value;
    }

    @JsonValue
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static SourceEnum fromValue(String value) {
      for (SourceEnum b : SourceEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  private SourceEnum source;

  private IncludesIdName state;

  private String updatedAt;

  private Boolean viewedByOpponent;

  @Valid
  private List<@Valid VacancyNegotiationActions> actions = new ArrayList<>();

  private EmployersEmployersState employerState;

  private EmployersFunnelStage funnelStage = null;

  @Valid
  private List<@Valid IncludesId> tags = new ArrayList<>();

  @Valid
  private List<@Valid VacancyTemplates> templates = new ArrayList<>();

  private SkillVerificationsTestResultWithUrl testResult = null;

  private NegotiationsObjectsEmployerTopicResume resume = null;

  private VacanciesNegotiationsVacancyShort vacancy = null;

  public NegotiationsEmployerNegotiation() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public NegotiationsEmployerNegotiation(String createdAt, Boolean hasUpdates, String id, String messagingStatus, IncludesIdName state, String updatedAt, Boolean viewedByOpponent) {
    this.createdAt = createdAt;
    this.hasUpdates = hasUpdates;
    this.id = id;
    this.messagingStatus = messagingStatus;
    this.state = state;
    this.updatedAt = updatedAt;
    this.viewedByOpponent = viewedByOpponent;
  }

  public NegotiationsEmployerNegotiation applicantQuestionState(Boolean applicantQuestionState) {
    this.applicantQuestionState = applicantQuestionState;
    return this;
  }

  /**
   * Является ли вопросом до отклика
   * @return applicantQuestionState
  */
  
  @Schema(name = "applicant_question_state", description = "Является ли вопросом до отклика", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("applicant_question_state")
  public Boolean getApplicantQuestionState() {
    return applicantQuestionState;
  }

  public void setApplicantQuestionState(Boolean applicantQuestionState) {
    this.applicantQuestionState = applicantQuestionState;
  }

  public NegotiationsEmployerNegotiation counters(NegotiationsObjectsCounters counters) {
    this.counters = counters;
    return this;
  }

  /**
   * Get counters
   * @return counters
  */
  @Valid 
  @Schema(name = "counters", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("counters")
  public NegotiationsObjectsCounters getCounters() {
    return counters;
  }

  public void setCounters(NegotiationsObjectsCounters counters) {
    this.counters = counters;
  }

  public NegotiationsEmployerNegotiation createdAt(String createdAt) {
    this.createdAt = createdAt;
    return this;
  }

  /**
   * Дата и время создания отклика/приглашения
   * @return createdAt
  */
  @NotNull 
  @Schema(name = "created_at", description = "Дата и время создания отклика/приглашения", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("created_at")
  public String getCreatedAt() {
    return createdAt;
  }

  public void setCreatedAt(String createdAt) {
    this.createdAt = createdAt;
  }

  public NegotiationsEmployerNegotiation hasUpdates(Boolean hasUpdates) {
    this.hasUpdates = hasUpdates;
    return this;
  }

  /**
   * Есть ли в откликах/приглашениях по данной вакансии обновления, требующие внимания
   * @return hasUpdates
  */
  @NotNull 
  @Schema(name = "has_updates", description = "Есть ли в откликах/приглашениях по данной вакансии обновления, требующие внимания", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("has_updates")
  public Boolean getHasUpdates() {
    return hasUpdates;
  }

  public void setHasUpdates(Boolean hasUpdates) {
    this.hasUpdates = hasUpdates;
  }

  public NegotiationsEmployerNegotiation id(String id) {
    this.id = id;
    return this;
  }

  /**
   * Идентификатор отклика/приглашения
   * @return id
  */
  @NotNull 
  @Schema(name = "id", description = "Идентификатор отклика/приглашения", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("id")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public NegotiationsEmployerNegotiation messagesUrl(String messagesUrl) {
    this.messagesUrl = messagesUrl;
    return this;
  }

  /**
   * URL, на который необходимо делать GET-запрос для получения [списка сообщений в отклике/приглашении](#tag/Perepiska-(otklikipriglasheniya)-dlya-soiskatelya/operation/get-negotiation-messages). Если `can_edit` равно `false`, значение поля должно игнорироваться
   * @return messagesUrl
   * @deprecated
  */
  
  @Schema(name = "messages_url", description = "URL, на который необходимо делать GET-запрос для получения [списка сообщений в отклике/приглашении](#tag/Perepiska-(otklikipriglasheniya)-dlya-soiskatelya/operation/get-negotiation-messages). Если `can_edit` равно `false`, значение поля должно игнорироваться", deprecated = true, requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("messages_url")
  @Deprecated
  public String getMessagesUrl() {
    return messagesUrl;
  }

  /**
   * @deprecated
  */
  @Deprecated
  public void setMessagesUrl(String messagesUrl) {
    this.messagesUrl = messagesUrl;
  }

  public NegotiationsEmployerNegotiation messagingStatus(String messagingStatus) {
    this.messagingStatus = messagingStatus;
    return this;
  }

  /**
   * Текущий статус переписки.  Возможные значения приведены в поле `messaging_status` [справочника полей](#tag/Obshie-spravochniki/operation/get-dictionaries) 
   * @return messagingStatus
  */
  @NotNull 
  @Schema(name = "messaging_status", description = "Текущий статус переписки.  Возможные значения приведены в поле `messaging_status` [справочника полей](#tag/Obshie-spravochniki/operation/get-dictionaries) ", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("messaging_status")
  public String getMessagingStatus() {
    return messagingStatus;
  }

  public void setMessagingStatus(String messagingStatus) {
    this.messagingStatus = messagingStatus;
  }

  public NegotiationsEmployerNegotiation professionalRoles(List<@Valid VacancyProfessionalRoleItem> professionalRoles) {
    this.professionalRoles = professionalRoles;
    return this;
  }

  public NegotiationsEmployerNegotiation addProfessionalRolesItem(VacancyProfessionalRoleItem professionalRolesItem) {
    if (this.professionalRoles == null) {
      this.professionalRoles = new ArrayList<>();
    }
    this.professionalRoles.add(professionalRolesItem);
    return this;
  }

  /**
   * Список профессиональных ролей
   * @return professionalRoles
  */
  @Valid 
  @Schema(name = "professional_roles", description = "Список профессиональных ролей", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("professional_roles")
  public List<@Valid VacancyProfessionalRoleItem> getProfessionalRoles() {
    return professionalRoles;
  }

  public void setProfessionalRoles(List<@Valid VacancyProfessionalRoleItem> professionalRoles) {
    this.professionalRoles = professionalRoles;
  }

  public NegotiationsEmployerNegotiation source(SourceEnum source) {
    this.source = source;
    return this;
  }

  /**
   * Источник отклика/приглашения
   * @return source
  */
  
  @Schema(name = "source", description = "Источник отклика/приглашения", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("source")
  public SourceEnum getSource() {
    return source;
  }

  public void setSource(SourceEnum source) {
    this.source = source;
  }

  public NegotiationsEmployerNegotiation state(IncludesIdName state) {
    this.state = state;
    return this;
  }

  /**
   * Текущее состояние отклика/приглашения.  Возможные значения приведены в поле `negotiations_state` [справочника полей](#tag/Obshie-spravochniki/operation/get-dictionaries) 
   * @return state
  */
  @NotNull @Valid 
  @Schema(name = "state", description = "Текущее состояние отклика/приглашения.  Возможные значения приведены в поле `negotiations_state` [справочника полей](#tag/Obshie-spravochniki/operation/get-dictionaries) ", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("state")
  public IncludesIdName getState() {
    return state;
  }

  public void setState(IncludesIdName state) {
    this.state = state;
  }

  public NegotiationsEmployerNegotiation updatedAt(String updatedAt) {
    this.updatedAt = updatedAt;
    return this;
  }

  /**
   * Дата и время последнего обновления отклика/приглашения
   * @return updatedAt
  */
  @NotNull 
  @Schema(name = "updated_at", description = "Дата и время последнего обновления отклика/приглашения", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("updated_at")
  public String getUpdatedAt() {
    return updatedAt;
  }

  public void setUpdatedAt(String updatedAt) {
    this.updatedAt = updatedAt;
  }

  public NegotiationsEmployerNegotiation viewedByOpponent(Boolean viewedByOpponent) {
    this.viewedByOpponent = viewedByOpponent;
    return this;
  }

  /**
   * Был ли отклик/приглашение просмотрен получателем
   * @return viewedByOpponent
  */
  @NotNull 
  @Schema(name = "viewed_by_opponent", description = "Был ли отклик/приглашение просмотрен получателем", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("viewed_by_opponent")
  public Boolean getViewedByOpponent() {
    return viewedByOpponent;
  }

  public void setViewedByOpponent(Boolean viewedByOpponent) {
    this.viewedByOpponent = viewedByOpponent;
  }

  public NegotiationsEmployerNegotiation actions(List<@Valid VacancyNegotiationActions> actions) {
    this.actions = actions;
    return this;
  }

  public NegotiationsEmployerNegotiation addActionsItem(VacancyNegotiationActions actionsItem) {
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

  public NegotiationsEmployerNegotiation employerState(EmployersEmployersState employerState) {
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

  public NegotiationsEmployerNegotiation funnelStage(EmployersFunnelStage funnelStage) {
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

  public NegotiationsEmployerNegotiation tags(List<@Valid IncludesId> tags) {
    this.tags = tags;
    return this;
  }

  public NegotiationsEmployerNegotiation addTagsItem(IncludesId tagsItem) {
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

  public NegotiationsEmployerNegotiation templates(List<@Valid VacancyTemplates> templates) {
    this.templates = templates;
    return this;
  }

  public NegotiationsEmployerNegotiation addTemplatesItem(VacancyTemplates templatesItem) {
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

  public NegotiationsEmployerNegotiation testResult(SkillVerificationsTestResultWithUrl testResult) {
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

  public NegotiationsEmployerNegotiation resume(NegotiationsObjectsEmployerTopicResume resume) {
    this.resume = resume;
    return this;
  }

  /**
   * Get resume
   * @return resume
  */
  @Valid 
  @Schema(name = "resume", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("resume")
  public NegotiationsObjectsEmployerTopicResume getResume() {
    return resume;
  }

  public void setResume(NegotiationsObjectsEmployerTopicResume resume) {
    this.resume = resume;
  }

  public NegotiationsEmployerNegotiation vacancy(VacanciesNegotiationsVacancyShort vacancy) {
    this.vacancy = vacancy;
    return this;
  }

  /**
   * Get vacancy
   * @return vacancy
  */
  @Valid 
  @Schema(name = "vacancy", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("vacancy")
  public VacanciesNegotiationsVacancyShort getVacancy() {
    return vacancy;
  }

  public void setVacancy(VacanciesNegotiationsVacancyShort vacancy) {
    this.vacancy = vacancy;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    NegotiationsEmployerNegotiation negotiationsEmployerNegotiation = (NegotiationsEmployerNegotiation) o;
    return Objects.equals(this.applicantQuestionState, negotiationsEmployerNegotiation.applicantQuestionState) &&
        Objects.equals(this.counters, negotiationsEmployerNegotiation.counters) &&
        Objects.equals(this.createdAt, negotiationsEmployerNegotiation.createdAt) &&
        Objects.equals(this.hasUpdates, negotiationsEmployerNegotiation.hasUpdates) &&
        Objects.equals(this.id, negotiationsEmployerNegotiation.id) &&
        Objects.equals(this.messagesUrl, negotiationsEmployerNegotiation.messagesUrl) &&
        Objects.equals(this.messagingStatus, negotiationsEmployerNegotiation.messagingStatus) &&
        Objects.equals(this.professionalRoles, negotiationsEmployerNegotiation.professionalRoles) &&
        Objects.equals(this.source, negotiationsEmployerNegotiation.source) &&
        Objects.equals(this.state, negotiationsEmployerNegotiation.state) &&
        Objects.equals(this.updatedAt, negotiationsEmployerNegotiation.updatedAt) &&
        Objects.equals(this.viewedByOpponent, negotiationsEmployerNegotiation.viewedByOpponent) &&
        Objects.equals(this.actions, negotiationsEmployerNegotiation.actions) &&
        Objects.equals(this.employerState, negotiationsEmployerNegotiation.employerState) &&
        Objects.equals(this.funnelStage, negotiationsEmployerNegotiation.funnelStage) &&
        Objects.equals(this.tags, negotiationsEmployerNegotiation.tags) &&
        Objects.equals(this.templates, negotiationsEmployerNegotiation.templates) &&
        Objects.equals(this.testResult, negotiationsEmployerNegotiation.testResult) &&
        Objects.equals(this.resume, negotiationsEmployerNegotiation.resume) &&
        Objects.equals(this.vacancy, negotiationsEmployerNegotiation.vacancy);
  }

  @Override
  public int hashCode() {
    return Objects.hash(applicantQuestionState, counters, createdAt, hasUpdates, id, messagesUrl, messagingStatus, professionalRoles, source, state, updatedAt, viewedByOpponent, actions, employerState, funnelStage, tags, templates, testResult, resume, vacancy);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class NegotiationsEmployerNegotiation {\n");
    sb.append("    applicantQuestionState: ").append(toIndentedString(applicantQuestionState)).append("\n");
    sb.append("    counters: ").append(toIndentedString(counters)).append("\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    hasUpdates: ").append(toIndentedString(hasUpdates)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    messagesUrl: ").append(toIndentedString(messagesUrl)).append("\n");
    sb.append("    messagingStatus: ").append(toIndentedString(messagingStatus)).append("\n");
    sb.append("    professionalRoles: ").append(toIndentedString(professionalRoles)).append("\n");
    sb.append("    source: ").append(toIndentedString(source)).append("\n");
    sb.append("    state: ").append(toIndentedString(state)).append("\n");
    sb.append("    updatedAt: ").append(toIndentedString(updatedAt)).append("\n");
    sb.append("    viewedByOpponent: ").append(toIndentedString(viewedByOpponent)).append("\n");
    sb.append("    actions: ").append(toIndentedString(actions)).append("\n");
    sb.append("    employerState: ").append(toIndentedString(employerState)).append("\n");
    sb.append("    funnelStage: ").append(toIndentedString(funnelStage)).append("\n");
    sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
    sb.append("    templates: ").append(toIndentedString(templates)).append("\n");
    sb.append("    testResult: ").append(toIndentedString(testResult)).append("\n");
    sb.append("    resume: ").append(toIndentedString(resume)).append("\n");
    sb.append("    vacancy: ").append(toIndentedString(vacancy)).append("\n");
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

