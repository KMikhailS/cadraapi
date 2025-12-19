package ru.brobrocode.cadra.client.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.annotation.Generated;
import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;

import java.util.Objects;

/**
 * ApplicantCommentsApplicantCommentItem
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2025-08-17T15:41:09.394389505+05:00[Asia/Yekaterinburg]", comments = "Generator version: 7.6.0")
public class ApplicantCommentsApplicantCommentItem {

  private ApplicantCommentsApplicantCommentItemAccessType accessType;

  private ApplicantCommentsApplicantCommentItemAuthor author;

  private String createdAt;

  private String id;

  private Boolean isMine;

  private String text;

  public ApplicantCommentsApplicantCommentItem() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public ApplicantCommentsApplicantCommentItem(ApplicantCommentsApplicantCommentItemAccessType accessType, ApplicantCommentsApplicantCommentItemAuthor author, String createdAt, String id, Boolean isMine, String text) {
    this.accessType = accessType;
    this.author = author;
    this.createdAt = createdAt;
    this.id = id;
    this.isMine = isMine;
    this.text = text;
  }

  public ApplicantCommentsApplicantCommentItem accessType(ApplicantCommentsApplicantCommentItemAccessType accessType) {
    this.accessType = accessType;
    return this;
  }

  /**
   * Get accessType
   * @return accessType
  */
  @NotNull @Valid 
  @Schema(name = "access_type", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("access_type")
  public ApplicantCommentsApplicantCommentItemAccessType getAccessType() {
    return accessType;
  }

  public void setAccessType(ApplicantCommentsApplicantCommentItemAccessType accessType) {
    this.accessType = accessType;
  }

  public ApplicantCommentsApplicantCommentItem author(ApplicantCommentsApplicantCommentItemAuthor author) {
    this.author = author;
    return this;
  }

  /**
   * Get author
   * @return author
  */
  @NotNull @Valid 
  @Schema(name = "author", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("author")
  public ApplicantCommentsApplicantCommentItemAuthor getAuthor() {
    return author;
  }

  public void setAuthor(ApplicantCommentsApplicantCommentItemAuthor author) {
    this.author = author;
  }

  public ApplicantCommentsApplicantCommentItem createdAt(String createdAt) {
    this.createdAt = createdAt;
    return this;
  }

  /**
   * Дата создания комментария
   * @return createdAt
  */
  @NotNull 
  @Schema(name = "created_at", description = "Дата создания комментария", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("created_at")
  public String getCreatedAt() {
    return createdAt;
  }

  public void setCreatedAt(String createdAt) {
    this.createdAt = createdAt;
  }

  public ApplicantCommentsApplicantCommentItem id(String id) {
    this.id = id;
    return this;
  }

  /**
   * Уникальный идентификатор комментария
   * @return id
  */
  @NotNull 
  @Schema(name = "id", description = "Уникальный идентификатор комментария", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("id")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public ApplicantCommentsApplicantCommentItem isMine(Boolean isMine) {
    this.isMine = isMine;
    return this;
  }

  /**
   * Комментарий написан текущим пользователем?
   * @return isMine
  */
  @NotNull 
  @Schema(name = "is_mine", description = "Комментарий написан текущим пользователем?", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("is_mine")
  public Boolean getIsMine() {
    return isMine;
  }

  public void setIsMine(Boolean isMine) {
    this.isMine = isMine;
  }

  public ApplicantCommentsApplicantCommentItem text(String text) {
    this.text = text;
    return this;
  }

  /**
   * Текст комментария. Может содержать символы новой строки
   * @return text
  */
  @NotNull 
  @Schema(name = "text", description = "Текст комментария. Может содержать символы новой строки", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("text")
  public String getText() {
    return text;
  }

  public void setText(String text) {
    this.text = text;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ApplicantCommentsApplicantCommentItem applicantCommentsApplicantCommentItem = (ApplicantCommentsApplicantCommentItem) o;
    return Objects.equals(this.accessType, applicantCommentsApplicantCommentItem.accessType) &&
        Objects.equals(this.author, applicantCommentsApplicantCommentItem.author) &&
        Objects.equals(this.createdAt, applicantCommentsApplicantCommentItem.createdAt) &&
        Objects.equals(this.id, applicantCommentsApplicantCommentItem.id) &&
        Objects.equals(this.isMine, applicantCommentsApplicantCommentItem.isMine) &&
        Objects.equals(this.text, applicantCommentsApplicantCommentItem.text);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accessType, author, createdAt, id, isMine, text);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ApplicantCommentsApplicantCommentItem {\n");
    sb.append("    accessType: ").append(toIndentedString(accessType)).append("\n");
    sb.append("    author: ").append(toIndentedString(author)).append("\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    isMine: ").append(toIndentedString(isMine)).append("\n");
    sb.append("    text: ").append(toIndentedString(text)).append("\n");
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

