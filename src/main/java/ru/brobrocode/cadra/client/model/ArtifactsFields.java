package ru.brobrocode.cadra.client.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.annotation.Generated;
import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;

import java.util.Objects;

/**
 * ArtifactsFields
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2025-08-17T15:41:09.394389505+05:00[Asia/Yekaterinburg]", comments = "Generator version: 7.6.0")
public class ArtifactsFields {

  private ArtifactsFieldsDescription description;

  private ArtifactsFieldsFile file;

  private ArtifactsFieldsType type;

  public ArtifactsFields() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public ArtifactsFields(ArtifactsFieldsDescription description, ArtifactsFieldsFile file, ArtifactsFieldsType type) {
    this.description = description;
    this.file = file;
    this.type = type;
  }

  public ArtifactsFields description(ArtifactsFieldsDescription description) {
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

  public ArtifactsFields file(ArtifactsFieldsFile file) {
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

  public ArtifactsFields type(ArtifactsFieldsType type) {
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
    ArtifactsFields artifactsFields = (ArtifactsFields) o;
    return Objects.equals(this.description, artifactsFields.description) &&
        Objects.equals(this.file, artifactsFields.file) &&
        Objects.equals(this.type, artifactsFields.type);
  }

  @Override
  public int hashCode() {
    return Objects.hash(description, file, type);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ArtifactsFields {\n");
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

