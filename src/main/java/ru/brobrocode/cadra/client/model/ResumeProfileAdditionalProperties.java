package ru.brobrocode.cadra.client.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.annotation.Generated;

import java.util.Objects;

/**
 * ResumeProfileAdditionalProperties
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2025-08-17T15:41:09.394389505+05:00[Asia/Yekaterinburg]", comments = "Generator version: 7.6.0")
public class ResumeProfileAdditionalProperties {

  private Boolean anyJob;

  private Boolean jobByEducation;

  public ResumeProfileAdditionalProperties anyJob(Boolean anyJob) {
    this.anyJob = anyJob;
    return this;
  }

  /**
   * Создано ли резюме через \"любая работа\"
   * @return anyJob
  */
  
  @Schema(name = "any_job", description = "Создано ли резюме через \"любая работа\"", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("any_job")
  public Boolean getAnyJob() {
    return anyJob;
  }

  public void setAnyJob(Boolean anyJob) {
    this.anyJob = anyJob;
  }

  public ResumeProfileAdditionalProperties jobByEducation(Boolean jobByEducation) {
    this.jobByEducation = jobByEducation;
    return this;
  }

  /**
   * Флаг для следующего экрана необходимо ли считать профессии по образованию
   * @return jobByEducation
  */
  
  @Schema(name = "job_by_education", description = "Флаг для следующего экрана необходимо ли считать профессии по образованию", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("job_by_education")
  public Boolean getJobByEducation() {
    return jobByEducation;
  }

  public void setJobByEducation(Boolean jobByEducation) {
    this.jobByEducation = jobByEducation;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ResumeProfileAdditionalProperties resumeProfileAdditionalProperties = (ResumeProfileAdditionalProperties) o;
    return Objects.equals(this.anyJob, resumeProfileAdditionalProperties.anyJob) &&
        Objects.equals(this.jobByEducation, resumeProfileAdditionalProperties.jobByEducation);
  }

  @Override
  public int hashCode() {
    return Objects.hash(anyJob, jobByEducation);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ResumeProfileAdditionalProperties {\n");
    sb.append("    anyJob: ").append(toIndentedString(anyJob)).append("\n");
    sb.append("    jobByEducation: ").append(toIndentedString(jobByEducation)).append("\n");
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

