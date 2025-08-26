package ru.brobrocode.cadra.client.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.annotation.Generated;
import jakarta.validation.constraints.NotNull;

import java.util.Objects;

/**
 * VacancyManagerOutput
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2025-08-17T15:41:09.394389505+05:00[Asia/Yekaterinburg]", comments = "Generator version: 7.6.0")
public class VacancyManagerOutput {

  private String firstName;

  private String id;

  private String lastName;

  private String middleName = null;

  public VacancyManagerOutput() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public VacancyManagerOutput(String firstName, String id, String lastName, String middleName) {
    this.firstName = firstName;
    this.id = id;
    this.lastName = lastName;
    this.middleName = middleName;
  }

  public VacancyManagerOutput firstName(String firstName) {
    this.firstName = firstName;
    return this;
  }

  /**
   * Имя менеджера
   * @return firstName
  */
  @NotNull 
  @Schema(name = "first_name", description = "Имя менеджера", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("first_name")
  public String getFirstName() {
    return firstName;
  }

  public void setFirstName(String firstName) {
    this.firstName = firstName;
  }

  public VacancyManagerOutput id(String id) {
    this.id = id;
    return this;
  }

  /**
   * Контактное лицо (менеджер) по размещаемой вакансии, по умолчанию текущий пользователь
   * @return id
  */
  @NotNull 
  @Schema(name = "id", description = "Контактное лицо (менеджер) по размещаемой вакансии, по умолчанию текущий пользователь", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("id")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public VacancyManagerOutput lastName(String lastName) {
    this.lastName = lastName;
    return this;
  }

  /**
   * Фамилия менеджера
   * @return lastName
  */
  @NotNull 
  @Schema(name = "last_name", description = "Фамилия менеджера", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("last_name")
  public String getLastName() {
    return lastName;
  }

  public void setLastName(String lastName) {
    this.lastName = lastName;
  }

  public VacancyManagerOutput middleName(String middleName) {
    this.middleName = middleName;
    return this;
  }

  /**
   * Второе имя менеджера
   * @return middleName
  */
  @NotNull 
  @Schema(name = "middle_name", description = "Второе имя менеджера", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("middle_name")
  public String getMiddleName() {
    return middleName;
  }

  public void setMiddleName(String middleName) {
    this.middleName = middleName;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    VacancyManagerOutput vacancyManagerOutput = (VacancyManagerOutput) o;
    return Objects.equals(this.firstName, vacancyManagerOutput.firstName) &&
        Objects.equals(this.id, vacancyManagerOutput.id) &&
        Objects.equals(this.lastName, vacancyManagerOutput.lastName) &&
        Objects.equals(this.middleName, vacancyManagerOutput.middleName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(firstName, id, lastName, middleName);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class VacancyManagerOutput {\n");
    sb.append("    firstName: ").append(toIndentedString(firstName)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    lastName: ").append(toIndentedString(lastName)).append("\n");
    sb.append("    middleName: ").append(toIndentedString(middleName)).append("\n");
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

