package ru.brobrocode.cadra.client.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.annotation.Generated;
import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * Схема по которой определяется набор полей, вид визарда заполнения резюме и профиля и текущие заполненные данные
 */

@Schema(name = "ResumeProfileResumeProfileResponse", description = "Схема по которой определяется набор полей, вид визарда заполнения резюме и профиля и текущие заполненные данные")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2025-08-17T15:41:09.394389505+05:00[Asia/Yekaterinburg]", comments = "Generator version: 7.6.0")
public class ResumeProfileResumeProfileResponse {

  private ResumeProfileAdditionalProperties additionalProperties = null;

  private Object conditions;

  private CredsCreds creds;

  private String nextIncompleteScreenId = null;

  private ProfileProfileView profile;

  private Object profileConditions;

  private ResumeViewApplicantResume resume;

  @Valid
  private List<@Valid ProfileProfileResumesInner> resumes = new ArrayList<>();

  @Valid
  private List<@Valid ResumeProfileScreen> screens = new ArrayList<>();

  @Valid
  private List<SkillVerificationsSkill> skillsWithLevels = new ArrayList<>();

  public ResumeProfileResumeProfileResponse() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public ResumeProfileResumeProfileResponse(Object conditions, ProfileProfileView profile, Object profileConditions, ResumeViewApplicantResume resume, List<@Valid ProfileProfileResumesInner> resumes, List<@Valid ResumeProfileScreen> screens) {
    this.conditions = conditions;
    this.profile = profile;
    this.profileConditions = profileConditions;
    this.resume = resume;
    this.resumes = resumes;
    this.screens = screens;
  }

