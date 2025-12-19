package ru.brobrocode.cadra.client.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.annotation.Generated;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;

import java.util.Objects;

/**
 * VacancyDraftPhone
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2025-08-17T15:41:09.394389505+05:00[Asia/Yekaterinburg]", comments = "Generator version: 7.6.0")
public class VacancyDraftPhone implements VacancyDraftPhoneItem {

  private String city;

  private String comment = null;

  private String country;

  private String number;

  public VacancyDraftPhone() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public VacancyDraftPhone(String city, String country, String number) {
    this.city = city;
    this.country = country;
    this.number = number;
  }

  public VacancyDraftPhone city(String city) {
    this.city = city;
    return this;
  }

  /**
   * Код города
   * @return city
  */
  @NotNull @Pattern(regexp = "^\\d+$") 
  @Schema(name = "city", description = "Код города", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("city")
  public String getCity() {
    return city;
  }

  public void setCity(String city) {
    this.city = city;
  }

  public VacancyDraftPhone comment(String comment) {
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

  public VacancyDraftPhone country(String country) {
    this.country = country;
    return this;
  }

  /**
   * Код страны
   * @return country
  */
  @NotNull @Pattern(regexp = "^\\d+$") 
  @Schema(name = "country", description = "Код страны", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("country")
  public String getCountry() {
    return country;
  }

  public void setCountry(String country) {
    this.country = country;
  }

  public VacancyDraftPhone number(String number) {
    this.number = number;
    return this;
  }

  /**
   * Абонентская часть телефонного номера
   * @return number
  */
  @NotNull @Pattern(regexp = "^\\d+$") 
  @Schema(name = "number", description = "Абонентская часть телефонного номера", requiredMode = Schema.RequiredMode.REQUIRED)
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
    VacancyDraftPhone vacancyDraftPhone = (VacancyDraftPhone) o;
    return Objects.equals(this.city, vacancyDraftPhone.city) &&
        Objects.equals(this.comment, vacancyDraftPhone.comment) &&
        Objects.equals(this.country, vacancyDraftPhone.country) &&
        Objects.equals(this.number, vacancyDraftPhone.number);
  }

  @Override
  public int hashCode() {
    return Objects.hash(city, comment, country, number);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class VacancyDraftPhone {\n");
    sb.append("    city: ").append(toIndentedString(city)).append("\n");
    sb.append("    comment: ").append(toIndentedString(comment)).append("\n");
    sb.append("    country: ").append(toIndentedString(country)).append("\n");
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

