package ru.brobrocode.cadra.client.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.annotation.Generated;
import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;

import java.util.Objects;

/**
 * EmployerServicesEmployerServiceItem
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2025-08-17T15:41:09.394389505+05:00[Asia/Yekaterinburg]", comments = "Generator version: 7.6.0")
public class EmployerServicesEmployerServiceItem {

  private String activatedAt;

  private EmployerServicesBalance balance = null;

  private String expiresAt;

  private String id;

  private EmployerServicesServiceType serviceType;

  public EmployerServicesEmployerServiceItem() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public EmployerServicesEmployerServiceItem(String activatedAt, String expiresAt, String id, EmployerServicesServiceType serviceType) {
    this.activatedAt = activatedAt;
    this.expiresAt = expiresAt;
    this.id = id;
    this.serviceType = serviceType;
  }

  public EmployerServicesEmployerServiceItem activatedAt(String activatedAt) {
    this.activatedAt = activatedAt;
    return this;
  }

  /**
   * Время активации услуги (в формате [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601) с точностью до секунды: `YYYY-MM-DDThh:mm:ss±hhmm`
   * @return activatedAt
  */
  @NotNull @Pattern(regexp = "^\\d{4}-[01]\\d-[0-3]\\dT[0-2]\\d:[0-5]\\d:[0-5]\\d(?:\\.\\d+)?((\\+|-)[0-1][0-9]{3})?$") 
  @Schema(name = "activated_at", description = "Время активации услуги (в формате [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601) с точностью до секунды: `YYYY-MM-DDThh:mm:ss±hhmm`", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("activated_at")
  public String getActivatedAt() {
    return activatedAt;
  }

  public void setActivatedAt(String activatedAt) {
    this.activatedAt = activatedAt;
  }

  public EmployerServicesEmployerServiceItem balance(EmployerServicesBalance balance) {
    this.balance = balance;
    return this;
  }

  /**
   * Get balance
   * @return balance
  */
  @Valid 
  @Schema(name = "balance", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("balance")
  public EmployerServicesBalance getBalance() {
    return balance;
  }

  public void setBalance(EmployerServicesBalance balance) {
    this.balance = balance;
  }

  public EmployerServicesEmployerServiceItem expiresAt(String expiresAt) {
    this.expiresAt = expiresAt;
    return this;
  }

  /**
   * Время истечения услуги (в формате [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601) с точностью до секунды: `YYYY-MM-DDThh:mm:ss±hhmm`
   * @return expiresAt
  */
  @NotNull @Pattern(regexp = "^\\d{4}-[01]\\d-[0-3]\\dT[0-2]\\d:[0-5]\\d:[0-5]\\d(?:\\.\\d+)?((\\+|-)[0-1][0-9]{3})?$") 
  @Schema(name = "expires_at", description = "Время истечения услуги (в формате [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601) с точностью до секунды: `YYYY-MM-DDThh:mm:ss±hhmm`", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("expires_at")
  public String getExpiresAt() {
    return expiresAt;
  }

  public void setExpiresAt(String expiresAt) {
    this.expiresAt = expiresAt;
  }

  public EmployerServicesEmployerServiceItem id(String id) {
    this.id = id;
    return this;
  }

  /**
   * Идентификатор услуги
   * @return id
  */
  @NotNull 
  @Schema(name = "id", description = "Идентификатор услуги", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("id")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public EmployerServicesEmployerServiceItem serviceType(EmployerServicesServiceType serviceType) {
    this.serviceType = serviceType;
    return this;
  }

  /**
   * Get serviceType
   * @return serviceType
  */
  @NotNull @Valid 
  @Schema(name = "service_type", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("service_type")
  public EmployerServicesServiceType getServiceType() {
    return serviceType;
  }

  public void setServiceType(EmployerServicesServiceType serviceType) {
    this.serviceType = serviceType;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EmployerServicesEmployerServiceItem employerServicesEmployerServiceItem = (EmployerServicesEmployerServiceItem) o;
    return Objects.equals(this.activatedAt, employerServicesEmployerServiceItem.activatedAt) &&
        Objects.equals(this.balance, employerServicesEmployerServiceItem.balance) &&
        Objects.equals(this.expiresAt, employerServicesEmployerServiceItem.expiresAt) &&
        Objects.equals(this.id, employerServicesEmployerServiceItem.id) &&
        Objects.equals(this.serviceType, employerServicesEmployerServiceItem.serviceType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(activatedAt, balance, expiresAt, id, serviceType);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EmployerServicesEmployerServiceItem {\n");
    sb.append("    activatedAt: ").append(toIndentedString(activatedAt)).append("\n");
    sb.append("    balance: ").append(toIndentedString(balance)).append("\n");
    sb.append("    expiresAt: ").append(toIndentedString(expiresAt)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    serviceType: ").append(toIndentedString(serviceType)).append("\n");
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

