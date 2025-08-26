package ru.brobrocode.cadra.client.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.annotation.Generated;
import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;

import java.util.Objects;

/**
 * EmployersBrandingConstructor
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2025-08-17T15:41:09.394389505+05:00[Asia/Yekaterinburg]", comments = "Generator version: 7.6.0")
public class EmployersBrandingConstructor implements EmployersBrandingBrandParameters {

  private EmployersBrandingConstructorConstructor constructor;

  public EmployersBrandingConstructor() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public EmployersBrandingConstructor(EmployersBrandingConstructorConstructor constructor) {
    this.constructor = constructor;
  }

  public EmployersBrandingConstructor constructor(EmployersBrandingConstructorConstructor constructor) {
    this.constructor = constructor;
    return this;
  }

  /**
   * Get constructor
   * @return constructor
  */
  @NotNull @Valid 
  @Schema(name = "constructor", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("constructor")
  public EmployersBrandingConstructorConstructor getConstructor() {
    return constructor;
  }

  public void setConstructor(EmployersBrandingConstructorConstructor constructor) {
    this.constructor = constructor;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EmployersBrandingConstructor employersBrandingConstructor = (EmployersBrandingConstructor) o;
    return Objects.equals(this.constructor, employersBrandingConstructor.constructor);
  }

  @Override
  public int hashCode() {
    return Objects.hash(constructor);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EmployersBrandingConstructor {\n");
    sb.append("    constructor: ").append(toIndentedString(constructor)).append("\n");
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

