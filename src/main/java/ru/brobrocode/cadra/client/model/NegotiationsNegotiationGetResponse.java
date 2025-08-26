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
 * NegotiationsNegotiationGetResponse
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2025-08-17T15:41:09.394389505+05:00[Asia/Yekaterinburg]", comments = "Generator version: 7.6.0")
public class NegotiationsNegotiationGetResponse {

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

  private Boolean declineAllowed;

  private Boolean hidden;

  private IncludesIdName jobSearchStatus = null;

  private NegotiationsPhoneCalls phoneCalls = null;

  @Valid
  private List<@Valid IncludesId> tags = new ArrayList<>();

  private VacanciesNegotiationsVacancyShort vacancy = null;

  private NegotiationsObjectsEmployerTopicResume resume = null;

  private String url;

  @Valid
  private List<@Valid VacancyNegotiationActions> actions = new ArrayList<>();

  private EmployersEmployersState employerState;

  private EmployersFunnelStage funnelStage = null;

  @Valid
  private List<@Valid VacancyTemplates> templates = new ArrayList<>();

  private SkillVerificationsTestResultWithUrl testResult = null;

  public NegotiationsNegotiationGetResponse() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public NegotiationsNegotiationGetResponse(String createdAt, Boolean hasUpdates, String id, String messagingStatus, IncludesIdName state, String updatedAt, Boolean viewedByOpponent, Boolean declineAllowed, Boolean hidden, String url) {
    this.createdAt = createdAt;
    this.hasUpdates = hasUpdates;
    this.id = id;
    this.messagingStatus = messagingStatus;
    this.state = state;
    this.updatedAt = updatedAt;
    this.viewedByOpponent = viewedByOpponent;
    this.declineAllowed = declineAllowed;
    this.hidden = hidden;
    this.url = url;
  }

