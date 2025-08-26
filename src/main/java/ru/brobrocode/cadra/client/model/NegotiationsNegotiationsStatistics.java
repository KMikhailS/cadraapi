package ru.brobrocode.cadra.client.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.annotation.Generated;
import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;

import java.math.BigDecimal;
import java.util.Objects;

/**
 * NegotiationsNegotiationsStatistics
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2025-08-17T15:41:09.394389505+05:00[Asia/Yekaterinburg]", comments = "Generator version: 7.6.0")
public class NegotiationsNegotiationsStatistics {

  private BigDecimal averageReplyTime = null;

  private NegotiationsObjectsPoliteness politeness = null;

  private BigDecimal received;

  private BigDecimal repliedPercent = null;

  private BigDecimal viewedPercent = null;

  public NegotiationsNegotiationsStatistics() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public NegotiationsNegotiationsStatistics(BigDecimal received) {
    this.received = received;
  }

  public NegotiationsNegotiationsStatistics averageReplyTime(BigDecimal averageReplyTime) {
    this.averageReplyTime = averageReplyTime;
    return this;
  }

  /**
   * Среднее время (в днях) между получением отклика и отправкой сообщения
   * @return averageReplyTime
  */
  @Valid 
  @Schema(name = "average_reply_time", description = "Среднее время (в днях) между получением отклика и отправкой сообщения", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("average_reply_time")
  public BigDecimal getAverageReplyTime() {
    return averageReplyTime;
  }

  public void setAverageReplyTime(BigDecimal averageReplyTime) {
    this.averageReplyTime = averageReplyTime;
  }

  public NegotiationsNegotiationsStatistics politeness(NegotiationsObjectsPoliteness politeness) {
    this.politeness = politeness;
    return this;
  }

  /**
   * Get politeness
   * @return politeness
  */
  @Valid 
  @Schema(name = "politeness", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("politeness")
  public NegotiationsObjectsPoliteness getPoliteness() {
    return politeness;
  }

  public void setPoliteness(NegotiationsObjectsPoliteness politeness) {
    this.politeness = politeness;
  }

  public NegotiationsNegotiationsStatistics received(BigDecimal received) {
    this.received = received;
    return this;
  }

  /**
   * Количество откликов на вакансии, полученных за период (последние 30 дней)
   * @return received
  */
  @NotNull @Valid 
  @Schema(name = "received", description = "Количество откликов на вакансии, полученных за период (последние 30 дней)", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("received")
  public BigDecimal getReceived() {
    return received;
  }

  public void setReceived(BigDecimal received) {
    this.received = received;
  }

  public NegotiationsNegotiationsStatistics repliedPercent(BigDecimal repliedPercent) {
    this.repliedPercent = repliedPercent;
    return this;
  }

  /**
   * Процент откликов на вакансии, перемещенных в любую другую [коллекцию](https://github.com/hhru/api/blob/master/docs/employer_negotiations.md#term-collection) с отправкой сообщения, за период 
   * @return repliedPercent
  */
  @Valid 
  @Schema(name = "replied_percent", description = "Процент откликов на вакансии, перемещенных в любую другую [коллекцию](https://github.com/hhru/api/blob/master/docs/employer_negotiations.md#term-collection) с отправкой сообщения, за период ", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("replied_percent")
  public BigDecimal getRepliedPercent() {
    return repliedPercent;
  }

  public void setRepliedPercent(BigDecimal repliedPercent) {
    this.repliedPercent = repliedPercent;
  }

  public NegotiationsNegotiationsStatistics viewedPercent(BigDecimal viewedPercent) {
    this.viewedPercent = viewedPercent;
    return this;
  }

  /**
   * Процент прочитанных откликов за период
   * @return viewedPercent
  */
  @Valid 
  @Schema(name = "viewed_percent", description = "Процент прочитанных откликов за период", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("viewed_percent")
  public BigDecimal getViewedPercent() {
    return viewedPercent;
  }

  public void setViewedPercent(BigDecimal viewedPercent) {
    this.viewedPercent = viewedPercent;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    NegotiationsNegotiationsStatistics negotiationsNegotiationsStatistics = (NegotiationsNegotiationsStatistics) o;
    return Objects.equals(this.averageReplyTime, negotiationsNegotiationsStatistics.averageReplyTime) &&
        Objects.equals(this.politeness, negotiationsNegotiationsStatistics.politeness) &&
        Objects.equals(this.received, negotiationsNegotiationsStatistics.received) &&
        Objects.equals(this.repliedPercent, negotiationsNegotiationsStatistics.repliedPercent) &&
        Objects.equals(this.viewedPercent, negotiationsNegotiationsStatistics.viewedPercent);
  }

  @Override
  public int hashCode() {
    return Objects.hash(averageReplyTime, politeness, received, repliedPercent, viewedPercent);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class NegotiationsNegotiationsStatistics {\n");
    sb.append("    averageReplyTime: ").append(toIndentedString(averageReplyTime)).append("\n");
    sb.append("    politeness: ").append(toIndentedString(politeness)).append("\n");
    sb.append("    received: ").append(toIndentedString(received)).append("\n");
    sb.append("    repliedPercent: ").append(toIndentedString(repliedPercent)).append("\n");
    sb.append("    viewedPercent: ").append(toIndentedString(viewedPercent)).append("\n");
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

