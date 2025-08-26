package ru.brobrocode.cadra.client.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.annotation.Generated;
import jakarta.validation.constraints.NotNull;

import java.util.Objects;

/**
 * Основной телефон менеджера
 */

@Schema(name = "EmployerManagersEmployerManagerItem_phone", description = "Основной телефон менеджера")
@JsonTypeName("EmployerManagersEmployerManagerItem_phone")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2025-08-17T15:41:09.394389505+05:00[Asia/Yekaterinburg]", comments = "Generator version: 7.6.0")
public class EmployerManagersEmployerManagerItemPhone {

  private String city;

  private String comment = null;

  private String country;

  private String formatted;

  private String number;

  public EmployerManagersEmployerManagerItemPhone() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public EmployerManagersEmployerManagerItemPhone(String city, String country, String number) {
    this.city = city;
    this.country = country;
    this.number = number;
  }

  public EmployerManagersEmployerManagerItemPhone city(String city) {
    this.city = city;
    return this;
  }

  /**
   * Код города
   * @return city
  */
  @NotNull 
  @Schema(name = "city", description = "Код города", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("city")
  public String getCity() {
    return city;
  }

  public void setCity(String city) {
    this.city = city;
  }

  public EmployerManagersEmployerManagerItemPhone comment(String comment) {
    this.comment = comment;
    return this;
  }

  /**
   * Комментарий
   * @return comment
  */
  
  @Schema(name = "comment", description = "Комментарий", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("comment")
  public String getComment() {
    return comment;
  }

  public void setComment(String comment) {
    this.comment = comment;
  }

  public EmployerManagersEmployerManagerItemPhone country(String country) {
    this.country = country;
    return this;
  }

  /**
   * Код страны
   * @return country
  */
  @NotNull 
  @Schema(name = "country", description = "Код страны", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("country")
  public String getCountry() {
    return country;
  }

  public void setCountry(String country) {
    this.country = country;
  }

  public EmployerManagersEmployerManagerItemPhone formatted(String formatted) {
    this.formatted = formatted;
    return this;
  }

  /**
   * Номер телефона отформатированный
   * @return formatted
  */
  
  @Schema(name = "formatted", description = "Номер телефона отформатированный", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("formatted")
  public String getFormatted() {
    return formatted;
  }

  public void setFormatted(String formatted) {
    this.formatted = formatted;
  }

  public EmployerManagersEmployerManagerItemPhone number(String number) {
    this.number = number;
    return this;
  }

  /**
   * Номер
   * @return number
  */
  @NotNull 
  @Schema(name = "number", description = "Номер", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("number")
  public String getNumber() {
    return number;
  }

  public void setNumber(String number) {
    this.number = number;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EmployerManagersEmployerManagerItemPhone employerManagersEmployerManagerItemPhone = (EmployerManagersEmployerManagerItemPhone) o;
    return Objects.equals(this.city, employerManagersEmployerManagerItemPhone.city) &&
        Objects.equals(this.comment, employerManagersEmployerManagerItemPhone.comment) &&
        Objects.equals(this.country, employerManagersEmployerManagerItemPhone.country) &&
        Objects.equals(this.formatted, employerManagersEmployerManagerItemPhone.formatted) &&
        Objects.equals(this.number, employerManagersEmployerManagerItemPhone.number);
  }

  @Override
  public int hashCode() {
    return Objects.hash(city, comment, country, formatted, number);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EmployerManagersEmployerManagerItemPhone {\n");
    sb.append("    city: ").append(toIndentedString(city)).append("\n");
    sb.append("    comment: ").append(toIndentedString(comment)).append("\n");
    sb.append("    country: ").append(toIndentedString(country)).append("\n");
    sb.append("    formatted: ").append(toIndentedString(formatted)).append("\n");
    sb.append("    number: ").append(toIndentedString(number)).append("\n");
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

