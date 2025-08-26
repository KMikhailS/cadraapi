package ru.brobrocode.cadra.client.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.annotation.Generated;
import jakarta.validation.Valid;

import java.util.Objects;

/**
 * VacanciesVacancyConditionFieldsAddressFields
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2025-08-17T15:41:09.394389505+05:00[Asia/Yekaterinburg]", comments = "Generator version: 7.6.0")
public class VacanciesVacancyConditionFieldsAddressFields {

  private VacanciesVacancyConditionFieldsRequired showMetroOnly = null;

  public VacanciesVacancyConditionFieldsAddressFields showMetroOnly(VacanciesVacancyConditionFieldsRequired showMetroOnly) {
    this.showMetroOnly = showMetroOnly;
    return this;
  }

  /**
   * Get showMetroOnly
   * @return showMetroOnly
  */
  @Valid 
  @Schema(name = "show_metro_only", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("show_metro_only")
  public VacanciesVacancyConditionFieldsRequired getShowMetroOnly() {
    return showMetroOnly;
  }

  public void setShowMetroOnly(VacanciesVacancyConditionFieldsRequired showMetroOnly) {
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
    VacanciesVacancyConditionFieldsAddressFields vacanciesVacancyConditionFieldsAddressFields = (VacanciesVacancyConditionFieldsAddressFields) o;
    return Objects.equals(this.showMetroOnly, vacanciesVacancyConditionFieldsAddressFields.showMetroOnly);
  }

  @Override
  public int hashCode() {
    return Objects.hash(showMetroOnly);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class VacanciesVacancyConditionFieldsAddressFields {\n");
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

