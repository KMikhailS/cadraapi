package ru.brobrocode.cadra.client.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.annotation.Generated;
import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;

import java.math.BigDecimal;
import java.util.Objects;

/**
 * Условия для поля &#x60;description&#x60;
 */

@Schema(name = "ArtifactsFields_description", description = "Условия для поля `description`")
@JsonTypeName("ArtifactsFields_description")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2025-08-17T15:41:09.394389505+05:00[Asia/Yekaterinburg]", comments = "Generator version: 7.6.0")
public class ArtifactsFieldsDescription {

  private BigDecimal maxLength;

  private BigDecimal minLength;

  private Boolean required;

  public ArtifactsFieldsDescription() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public ArtifactsFieldsDescription(BigDecimal maxLength, BigDecimal minLength, Boolean required) {
    this.maxLength = maxLength;
    this.minLength = minLength;
    this.required = required;
  }

  public ArtifactsFieldsDescription maxLength(BigDecimal maxLength) {
    this.maxLength = maxLength;
    return this;
  }

  /**
   * Максимальный размер текстового поля `description`
   * @return maxLength
  */
  @NotNull @Valid 
  @Schema(name = "max_length", description = "Максимальный размер текстового поля `description`", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("max_length")
  public BigDecimal getMaxLength() {
    return maxLength;
  }

  public void setMaxLength(BigDecimal maxLength) {
    this.maxLength = maxLength;
  }

  public ArtifactsFieldsDescription minLength(BigDecimal minLength) {
    this.minLength = minLength;
    return this;
  }

  /**
   * Минимальный размер текстового поля `description`
   * @return minLength
  */
  @NotNull @Valid 
  @Schema(name = "min_length", description = "Минимальный размер текстового поля `description`", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("min_length")
  public BigDecimal getMinLength() {
    return minLength;
  }

  public void setMinLength(BigDecimal minLength) {
    this.minLength = minLength;
  }

  public ArtifactsFieldsDescription required(Boolean required) {
    this.required = required;
    return this;
  }

  /**
   * Является ли поле `description` обязательным
   * @return required
  */
  @NotNull 
  @Schema(name = "required", description = "Является ли поле `description` обязательным", requiredMode = Schema.RequiredMode.REQUIRED)
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
    ArtifactsFieldsDescription artifactsFieldsDescription = (ArtifactsFieldsDescription) o;
    return Objects.equals(this.maxLength, artifactsFieldsDescription.maxLength) &&
        Objects.equals(this.minLength, artifactsFieldsDescription.minLength) &&
        Objects.equals(this.required, artifactsFieldsDescription.required);
  }

  @Override
  public int hashCode() {
    return Objects.hash(maxLength, minLength, required);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ArtifactsFieldsDescription {\n");
    sb.append("    maxLength: ").append(toIndentedString(maxLength)).append("\n");
    sb.append("    minLength: ").append(toIndentedString(minLength)).append("\n");
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

