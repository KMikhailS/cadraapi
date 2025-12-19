package ru.brobrocode.cadra.client.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.annotation.Generated;
import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;

import java.util.Objects;

/**
 * Контакт
 */

@Schema(name = "ResumeEditResume_contact_inner", description = "Контакт")
@JsonTypeName("ResumeEditResume_contact_inner")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2025-08-17T15:41:09.394389505+05:00[Asia/Yekaterinburg]", comments = "Generator version: 7.6.0")
public class ResumeEditResumeContactInner {

  private String comment;

  private Boolean preferred;

  private IncludesId type;

  private ResumeEditResumeContactInnerValue value;

  public ResumeEditResumeContactInner() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public ResumeEditResumeContactInner(Boolean preferred, IncludesId type) {
    this.preferred = preferred;
    this.type = type;
  }

  public ResumeEditResumeContactInner comment(String comment) {
    this.comment = comment;
    return this;
  }

  /**
   * Комментарий к контакту
   * @return comment
  */
  
  @Schema(name = "comment", description = "Комментарий к контакту", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("comment")
  public String getComment() {
    return comment;
  }

  public void setComment(String comment) {
    this.comment = comment;
  }

  public ResumeEditResumeContactInner preferred(Boolean preferred) {
    this.preferred = preferred;
    return this;
  }

  /**
   * Является ли данный способ связи предпочитаемым (обязательно указать один контакт как предпочитаемый `\"preferred\": true`, в случае если preferred не передан, считаем, что передано значение `false`) 
   * @return preferred
  */
  @NotNull 
  @Schema(name = "preferred", description = "Является ли данный способ связи предпочитаемым (обязательно указать один контакт как предпочитаемый `\"preferred\": true`, в случае если preferred не передан, считаем, что передано значение `false`) ", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("preferred")
  public Boolean getPreferred() {
    return preferred;
  }

  public void setPreferred(Boolean preferred) {
    this.preferred = preferred;
  }

  public ResumeEditResumeContactInner type(IncludesId type) {
    this.type = type;
    return this;
  }

  /**
   * Тип контакта. Элемент справочника [preferred_contact_type](#tag/Obshie-spravochniki/operation/get-dictionaries)
   * @return type
  */
  @NotNull @Valid 
  @Schema(name = "type", description = "Тип контакта. Элемент справочника [preferred_contact_type](#tag/Obshie-spravochniki/operation/get-dictionaries)", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("type")
  public IncludesId getType() {
    return type;
  }

  public void setType(IncludesId type) {
    this.type = type;
  }

  public ResumeEditResumeContactInner value(ResumeEditResumeContactInnerValue value) {
    this.value = value;
    return this;
  }

  /**
   * Get value
   * @return value
  */
  @Valid 
  @Schema(name = "value", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("value")
  public ResumeEditResumeContactInnerValue getValue() {
    return value;
  }

  public void setValue(ResumeEditResumeContactInnerValue value) {
    this.value = value;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ResumeEditResumeContactInner resumeEditResumeContactInner = (ResumeEditResumeContactInner) o;
    return Objects.equals(this.comment, resumeEditResumeContactInner.comment) &&
        Objects.equals(this.preferred, resumeEditResumeContactInner.preferred) &&
        Objects.equals(this.type, resumeEditResumeContactInner.type) &&
        Objects.equals(this.value, resumeEditResumeContactInner.value);
  }

  @Override
  public int hashCode() {
    return Objects.hash(comment, preferred, type, value);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ResumeEditResumeContactInner {\n");
    sb.append("    comment: ").append(toIndentedString(comment)).append("\n");
    sb.append("    preferred: ").append(toIndentedString(preferred)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    value: ").append(toIndentedString(value)).append("\n");
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

