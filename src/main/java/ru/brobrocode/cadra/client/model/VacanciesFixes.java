package ru.brobrocode.cadra.client.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.annotation.Generated;

import java.util.Objects;

/**
 * VacanciesFixes
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2025-08-17T15:41:09.394389505+05:00[Asia/Yekaterinburg]", comments = "Generator version: 7.6.0")
public class VacanciesFixes {

  private String fixed;

  private String original;

  public VacanciesFixes fixed(String fixed) {
    this.fixed = fixed;
    return this;
  }

  /**
   * Текст запроса после исправления
   * @return fixed
  */
  
  @Schema(name = "fixed", description = "Текст запроса после исправления", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("fixed")
  public String getFixed() {
    return fixed;
  }

  public void setFixed(String fixed) {
    this.fixed = fixed;
  }

  public VacanciesFixes original(String original) {
    this.original = original;
    return this;
  }

  /**
   * Исходный текст запроса
   * @return original
  */
  
  @Schema(name = "original", description = "Исходный текст запроса", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("original")
  public String getOriginal() {
    return original;
  }

  public void setOriginal(String original) {
    this.original = original;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    VacanciesFixes vacanciesFixes = (VacanciesFixes) o;
    return Objects.equals(this.fixed, vacanciesFixes.fixed) &&
        Objects.equals(this.original, vacanciesFixes.original);
  }

  @Override
  public int hashCode() {
    return Objects.hash(fixed, original);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class VacanciesFixes {\n");
    sb.append("    fixed: ").append(toIndentedString(fixed)).append("\n");
    sb.append("    original: ").append(toIndentedString(original)).append("\n");
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

