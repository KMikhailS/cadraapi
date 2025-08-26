package ru.brobrocode.cadra.client.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.annotation.Generated;
import jakarta.validation.constraints.NotNull;

import java.util.Objects;

/**
 * ResumeObjectsPortfolio
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2025-08-17T15:41:09.394389505+05:00[Asia/Yekaterinburg]", comments = "Generator version: 7.6.0")
public class ResumeObjectsPortfolio {

  private String description = null;

  private String id;

  private String medium;

  private String small;

  public ResumeObjectsPortfolio() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public ResumeObjectsPortfolio(String id, String medium, String small) {
    this.id = id;
    this.medium = medium;
    this.small = small;
  }

  public ResumeObjectsPortfolio description(String description) {
    this.description = description;
    return this;
  }

  /**
   * Описание изображения в портфолио
   * @return description
  */
  
  @Schema(name = "description", description = "Описание изображения в портфолио", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("description")
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public ResumeObjectsPortfolio id(String id) {
    this.id = id;
    return this;
  }

  /**
   * Уникальный идентификатор изображения
   * @return id
  */
  @NotNull 
  @Schema(name = "id", description = "Уникальный идентификатор изображения", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("id")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public ResumeObjectsPortfolio medium(String medium) {
    this.medium = medium;
    return this;
  }

  /**
   * URL среднего по размеру изображения. Изображение по данному url доступно ограниченное время, после получения ответа. Приложение должно быть готово к тому, что на запрос изображения вернётся `404 Not Found` 
   * @return medium
  */
  @NotNull 
  @Schema(name = "medium", description = "URL среднего по размеру изображения. Изображение по данному url доступно ограниченное время, после получения ответа. Приложение должно быть готово к тому, что на запрос изображения вернётся `404 Not Found` ", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("medium")
  public String getMedium() {
    return medium;
  }

  public void setMedium(String medium) {
    this.medium = medium;
  }

  public ResumeObjectsPortfolio small(String small) {
    this.small = small;
    return this;
  }

  /**
   * URL уменьшенного изображения. Изображение по данному url доступно ограниченное время, после получения ответа. Приложение должно быть готово к тому, что на запрос изображения вернётся `404 Not Found` 
   * @return small
  */
  @NotNull 
  @Schema(name = "small", description = "URL уменьшенного изображения. Изображение по данному url доступно ограниченное время, после получения ответа. Приложение должно быть готово к тому, что на запрос изображения вернётся `404 Not Found` ", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("small")
  public String getSmall() {
    return small;
  }

  public void setSmall(String small) {
    this.small = small;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ResumeObjectsPortfolio resumeObjectsPortfolio = (ResumeObjectsPortfolio) o;
    return Objects.equals(this.description, resumeObjectsPortfolio.description) &&
        Objects.equals(this.id, resumeObjectsPortfolio.id) &&
        Objects.equals(this.medium, resumeObjectsPortfolio.medium) &&
        Objects.equals(this.small, resumeObjectsPortfolio.small);
  }

  @Override
  public int hashCode() {
    return Objects.hash(description, id, medium, small);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ResumeObjectsPortfolio {\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    medium: ").append(toIndentedString(medium)).append("\n");
    sb.append("    small: ").append(toIndentedString(small)).append("\n");
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

