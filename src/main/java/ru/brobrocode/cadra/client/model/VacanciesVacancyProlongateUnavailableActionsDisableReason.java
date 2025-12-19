package ru.brobrocode.cadra.client.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.annotation.Generated;
import jakarta.validation.constraints.NotNull;

import java.util.Objects;

/**
 * VacanciesVacancyProlongateUnavailableActionsDisableReason
 */

@JsonTypeName("VacanciesVacancyProlongateUnavailableActions_disable_reason")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2025-08-17T15:41:09.394389505+05:00[Asia/Yekaterinburg]", comments = "Generator version: 7.6.0")
public class VacanciesVacancyProlongateUnavailableActionsDisableReason {

  private String id;

  private String name;

  public VacanciesVacancyProlongateUnavailableActionsDisableReason() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public VacanciesVacancyProlongateUnavailableActionsDisableReason(String id, String name) {
    this.id = id;
    this.name = name;
  }

  public VacanciesVacancyProlongateUnavailableActionsDisableReason id(String id) {
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

  public VacanciesVacancyProlongateUnavailableActionsDisableReason name(String name) {
    this.name = name;
    return this;
  }

  /**
   * Название
   * @return name
  */
  @NotNull 
  @Schema(name = "name", description = "Название", requiredMode = Schema.RequiredMode.REQUIRED)
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
    VacanciesVacancyProlongateUnavailableActionsDisableReason vacanciesVacancyProlongateUnavailableActionsDisableReason = (VacanciesVacancyProlongateUnavailableActionsDisableReason) o;
    return Objects.equals(this.id, vacanciesVacancyProlongateUnavailableActionsDisableReason.id) &&
        Objects.equals(this.name, vacanciesVacancyProlongateUnavailableActionsDisableReason.name);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class VacanciesVacancyProlongateUnavailableActionsDisableReason {\n");
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

