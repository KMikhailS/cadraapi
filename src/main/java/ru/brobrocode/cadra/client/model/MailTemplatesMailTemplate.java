package ru.brobrocode.cadra.client.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.annotation.Generated;
import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * MailTemplatesMailTemplate
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2025-08-17T15:41:09.394389505+05:00[Asia/Yekaterinburg]", comments = "Generator version: 7.6.0")
public class MailTemplatesMailTemplate {

  private Boolean editable;

  private String employerState;

  private String id;

  private String name;

  private Boolean templateModified;

  private String text;

  /**
   * Способ доставки сообщения сформированного из шаблона
   */
  public enum TypeEnum {
    SMS("SMS"),
    
    EMAIL("EMAIL");

    private String value;

    TypeEnum(String value) {
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
    public static TypeEnum fromValue(String value) {
      for (TypeEnum b : TypeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  private TypeEnum type;

  @Valid
  private List<@Valid IncludesIdName> variables = new ArrayList<>();

  public MailTemplatesMailTemplate() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public MailTemplatesMailTemplate(Boolean editable, String id, String name, Boolean templateModified, String text, TypeEnum type, List<@Valid IncludesIdName> variables) {
    this.editable = editable;
    this.id = id;
    this.name = name;
    this.templateModified = templateModified;
    this.text = text;
    this.type = type;
    this.variables = variables;
  }

  public MailTemplatesMailTemplate editable(Boolean editable) {
    this.editable = editable;
    return this;
  }

  /**
   * Можно ли редактировать текст шаблона
   * @return editable
  */
  @NotNull 
  @Schema(name = "editable", description = "Можно ли редактировать текст шаблона", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("editable")
  public Boolean getEditable() {
    return editable;
  }

  public void setEditable(Boolean editable) {
    this.editable = editable;
  }

  public MailTemplatesMailTemplate employerState(String employerState) {
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

  public MailTemplatesMailTemplate id(String id) {
    this.id = id;
    return this;
  }

  /**
   * Идентификатор шаблона
   * @return id
  */
  @NotNull 
  @Schema(name = "id", description = "Идентификатор шаблона", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("id")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public MailTemplatesMailTemplate name(String name) {
    this.name = name;
    return this;
  }

  /**
   * Имя шаблона
   * @return name
  */
  @NotNull 
  @Schema(name = "name", description = "Имя шаблона", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("name")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public MailTemplatesMailTemplate templateModified(Boolean templateModified) {
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

  public MailTemplatesMailTemplate text(String text) {
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

  public MailTemplatesMailTemplate type(TypeEnum type) {
    this.type = type;
    return this;
  }

  /**
   * Способ доставки сообщения сформированного из шаблона
   * @return type
  */
  @NotNull 
  @Schema(name = "type", description = "Способ доставки сообщения сформированного из шаблона", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("type")
  public TypeEnum getType() {
    return type;
  }

  public void setType(TypeEnum type) {
    this.type = type;
  }

  public MailTemplatesMailTemplate variables(List<@Valid IncludesIdName> variables) {
    this.variables = variables;
    return this;
  }

  public MailTemplatesMailTemplate addVariablesItem(IncludesIdName variablesItem) {
    if (this.variables == null) {
      this.variables = new ArrayList<>();
    }
    this.variables.add(variablesItem);
    return this;
  }

  /**
   * Переменные доступные для вставки в шаблон
   * @return variables
  */
  @NotNull @Valid 
  @Schema(name = "variables", description = "Переменные доступные для вставки в шаблон", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("variables")
  public List<@Valid IncludesIdName> getVariables() {
    return variables;
  }

  public void setVariables(List<@Valid IncludesIdName> variables) {
    this.variables = variables;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MailTemplatesMailTemplate mailTemplatesMailTemplate = (MailTemplatesMailTemplate) o;
    return Objects.equals(this.editable, mailTemplatesMailTemplate.editable) &&
        Objects.equals(this.employerState, mailTemplatesMailTemplate.employerState) &&
        Objects.equals(this.id, mailTemplatesMailTemplate.id) &&
        Objects.equals(this.name, mailTemplatesMailTemplate.name) &&
        Objects.equals(this.templateModified, mailTemplatesMailTemplate.templateModified) &&
        Objects.equals(this.text, mailTemplatesMailTemplate.text) &&
        Objects.equals(this.type, mailTemplatesMailTemplate.type) &&
        Objects.equals(this.variables, mailTemplatesMailTemplate.variables);
  }

  @Override
  public int hashCode() {
    return Objects.hash(editable, employerState, id, name, templateModified, text, type, variables);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MailTemplatesMailTemplate {\n");
    sb.append("    editable: ").append(toIndentedString(editable)).append("\n");
    sb.append("    employerState: ").append(toIndentedString(employerState)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    templateModified: ").append(toIndentedString(templateModified)).append("\n");
    sb.append("    text: ").append(toIndentedString(text)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    variables: ").append(toIndentedString(variables)).append("\n");
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

