package ru.brobrocode.cadra.client.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.annotation.Generated;
import jakarta.validation.constraints.NotNull;

import java.util.Objects;

/**
 * IncludesContactPhoneValue
 */

@JsonTypeName("_IncludesContactPhoneValue")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2025-08-17T15:41:09.394389505+05:00[Asia/Yekaterinburg]", comments = "Generator version: 7.6.0")
public class IncludesContactPhoneValue implements IncludesContactPropertiesValue {

  private String city;

  private String country;

  private String formatted;

  private String number;

  public IncludesContactPhoneValue() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public IncludesContactPhoneValue(String city, String country, String formatted, String number) {
    this.city = city;
    this.country = country;
    this.formatted = formatted;
    this.number = number;
  }

  public IncludesContactPhoneValue city(String city) {
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

  public IncludesContactPhoneValue country(String country) {
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

  public IncludesContactPhoneValue formatted(String formatted) {
    this.formatted = formatted;
    return this;
  }

  /**
   * Отформатированный номер телефона
   * @return formatted
  */
  @NotNull 
  @Schema(name = "formatted", description = "Отформатированный номер телефона", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("formatted")
  public String getFormatted() {
    return formatted;
  }

  public void setFormatted(String formatted) {
    this.formatted = formatted;
  }

  public IncludesContactPhoneValue number(String number) {
    this.number = number;
    return this;
  }

  /**
   * Номер телефона
   * @return number
  */
  @NotNull 
  @Schema(name = "number", description = "Номер телефона", requiredMode = Schema.RequiredMode.REQUIRED)
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
    IncludesContactPhoneValue includesContactPhoneValue = (IncludesContactPhoneValue) o;
    return Objects.equals(this.city, includesContactPhoneValue.city) &&
        Objects.equals(this.country, includesContactPhoneValue.country) &&
        Objects.equals(this.formatted, includesContactPhoneValue.formatted) &&
        Objects.equals(this.number, includesContactPhoneValue.number);
  }

  @Override
  public int hashCode() {
    return Objects.hash(city, country, formatted, number);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IncludesContactPhoneValue {\n");
    sb.append("    city: ").append(toIndentedString(city)).append("\n");
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

