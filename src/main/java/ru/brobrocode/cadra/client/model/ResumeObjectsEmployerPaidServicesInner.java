package ru.brobrocode.cadra.client.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.annotation.Generated;
import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;

import java.util.Objects;

/**
 * ResumeObjectsEmployerPaidServicesInner
 */

@JsonTypeName("ResumeObjectsEmployerPaidServices_inner")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2025-08-17T15:41:09.394389505+05:00[Asia/Yekaterinburg]", comments = "Generator version: 7.6.0")
public class ResumeObjectsEmployerPaidServicesInner {

  private String description;

  private String id;

  private String name;

  private ResumeObjectsEmployerPaidServicesInnerPriceList priceList;

  private ResumeObjectsEmployerPaidServicesInnerQuickPurchase quickPurchase;

  public ResumeObjectsEmployerPaidServicesInner() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public ResumeObjectsEmployerPaidServicesInner(String id, String name, ResumeObjectsEmployerPaidServicesInnerPriceList priceList) {
    this.id = id;
    this.name = name;
    this.priceList = priceList;
  }

  public ResumeObjectsEmployerPaidServicesInner description(String description) {
    this.description = description;
    return this;
  }

  /**
   * Примечание к использованию услуги
   * @return description
  */
  
  @Schema(name = "description", description = "Примечание к использованию услуги", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("description")
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public ResumeObjectsEmployerPaidServicesInner id(String id) {
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

  public ResumeObjectsEmployerPaidServicesInner name(String name) {
    this.name = name;
    return this;
  }

  /**
   * Название услуги
   * @return name
  */
  @NotNull 
  @Schema(name = "name", description = "Название услуги", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("name")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public ResumeObjectsEmployerPaidServicesInner priceList(ResumeObjectsEmployerPaidServicesInnerPriceList priceList) {
    this.priceList = priceList;
    return this;
  }

  /**
   * Get priceList
   * @return priceList
  */
  @NotNull @Valid 
  @Schema(name = "price_list", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("price_list")
  public ResumeObjectsEmployerPaidServicesInnerPriceList getPriceList() {
    return priceList;
  }

  public void setPriceList(ResumeObjectsEmployerPaidServicesInnerPriceList priceList) {
    this.priceList = priceList;
  }

  public ResumeObjectsEmployerPaidServicesInner quickPurchase(ResumeObjectsEmployerPaidServicesInnerQuickPurchase quickPurchase) {
    this.quickPurchase = quickPurchase;
    return this;
  }

  /**
   * Get quickPurchase
   * @return quickPurchase
  */
  @Valid 
  @Schema(name = "quick_purchase", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("quick_purchase")
  public ResumeObjectsEmployerPaidServicesInnerQuickPurchase getQuickPurchase() {
    return quickPurchase;
  }

  public void setQuickPurchase(ResumeObjectsEmployerPaidServicesInnerQuickPurchase quickPurchase) {
    this.quickPurchase = quickPurchase;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ResumeObjectsEmployerPaidServicesInner resumeObjectsEmployerPaidServicesInner = (ResumeObjectsEmployerPaidServicesInner) o;
    return Objects.equals(this.description, resumeObjectsEmployerPaidServicesInner.description) &&
        Objects.equals(this.id, resumeObjectsEmployerPaidServicesInner.id) &&
        Objects.equals(this.name, resumeObjectsEmployerPaidServicesInner.name) &&
        Objects.equals(this.priceList, resumeObjectsEmployerPaidServicesInner.priceList) &&
        Objects.equals(this.quickPurchase, resumeObjectsEmployerPaidServicesInner.quickPurchase);
  }

  @Override
  public int hashCode() {
    return Objects.hash(description, id, name, priceList, quickPurchase);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ResumeObjectsEmployerPaidServicesInner {\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    priceList: ").append(toIndentedString(priceList)).append("\n");
    sb.append("    quickPurchase: ").append(toIndentedString(quickPurchase)).append("\n");
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

