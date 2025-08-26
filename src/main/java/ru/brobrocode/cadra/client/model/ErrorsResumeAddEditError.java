package ru.brobrocode.cadra.client.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.annotation.Generated;
import jakarta.validation.constraints.NotNull;

import java.util.Objects;

/**
 * ErrorsResumeAddEditError
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2025-08-17T15:41:09.394389505+05:00[Asia/Yekaterinburg]", comments = "Generator version: 7.6.0")
public class ErrorsResumeAddEditError {

  private String description;

  private String pointer;

  private String reason;

  /**
   * Текстовый идентификатор типа ошибки
   */
  public enum TypeEnum {
    BAD_JSON_DATA("bad_json_data");

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

  private String value;

  public ErrorsResumeAddEditError() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public ErrorsResumeAddEditError(String description, String pointer, String reason, TypeEnum type, String value) {
    this.description = description;
    this.pointer = pointer;
    this.reason = reason;
    this.type = type;
    this.value = value;
  }

  public ErrorsResumeAddEditError description(String description) {
    this.description = description;
    return this;
  }

  /**
   * Описание ошибки для пользователя
   * @return description
  */
  @NotNull 
  @Schema(name = "description", example = "Значение ниже допустимого", description = "Описание ошибки для пользователя", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("description")
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public ErrorsResumeAddEditError pointer(String pointer) {
    this.pointer = pointer;
    return this;
  }

  /**
   * Путь до параметра, в котором возникла ошибка.  Для указания параметра используется формат JsonPointer [RFC 6901](https://datatracker.ietf.org/doc/html/rfc6901) 
   * @return pointer
  */
  @NotNull 
  @Schema(name = "pointer", example = "/education/additional/1/year", description = "Путь до параметра, в котором возникла ошибка.  Для указания параметра используется формат JsonPointer [RFC 6901](https://datatracker.ietf.org/doc/html/rfc6901) ", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("pointer")
  public String getPointer() {
    return pointer;
  }

  public void setPointer(String pointer) {
    this.pointer = pointer;
  }

  public ErrorsResumeAddEditError reason(String reason) {
    this.reason = reason;
    return this;
  }

  /**
   * Причина ошибки. Возможные значения:    * `required` — поле является обязательным для заполнения.   * `not_found` — не найдено значение по переданному ID.   * `faculty_without_university` — нельзя установить факультет без университета.   * `not_in_dictionary` — не найдено значение по переданному ID в справочнике.   * `not_a_leaf` — значение не должно содержать потомков.   * `end_date_before_start_date` — значение `end` меньше `start`.   * `not_country` — значение `area` должно быть страной (см. [справочник стран](#tag/Obshie-spravochniki/operation/get-countries)).   * `more_than_one_native_language` — указано более одного родного языка.   * `must_contain_unique` — переданные значения должны быть уникальны.   * `from_different_profareas` — переданы значения из разных отраслей.   * `duplicate` — значение уже было использовано.   * `bad_image_type` — передано значение изображения неправильного типа (для `portfolio` необходимы значения из [GET /artifacts/portfolio](#tag/Rabota-s-artefaktami/operation/get-artifacts-portfolio), для photo — [GET /artifacts/photo](#tag/Rabota-s-artefaktami/operation/get-artifact-photos)) .   * `processing` — объект в процессе обработки.   * `preferred_must_be_unique` — предпочитаемый тип связи должен быть уникальным.   * `preferred_contact_not_specified` — предпочитаемый тип связи не указан или не указано значение контакта.   * `need_country_city_number_or_formatted` — телефон в контактах указан в неверном формате (см. [условия заполнения контактов в резюме](#tag/Rezyume.-Usloviya-zapolneniya-polej/operation/get-new-resume-conditions)).   * `invalid` — ошибка в значении поля (поля должны соответствовать [условиям заполнения](#tag/Rezyume.-Usloviya-zapolneniya-polej/operation/get-resume-conditions)).   * `greater_than_max` — значение больше максимума .   * `less_than_min` — значение меньше минимума.   * `earlier_than_min` — указанная дата раньше минимально возможной.   * `later_than_max` — указанная дата позже максимально возможной.   * `length_less_than_min` — количество символов в поле меньше минимума.   * `length_greater_than_max` — количество символов в поле больше максимума.   * `size_less_than_min` — количество элементов меньше минимума.   * `size_greater_than_max` — количество элементов больше максимума.   * `send_metro_without_area` — не передано значение поля `area` при заполненном метро.   * `not_belong_this_city` — указанного метро нет в указанном городе.   * `required_with_not_started_career` — необходимо отправлять опыт работы, если специализация не начало карьеры.   * `not_match_regexp` — значение не соответствует регулярному выражению.   * `more_than_one` — передано более одного email.   * `not_available` — недопустимое значение 
   * @return reason
  */
  @NotNull 
  @Schema(name = "reason", example = "not_available", description = "Причина ошибки. Возможные значения:    * `required` — поле является обязательным для заполнения.   * `not_found` — не найдено значение по переданному ID.   * `faculty_without_university` — нельзя установить факультет без университета.   * `not_in_dictionary` — не найдено значение по переданному ID в справочнике.   * `not_a_leaf` — значение не должно содержать потомков.   * `end_date_before_start_date` — значение `end` меньше `start`.   * `not_country` — значение `area` должно быть страной (см. [справочник стран](#tag/Obshie-spravochniki/operation/get-countries)).   * `more_than_one_native_language` — указано более одного родного языка.   * `must_contain_unique` — переданные значения должны быть уникальны.   * `from_different_profareas` — переданы значения из разных отраслей.   * `duplicate` — значение уже было использовано.   * `bad_image_type` — передано значение изображения неправильного типа (для `portfolio` необходимы значения из [GET /artifacts/portfolio](#tag/Rabota-s-artefaktami/operation/get-artifacts-portfolio), для photo — [GET /artifacts/photo](#tag/Rabota-s-artefaktami/operation/get-artifact-photos)) .   * `processing` — объект в процессе обработки.   * `preferred_must_be_unique` — предпочитаемый тип связи должен быть уникальным.   * `preferred_contact_not_specified` — предпочитаемый тип связи не указан или не указано значение контакта.   * `need_country_city_number_or_formatted` — телефон в контактах указан в неверном формате (см. [условия заполнения контактов в резюме](#tag/Rezyume.-Usloviya-zapolneniya-polej/operation/get-new-resume-conditions)).   * `invalid` — ошибка в значении поля (поля должны соответствовать [условиям заполнения](#tag/Rezyume.-Usloviya-zapolneniya-polej/operation/get-resume-conditions)).   * `greater_than_max` — значение больше максимума .   * `less_than_min` — значение меньше минимума.   * `earlier_than_min` — указанная дата раньше минимально возможной.   * `later_than_max` — указанная дата позже максимально возможной.   * `length_less_than_min` — количество символов в поле меньше минимума.   * `length_greater_than_max` — количество символов в поле больше максимума.   * `size_less_than_min` — количество элементов меньше минимума.   * `size_greater_than_max` — количество элементов больше максимума.   * `send_metro_without_area` — не передано значение поля `area` при заполненном метро.   * `not_belong_this_city` — указанного метро нет в указанном городе.   * `required_with_not_started_career` — необходимо отправлять опыт работы, если специализация не начало карьеры.   * `not_match_regexp` — значение не соответствует регулярному выражению.   * `more_than_one` — передано более одного email.   * `not_available` — недопустимое значение ", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("reason")
  public String getReason() {
    return reason;
  }

  public void setReason(String reason) {
    this.reason = reason;
  }

  public ErrorsResumeAddEditError type(TypeEnum type) {
    this.type = type;
    return this;
  }

  /**
   * Текстовый идентификатор типа ошибки
   * @return type
  */
  @NotNull 
  @Schema(name = "type", example = "bad_json_data", description = "Текстовый идентификатор типа ошибки", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("type")
  public TypeEnum getType() {
    return type;
  }

  public void setType(TypeEnum type) {
    this.type = type;
  }

  public ErrorsResumeAddEditError value(String value) {
    this.value = value;
    return this;
  }

  /**
   * Название поля с ошибкой
   * @return value
  */
  @NotNull 
  @Schema(name = "value", example = "year", description = "Название поля с ошибкой", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("value")
  public String getValue() {
    return value;
  }

  public void setValue(String value) {
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
    ErrorsResumeAddEditError errorsResumeAddEditError = (ErrorsResumeAddEditError) o;
    return Objects.equals(this.description, errorsResumeAddEditError.description) &&
        Objects.equals(this.pointer, errorsResumeAddEditError.pointer) &&
        Objects.equals(this.reason, errorsResumeAddEditError.reason) &&
        Objects.equals(this.type, errorsResumeAddEditError.type) &&
        Objects.equals(this.value, errorsResumeAddEditError.value);
  }

  @Override
  public int hashCode() {
    return Objects.hash(description, pointer, reason, type, value);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ErrorsResumeAddEditError {\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    pointer: ").append(toIndentedString(pointer)).append("\n");
    sb.append("    reason: ").append(toIndentedString(reason)).append("\n");
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

