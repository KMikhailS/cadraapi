package ru.brobrocode.cadra.client.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.annotation.Generated;
import jakarta.validation.constraints.NotNull;

import java.util.Objects;

/**
 * Дополнительный телефон менеджера
 */

@Schema(name = "EmployerManagersEmployerManagerInfo_additional_phone", description = "Дополнительный телефон менеджера")
@JsonTypeName("EmployerManagersEmployerManagerInfo_additional_phone")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2025-08-17T15:41:09.394389505+05:00[Asia/Yekaterinburg]", comments = "Generator version: 7.6.0")
public class EmployerManagersEmployerManagerInfoAdditionalPhone {

  private String city;

  private String comment = null;

  private String country;

  private String formatted;

  private String number;

  public EmployerManagersEmployerManagerInfoAdditionalPhone() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public EmployerManagersEmployerManagerInfoAdditionalPhone(String city, String country, String number) {
    this.city = city;
    this.country = country;
    this.number = number;
  }

  public EmployerManagersEmployerManagerInfoAdditionalPhone city(String city) {
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

  public EmployerManagersEmployerManagerInfoAdditionalPhone comment(String comment) {
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

  public EmployerManagersEmployerManagerInfoAdditionalPhone country(String country) {
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

  public EmployerManagersEmployerManagerInfoAdditionalPhone formatted(String formatted) {
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

  public EmployerManagersEmployerManagerInfoAdditionalPhone number(String number) {
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
    EmployerManagersEmployerManagerInfoAdditionalPhone employerManagersEmployerManagerInfoAdditionalPhone = (EmployerManagersEmployerManagerInfoAdditionalPhone) o;
    return Objects.equals(this.city, employerManagersEmployerManagerInfoAdditionalPhone.city) &&
        Objects.equals(this.comment, employerManagersEmployerManagerInfoAdditionalPhone.comment) &&
        Objects.equals(this.country, employerManagersEmployerManagerInfoAdditionalPhone.country) &&
        Objects.equals(this.formatted, employerManagersEmployerManagerInfoAdditionalPhone.formatted) &&
        Objects.equals(this.number, employerManagersEmployerManagerInfoAdditionalPhone.number);
  }

  @Override
  public int hashCode() {
    return Objects.hash(city, comment, country, formatted, number);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EmployerManagersEmployerManagerInfoAdditionalPhone {\n");
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

