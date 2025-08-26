package ru.brobrocode.cadra.client.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.annotation.Generated;
import jakarta.validation.Valid;

import java.util.Objects;

/**
 * Профиль текущего пользователя, авторизованного как работодатель
 */

@Schema(name = "MeEmployerProfile", description = "Профиль текущего пользователя, авторизованного как работодатель")

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2025-08-17T15:41:09.394389505+05:00[Asia/Yekaterinburg]", comments = "Generator version: 7.6.0")
public class MeEmployerProfile extends MeCommonProfile implements MeProfile {

  private MeEmployerProfileCompany employer;

  private MeEmployerProfilePersonalManager personalManager;

  public MeEmployerProfile() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public MeEmployerProfile(String authType, Boolean isAdmin, Boolean isApplicant, Boolean isApplication, Boolean isEmployer, Boolean isEmployerIntegration) {
    super(authType, isAdmin, isApplicant, isApplication, isEmployer, isEmployerIntegration);
  }

  public MeEmployerProfile employer(MeEmployerProfileCompany employer) {
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
  public MeEmployerProfileCompany getEmployer() {
    return employer;
  }

  public void setEmployer(MeEmployerProfileCompany employer) {
    this.employer = employer;
  }

  public MeEmployerProfile personalManager(MeEmployerProfilePersonalManager personalManager) {
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


  public MeEmployerProfile authType(String authType) {
    super.authType(authType);
    return this;
  }

  public MeEmployerProfile isAdmin(Boolean isAdmin) {
    super.isAdmin(isAdmin);
    return this;
  }

  public MeEmployerProfile isApplicant(Boolean isApplicant) {
    super.isApplicant(isApplicant);
    return this;
  }

  public MeEmployerProfile isApplication(Boolean isApplication) {
    super.isApplication(isApplication);
    return this;
  }

  public MeEmployerProfile isEmployer(Boolean isEmployer) {
    super.isEmployer(isEmployer);
    return this;
  }

  public MeEmployerProfile isEmployerIntegration(Boolean isEmployerIntegration) {
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
    MeEmployerProfile meEmployerProfile = (MeEmployerProfile) o;
    return Objects.equals(this.employer, meEmployerProfile.employer) &&
        Objects.equals(this.personalManager, meEmployerProfile.personalManager) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(employer, personalManager, super.hashCode());
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MeEmployerProfile {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    employer: ").append(toIndentedString(employer)).append("\n");
    sb.append("    personalManager: ").append(toIndentedString(personalManager)).append("\n");
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

