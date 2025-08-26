package ru.brobrocode.cadra.client.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.annotation.Generated;

import java.util.Objects;

/**
 * VacancyManager
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2025-08-17T15:41:09.394389505+05:00[Asia/Yekaterinburg]", comments = "Generator version: 7.6.0")
public class VacancyManager {

  private String id = null;

  public VacancyManager id(String id) {
    this.id = id;
    return this;
  }

  /**
   * Контактное лицо (менеджер) по размещаемой вакансии, по умолчанию текущий пользователь. Значение из [списка менеджеров компании](#tag/Menedzhery-rabotodatelya/operation/get-employer-managers)
   * @return id
  */
  
  @Schema(name = "id", description = "Контактное лицо (менеджер) по размещаемой вакансии, по умолчанию текущий пользователь. Значение из [списка менеджеров компании](#tag/Menedzhery-rabotodatelya/operation/get-employer-managers)", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
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
    VacancyManager vacancyManager = (VacancyManager) o;
    return Objects.equals(this.id, vacancyManager.id);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class VacancyManager {\n");
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

