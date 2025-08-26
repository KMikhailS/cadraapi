package ru.brobrocode.cadra.client.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.annotation.Generated;
import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;

import java.util.Objects;

/**
 * Поле, передаваемое в запросе при смене менеджера вакансии
 */

@Schema(name = "VacancyEditManager", description = "Поле, передаваемое в запросе при смене менеджера вакансии")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2025-08-17T15:41:09.394389505+05:00[Asia/Yekaterinburg]", comments = "Generator version: 7.6.0")
public class VacancyEditManager {

  private VacancyEditManagerManager manager = null;

  public VacancyEditManager() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public VacancyEditManager(VacancyEditManagerManager manager) {
    this.manager = manager;
  }

  public VacancyEditManager manager(VacancyEditManagerManager manager) {
    this.manager = manager;
    return this;
  }

  /**
   * Get manager
   * @return manager
  */
  @NotNull @Valid 
  @Schema(name = "manager", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("manager")
  public VacancyEditManagerManager getManager() {
    return manager;
  }

  public void setManager(VacancyEditManagerManager manager) {
    this.manager = manager;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    VacancyEditManager vacancyEditManager = (VacancyEditManager) o;
    return Objects.equals(this.manager, vacancyEditManager.manager);
  }

  @Override
  public int hashCode() {
    return Objects.hash(manager);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class VacancyEditManager {\n");
    sb.append("    manager: ").append(toIndentedString(manager)).append("\n");
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

