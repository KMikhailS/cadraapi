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
 * ResumeEmployerFields
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2025-08-17T15:41:09.394389505+05:00[Asia/Yekaterinburg]", comments = "Generator version: 7.6.0")
public class ResumeEmployerFields {

  private ResumeObjectsActions actions;

  private Boolean canViewFullInfo = null;

  private String contactsOpenUntilDate = null;

  private Boolean favorited;

  private IncludesIdNameLastChangeTime jobSearchStatus;

  private ResumeObjectsNegotiationsHistoryForEmployer negotiationsHistory;

  private ResumeObjectsOwner owner;

  @Valid
  private List<@Valid ResumeObjectsEmployerPaidServicesInner> paidServices = new ArrayList<>();

  private ResumeObjectsPhotoNoId photo = null;

  @Valid
  private List<@Valid ResumeObjectsPortfolioNoId> portfolio = new ArrayList<>();

  private String viewWithoutContactsReason = null;

  public ResumeEmployerFields() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public ResumeEmployerFields(ResumeObjectsActions actions, Boolean favorited, ResumeObjectsOwner owner, List<@Valid ResumeObjectsEmployerPaidServicesInner> paidServices, List<@Valid ResumeObjectsPortfolioNoId> portfolio) {
    this.actions = actions;
    this.favorited = favorited;
    this.owner = owner;
    this.paidServices = paidServices;
    this.portfolio = portfolio;
  }

  public ResumeEmployerFields actions(ResumeObjectsActions actions) {
    this.actions = actions;
    return this;
  }

