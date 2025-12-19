package ru.brobrocode.cadra.client.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.annotation.Generated;
import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;

import java.util.Objects;

/**
 * Возможное действие
 */

@Schema(name = "VacanciesUpgradeFieldsAction", description = "Возможное действие")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2025-08-17T15:41:09.394389505+05:00[Asia/Yekaterinburg]", comments = "Generator version: 7.6.0")
public class VacanciesUpgradeFieldsAction {

  private Integer cartId = null;

  private VacanciesUpgradeFieldsPrice price = null;

  private String type;

  private String url = null;

  public VacanciesUpgradeFieldsAction() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public VacanciesUpgradeFieldsAction(String type) {
    this.type = type;
  }

  public VacanciesUpgradeFieldsAction cartId(Integer cartId) {
    this.cartId = cartId;
    return this;
  }

  /**
   * Идентификатор заказа, ожидающего активации. Возвращается только для действий с `actions.type=activate`
   * @return cartId
  */
  
  @Schema(name = "cart_id", description = "Идентификатор заказа, ожидающего активации. Возвращается только для действий с `actions.type=activate`", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("cart_id")
  public Integer getCartId() {
    return cartId;
  }

  public void setCartId(Integer cartId) {
    this.cartId = cartId;
  }

  public VacanciesUpgradeFieldsAction price(VacanciesUpgradeFieldsPrice price) {
    this.price = price;
    return this;
  }

  /**
   * Get price
   * @return price
  */
  @Valid 
  @Schema(name = "price", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("price")
  public VacanciesUpgradeFieldsPrice getPrice() {
    return price;
  }

  public void setPrice(VacanciesUpgradeFieldsPrice price) {
    this.price = price;
  }

  public VacanciesUpgradeFieldsAction type(String type) {
    this.type = type;
    return this;
  }

  /**
   * Тип действия:  * `direct_upgrade` — публикации вакансий данного типа есть на счету. Вы можете изменить тип вакансии. * `activate` — публикации вакансий данного типа есть в неактивированных заказах. Перейдите по ссылке, указанной в поле `actions.url`, и активируйте заказ. После этого станет доступно улучшение вакансии. * `buy` — нет доступных публикаций вакансий данного типа. Перейдите по ссылке, указанной в поле `actions.url`, чтобы перейти к покупке публикаций нужного типа 
   * @return type
  */
  @NotNull 
  @Schema(name = "type", description = "Тип действия:  * `direct_upgrade` — публикации вакансий данного типа есть на счету. Вы можете изменить тип вакансии. * `activate` — публикации вакансий данного типа есть в неактивированных заказах. Перейдите по ссылке, указанной в поле `actions.url`, и активируйте заказ. После этого станет доступно улучшение вакансии. * `buy` — нет доступных публикаций вакансий данного типа. Перейдите по ссылке, указанной в поле `actions.url`, чтобы перейти к покупке публикаций нужного типа ", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("type")
  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }

  public VacanciesUpgradeFieldsAction url(String url) {
    this.url = url;
    return this;
  }

  /**
   * Ссылка на действие
   * @return url
  */
  
  @Schema(name = "url", description = "Ссылка на действие", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("url")
  public String getUrl() {
    return url;
  }

  public void setUrl(String url) {
    this.url = url;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    VacanciesUpgradeFieldsAction vacanciesUpgradeFieldsAction = (VacanciesUpgradeFieldsAction) o;
    return Objects.equals(this.cartId, vacanciesUpgradeFieldsAction.cartId) &&
        Objects.equals(this.price, vacanciesUpgradeFieldsAction.price) &&
        Objects.equals(this.type, vacanciesUpgradeFieldsAction.type) &&
        Objects.equals(this.url, vacanciesUpgradeFieldsAction.url);
  }

  @Override
  public int hashCode() {
    return Objects.hash(cartId, price, type, url);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class VacanciesUpgradeFieldsAction {\n");
    sb.append("    cartId: ").append(toIndentedString(cartId)).append("\n");
    sb.append("    price: ").append(toIndentedString(price)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    url: ").append(toIndentedString(url)).append("\n");
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

