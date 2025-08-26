package ru.brobrocode.cadra.client.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.annotation.Generated;
import jakarta.validation.constraints.NotNull;

import java.util.Objects;

/**
 * ApplicantCommentsAuthor
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2025-08-17T15:41:09.394389505+05:00[Asia/Yekaterinburg]", comments = "Generator version: 7.6.0")
public class ApplicantCommentsAuthor {

  private String fullName;

  public ApplicantCommentsAuthor() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public ApplicantCommentsAuthor(String fullName) {
    this.fullName = fullName;
  }

  public ApplicantCommentsAuthor fullName(String fullName) {
    this.fullName = fullName;
    return this;
  }

  /**
   * ФИО автора комментария
   * @return fullName
  */
  @NotNull 
  @Schema(name = "full_name", description = "ФИО автора комментария", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("full_name")
  public String getFullName() {
    return fullName;
  }

  public void setFullName(String fullName) {
    this.fullName = fullName;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ApplicantCommentsAuthor applicantCommentsAuthor = (ApplicantCommentsAuthor) o;
    return Objects.equals(this.fullName, applicantCommentsAuthor.fullName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(fullName);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ApplicantCommentsAuthor {\n");
    sb.append("    fullName: ").append(toIndentedString(fullName)).append("\n");
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

