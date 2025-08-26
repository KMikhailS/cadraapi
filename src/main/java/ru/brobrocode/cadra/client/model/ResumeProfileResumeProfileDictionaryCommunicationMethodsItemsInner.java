package ru.brobrocode.cadra.client.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.annotation.Generated;
import jakarta.validation.constraints.NotNull;

import java.util.Objects;

/**
 * Способ коммуникации
 */

@Schema(name = "ResumeProfileResumeProfileDictionaryCommunicationMethods_items_inner", description = "Способ коммуникации")
@JsonTypeName("ResumeProfileResumeProfileDictionaryCommunicationMethods_items_inner")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2025-08-17T15:41:09.394389505+05:00[Asia/Yekaterinburg]", comments = "Generator version: 7.6.0")
public class ResumeProfileResumeProfileDictionaryCommunicationMethodsItemsInner {

  private String description = null;

  private String errorMessage = null;

  private String placeholder = null;

  private Integer position;

  private String regexp = null;

  private String title;

  private String type;

  public ResumeProfileResumeProfileDictionaryCommunicationMethodsItemsInner() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public ResumeProfileResumeProfileDictionaryCommunicationMethodsItemsInner(String title, String type) {
    this.title = title;
    this.type = type;
  }

  public ResumeProfileResumeProfileDictionaryCommunicationMethodsItemsInner description(String description) {
    this.description = description;
    return this;
  }

  /**
   * Описание способа коммуникации
   * @return description
  */
  
  @Schema(name = "description", description = "Описание способа коммуникации", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("description")
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public ResumeProfileResumeProfileDictionaryCommunicationMethodsItemsInner errorMessage(String errorMessage) {
    this.errorMessage = errorMessage;
    return this;
  }

  /**
   * Сообщение об ошибке
   * @return errorMessage
  */
  
  @Schema(name = "error_message", description = "Сообщение об ошибке", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("error_message")
  public String getErrorMessage() {
    return errorMessage;
  }

  public void setErrorMessage(String errorMessage) {
    this.errorMessage = errorMessage;
  }

  public ResumeProfileResumeProfileDictionaryCommunicationMethodsItemsInner placeholder(String placeholder) {
    this.placeholder = placeholder;
    return this;
  }

  /**
   * Плейсхолдер
   * @return placeholder
  */
  
  @Schema(name = "placeholder", description = "Плейсхолдер", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("placeholder")
  public String getPlaceholder() {
    return placeholder;
  }

  public void setPlaceholder(String placeholder) {
    this.placeholder = placeholder;
  }

  public ResumeProfileResumeProfileDictionaryCommunicationMethodsItemsInner position(Integer position) {
    this.position = position;
    return this;
  }

  /**
   * Место в списке
   * @return position
  */
  
  @Schema(name = "position", description = "Место в списке", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("position")
  public Integer getPosition() {
    return position;
  }

  public void setPosition(Integer position) {
    this.position = position;
  }

  public ResumeProfileResumeProfileDictionaryCommunicationMethodsItemsInner regexp(String regexp) {
    this.regexp = regexp;
    return this;
  }

  /**
   * Паттерн для проверки данных
   * @return regexp
  */
  
  @Schema(name = "regexp", description = "Паттерн для проверки данных", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("regexp")
  public String getRegexp() {
    return regexp;
  }

  public void setRegexp(String regexp) {
    this.regexp = regexp;
  }

  public ResumeProfileResumeProfileDictionaryCommunicationMethodsItemsInner title(String title) {
    this.title = title;
    return this;
  }

  /**
   * Название
   * @return title
  */
  @NotNull 
  @Schema(name = "title", description = "Название", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("title")
  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public ResumeProfileResumeProfileDictionaryCommunicationMethodsItemsInner type(String type) {
    this.type = type;
    return this;
  }

  /**
   * Тип
   * @return type
  */
  @NotNull 
  @Schema(name = "type", description = "Тип", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("type")
  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ResumeProfileResumeProfileDictionaryCommunicationMethodsItemsInner resumeProfileResumeProfileDictionaryCommunicationMethodsItemsInner = (ResumeProfileResumeProfileDictionaryCommunicationMethodsItemsInner) o;
    return Objects.equals(this.description, resumeProfileResumeProfileDictionaryCommunicationMethodsItemsInner.description) &&
        Objects.equals(this.errorMessage, resumeProfileResumeProfileDictionaryCommunicationMethodsItemsInner.errorMessage) &&
        Objects.equals(this.placeholder, resumeProfileResumeProfileDictionaryCommunicationMethodsItemsInner.placeholder) &&
        Objects.equals(this.position, resumeProfileResumeProfileDictionaryCommunicationMethodsItemsInner.position) &&
        Objects.equals(this.regexp, resumeProfileResumeProfileDictionaryCommunicationMethodsItemsInner.regexp) &&
        Objects.equals(this.title, resumeProfileResumeProfileDictionaryCommunicationMethodsItemsInner.title) &&
        Objects.equals(this.type, resumeProfileResumeProfileDictionaryCommunicationMethodsItemsInner.type);
  }

  @Override
  public int hashCode() {
    return Objects.hash(description, errorMessage, placeholder, position, regexp, title, type);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ResumeProfileResumeProfileDictionaryCommunicationMethodsItemsInner {\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    errorMessage: ").append(toIndentedString(errorMessage)).append("\n");
    sb.append("    placeholder: ").append(toIndentedString(placeholder)).append("\n");
    sb.append("    position: ").append(toIndentedString(position)).append("\n");
    sb.append("    regexp: ").append(toIndentedString(regexp)).append("\n");
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
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

