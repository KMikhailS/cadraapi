package ru.brobrocode.cadra.client.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.annotation.Generated;
import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;

import java.util.Objects;

/**
 * Условия для полей артефакта
 */

@Schema(name = "ArtifactsArtifactConditions_fields", description = "Условия для полей артефакта")
@JsonTypeName("ArtifactsArtifactConditions_fields")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2025-08-17T15:41:09.394389505+05:00[Asia/Yekaterinburg]", comments = "Generator version: 7.6.0")
public class ArtifactsArtifactConditionsFields {

  private ArtifactsFieldsDescription description;

  private ArtifactsFieldsFile file;

  private ArtifactsFieldsType type;

  public ArtifactsArtifactConditionsFields() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public ArtifactsArtifactConditionsFields(ArtifactsFieldsDescription description, ArtifactsFieldsFile file, ArtifactsFieldsType type) {
    this.description = description;
    this.file = file;
    this.type = type;
  }

  public ArtifactsArtifactConditionsFields description(ArtifactsFieldsDescription description) {
    this.description = description;
    return this;
  }

  /**
   * Get description
   * @return description
  */
  @NotNull @Valid 
  @Schema(name = "description", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("description")
  public ArtifactsFieldsDescription getDescription() {
    return description;
  }

  public void setDescription(ArtifactsFieldsDescription description) {
    this.description = description;
  }

  public ArtifactsArtifactConditionsFields file(ArtifactsFieldsFile file) {
    this.file = file;
    return this;
  }

  /**
   * Get file
   * @return file
  */
  @NotNull @Valid 
  @Schema(name = "file", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("file")
  public ArtifactsFieldsFile getFile() {
    return file;
  }

  public void setFile(ArtifactsFieldsFile file) {
    this.file = file;
  }

  public ArtifactsArtifactConditionsFields type(ArtifactsFieldsType type) {
    this.type = type;
    return this;
  }

  /**
   * Get type
   * @return type
  */
  @NotNull @Valid 
  @Schema(name = "type", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("type")
  public ArtifactsFieldsType getType() {
    return type;
  }

  public void setType(ArtifactsFieldsType type) {
    this.type = type;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ArtifactsArtifactConditionsFields artifactsArtifactConditionsFields = (ArtifactsArtifactConditionsFields) o;
    return Objects.equals(this.description, artifactsArtifactConditionsFields.description) &&
        Objects.equals(this.file, artifactsArtifactConditionsFields.file) &&
        Objects.equals(this.type, artifactsArtifactConditionsFields.type);
  }

  @Override
  public int hashCode() {
    return Objects.hash(description, file, type);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ArtifactsArtifactConditionsFields {\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    file: ").append(toIndentedString(file)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
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

