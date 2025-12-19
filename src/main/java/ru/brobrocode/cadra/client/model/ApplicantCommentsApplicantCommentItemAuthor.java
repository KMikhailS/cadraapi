package ru.brobrocode.cadra.client.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.annotation.Generated;
import jakarta.validation.constraints.NotNull;

import java.util.Objects;

/**
 * Автор комментария
 */

@Schema(name = "ApplicantCommentsApplicantCommentItem_author", description = "Автор комментария")
@JsonTypeName("ApplicantCommentsApplicantCommentItem_author")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2025-08-17T15:41:09.394389505+05:00[Asia/Yekaterinburg]", comments = "Generator version: 7.6.0")
public class ApplicantCommentsApplicantCommentItemAuthor {

  private String fullName;

  public ApplicantCommentsApplicantCommentItemAuthor() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public ApplicantCommentsApplicantCommentItemAuthor(String fullName) {
    this.fullName = fullName;
  }

  public ApplicantCommentsApplicantCommentItemAuthor fullName(String fullName) {
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
    ApplicantCommentsApplicantCommentItemAuthor applicantCommentsApplicantCommentItemAuthor = (ApplicantCommentsApplicantCommentItemAuthor) o;
    return Objects.equals(this.fullName, applicantCommentsApplicantCommentItemAuthor.fullName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(fullName);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ApplicantCommentsApplicantCommentItemAuthor {\n");
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

