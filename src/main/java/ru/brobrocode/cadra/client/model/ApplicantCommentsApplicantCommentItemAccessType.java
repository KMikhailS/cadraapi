package ru.brobrocode.cadra.client.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.annotation.Generated;
import jakarta.validation.constraints.NotNull;

import java.util.Objects;

/**
 * Тип доступа для комментария. Возможные значения перечислены [в справочнике](#tag/Obshie-spravochniki/operation/get-dictionaries) в поле &#x60;applicant_comment_access_type&#x60;
 */

@Schema(name = "ApplicantCommentsApplicantCommentItem_access_type", description = "Тип доступа для комментария. Возможные значения перечислены [в справочнике](#tag/Obshie-spravochniki/operation/get-dictionaries) в поле `applicant_comment_access_type`")
@JsonTypeName("ApplicantCommentsApplicantCommentItem_access_type")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2025-08-17T15:41:09.394389505+05:00[Asia/Yekaterinburg]", comments = "Generator version: 7.6.0")
public class ApplicantCommentsApplicantCommentItemAccessType {

  private String id;

  private String name;

  public ApplicantCommentsApplicantCommentItemAccessType() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public ApplicantCommentsApplicantCommentItemAccessType(String id, String name) {
    this.id = id;
    this.name = name;
  }

  public ApplicantCommentsApplicantCommentItemAccessType id(String id) {
    this.id = id;
    return this;
  }

  /**
   * Идентификатор типа доступа
   * @return id
  */
  @NotNull 
  @Schema(name = "id", description = "Идентификатор типа доступа", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("id")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public ApplicantCommentsApplicantCommentItemAccessType name(String name) {
    this.name = name;
    return this;
  }

  /**
   * Название типа доступа
   * @return name
  */
  @NotNull 
  @Schema(name = "name", description = "Название типа доступа", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("name")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ApplicantCommentsApplicantCommentItemAccessType applicantCommentsApplicantCommentItemAccessType = (ApplicantCommentsApplicantCommentItemAccessType) o;
    return Objects.equals(this.id, applicantCommentsApplicantCommentItemAccessType.id) &&
        Objects.equals(this.name, applicantCommentsApplicantCommentItemAccessType.name);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ApplicantCommentsApplicantCommentItemAccessType {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
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

