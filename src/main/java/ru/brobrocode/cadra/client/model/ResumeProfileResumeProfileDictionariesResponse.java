package ru.brobrocode.cadra.client.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.annotation.Generated;
import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;

import java.util.Objects;

/**
 * ResumeProfileResumeProfileDictionariesResponse
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2025-08-17T15:41:09.394389505+05:00[Asia/Yekaterinburg]", comments = "Generator version: 7.6.0")
public class ResumeProfileResumeProfileDictionariesResponse {

  private ResumeProfileResumeProfileDictionaryTitles resumeAnyJobTitles;

  private ResumeProfileResumeProfileDictionaryTitles resumeDefaultTitles;

  private ResumeProfileResumeProfileDictionaryTitles resumePopularTitles;

  private ResumeProfileResumeProfileDictionaryCommunicationMethods resumeProfileCommunicationMethods;

  public ResumeProfileResumeProfileDictionariesResponse() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public ResumeProfileResumeProfileDictionariesResponse(ResumeProfileResumeProfileDictionaryTitles resumeAnyJobTitles, ResumeProfileResumeProfileDictionaryTitles resumeDefaultTitles, ResumeProfileResumeProfileDictionaryTitles resumePopularTitles, ResumeProfileResumeProfileDictionaryCommunicationMethods resumeProfileCommunicationMethods) {
    this.resumeAnyJobTitles = resumeAnyJobTitles;
    this.resumeDefaultTitles = resumeDefaultTitles;
    this.resumePopularTitles = resumePopularTitles;
    this.resumeProfileCommunicationMethods = resumeProfileCommunicationMethods;
  }

  public ResumeProfileResumeProfileDictionariesResponse resumeAnyJobTitles(ResumeProfileResumeProfileDictionaryTitles resumeAnyJobTitles) {
    this.resumeAnyJobTitles = resumeAnyJobTitles;
    return this;
  }

  /**
   * Get resumeAnyJobTitles
   * @return resumeAnyJobTitles
  */
  @NotNull @Valid 
  @Schema(name = "resume_any_job_titles", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("resume_any_job_titles")
  public ResumeProfileResumeProfileDictionaryTitles getResumeAnyJobTitles() {
    return resumeAnyJobTitles;
  }

  public void setResumeAnyJobTitles(ResumeProfileResumeProfileDictionaryTitles resumeAnyJobTitles) {
    this.resumeAnyJobTitles = resumeAnyJobTitles;
  }

  public ResumeProfileResumeProfileDictionariesResponse resumeDefaultTitles(ResumeProfileResumeProfileDictionaryTitles resumeDefaultTitles) {
    this.resumeDefaultTitles = resumeDefaultTitles;
    return this;
  }

  /**
   * Get resumeDefaultTitles
   * @return resumeDefaultTitles
  */
  @NotNull @Valid 
  @Schema(name = "resume_default_titles", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("resume_default_titles")
  public ResumeProfileResumeProfileDictionaryTitles getResumeDefaultTitles() {
    return resumeDefaultTitles;
  }

  public void setResumeDefaultTitles(ResumeProfileResumeProfileDictionaryTitles resumeDefaultTitles) {
    this.resumeDefaultTitles = resumeDefaultTitles;
  }

  public ResumeProfileResumeProfileDictionariesResponse resumePopularTitles(ResumeProfileResumeProfileDictionaryTitles resumePopularTitles) {
    this.resumePopularTitles = resumePopularTitles;
    return this;
  }

  /**
   * Get resumePopularTitles
   * @return resumePopularTitles
  */
  @NotNull @Valid 
  @Schema(name = "resume_popular_titles", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("resume_popular_titles")
  public ResumeProfileResumeProfileDictionaryTitles getResumePopularTitles() {
    return resumePopularTitles;
  }

  public void setResumePopularTitles(ResumeProfileResumeProfileDictionaryTitles resumePopularTitles) {
    this.resumePopularTitles = resumePopularTitles;
  }

  public ResumeProfileResumeProfileDictionariesResponse resumeProfileCommunicationMethods(ResumeProfileResumeProfileDictionaryCommunicationMethods resumeProfileCommunicationMethods) {
    this.resumeProfileCommunicationMethods = resumeProfileCommunicationMethods;
    return this;
  }

  /**
   * Get resumeProfileCommunicationMethods
   * @return resumeProfileCommunicationMethods
  */
  @NotNull @Valid 
  @Schema(name = "resume_profile_communication_methods", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("resume_profile_communication_methods")
  public ResumeProfileResumeProfileDictionaryCommunicationMethods getResumeProfileCommunicationMethods() {
    return resumeProfileCommunicationMethods;
  }

  public void setResumeProfileCommunicationMethods(ResumeProfileResumeProfileDictionaryCommunicationMethods resumeProfileCommunicationMethods) {
    this.resumeProfileCommunicationMethods = resumeProfileCommunicationMethods;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ResumeProfileResumeProfileDictionariesResponse resumeProfileResumeProfileDictionariesResponse = (ResumeProfileResumeProfileDictionariesResponse) o;
    return Objects.equals(this.resumeAnyJobTitles, resumeProfileResumeProfileDictionariesResponse.resumeAnyJobTitles) &&
        Objects.equals(this.resumeDefaultTitles, resumeProfileResumeProfileDictionariesResponse.resumeDefaultTitles) &&
        Objects.equals(this.resumePopularTitles, resumeProfileResumeProfileDictionariesResponse.resumePopularTitles) &&
        Objects.equals(this.resumeProfileCommunicationMethods, resumeProfileResumeProfileDictionariesResponse.resumeProfileCommunicationMethods);
  }

  @Override
  public int hashCode() {
    return Objects.hash(resumeAnyJobTitles, resumeDefaultTitles, resumePopularTitles, resumeProfileCommunicationMethods);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ResumeProfileResumeProfileDictionariesResponse {\n");
    sb.append("    resumeAnyJobTitles: ").append(toIndentedString(resumeAnyJobTitles)).append("\n");
    sb.append("    resumeDefaultTitles: ").append(toIndentedString(resumeDefaultTitles)).append("\n");
    sb.append("    resumePopularTitles: ").append(toIndentedString(resumePopularTitles)).append("\n");
    sb.append("    resumeProfileCommunicationMethods: ").append(toIndentedString(resumeProfileCommunicationMethods)).append("\n");
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

