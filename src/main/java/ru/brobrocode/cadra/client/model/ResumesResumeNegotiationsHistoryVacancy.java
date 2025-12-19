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
 * ResumesResumeNegotiationsHistoryVacancy
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2025-08-17T15:41:09.394389505+05:00[Asia/Yekaterinburg]", comments = "Generator version: 7.6.0")
public class ResumesResumeNegotiationsHistoryVacancy {

  private Boolean archived;

  private Boolean canEdit;

  private String id;

  @Valid
  private List<@Valid ResumesResumeNegotiationsHistoryVacancyItem> items = new ArrayList<>();

  private String messagesUrl;

  private String name;

  private String negotiationsUrl;

  private String url;

  public ResumesResumeNegotiationsHistoryVacancy() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public ResumesResumeNegotiationsHistoryVacancy(Boolean archived, Boolean canEdit, String id, List<@Valid ResumesResumeNegotiationsHistoryVacancyItem> items, String messagesUrl, String name, String negotiationsUrl, String url) {
    this.archived = archived;
    this.canEdit = canEdit;
    this.id = id;
    this.items = items;
    this.messagesUrl = messagesUrl;
    this.name = name;
    this.negotiationsUrl = negotiationsUrl;
    this.url = url;
  }

  public ResumesResumeNegotiationsHistoryVacancy archived(Boolean archived) {
    this.archived = archived;
    return this;
  }

