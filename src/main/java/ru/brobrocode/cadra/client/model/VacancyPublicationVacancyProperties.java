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

@Schema(name = "VacancyPublicationVacancyProperties", description = "В пропертях хранятся только признаки наличия фичи, т.е. является ли вакансия рекламной, анонимной и т.д")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2025-08-17T15:41:09.394389505+05:00[Asia/Yekaterinburg]", comments = "Generator version: 7.6.0")
public class VacancyPublicationVacancyProperties {

  private VacancyVacancyPropertiesAppearance appearance;

  @Valid
  private List<@Valid VacancyPublicationVacancyPropertiesPropertiesInner> properties = new ArrayList<>();

  public VacancyPublicationVacancyProperties appearance(VacancyVacancyPropertiesAppearance appearance) {
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

  public VacancyPublicationVacancyProperties properties(List<@Valid VacancyPublicationVacancyPropertiesPropertiesInner> properties) {
    this.properties = properties;
    return this;
  }

  public VacancyPublicationVacancyProperties addPropertiesItem(VacancyPublicationVacancyPropertiesPropertiesInner propertiesItem) {
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
  public List<@Valid VacancyPublicationVacancyPropertiesPropertiesInner> getProperties() {
    return properties;
  }

  public void setProperties(List<@Valid VacancyPublicationVacancyPropertiesPropertiesInner> properties) {
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
    VacancyPublicationVacancyProperties vacancyPublicationVacancyProperties = (VacancyPublicationVacancyProperties) o;
    return Objects.equals(this.appearance, vacancyPublicationVacancyProperties.appearance) &&
        Objects.equals(this.properties, vacancyPublicationVacancyProperties.properties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(appearance, properties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class VacancyPublicationVacancyProperties {\n");
    sb.append("    appearance: ").append(toIndentedString(appearance)).append("\n");
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

