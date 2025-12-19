package ru.brobrocode.cadra.client.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.annotation.Generated;

import java.util.Objects;

/**
 * VacancyVacancyPropertiesPropertiesInnerParametersInner
 */

@JsonTypeName("VacancyVacancyProperties_properties_inner_parameters_inner")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2025-08-17T15:41:09.394389505+05:00[Asia/Yekaterinburg]", comments = "Generator version: 7.6.0")
public class VacancyVacancyPropertiesPropertiesInnerParametersInner {

  private String key;

  private String value;

  public VacancyVacancyPropertiesPropertiesInnerParametersInner key(String key) {
    this.key = key;
    return this;
  }

  /**
   * Имя параметра
   * @return key
  */
  
  @Schema(name = "key", description = "Имя параметра", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("key")
  public String getKey() {
    return key;
  }

  public void setKey(String key) {
    this.key = key;
  }

  public VacancyVacancyPropertiesPropertiesInnerParametersInner value(String value) {
    this.value = value;
    return this;
  }

  /**
   * Значение параметра
   * @return value
  */
  
  @Schema(name = "value", description = "Значение параметра", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("value")
  public String getValue() {
    return value;
  }

  public void setValue(String value) {
    this.value = value;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    VacancyVacancyPropertiesPropertiesInnerParametersInner vacancyVacancyPropertiesPropertiesInnerParametersInner = (VacancyVacancyPropertiesPropertiesInnerParametersInner) o;
    return Objects.equals(this.key, vacancyVacancyPropertiesPropertiesInnerParametersInner.key) &&
        Objects.equals(this.value, vacancyVacancyPropertiesPropertiesInnerParametersInner.value);
  }

  @Override
  public int hashCode() {
    return Objects.hash(key, value);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class VacancyVacancyPropertiesPropertiesInnerParametersInner {\n");
    sb.append("    key: ").append(toIndentedString(key)).append("\n");
    sb.append("    value: ").append(toIndentedString(value)).append("\n");
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

