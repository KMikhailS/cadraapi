package ru.brobrocode.cadra.client.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.annotation.Generated;

import java.util.Objects;

/**
 * Зарплата
 * @deprecated
 */

@Deprecated
@Schema(name = "VacancySalary", description = "Зарплата")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2025-08-17T15:41:09.394389505+05:00[Asia/Yekaterinburg]", comments = "Generator version: 7.6.0")
public class VacancySalary {

  private String currency = null;

  private Integer from = null;

  private Boolean gross = null;

  private Integer to = null;

  public VacancySalary currency(String currency) {
    this.currency = currency;
    return this;
  }

  /**
   * Код валюты из [справочника currency](#tag/Obshie-spravochniki/operation/get-dictionaries)
   * @return currency
  */
  
  @Schema(name = "currency", description = "Код валюты из [справочника currency](#tag/Obshie-spravochniki/operation/get-dictionaries)", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("currency")
  public String getCurrency() {
    return currency;
  }

  public void setCurrency(String currency) {
    this.currency = currency;
  }

  public VacancySalary from(Integer from) {
    this.from = from;
    return this;
  }

  /**
   * Нижняя граница зарплаты
   * @return from
  */
  
  @Schema(name = "from", description = "Нижняя граница зарплаты", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("from")
  public Integer getFrom() {
    return from;
  }

  public void setFrom(Integer from) {
    this.from = from;
  }

  public VacancySalary gross(Boolean gross) {
    this.gross = gross;
    return this;
  }

  /**
   * Признак что границы зарплаты указаны до вычета налогов
   * @return gross
  */
  
  @Schema(name = "gross", description = "Признак что границы зарплаты указаны до вычета налогов", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("gross")
  public Boolean getGross() {
    return gross;
  }

  public void setGross(Boolean gross) {
    this.gross = gross;
  }

  public VacancySalary to(Integer to) {
    this.to = to;
    return this;
  }

  /**
   * Верхняя граница зарплаты
   * @return to
  */
  
  @Schema(name = "to", description = "Верхняя граница зарплаты", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("to")
  public Integer getTo() {
    return to;
  }

  public void setTo(Integer to) {
    this.to = to;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    VacancySalary vacancySalary = (VacancySalary) o;
    return Objects.equals(this.currency, vacancySalary.currency) &&
        Objects.equals(this.from, vacancySalary.from) &&
        Objects.equals(this.gross, vacancySalary.gross) &&
        Objects.equals(this.to, vacancySalary.to);
  }

  @Override
  public int hashCode() {
    return Objects.hash(currency, from, gross, to);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class VacancySalary {\n");
    sb.append("    currency: ").append(toIndentedString(currency)).append("\n");
    sb.append("    from: ").append(toIndentedString(from)).append("\n");
    sb.append("    gross: ").append(toIndentedString(gross)).append("\n");
    sb.append("    to: ").append(toIndentedString(to)).append("\n");
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

