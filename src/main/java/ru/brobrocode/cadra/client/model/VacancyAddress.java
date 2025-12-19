package ru.brobrocode.cadra.client.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.annotation.Generated;

import java.util.Objects;

/**
 * Адрес
 */

@Schema(name = "VacancyAddress", description = "Адрес")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2025-08-17T15:41:09.394389505+05:00[Asia/Yekaterinburg]", comments = "Generator version: 7.6.0")
public class VacancyAddress {

  private String id = null;

  private Boolean showMetroOnly = null;

  public VacancyAddress id(String id) {
    this.id = id;
    return this;
  }

  /**
   * Адрес из [списка доступных адресов работодателя](#tag/Adresa-rabotodatelya/operation/get-employer-addresses)
   * @return id
  */
  
  @Schema(name = "id", description = "Адрес из [списка доступных адресов работодателя](#tag/Adresa-rabotodatelya/operation/get-employer-addresses)", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("id")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public VacancyAddress showMetroOnly(Boolean showMetroOnly) {
    this.showMetroOnly = showMetroOnly;
    return this;
  }

  /**
   * Показывать только метро для указанного адреса
   * @return showMetroOnly
  */
  
  @Schema(name = "show_metro_only", description = "Показывать только метро для указанного адреса", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("show_metro_only")
  public Boolean getShowMetroOnly() {
    return showMetroOnly;
  }

  public void setShowMetroOnly(Boolean showMetroOnly) {
    this.showMetroOnly = showMetroOnly;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    VacancyAddress vacancyAddress = (VacancyAddress) o;
    return Objects.equals(this.id, vacancyAddress.id) &&
        Objects.equals(this.showMetroOnly, vacancyAddress.showMetroOnly);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, showMetroOnly);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class VacancyAddress {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    showMetroOnly: ").append(toIndentedString(showMetroOnly)).append("\n");
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

