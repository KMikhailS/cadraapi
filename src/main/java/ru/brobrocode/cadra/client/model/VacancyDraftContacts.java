package ru.brobrocode.cadra.client.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.annotation.Generated;
import jakarta.validation.Valid;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * Контактная информация
 */

@Schema(name = "VacancyDraftContacts", description = "Контактная информация")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2025-08-17T15:41:09.394389505+05:00[Asia/Yekaterinburg]", comments = "Generator version: 7.6.0")
public class VacancyDraftContacts {

  private String email = null;

  private String name = null;

  @Valid
  private List<VacancyDraftPhoneItem> phones;

  public VacancyDraftContacts email(String email) {
    this.email = email;
    return this;
  }

  /**
   * Email
   * @return email
  */
  
  @Schema(name = "email", description = "Email", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("email")
  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public VacancyDraftContacts name(String name) {
    this.name = name;
    return this;
  }

  /**
   * Имя менеджера
   * @return name
  */
  
  @Schema(name = "name", description = "Имя менеджера", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("name")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public VacancyDraftContacts phones(List<VacancyDraftPhoneItem> phones) {
    this.phones = phones;
    return this;
  }

  public VacancyDraftContacts addPhonesItem(VacancyDraftPhoneItem phonesItem) {
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
  public List<VacancyDraftPhoneItem> getPhones() {
    return phones;
  }

  public void setPhones(List<VacancyDraftPhoneItem> phones) {
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
    VacancyDraftContacts vacancyDraftContacts = (VacancyDraftContacts) o;
    return Objects.equals(this.email, vacancyDraftContacts.email) &&
        Objects.equals(this.name, vacancyDraftContacts.name) &&
        Objects.equals(this.phones, vacancyDraftContacts.phones);
  }

  @Override
  public int hashCode() {
    return Objects.hash(email, name, phones);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class VacancyDraftContacts {\n");
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