  public ResumeProfileResumeProfileResponse additionalProperties(ResumeProfileAdditionalProperties additionalProperties) {
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

  public ResumeProfileResumeProfileResponse conditions(Object conditions) {
    this.conditions = conditions;
    return this;
  }

  /**
   * Условия заполнения полей резюме. Каждое конечное поле описано объектом правил. Подробнее с ними можно ознакомиться в [соответствующем разделе публичной документации](#tag/Rezyume.-Usloviya-zapolneniya-polej). У нас заданы [следующие правила](#tag/Rezyume.-Usloviya-zapolneniya-polej) 
   * @return conditions
  */
  @NotNull 
  @Schema(name = "conditions", description = "Условия заполнения полей резюме. Каждое конечное поле описано объектом правил. Подробнее с ними можно ознакомиться в [соответствующем разделе публичной документации](#tag/Rezyume.-Usloviya-zapolneniya-polej). У нас заданы [следующие правила](#tag/Rezyume.-Usloviya-zapolneniya-polej) ", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("conditions")
  public Object getConditions() {
    return conditions;
  }

  public void setConditions(Object conditions) {
    this.conditions = conditions;
  }

  public ResumeProfileResumeProfileResponse creds(CredsCreds creds) {
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
  public CredsCreds getCreds() {
    return creds;
  }

  public void setCreds(CredsCreds creds) {
    this.creds = creds;
  }

  public ResumeProfileResumeProfileResponse nextIncompleteScreenId(String nextIncompleteScreenId) {
    this.nextIncompleteScreenId = nextIncompleteScreenId;
    return this;
  }

  /**
   * Экран, который нужно отобразить следующим
   * @return nextIncompleteScreenId
  */
  
  @Schema(name = "next_incomplete_screen_id", description = "Экран, который нужно отобразить следующим", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("next_incomplete_screen_id")
  public String getNextIncompleteScreenId() {
    return nextIncompleteScreenId;
  }

  public void setNextIncompleteScreenId(String nextIncompleteScreenId) {
    this.nextIncompleteScreenId = nextIncompleteScreenId;
  }

  public ResumeProfileResumeProfileResponse profile(ProfileProfileView profile) {
    this.profile = profile;
    return this;
  }

  /**
   * Get profile
   * @return profile
  */
  @NotNull @Valid 
  @Schema(name = "profile", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("profile")
  public ProfileProfileView getProfile() {
    return profile;
  }

  public void setProfile(ProfileProfileView profile) {
    this.profile = profile;
  }

  public ResumeProfileResumeProfileResponse profileConditions(Object profileConditions) {
    this.profileConditions = profileConditions;
    return this;
  }

  /**
   * Условия заполнения полей профиля. Каждое конечное поле описано объектом правил. Подробнее с ними можно ознакомиться в [соответствующем разделе публичной документации](#tag/Rezyume.-Usloviya-zapolneniya-polej). У нас заданы [следующие правила](#tag/Rezyume.-Usloviya-zapolneniya-polej) 
   * @return profileConditions
  */
  @NotNull 
  @Schema(name = "profile_conditions", description = "Условия заполнения полей профиля. Каждое конечное поле описано объектом правил. Подробнее с ними можно ознакомиться в [соответствующем разделе публичной документации](#tag/Rezyume.-Usloviya-zapolneniya-polej). У нас заданы [следующие правила](#tag/Rezyume.-Usloviya-zapolneniya-polej) ", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("profile_conditions")
  public Object getProfileConditions() {
    return profileConditions;
  }

  public void setProfileConditions(Object profileConditions) {
    this.profileConditions = profileConditions;
  }

  public ResumeProfileResumeProfileResponse resume(ResumeViewApplicantResume resume) {
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
  public ResumeViewApplicantResume getResume() {
    return resume;
  }

  public void setResume(ResumeViewApplicantResume resume) {
    this.resume = resume;
  }

  public ResumeProfileResumeProfileResponse resumes(List<@Valid ProfileProfileResumesInner> resumes) {
    this.resumes = resumes;
    return this;
  }

  public ResumeProfileResumeProfileResponse addResumesItem(ProfileProfileResumesInner resumesItem) {
    if (this.resumes == null) {
      this.resumes = new ArrayList<>();
    }
    this.resumes.add(resumesItem);
    return this;
  }

  /**
   * Список резюме соискателя
   * @return resumes
  */
  @NotNull @Valid 
  @Schema(name = "resumes", description = "Список резюме соискателя", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("resumes")
  public List<@Valid ProfileProfileResumesInner> getResumes() {
    return resumes;
  }

  public void setResumes(List<@Valid ProfileProfileResumesInner> resumes) {
    this.resumes = resumes;
  }

  public ResumeProfileResumeProfileResponse screens(List<@Valid ResumeProfileScreen> screens) {
    this.screens = screens;
    return this;
  }

  public ResumeProfileResumeProfileResponse addScreensItem(ResumeProfileScreen screensItem) {
    if (this.screens == null) {
      this.screens = new ArrayList<>();
    }
    this.screens.add(screensItem);
    return this;
  }

  /**
   * Упорядоченные экраны для отображения
   * @return screens
  */
  @NotNull @Valid 
  @Schema(name = "screens", description = "Упорядоченные экраны для отображения", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("screens")
  public List<@Valid ResumeProfileScreen> getScreens() {
    return screens;
  }

  public void setScreens(List<@Valid ResumeProfileScreen> screens) {
    this.screens = screens;
  }

  public ResumeProfileResumeProfileResponse skillsWithLevels(List<SkillVerificationsSkill> skillsWithLevels) {
    this.skillsWithLevels = skillsWithLevels;
    return this;
  }

  public ResumeProfileResumeProfileResponse addSkillsWithLevelsItem(SkillVerificationsSkill skillsWithLevelsItem) {
    if (this.skillsWithLevels == null) {
      this.skillsWithLevels = new ArrayList<>();
    }
    this.skillsWithLevels.add(skillsWithLevelsItem);
    return this;
  }

  /**
   * Все навыки пользователя с уровнями и подтверждениями
   * @return skillsWithLevels
  */
  @Valid @Size(min = 0) 
  @Schema(name = "skills_with_levels", description = "Все навыки пользователя с уровнями и подтверждениями", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("skills_with_levels")
  public List<SkillVerificationsSkill> getSkillsWithLevels() {
    return skillsWithLevels;
  }

  public void setSkillsWithLevels(List<SkillVerificationsSkill> skillsWithLevels) {
    this.skillsWithLevels = skillsWithLevels;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ResumeProfileResumeProfileResponse resumeProfileResumeProfileResponse = (ResumeProfileResumeProfileResponse) o;
    return Objects.equals(this.additionalProperties, resumeProfileResumeProfileResponse.additionalProperties) &&
        Objects.equals(this.conditions, resumeProfileResumeProfileResponse.conditions) &&
        Objects.equals(this.creds, resumeProfileResumeProfileResponse.creds) &&
        Objects.equals(this.nextIncompleteScreenId, resumeProfileResumeProfileResponse.nextIncompleteScreenId) &&
        Objects.equals(this.profile, resumeProfileResumeProfileResponse.profile) &&
        Objects.equals(this.profileConditions, resumeProfileResumeProfileResponse.profileConditions) &&
        Objects.equals(this.resume, resumeProfileResumeProfileResponse.resume) &&
        Objects.equals(this.resumes, resumeProfileResumeProfileResponse.resumes) &&
        Objects.equals(this.screens, resumeProfileResumeProfileResponse.screens) &&
        Objects.equals(this.skillsWithLevels, resumeProfileResumeProfileResponse.skillsWithLevels);
  }

  @Override
  public int hashCode() {
    return Objects.hash(additionalProperties, conditions, creds, nextIncompleteScreenId, profile, profileConditions, resume, resumes, screens, skillsWithLevels);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ResumeProfileResumeProfileResponse {\n");
    sb.append("    additionalProperties: ").append(toIndentedString(additionalProperties)).append("\n");
    sb.append("    conditions: ").append(toIndentedString(conditions)).append("\n");
    sb.append("    creds: ").append(toIndentedString(creds)).append("\n");
    sb.append("    nextIncompleteScreenId: ").append(toIndentedString(nextIncompleteScreenId)).append("\n");
    sb.append("    profile: ").append(toIndentedString(profile)).append("\n");
    sb.append("    profileConditions: ").append(toIndentedString(profileConditions)).append("\n");
    sb.append("    resume: ").append(toIndentedString(resume)).append("\n");
    sb.append("    resumes: ").append(toIndentedString(resumes)).append("\n");
    sb.append("    screens: ").append(toIndentedString(screens)).append("\n");
    sb.append("    skillsWithLevels: ").append(toIndentedString(skillsWithLevels)).append("\n");
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

