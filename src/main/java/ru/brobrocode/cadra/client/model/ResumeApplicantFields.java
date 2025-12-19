package ru.brobrocode.cadra.client.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.annotation.Generated;
import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * ResumeApplicantFields
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2025-08-17T15:41:09.394389505+05:00[Asia/Yekaterinburg]", comments = "Generator version: 7.6.0")
public class ResumeApplicantFields {

  private ResumeObjectsAccess access;

  private ResumeObjectsActionsForOwner actions;

  private BigDecimal newViews;

  private String nextPublishAt = null;

  @Valid
  private List<@Valid ResumeObjectsPaidServices> paidServices = new ArrayList<>();

  private BigDecimal totalViews;

  private String viewsUrl;

  public ResumeApplicantFields() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public ResumeApplicantFields(ResumeObjectsAccess access, ResumeObjectsActionsForOwner actions, BigDecimal newViews, List<@Valid ResumeObjectsPaidServices> paidServices, BigDecimal totalViews, String viewsUrl) {
    this.access = access;
    this.actions = actions;
    this.newViews = newViews;
    this.paidServices = paidServices;
    this.totalViews = totalViews;
    this.viewsUrl = viewsUrl;
  }

  public ResumeApplicantFields access(ResumeObjectsAccess access) {
    this.access = access;
    return this;
  }

  /**
   * Get access
   * @return access
  */
  @NotNull @Valid 
  @Schema(name = "access", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("access")
  public ResumeObjectsAccess getAccess() {
    return access;
  }

  public void setAccess(ResumeObjectsAccess access) {
    this.access = access;
  }

  public ResumeApplicantFields actions(ResumeObjectsActionsForOwner actions) {
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
  public ResumeObjectsActionsForOwner getActions() {
    return actions;
  }

  public void setActions(ResumeObjectsActionsForOwner actions) {
    this.actions = actions;
  }

  public ResumeApplicantFields newViews(BigDecimal newViews) {
    this.newViews = newViews;
    return this;
  }

  /**
   * Число новых просмотров. Данный счетчик сбрасывается при получении [детальной истории просмотров](#tag/Rezyume.-Prosmotr-informacii/operation/get-resume-view-history) 
   * @return newViews
  */
  @NotNull @Valid 
  @Schema(name = "new_views", description = "Число новых просмотров. Данный счетчик сбрасывается при получении [детальной истории просмотров](#tag/Rezyume.-Prosmotr-informacii/operation/get-resume-view-history) ", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("new_views")
  public BigDecimal getNewViews() {
    return newViews;
  }

  public void setNewViews(BigDecimal newViews) {
    this.newViews = newViews;
  }

  public ResumeApplicantFields nextPublishAt(String nextPublishAt) {
    this.nextPublishAt = nextPublishAt;
    return this;
  }

  /**
   * Дата и время следующей возможной публикации/обновления. Для неопубликованных резюме возвращается `null`
   * @return nextPublishAt
  */
  
  @Schema(name = "next_publish_at", description = "Дата и время следующей возможной публикации/обновления. Для неопубликованных резюме возвращается `null`", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("next_publish_at")
  public String getNextPublishAt() {
    return nextPublishAt;
  }

  public void setNextPublishAt(String nextPublishAt) {
    this.nextPublishAt = nextPublishAt;
  }

  public ResumeApplicantFields paidServices(List<@Valid ResumeObjectsPaidServices> paidServices) {
    this.paidServices = paidServices;
    return this;
  }

  public ResumeApplicantFields addPaidServicesItem(ResumeObjectsPaidServices paidServicesItem) {
    if (this.paidServices == null) {
      this.paidServices = new ArrayList<>();
    }
    this.paidServices.add(paidServicesItem);
    return this;
  }

  /**
   * Платные услуги по резюме для автора
   * @return paidServices
  */
  @NotNull @Valid 
  @Schema(name = "paid_services", description = "Платные услуги по резюме для автора", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("paid_services")
  public List<@Valid ResumeObjectsPaidServices> getPaidServices() {
    return paidServices;
  }

  public void setPaidServices(List<@Valid ResumeObjectsPaidServices> paidServices) {
    this.paidServices = paidServices;
  }

  public ResumeApplicantFields totalViews(BigDecimal totalViews) {
    this.totalViews = totalViews;
    return this;
  }

  /**
   * Число просмотров резюме
   * @return totalViews
  */
  @NotNull @Valid 
  @Schema(name = "total_views", description = "Число просмотров резюме", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("total_views")
  public BigDecimal getTotalViews() {
    return totalViews;
  }

  public void setTotalViews(BigDecimal totalViews) {
    this.totalViews = totalViews;
  }

  public ResumeApplicantFields viewsUrl(String viewsUrl) {
    this.viewsUrl = viewsUrl;
    return this;
  }

  /**
   * URL, по которому необходимо сделать GET-запрос для получения [детальной истории просмотров](#tag/Rezyume.-Prosmotr-informacii/operation/get-resume-view-history) 
   * @return viewsUrl
  */
  @NotNull 
  @Schema(name = "views_url", description = "URL, по которому необходимо сделать GET-запрос для получения [детальной истории просмотров](#tag/Rezyume.-Prosmotr-informacii/operation/get-resume-view-history) ", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("views_url")
  public String getViewsUrl() {
    return viewsUrl;
  }

  public void setViewsUrl(String viewsUrl) {
    this.viewsUrl = viewsUrl;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ResumeApplicantFields resumeApplicantFields = (ResumeApplicantFields) o;
    return Objects.equals(this.access, resumeApplicantFields.access) &&
        Objects.equals(this.actions, resumeApplicantFields.actions) &&
        Objects.equals(this.newViews, resumeApplicantFields.newViews) &&
        Objects.equals(this.nextPublishAt, resumeApplicantFields.nextPublishAt) &&
        Objects.equals(this.paidServices, resumeApplicantFields.paidServices) &&
        Objects.equals(this.totalViews, resumeApplicantFields.totalViews) &&
        Objects.equals(this.viewsUrl, resumeApplicantFields.viewsUrl);
  }

  @Override
  public int hashCode() {
    return Objects.hash(access, actions, newViews, nextPublishAt, paidServices, totalViews, viewsUrl);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ResumeApplicantFields {\n");
    sb.append("    access: ").append(toIndentedString(access)).append("\n");
    sb.append("    actions: ").append(toIndentedString(actions)).append("\n");
    sb.append("    newViews: ").append(toIndentedString(newViews)).append("\n");
    sb.append("    nextPublishAt: ").append(toIndentedString(nextPublishAt)).append("\n");
    sb.append("    paidServices: ").append(toIndentedString(paidServices)).append("\n");
    sb.append("    totalViews: ").append(toIndentedString(totalViews)).append("\n");
    sb.append("    viewsUrl: ").append(toIndentedString(viewsUrl)).append("\n");
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

