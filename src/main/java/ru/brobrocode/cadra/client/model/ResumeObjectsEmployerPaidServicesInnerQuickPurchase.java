package ru.brobrocode.cadra.client.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.annotation.Generated;
import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;

import java.math.BigDecimal;
import java.util.Objects;

/**
 * Описание быстрой покупки услуги, если доступно
 */

@Schema(name = "ResumeObjectsEmployerPaidServices_inner_quick_purchase", description = "Описание быстрой покупки услуги, если доступно")
@JsonTypeName("ResumeObjectsEmployerPaidServices_inner_quick_purchase")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2025-08-17T15:41:09.394389505+05:00[Asia/Yekaterinburg]", comments = "Generator version: 7.6.0")
public class ResumeObjectsEmployerPaidServicesInnerQuickPurchase {

  private String alternateUrl;

  private ResumeObjectsEmployerPaidServicesInnerQuickPurchaseCurrency currency;

  private String name;

  private BigDecimal price;

  public ResumeObjectsEmployerPaidServicesInnerQuickPurchase() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public ResumeObjectsEmployerPaidServicesInnerQuickPurchase(String alternateUrl, ResumeObjectsEmployerPaidServicesInnerQuickPurchaseCurrency currency, String name, BigDecimal price) {
    this.alternateUrl = alternateUrl;
    this.currency = currency;
    this.name = name;
    this.price = price;
  }

  public ResumeObjectsEmployerPaidServicesInnerQuickPurchase alternateUrl(String alternateUrl) {
    this.alternateUrl = alternateUrl;
    return this;
  }

  /**
   * Ссылка на сайт, по которой будет предложено купить услугу
   * @return alternateUrl
  */
  @NotNull 
  @Schema(name = "alternate_url", description = "Ссылка на сайт, по которой будет предложено купить услугу", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("alternate_url")
  public String getAlternateUrl() {
    return alternateUrl;
  }

  public void setAlternateUrl(String alternateUrl) {
    this.alternateUrl = alternateUrl;
  }

  public ResumeObjectsEmployerPaidServicesInnerQuickPurchase currency(ResumeObjectsEmployerPaidServicesInnerQuickPurchaseCurrency currency) {
    this.currency = currency;
    return this;
  }

  /**
   * Get currency
   * @return currency
  */
  @NotNull @Valid 
  @Schema(name = "currency", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("currency")
  public ResumeObjectsEmployerPaidServicesInnerQuickPurchaseCurrency getCurrency() {
    return currency;
  }

  public void setCurrency(ResumeObjectsEmployerPaidServicesInnerQuickPurchaseCurrency currency) {
    this.currency = currency;
  }

  public ResumeObjectsEmployerPaidServicesInnerQuickPurchase name(String name) {
    this.name = name;
    return this;
  }

  /**
   * Название действия по заказу услуги
   * @return name
  */
  @NotNull 
  @Schema(name = "name", description = "Название действия по заказу услуги", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("name")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public ResumeObjectsEmployerPaidServicesInnerQuickPurchase price(BigDecimal price) {
    this.price = price;
    return this;
  }

  /**
   * Цена услуги
   * @return price
  */
  @NotNull @Valid 
  @Schema(name = "price", description = "Цена услуги", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("price")
  public BigDecimal getPrice() {
    return price;
  }

  public void setPrice(BigDecimal price) {
    this.price = price;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ResumeObjectsEmployerPaidServicesInnerQuickPurchase resumeObjectsEmployerPaidServicesInnerQuickPurchase = (ResumeObjectsEmployerPaidServicesInnerQuickPurchase) o;
    return Objects.equals(this.alternateUrl, resumeObjectsEmployerPaidServicesInnerQuickPurchase.alternateUrl) &&
        Objects.equals(this.currency, resumeObjectsEmployerPaidServicesInnerQuickPurchase.currency) &&
        Objects.equals(this.name, resumeObjectsEmployerPaidServicesInnerQuickPurchase.name) &&
        Objects.equals(this.price, resumeObjectsEmployerPaidServicesInnerQuickPurchase.price);
  }

  @Override
  public int hashCode() {
    return Objects.hash(alternateUrl, currency, name, price);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ResumeObjectsEmployerPaidServicesInnerQuickPurchase {\n");
    sb.append("    alternateUrl: ").append(toIndentedString(alternateUrl)).append("\n");
    sb.append("    currency: ").append(toIndentedString(currency)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    price: ").append(toIndentedString(price)).append("\n");
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

