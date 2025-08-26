package ru.brobrocode.cadra.client.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.annotation.Generated;
import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;

import java.util.Objects;

/**
 * WebhookSendObjectBaseUser
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2025-08-17T15:41:09.394389505+05:00[Asia/Yekaterinburg]", comments = "Generator version: 7.6.0")
public class WebhookSendObjectBaseUser implements WebhookSubscriptionsPostRequest {

  private String actionType;

  private String id;

  private WebhookSendObjectBaseUserPayload payload;

  private String subscriptionId;

  private String userId;

  public WebhookSendObjectBaseUser() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public WebhookSendObjectBaseUser(String actionType, String id, WebhookSendObjectBaseUserPayload payload, String subscriptionId, String userId) {
    this.actionType = actionType;
    this.id = id;
    this.payload = payload;
    this.subscriptionId = subscriptionId;
    this.userId = userId;
  }

  public WebhookSendObjectBaseUser actionType(String actionType) {
    this.actionType = actionType;
    return this;
  }

  /**
   * Тип экшена
   * @return actionType
  */
  @NotNull 
  @Schema(name = "action_type", description = "Тип экшена", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("action_type")
  public String getActionType() {
    return actionType;
  }

  public void setActionType(String actionType) {
    this.actionType = actionType;
  }

  public WebhookSendObjectBaseUser id(String id) {
    this.id = id;
    return this;
  }

  /**
   * Идентификатор сообщения
   * @return id
  */
  @NotNull 
  @Schema(name = "id", description = "Идентификатор сообщения", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("id")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public WebhookSendObjectBaseUser payload(WebhookSendObjectBaseUserPayload payload) {
    this.payload = payload;
    return this;
  }

  /**
   * Get payload
   * @return payload
  */
  @NotNull @Valid 
  @Schema(name = "payload", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("payload")
  public WebhookSendObjectBaseUserPayload getPayload() {
    return payload;
  }

  public void setPayload(WebhookSendObjectBaseUserPayload payload) {
    this.payload = payload;
  }

  public WebhookSendObjectBaseUser subscriptionId(String subscriptionId) {
    this.subscriptionId = subscriptionId;
    return this;
  }

  /**
   * Идентификатор подписки
   * @return subscriptionId
  */
  @NotNull 
  @Schema(name = "subscription_id", description = "Идентификатор подписки", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("subscription_id")
  public String getSubscriptionId() {
    return subscriptionId;
  }

  public void setSubscriptionId(String subscriptionId) {
    this.subscriptionId = subscriptionId;
  }

  public WebhookSendObjectBaseUser userId(String userId) {
    this.userId = userId;
    return this;
  }

  /**
   * Идентификатор пользователя
   * @return userId
  */
  @NotNull 
  @Schema(name = "user_id", description = "Идентификатор пользователя", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("user_id")
  public String getUserId() {
    return userId;
  }

  public void setUserId(String userId) {
    this.userId = userId;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    WebhookSendObjectBaseUser webhookSendObjectBaseUser = (WebhookSendObjectBaseUser) o;
    return Objects.equals(this.actionType, webhookSendObjectBaseUser.actionType) &&
        Objects.equals(this.id, webhookSendObjectBaseUser.id) &&
        Objects.equals(this.payload, webhookSendObjectBaseUser.payload) &&
        Objects.equals(this.subscriptionId, webhookSendObjectBaseUser.subscriptionId) &&
        Objects.equals(this.userId, webhookSendObjectBaseUser.userId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(actionType, id, payload, subscriptionId, userId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class WebhookSendObjectBaseUser {\n");
    sb.append("    actionType: ").append(toIndentedString(actionType)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    payload: ").append(toIndentedString(payload)).append("\n");
    sb.append("    subscriptionId: ").append(toIndentedString(subscriptionId)).append("\n");
    sb.append("    userId: ").append(toIndentedString(userId)).append("\n");
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

