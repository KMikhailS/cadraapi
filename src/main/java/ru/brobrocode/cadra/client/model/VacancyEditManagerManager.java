package ru.brobrocode.cadra.client.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.annotation.Generated;
import jakarta.validation.constraints.NotNull;

import java.util.Objects;

/**
 * Идентификатор менеджера, которому надо передать автопоиск из ([списка менеджеров компании](#tag/Menedzhery-rabotodatelya/operation/get-employer-managers))
 */

@Schema(name = "VacancyEditManager_manager", description = "Идентификатор менеджера, которому надо передать автопоиск из ([списка менеджеров компании](#tag/Menedzhery-rabotodatelya/operation/get-employer-managers))")
@JsonTypeName("VacancyEditManager_manager")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2025-08-17T15:41:09.394389505+05:00[Asia/Yekaterinburg]", comments = "Generator version: 7.6.0")
public class VacancyEditManagerManager {

  private String id;

  public VacancyEditManagerManager() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public VacancyEditManagerManager(String id) {
    this.id = id;
  }

  public VacancyEditManagerManager id(String id) {
    this.id = id;
    return this;
  }

  /**
   * Идентификатор
   * @return id
  */
  @NotNull 
  @Schema(name = "id", description = "Идентификатор", requiredMode = Schema.RequiredMode.REQUIRED)
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
    VacancyEditManagerManager vacancyEditManagerManager = (VacancyEditManagerManager) o;
    return Objects.equals(this.id, vacancyEditManagerManager.id);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class VacancyEditManagerManager {\n");
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

