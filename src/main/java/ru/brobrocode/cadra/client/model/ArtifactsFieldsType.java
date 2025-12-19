package ru.brobrocode.cadra.client.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.annotation.Generated;
import jakarta.validation.constraints.NotNull;

import java.util.Objects;

/**
 * Условия для поля &#x60;type&#x60;
 */

@Schema(name = "ArtifactsFields_type", description = "Условия для поля `type`")
@JsonTypeName("ArtifactsFields_type")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2025-08-17T15:41:09.394389505+05:00[Asia/Yekaterinburg]", comments = "Generator version: 7.6.0")
public class ArtifactsFieldsType {

  private Boolean required;

  public ArtifactsFieldsType() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public ArtifactsFieldsType(Boolean required) {
    this.required = required;
  }

  public ArtifactsFieldsType required(Boolean required) {
    this.required = required;
    return this;
  }

  /**
   * Является ли поле `type` обязательным
   * @return required
  */
  @NotNull 
  @Schema(name = "required", description = "Является ли поле `type` обязательным", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("required")
  public Boolean getRequired() {
    return required;
  }

  public void setRequired(Boolean required) {
    this.required = required;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ArtifactsFieldsType artifactsFieldsType = (ArtifactsFieldsType) o;
    return Objects.equals(this.required, artifactsFieldsType.required);
  }

  @Override
  public int hashCode() {
    return Objects.hash(required);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ArtifactsFieldsType {\n");
    sb.append("    required: ").append(toIndentedString(required)).append("\n");
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