  /**
   * Дополнительные действия
   * @return actions
  */
  @NotNull @Valid 
  @Schema(name = "actions", description = "Дополнительные действия", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("actions")
  public ResumeObjectsActions getActions() {
    return actions;
  }

  public void setActions(ResumeObjectsActions actions) {
    this.actions = actions;
  }

  public ResumeEmployerFields canViewFullInfo(Boolean canViewFullInfo) {
    this.canViewFullInfo = canViewFullInfo;
    return this;
  }

  /**
   * Наличие права просмотра контактной информации в резюме
   * @return canViewFullInfo
  */
  
  @Schema(name = "can_view_full_info", description = "Наличие права просмотра контактной информации в резюме", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("can_view_full_info")
  public Boolean getCanViewFullInfo() {
    return canViewFullInfo;
  }

  public void setCanViewFullInfo(Boolean canViewFullInfo) {
    this.canViewFullInfo = canViewFullInfo;
  }

  public ResumeEmployerFields contactsOpenUntilDate(String contactsOpenUntilDate) {
    this.contactsOpenUntilDate = contactsOpenUntilDate;
    return this;
  }

  /**
   * Дата скрытия контактов резюме в формате `YYYY-MM-DD`
   * @return contactsOpenUntilDate
  */
  
  @Schema(name = "contacts_open_until_date", description = "Дата скрытия контактов резюме в формате `YYYY-MM-DD`", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("contacts_open_until_date")
  public String getContactsOpenUntilDate() {
    return contactsOpenUntilDate;
  }

  public void setContactsOpenUntilDate(String contactsOpenUntilDate) {
    this.contactsOpenUntilDate = contactsOpenUntilDate;
  }

  public ResumeEmployerFields favorited(Boolean favorited) {
    this.favorited = favorited;
    return this;
  }

  /**
   * Добавлено ли резюме в избранные
   * @return favorited
  */
  @NotNull 
  @Schema(name = "favorited", description = "Добавлено ли резюме в избранные", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("favorited")
  public Boolean getFavorited() {
    return favorited;
  }

  public void setFavorited(Boolean favorited) {
    this.favorited = favorited;
  }

  public ResumeEmployerFields jobSearchStatus(IncludesIdNameLastChangeTime jobSearchStatus) {
    this.jobSearchStatus = jobSearchStatus;
    return this;
  }

  /**
   * Для получения данных нужно передать параметр `with_job_search_status=true`.  Возможные значения перечислены в поле `job_search_statuses_employer` в [справочнике полей](#tag/Obshie-spravochniki/operation/get-dictionaries) 
   * @return jobSearchStatus
  */
  @Valid 
  @Schema(name = "job_search_status", description = "Для получения данных нужно передать параметр `with_job_search_status=true`.  Возможные значения перечислены в поле `job_search_statuses_employer` в [справочнике полей](#tag/Obshie-spravochniki/operation/get-dictionaries) ", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("job_search_status")
  public IncludesIdNameLastChangeTime getJobSearchStatus() {
    return jobSearchStatus;
  }

  public void setJobSearchStatus(IncludesIdNameLastChangeTime jobSearchStatus) {
    this.jobSearchStatus = jobSearchStatus;
  }

  public ResumeEmployerFields negotiationsHistory(ResumeObjectsNegotiationsHistoryForEmployer negotiationsHistory) {
    this.negotiationsHistory = negotiationsHistory;
    return this;
  }

  /**
   * Краткая история откликов/приглашений по резюме
   * @return negotiationsHistory
  */
  @Valid 
  @Schema(name = "negotiations_history", description = "Краткая история откликов/приглашений по резюме", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("negotiations_history")
  public ResumeObjectsNegotiationsHistoryForEmployer getNegotiationsHistory() {
    return negotiationsHistory;
  }

  public void setNegotiationsHistory(ResumeObjectsNegotiationsHistoryForEmployer negotiationsHistory) {
    this.negotiationsHistory = negotiationsHistory;
  }

  public ResumeEmployerFields owner(ResumeObjectsOwner owner) {
    this.owner = owner;
    return this;
  }

  /**
   * Информация о владельце резюме
   * @return owner
  */
  @NotNull @Valid 
  @Schema(name = "owner", description = "Информация о владельце резюме", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("owner")
  public ResumeObjectsOwner getOwner() {
    return owner;
  }

  public void setOwner(ResumeObjectsOwner owner) {
    this.owner = owner;
  }

  public ResumeEmployerFields paidServices(List<@Valid ResumeObjectsEmployerPaidServicesInner> paidServices) {
    this.paidServices = paidServices;
    return this;
  }

  public ResumeEmployerFields addPaidServicesItem(ResumeObjectsEmployerPaidServicesInner paidServicesItem) {
    if (this.paidServices == null) {
      this.paidServices = new ArrayList<>();
    }
    this.paidServices.add(paidServicesItem);
    return this;
  }

  /**
   * Платные услуги по резюме для работодателя  Работодателю может быть предложен список платных услуг по резюме.  Например, если полные данные по резюме недоступны, то будет выдано предложение покупки рекомендованной услуги, чтобы такой доступ получить 
   * @return paidServices
  */
  @NotNull @Valid 
  @Schema(name = "paid_services", description = "Платные услуги по резюме для работодателя  Работодателю может быть предложен список платных услуг по резюме.  Например, если полные данные по резюме недоступны, то будет выдано предложение покупки рекомендованной услуги, чтобы такой доступ получить ", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("paid_services")
  public List<@Valid ResumeObjectsEmployerPaidServicesInner> getPaidServices() {
    return paidServices;
  }

  public void setPaidServices(List<@Valid ResumeObjectsEmployerPaidServicesInner> paidServices) {
    this.paidServices = paidServices;
  }

  public ResumeEmployerFields photo(ResumeObjectsPhotoNoId photo) {
    this.photo = photo;
    return this;
  }

  /**
   * Get photo
   * @return photo
  */
  @Valid 
  @Schema(name = "photo", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("photo")
  public ResumeObjectsPhotoNoId getPhoto() {
    return photo;
  }

  public void setPhoto(ResumeObjectsPhotoNoId photo) {
    this.photo = photo;
  }

  public ResumeEmployerFields portfolio(List<@Valid ResumeObjectsPortfolioNoId> portfolio) {
    this.portfolio = portfolio;
    return this;
  }

  public ResumeEmployerFields addPortfolioItem(ResumeObjectsPortfolioNoId portfolioItem) {
    if (this.portfolio == null) {
      this.portfolio = new ArrayList<>();
    }
    this.portfolio.add(portfolioItem);
    return this;
  }

  /**
   * Список изображений в портфолио пользователя
   * @return portfolio
  */
  @NotNull @Valid 
  @Schema(name = "portfolio", description = "Список изображений в портфолио пользователя", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("portfolio")
  public List<@Valid ResumeObjectsPortfolioNoId> getPortfolio() {
    return portfolio;
  }

  public void setPortfolio(List<@Valid ResumeObjectsPortfolioNoId> portfolio) {
    this.portfolio = portfolio;
  }

  public ResumeEmployerFields viewWithoutContactsReason(String viewWithoutContactsReason) {
    this.viewWithoutContactsReason = viewWithoutContactsReason;
    return this;
  }

  /**
   * Причина скрытия контактов
   * @return viewWithoutContactsReason
  */
  
  @Schema(name = "view_without_contacts_reason", description = "Причина скрытия контактов", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("view_without_contacts_reason")
  public String getViewWithoutContactsReason() {
    return viewWithoutContactsReason;
  }

  public void setViewWithoutContactsReason(String viewWithoutContactsReason) {
    this.viewWithoutContactsReason = viewWithoutContactsReason;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ResumeEmployerFields resumeEmployerFields = (ResumeEmployerFields) o;
    return Objects.equals(this.actions, resumeEmployerFields.actions) &&
        Objects.equals(this.canViewFullInfo, resumeEmployerFields.canViewFullInfo) &&
        Objects.equals(this.contactsOpenUntilDate, resumeEmployerFields.contactsOpenUntilDate) &&
        Objects.equals(this.favorited, resumeEmployerFields.favorited) &&
        Objects.equals(this.jobSearchStatus, resumeEmployerFields.jobSearchStatus) &&
        Objects.equals(this.negotiationsHistory, resumeEmployerFields.negotiationsHistory) &&
        Objects.equals(this.owner, resumeEmployerFields.owner) &&
        Objects.equals(this.paidServices, resumeEmployerFields.paidServices) &&
        Objects.equals(this.photo, resumeEmployerFields.photo) &&
        Objects.equals(this.portfolio, resumeEmployerFields.portfolio) &&
        Objects.equals(this.viewWithoutContactsReason, resumeEmployerFields.viewWithoutContactsReason);
  }

  @Override
  public int hashCode() {
    return Objects.hash(actions, canViewFullInfo, contactsOpenUntilDate, favorited, jobSearchStatus, negotiationsHistory, owner, paidServices, photo, portfolio, viewWithoutContactsReason);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ResumeEmployerFields {\n");
    sb.append("    actions: ").append(toIndentedString(actions)).append("\n");
    sb.append("    canViewFullInfo: ").append(toIndentedString(canViewFullInfo)).append("\n");
    sb.append("    contactsOpenUntilDate: ").append(toIndentedString(contactsOpenUntilDate)).append("\n");
    sb.append("    favorited: ").append(toIndentedString(favorited)).append("\n");
    sb.append("    jobSearchStatus: ").append(toIndentedString(jobSearchStatus)).append("\n");
    sb.append("    negotiationsHistory: ").append(toIndentedString(negotiationsHistory)).append("\n");
    sb.append("    owner: ").append(toIndentedString(owner)).append("\n");
    sb.append("    paidServices: ").append(toIndentedString(paidServices)).append("\n");
    sb.append("    photo: ").append(toIndentedString(photo)).append("\n");
    sb.append("    portfolio: ").append(toIndentedString(portfolio)).append("\n");
    sb.append("    viewWithoutContactsReason: ").append(toIndentedString(viewWithoutContactsReason)).append("\n");
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

