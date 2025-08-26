package ru.brobrocode.cadra.client.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.annotation.Generated;

import java.util.Objects;

/**
 * VacancyEmployerBlacklisted
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2025-08-17T15:41:09.394389505+05:00[Asia/Yekaterinburg]", comments = "Generator version: 7.6.0")
public class VacancyEmployerBlacklisted {

  private Boolean blacklisted;

  public VacancyEmployerBlacklisted blacklisted(Boolean blacklisted) {
    this.blacklisted = blacklisted;
    return this;
  }

  /**
   * Добавлены ли все вакансии работодателя в [список скрытых](#tag/Skrytye-rabotodateli)
   * @return blacklisted
  */
  
  @Schema(name = "blacklisted", description = "Добавлены ли все вакансии работодателя в [список скрытых](#tag/Skrytye-rabotodateli)", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("blacklisted")
  public Boolean getBlacklisted() {
    return blacklisted;
  }

  public void setBlacklisted(Boolean blacklisted) {
    this.blacklisted = blacklisted;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    VacancyEmployerBlacklisted vacancyEmployerBlacklisted = (VacancyEmployerBlacklisted) o;
    return Objects.equals(this.blacklisted, vacancyEmployerBlacklisted.blacklisted);
  }

  @Override
  public int hashCode() {
    return Objects.hash(blacklisted);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class VacancyEmployerBlacklisted {\n");
    sb.append("    blacklisted: ").append(toIndentedString(blacklisted)).append("\n");
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

