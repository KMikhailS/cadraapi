package ru.brobrocode.cadra.client.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.annotation.Generated;
import jakarta.validation.Valid;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * ResumeProfileScreenMessagesValueInner
 */

@JsonTypeName("ResumeProfileScreen_messages_value_inner")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2025-08-17T15:41:09.394389505+05:00[Asia/Yekaterinburg]", comments = "Generator version: 7.6.0")
public class ResumeProfileScreenMessagesValueInner {

  @Valid
  private List<String> fields = new ArrayList<>();

  private String text;

  public ResumeProfileScreenMessagesValueInner fields(List<String> fields) {
    this.fields = fields;
    return this;
  }

  public ResumeProfileScreenMessagesValueInner addFieldsItem(String fieldsItem) {
    if (this.fields == null) {
      this.fields = new ArrayList<>();
    }
    this.fields.add(fieldsItem);
    return this;
  }

  /**
   * Список полей, к которым относится сообщение
   * @return fields
  */
  
  @Schema(name = "fields", description = "Список полей, к которым относится сообщение", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("fields")
  public List<String> getFields() {
    return fields;
  }

  public void setFields(List<String> fields) {
    this.fields = fields;
  }

  public ResumeProfileScreenMessagesValueInner text(String text) {
    this.text = text;
    return this;
  }

  /**
   * Текст сообщения
   * @return text
  */
  
  @Schema(name = "text", description = "Текст сообщения", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
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
    ResumeProfileScreenMessagesValueInner resumeProfileScreenMessagesValueInner = (ResumeProfileScreenMessagesValueInner) o;
    return Objects.equals(this.fields, resumeProfileScreenMessagesValueInner.fields) &&
        Objects.equals(this.text, resumeProfileScreenMessagesValueInner.text);
  }

  @Override
  public int hashCode() {
    return Objects.hash(fields, text);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ResumeProfileScreenMessagesValueInner {\n");
    sb.append("    fields: ").append(toIndentedString(fields)).append("\n");
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

