package ru.brobrocode.cadra.client.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.annotation.Generated;
import jakarta.validation.constraints.NotNull;

import java.util.Objects;

/**
 * ArtifactsPortfolioDescription
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2025-08-17T15:41:09.394389505+05:00[Asia/Yekaterinburg]", comments = "Generator version: 7.6.0")
public class ArtifactsPortfolioDescription {

  private String description;

  public ArtifactsPortfolioDescription() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public ArtifactsPortfolioDescription(String description) {
    this.description = description;
  }

  public ArtifactsPortfolioDescription description(String description) {
    this.description = description;
    return this;
  }

  /**
   * Описание изображения
   * @return description
  */
  @NotNull 
  @Schema(name = "description", description = "Описание изображения", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("description")
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ArtifactsPortfolioDescription artifactsPortfolioDescription = (ArtifactsPortfolioDescription) o;
    return Objects.equals(this.description, artifactsPortfolioDescription.description);
  }

  @Override
  public int hashCode() {
    return Objects.hash(description);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ArtifactsPortfolioDescription {\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
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

