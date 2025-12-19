package ru.brobrocode.cadra.client.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.annotation.Generated;
import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * Контактная информация
 */

@Schema(name = "VacancyDraftContactsWithFullPhone", description = "Контактная информация")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2025-08-17T15:41:09.394389505+05:00[Asia/Yekaterinburg]", comments = "Generator version: 7.6.0")
public class VacancyDraftContactsWithFullPhone {

  private String email = null;

  private String name = null;

  @Valid
  private List<@Valid VacancyDraftPhoneItemWithFullPhone> phones;

  public VacancyDraftContactsWithFullPhone() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public VacancyDraftContactsWithFullPhone(String email, String name, List<@Valid VacancyDraftPhoneItemWithFullPhone> phones) {
    this.email = email;
    this.name = name;
    this.phones = phones;
  }

  public VacancyDraftContactsWithFullPhone email(String email) {
    this.email = email;
    return this;
  }

  /**
   * Email
   * @return email
  */
  @NotNull 
  @Schema(name = "email", description = "Email", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("email")
  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public VacancyDraftContactsWithFullPhone name(String name) {
    this.name = name;
    return this;
  }

  /**
   * Имя менеджера
   * @return name
  */
  @NotNull 
  @Schema(name = "name", description = "Имя менеджера", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("name")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public VacancyDraftContactsWithFullPhone phones(List<@Valid VacancyDraftPhoneItemWithFullPhone> phones) {
    this.phones = phones;
    return this;
  }

  public VacancyDraftContactsWithFullPhone addPhonesItem(VacancyDraftPhoneItemWithFullPhone phonesItem) {
    if (this.phones == null) {
      this.phones = new ArrayList<>();
    }
    this.phones.add(phonesItem);
    return this;
  }

  /**
   * Список телефонов для связи
   * @return phones
  */
  @NotNull @Valid 
  @Schema(name = "phones", description = "Список телефонов для связи", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("phones")
  public List<@Valid VacancyDraftPhoneItemWithFullPhone> getPhones() {
    return phones;
  }

  public void setPhones(List<@Valid VacancyDraftPhoneItemWithFullPhone> phones) {
    this.phones = phones;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    VacancyDraftContactsWithFullPhone vacancyDraftContactsWithFullPhone = (VacancyDraftContactsWithFullPhone) o;
    return Objects.equals(this.email, vacancyDraftContactsWithFullPhone.email) &&
        Objects.equals(this.name, vacancyDraftContactsWithFullPhone.name) &&
        Objects.equals(this.phones, vacancyDraftContactsWithFullPhone.phones);
  }

  @Override
  public int hashCode() {
    return Objects.hash(email, name, phones);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class VacancyDraftContactsWithFullPhone {\n");
    sb.append("    email: ").append(toIndentedString(email)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    phones: ").append(toIndentedString(phones)).append("\n");
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

