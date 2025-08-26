package ru.brobrocode.cadra.client.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.annotation.Generated;
import jakarta.validation.constraints.NotNull;

import java.util.Objects;

/**
 * NegotiationsNegotiationMessageTemplate
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2025-08-17T15:41:09.394389505+05:00[Asia/Yekaterinburg]", comments = "Generator version: 7.6.0")
public class NegotiationsNegotiationMessageTemplate {

  private String employerState;

  private Boolean templateModified;

  private String text;

  public NegotiationsNegotiationMessageTemplate() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public NegotiationsNegotiationMessageTemplate(Boolean templateModified, String text) {
    this.templateModified = templateModified;
    this.text = text;
  }

  public NegotiationsNegotiationMessageTemplate employerState(String employerState) {
    this.employerState = employerState;
    return this;
  }

  /**
   * Работодательский статус, соответствующий данному шаблону; может отсутствовать если шаблон не связан с каким-либо статусом
   * @return employerState
  */
  
  @Schema(name = "employer_state", description = "Работодательский статус, соответствующий данному шаблону; может отсутствовать если шаблон не связан с каким-либо статусом", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("employer_state")
  public String getEmployerState() {
    return employerState;
  }

  public void setEmployerState(String employerState) {
    this.employerState = employerState;
  }

  public NegotiationsNegotiationMessageTemplate templateModified(Boolean templateModified) {
    this.templateModified = templateModified;
    return this;
  }

  /**
   * Был ли изменен шаблон работодателем или же используется стандартный шаблон с текстом от Хэдхантер
   * @return templateModified
  */
  @NotNull 
  @Schema(name = "template_modified", description = "Был ли изменен шаблон работодателем или же используется стандартный шаблон с текстом от Хэдхантер", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("template_modified")
  public Boolean getTemplateModified() {
    return templateModified;
  }

  public void setTemplateModified(Boolean templateModified) {
    this.templateModified = templateModified;
  }

  public NegotiationsNegotiationMessageTemplate text(String text) {
    this.text = text;
    return this;
  }

  /**
   * Текст шаблона
   * @return text
  */
  @NotNull 
  @Schema(name = "text", description = "Текст шаблона", requiredMode = Schema.RequiredMode.REQUIRED)
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
    NegotiationsNegotiationMessageTemplate negotiationsNegotiationMessageTemplate = (NegotiationsNegotiationMessageTemplate) o;
    return Objects.equals(this.employerState, negotiationsNegotiationMessageTemplate.employerState) &&
        Objects.equals(this.templateModified, negotiationsNegotiationMessageTemplate.templateModified) &&
        Objects.equals(this.text, negotiationsNegotiationMessageTemplate.text);
  }

  @Override
  public int hashCode() {
    return Objects.hash(employerState, templateModified, text);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class NegotiationsNegotiationMessageTemplate {\n");
    sb.append("    employerState: ").append(toIndentedString(employerState)).append("\n");
    sb.append("    templateModified: ").append(toIndentedString(templateModified)).append("\n");
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

