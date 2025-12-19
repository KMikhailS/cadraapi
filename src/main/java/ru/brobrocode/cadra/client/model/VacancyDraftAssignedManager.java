package ru.brobrocode.cadra.client.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.annotation.Generated;

import java.util.Objects;

/**
 * VacancyDraftAssignedManager
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2025-08-17T15:41:09.394389505+05:00[Asia/Yekaterinburg]", comments = "Generator version: 7.6.0")
public class VacancyDraftAssignedManager {

  private String fullName;

  private String id;

  public VacancyDraftAssignedManager fullName(String fullName) {
    this.fullName = fullName;
    return this;
  }

  /**
   * ФИО
   * @return fullName
  */
  
  @Schema(name = "full_name", description = "ФИО", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("full_name")
  public String getFullName() {
    return fullName;
  }

  public void setFullName(String fullName) {
    this.fullName = fullName;
  }

  public VacancyDraftAssignedManager id(String id) {
    this.id = id;
    return this;
  }

  /**
   * Идентификатор рабочего аккаунта менеджера, которому перейдет вакансия после публикации
   * @return id
  */
  
  @Schema(name = "id", description = "Идентификатор рабочего аккаунта менеджера, которому перейдет вакансия после публикации", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
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
    VacancyDraftAssignedManager vacancyDraftAssignedManager = (VacancyDraftAssignedManager) o;
    return Objects.equals(this.fullName, vacancyDraftAssignedManager.fullName) &&
        Objects.equals(this.id, vacancyDraftAssignedManager.id);
  }

  @Override
  public int hashCode() {
    return Objects.hash(fullName, id);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class VacancyDraftAssignedManager {\n");
    sb.append("    fullName: ").append(toIndentedString(fullName)).append("\n");
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

