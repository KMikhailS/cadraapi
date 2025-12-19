package ru.brobrocode.cadra.client.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.annotation.Generated;
import jakarta.validation.constraints.NotNull;

import java.util.Objects;

/**
 * ErrorsVacancyProlongateError
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2025-08-17T15:41:09.394389505+05:00[Asia/Yekaterinburg]", comments = "Generator version: 7.6.0")
public class ErrorsVacancyProlongateError {

  /**
   * Тип ошибки
   */
  public enum TypeEnum {
    VACANCIES("vacancies");

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
   * Причина ошибки:  * `not_enough_purchased_services` — купленных услуг недостаточно для продления данного типа вакансии. * `quota_exceeded` — квота менеджера на публикацию данного типа вакансии закончилась. * `prolongation_forbidden` — продление вакансий недоступно текущему менеджеру. * `unavailable_for_archived` — продление недоступно для архивной вакансии. * `too_early` — продление раньше времени 
   */
  public enum ValueEnum {
    NOT_ENOUGH_PURCHASED_SERVICES("not_enough_purchased_services"),
    
    QUOTA_EXCEEDED("quota_exceeded"),
    
    PROLONGATION_FORBIDDEN("prolongation_forbidden"),
    
    UNAVAILABLE_FOR_ARCHIVED("unavailable_for_archived"),
    
    TOO_EARLY("too_early");

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

  public ErrorsVacancyProlongateError() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public ErrorsVacancyProlongateError(TypeEnum type, ValueEnum value) {
    this.type = type;
    this.value = value;
  }

  public ErrorsVacancyProlongateError type(TypeEnum type) {
    this.type = type;
    return this;
  }

  /**
   * Тип ошибки
   * @return type
  */
  @NotNull 
  @Schema(name = "type", example = "vacancies", description = "Тип ошибки", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("type")
  public TypeEnum getType() {
    return type;
  }

  public void setType(TypeEnum type) {
    this.type = type;
  }

  public ErrorsVacancyProlongateError value(ValueEnum value) {
    this.value = value;
    return this;
  }

  /**
   * Причина ошибки:  * `not_enough_purchased_services` — купленных услуг недостаточно для продления данного типа вакансии. * `quota_exceeded` — квота менеджера на публикацию данного типа вакансии закончилась. * `prolongation_forbidden` — продление вакансий недоступно текущему менеджеру. * `unavailable_for_archived` — продление недоступно для архивной вакансии. * `too_early` — продление раньше времени 
   * @return value
  */
  @NotNull 
  @Schema(name = "value", example = "quota_exceeded", description = "Причина ошибки:  * `not_enough_purchased_services` — купленных услуг недостаточно для продления данного типа вакансии. * `quota_exceeded` — квота менеджера на публикацию данного типа вакансии закончилась. * `prolongation_forbidden` — продление вакансий недоступно текущему менеджеру. * `unavailable_for_archived` — продление недоступно для архивной вакансии. * `too_early` — продление раньше времени ", requiredMode = Schema.RequiredMode.REQUIRED)
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
    ErrorsVacancyProlongateError errorsVacancyProlongateError = (ErrorsVacancyProlongateError) o;
    return Objects.equals(this.type, errorsVacancyProlongateError.type) &&
        Objects.equals(this.value, errorsVacancyProlongateError.value);
  }

  @Override
  public int hashCode() {
    return Objects.hash(type, value);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ErrorsVacancyProlongateError {\n");
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

