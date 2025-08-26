package ru.brobrocode.cadra.client.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.annotation.Generated;
import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * NegotiationsListItem
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2025-08-17T15:41:09.394389505+05:00[Asia/Yekaterinburg]", comments = "Generator version: 7.6.0")
public class NegotiationsListItem {

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

  private IncludesId interviewReview;

  private ResumeResumeNanoWithUrl resume = null;

  private String url;

  public NegotiationsListItem() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public NegotiationsListItem(String createdAt, Boolean hasUpdates, String id, String messagingStatus, IncludesIdName state, String updatedAt, Boolean viewedByOpponent, Boolean declineAllowed, Boolean hidden, String url) {
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

  public NegotiationsListItem applicantQuestionState(Boolean applicantQuestionState) {
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

  public NegotiationsListItem counters(NegotiationsObjectsCounters counters) {
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

  public NegotiationsListItem createdAt(String createdAt) {
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

  public NegotiationsListItem hasUpdates(Boolean hasUpdates) {
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

  public NegotiationsListItem id(String id) {
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

  public NegotiationsListItem messagesUrl(String messagesUrl) {
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

  public NegotiationsListItem messagingStatus(String messagingStatus) {
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

  public NegotiationsListItem professionalRoles(List<@Valid VacancyProfessionalRoleItem> professionalRoles) {
    this.professionalRoles = professionalRoles;
    return this;
  }

  public NegotiationsListItem addProfessionalRolesItem(VacancyProfessionalRoleItem professionalRolesItem) {
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

  public NegotiationsListItem source(SourceEnum source) {
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

  public NegotiationsListItem state(IncludesIdName state) {
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

  public NegotiationsListItem updatedAt(String updatedAt) {
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

  public NegotiationsListItem viewedByOpponent(Boolean viewedByOpponent) {
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

  public NegotiationsListItem declineAllowed(Boolean declineAllowed) {
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

  public NegotiationsListItem hidden(Boolean hidden) {
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

  public NegotiationsListItem jobSearchStatus(IncludesIdName jobSearchStatus) {
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

  public NegotiationsListItem phoneCalls(NegotiationsPhoneCalls phoneCalls) {
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

  public NegotiationsListItem tags(List<@Valid IncludesId> tags) {
    this.tags = tags;
    return this;
  }

  public NegotiationsListItem addTagsItem(IncludesId tagsItem) {
    if (this.tags == null) {
      this.tags = new ArrayList<>();
    }
    this.tags.add(tagsItem);
    return this;
  }

  /**
   * Теги к соискательскому отклику
   * @return tags
  */
  @Valid 
  @Schema(name = "tags", description = "Теги к соискательскому отклику", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("tags")
  public List<@Valid IncludesId> getTags() {
    return tags;
  }

  public void setTags(List<@Valid IncludesId> tags) {
    this.tags = tags;
  }

  public NegotiationsListItem vacancy(VacanciesNegotiationsVacancyShort vacancy) {
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

  public NegotiationsListItem interviewReview(IncludesId interviewReview) {
    this.interviewReview = interviewReview;
    return this;
  }

  /**
   * Get interviewReview
   * @return interviewReview
  */
  @Valid 
  @Schema(name = "interview_review", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("interview_review")
  public IncludesId getInterviewReview() {
    return interviewReview;
  }

  public void setInterviewReview(IncludesId interviewReview) {
    this.interviewReview = interviewReview;
  }

  public NegotiationsListItem resume(ResumeResumeNanoWithUrl resume) {
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
  public ResumeResumeNanoWithUrl getResume() {
    return resume;
  }

  public void setResume(ResumeResumeNanoWithUrl resume) {
    this.resume = resume;
  }

  public NegotiationsListItem url(String url) {
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

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    NegotiationsListItem negotiationsListItem = (NegotiationsListItem) o;
    return Objects.equals(this.applicantQuestionState, negotiationsListItem.applicantQuestionState) &&
        Objects.equals(this.counters, negotiationsListItem.counters) &&
        Objects.equals(this.createdAt, negotiationsListItem.createdAt) &&
        Objects.equals(this.hasUpdates, negotiationsListItem.hasUpdates) &&
        Objects.equals(this.id, negotiationsListItem.id) &&
        Objects.equals(this.messagesUrl, negotiationsListItem.messagesUrl) &&
        Objects.equals(this.messagingStatus, negotiationsListItem.messagingStatus) &&
        Objects.equals(this.professionalRoles, negotiationsListItem.professionalRoles) &&
        Objects.equals(this.source, negotiationsListItem.source) &&
        Objects.equals(this.state, negotiationsListItem.state) &&
        Objects.equals(this.updatedAt, negotiationsListItem.updatedAt) &&
        Objects.equals(this.viewedByOpponent, negotiationsListItem.viewedByOpponent) &&
        Objects.equals(this.declineAllowed, negotiationsListItem.declineAllowed) &&
        Objects.equals(this.hidden, negotiationsListItem.hidden) &&
        Objects.equals(this.jobSearchStatus, negotiationsListItem.jobSearchStatus) &&
        Objects.equals(this.phoneCalls, negotiationsListItem.phoneCalls) &&
        Objects.equals(this.tags, negotiationsListItem.tags) &&
        Objects.equals(this.vacancy, negotiationsListItem.vacancy) &&
        Objects.equals(this.interviewReview, negotiationsListItem.interviewReview) &&
        Objects.equals(this.resume, negotiationsListItem.resume) &&
        Objects.equals(this.url, negotiationsListItem.url);
  }

  @Override
  public int hashCode() {
    return Objects.hash(applicantQuestionState, counters, createdAt, hasUpdates, id, messagesUrl, messagingStatus, professionalRoles, source, state, updatedAt, viewedByOpponent, declineAllowed, hidden, jobSearchStatus, phoneCalls, tags, vacancy, interviewReview, resume, url);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class NegotiationsListItem {\n");
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
    sb.append("    interviewReview: ").append(toIndentedString(interviewReview)).append("\n");
    sb.append("    resume: ").append(toIndentedString(resume)).append("\n");
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

