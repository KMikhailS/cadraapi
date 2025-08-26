package ru.brobrocode.cadra.client.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.annotation.Generated;
import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;

import java.util.Objects;

/**
 * WebhookActionNegotiationEmployerStateChange
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2025-08-17T15:41:09.394389505+05:00[Asia/Yekaterinburg]", comments = "Generator version: 7.6.0")
public class WebhookActionNegotiationEmployerStateChange {

  private WebhookActionVacancyOnlyMineSettings settings = null;

  /**
   * Перемещение резюме кандидата на другой этап вакансии.  Содержит следующую информацию:  * кто переместил резюме;  * идентификатор резюме; * исходный статус резюме;  * новый статус резюме 
   */
  public enum TypeEnum {
    NEGOTIATION_EMPLOYER_STATE_CHANGE("NEGOTIATION_EMPLOYER_STATE_CHANGE");

    private String value;

    TypeEnum(String value) {
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
    public static TypeEnum fromValue(String value) {
      for (TypeEnum b : TypeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  private TypeEnum type;

  public WebhookActionNegotiationEmployerStateChange() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public WebhookActionNegotiationEmployerStateChange(TypeEnum type) {
    this.type = type;
  }

  public WebhookActionNegotiationEmployerStateChange settings(WebhookActionVacancyOnlyMineSettings settings) {
    this.settings = settings;
    return this;
  }

  /**
   * Get settings
   * @return settings
  */
  @Valid 
  @Schema(name = "settings", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("settings")
  public WebhookActionVacancyOnlyMineSettings getSettings() {
    return settings;
  }

  public void setSettings(WebhookActionVacancyOnlyMineSettings settings) {
    this.settings = settings;
  }

  public WebhookActionNegotiationEmployerStateChange type(TypeEnum type) {
    this.type = type;
    return this;
  }

  /**
   * Перемещение резюме кандидата на другой этап вакансии.  Содержит следующую информацию:  * кто переместил резюме;  * идентификатор резюме; * исходный статус резюме;  * новый статус резюме 
   * @return type
  */
  @NotNull 
  @Schema(name = "type", description = "Перемещение резюме кандидата на другой этап вакансии.  Содержит следующую информацию:  * кто переместил резюме;  * идентификатор резюме; * исходный статус резюме;  * новый статус резюме ", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("type")
  public TypeEnum getType() {
    return type;
  }

  public void setType(TypeEnum type) {
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
    WebhookActionNegotiationEmployerStateChange webhookActionNegotiationEmployerStateChange = (WebhookActionNegotiationEmployerStateChange) o;
    return Objects.equals(this.settings, webhookActionNegotiationEmployerStateChange.settings) &&
        Objects.equals(this.type, webhookActionNegotiationEmployerStateChange.type);
  }

  @Override
  public int hashCode() {
    return Objects.hash(settings, type);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class WebhookActionNegotiationEmployerStateChange {\n");
    sb.append("    settings: ").append(toIndentedString(settings)).append("\n");
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