  public NegotiationsNegotiationGetResponse applicantQuestionState(Boolean applicantQuestionState) {
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

  public NegotiationsNegotiationGetResponse counters(NegotiationsObjectsCounters counters) {
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

  public NegotiationsNegotiationGetResponse createdAt(String createdAt) {
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

  public NegotiationsNegotiationGetResponse hasUpdates(Boolean hasUpdates) {
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

  public NegotiationsNegotiationGetResponse id(String id) {
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

  public NegotiationsNegotiationGetResponse messagesUrl(String messagesUrl) {
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

  public NegotiationsNegotiationGetResponse messagingStatus(String messagingStatus) {
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

  public NegotiationsNegotiationGetResponse professionalRoles(List<@Valid VacancyProfessionalRoleItem> professionalRoles) {
    this.professionalRoles = professionalRoles;
    return this;
  }

  public NegotiationsNegotiationGetResponse addProfessionalRolesItem(VacancyProfessionalRoleItem professionalRolesItem) {
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

  public NegotiationsNegotiationGetResponse source(SourceEnum source) {
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

  public NegotiationsNegotiationGetResponse state(IncludesIdName state) {
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

  public NegotiationsNegotiationGetResponse updatedAt(String updatedAt) {
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

  public NegotiationsNegotiationGetResponse viewedByOpponent(Boolean viewedByOpponent) {
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

  public NegotiationsNegotiationGetResponse declineAllowed(Boolean declineAllowed) {
    this.declineAllowed = declineAllowed;
    return this;
  }

  /**
   * Можно ли [скрыть отклик](#tag/Perepiska-(otklikipriglasheniya)-dlya-soiskatelya/operation/hide-active-response) вместе с сообщением работодателю об отказе
   * @return declineAllowed
  */
  @NotNull 
  @Schema(name = "decline_allowed", description = "Можно ли [скрыть отклик](#tag/Perepiska-(otklikipriglasheniya)-dlya-soiskatelya/operation/hide-active-response) вместе с сообщением работодателю об отказе", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("decline_allowed")
  public Boolean getDeclineAllowed() {
    return declineAllowed;
  }

  public void setDeclineAllowed(Boolean declineAllowed) {
    this.declineAllowed = declineAllowed;
  }

  public NegotiationsNegotiationGetResponse hidden(Boolean hidden) {
    this.hidden = hidden;
    return this;
  }

  /**
   * Скрыт ли текущий отклик от соискателя
   * @return hidden
  */
  @NotNull 
  @Schema(name = "hidden", description = "Скрыт ли текущий отклик от соискателя", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("hidden")
  public Boolean getHidden() {
    return hidden;
  }

  public void setHidden(Boolean hidden) {
    this.hidden = hidden;
  }

  public NegotiationsNegotiationGetResponse jobSearchStatus(IncludesIdName jobSearchStatus) {
    this.jobSearchStatus = jobSearchStatus;
    return this;
  }

  /**
   * Get jobSearchStatus
   * @return jobSearchStatus
  */
  @Valid 
  @Schema(name = "job_search_status", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("job_search_status")
  public IncludesIdName getJobSearchStatus() {
    return jobSearchStatus;
  }

  public void setJobSearchStatus(IncludesIdName jobSearchStatus) {
    this.jobSearchStatus = jobSearchStatus;
  }

  public NegotiationsNegotiationGetResponse phoneCalls(NegotiationsPhoneCalls phoneCalls) {
    this.phoneCalls = phoneCalls;
    return this;
  }

  /**
   * Get phoneCalls
   * @return phoneCalls
  */
  @Valid 
  @Schema(name = "phone_calls", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("phone_calls")
  public NegotiationsPhoneCalls getPhoneCalls() {
    return phoneCalls;
  }

  public void setPhoneCalls(NegotiationsPhoneCalls phoneCalls) {
    this.phoneCalls = phoneCalls;
  }

  public NegotiationsNegotiationGetResponse tags(List<@Valid IncludesId> tags) {
    this.tags = tags;
    return this;
  }

  public NegotiationsNegotiationGetResponse addTagsItem(IncludesId tagsItem) {
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

  public NegotiationsNegotiationGetResponse vacancy(VacanciesNegotiationsVacancyShort vacancy) {
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

  public NegotiationsNegotiationGetResponse resume(NegotiationsObjectsEmployerTopicResume resume) {
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

  public NegotiationsNegotiationGetResponse url(String url) {
    this.url = url;
    return this;
  }

  /**
   * Ссылка на полную версию отклика
   * @return url
  */
  @NotNull 
  @Schema(name = "url", description = "Ссылка на полную версию отклика", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("url")
  public String getUrl() {
    return url;
  }

  public void setUrl(String url) {
    this.url = url;
  }

  public NegotiationsNegotiationGetResponse actions(List<@Valid VacancyNegotiationActions> actions) {
    this.actions = actions;
    return this;
  }

  public NegotiationsNegotiationGetResponse addActionsItem(VacancyNegotiationActions actionsItem) {
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

  public NegotiationsNegotiationGetResponse employerState(EmployersEmployersState employerState) {
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

  public NegotiationsNegotiationGetResponse funnelStage(EmployersFunnelStage funnelStage) {
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

  public NegotiationsNegotiationGetResponse templates(List<@Valid VacancyTemplates> templates) {
    this.templates = templates;
    return this;
  }

  public NegotiationsNegotiationGetResponse addTemplatesItem(VacancyTemplates templatesItem) {
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

  public NegotiationsNegotiationGetResponse testResult(SkillVerificationsTestResultWithUrl testResult) {
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
    NegotiationsNegotiationGetResponse negotiationsNegotiationGetResponse = (NegotiationsNegotiationGetResponse) o;
    return Objects.equals(this.applicantQuestionState, negotiationsNegotiationGetResponse.applicantQuestionState) &&
        Objects.equals(this.counters, negotiationsNegotiationGetResponse.counters) &&
        Objects.equals(this.createdAt, negotiationsNegotiationGetResponse.createdAt) &&
        Objects.equals(this.hasUpdates, negotiationsNegotiationGetResponse.hasUpdates) &&
        Objects.equals(this.id, negotiationsNegotiationGetResponse.id) &&
        Objects.equals(this.messagesUrl, negotiationsNegotiationGetResponse.messagesUrl) &&
        Objects.equals(this.messagingStatus, negotiationsNegotiationGetResponse.messagingStatus) &&
        Objects.equals(this.professionalRoles, negotiationsNegotiationGetResponse.professionalRoles) &&
        Objects.equals(this.source, negotiationsNegotiationGetResponse.source) &&
        Objects.equals(this.state, negotiationsNegotiationGetResponse.state) &&
        Objects.equals(this.updatedAt, negotiationsNegotiationGetResponse.updatedAt) &&
        Objects.equals(this.viewedByOpponent, negotiationsNegotiationGetResponse.viewedByOpponent) &&
        Objects.equals(this.declineAllowed, negotiationsNegotiationGetResponse.declineAllowed) &&
        Objects.equals(this.hidden, negotiationsNegotiationGetResponse.hidden) &&
        Objects.equals(this.jobSearchStatus, negotiationsNegotiationGetResponse.jobSearchStatus) &&
        Objects.equals(this.phoneCalls, negotiationsNegotiationGetResponse.phoneCalls) &&
        Objects.equals(this.tags, negotiationsNegotiationGetResponse.tags) &&
        Objects.equals(this.vacancy, negotiationsNegotiationGetResponse.vacancy) &&
        Objects.equals(this.resume, negotiationsNegotiationGetResponse.resume) &&
        Objects.equals(this.url, negotiationsNegotiationGetResponse.url) &&
        Objects.equals(this.actions, negotiationsNegotiationGetResponse.actions) &&
        Objects.equals(this.employerState, negotiationsNegotiationGetResponse.employerState) &&
        Objects.equals(this.funnelStage, negotiationsNegotiationGetResponse.funnelStage) &&
        Objects.equals(this.templates, negotiationsNegotiationGetResponse.templates) &&
        Objects.equals(this.testResult, negotiationsNegotiationGetResponse.testResult);
  }

  @Override
  public int hashCode() {
    return Objects.hash(applicantQuestionState, counters, createdAt, hasUpdates, id, messagesUrl, messagingStatus, professionalRoles, source, state, updatedAt, viewedByOpponent, declineAllowed, hidden, jobSearchStatus, phoneCalls, tags, vacancy, resume, url, actions, employerState, funnelStage, templates, testResult);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class NegotiationsNegotiationGetResponse {\n");
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
    sb.append("    declineAllowed: ").append(toIndentedString(declineAllowed)).append("\n");
    sb.append("    hidden: ").append(toIndentedString(hidden)).append("\n");
    sb.append("    jobSearchStatus: ").append(toIndentedString(jobSearchStatus)).append("\n");
    sb.append("    phoneCalls: ").append(toIndentedString(phoneCalls)).append("\n");
    sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
    sb.append("    vacancy: ").append(toIndentedString(vacancy)).append("\n");
    sb.append("    resume: ").append(toIndentedString(resume)).append("\n");
    sb.append("    url: ").append(toIndentedString(url)).append("\n");
    sb.append("    actions: ").append(toIndentedString(actions)).append("\n");
    sb.append("    employerState: ").append(toIndentedString(employerState)).append("\n");
    sb.append("    funnelStage: ").append(toIndentedString(funnelStage)).append("\n");
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

