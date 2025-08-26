package ru.brobrocode.cadra.client.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.annotation.Generated;

import java.util.Objects;

/**
 * VacancyWorkingHoursWorkingHoursItemOutput
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2025-08-17T15:41:09.394389505+05:00[Asia/Yekaterinburg]", comments = "Generator version: 7.6.0")
public class VacancyWorkingHoursWorkingHoursItemOutput {

  private String id;

  private String name;

  public VacancyWorkingHoursWorkingHoursItemOutput id(String id) {
    this.id = id;
    return this;
  }

  /**
   * Элементы из [справочника working_hours](#tag/Obshie-spravochniki/operation/get-dictionaries)
   * @return id
  */
  
  @Schema(name = "id", description = "Элементы из [справочника working_hours](#tag/Obshie-spravochniki/operation/get-dictionaries)", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("id")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public VacancyWorkingHoursWorkingHoursItemOutput name(String name) {
    this.name = name;
    return this;
  }

  /**
   * Название варианта рабочих часов в день
   * @return name
  */
  
  @Schema(name = "name", description = "Название варианта рабочих часов в день", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("name")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    VacancyWorkingHoursWorkingHoursItemOutput vacancyWorkingHoursWorkingHoursItemOutput = (VacancyWorkingHoursWorkingHoursItemOutput) o;
    return Objects.equals(this.id, vacancyWorkingHoursWorkingHoursItemOutput.id) &&
        Objects.equals(this.name, vacancyWorkingHoursWorkingHoursItemOutput.name);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class VacancyWorkingHoursWorkingHoursItemOutput {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
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

