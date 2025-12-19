package ru.brobrocode.cadra.client.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.annotation.Generated;

import java.util.Objects;

/**
 * VacancyHiddenDeprecated
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2025-08-17T15:41:09.394389505+05:00[Asia/Yekaterinburg]", comments = "Generator version: 7.6.0")
public class VacancyHiddenDeprecated {

  @Deprecated
  private Boolean hidden;

  public VacancyHiddenDeprecated hidden(Boolean hidden) {
    this.hidden = hidden;
    return this;
  }

  /**
   * Удалена ли вакансия (скрыта из архива). Оставлено для обеспечения обратной совместимости
   * @return hidden
   * @deprecated
  */
  
  @Schema(name = "hidden", description = "Удалена ли вакансия (скрыта из архива). Оставлено для обеспечения обратной совместимости", deprecated = true, requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("hidden")
  @Deprecated
  public Boolean getHidden() {
    return hidden;
  }

  /**
   * @deprecated
  */
  @Deprecated
  public void setHidden(Boolean hidden) {
    this.hidden = hidden;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    VacancyHiddenDeprecated vacancyHiddenDeprecated = (VacancyHiddenDeprecated) o;
    return Objects.equals(this.hidden, vacancyHiddenDeprecated.hidden);
  }

  @Override
  public int hashCode() {
    return Objects.hash(hidden);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class VacancyHiddenDeprecated {\n");
    sb.append("    hidden: ").append(toIndentedString(hidden)).append("\n");
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

