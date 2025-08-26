package ru.brobrocode.cadra.client.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.annotation.Generated;
import jakarta.validation.Valid;

import java.util.Objects;

/**
 * VacanciesVacancyConditionFieldsContactFields
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2025-08-17T15:41:09.394389505+05:00[Asia/Yekaterinburg]", comments = "Generator version: 7.6.0")
public class VacanciesVacancyConditionFieldsContactFields {

  private VacanciesVacancyConditionFieldsRequiredLengthWithTitle email = null;

  private VacanciesVacancyConditionFieldsRequiredLengthWithTitle name = null;

  private VacanciesVacancyConditionFieldsPhoneCondition phones = null;

  public VacanciesVacancyConditionFieldsContactFields email(VacanciesVacancyConditionFieldsRequiredLengthWithTitle email) {
    this.email = email;
    return this;
  }

  /**
   * Get email
   * @return email
  */
  @Valid 
  @Schema(name = "email", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("email")
  public VacanciesVacancyConditionFieldsRequiredLengthWithTitle getEmail() {
    return email;
  }

  public void setEmail(VacanciesVacancyConditionFieldsRequiredLengthWithTitle email) {
    this.email = email;
  }

  public VacanciesVacancyConditionFieldsContactFields name(VacanciesVacancyConditionFieldsRequiredLengthWithTitle name) {
    this.name = name;
    return this;
  }

  /**
   * Get name
   * @return name
  */
  @Valid 
  @Schema(name = "name", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("name")
  public VacanciesVacancyConditionFieldsRequiredLengthWithTitle getName() {
    return name;
  }

  public void setName(VacanciesVacancyConditionFieldsRequiredLengthWithTitle name) {
    this.name = name;
  }

  public VacanciesVacancyConditionFieldsContactFields phones(VacanciesVacancyConditionFieldsPhoneCondition phones) {
    this.phones = phones;
    return this;
  }

  /**
   * Get phones
   * @return phones
  */
  @Valid 
  @Schema(name = "phones", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("phones")
  public VacanciesVacancyConditionFieldsPhoneCondition getPhones() {
    return phones;
  }

  public void setPhones(VacanciesVacancyConditionFieldsPhoneCondition phones) {
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
    VacanciesVacancyConditionFieldsContactFields vacanciesVacancyConditionFieldsContactFields = (VacanciesVacancyConditionFieldsContactFields) o;
    return Objects.equals(this.email, vacanciesVacancyConditionFieldsContactFields.email) &&
        Objects.equals(this.name, vacanciesVacancyConditionFieldsContactFields.name) &&
        Objects.equals(this.phones, vacanciesVacancyConditionFieldsContactFields.phones);
  }

  @Override
  public int hashCode() {
    return Objects.hash(email, name, phones);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class VacanciesVacancyConditionFieldsContactFields {\n");
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

