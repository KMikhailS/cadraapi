package ru.brobrocode.cadra.client.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.annotation.Generated;
import jakarta.validation.constraints.NotNull;

import java.util.Objects;

/**
 * VacancyDraftAutoPublicationState
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2025-08-17T15:41:09.394389505+05:00[Asia/Yekaterinburg]", comments = "Generator version: 7.6.0")
public class VacancyDraftAutoPublicationState {

  private String billUid;

  private String cartId;

  public VacancyDraftAutoPublicationState() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public VacancyDraftAutoPublicationState(String billUid, String cartId) {
    this.billUid = billUid;
    this.cartId = cartId;
  }

  public VacancyDraftAutoPublicationState billUid(String billUid) {
    this.billUid = billUid;
    return this;
  }

  /**
   * Номер счета
   * @return billUid
  */
  @NotNull 
  @Schema(name = "bill_uid", description = "Номер счета", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("bill_uid")
  public String getBillUid() {
    return billUid;
  }

  public void setBillUid(String billUid) {
    this.billUid = billUid;
  }

  public VacancyDraftAutoPublicationState cartId(String cartId) {
    this.cartId = cartId;
    return this;
  }

  /**
   * Идентификатор заказа
   * @return cartId
  */
  @NotNull 
  @Schema(name = "cart_id", description = "Идентификатор заказа", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("cart_id")
  public String getCartId() {
    return cartId;
  }

  public void setCartId(String cartId) {
    this.cartId = cartId;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    VacancyDraftAutoPublicationState vacancyDraftAutoPublicationState = (VacancyDraftAutoPublicationState) o;
    return Objects.equals(this.billUid, vacancyDraftAutoPublicationState.billUid) &&
        Objects.equals(this.cartId, vacancyDraftAutoPublicationState.cartId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(billUid, cartId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class VacancyDraftAutoPublicationState {\n");
    sb.append("    billUid: ").append(toIndentedString(billUid)).append("\n");
    sb.append("    cartId: ").append(toIndentedString(cartId)).append("\n");
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

