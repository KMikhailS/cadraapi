package ru.brobrocode.cadra.client.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.annotation.Generated;
import jakarta.validation.constraints.NotNull;

import java.util.Objects;

/**
 * Телефон
 */

@Schema(name = "ResumeEditResume_contact_inner_value_oneOf", description = "Телефон")
@JsonTypeName("ResumeEditResume_contact_inner_value_oneOf")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2025-08-17T15:41:09.394389505+05:00[Asia/Yekaterinburg]", comments = "Generator version: 7.6.0")
public class ResumeEditResumeContactInnerValueOneOf implements ResumeEditResumeContactInnerValue {

  private String city;

  private String country;

  private String formatted;

  private String number;

  public ResumeEditResumeContactInnerValueOneOf() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public ResumeEditResumeContactInnerValueOneOf(String city, String country, String formatted, String number) {
    this.city = city;
    this.country = country;
    this.formatted = formatted;
    this.number = number;
  }

  public ResumeEditResumeContactInnerValueOneOf city(String city) {
    this.city = city;
    return this;
  }

  /**
   * Код города (при указании телефона)
   * @return city
  */
  @NotNull 
  @Schema(name = "city", description = "Код города (при указании телефона)", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("city")
  public String getCity() {
    return city;
  }

  public void setCity(String city) {
    this.city = city;
  }

  public ResumeEditResumeContactInnerValueOneOf country(String country) {
    this.country = country;
    return this;
  }

  /**
   * Код страны (при указании телефона)
   * @return country
  */
  @NotNull 
  @Schema(name = "country", description = "Код страны (при указании телефона)", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("country")
  public String getCountry() {
    return country;
  }

  public void setCountry(String country) {
    this.country = country;
  }

  public ResumeEditResumeContactInnerValueOneOf formatted(String formatted) {
    this.formatted = formatted;
    return this;
  }

  /**
   * Отформатированный номер телефона (при указании телефона)
   * @return formatted
  */
  @NotNull 
  @Schema(name = "formatted", description = "Отформатированный номер телефона (при указании телефона)", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("formatted")
  public String getFormatted() {
    return formatted;
  }

  public void setFormatted(String formatted) {
    this.formatted = formatted;
  }

  public ResumeEditResumeContactInnerValueOneOf number(String number) {
    this.number = number;
    return this;
  }

  /**
   * Номер (при указании телефона)
   * @return number
  */
  @NotNull 
  @Schema(name = "number", description = "Номер (при указании телефона)", requiredMode = Schema.RequiredMode.REQUIRED)
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
    ResumeEditResumeContactInnerValueOneOf resumeEditResumeContactInnerValueOneOf = (ResumeEditResumeContactInnerValueOneOf) o;
    return Objects.equals(this.city, resumeEditResumeContactInnerValueOneOf.city) &&
        Objects.equals(this.country, resumeEditResumeContactInnerValueOneOf.country) &&
        Objects.equals(this.formatted, resumeEditResumeContactInnerValueOneOf.formatted) &&
        Objects.equals(this.number, resumeEditResumeContactInnerValueOneOf.number);
  }

  @Override
  public int hashCode() {
    return Objects.hash(city, country, formatted, number);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ResumeEditResumeContactInnerValueOneOf {\n");
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

