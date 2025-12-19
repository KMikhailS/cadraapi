package ru.brobrocode.cadra.client.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.annotation.Generated;
import jakarta.validation.constraints.NotNull;

import java.util.Objects;

/**
 * ErrorsVacancyApplyBadRequestError
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2025-08-17T15:41:09.394389505+05:00[Asia/Yekaterinburg]", comments = "Generator version: 7.6.0")
public class ErrorsVacancyApplyBadRequestError {

  /**
   * Текстовый идентификатор типа ошибки
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
   * Название поля с ошибкой:  * `vacancy_not_found` — вакансия не найдена. * `resume_not_found` — резюме из отклика/приглашения скрыто, удалено или не найдено. * `limit_exceeded` — превышен лимит количества откликов/приглашений * `resource_policy_violation` — отклик нарушает правила пользования сервисом * `inappropriate_language` — отклик содержит нецензурную лексику 
   */
  public enum ValueEnum {
    VACANCY_NOT_FOUND("vacancy_not_found"),
    
    RESUME_NOT_FOUND("resume_not_found"),
    
    LIMIT_EXCEEDED("limit_exceeded"),
    
    RESOURCE_POLICY_VIOLATION("resource_policy_violation"),
    
    INAPPROPRIATE_LANGUAGE("inappropriate_language");

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

  public ErrorsVacancyApplyBadRequestError() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public ErrorsVacancyApplyBadRequestError(TypeEnum type, ValueEnum value) {
    this.type = type;
    this.value = value;
  }

  public ErrorsVacancyApplyBadRequestError type(TypeEnum type) {
    this.type = type;
    return this;
  }

  /**
   * Текстовый идентификатор типа ошибки
   * @return type
  */
  @NotNull 
  @Schema(name = "type", example = "negotiations", description = "Текстовый идентификатор типа ошибки", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("type")
  public TypeEnum getType() {
    return type;
  }

  public void setType(TypeEnum type) {
    this.type = type;
  }

  public ErrorsVacancyApplyBadRequestError value(ValueEnum value) {
    this.value = value;
    return this;
  }

  /**
   * Название поля с ошибкой:  * `vacancy_not_found` — вакансия не найдена. * `resume_not_found` — резюме из отклика/приглашения скрыто, удалено или не найдено. * `limit_exceeded` — превышен лимит количества откликов/приглашений * `resource_policy_violation` — отклик нарушает правила пользования сервисом * `inappropriate_language` — отклик содержит нецензурную лексику 
   * @return value
  */
  @NotNull 
  @Schema(name = "value", example = "vacancy_not_found", description = "Название поля с ошибкой:  * `vacancy_not_found` — вакансия не найдена. * `resume_not_found` — резюме из отклика/приглашения скрыто, удалено или не найдено. * `limit_exceeded` — превышен лимит количества откликов/приглашений * `resource_policy_violation` — отклик нарушает правила пользования сервисом * `inappropriate_language` — отклик содержит нецензурную лексику ", requiredMode = Schema.RequiredMode.REQUIRED)
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
    ErrorsVacancyApplyBadRequestError errorsVacancyApplyBadRequestError = (ErrorsVacancyApplyBadRequestError) o;
    return Objects.equals(this.type, errorsVacancyApplyBadRequestError.type) &&
        Objects.equals(this.value, errorsVacancyApplyBadRequestError.value);
  }

  @Override
  public int hashCode() {
    return Objects.hash(type, value);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ErrorsVacancyApplyBadRequestError {\n");
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

