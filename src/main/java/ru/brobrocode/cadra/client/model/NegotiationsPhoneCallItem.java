package ru.brobrocode.cadra.client.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.annotation.Generated;
import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;

import java.math.BigDecimal;
import java.util.Objects;

/**
 * NegotiationsPhoneCallItem
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2025-08-17T15:41:09.394389505+05:00[Asia/Yekaterinburg]", comments = "Generator version: 7.6.0")
public class NegotiationsPhoneCallItem {

  private String creationTime;

  private BigDecimal durationSeconds = null;

  private BigDecimal id;

  private String lastChangeTime = null;

  private String status;

  public NegotiationsPhoneCallItem() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public NegotiationsPhoneCallItem(String creationTime, BigDecimal id, String status) {
    this.creationTime = creationTime;
    this.id = id;
    this.status = status;
  }

  public NegotiationsPhoneCallItem creationTime(String creationTime) {
    this.creationTime = creationTime;
    return this;
  }

  /**
   * Дата и время создания звонка
   * @return creationTime
  */
  @NotNull 
  @Schema(name = "creation_time", description = "Дата и время создания звонка", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("creation_time")
  public String getCreationTime() {
    return creationTime;
  }

  public void setCreationTime(String creationTime) {
    this.creationTime = creationTime;
  }

  public NegotiationsPhoneCallItem durationSeconds(BigDecimal durationSeconds) {
    this.durationSeconds = durationSeconds;
    return this;
  }

  /**
   * Длительность звонка в секундах
   * @return durationSeconds
  */
  @Valid 
  @Schema(name = "duration_seconds", description = "Длительность звонка в секундах", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("duration_seconds")
  public BigDecimal getDurationSeconds() {
    return durationSeconds;
  }

  public void setDurationSeconds(BigDecimal durationSeconds) {
    this.durationSeconds = durationSeconds;
  }

  public NegotiationsPhoneCallItem id(BigDecimal id) {
    this.id = id;
    return this;
  }

  /**
   * Идентификатор звонка
   * @return id
  */
  @NotNull @Valid 
  @Schema(name = "id", description = "Идентификатор звонка", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("id")
  public BigDecimal getId() {
    return id;
  }

  public void setId(BigDecimal id) {
    this.id = id;
  }

  public NegotiationsPhoneCallItem lastChangeTime(String lastChangeTime) {
    this.lastChangeTime = lastChangeTime;
    return this;
  }

  /**
   * Дата и время обновления звонка
   * @return lastChangeTime
  */
  
  @Schema(name = "last_change_time", description = "Дата и время обновления звонка", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("last_change_time")
  public String getLastChangeTime() {
    return lastChangeTime;
  }

  public void setLastChangeTime(String lastChangeTime) {
    this.lastChangeTime = lastChangeTime;
  }

  public NegotiationsPhoneCallItem status(String status) {
    this.status = status;
    return this;
  }

  /**
   * Статус звонка.  Возможные значения перечислены в разделе `phone_call_status` [справочника полей](#tag/Obshie-spravochniki/operation/get-dictionaries) 
   * @return status
  */
  @NotNull 
  @Schema(name = "status", description = "Статус звонка.  Возможные значения перечислены в разделе `phone_call_status` [справочника полей](#tag/Obshie-spravochniki/operation/get-dictionaries) ", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("status")
  public String getStatus() {
    return status;
  }

  public void setStatus(String status) {
    this.status = status;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    NegotiationsPhoneCallItem negotiationsPhoneCallItem = (NegotiationsPhoneCallItem) o;
    return Objects.equals(this.creationTime, negotiationsPhoneCallItem.creationTime) &&
        Objects.equals(this.durationSeconds, negotiationsPhoneCallItem.durationSeconds) &&
        Objects.equals(this.id, negotiationsPhoneCallItem.id) &&
        Objects.equals(this.lastChangeTime, negotiationsPhoneCallItem.lastChangeTime) &&
        Objects.equals(this.status, negotiationsPhoneCallItem.status);
  }

  @Override
  public int hashCode() {
    return Objects.hash(creationTime, durationSeconds, id, lastChangeTime, status);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class NegotiationsPhoneCallItem {\n");
    sb.append("    creationTime: ").append(toIndentedString(creationTime)).append("\n");
    sb.append("    durationSeconds: ").append(toIndentedString(durationSeconds)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    lastChangeTime: ").append(toIndentedString(lastChangeTime)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
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

