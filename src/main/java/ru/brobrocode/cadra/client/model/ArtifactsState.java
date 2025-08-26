package ru.brobrocode.cadra.client.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.annotation.Generated;
import jakarta.validation.constraints.NotNull;

import java.util.Objects;

/**
 * ArtifactsState
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2025-08-17T15:41:09.394389505+05:00[Asia/Yekaterinburg]", comments = "Generator version: 7.6.0")
public class ArtifactsState {

  /**
   * Идентификатор текущего статуса изображения:  - `processing` — в процессе обработки; - `failed` — ошибка, скорее всего неподдерживаемый формат; - `ok` — обработан, доступен для использования в резюме 
   */
  public enum IdEnum {
    PROCESSING("processing"),
    
    FAILED("failed"),
    
    OK("ok");

    private String value;

    IdEnum(String value) {
      this.value = value;
    }

    @JsonValue
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static IdEnum fromValue(String value) {
      for (IdEnum b : IdEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  private IdEnum id;

  private String name;

  public ArtifactsState() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public ArtifactsState(IdEnum id, String name) {
    this.id = id;
    this.name = name;
  }

  public ArtifactsState id(IdEnum id) {
    this.id = id;
    return this;
  }

  /**
   * Идентификатор текущего статуса изображения:  - `processing` — в процессе обработки; - `failed` — ошибка, скорее всего неподдерживаемый формат; - `ok` — обработан, доступен для использования в резюме 
   * @return id
  */
  @NotNull 
  @Schema(name = "id", description = "Идентификатор текущего статуса изображения:  - `processing` — в процессе обработки; - `failed` — ошибка, скорее всего неподдерживаемый формат; - `ok` — обработан, доступен для использования в резюме ", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("id")
  public IdEnum getId() {
    return id;
  }

  public void setId(IdEnum id) {
    this.id = id;
  }

  public ArtifactsState name(String name) {
    this.name = name;
    return this;
  }

  /**
   * Название текущего статуса изображения
   * @return name
  */
  @NotNull 
  @Schema(name = "name", description = "Название текущего статуса изображения", requiredMode = Schema.RequiredMode.REQUIRED)
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
    ArtifactsState artifactsState = (ArtifactsState) o;
    return Objects.equals(this.id, artifactsState.id) &&
        Objects.equals(this.name, artifactsState.name);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ArtifactsState {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
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

