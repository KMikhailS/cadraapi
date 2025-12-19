package ru.brobrocode.cadra.client.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.annotation.Generated;
import jakarta.validation.constraints.NotNull;

import java.util.Objects;

/**
 * В зависимости от состояния инструмента оценки, конкретные действия над ним могут быть доступны либо нет 
 */

@Schema(name = "NegotiationsAction", description = "В зависимости от состояния инструмента оценки, конкретные действия над ним могут быть доступны либо нет ")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2025-08-17T15:41:09.394389505+05:00[Asia/Yekaterinburg]", comments = "Generator version: 7.6.0")
public class NegotiationsAction {

  private String alternateUrl;

  private String disableReason;

  private Boolean enabled;

  private String id;

  private String name;

  public NegotiationsAction() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public NegotiationsAction(Boolean enabled, String id, String name) {
    this.enabled = enabled;
    this.id = id;
    this.name = name;
  }

  public NegotiationsAction alternateUrl(String alternateUrl) {
    this.alternateUrl = alternateUrl;
    return this;
  }

  /**
   * Ссылка на сайт, переход по которой инициирует действие
   * @return alternateUrl
  */
  
  @Schema(name = "alternate_url", description = "Ссылка на сайт, переход по которой инициирует действие", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("alternate_url")
  public String getAlternateUrl() {
    return alternateUrl;
  }

  public void setAlternateUrl(String alternateUrl) {
    this.alternateUrl = alternateUrl;
  }

  public NegotiationsAction disableReason(String disableReason) {
    this.disableReason = disableReason;
    return this;
  }

  /**
   * Пояснение, почему действие недоступно
   * @return disableReason
  */
  
  @Schema(name = "disable_reason", description = "Пояснение, почему действие недоступно", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("disable_reason")
  public String getDisableReason() {
    return disableReason;
  }

  public void setDisableReason(String disableReason) {
    this.disableReason = disableReason;
  }

  public NegotiationsAction enabled(Boolean enabled) {
    this.enabled = enabled;
    return this;
  }

  /**
   * Доступно ли действие
   * @return enabled
  */
  @NotNull 
  @Schema(name = "enabled", description = "Доступно ли действие", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("enabled")
  public Boolean getEnabled() {
    return enabled;
  }

  public void setEnabled(Boolean enabled) {
    this.enabled = enabled;
  }

  public NegotiationsAction id(String id) {
    this.id = id;
    return this;
  }

  /**
   * Тип действия
   * @return id
  */
  @NotNull 
  @Schema(name = "id", description = "Тип действия", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("id")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public NegotiationsAction name(String name) {
    this.name = name;
    return this;
  }

  /**
   * Описание действия
   * @return name
  */
  @NotNull 
  @Schema(name = "name", description = "Описание действия", requiredMode = Schema.RequiredMode.REQUIRED)
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
    NegotiationsAction negotiationsAction = (NegotiationsAction) o;
    return Objects.equals(this.alternateUrl, negotiationsAction.alternateUrl) &&
        Objects.equals(this.disableReason, negotiationsAction.disableReason) &&
        Objects.equals(this.enabled, negotiationsAction.enabled) &&
        Objects.equals(this.id, negotiationsAction.id) &&
        Objects.equals(this.name, negotiationsAction.name);
  }

  @Override
  public int hashCode() {
    return Objects.hash(alternateUrl, disableReason, enabled, id, name);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class NegotiationsAction {\n");
    sb.append("    alternateUrl: ").append(toIndentedString(alternateUrl)).append("\n");
    sb.append("    disableReason: ").append(toIndentedString(disableReason)).append("\n");
    sb.append("    enabled: ").append(toIndentedString(enabled)).append("\n");
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

