package ru.brobrocode.cadra.client.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.annotation.Generated;
import jakarta.validation.constraints.NotNull;

import java.util.Objects;

/**
 * Информация о телефоне соискателя
 */

@Schema(name = "ResumeShouldSendSmsPhone", description = "Информация о телефоне соискателя")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2025-08-17T15:41:09.394389505+05:00[Asia/Yekaterinburg]", comments = "Generator version: 7.6.0")
public class ResumeShouldSendSmsPhone {

  private String city;

  private String country;

  private String formatted;

  private Boolean needVerification;

  private String number;

  private Boolean restrictedCountry;

  private Boolean verified;

  public ResumeShouldSendSmsPhone() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public ResumeShouldSendSmsPhone(String city, String country, String formatted, Boolean needVerification, String number, Boolean restrictedCountry, Boolean verified) {
    this.city = city;
    this.country = country;
    this.formatted = formatted;
    this.needVerification = needVerification;
    this.number = number;
    this.restrictedCountry = restrictedCountry;
    this.verified = verified;
  }

  public ResumeShouldSendSmsPhone city(String city) {
    this.city = city;
    return this;
  }

  /**
   * Префикс города номера телефона
   * @return city
  */
  @NotNull 
  @Schema(name = "city", example = "929", description = "Префикс города номера телефона", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("city")
  public String getCity() {
    return city;
  }

  public void setCity(String city) {
    this.city = city;
  }

  public ResumeShouldSendSmsPhone country(String country) {
    this.country = country;
    return this;
  }

  /**
   * Префикс страны номера телефона
   * @return country
  */
  @NotNull 
  @Schema(name = "country", example = "7", description = "Префикс страны номера телефона", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("country")
  public String getCountry() {
    return country;
  }

  public void setCountry(String country) {
    this.country = country;
  }

  public ResumeShouldSendSmsPhone formatted(String formatted) {
    this.formatted = formatted;
    return this;
  }

  /**
   * Номер телефона отформатированный
   * @return formatted
  */
  @NotNull 
  @Schema(name = "formatted", example = "+7 (929) 667-21-67", description = "Номер телефона отформатированный", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("formatted")
  public String getFormatted() {
    return formatted;
  }

  public void setFormatted(String formatted) {
    this.formatted = formatted;
  }

  public ResumeShouldSendSmsPhone needVerification(Boolean needVerification) {
    this.needVerification = needVerification;
    return this;
  }

  /**
   * Нужно ли верифицировать номер телефона
   * @return needVerification
  */
  @NotNull 
  @Schema(name = "need_verification", example = "false", description = "Нужно ли верифицировать номер телефона", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("need_verification")
  public Boolean getNeedVerification() {
    return needVerification;
  }

  public void setNeedVerification(Boolean needVerification) {
    this.needVerification = needVerification;
  }

  public ResumeShouldSendSmsPhone number(String number) {
    this.number = number;
    return this;
  }

  /**
   * Номер телефона без префиксов
   * @return number
  */
  @NotNull 
  @Schema(name = "number", example = "6672167", description = "Номер телефона без префиксов", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("number")
  public String getNumber() {
    return number;
  }

  public void setNumber(String number) {
    this.number = number;
  }

  public ResumeShouldSendSmsPhone restrictedCountry(Boolean restrictedCountry) {
    this.restrictedCountry = restrictedCountry;
    return this;
  }

  /**
   * Находится ли номер телефона в черном списке по отправке смс
   * @return restrictedCountry
  */
  @NotNull 
  @Schema(name = "restricted_country", example = "false", description = "Находится ли номер телефона в черном списке по отправке смс", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("restricted_country")
  public Boolean getRestrictedCountry() {
    return restrictedCountry;
  }

  public void setRestrictedCountry(Boolean restrictedCountry) {
    this.restrictedCountry = restrictedCountry;
  }

  public ResumeShouldSendSmsPhone verified(Boolean verified) {
    this.verified = verified;
    return this;
  }

  /**
   * Верифицирован ли номер телефона пользователем
   * @return verified
  */
  @NotNull 
  @Schema(name = "verified", example = "true", description = "Верифицирован ли номер телефона пользователем", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("verified")
  public Boolean getVerified() {
    return verified;
  }

  public void setVerified(Boolean verified) {
    this.verified = verified;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ResumeShouldSendSmsPhone resumeShouldSendSmsPhone = (ResumeShouldSendSmsPhone) o;
    return Objects.equals(this.city, resumeShouldSendSmsPhone.city) &&
        Objects.equals(this.country, resumeShouldSendSmsPhone.country) &&
        Objects.equals(this.formatted, resumeShouldSendSmsPhone.formatted) &&
        Objects.equals(this.needVerification, resumeShouldSendSmsPhone.needVerification) &&
        Objects.equals(this.number, resumeShouldSendSmsPhone.number) &&
        Objects.equals(this.restrictedCountry, resumeShouldSendSmsPhone.restrictedCountry) &&
        Objects.equals(this.verified, resumeShouldSendSmsPhone.verified);
  }

  @Override
  public int hashCode() {
    return Objects.hash(city, country, formatted, needVerification, number, restrictedCountry, verified);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ResumeShouldSendSmsPhone {\n");
    sb.append("    city: ").append(toIndentedString(city)).append("\n");
    sb.append("    country: ").append(toIndentedString(country)).append("\n");
    sb.append("    formatted: ").append(toIndentedString(formatted)).append("\n");
    sb.append("    needVerification: ").append(toIndentedString(needVerification)).append("\n");
    sb.append("    number: ").append(toIndentedString(number)).append("\n");
    sb.append("    restrictedCountry: ").append(toIndentedString(restrictedCountry)).append("\n");
    sb.append("    verified: ").append(toIndentedString(verified)).append("\n");
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

