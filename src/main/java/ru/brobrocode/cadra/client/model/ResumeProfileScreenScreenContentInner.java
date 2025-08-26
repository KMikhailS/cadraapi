package ru.brobrocode.cadra.client.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.annotation.Generated;

import java.util.Objects;

/**
 * ResumeProfileScreenScreenContentInner
 */

@JsonTypeName("ResumeProfileScreen_screen_content_inner")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2025-08-17T15:41:09.394389505+05:00[Asia/Yekaterinburg]", comments = "Generator version: 7.6.0")
public class ResumeProfileScreenScreenContentInner {

  private String contentId;

  /**
   * Вид контента для отображения
   */
  public enum ContentTypeEnum {
    CRED("cred"),
    
    SKILL_LEVELS("skill_levels");

    private String value;

    ContentTypeEnum(String value) {
      this.value = value;
    }

    @JsonValue
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static ContentTypeEnum fromValue(String value) {
      for (ContentTypeEnum b : ContentTypeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  private ContentTypeEnum contentType;

  public ResumeProfileScreenScreenContentInner contentId(String contentId) {
    this.contentId = contentId;
    return this;
  }

  /**
   * Идентификатор контента. Для креда это question_id, для уровней навыков незначащее значение skill_levels
   * @return contentId
  */
  
  @Schema(name = "content_id", description = "Идентификатор контента. Для креда это question_id, для уровней навыков незначащее значение skill_levels", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("content_id")
  public String getContentId() {
    return contentId;
  }

  public void setContentId(String contentId) {
    this.contentId = contentId;
  }

  public ResumeProfileScreenScreenContentInner contentType(ContentTypeEnum contentType) {
    this.contentType = contentType;
    return this;
  }

  /**
   * Вид контента для отображения
   * @return contentType
  */
  
  @Schema(name = "content_type", description = "Вид контента для отображения", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("content_type")
  public ContentTypeEnum getContentType() {
    return contentType;
  }

  public void setContentType(ContentTypeEnum contentType) {
    this.contentType = contentType;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ResumeProfileScreenScreenContentInner resumeProfileScreenScreenContentInner = (ResumeProfileScreenScreenContentInner) o;
    return Objects.equals(this.contentId, resumeProfileScreenScreenContentInner.contentId) &&
        Objects.equals(this.contentType, resumeProfileScreenScreenContentInner.contentType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(contentId, contentType);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ResumeProfileScreenScreenContentInner {\n");
    sb.append("    contentId: ").append(toIndentedString(contentId)).append("\n");
    sb.append("    contentType: ").append(toIndentedString(contentType)).append("\n");
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

