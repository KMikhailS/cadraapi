package ru.brobrocode.cadra.client.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.annotation.Generated;
import jakarta.validation.constraints.NotNull;

import java.util.Objects;

/**
 * ProfileFieldsOtherCommunicationMethod
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2025-08-17T15:41:09.394389505+05:00[Asia/Yekaterinburg]", comments = "Generator version: 7.6.0")
public class ProfileFieldsOtherCommunicationMethod {

  private String description = null;

  private String value;

  public ProfileFieldsOtherCommunicationMethod() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public ProfileFieldsOtherCommunicationMethod(String value) {
    this.value = value;
  }

  public ProfileFieldsOtherCommunicationMethod description(String description) {
    this.description = description;
    return this;
  }

  /**
   * Описание
   * @return description
  */
  
  @Schema(name = "description", description = "Описание", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("description")
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public ProfileFieldsOtherCommunicationMethod value(String value) {
    this.value = value;
    return this;
  }

  /**
   * Значение (url, id в соцсети, телефон и тп)
   * @return value
  */
  @NotNull 
  @Schema(name = "value", description = "Значение (url, id в соцсети, телефон и тп)", requiredMode = Schema.RequiredMode.REQUIRED)
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
    ProfileFieldsOtherCommunicationMethod profileFieldsOtherCommunicationMethod = (ProfileFieldsOtherCommunicationMethod) o;
    return Objects.equals(this.description, profileFieldsOtherCommunicationMethod.description) &&
        Objects.equals(this.value, profileFieldsOtherCommunicationMethod.value);
  }

  @Override
  public int hashCode() {
    return Objects.hash(description, value);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ProfileFieldsOtherCommunicationMethod {\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
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

