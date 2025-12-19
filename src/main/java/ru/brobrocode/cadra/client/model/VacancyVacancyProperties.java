package ru.brobrocode.cadra.client.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.annotation.Generated;
import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * VacancyVacancyProperties
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2025-08-17T15:41:09.394389505+05:00[Asia/Yekaterinburg]", comments = "Generator version: 7.6.0")
public class VacancyVacancyProperties {

  private VacancyVacancyPropertiesAppearance appearance;

  @Valid
  private List<@Valid VacancyVacancyPropertiesPropertiesInner> properties = new ArrayList<>();

  public VacancyVacancyProperties() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public VacancyVacancyProperties(List<@Valid VacancyVacancyPropertiesPropertiesInner> properties) {
    this.properties = properties;
  }

  public VacancyVacancyProperties appearance(VacancyVacancyPropertiesAppearance appearance) {
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

  public VacancyVacancyProperties properties(List<@Valid VacancyVacancyPropertiesPropertiesInner> properties) {
    this.properties = properties;
    return this;
  }

  public VacancyVacancyProperties addPropertiesItem(VacancyVacancyPropertiesPropertiesInner propertiesItem) {
    if (this.properties == null) {
      this.properties = new ArrayList<>();
    }
    this.properties.add(propertiesItem);
    return this;
  }

  /**
   * Свойства вакансии. Доступны только менеджерам работодателя-владельца вакансии 
   * @return properties
  */
  @NotNull @Valid 
  @Schema(name = "properties", description = "Свойства вакансии. Доступны только менеджерам работодателя-владельца вакансии ", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("properties")
  public List<@Valid VacancyVacancyPropertiesPropertiesInner> getProperties() {
    return properties;
  }

  public void setProperties(List<@Valid VacancyVacancyPropertiesPropertiesInner> properties) {
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
    VacancyVacancyProperties vacancyVacancyProperties = (VacancyVacancyProperties) o;
    return Objects.equals(this.appearance, vacancyVacancyProperties.appearance) &&
        Objects.equals(this.properties, vacancyVacancyProperties.properties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(appearance, properties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class VacancyVacancyProperties {\n");
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