  /**
   * Признак того, что вакансия находится в архиве
   * @return archived
  */
  @NotNull 
  @Schema(name = "archived", description = "Признак того, что вакансия находится в архиве", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("archived")
  public Boolean getArchived() {
    return archived;
  }

  public void setArchived(Boolean archived) {
    this.archived = archived;
  }

  public ResumesResumeNegotiationsHistoryVacancy canEdit(Boolean canEdit) {
    this.canEdit = canEdit;
    return this;
  }

  /**
   * Признак того, что менеджер может редактировать данные вакансии, а также работать с информацией об откликах/приглашениях по этой вакансии
   * @return canEdit
  */
  @NotNull 
  @Schema(name = "can_edit", description = "Признак того, что менеджер может редактировать данные вакансии, а также работать с информацией об откликах/приглашениях по этой вакансии", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("can_edit")
  public Boolean getCanEdit() {
    return canEdit;
  }

  public void setCanEdit(Boolean canEdit) {
    this.canEdit = canEdit;
  }

  public ResumesResumeNegotiationsHistoryVacancy id(String id) {
    this.id = id;
    return this;
  }

  /**
   * Уникальный идентификатор вакансии
   * @return id
  */
  @NotNull 
  @Schema(name = "id", description = "Уникальный идентификатор вакансии", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("id")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public ResumesResumeNegotiationsHistoryVacancy items(List<@Valid ResumesResumeNegotiationsHistoryVacancyItem> items) {
    this.items = items;
    return this;
  }

  public ResumesResumeNegotiationsHistoryVacancy addItemsItem(ResumesResumeNegotiationsHistoryVacancyItem itemsItem) {
    if (this.items == null) {
      this.items = new ArrayList<>();
    }
    this.items.add(itemsItem);
    return this;
  }

  /**
   * Список последних изменений состояний откликов/приглашений по указанному резюме и данной вакансии
   * @return items
  */
  @NotNull @Valid 
  @Schema(name = "items", description = "Список последних изменений состояний откликов/приглашений по указанному резюме и данной вакансии", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("items")
  public List<@Valid ResumesResumeNegotiationsHistoryVacancyItem> getItems() {
    return items;
  }

  public void setItems(List<@Valid ResumesResumeNegotiationsHistoryVacancyItem> items) {
    this.items = items;
  }

  public ResumesResumeNegotiationsHistoryVacancy messagesUrl(String messagesUrl) {
    this.messagesUrl = messagesUrl;
    return this;
  }

  /**
   * URL, на который необходимо делать GET-запрос для получения [списка сообщений в отклике/приглашении](#tag/Otklikipriglasheniya-rabotodatelya/operation/get-negotiation-messages). Если `can_edit` равно `false`, значение поля должно игнорироваться
   * @return messagesUrl
  */
  @NotNull 
  @Schema(name = "messages_url", description = "URL, на который необходимо делать GET-запрос для получения [списка сообщений в отклике/приглашении](#tag/Otklikipriglasheniya-rabotodatelya/operation/get-negotiation-messages). Если `can_edit` равно `false`, значение поля должно игнорироваться", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("messages_url")
  public String getMessagesUrl() {
    return messagesUrl;
  }

  public void setMessagesUrl(String messagesUrl) {
    this.messagesUrl = messagesUrl;
  }

  public ResumesResumeNegotiationsHistoryVacancy name(String name) {
    this.name = name;
    return this;
  }

  /**
   * Название вакансии
   * @return name
  */
  @NotNull 
  @Schema(name = "name", description = "Название вакансии", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("name")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public ResumesResumeNegotiationsHistoryVacancy negotiationsUrl(String negotiationsUrl) {
    this.negotiationsUrl = negotiationsUrl;
    return this;
  }

  /**
   * URL, на который необходимо делать GET-запрос для получения [данных об отклике/приглашении](#tag/Otklikipriglasheniya-rabotodatelya/operation/get-negotiation-item). Если `can_edit` равно `false`, значение поля должно игнорироваться
   * @return negotiationsUrl
  */
  @NotNull 
  @Schema(name = "negotiations_url", description = "URL, на который необходимо делать GET-запрос для получения [данных об отклике/приглашении](#tag/Otklikipriglasheniya-rabotodatelya/operation/get-negotiation-item). Если `can_edit` равно `false`, значение поля должно игнорироваться", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("negotiations_url")
  public String getNegotiationsUrl() {
    return negotiationsUrl;
  }

  public void setNegotiationsUrl(String negotiationsUrl) {
    this.negotiationsUrl = negotiationsUrl;
  }

  public ResumesResumeNegotiationsHistoryVacancy url(String url) {
    this.url = url;
    return this;
  }

  /**
   * URL, на который необходимо делать GET-запрос для [получения данных о вакансии](#tag/Vakansii/operation/get-vacancy)
   * @return url
  */
  @NotNull 
  @Schema(name = "url", description = "URL, на который необходимо делать GET-запрос для [получения данных о вакансии](#tag/Vakansii/operation/get-vacancy)", requiredMode = Schema.RequiredMode.REQUIRED)
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
    ResumesResumeNegotiationsHistoryVacancy resumesResumeNegotiationsHistoryVacancy = (ResumesResumeNegotiationsHistoryVacancy) o;
    return Objects.equals(this.archived, resumesResumeNegotiationsHistoryVacancy.archived) &&
        Objects.equals(this.canEdit, resumesResumeNegotiationsHistoryVacancy.canEdit) &&
        Objects.equals(this.id, resumesResumeNegotiationsHistoryVacancy.id) &&
        Objects.equals(this.items, resumesResumeNegotiationsHistoryVacancy.items) &&
        Objects.equals(this.messagesUrl, resumesResumeNegotiationsHistoryVacancy.messagesUrl) &&
        Objects.equals(this.name, resumesResumeNegotiationsHistoryVacancy.name) &&
        Objects.equals(this.negotiationsUrl, resumesResumeNegotiationsHistoryVacancy.negotiationsUrl) &&
        Objects.equals(this.url, resumesResumeNegotiationsHistoryVacancy.url);
  }

  @Override
  public int hashCode() {
    return Objects.hash(archived, canEdit, id, items, messagesUrl, name, negotiationsUrl, url);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ResumesResumeNegotiationsHistoryVacancy {\n");
    sb.append("    archived: ").append(toIndentedString(archived)).append("\n");
    sb.append("    canEdit: ").append(toIndentedString(canEdit)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    items: ").append(toIndentedString(items)).append("\n");
    sb.append("    messagesUrl: ").append(toIndentedString(messagesUrl)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    negotiationsUrl: ").append(toIndentedString(negotiationsUrl)).append("\n");
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

