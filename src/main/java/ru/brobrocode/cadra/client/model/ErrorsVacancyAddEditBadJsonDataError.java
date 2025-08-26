package ru.brobrocode.cadra.client.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.annotation.Generated;
import jakarta.validation.constraints.NotNull;

import java.util.Objects;

/**
 * ErrorsVacancyAddEditBadJsonDataError
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2025-08-17T15:41:09.394389505+05:00[Asia/Yekaterinburg]", comments = "Generator version: 7.6.0")
public class ErrorsVacancyAddEditBadJsonDataError {

  private String description = null;

  private String pointer;

  /**
   * Причина ошибки. Возможные значения:   * `required` - отстутствует поле в запросе   * `invalid` - недопустимое значение в поле запроса   * `is_empty` — пустое значение   * `wrong_size` — значение имеет неправильный размер   * `is_too_short` — значение имеет слишком маленький размер   * `is_too_long` — значение имеет слишком большой размер   * `currency_code_is_invalid` — валюта заработной платы введена некорректно   * `chosen_area_is_not_a_leaf_or_not_exist` — местоположение вакансии введено неверно (например, передан несуществующий ID) или не является конечным регионом (город, населенный пункт)   * `email_in_description` — в описании вакансии содержится email   * `fly_in_fly_out_pay_for_performance` — это вакансия с оплатой за контакты в откликах — для них доступен только вахтовый метод   * `fly_in_fly_out_incompatible_employment_form` — длительность вахты указывается только для вахтового метода   * `anonymous_vacancy_contains_address` — в анонимной вакансии содержится адрес работодателя   * `anonymous_vacancy_has_real_company_name` — в названии вакансии содержится название компании работодателя   * `only_for_anonymous_type` — действие доступно только для анонимных вакансий   * `address_is_disabled` — адрес недоступен   * `vacancy_type_employer_billing_type_mismatch` — тип вакансии не совместим с текущим биллинг-типом   * `only_for_direct_type` — действие доступно только для прямых вакансий   * `address_is_empty_with_checked_show_metro_flag` — введен пустой адрес, но указана опция показывать метро   * `address_has_no_metro_but_checked_show_metro_flag` — по введенному адресу не доступно метро, но указана опция показывать метро   * `default_vacancy_branded_template_is_invalid_or_not_enough_purchased_services` — в запросе указан шаблон, который отсутствует в списке доступных шаблонов (этот список можно получить [запросом](#tag/Informaciya-o-rabotodatele/operation/get-vacancy-branded-templates-list)). Также шаблон может отсутствовать в списке доступных шаблонов, если не оплачена услуга использования [брендированного шаблона вакансии](https://hh.ru/price/branding)   * `department_code_prohibited_in_anonymous_vacancy` — нельзя указать код подразделения для анонимной вакансии   * `branded_template_prohibited_in_anonymous_vacancy` — использование брендированного шаблона невозможно для анонимной вакансии   * `value_conflict_with_business_rules` — публикация вакансии с указанным `billing_type` запрещена   * `can_not_accept_kids` — вакансия недоступна несовершеннолетним   * `can_not_edit_vacancy_after_moderation` — нельзя изменить название вакансии после модерации   * `employment_form_uncompatible_with_internship` — тип занятости несовместим для типа занятости вахта и стажировка   * `employment_form_uncompatible_with_work_format` — тип занятости несовместима с указанным форматом работы   * `properties_existence` — переданные properties не существуют 
   */
  public enum ReasonEnum {
    REQUIRED("required"),
    
    INVALID("invalid"),
    
    IS_EMPTY("is_empty"),
    
    WRONG_SIZE("wrong_size"),
    
    IS_TOO_SHORT("is_too_short"),
    
    IS_TOO_LONG("is_too_long"),
    
    CURRENCY_CODE_IS_INVALID("currency_code_is_invalid"),
    
    CHOSEN_AREA_IS_NOT_A_LEAF_OR_NOT_EXIST("chosen_area_is_not_a_leaf_or_not_exist"),
    
    EMAIL_IN_DESCRIPTION("email_in_description"),
    
    FLY_IN_FLY_OUT_PAY_FOR_PERFORMANCE("fly_in_fly_out_pay_for_performance"),
    
    FLY_IN_FLY_OUT_INCOMPATIBLE_EMPLOYMENT_FORM("fly_in_fly_out_incompatible_employment_form"),
    
    ANONYMOUS_VACANCY_CONTAINS_ADDRESS("anonymous_vacancy_contains_address"),
    
    ANONYMOUS_VACANCY_HAS_REAL_COMPANY_NAME("anonymous_vacancy_has_real_company_name"),
    
    ONLY_FOR_ANONYMOUS_TYPE("only_for_anonymous_type"),
    
    ADDRESS_IS_DISABLED("address_is_disabled"),
    
    VACANCY_TYPE_EMPLOYER_BILLING_TYPE_MISMATCH("vacancy_type_employer_billing_type_mismatch"),
    
    ONLY_FOR_DIRECT_TYPE("only_for_direct_type"),
    
    ADDRESS_IS_EMPTY_WITH_CHECKED_SHOW_METRO_FLAG("address_is_empty_with_checked_show_metro_flag"),
    
    ADDRESS_HAS_NO_METRO_BUT_CHECKED_SHOW_METRO_FLAG("address_has_no_metro_but_checked_show_metro_flag"),
    
    DEFAULT_VACANCY_BRANDED_TEMPLATE_IS_INVALID_OR_NOT_ENOUGH_PURCHASED_SERVICES("default_vacancy_branded_template_is_invalid_or_not_enough_purchased_services"),
    
    DEPARTMENT_CODE_PROHIBITED_IN_ANONYMOUS_VACANCY("department_code_prohibited_in_anonymous_vacancy"),
    
    BRANDED_TEMPLATE_PROHIBITED_IN_ANONYMOUS_VACANCY("branded_template_prohibited_in_anonymous_vacancy"),
    
    VALUE_CONFLICT_WITH_BUSINESS_RULES("value_conflict_with_business_rules"),
    
    CAN_NOT_ACCEPT_KIDS("can_not_accept_kids"),
    
    CAN_NOT_EDIT_VACANCY_AFTER_MODERATION("can_not_edit_vacancy_after_moderation"),
    
    EMPLOYMENT_FORM_UNCOMPATIBLE_WITH_INTERNSHIP("employment_form_uncompatible_with_internship"),
    
    EMPLOYMENT_FORM_UNCOMPATIBLE_WITH_WORK_FORMAT("employment_form_uncompatible_with_work_format"),
    
    PROPERTIES_EXISTENCE("properties_existence");

    private String value;

    ReasonEnum(String value) {
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
    public static ReasonEnum fromValue(String value) {
      for (ReasonEnum b : ReasonEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  private ReasonEnum reason;

  /**
   * Текстовый идентификатор типа ошибки
   */
  public enum TypeEnum {
    BAD_JSON_DATA("bad_json_data"),
    
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

  private String value;

  public ErrorsVacancyAddEditBadJsonDataError() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public ErrorsVacancyAddEditBadJsonDataError(TypeEnum type) {
    this.type = type;
  }

  public ErrorsVacancyAddEditBadJsonDataError description(String description) {
    this.description = description;
    return this;
  }

  /**
   * Описание ошибки
   * @return description
  */
  
  @Schema(name = "description", example = "Значение неправильное", description = "Описание ошибки", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("description")
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public ErrorsVacancyAddEditBadJsonDataError pointer(String pointer) {
    this.pointer = pointer;
    return this;
  }

  /**
   * Путь до параметра, в котором возникла ошибка.  Для указания параметра используется формат JsonPointer [RFC 6901](https://datatracker.ietf.org/doc/html/rfc6901) 
   * @return pointer
  */
  
  @Schema(name = "pointer", example = "/contacts/phones/1/number", description = "Путь до параметра, в котором возникла ошибка.  Для указания параметра используется формат JsonPointer [RFC 6901](https://datatracker.ietf.org/doc/html/rfc6901) ", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("pointer")
  public String getPointer() {
    return pointer;
  }

  public void setPointer(String pointer) {
    this.pointer = pointer;
  }

  public ErrorsVacancyAddEditBadJsonDataError reason(ReasonEnum reason) {
    this.reason = reason;
    return this;
  }

  /**
   * Причина ошибки. Возможные значения:   * `required` - отстутствует поле в запросе   * `invalid` - недопустимое значение в поле запроса   * `is_empty` — пустое значение   * `wrong_size` — значение имеет неправильный размер   * `is_too_short` — значение имеет слишком маленький размер   * `is_too_long` — значение имеет слишком большой размер   * `currency_code_is_invalid` — валюта заработной платы введена некорректно   * `chosen_area_is_not_a_leaf_or_not_exist` — местоположение вакансии введено неверно (например, передан несуществующий ID) или не является конечным регионом (город, населенный пункт)   * `email_in_description` — в описании вакансии содержится email   * `fly_in_fly_out_pay_for_performance` — это вакансия с оплатой за контакты в откликах — для них доступен только вахтовый метод   * `fly_in_fly_out_incompatible_employment_form` — длительность вахты указывается только для вахтового метода   * `anonymous_vacancy_contains_address` — в анонимной вакансии содержится адрес работодателя   * `anonymous_vacancy_has_real_company_name` — в названии вакансии содержится название компании работодателя   * `only_for_anonymous_type` — действие доступно только для анонимных вакансий   * `address_is_disabled` — адрес недоступен   * `vacancy_type_employer_billing_type_mismatch` — тип вакансии не совместим с текущим биллинг-типом   * `only_for_direct_type` — действие доступно только для прямых вакансий   * `address_is_empty_with_checked_show_metro_flag` — введен пустой адрес, но указана опция показывать метро   * `address_has_no_metro_but_checked_show_metro_flag` — по введенному адресу не доступно метро, но указана опция показывать метро   * `default_vacancy_branded_template_is_invalid_or_not_enough_purchased_services` — в запросе указан шаблон, который отсутствует в списке доступных шаблонов (этот список можно получить [запросом](#tag/Informaciya-o-rabotodatele/operation/get-vacancy-branded-templates-list)). Также шаблон может отсутствовать в списке доступных шаблонов, если не оплачена услуга использования [брендированного шаблона вакансии](https://hh.ru/price/branding)   * `department_code_prohibited_in_anonymous_vacancy` — нельзя указать код подразделения для анонимной вакансии   * `branded_template_prohibited_in_anonymous_vacancy` — использование брендированного шаблона невозможно для анонимной вакансии   * `value_conflict_with_business_rules` — публикация вакансии с указанным `billing_type` запрещена   * `can_not_accept_kids` — вакансия недоступна несовершеннолетним   * `can_not_edit_vacancy_after_moderation` — нельзя изменить название вакансии после модерации   * `employment_form_uncompatible_with_internship` — тип занятости несовместим для типа занятости вахта и стажировка   * `employment_form_uncompatible_with_work_format` — тип занятости несовместима с указанным форматом работы   * `properties_existence` — переданные properties не существуют 
   * @return reason
  */
  
  @Schema(name = "reason", example = "is_empty", description = "Причина ошибки. Возможные значения:   * `required` - отстутствует поле в запросе   * `invalid` - недопустимое значение в поле запроса   * `is_empty` — пустое значение   * `wrong_size` — значение имеет неправильный размер   * `is_too_short` — значение имеет слишком маленький размер   * `is_too_long` — значение имеет слишком большой размер   * `currency_code_is_invalid` — валюта заработной платы введена некорректно   * `chosen_area_is_not_a_leaf_or_not_exist` — местоположение вакансии введено неверно (например, передан несуществующий ID) или не является конечным регионом (город, населенный пункт)   * `email_in_description` — в описании вакансии содержится email   * `fly_in_fly_out_pay_for_performance` — это вакансия с оплатой за контакты в откликах — для них доступен только вахтовый метод   * `fly_in_fly_out_incompatible_employment_form` — длительность вахты указывается только для вахтового метода   * `anonymous_vacancy_contains_address` — в анонимной вакансии содержится адрес работодателя   * `anonymous_vacancy_has_real_company_name` — в названии вакансии содержится название компании работодателя   * `only_for_anonymous_type` — действие доступно только для анонимных вакансий   * `address_is_disabled` — адрес недоступен   * `vacancy_type_employer_billing_type_mismatch` — тип вакансии не совместим с текущим биллинг-типом   * `only_for_direct_type` — действие доступно только для прямых вакансий   * `address_is_empty_with_checked_show_metro_flag` — введен пустой адрес, но указана опция показывать метро   * `address_has_no_metro_but_checked_show_metro_flag` — по введенному адресу не доступно метро, но указана опция показывать метро   * `default_vacancy_branded_template_is_invalid_or_not_enough_purchased_services` — в запросе указан шаблон, который отсутствует в списке доступных шаблонов (этот список можно получить [запросом](#tag/Informaciya-o-rabotodatele/operation/get-vacancy-branded-templates-list)). Также шаблон может отсутствовать в списке доступных шаблонов, если не оплачена услуга использования [брендированного шаблона вакансии](https://hh.ru/price/branding)   * `department_code_prohibited_in_anonymous_vacancy` — нельзя указать код подразделения для анонимной вакансии   * `branded_template_prohibited_in_anonymous_vacancy` — использование брендированного шаблона невозможно для анонимной вакансии   * `value_conflict_with_business_rules` — публикация вакансии с указанным `billing_type` запрещена   * `can_not_accept_kids` — вакансия недоступна несовершеннолетним   * `can_not_edit_vacancy_after_moderation` — нельзя изменить название вакансии после модерации   * `employment_form_uncompatible_with_internship` — тип занятости несовместим для типа занятости вахта и стажировка   * `employment_form_uncompatible_with_work_format` — тип занятости несовместима с указанным форматом работы   * `properties_existence` — переданные properties не существуют ", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("reason")
  public ReasonEnum getReason() {
    return reason;
  }

  public void setReason(ReasonEnum reason) {
    this.reason = reason;
  }

  public ErrorsVacancyAddEditBadJsonDataError type(TypeEnum type) {
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

  public ErrorsVacancyAddEditBadJsonDataError value(String value) {
    this.value = value;
    return this;
  }

  /**
   * Название поля с ошибкой
   * @return value
  */
  
  @Schema(name = "value", example = "salary", description = "Название поля с ошибкой", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
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
    ErrorsVacancyAddEditBadJsonDataError errorsVacancyAddEditBadJsonDataError = (ErrorsVacancyAddEditBadJsonDataError) o;
    return Objects.equals(this.description, errorsVacancyAddEditBadJsonDataError.description) &&
        Objects.equals(this.pointer, errorsVacancyAddEditBadJsonDataError.pointer) &&
        Objects.equals(this.reason, errorsVacancyAddEditBadJsonDataError.reason) &&
        Objects.equals(this.type, errorsVacancyAddEditBadJsonDataError.type) &&
        Objects.equals(this.value, errorsVacancyAddEditBadJsonDataError.value);
  }

  @Override
  public int hashCode() {
    return Objects.hash(description, pointer, reason, type, value);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ErrorsVacancyAddEditBadJsonDataError {\n");
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

