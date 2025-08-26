package ru.brobrocode.cadra.client.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.annotation.Generated;
import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;

import java.math.BigDecimal;
import java.util.Objects;

/**
 * DictionariesCurrencyItem
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2025-08-17T15:41:09.394389505+05:00[Asia/Yekaterinburg]", comments = "Generator version: 7.6.0")
public class DictionariesCurrencyItem {

  private String abbr;

  private String code;

  private Boolean _default;

  private Boolean inUse;

  private String name;

  private BigDecimal rate;

  public DictionariesCurrencyItem() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public DictionariesCurrencyItem(String abbr, String code, Boolean _default, Boolean inUse, String name, BigDecimal rate) {
    this.abbr = abbr;
    this.code = code;
    this._default = _default;
    this.inUse = inUse;
    this.name = name;
    this.rate = rate;
  }

  public DictionariesCurrencyItem abbr(String abbr) {
    this.abbr = abbr;
    return this;
  }

  /**
   * Краткое обозначение
   * @return abbr
  */
  @NotNull 
  @Schema(name = "abbr", description = "Краткое обозначение", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("abbr")
  public String getAbbr() {
    return abbr;
  }

  public void setAbbr(String abbr) {
    this.abbr = abbr;
  }

  public DictionariesCurrencyItem code(String code) {
    this.code = code;
    return this;
  }

  /**
   * Код
   * @return code
  */
  @NotNull 
  @Schema(name = "code", description = "Код", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("code")
  public String getCode() {
    return code;
  }

  public void setCode(String code) {
    this.code = code;
  }

  public DictionariesCurrencyItem _default(Boolean _default) {
    this._default = _default;
    return this;
  }

  /**
   * Используется ли в качестве валюты по умолчанию?
   * @return _default
  */
  @NotNull 
  @Schema(name = "default", description = "Используется ли в качестве валюты по умолчанию?", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("default")
  public Boolean getDefault() {
    return _default;
  }

  public void setDefault(Boolean _default) {
    this._default = _default;
  }

  public DictionariesCurrencyItem inUse(Boolean inUse) {
    this.inUse = inUse;
    return this;
  }

  /**
   * Можно ли использовать на данном хосте?
   * @return inUse
  */
  @NotNull 
  @Schema(name = "in_use", description = "Можно ли использовать на данном хосте?", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("in_use")
  public Boolean getInUse() {
    return inUse;
  }

  public void setInUse(Boolean inUse) {
    this.inUse = inUse;
  }

  public DictionariesCurrencyItem name(String name) {
    this.name = name;
    return this;
  }

  /**
   * Название
   * @return name
  */
  @NotNull 
  @Schema(name = "name", description = "Название", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("name")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public DictionariesCurrencyItem rate(BigDecimal rate) {
    this.rate = rate;
    return this;
  }

  /**
   * Курс по отношению к рублю
   * @return rate
  */
  @NotNull @Valid 
  @Schema(name = "rate", description = "Курс по отношению к рублю", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("rate")
  public BigDecimal getRate() {
    return rate;
  }

  public void setRate(BigDecimal rate) {
    this.rate = rate;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DictionariesCurrencyItem dictionariesCurrencyItem = (DictionariesCurrencyItem) o;
    return Objects.equals(this.abbr, dictionariesCurrencyItem.abbr) &&
        Objects.equals(this.code, dictionariesCurrencyItem.code) &&
        Objects.equals(this._default, dictionariesCurrencyItem._default) &&
        Objects.equals(this.inUse, dictionariesCurrencyItem.inUse) &&
        Objects.equals(this.name, dictionariesCurrencyItem.name) &&
        Objects.equals(this.rate, dictionariesCurrencyItem.rate);
  }

  @Override
  public int hashCode() {
    return Objects.hash(abbr, code, _default, inUse, name, rate);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DictionariesCurrencyItem {\n");
    sb.append("    abbr: ").append(toIndentedString(abbr)).append("\n");
    sb.append("    code: ").append(toIndentedString(code)).append("\n");
    sb.append("    _default: ").append(toIndentedString(_default)).append("\n");
    sb.append("    inUse: ").append(toIndentedString(inUse)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    rate: ").append(toIndentedString(rate)).append("\n");
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

