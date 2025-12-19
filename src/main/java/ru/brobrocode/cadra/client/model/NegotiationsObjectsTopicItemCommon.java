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
 * NegotiationsObjectsTopicItemCommon
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2025-08-17T15:41:09.394389505+05:00[Asia/Yekaterinburg]", comments = "Generator version: 7.6.0")
public class NegotiationsObjectsTopicItemCommon {

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

  public NegotiationsObjectsTopicItemCommon() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public NegotiationsObjectsTopicItemCommon(String createdAt, Boolean hasUpdates, String id, String messagingStatus, IncludesIdName state, String updatedAt, Boolean viewedByOpponent) {
    this.createdAt = createdAt;
    this.hasUpdates = hasUpdates;
    this.id = id;
    this.messagingStatus = messagingStatus;
    this.state = state;
    this.updatedAt = updatedAt;
    this.viewedByOpponent = viewedByOpponent;
  }

  public NegotiationsObjectsTopicItemCommon applicantQuestionState(Boolean applicantQuestionState) {
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

  public NegotiationsObjectsTopicItemCommon counters(NegotiationsObjectsCounters counters) {
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

  public NegotiationsObjectsTopicItemCommon createdAt(String createdAt) {
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

  public NegotiationsObjectsTopicItemCommon hasUpdates(Boolean hasUpdates) {
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

  public NegotiationsObjectsTopicItemCommon id(String id) {
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

  public NegotiationsObjectsTopicItemCommon messagesUrl(String messagesUrl) {
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

  public NegotiationsObjectsTopicItemCommon messagingStatus(String messagingStatus) {
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

  public NegotiationsObjectsTopicItemCommon professionalRoles(List<@Valid VacancyProfessionalRoleItem> professionalRoles) {
    this.professionalRoles = professionalRoles;
    return this;
  }

  public NegotiationsObjectsTopicItemCommon addProfessionalRolesItem(VacancyProfessionalRoleItem professionalRolesItem) {
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

  public NegotiationsObjectsTopicItemCommon source(SourceEnum source) {
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

  public NegotiationsObjectsTopicItemCommon state(IncludesIdName state) {
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

  public NegotiationsObjectsTopicItemCommon updatedAt(String updatedAt) {
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

  public NegotiationsObjectsTopicItemCommon viewedByOpponent(Boolean viewedByOpponent) {
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

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    NegotiationsObjectsTopicItemCommon negotiationsObjectsTopicItemCommon = (NegotiationsObjectsTopicItemCommon) o;
    return Objects.equals(this.applicantQuestionState, negotiationsObjectsTopicItemCommon.applicantQuestionState) &&
        Objects.equals(this.counters, negotiationsObjectsTopicItemCommon.counters) &&
        Objects.equals(this.createdAt, negotiationsObjectsTopicItemCommon.createdAt) &&
        Objects.equals(this.hasUpdates, negotiationsObjectsTopicItemCommon.hasUpdates) &&
        Objects.equals(this.id, negotiationsObjectsTopicItemCommon.id) &&
        Objects.equals(this.messagesUrl, negotiationsObjectsTopicItemCommon.messagesUrl) &&
        Objects.equals(this.messagingStatus, negotiationsObjectsTopicItemCommon.messagingStatus) &&
        Objects.equals(this.professionalRoles, negotiationsObjectsTopicItemCommon.professionalRoles) &&
        Objects.equals(this.source, negotiationsObjectsTopicItemCommon.source) &&
        Objects.equals(this.state, negotiationsObjectsTopicItemCommon.state) &&
        Objects.equals(this.updatedAt, negotiationsObjectsTopicItemCommon.updatedAt) &&
        Objects.equals(this.viewedByOpponent, negotiationsObjectsTopicItemCommon.viewedByOpponent);
  }

  @Override
  public int hashCode() {
    return Objects.hash(applicantQuestionState, counters, createdAt, hasUpdates, id, messagesUrl, messagingStatus, professionalRoles, source, state, updatedAt, viewedByOpponent);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class NegotiationsObjectsTopicItemCommon {\n");
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

