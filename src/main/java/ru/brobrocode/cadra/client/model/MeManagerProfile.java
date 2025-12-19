package ru.brobrocode.cadra.client.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.annotation.Generated;
import jakarta.validation.Valid;

import java.util.Objects;

/**
 * Профиль текущего пользователя, авторизованного как менеджер
 */

@Schema(name = "MeManagerProfile", description = "Профиль текущего пользователя, авторизованного как менеджер")

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2025-08-17T15:41:09.394389505+05:00[Asia/Yekaterinburg]", comments = "Generator version: 7.6.0")
public class MeManagerProfile extends MeAnyUserProfile implements MeProfile {

  private MeEmployerProfileCompanyDeprecated employer;

  @Deprecated
  private Object isInSearch = null;

  private MeEmployerProfileManager manager;

  @Deprecated
  private Object negotiationsUrl = null;

  private MeEmployerProfilePersonalManager personalManager;

  @Deprecated
  private Object resumesUrl = null;

  public MeManagerProfile() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public MeManagerProfile(String authType, Boolean isAdmin, Boolean isApplicant, Boolean isApplication, Boolean isEmployer, Boolean isEmployerIntegration, String firstName, String id, String lastName) {
    super(firstName, id, lastName, authType, isAdmin, isApplicant, isApplication, isEmployer, isEmployerIntegration);
  }

  public MeManagerProfile employer(MeEmployerProfileCompanyDeprecated employer) {
    this.employer = employer;
    return this;
  }

  /**
   * Get employer
   * @return employer
  */
  @Valid 
  @Schema(name = "employer", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("employer")
  public MeEmployerProfileCompanyDeprecated getEmployer() {
    return employer;
  }

  public void setEmployer(MeEmployerProfileCompanyDeprecated employer) {
    this.employer = employer;
  }

  public MeManagerProfile isInSearch(Object isInSearch) {
    this.isInSearch = isInSearch;
    return this;
  }

  /**
   * Get isInSearch
   * @return isInSearch
   * @deprecated
  */
  
  @Schema(name = "is_in_search", deprecated = true, requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("is_in_search")
  @Deprecated
  public Object getIsInSearch() {
    return isInSearch;
  }

  /**
   * @deprecated
  */
  @Deprecated
  public void setIsInSearch(Object isInSearch) {
    this.isInSearch = isInSearch;
  }

  public MeManagerProfile manager(MeEmployerProfileManager manager) {
    this.manager = manager;
    return this;
  }

  /**
   * Get manager
   * @return manager
  */
  @Valid 
  @Schema(name = "manager", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("manager")
  public MeEmployerProfileManager getManager() {
    return manager;
  }

  public void setManager(MeEmployerProfileManager manager) {
    this.manager = manager;
  }

  public MeManagerProfile negotiationsUrl(Object negotiationsUrl) {
    this.negotiationsUrl = negotiationsUrl;
    return this;
  }

  /**
   * Get negotiationsUrl
   * @return negotiationsUrl
   * @deprecated
  */
  
  @Schema(name = "negotiations_url", deprecated = true, requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("negotiations_url")
  @Deprecated
  public Object getNegotiationsUrl() {
    return negotiationsUrl;
  }

  /**
   * @deprecated
  */
  @Deprecated
  public void setNegotiationsUrl(Object negotiationsUrl) {
    this.negotiationsUrl = negotiationsUrl;
  }

  public MeManagerProfile personalManager(MeEmployerProfilePersonalManager personalManager) {
    this.personalManager = personalManager;
    return this;
  }

  /**
   * Get personalManager
   * @return personalManager
  */
  @Valid 
  @Schema(name = "personal_manager", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("personal_manager")
  public MeEmployerProfilePersonalManager getPersonalManager() {
    return personalManager;
  }

  public void setPersonalManager(MeEmployerProfilePersonalManager personalManager) {
    this.personalManager = personalManager;
  }

  public MeManagerProfile resumesUrl(Object resumesUrl) {
    this.resumesUrl = resumesUrl;
    return this;
  }

  /**
   * Get resumesUrl
   * @return resumesUrl
   * @deprecated
  */
  
  @Schema(name = "resumes_url", deprecated = true, requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("resumes_url")
  @Deprecated
  public Object getResumesUrl() {
    return resumesUrl;
  }

  /**
   * @deprecated
  */
  @Deprecated
  public void setResumesUrl(Object resumesUrl) {
    this.resumesUrl = resumesUrl;
  }


  public MeManagerProfile email(String email) {
    super.email(email);
    return this;
  }

  public MeManagerProfile firstName(String firstName) {
    super.firstName(firstName);
    return this;
  }

  public MeManagerProfile id(String id) {
    super.id(id);
    return this;
  }

  public MeManagerProfile isAnonymous(Boolean isAnonymous) {
    super.isAnonymous(isAnonymous);
    return this;
  }

  public MeManagerProfile lastName(String lastName) {
    super.lastName(lastName);
    return this;
  }

  public MeManagerProfile midName(String midName) {
    super.midName(midName);
    return this;
  }

  public MeManagerProfile middleName(String middleName) {
    super.middleName(middleName);
    return this;
  }

  public MeManagerProfile phone(String phone) {
    super.phone(phone);
    return this;
  }

  public MeManagerProfile authType(String authType) {
    super.authType(authType);
    return this;
  }

  public MeManagerProfile isAdmin(Boolean isAdmin) {
    super.isAdmin(isAdmin);
    return this;
  }

  public MeManagerProfile isApplicant(Boolean isApplicant) {
    super.isApplicant(isApplicant);
    return this;
  }

  public MeManagerProfile isApplication(Boolean isApplication) {
    super.isApplication(isApplication);
    return this;
  }

  public MeManagerProfile isEmployer(Boolean isEmployer) {
    super.isEmployer(isEmployer);
    return this;
  }

  public MeManagerProfile isEmployerIntegration(Boolean isEmployerIntegration) {
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
    MeManagerProfile meManagerProfile = (MeManagerProfile) o;
    return Objects.equals(this.employer, meManagerProfile.employer) &&
        Objects.equals(this.isInSearch, meManagerProfile.isInSearch) &&
        Objects.equals(this.manager, meManagerProfile.manager) &&
        Objects.equals(this.negotiationsUrl, meManagerProfile.negotiationsUrl) &&
        Objects.equals(this.personalManager, meManagerProfile.personalManager) &&
        Objects.equals(this.resumesUrl, meManagerProfile.resumesUrl) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(employer, isInSearch, manager, negotiationsUrl, personalManager, resumesUrl, super.hashCode());
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MeManagerProfile {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    employer: ").append(toIndentedString(employer)).append("\n");
    sb.append("    isInSearch: ").append(toIndentedString(isInSearch)).append("\n");
    sb.append("    manager: ").append(toIndentedString(manager)).append("\n");
    sb.append("    negotiationsUrl: ").append(toIndentedString(negotiationsUrl)).append("\n");
    sb.append("    personalManager: ").append(toIndentedString(personalManager)).append("\n");
    sb.append("    resumesUrl: ").append(toIndentedString(resumesUrl)).append("\n");
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

