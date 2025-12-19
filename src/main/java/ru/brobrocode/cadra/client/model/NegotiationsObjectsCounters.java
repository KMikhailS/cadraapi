package ru.brobrocode.cadra.client.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.annotation.Generated;
import jakarta.validation.Valid;

import java.math.BigDecimal;
import java.util.Objects;

/**
 * NegotiationsObjectsCounters
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2025-08-17T15:41:09.394389505+05:00[Asia/Yekaterinburg]", comments = "Generator version: 7.6.0")
public class NegotiationsObjectsCounters {

  private BigDecimal messages;

  private BigDecimal unreadMessages;

  public NegotiationsObjectsCounters messages(BigDecimal messages) {
    this.messages = messages;
    return this;
  }

  /**
   * Общее количество сообщений
   * @return messages
  */
  @Valid 
  @Schema(name = "messages", description = "Общее количество сообщений", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("messages")
  public BigDecimal getMessages() {
    return messages;
  }

  public void setMessages(BigDecimal messages) {
    this.messages = messages;
  }

  public NegotiationsObjectsCounters unreadMessages(BigDecimal unreadMessages) {
    this.unreadMessages = unreadMessages;
    return this;
  }

  /**
   * Количество непрочитанных работодателем сообщений
   * @return unreadMessages
  */
  @Valid 
  @Schema(name = "unread_messages", description = "Количество непрочитанных работодателем сообщений", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("unread_messages")
  public BigDecimal getUnreadMessages() {
    return unreadMessages;
  }

  public void setUnreadMessages(BigDecimal unreadMessages) {
    this.unreadMessages = unreadMessages;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    NegotiationsObjectsCounters negotiationsObjectsCounters = (NegotiationsObjectsCounters) o;
    return Objects.equals(this.messages, negotiationsObjectsCounters.messages) &&
        Objects.equals(this.unreadMessages, negotiationsObjectsCounters.unreadMessages);
  }

  @Override
  public int hashCode() {
    return Objects.hash(messages, unreadMessages);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class NegotiationsObjectsCounters {\n");
    sb.append("    messages: ").append(toIndentedString(messages)).append("\n");
    sb.append("    unreadMessages: ").append(toIndentedString(unreadMessages)).append("\n");
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

