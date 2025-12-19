package ru.brobrocode.cadra.client.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.annotation.Generated;
import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;

import java.util.Objects;

/**
 * Обновление резюме и профиля и получение в ответ схемы с полями резюме-профиля
 */

@Schema(name = "ResumeProfileResumeProfileUpdateRequestBody", description = "Обновление резюме и профиля и получение в ответ схемы с полями резюме-профиля")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2025-08-17T15:41:09.394389505+05:00[Asia/Yekaterinburg]", comments = "Generator version: 7.6.0")
public class ResumeProfileResumeProfileUpdateRequestBody {

  private ResumeProfileAdditionalProperties additionalProperties = null;

  private CredsCredsUpdate creds;

  private String currentScreenId;

  private ProfileProfileUpdate profile;

  private ResumeEditResume resume;

  public ResumeProfileResumeProfileUpdateRequestBody() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public ResumeProfileResumeProfileUpdateRequestBody(String currentScreenId, ResumeEditResume resume) {
    this.currentScreenId = currentScreenId;
    this.resume = resume;
  }

  public ResumeProfileResumeProfileUpdateRequestBody additionalProperties(ResumeProfileAdditionalProperties additionalProperties) {
    this.additionalProperties = additionalProperties;
    return this;
  }

  /**
   * Get additionalProperties
   * @return additionalProperties
  */
  @Valid 
  @Schema(name = "additional_properties", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("additional_properties")
  public ResumeProfileAdditionalProperties getAdditionalProperties() {
    return additionalProperties;
  }

  public void setAdditionalProperties(ResumeProfileAdditionalProperties additionalProperties) {
    this.additionalProperties = additionalProperties;
  }

  public ResumeProfileResumeProfileUpdateRequestBody creds(CredsCredsUpdate creds) {
    this.creds = creds;
    return this;
  }

  /**
   * Get creds
   * @return creds
  */
  @Valid 
  @Schema(name = "creds", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("creds")
  public CredsCredsUpdate getCreds() {
    return creds;
  }

  public void setCreds(CredsCredsUpdate creds) {
    this.creds = creds;
  }

  public ResumeProfileResumeProfileUpdateRequestBody currentScreenId(String currentScreenId) {
    this.currentScreenId = currentScreenId;
    return this;
  }

  /**
   * Экран, который сейчас отображается в визарде
   * @return currentScreenId
  */
  @NotNull 
  @Schema(name = "current_screen_id", description = "Экран, который сейчас отображается в визарде", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("current_screen_id")
  public String getCurrentScreenId() {
    return currentScreenId;
  }

  public void setCurrentScreenId(String currentScreenId) {
    this.currentScreenId = currentScreenId;
  }

  public ResumeProfileResumeProfileUpdateRequestBody profile(ProfileProfileUpdate profile) {
    this.profile = profile;
    return this;
  }

  /**
   * Get profile
   * @return profile
  */
  @Valid 
  @Schema(name = "profile", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("profile")
  public ProfileProfileUpdate getProfile() {
    return profile;
  }

  public void setProfile(ProfileProfileUpdate profile) {
    this.profile = profile;
  }

  public ResumeProfileResumeProfileUpdateRequestBody resume(ResumeEditResume resume) {
    this.resume = resume;
    return this;
  }

  /**
   * Get resume
   * @return resume
  */
  @NotNull @Valid 
  @Schema(name = "resume", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("resume")
  public ResumeEditResume getResume() {
    return resume;
  }

  public void setResume(ResumeEditResume resume) {
    this.resume = resume;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ResumeProfileResumeProfileUpdateRequestBody resumeProfileResumeProfileUpdateRequestBody = (ResumeProfileResumeProfileUpdateRequestBody) o;
    return Objects.equals(this.additionalProperties, resumeProfileResumeProfileUpdateRequestBody.additionalProperties) &&
        Objects.equals(this.creds, resumeProfileResumeProfileUpdateRequestBody.creds) &&
        Objects.equals(this.currentScreenId, resumeProfileResumeProfileUpdateRequestBody.currentScreenId) &&
        Objects.equals(this.profile, resumeProfileResumeProfileUpdateRequestBody.profile) &&
        Objects.equals(this.resume, resumeProfileResumeProfileUpdateRequestBody.resume);
  }

  @Override
  public int hashCode() {
    return Objects.hash(additionalProperties, creds, currentScreenId, profile, resume);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ResumeProfileResumeProfileUpdateRequestBody {\n");
    sb.append("    additionalProperties: ").append(toIndentedString(additionalProperties)).append("\n");
    sb.append("    creds: ").append(toIndentedString(creds)).append("\n");
    sb.append("    currentScreenId: ").append(toIndentedString(currentScreenId)).append("\n");
    sb.append("    profile: ").append(toIndentedString(profile)).append("\n");
    sb.append("    resume: ").append(toIndentedString(resume)).append("\n");
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

