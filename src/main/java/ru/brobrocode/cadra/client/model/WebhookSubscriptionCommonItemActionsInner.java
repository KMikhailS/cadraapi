package ru.brobrocode.cadra.client.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.annotation.Generated;
import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;

import java.util.Objects;

/**
 * WebhookSubscriptionCommonItemActionsInner
 */

@JsonTypeName("WebhookSubscriptionCommonItem_actions_inner")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2025-08-17T15:41:09.394389505+05:00[Asia/Yekaterinburg]", comments = "Generator version: 7.6.0")
public class WebhookSubscriptionCommonItemActionsInner {

  private WebhookActionVacancyOnlyMineSettings settings = null;

  /**
   * Новый отклик на вакансию. Данное событие будет вызываться только на отклик со стороны соискателя
   */
  public enum TypeEnum {
    NEW_NEGOTIATION_VACANCY("NEW_NEGOTIATION_VACANCY"),
    
    NEW_RESPONSE_OR_INVITATION_VACANCY("NEW_RESPONSE_OR_INVITATION_VACANCY"),
    
    VACANCY_ARCHIVATION("VACANCY_ARCHIVATION"),
    
    VACANCY_CHANGE("VACANCY_CHANGE"),
    
    VACANCY_PROLONGATION("VACANCY_PROLONGATION"),
    
    VACANCY_PUBLICATION_FOR_VACANCY_MANAGER("VACANCY_PUBLICATION_FOR_VACANCY_MANAGER"),
    
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

  public WebhookSubscriptionCommonItemActionsInner() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public WebhookSubscriptionCommonItemActionsInner(TypeEnum type) {
    this.type = type;
  }

  public WebhookSubscriptionCommonItemActionsInner settings(WebhookActionVacancyOnlyMineSettings settings) {
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

  public WebhookSubscriptionCommonItemActionsInner type(TypeEnum type) {
    this.type = type;
    return this;
  }

  /**
   * Новый отклик на вакансию. Данное событие будет вызываться только на отклик со стороны соискателя
   * @return type
  */
  @NotNull 
  @Schema(name = "type", description = "Новый отклик на вакансию. Данное событие будет вызываться только на отклик со стороны соискателя", requiredMode = Schema.RequiredMode.REQUIRED)
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
    WebhookSubscriptionCommonItemActionsInner webhookSubscriptionCommonItemActionsInner = (WebhookSubscriptionCommonItemActionsInner) o;
    return Objects.equals(this.settings, webhookSubscriptionCommonItemActionsInner.settings) &&
        Objects.equals(this.type, webhookSubscriptionCommonItemActionsInner.type);
  }

  @Override
  public int hashCode() {
    return Objects.hash(settings, type);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class WebhookSubscriptionCommonItemActionsInner {\n");
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

