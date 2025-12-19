package ru.brobrocode.cadra.client.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.annotation.Generated;
import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;

import java.math.BigDecimal;
import java.util.Objects;

/**
 * SalaryStatisticsMarketSalary
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2025-08-17T15:41:09.394389505+05:00[Asia/Yekaterinburg]", comments = "Generator version: 7.6.0")
public class SalaryStatisticsMarketSalary {

  private BigDecimal average;

  private BigDecimal bottom;

  private BigDecimal maximum;

  private BigDecimal median;

  private BigDecimal minimum;

  private BigDecimal upper;

  public SalaryStatisticsMarketSalary() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public SalaryStatisticsMarketSalary(BigDecimal bottom, BigDecimal median, BigDecimal upper) {
    this.bottom = bottom;
    this.median = median;
    this.upper = upper;
  }

  public SalaryStatisticsMarketSalary average(BigDecimal average) {
    this.average = average;
    return this;
  }

  /**
   * Среднее расчетное значение
   * @return average
  */
  @Valid 
  @Schema(name = "average", description = "Среднее расчетное значение", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("average")
  public BigDecimal getAverage() {
    return average;
  }

  public void setAverage(BigDecimal average) {
    this.average = average;
  }

  public SalaryStatisticsMarketSalary bottom(BigDecimal bottom) {
    this.bottom = bottom;
    return this;
  }

  /**
   * Нижняя граница рыночного диапазона (25-й процентиль)
   * @return bottom
  */
  @NotNull @Valid 
  @Schema(name = "bottom", description = "Нижняя граница рыночного диапазона (25-й процентиль)", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("bottom")
  public BigDecimal getBottom() {
    return bottom;
  }

  public void setBottom(BigDecimal bottom) {
    this.bottom = bottom;
  }

  public SalaryStatisticsMarketSalary maximum(BigDecimal maximum) {
    this.maximum = maximum;
    return this;
  }

  /**
   * Максимальные значения (90-й процентиль)
   * @return maximum
  */
  @Valid 
  @Schema(name = "maximum", description = "Максимальные значения (90-й процентиль)", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("maximum")
  public BigDecimal getMaximum() {
    return maximum;
  }

  public void setMaximum(BigDecimal maximum) {
    this.maximum = maximum;
  }

  public SalaryStatisticsMarketSalary median(BigDecimal median) {
    this.median = median;
    return this;
  }

  /**
   * Медианное рыночное значение
   * @return median
  */
  @NotNull @Valid 
  @Schema(name = "median", description = "Медианное рыночное значение", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("median")
  public BigDecimal getMedian() {
    return median;
  }

  public void setMedian(BigDecimal median) {
    this.median = median;
  }

  public SalaryStatisticsMarketSalary minimum(BigDecimal minimum) {
    this.minimum = minimum;
    return this;
  }

  /**
   * Минимальные значения (10-й процентиль)
   * @return minimum
  */
  @Valid 
  @Schema(name = "minimum", description = "Минимальные значения (10-й процентиль)", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("minimum")
  public BigDecimal getMinimum() {
    return minimum;
  }

  public void setMinimum(BigDecimal minimum) {
    this.minimum = minimum;
  }

  public SalaryStatisticsMarketSalary upper(BigDecimal upper) {
    this.upper = upper;
    return this;
  }

  /**
   * Верхняя граница рыночного диапазона (75-й процентиль)
   * @return upper
  */
  @NotNull @Valid 
  @Schema(name = "upper", description = "Верхняя граница рыночного диапазона (75-й процентиль)", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("upper")
  public BigDecimal getUpper() {
    return upper;
  }

  public void setUpper(BigDecimal upper) {
    this.upper = upper;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SalaryStatisticsMarketSalary salaryStatisticsMarketSalary = (SalaryStatisticsMarketSalary) o;
    return Objects.equals(this.average, salaryStatisticsMarketSalary.average) &&
        Objects.equals(this.bottom, salaryStatisticsMarketSalary.bottom) &&
        Objects.equals(this.maximum, salaryStatisticsMarketSalary.maximum) &&
        Objects.equals(this.median, salaryStatisticsMarketSalary.median) &&
        Objects.equals(this.minimum, salaryStatisticsMarketSalary.minimum) &&
        Objects.equals(this.upper, salaryStatisticsMarketSalary.upper);
  }

  @Override
  public int hashCode() {
    return Objects.hash(average, bottom, maximum, median, minimum, upper);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SalaryStatisticsMarketSalary {\n");
    sb.append("    average: ").append(toIndentedString(average)).append("\n");
    sb.append("    bottom: ").append(toIndentedString(bottom)).append("\n");
    sb.append("    maximum: ").append(toIndentedString(maximum)).append("\n");
    sb.append("    median: ").append(toIndentedString(median)).append("\n");
    sb.append("    minimum: ").append(toIndentedString(minimum)).append("\n");
    sb.append("    upper: ").append(toIndentedString(upper)).append("\n");
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

