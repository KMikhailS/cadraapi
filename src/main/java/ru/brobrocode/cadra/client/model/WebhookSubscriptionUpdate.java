package ru.brobrocode.cadra.client.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.annotation.Generated;
import jakarta.validation.Valid;
import jakarta.validation.constraints.Size;

import java.net.URI;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * WebhookSubscriptionUpdate
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2025-08-17T15:41:09.394389505+05:00[Asia/Yekaterinburg]", comments = "Generator version: 7.6.0")
public class WebhookSubscriptionUpdate {

  @Valid
  private List<WebhookSubscriptionCommonItemActionsInner> actions = new ArrayList<>();

  private URI url;

  public WebhookSubscriptionUpdate actions(List<WebhookSubscriptionCommonItemActionsInner> actions) {
    this.actions = actions;
    return this;
  }

  public WebhookSubscriptionUpdate addActionsItem(WebhookSubscriptionCommonItemActionsInner actionsItem) {
    if (this.actions == null) {
      this.actions = new ArrayList<>();
    }
    this.actions.add(actionsItem);
    return this;
  }

  /**
   * Cписок событий, на которые нужно подписаться
   * @return actions
  */
  @Valid @Size(min = 1) 
  @Schema(name = "actions", description = "Cписок событий, на которые нужно подписаться", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("actions")
  public List<WebhookSubscriptionCommonItemActionsInner> getActions() {
    return actions;
  }

  public void setActions(List<WebhookSubscriptionCommonItemActionsInner> actions) {
    this.actions = actions;
  }

  public WebhookSubscriptionUpdate url(URI url) {
    this.url = url;
    return this;
  }

  /**
   * URL, на который будет отправляться POST запрос при наступлении события
   * @return url
  */
  @Valid 
  @Schema(name = "url", example = "http://www.example.com", description = "URL, на который будет отправляться POST запрос при наступлении события", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("url")
  public URI getUrl() {
    return url;
  }

  public void setUrl(URI url) {
    this.url = url;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    WebhookSubscriptionUpdate webhookSubscriptionUpdate = (WebhookSubscriptionUpdate) o;
    return Objects.equals(this.actions, webhookSubscriptionUpdate.actions) &&
        Objects.equals(this.url, webhookSubscriptionUpdate.url);
  }

  @Override
  public int hashCode() {
    return Objects.hash(actions, url);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class WebhookSubscriptionUpdate {\n");
    sb.append("    actions: ").append(toIndentedString(actions)).append("\n");
    sb.append("    url: ").append(toIndentedString(url)).append("\n");
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

