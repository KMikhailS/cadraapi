package ru.brobrocode.cadra.client.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.annotation.Generated;
import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;

import java.util.Objects;

/**
 * Зарплата
 */

@Schema(name = "VacancySalaryRangeSalaryRangeOutput", description = "Зарплата")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2025-08-17T15:41:09.394389505+05:00[Asia/Yekaterinburg]", comments = "Generator version: 7.6.0")
public class VacancySalaryRangeSalaryRangeOutput {

  private String currency;

  private VacancySalaryRangeSalaryRangeFrequencyOutput frequency = null;

  private Integer from = null;

  private Boolean gross;

  private VacancySalaryRangeSalaryRangeModeOutput mode;

  private Integer to = null;

  public VacancySalaryRangeSalaryRangeOutput() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public VacancySalaryRangeSalaryRangeOutput(String currency, Boolean gross, VacancySalaryRangeSalaryRangeModeOutput mode) {
    this.currency = currency;
    this.gross = gross;
    this.mode = mode;
  }

  public VacancySalaryRangeSalaryRangeOutput currency(String currency) {
    this.currency = currency;
    return this;
  }

  /**
   * Код валюты из [справочника currency](#tag/Obshie-spravochniki/operation/get-dictionaries)
   * @return currency
  */
  @NotNull 
  @Schema(name = "currency", description = "Код валюты из [справочника currency](#tag/Obshie-spravochniki/operation/get-dictionaries)", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("currency")
  public String getCurrency() {
    return currency;
  }

  public void setCurrency(String currency) {
    this.currency = currency;
  }

  public VacancySalaryRangeSalaryRangeOutput frequency(VacancySalaryRangeSalaryRangeFrequencyOutput frequency) {
    this.frequency = frequency;
    return this;
  }

  /**
   * Get frequency
   * @return frequency
  */
  @Valid 
  @Schema(name = "frequency", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("frequency")
  public VacancySalaryRangeSalaryRangeFrequencyOutput getFrequency() {
    return frequency;
  }

  public void setFrequency(VacancySalaryRangeSalaryRangeFrequencyOutput frequency) {
    this.frequency = frequency;
  }

  public VacancySalaryRangeSalaryRangeOutput from(Integer from) {
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

  public VacancySalaryRangeSalaryRangeOutput gross(Boolean gross) {
    this.gross = gross;
    return this;
  }

  /**
   * Признак что границы зарплаты указаны до вычета налогов
   * @return gross
  */
  @NotNull 
  @Schema(name = "gross", description = "Признак что границы зарплаты указаны до вычета налогов", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("gross")
  public Boolean getGross() {
    return gross;
  }

  public void setGross(Boolean gross) {
    this.gross = gross;
  }

  public VacancySalaryRangeSalaryRangeOutput mode(VacancySalaryRangeSalaryRangeModeOutput mode) {
    this.mode = mode;
    return this;
  }

  /**
   * Get mode
   * @return mode
  */
  @NotNull @Valid 
  @Schema(name = "mode", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("mode")
  public VacancySalaryRangeSalaryRangeModeOutput getMode() {
    return mode;
  }

  public void setMode(VacancySalaryRangeSalaryRangeModeOutput mode) {
    this.mode = mode;
  }

  public VacancySalaryRangeSalaryRangeOutput to(Integer to) {
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
    VacancySalaryRangeSalaryRangeOutput vacancySalaryRangeSalaryRangeOutput = (VacancySalaryRangeSalaryRangeOutput) o;
    return Objects.equals(this.currency, vacancySalaryRangeSalaryRangeOutput.currency) &&
        Objects.equals(this.frequency, vacancySalaryRangeSalaryRangeOutput.frequency) &&
        Objects.equals(this.from, vacancySalaryRangeSalaryRangeOutput.from) &&
        Objects.equals(this.gross, vacancySalaryRangeSalaryRangeOutput.gross) &&
        Objects.equals(this.mode, vacancySalaryRangeSalaryRangeOutput.mode) &&
        Objects.equals(this.to, vacancySalaryRangeSalaryRangeOutput.to);
  }

  @Override
  public int hashCode() {
    return Objects.hash(currency, frequency, from, gross, mode, to);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class VacancySalaryRangeSalaryRangeOutput {\n");
    sb.append("    currency: ").append(toIndentedString(currency)).append("\n");
    sb.append("    frequency: ").append(toIndentedString(frequency)).append("\n");
    sb.append("    from: ").append(toIndentedString(from)).append("\n");
    sb.append("    gross: ").append(toIndentedString(gross)).append("\n");
    sb.append("    mode: ").append(toIndentedString(mode)).append("\n");
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

