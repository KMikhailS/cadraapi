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
 * VacancyArguments
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2025-08-17T15:41:09.394389505+05:00[Asia/Yekaterinburg]", comments = "Generator version: 7.6.0")
public class VacancyArguments {

  /**
   * Идентификатор аргумента. Возможные значения:  * `resume_id` — идентификатор резюме. * `vacancy_id` — идентификатор вакансии. * `message` — сообщение, которое будет отправлено соискателю на электронную почту. Используйте [шаблоны](#tag/Otklikipriglasheniya-rabotodatelya/operation/get-mail-templates) для получения текстов. * `send_sms` — уведомлять ли соискателя о приглашении с помощью SMS. Значение по умолчанию — `false`. Обратите внимание: в SMS-сообщении используется стандартный текст, изменить его нельзя * `address_id` — идентификатор [адреса](#tag/Adresa-rabotodatelya), который будет указан в приглашении 
   */
  public enum IdEnum {
    RESUME_ID("resume_id"),
    
    VACANCY_ID("vacancy_id"),
    
    MESSAGE("message"),
    
    SEND_SMS("send_sms"),
    
    ADDRESS_ID("address_id");

    private String value;

    IdEnum(String value) {
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
    public static IdEnum fromValue(String value) {
      for (IdEnum b : IdEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  private IdEnum id;

  private Boolean required;

  @Valid
  private List<@Valid IncludesId> requiredArguments = new ArrayList<>();

  public VacancyArguments() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public VacancyArguments(IdEnum id, Boolean required, List<@Valid IncludesId> requiredArguments) {
    this.id = id;
    this.required = required;
    this.requiredArguments = requiredArguments;
  }

  public VacancyArguments id(IdEnum id) {
    this.id = id;
    return this;
  }

  /**
   * Идентификатор аргумента. Возможные значения:  * `resume_id` — идентификатор резюме. * `vacancy_id` — идентификатор вакансии. * `message` — сообщение, которое будет отправлено соискателю на электронную почту. Используйте [шаблоны](#tag/Otklikipriglasheniya-rabotodatelya/operation/get-mail-templates) для получения текстов. * `send_sms` — уведомлять ли соискателя о приглашении с помощью SMS. Значение по умолчанию — `false`. Обратите внимание: в SMS-сообщении используется стандартный текст, изменить его нельзя * `address_id` — идентификатор [адреса](#tag/Adresa-rabotodatelya), который будет указан в приглашении 
   * @return id
  */
  @NotNull 
  @Schema(name = "id", description = "Идентификатор аргумента. Возможные значения:  * `resume_id` — идентификатор резюме. * `vacancy_id` — идентификатор вакансии. * `message` — сообщение, которое будет отправлено соискателю на электронную почту. Используйте [шаблоны](#tag/Otklikipriglasheniya-rabotodatelya/operation/get-mail-templates) для получения текстов. * `send_sms` — уведомлять ли соискателя о приглашении с помощью SMS. Значение по умолчанию — `false`. Обратите внимание: в SMS-сообщении используется стандартный текст, изменить его нельзя * `address_id` — идентификатор [адреса](#tag/Adresa-rabotodatelya), который будет указан в приглашении ", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("id")
  public IdEnum getId() {
    return id;
  }

  public void setId(IdEnum id) {
    this.id = id;
  }

  public VacancyArguments required(Boolean required) {
    this.required = required;
    return this;
  }

  /**
   * Обязательность аргумента
   * @return required
  */
  @NotNull 
  @Schema(name = "required", description = "Обязательность аргумента", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("required")
  public Boolean getRequired() {
    return required;
  }

  public void setRequired(Boolean required) {
    this.required = required;
  }

  public VacancyArguments requiredArguments(List<@Valid IncludesId> requiredArguments) {
    this.requiredArguments = requiredArguments;
    return this;
  }

  public VacancyArguments addRequiredArgumentsItem(IncludesId requiredArgumentsItem) {
    if (this.requiredArguments == null) {
      this.requiredArguments = new ArrayList<>();
    }
    this.requiredArguments.add(requiredArgumentsItem);
    return this;
  }

  /**
   * Идентификаторы аргументов, которые необходимо приложить, если указан данный аргумент. Например, адрес является необязательным, но при его указании необходимо указать также и сообщение
   * @return requiredArguments
  */
  @NotNull @Valid 
  @Schema(name = "required_arguments", description = "Идентификаторы аргументов, которые необходимо приложить, если указан данный аргумент. Например, адрес является необязательным, но при его указании необходимо указать также и сообщение", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("required_arguments")
  public List<@Valid IncludesId> getRequiredArguments() {
    return requiredArguments;
  }

  public void setRequiredArguments(List<@Valid IncludesId> requiredArguments) {
    this.requiredArguments = requiredArguments;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    VacancyArguments vacancyArguments = (VacancyArguments) o;
    return Objects.equals(this.id, vacancyArguments.id) &&
        Objects.equals(this.required, vacancyArguments.required) &&
        Objects.equals(this.requiredArguments, vacancyArguments.requiredArguments);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, required, requiredArguments);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class VacancyArguments {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    required: ").append(toIndentedString(required)).append("\n");
    sb.append("    requiredArguments: ").append(toIndentedString(requiredArguments)).append("\n");
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

