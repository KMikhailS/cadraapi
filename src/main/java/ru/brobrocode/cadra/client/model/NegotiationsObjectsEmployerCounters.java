package ru.brobrocode.cadra.client.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.annotation.Generated;

import java.util.Objects;

/**
 * Статистика откликов/приглашений коллекции
 */

@Schema(name = "NegotiationsObjectsEmployerCounters", description = "Статистика откликов/приглашений коллекции")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2025-08-17T15:41:09.394389505+05:00[Asia/Yekaterinburg]", comments = "Generator version: 7.6.0")
public class NegotiationsObjectsEmployerCounters {

  private Integer total;

  private Integer withUpdates;

  public NegotiationsObjectsEmployerCounters total(Integer total) {
    this.total = total;
    return this;
  }

  /**
   * Общее количество откликов/приглашений в коллекции
   * @return total
  */
  
  @Schema(name = "total", description = "Общее количество откликов/приглашений в коллекции", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("total")
  public Integer getTotal() {
    return total;
  }

  public void setTotal(Integer total) {
    this.total = total;
  }

  public NegotiationsObjectsEmployerCounters withUpdates(Integer withUpdates) {
    this.withUpdates = withUpdates;
    return this;
  }

  /**
   * Количество откликов/приглашений в коллекции, требующих внимания
   * @return withUpdates
  */
  
  @Schema(name = "with_updates", description = "Количество откликов/приглашений в коллекции, требующих внимания", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("with_updates")
  public Integer getWithUpdates() {
    return withUpdates;
  }

  public void setWithUpdates(Integer withUpdates) {
    this.withUpdates = withUpdates;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    NegotiationsObjectsEmployerCounters negotiationsObjectsEmployerCounters = (NegotiationsObjectsEmployerCounters) o;
    return Objects.equals(this.total, negotiationsObjectsEmployerCounters.total) &&
        Objects.equals(this.withUpdates, negotiationsObjectsEmployerCounters.withUpdates);
  }

  @Override
  public int hashCode() {
    return Objects.hash(total, withUpdates);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class NegotiationsObjectsEmployerCounters {\n");
    sb.append("    total: ").append(toIndentedString(total)).append("\n");
    sb.append("    withUpdates: ").append(toIndentedString(withUpdates)).append("\n");
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

