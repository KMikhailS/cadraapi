package ru.brobrocode.cadra.client.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.annotation.Generated;
import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * NegotiationsPhoneCalls
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2025-08-17T15:41:09.394389505+05:00[Asia/Yekaterinburg]", comments = "Generator version: 7.6.0")
public class NegotiationsPhoneCalls {

  @Valid
  private List<@Valid NegotiationsPhoneCallItem> items = new ArrayList<>();

  private Boolean pickedUpPhoneByOpponent;

  public NegotiationsPhoneCalls() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public NegotiationsPhoneCalls(List<@Valid NegotiationsPhoneCallItem> items, Boolean pickedUpPhoneByOpponent) {
    this.items = items;
    this.pickedUpPhoneByOpponent = pickedUpPhoneByOpponent;
  }

  public NegotiationsPhoneCalls items(List<@Valid NegotiationsPhoneCallItem> items) {
    this.items = items;
    return this;
  }

  public NegotiationsPhoneCalls addItemsItem(NegotiationsPhoneCallItem itemsItem) {
    if (this.items == null) {
      this.items = new ArrayList<>();
    }
    this.items.add(itemsItem);
    return this;
  }

  /**
   * Список звонков
   * @return items
  */
  @NotNull @Valid 
  @Schema(name = "items", description = "Список звонков", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("items")
  public List<@Valid NegotiationsPhoneCallItem> getItems() {
    return items;
  }

  public void setItems(List<@Valid NegotiationsPhoneCallItem> items) {
    this.items = items;
  }

  public NegotiationsPhoneCalls pickedUpPhoneByOpponent(Boolean pickedUpPhoneByOpponent) {
    this.pickedUpPhoneByOpponent = pickedUpPhoneByOpponent;
    return this;
  }

  /**
   * Ответил ли абонент соискателю хотя бы один раз
   * @return pickedUpPhoneByOpponent
  */
  @NotNull 
  @Schema(name = "picked_up_phone_by_opponent", description = "Ответил ли абонент соискателю хотя бы один раз", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("picked_up_phone_by_opponent")
  public Boolean getPickedUpPhoneByOpponent() {
    return pickedUpPhoneByOpponent;
  }

  public void setPickedUpPhoneByOpponent(Boolean pickedUpPhoneByOpponent) {
    this.pickedUpPhoneByOpponent = pickedUpPhoneByOpponent;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    NegotiationsPhoneCalls negotiationsPhoneCalls = (NegotiationsPhoneCalls) o;
    return Objects.equals(this.items, negotiationsPhoneCalls.items) &&
        Objects.equals(this.pickedUpPhoneByOpponent, negotiationsPhoneCalls.pickedUpPhoneByOpponent);
  }

  @Override
  public int hashCode() {
    return Objects.hash(items, pickedUpPhoneByOpponent);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class NegotiationsPhoneCalls {\n");
    sb.append("    items: ").append(toIndentedString(items)).append("\n");
    sb.append("    pickedUpPhoneByOpponent: ").append(toIndentedString(pickedUpPhoneByOpponent)).append("\n");
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

