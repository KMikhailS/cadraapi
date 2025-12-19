package ru.brobrocode.cadra.client.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.annotation.Generated;
import jakarta.validation.constraints.NotNull;

import java.util.Objects;

/**
 * ErrorsVacancyApplyForbiddenError
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2025-08-17T15:41:09.394389505+05:00[Asia/Yekaterinburg]", comments = "Generator version: 7.6.0")
public class ErrorsVacancyApplyForbiddenError {

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
   * Ошибки при отклике/приглашении на вакансию:   * `invalid_vacancy` — вакансия из отклика/приглашения была архивирована или скрыта.   * `resume_not_found` — резюме из отклика/приглашения скрыто, удалено или не найдено.   * `already_applied` — в системе уже есть отклик/приглашение на указанную вакансию (связка `resume_id` + `vacancy_id`).   * `test_required` — для отклика необходимо пройти тест.   * `resume_visibility_conflict` — невозможно откликнуться на анонимную вакансию, используя резюме с [типом видимости](#tag/Rezyume.-Spiski-vidimosti/operation/get-resume-access-types) `whitelist`.   * `edit_forbidden` — редактирование сообщения недоступно.   * `application_denied` — общая ошибка запрета отклика в случае, когда дополнительная информация недоступна.   * `limit_exceeded` — превышен лимит количества откликов/приглашений.   * `wrong_state` — действие по отклику/приглашению в данном статусе невозможно.   * `empty_message` — передан пустой текст сопроводительного письма.   * `too_long_message` — передан слишком длинный текст сопроводительного письма.   * `inappropriate_language_message` — передан текст сопроводительного письма, который содержит нецензурную лексику.   * `resource_policy_violation_message` — передан текст сопроводительного письма, который нарушает правила использования сервиса.     * `address_not_found` — переданный адрес не существует, либо принадлежит другому работодателю.   * `not_enough_purchased_services` — не хватает оплаченных услуг. Например, [доступа к базе резюме](https://hh.ru/price/dbaccess).   * `in_a_row_limit` — превышено количество последовательных сообщений в переписке. Необходимо дождаться ответа собеседника на сообщение.   * `overall_limit` — превышен лимит сообщений.   * `no_invitation` — переписка недоступна, так как в отклике ещё не было приглашения.   * `message_cannot_be_empty` — сообщение в переписке не может быть пустым.   * `disabled_by_employer` — возможность переписки по отклику отключена работодателем.   * `resume_deleted` — резюме, с которым совершался отклик, удалено или скрыто.   * `archived` — вакансия, на которую совершался отклик, заархивирована.   * `chat_archived` — отклик/приглашение заархивировано.   * `topic_archived` — отклик/приглашение заархивировано   * `chat_is_not_ready` — операция временно не доступна, ожидается создание чата 
   */
  public enum ValueEnum {
    INVALID_VACANCY("invalid_vacancy"),
    
    RESUME_NOT_FOUND("resume_not_found"),
    
    ALREADY_APPLIED("already_applied"),
    
    TEST_REQUIRED("test_required"),
    
    RESUME_VISIBILITY_CONFLICT("resume_visibility_conflict"),
    
    EDIT_FORBIDDEN("edit_forbidden"),
    
    APPLICATION_DENIED("application_denied"),
    
    LIMIT_EXCEEDED("limit_exceeded"),
    
    WRONG_STATE("wrong_state"),
    
    EMPTY_MESSAGE("empty_message"),
    
    TOO_LONG_MESSAGE("too_long_message"),
    
    INAPPROPRIATE_LANGUAGE_MESSAGE("inappropriate_language_message"),
    
    RESOURCE_POLICY_VIOLATION_MESSAGE("resource_policy_violation_message"),
    
    ADDRESS_NOT_FOUND("address_not_found"),
    
    NOT_ENOUGH_PURCHASED_SERVICES("not_enough_purchased_services"),
    
    IN_A_ROW_LIMIT("in_a_row_limit"),
    
    OVERALL_LIMIT("overall_limit"),
    
    NO_INVITATION("no_invitation"),
    
    MESSAGE_CANNOT_BE_EMPTY("message_cannot_be_empty"),
    
    DISABLED_BY_EMPLOYER("disabled_by_employer"),
    
    RESUME_DELETED("resume_deleted"),
    
    ARCHIVED("archived"),
    
    CHAT_ARCHIVED("chat_archived"),
    
    TOPIC_ARCHIVED("topic_archived"),
    
    CHAT_IS_NOT_READY("chat_is_not_ready");

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

  public ErrorsVacancyApplyForbiddenError() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public ErrorsVacancyApplyForbiddenError(TypeEnum type, ValueEnum value) {
    this.type = type;
    this.value = value;
  }

  public ErrorsVacancyApplyForbiddenError type(TypeEnum type) {
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

  public ErrorsVacancyApplyForbiddenError value(ValueEnum value) {
    this.value = value;
    return this;
  }

  /**
   * Ошибки при отклике/приглашении на вакансию:   * `invalid_vacancy` — вакансия из отклика/приглашения была архивирована или скрыта.   * `resume_not_found` — резюме из отклика/приглашения скрыто, удалено или не найдено.   * `already_applied` — в системе уже есть отклик/приглашение на указанную вакансию (связка `resume_id` + `vacancy_id`).   * `test_required` — для отклика необходимо пройти тест.   * `resume_visibility_conflict` — невозможно откликнуться на анонимную вакансию, используя резюме с [типом видимости](#tag/Rezyume.-Spiski-vidimosti/operation/get-resume-access-types) `whitelist`.   * `edit_forbidden` — редактирование сообщения недоступно.   * `application_denied` — общая ошибка запрета отклика в случае, когда дополнительная информация недоступна.   * `limit_exceeded` — превышен лимит количества откликов/приглашений.   * `wrong_state` — действие по отклику/приглашению в данном статусе невозможно.   * `empty_message` — передан пустой текст сопроводительного письма.   * `too_long_message` — передан слишком длинный текст сопроводительного письма.   * `inappropriate_language_message` — передан текст сопроводительного письма, который содержит нецензурную лексику.   * `resource_policy_violation_message` — передан текст сопроводительного письма, который нарушает правила использования сервиса.     * `address_not_found` — переданный адрес не существует, либо принадлежит другому работодателю.   * `not_enough_purchased_services` — не хватает оплаченных услуг. Например, [доступа к базе резюме](https://hh.ru/price/dbaccess).   * `in_a_row_limit` — превышено количество последовательных сообщений в переписке. Необходимо дождаться ответа собеседника на сообщение.   * `overall_limit` — превышен лимит сообщений.   * `no_invitation` — переписка недоступна, так как в отклике ещё не было приглашения.   * `message_cannot_be_empty` — сообщение в переписке не может быть пустым.   * `disabled_by_employer` — возможность переписки по отклику отключена работодателем.   * `resume_deleted` — резюме, с которым совершался отклик, удалено или скрыто.   * `archived` — вакансия, на которую совершался отклик, заархивирована.   * `chat_archived` — отклик/приглашение заархивировано.   * `topic_archived` — отклик/приглашение заархивировано   * `chat_is_not_ready` — операция временно не доступна, ожидается создание чата 
   * @return value
  */
  @NotNull 
  @Schema(name = "value", example = "invalid_vacancy", description = "Ошибки при отклике/приглашении на вакансию:   * `invalid_vacancy` — вакансия из отклика/приглашения была архивирована или скрыта.   * `resume_not_found` — резюме из отклика/приглашения скрыто, удалено или не найдено.   * `already_applied` — в системе уже есть отклик/приглашение на указанную вакансию (связка `resume_id` + `vacancy_id`).   * `test_required` — для отклика необходимо пройти тест.   * `resume_visibility_conflict` — невозможно откликнуться на анонимную вакансию, используя резюме с [типом видимости](#tag/Rezyume.-Spiski-vidimosti/operation/get-resume-access-types) `whitelist`.   * `edit_forbidden` — редактирование сообщения недоступно.   * `application_denied` — общая ошибка запрета отклика в случае, когда дополнительная информация недоступна.   * `limit_exceeded` — превышен лимит количества откликов/приглашений.   * `wrong_state` — действие по отклику/приглашению в данном статусе невозможно.   * `empty_message` — передан пустой текст сопроводительного письма.   * `too_long_message` — передан слишком длинный текст сопроводительного письма.   * `inappropriate_language_message` — передан текст сопроводительного письма, который содержит нецензурную лексику.   * `resource_policy_violation_message` — передан текст сопроводительного письма, который нарушает правила использования сервиса.     * `address_not_found` — переданный адрес не существует, либо принадлежит другому работодателю.   * `not_enough_purchased_services` — не хватает оплаченных услуг. Например, [доступа к базе резюме](https://hh.ru/price/dbaccess).   * `in_a_row_limit` — превышено количество последовательных сообщений в переписке. Необходимо дождаться ответа собеседника на сообщение.   * `overall_limit` — превышен лимит сообщений.   * `no_invitation` — переписка недоступна, так как в отклике ещё не было приглашения.   * `message_cannot_be_empty` — сообщение в переписке не может быть пустым.   * `disabled_by_employer` — возможность переписки по отклику отключена работодателем.   * `resume_deleted` — резюме, с которым совершался отклик, удалено или скрыто.   * `archived` — вакансия, на которую совершался отклик, заархивирована.   * `chat_archived` — отклик/приглашение заархивировано.   * `topic_archived` — отклик/приглашение заархивировано   * `chat_is_not_ready` — операция временно не доступна, ожидается создание чата ", requiredMode = Schema.RequiredMode.REQUIRED)
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
    ErrorsVacancyApplyForbiddenError errorsVacancyApplyForbiddenError = (ErrorsVacancyApplyForbiddenError) o;
    return Objects.equals(this.type, errorsVacancyApplyForbiddenError.type) &&
        Objects.equals(this.value, errorsVacancyApplyForbiddenError.value);
  }

  @Override
  public int hashCode() {
    return Objects.hash(type, value);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ErrorsVacancyApplyForbiddenError {\n");
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

