package ru.brobrocode.cadra.client.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.annotation.Generated;

import java.util.Objects;

/**
 * VacanciesSuggests
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2025-08-17T15:41:09.394389505+05:00[Asia/Yekaterinburg]", comments = "Generator version: 7.6.0")
public class VacanciesSuggests {

  private Integer found;

  private String value;

  public VacanciesSuggests found(Integer found) {
    this.found = found;
    return this;
  }

  /**
   * Найдено результатов по предложенному запросу
   * @return found
  */
  
  @Schema(name = "found", description = "Найдено результатов по предложенному запросу", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("found")
  public Integer getFound() {
    return found;
  }

  public void setFound(Integer found) {
    this.found = found;
  }

  public VacanciesSuggests value(String value) {
    this.value = value;
    return this;
  }

  /**
   * Предложенный текст запроса
   * @return value
  */
  
  @Schema(name = "value", description = "Предложенный текст запроса", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("value")
  public String getValue() {
    return value;
  }

  public void setValue(String value) {
    this.value = value;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    VacanciesSuggests vacanciesSuggests = (VacanciesSuggests) o;
    return Objects.equals(this.found, vacanciesSuggests.found) &&
        Objects.equals(this.value, vacanciesSuggests.value);
  }

  @Override
  public int hashCode() {
    return Objects.hash(found, value);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class VacanciesSuggests {\n");
    sb.append("    found: ").append(toIndentedString(found)).append("\n");
    sb.append("    value: ").append(toIndentedString(value)).append("\n");
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

