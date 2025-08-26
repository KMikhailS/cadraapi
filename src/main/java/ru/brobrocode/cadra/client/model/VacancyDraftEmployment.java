package ru.brobrocode.cadra.client.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.annotation.Generated;

import java.util.Objects;

/**
 * VacancyDraftEmployment
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2025-08-17T15:41:09.394389505+05:00[Asia/Yekaterinburg]", comments = "Generator version: 7.6.0")
public class VacancyDraftEmployment {

  private String id = null;

  public VacancyDraftEmployment id(String id) {
    this.id = id;
    return this;
  }

  /**
   * Тип занятости из [справочника employment](#tag/Obshie-spravochniki/operation/get-dictionaries). По умолчанию или ошибке в поле ставится full
   * @return id
  */
  
  @Schema(name = "id", description = "Тип занятости из [справочника employment](#tag/Obshie-spravochniki/operation/get-dictionaries). По умолчанию или ошибке в поле ставится full", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("id")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    VacancyDraftEmployment vacancyDraftEmployment = (VacancyDraftEmployment) o;
    return Objects.equals(this.id, vacancyDraftEmployment.id);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class VacancyDraftEmployment {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
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

