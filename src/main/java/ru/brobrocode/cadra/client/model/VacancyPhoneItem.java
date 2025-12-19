package ru.brobrocode.cadra.client.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.annotation.Generated;

import java.util.Objects;

/**
 * VacancyPhoneItem
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2025-08-17T15:41:09.394389505+05:00[Asia/Yekaterinburg]", comments = "Generator version: 7.6.0")
public class VacancyPhoneItem {

  private String city;

  private String comment = null;

  private String country;

  private String formatted;

  private String number;

  public VacancyPhoneItem city(String city) {
    this.city = city;
    return this;
  }

  /**
   * Код города
   * @return city
  */
  
  @Schema(name = "city", description = "Код города", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("city")
  public String getCity() {
    return city;
  }

  public void setCity(String city) {
    this.city = city;
  }

  public VacancyPhoneItem comment(String comment) {
    this.comment = comment;
    return this;
  }

  /**
   * Комментарий (удобное время для звонка по этому номеру)
   * @return comment
  */
  
  @Schema(name = "comment", description = "Комментарий (удобное время для звонка по этому номеру)", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("comment")
  public String getComment() {
    return comment;
  }

  public void setComment(String comment) {
    this.comment = comment;
  }

  public VacancyPhoneItem country(String country) {
    this.country = country;
    return this;
  }

  /**
   * Код страны
   * @return country
  */
  
  @Schema(name = "country", description = "Код страны", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("country")
  public String getCountry() {
    return country;
  }

  public void setCountry(String country) {
    this.country = country;
  }

  public VacancyPhoneItem formatted(String formatted) {
    this.formatted = formatted;
    return this;
  }

  /**
   * Телефонный номер
   * @return formatted
  */
  
  @Schema(name = "formatted", description = "Телефонный номер", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("formatted")
  public String getFormatted() {
    return formatted;
  }

  public void setFormatted(String formatted) {
    this.formatted = formatted;
  }

  public VacancyPhoneItem number(String number) {
    this.number = number;
    return this;
  }

  /**
   * Телефон
   * @return number
  */
  
  @Schema(name = "number", description = "Телефон", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
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
    VacancyPhoneItem vacancyPhoneItem = (VacancyPhoneItem) o;
    return Objects.equals(this.city, vacancyPhoneItem.city) &&
        Objects.equals(this.comment, vacancyPhoneItem.comment) &&
        Objects.equals(this.country, vacancyPhoneItem.country) &&
        Objects.equals(this.formatted, vacancyPhoneItem.formatted) &&
        Objects.equals(this.number, vacancyPhoneItem.number);
  }

  @Override
  public int hashCode() {
    return Objects.hash(city, comment, country, formatted, number);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class VacancyPhoneItem {\n");
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

