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
 * Контактная информация. В случае, если параметр используется, необходимо наличие атрибута phones или email
 */

@Schema(name = "VacancyContacts", description = "Контактная информация. В случае, если параметр используется, необходимо наличие атрибута phones или email")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2025-08-17T15:41:09.394389505+05:00[Asia/Yekaterinburg]", comments = "Generator version: 7.6.0")
public class VacancyContacts {

  private String email = null;

  private String name;

  @Valid
  private List<@Valid VacancyPhoneItem> phones;

  public VacancyContacts() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public VacancyContacts(String name) {
    this.name = name;
  }

  public VacancyContacts email(String email) {
    this.email = email;
    return this;
  }

  /**
   * Электронная почта. Значение поля должно соответствовать формату email
   * @return email
  */
  
  @Schema(name = "email", description = "Электронная почта. Значение поля должно соответствовать формату email", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("email")
  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public VacancyContacts name(String name) {
    this.name = name;
    return this;
  }

  /**
   * Имя контакта
   * @return name
  */
  @NotNull 
  @Schema(name = "name", description = "Имя контакта", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("name")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public VacancyContacts phones(List<@Valid VacancyPhoneItem> phones) {
    this.phones = phones;
    return this;
  }

  public VacancyContacts addPhonesItem(VacancyPhoneItem phonesItem) {
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
  @Valid 
  @Schema(name = "phones", description = "Список телефонов для связи", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("phones")
  public List<@Valid VacancyPhoneItem> getPhones() {
    return phones;
  }

  public void setPhones(List<@Valid VacancyPhoneItem> phones) {
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
    VacancyContacts vacancyContacts = (VacancyContacts) o;
    return Objects.equals(this.email, vacancyContacts.email) &&
        Objects.equals(this.name, vacancyContacts.name) &&
        Objects.equals(this.phones, vacancyContacts.phones);
  }

  @Override
  public int hashCode() {
    return Objects.hash(email, name, phones);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class VacancyContacts {\n");
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

