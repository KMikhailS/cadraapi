package ru.brobrocode.cadra.client.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.annotation.Generated;
import jakarta.validation.constraints.NotNull;

import java.util.Objects;

/**
 * ErrorsNegotiationEditMessageError
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2025-08-17T15:41:09.394389505+05:00[Asia/Yekaterinburg]", comments = "Generator version: 7.6.0")
public class ErrorsNegotiationEditMessageError {

  private String description;

  /**
   * Тип ошибки
   */
  public enum TypeEnum {
    NEGOTIATIONS("negotiations");

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

  /**
   * Причина ошибки:  * `message_cannot_be_empty` — сообщение в переписке не может быть пустым. * `message_already_viewed` — редактирование сообщения запрещено. Принимающая сторона уже успела прочитать сообщение. * `vacancy_not_found` — вакансия, на которую совершался отклик, не найдена * `resume_not_found` — резюме из отклика/приглашения было скрыто, либо удалено, либо не найдено * `vacancy_archived` — вакансия, на которую совершался отклик, заархивирована 
   */
  public enum ValueEnum {
    MESSAGE_CANNOT_BE_EMPTY("message_cannot_be_empty"),
    
    MESSAGE_ALREADY_VIEWED("message_already_viewed"),
    
    VACANCY_NOT_FOUND("vacancy_not_found"),
    
    RESUME_NOT_FOUND("resume_not_found"),
    
    VACANCY_ARCHIVED("vacancy_archived"),
    
    DISABLED_BY_EMPLOYER("disabled_by_employer");

    private String value;

    ValueEnum(String value) {
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
    public static ValueEnum fromValue(String value) {
      for (ValueEnum b : ValueEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  private ValueEnum value;

  public ErrorsNegotiationEditMessageError() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public ErrorsNegotiationEditMessageError(TypeEnum type, ValueEnum value) {
    this.type = type;
    this.value = value;
  }

  public ErrorsNegotiationEditMessageError description(String description) {
    this.description = description;
    return this;
  }

  /**
   * Описание
   * @return description
  */
  
  @Schema(name = "description", description = "Описание", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("description")
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public ErrorsNegotiationEditMessageError type(TypeEnum type) {
    this.type = type;
    return this;
  }

  /**
   * Тип ошибки
   * @return type
  */
  @NotNull 
  @Schema(name = "type", example = "negotiations", description = "Тип ошибки", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("type")
  public TypeEnum getType() {
    return type;
  }

  public void setType(TypeEnum type) {
    this.type = type;
  }

  public ErrorsNegotiationEditMessageError value(ValueEnum value) {
    this.value = value;
    return this;
  }

  /**
   * Причина ошибки:  * `message_cannot_be_empty` — сообщение в переписке не может быть пустым. * `message_already_viewed` — редактирование сообщения запрещено. Принимающая сторона уже успела прочитать сообщение. * `vacancy_not_found` — вакансия, на которую совершался отклик, не найдена * `resume_not_found` — резюме из отклика/приглашения было скрыто, либо удалено, либо не найдено * `vacancy_archived` — вакансия, на которую совершался отклик, заархивирована 
   * @return value
  */
  @NotNull 
  @Schema(name = "value", example = "message_already_viewed", description = "Причина ошибки:  * `message_cannot_be_empty` — сообщение в переписке не может быть пустым. * `message_already_viewed` — редактирование сообщения запрещено. Принимающая сторона уже успела прочитать сообщение. * `vacancy_not_found` — вакансия, на которую совершался отклик, не найдена * `resume_not_found` — резюме из отклика/приглашения было скрыто, либо удалено, либо не найдено * `vacancy_archived` — вакансия, на которую совершался отклик, заархивирована ", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("value")
  public ValueEnum getValue() {
    return value;
  }

  public void setValue(ValueEnum value) {
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
    ErrorsNegotiationEditMessageError errorsNegotiationEditMessageError = (ErrorsNegotiationEditMessageError) o;
    return Objects.equals(this.description, errorsNegotiationEditMessageError.description) &&
        Objects.equals(this.type, errorsNegotiationEditMessageError.type) &&
        Objects.equals(this.value, errorsNegotiationEditMessageError.value);
  }

  @Override
  public int hashCode() {
    return Objects.hash(description, type, value);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ErrorsNegotiationEditMessageError {\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
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

