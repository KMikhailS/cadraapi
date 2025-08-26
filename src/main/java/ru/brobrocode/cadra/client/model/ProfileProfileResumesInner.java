package ru.brobrocode.cadra.client.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.annotation.Generated;
import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;

import java.util.Objects;

/**
 * ProfileProfileResumesInner
 */

@JsonTypeName("ProfileProfileResumes_inner")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2025-08-17T15:41:09.394389505+05:00[Asia/Yekaterinburg]", comments = "Generator version: 7.6.0")
public class ProfileProfileResumesInner {

  private Object conditions;

  private ProfileProfileResumesListItemView resume;

  public ProfileProfileResumesInner() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public ProfileProfileResumesInner(Object conditions, ProfileProfileResumesListItemView resume) {
    this.conditions = conditions;
    this.resume = resume;
  }

  public ProfileProfileResumesInner conditions(Object conditions) {
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

  public ProfileProfileResumesInner resume(ProfileProfileResumesListItemView resume) {
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
  public ProfileProfileResumesListItemView getResume() {
    return resume;
  }

  public void setResume(ProfileProfileResumesListItemView resume) {
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
    ProfileProfileResumesInner profileProfileResumesInner = (ProfileProfileResumesInner) o;
    return Objects.equals(this.conditions, profileProfileResumesInner.conditions) &&
        Objects.equals(this.resume, profileProfileResumesInner.resume);
  }

  @Override
  public int hashCode() {
    return Objects.hash(conditions, resume);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ProfileProfileResumesInner {\n");
    sb.append("    conditions: ").append(toIndentedString(conditions)).append("\n");
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

