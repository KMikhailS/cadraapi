package ru.brobrocode.cadra.client.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.annotation.Generated;
import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * SalaryStatisticsIndirectCalculation
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2025-08-17T15:41:09.394389505+05:00[Asia/Yekaterinburg]", comments = "Generator version: 7.6.0")
public class SalaryStatisticsIndirectCalculation {

  @Valid
  private List<@Valid IncludesIdName> indirectAreas;

  @Valid
  private List<@Valid IncludesIdName> indirectEmployeeLevels;

  private BigDecimal indirectRegionalRatio;

  public SalaryStatisticsIndirectCalculation() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public SalaryStatisticsIndirectCalculation(BigDecimal indirectRegionalRatio) {
    this.indirectRegionalRatio = indirectRegionalRatio;
  }

  public SalaryStatisticsIndirectCalculation indirectAreas(List<@Valid IncludesIdName> indirectAreas) {
    this.indirectAreas = indirectAreas;
    return this;
  }

  public SalaryStatisticsIndirectCalculation addIndirectAreasItem(IncludesIdName indirectAreasItem) {
    if (this.indirectAreas == null) {
      this.indirectAreas = new ArrayList<>();
    }
    this.indirectAreas.add(indirectAreasItem);
    return this;
  }

  /**
   * Регионы, использованные при получении косвенной оценки
   * @return indirectAreas
  */
  @Valid 
  @Schema(name = "indirect_areas", description = "Регионы, использованные при получении косвенной оценки", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("indirect_areas")
  public List<@Valid IncludesIdName> getIndirectAreas() {
    return indirectAreas;
  }

  public void setIndirectAreas(List<@Valid IncludesIdName> indirectAreas) {
    this.indirectAreas = indirectAreas;
  }

  public SalaryStatisticsIndirectCalculation indirectEmployeeLevels(List<@Valid IncludesIdName> indirectEmployeeLevels) {
    this.indirectEmployeeLevels = indirectEmployeeLevels;
    return this;
  }

  public SalaryStatisticsIndirectCalculation addIndirectEmployeeLevelsItem(IncludesIdName indirectEmployeeLevelsItem) {
    if (this.indirectEmployeeLevels == null) {
      this.indirectEmployeeLevels = new ArrayList<>();
    }
    this.indirectEmployeeLevels.add(indirectEmployeeLevelsItem);
    return this;
  }

  /**
   * Уровни специалистов, включенные в выборку в регионе, использованном при получении косвенной оценки
   * @return indirectEmployeeLevels
  */
  @Valid 
  @Schema(name = "indirect_employee_levels", description = "Уровни специалистов, включенные в выборку в регионе, использованном при получении косвенной оценки", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("indirect_employee_levels")
  public List<@Valid IncludesIdName> getIndirectEmployeeLevels() {
    return indirectEmployeeLevels;
  }

  public void setIndirectEmployeeLevels(List<@Valid IncludesIdName> indirectEmployeeLevels) {
    this.indirectEmployeeLevels = indirectEmployeeLevels;
  }

  public SalaryStatisticsIndirectCalculation indirectRegionalRatio(BigDecimal indirectRegionalRatio) {
    this.indirectRegionalRatio = indirectRegionalRatio;
    return this;
  }

  /**
   * Региональный коэффициент, который был использован для получения косвенной оценки зарплат
   * @return indirectRegionalRatio
  */
  @NotNull @Valid 
  @Schema(name = "indirect_regional_ratio", description = "Региональный коэффициент, который был использован для получения косвенной оценки зарплат", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("indirect_regional_ratio")
  public BigDecimal getIndirectRegionalRatio() {
    return indirectRegionalRatio;
  }

  public void setIndirectRegionalRatio(BigDecimal indirectRegionalRatio) {
    this.indirectRegionalRatio = indirectRegionalRatio;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SalaryStatisticsIndirectCalculation salaryStatisticsIndirectCalculation = (SalaryStatisticsIndirectCalculation) o;
    return Objects.equals(this.indirectAreas, salaryStatisticsIndirectCalculation.indirectAreas) &&
        Objects.equals(this.indirectEmployeeLevels, salaryStatisticsIndirectCalculation.indirectEmployeeLevels) &&
        Objects.equals(this.indirectRegionalRatio, salaryStatisticsIndirectCalculation.indirectRegionalRatio);
  }

  @Override
  public int hashCode() {
    return Objects.hash(indirectAreas, indirectEmployeeLevels, indirectRegionalRatio);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SalaryStatisticsIndirectCalculation {\n");
    sb.append("    indirectAreas: ").append(toIndentedString(indirectAreas)).append("\n");
    sb.append("    indirectEmployeeLevels: ").append(toIndentedString(indirectEmployeeLevels)).append("\n");
    sb.append("    indirectRegionalRatio: ").append(toIndentedString(indirectRegionalRatio)).append("\n");
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

