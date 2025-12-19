package ru.brobrocode.cadra.client.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.annotation.Generated;
import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;

import java.util.Objects;

/**
 * VacanciesPreferredNegotiationsOrder
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2025-08-17T15:41:09.394389505+05:00[Asia/Yekaterinburg]", comments = "Generator version: 7.6.0")
public class VacanciesPreferredNegotiationsOrder {

  private IncludesIdName orderType;

  public VacanciesPreferredNegotiationsOrder() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public VacanciesPreferredNegotiationsOrder(IncludesIdName orderType) {
    this.orderType = orderType;
  }

  public VacanciesPreferredNegotiationsOrder orderType(IncludesIdName orderType) {
    this.orderType = orderType;
    return this;
  }

  /**
   * Тип сортировки
   * @return orderType
  */
  @NotNull @Valid 
  @Schema(name = "order_type", description = "Тип сортировки", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("order_type")
  public IncludesIdName getOrderType() {
    return orderType;
  }

  public void setOrderType(IncludesIdName orderType) {
    this.orderType = orderType;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    VacanciesPreferredNegotiationsOrder vacanciesPreferredNegotiationsOrder = (VacanciesPreferredNegotiationsOrder) o;
    return Objects.equals(this.orderType, vacanciesPreferredNegotiationsOrder.orderType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(orderType);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class VacanciesPreferredNegotiationsOrder {\n");
    sb.append("    orderType: ").append(toIndentedString(orderType)).append("\n");
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

