package ru.brobrocode.cadra.client.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.annotation.Generated;
import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;

import java.util.Objects;

/**
 * ArtifactsArtifactItem
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2025-08-17T15:41:09.394389505+05:00[Asia/Yekaterinburg]", comments = "Generator version: 7.6.0")
public class ArtifactsArtifactItem {

  private String id;

  private String medium = null;

  private String small = null;

  private ArtifactsState state;

  public ArtifactsArtifactItem() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public ArtifactsArtifactItem(String id, ArtifactsState state) {
    this.id = id;
    this.state = state;
  }

  public ArtifactsArtifactItem id(String id) {
    this.id = id;
    return this;
  }

  /**
   * Идентификатор изображения
   * @return id
  */
  @NotNull 
  @Schema(name = "id", description = "Идентификатор изображения", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("id")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public ArtifactsArtifactItem medium(String medium) {
    this.medium = medium;
    return this;
  }

  /**
   * URL для получения среднего по размеру изображения или `null`, если изображение ещё не готово
   * @return medium
  */
  
  @Schema(name = "medium", description = "URL для получения среднего по размеру изображения или `null`, если изображение ещё не готово", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("medium")
  public String getMedium() {
    return medium;
  }

  public void setMedium(String medium) {
    this.medium = medium;
  }

  public ArtifactsArtifactItem small(String small) {
    this.small = small;
    return this;
  }

  /**
   * URL для получения уменьшенного изображения или `null`, если изображение ещё не готово
   * @return small
  */
  
  @Schema(name = "small", description = "URL для получения уменьшенного изображения или `null`, если изображение ещё не готово", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("small")
  public String getSmall() {
    return small;
  }

  public void setSmall(String small) {
    this.small = small;
  }

  public ArtifactsArtifactItem state(ArtifactsState state) {
    this.state = state;
    return this;
  }

  /**
   * Get state
   * @return state
  */
  @NotNull @Valid 
  @Schema(name = "state", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("state")
  public ArtifactsState getState() {
    return state;
  }

  public void setState(ArtifactsState state) {
    this.state = state;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ArtifactsArtifactItem artifactsArtifactItem = (ArtifactsArtifactItem) o;
    return Objects.equals(this.id, artifactsArtifactItem.id) &&
        Objects.equals(this.medium, artifactsArtifactItem.medium) &&
        Objects.equals(this.small, artifactsArtifactItem.small) &&
        Objects.equals(this.state, artifactsArtifactItem.state);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, medium, small, state);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ArtifactsArtifactItem {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    medium: ").append(toIndentedString(medium)).append("\n");
    sb.append("    small: ").append(toIndentedString(small)).append("\n");
    sb.append("    state: ").append(toIndentedString(state)).append("\n");
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

