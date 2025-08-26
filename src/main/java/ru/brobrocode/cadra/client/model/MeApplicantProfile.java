package ru.brobrocode.cadra.client.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.annotation.Generated;
import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;

import java.net.URI;
import java.util.Objects;

/**
 * Профиль текущего пользователя, авторизованного как соискатель
 */

@Schema(name = "MeApplicantProfile", description = "Профиль текущего пользователя, авторизованного как соискатель")

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2025-08-17T15:41:09.394389505+05:00[Asia/Yekaterinburg]", comments = "Generator version: 7.6.0")
public class MeApplicantProfile extends MeAnyUserProfile implements MeProfile {

  private MeApplicantProfileCounters counters;

  @Deprecated
  private Object employer = null;

  private Boolean isInSearch;

  @Deprecated
  private Object manager = null;

  private URI negotiationsUrl;

  @Deprecated
  private Object personalManager = null;

  private ProfileVideosList profileVideos;

  private URI resumesUrl;

  private UserStatusesApplicant userStatuses;

  public MeApplicantProfile() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public MeApplicantProfile(MeApplicantProfileCounters counters, Boolean isInSearch, URI negotiationsUrl, URI resumesUrl, String authType, Boolean isAdmin, Boolean isApplicant, Boolean isApplication, Boolean isEmployer, Boolean isEmployerIntegration, String firstName, String id, String lastName) {
    super(firstName, id, lastName, authType, isAdmin, isApplicant, isApplication, isEmployer, isEmployerIntegration);
    this.counters = counters;
    this.isInSearch = isInSearch;
    this.negotiationsUrl = negotiationsUrl;
    this.resumesUrl = resumesUrl;
  }

  public MeApplicantProfile counters(MeApplicantProfileCounters counters) {
    this.counters = counters;
    return this;
  }

