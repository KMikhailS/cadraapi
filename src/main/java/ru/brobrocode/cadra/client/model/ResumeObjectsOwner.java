package ru.brobrocode.cadra.client.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.annotation.Generated;
import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;

import java.util.Objects;

/**
 * ResumeObjectsOwner
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2025-08-17T15:41:09.394389505+05:00[Asia/Yekaterinburg]", comments = "Generator version: 7.6.0")
public class ResumeObjectsOwner {

  private ResumeObjectsOwnerComments comments;

  private String id;

  public ResumeObjectsOwner() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public ResumeObjectsOwner(ResumeObjectsOwnerComments comments, String id) {
    this.comments = comments;
    this.id = id;
  }

  public ResumeObjectsOwner comments(ResumeObjectsOwnerComments comments) {
    this.comments = comments;
    return this;
  }

  /**
   * Раздел [Комментарии к владельцу резюме](#tag/Kommentarii-k-soiskatelyu/operation/get-applicant-comments-list)
   * @return comments
  */
  @NotNull @Valid 
  @Schema(name = "comments", description = "Раздел [Комментарии к владельцу резюме](#tag/Kommentarii-k-soiskatelyu/operation/get-applicant-comments-list)", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("comments")
  public ResumeObjectsOwnerComments getComments() {
    return comments;
  }

  public void setComments(ResumeObjectsOwnerComments comments) {
    this.comments = comments;
  }

  public ResumeObjectsOwner id(String id) {
    this.id = id;
    return this;
  }

  /**
   * Идентификатор владельца резюме
   * @return id
  */
  @NotNull 
  @Schema(name = "id", description = "Идентификатор владельца резюме", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("id")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ResumeObjectsOwner resumeObjectsOwner = (ResumeObjectsOwner) o;
    return Objects.equals(this.comments, resumeObjectsOwner.comments) &&
        Objects.equals(this.id, resumeObjectsOwner.id);
  }

  @Override
  public int hashCode() {
    return Objects.hash(comments, id);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ResumeObjectsOwner {\n");
    sb.append("    comments: ").append(toIndentedString(comments)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
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

