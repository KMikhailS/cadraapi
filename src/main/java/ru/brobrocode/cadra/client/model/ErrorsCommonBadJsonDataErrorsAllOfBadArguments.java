package ru.brobrocode.cadra.client.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.annotation.Generated;

import java.util.Objects;

/**
 * ErrorsCommonBadJsonDataErrorsAllOfBadArguments
 */

@JsonTypeName("ErrorsCommonBadJsonDataErrors_allOf_bad_arguments")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2025-08-17T15:41:09.394389505+05:00[Asia/Yekaterinburg]", comments = "Generator version: 7.6.0")
public class ErrorsCommonBadJsonDataErrorsAllOfBadArguments {

  private String description;

  private String name;

  public ErrorsCommonBadJsonDataErrorsAllOfBadArguments description(String description) {
    this.description = description;
    return this;
  }

  /**
   * Get description
   * @return description
  */
  
  @Schema(name = "description", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("description")
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public ErrorsCommonBadJsonDataErrorsAllOfBadArguments name(String name) {
    this.name = name;
    return this;
  }

  /**
   * Поле, в котором допущена ошибка
   * @return name
  */
  
  @Schema(name = "name", description = "Поле, в котором допущена ошибка", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
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
    ErrorsCommonBadJsonDataErrorsAllOfBadArguments errorsCommonBadJsonDataErrorsAllOfBadArguments = (ErrorsCommonBadJsonDataErrorsAllOfBadArguments) o;
    return Objects.equals(this.description, errorsCommonBadJsonDataErrorsAllOfBadArguments.description) &&
        Objects.equals(this.name, errorsCommonBadJsonDataErrorsAllOfBadArguments.name);
  }

  @Override
  public int hashCode() {
    return Objects.hash(description, name);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ErrorsCommonBadJsonDataErrorsAllOfBadArguments {\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
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