  /**
   * Get counters
   * @return counters
  */
  @NotNull @Valid 
  @Schema(name = "counters", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("counters")
  public MeApplicantProfileCounters getCounters() {
    return counters;
  }

  public void setCounters(MeApplicantProfileCounters counters) {
    this.counters = counters;
  }

  public MeApplicantProfile employer(Object employer) {
    this.employer = employer;
    return this;
  }

  /**
   * Get employer
   * @return employer
   * @deprecated
  */
  
  @Schema(name = "employer", deprecated = true, requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("employer")
  @Deprecated
  public Object getEmployer() {
    return employer;
  }

  /**
   * @deprecated
  */
  @Deprecated
  public void setEmployer(Object employer) {
    this.employer = employer;
  }

  public MeApplicantProfile isInSearch(Boolean isInSearch) {
    this.isInSearch = isInSearch;
    return this;
  }

  /**
   * Имеет ли текущий пользователь статус \"ищу работу\"
   * @return isInSearch
  */
  @NotNull 
  @Schema(name = "is_in_search", example = "false", description = "Имеет ли текущий пользователь статус \"ищу работу\"", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("is_in_search")
  public Boolean getIsInSearch() {
    return isInSearch;
  }

  public void setIsInSearch(Boolean isInSearch) {
    this.isInSearch = isInSearch;
  }

  public MeApplicantProfile manager(Object manager) {
    this.manager = manager;
    return this;
  }

  /**
   * Get manager
   * @return manager
   * @deprecated
  */
  
  @Schema(name = "manager", deprecated = true, requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("manager")
  @Deprecated
  public Object getManager() {
    return manager;
  }

  /**
   * @deprecated
  */
  @Deprecated
  public void setManager(Object manager) {
    this.manager = manager;
  }

  public MeApplicantProfile negotiationsUrl(URI negotiationsUrl) {
    this.negotiationsUrl = negotiationsUrl;
    return this;
  }

  /**
   * URL, на который нужно сделать GET-запрос, чтобы получить список откликов/приглашений текущего пользователя 
   * @return negotiationsUrl
  */
  @NotNull @Valid 
  @Schema(name = "negotiations_url", description = "URL, на который нужно сделать GET-запрос, чтобы получить список откликов/приглашений текущего пользователя ", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("negotiations_url")
  public URI getNegotiationsUrl() {
    return negotiationsUrl;
  }

  public void setNegotiationsUrl(URI negotiationsUrl) {
    this.negotiationsUrl = negotiationsUrl;
  }

  public MeApplicantProfile personalManager(Object personalManager) {
    this.personalManager = personalManager;
    return this;
  }

  /**
   * Get personalManager
   * @return personalManager
   * @deprecated
  */
  
  @Schema(name = "personal_manager", deprecated = true, requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("personal_manager")
  @Deprecated
  public Object getPersonalManager() {
    return personalManager;
  }

  /**
   * @deprecated
  */
  @Deprecated
  public void setPersonalManager(Object personalManager) {
    this.personalManager = personalManager;
  }

  public MeApplicantProfile profileVideos(ProfileVideosList profileVideos) {
    this.profileVideos = profileVideos;
    return this;
  }

  /**
   * Get profileVideos
   * @return profileVideos
  */
  @Valid 
  @Schema(name = "profile_videos", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("profile_videos")
  public ProfileVideosList getProfileVideos() {
    return profileVideos;
  }

  public void setProfileVideos(ProfileVideosList profileVideos) {
    this.profileVideos = profileVideos;
  }

  public MeApplicantProfile resumesUrl(URI resumesUrl) {
    this.resumesUrl = resumesUrl;
    return this;
  }

  /**
   * URL, на который нужно сделать GET-запрос, чтобы получить список резюме текущего пользователя 
   * @return resumesUrl
  */
  @NotNull @Valid 
  @Schema(name = "resumes_url", example = "https://api.hh.ru/resumes/mine", description = "URL, на который нужно сделать GET-запрос, чтобы получить список резюме текущего пользователя ", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("resumes_url")
  public URI getResumesUrl() {
    return resumesUrl;
  }

  public void setResumesUrl(URI resumesUrl) {
    this.resumesUrl = resumesUrl;
  }

  public MeApplicantProfile userStatuses(UserStatusesApplicant userStatuses) {
    this.userStatuses = userStatuses;
    return this;
  }

  /**
   * Get userStatuses
   * @return userStatuses
  */
  @Valid 
  @Schema(name = "user_statuses", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("user_statuses")
  public UserStatusesApplicant getUserStatuses() {
    return userStatuses;
  }

  public void setUserStatuses(UserStatusesApplicant userStatuses) {
    this.userStatuses = userStatuses;
  }


  public MeApplicantProfile email(String email) {
    super.email(email);
    return this;
  }

  public MeApplicantProfile firstName(String firstName) {
    super.firstName(firstName);
    return this;
  }

  public MeApplicantProfile id(String id) {
    super.id(id);
    return this;
  }

  public MeApplicantProfile isAnonymous(Boolean isAnonymous) {
    super.isAnonymous(isAnonymous);
    return this;
  }

  public MeApplicantProfile lastName(String lastName) {
    super.lastName(lastName);
    return this;
  }

  public MeApplicantProfile midName(String midName) {
    super.midName(midName);
    return this;
  }

  public MeApplicantProfile middleName(String middleName) {
    super.middleName(middleName);
    return this;
  }

  public MeApplicantProfile phone(String phone) {
    super.phone(phone);
    return this;
  }

  public MeApplicantProfile authType(String authType) {
    super.authType(authType);
    return this;
  }

  public MeApplicantProfile isAdmin(Boolean isAdmin) {
    super.isAdmin(isAdmin);
    return this;
  }

  public MeApplicantProfile isApplicant(Boolean isApplicant) {
    super.isApplicant(isApplicant);
    return this;
  }

  public MeApplicantProfile isApplication(Boolean isApplication) {
    super.isApplication(isApplication);
    return this;
  }

  public MeApplicantProfile isEmployer(Boolean isEmployer) {
    super.isEmployer(isEmployer);
    return this;
  }

  public MeApplicantProfile isEmployerIntegration(Boolean isEmployerIntegration) {
    super.isEmployerIntegration(isEmployerIntegration);
    return this;
  }
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MeApplicantProfile meApplicantProfile = (MeApplicantProfile) o;
    return Objects.equals(this.counters, meApplicantProfile.counters) &&
        Objects.equals(this.employer, meApplicantProfile.employer) &&
        Objects.equals(this.isInSearch, meApplicantProfile.isInSearch) &&
        Objects.equals(this.manager, meApplicantProfile.manager) &&
        Objects.equals(this.negotiationsUrl, meApplicantProfile.negotiationsUrl) &&
        Objects.equals(this.personalManager, meApplicantProfile.personalManager) &&
        Objects.equals(this.profileVideos, meApplicantProfile.profileVideos) &&
        Objects.equals(this.resumesUrl, meApplicantProfile.resumesUrl) &&
        Objects.equals(this.userStatuses, meApplicantProfile.userStatuses) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(counters, employer, isInSearch, manager, negotiationsUrl, personalManager, profileVideos, resumesUrl, userStatuses, super.hashCode());
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MeApplicantProfile {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    counters: ").append(toIndentedString(counters)).append("\n");
    sb.append("    employer: ").append(toIndentedString(employer)).append("\n");
    sb.append("    isInSearch: ").append(toIndentedString(isInSearch)).append("\n");
    sb.append("    manager: ").append(toIndentedString(manager)).append("\n");
    sb.append("    negotiationsUrl: ").append(toIndentedString(negotiationsUrl)).append("\n");
    sb.append("    personalManager: ").append(toIndentedString(personalManager)).append("\n");
    sb.append("    profileVideos: ").append(toIndentedString(profileVideos)).append("\n");
    sb.append("    resumesUrl: ").append(toIndentedString(resumesUrl)).append("\n");
    sb.append("    userStatuses: ").append(toIndentedString(userStatuses)).append("\n");
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

