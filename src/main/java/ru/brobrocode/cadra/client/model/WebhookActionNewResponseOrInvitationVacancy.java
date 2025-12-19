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
 * WebhookActionNewResponseOrInvitationVacancy
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2025-08-17T15:41:09.394389505+05:00[Asia/Yekaterinburg]", comments = "Generator version: 7.6.0")
public class WebhookActionNewResponseOrInvitationVacancy {

  private WebhookActionVacancyOnlyMineSettings settings = null;

  /**
   * Новый отклик или приглашение на вакансию. Данное событие будет вызываться как на отклик со стороны соискателя, так и на приглашение со стороны работодателя
   */
  public enum TypeEnum {
    NEW_RESPONSE_OR_INVITATION_VACANCY("NEW_RESPONSE_OR_INVITATION_VACANCY");

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

  public WebhookActionNewResponseOrInvitationVacancy() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public WebhookActionNewResponseOrInvitationVacancy(TypeEnum type) {
    this.type = type;
  }

  public WebhookActionNewResponseOrInvitationVacancy settings(WebhookActionVacancyOnlyMineSettings settings) {
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

  public WebhookActionNewResponseOrInvitationVacancy type(TypeEnum type) {
    this.type = type;
    return this;
  }

  /**
   * Новый отклик или приглашение на вакансию. Данное событие будет вызываться как на отклик со стороны соискателя, так и на приглашение со стороны работодателя
   * @return type
  */
  @NotNull 
  @Schema(name = "type", description = "Новый отклик или приглашение на вакансию. Данное событие будет вызываться как на отклик со стороны соискателя, так и на приглашение со стороны работодателя", requiredMode = Schema.RequiredMode.REQUIRED)
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
    WebhookActionNewResponseOrInvitationVacancy webhookActionNewResponseOrInvitationVacancy = (WebhookActionNewResponseOrInvitationVacancy) o;
    return Objects.equals(this.settings, webhookActionNewResponseOrInvitationVacancy.settings) &&
        Objects.equals(this.type, webhookActionNewResponseOrInvitationVacancy.type);
  }

  @Override
  public int hashCode() {
    return Objects.hash(settings, type);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class WebhookActionNewResponseOrInvitationVacancy {\n");
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

