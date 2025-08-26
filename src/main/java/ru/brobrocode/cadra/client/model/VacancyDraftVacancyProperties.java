package ru.brobrocode.cadra.client.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.annotation.Generated;
import jakarta.validation.Valid;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * В пропертях хранятся только признаки наличия фичи, т.е. является ли вакансия рекламной, анонимной и т.д
 */

@Schema(name = "VacancyDraftVacancyProperties", description = "В пропертях хранятся только признаки наличия фичи, т.е. является ли вакансия рекламной, анонимной и т.д")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2025-08-17T15:41:09.394389505+05:00[Asia/Yekaterinburg]", comments = "Generator version: 7.6.0")
public class VacancyDraftVacancyProperties {

  private VacancyVacancyPropertiesAppearance appearance;

  private String id;

  @Valid
  private List<@Valid VacancyDraftVacancyPropertiesPropertiesInner> properties = new ArrayList<>();

  public VacancyDraftVacancyProperties appearance(VacancyVacancyPropertiesAppearance appearance) {
    this.appearance = appearance;
    return this;
  }

  /**
   * Get appearance
   * @return appearance
  */
  @Valid 
  @Schema(name = "appearance", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("appearance")
  public VacancyVacancyPropertiesAppearance getAppearance() {
    return appearance;
  }

  public void setAppearance(VacancyVacancyPropertiesAppearance appearance) {
    this.appearance = appearance;
  }

  public VacancyDraftVacancyProperties id(String id) {
    this.id = id;
    return this;
  }

  /**
   * Идентификатор активн(ой/ых) проперти
   * @return id
  */
  
  @Schema(name = "id", example = "HH_STANDARD-HH_ANONYMOUS", description = "Идентификатор активн(ой/ых) проперти", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("id")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public VacancyDraftVacancyProperties properties(List<@Valid VacancyDraftVacancyPropertiesPropertiesInner> properties) {
    this.properties = properties;
    return this;
  }

  public VacancyDraftVacancyProperties addPropertiesItem(VacancyDraftVacancyPropertiesPropertiesInner propertiesItem) {
    if (this.properties == null) {
      this.properties = new ArrayList<>();
    }
    this.properties.add(propertiesItem);
    return this;
  }

  /**
   * Список активн(ой/ых) проперти
   * @return properties
  */
  @Valid 
  @Schema(name = "properties", description = "Список активн(ой/ых) проперти", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("properties")
  public List<@Valid VacancyDraftVacancyPropertiesPropertiesInner> getProperties() {
    return properties;
  }

  public void setProperties(List<@Valid VacancyDraftVacancyPropertiesPropertiesInner> properties) {
    this.properties = properties;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    VacancyDraftVacancyProperties vacancyDraftVacancyProperties = (VacancyDraftVacancyProperties) o;
    return Objects.equals(this.appearance, vacancyDraftVacancyProperties.appearance) &&
        Objects.equals(this.id, vacancyDraftVacancyProperties.id) &&
        Objects.equals(this.properties, vacancyDraftVacancyProperties.properties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(appearance, id, properties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class VacancyDraftVacancyProperties {\n");
    sb.append("    appearance: ").append(toIndentedString(appearance)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    properties: ").append(toIndentedString(properties)).append("\n");
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

