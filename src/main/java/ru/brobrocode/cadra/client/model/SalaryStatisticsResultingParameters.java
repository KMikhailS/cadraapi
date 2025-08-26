package ru.brobrocode.cadra.client.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.annotation.Generated;
import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * Набор параметров, по которым происходил расчет
 */

@Schema(name = "SalaryStatisticsResultingParameters", description = "Набор параметров, по которым происходил расчет")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2025-08-17T15:41:09.394389505+05:00[Asia/Yekaterinburg]", comments = "Generator version: 7.6.0")
public class SalaryStatisticsResultingParameters {

  @Valid
  private List<@Valid IncludesIdName> areas = new ArrayList<>();

  @Valid
  private List<@Valid IncludesIdName> employeeLevels;

  private BigDecimal employersCount;

  @Valid
  private List<@Valid IncludesIdName> excludedAreas;

  private SalaryStatisticsIndirectCalculation indirectCalculation = null;

  @Valid
  private List<@Valid IncludesIdName> industries;

  private BigDecimal positionsCount;

  /**
   * Gets or Sets sources
   */
  public enum SourcesEnum {
    SALARIES("SALARIES"),
    
    RESUMES("RESUMES"),
    
    VACANCIES("VACANCIES");

    private String value;

    SourcesEnum(String value) {
      this.value = value;
    }

    @JsonValue
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static SourcesEnum fromValue(String value) {
      for (SourcesEnum b : SourcesEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  @Valid
  private List<SourcesEnum> sources = new ArrayList<>();

  @Valid
  private List<@Valid IncludesIdName> specialities;

  public SalaryStatisticsResultingParameters() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public SalaryStatisticsResultingParameters(List<@Valid IncludesIdName> areas, BigDecimal employersCount, BigDecimal positionsCount, List<SourcesEnum> sources) {
    this.areas = areas;
    this.employersCount = employersCount;
    this.positionsCount = positionsCount;
    this.sources = sources;
  }

  public SalaryStatisticsResultingParameters areas(List<@Valid IncludesIdName> areas) {
    this.areas = areas;
    return this;
  }

  public SalaryStatisticsResultingParameters addAreasItem(IncludesIdName areasItem) {
    if (this.areas == null) {
      this.areas = new ArrayList<>();
    }
    this.areas.add(areasItem);
    return this;
  }

  /**
   * Коды регионов
   * @return areas
  */
  @NotNull @Valid 
  @Schema(name = "areas", description = "Коды регионов", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("areas")
  public List<@Valid IncludesIdName> getAreas() {
    return areas;
  }

  public void setAreas(List<@Valid IncludesIdName> areas) {
    this.areas = areas;
  }

  public SalaryStatisticsResultingParameters employeeLevels(List<@Valid IncludesIdName> employeeLevels) {
    this.employeeLevels = employeeLevels;
    return this;
  }

  public SalaryStatisticsResultingParameters addEmployeeLevelsItem(IncludesIdName employeeLevelsItem) {
    if (this.employeeLevels == null) {
      this.employeeLevels = new ArrayList<>();
    }
    this.employeeLevels.add(employeeLevelsItem);
    return this;
  }

  /**
   * Уровни специалистов
   * @return employeeLevels
  */
  @Valid 
  @Schema(name = "employee_levels", description = "Уровни специалистов", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("employee_levels")
  public List<@Valid IncludesIdName> getEmployeeLevels() {
    return employeeLevels;
  }

  public void setEmployeeLevels(List<@Valid IncludesIdName> employeeLevels) {
    this.employeeLevels = employeeLevels;
  }

  public SalaryStatisticsResultingParameters employersCount(BigDecimal employersCount) {
    this.employersCount = employersCount;
    return this;
  }

  /**
   * Количество работодателей, позиции которых участвуют в выборке
   * @return employersCount
  */
  @NotNull @Valid 
  @Schema(name = "employers_count", description = "Количество работодателей, позиции которых участвуют в выборке", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("employers_count")
  public BigDecimal getEmployersCount() {
    return employersCount;
  }

  public void setEmployersCount(BigDecimal employersCount) {
    this.employersCount = employersCount;
  }

  public SalaryStatisticsResultingParameters excludedAreas(List<@Valid IncludesIdName> excludedAreas) {
    this.excludedAreas = excludedAreas;
    return this;
  }

  public SalaryStatisticsResultingParameters addExcludedAreasItem(IncludesIdName excludedAreasItem) {
    if (this.excludedAreas == null) {
      this.excludedAreas = new ArrayList<>();
    }
    this.excludedAreas.add(excludedAreasItem);
    return this;
  }

  /**
   * Исключенные коды регионов
   * @return excludedAreas
  */
  @Valid 
  @Schema(name = "excluded_areas", description = "Исключенные коды регионов", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("excluded_areas")
  public List<@Valid IncludesIdName> getExcludedAreas() {
    return excludedAreas;
  }

  public void setExcludedAreas(List<@Valid IncludesIdName> excludedAreas) {
    this.excludedAreas = excludedAreas;
  }

  public SalaryStatisticsResultingParameters indirectCalculation(SalaryStatisticsIndirectCalculation indirectCalculation) {
    this.indirectCalculation = indirectCalculation;
    return this;
  }

  /**
   * Get indirectCalculation
   * @return indirectCalculation
  */
  @Valid 
  @Schema(name = "indirect_calculation", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("indirect_calculation")
  public SalaryStatisticsIndirectCalculation getIndirectCalculation() {
    return indirectCalculation;
  }

  public void setIndirectCalculation(SalaryStatisticsIndirectCalculation indirectCalculation) {
    this.indirectCalculation = indirectCalculation;
  }

  public SalaryStatisticsResultingParameters industries(List<@Valid IncludesIdName> industries) {
    this.industries = industries;
    return this;
  }

  public SalaryStatisticsResultingParameters addIndustriesItem(IncludesIdName industriesItem) {
    if (this.industries == null) {
      this.industries = new ArrayList<>();
    }
    this.industries.add(industriesItem);
    return this;
  }

  /**
   * Отрасли
   * @return industries
  */
  @Valid 
  @Schema(name = "industries", description = "Отрасли", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("industries")
  public List<@Valid IncludesIdName> getIndustries() {
    return industries;
  }

  public void setIndustries(List<@Valid IncludesIdName> industries) {
    this.industries = industries;
  }

  public SalaryStatisticsResultingParameters positionsCount(BigDecimal positionsCount) {
    this.positionsCount = positionsCount;
    return this;
  }

  /**
   * Количество позиций, по которым построена выборка
   * @return positionsCount
  */
  @NotNull @Valid 
  @Schema(name = "positions_count", description = "Количество позиций, по которым построена выборка", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("positions_count")
  public BigDecimal getPositionsCount() {
    return positionsCount;
  }

  public void setPositionsCount(BigDecimal positionsCount) {
    this.positionsCount = positionsCount;
  }

  public SalaryStatisticsResultingParameters sources(List<SourcesEnum> sources) {
    this.sources = sources;
    return this;
  }

  public SalaryStatisticsResultingParameters addSourcesItem(SourcesEnum sourcesItem) {
    if (this.sources == null) {
      this.sources = new ArrayList<>();
    }
    this.sources.add(sourcesItem);
    return this;
  }

  /**
   * Источники данных. Возможные значения:  * `SALARIES` — данные из банка зарплат; * `RESUMES` — данные из резюме; * `VACANCIES` — данные из вакансий 
   * @return sources
  */
  @NotNull 
  @Schema(name = "sources", description = "Источники данных. Возможные значения:  * `SALARIES` — данные из банка зарплат; * `RESUMES` — данные из резюме; * `VACANCIES` — данные из вакансий ", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("sources")
  public List<SourcesEnum> getSources() {
    return sources;
  }

  public void setSources(List<SourcesEnum> sources) {
    this.sources = sources;
  }

  public SalaryStatisticsResultingParameters specialities(List<@Valid IncludesIdName> specialities) {
    this.specialities = specialities;
    return this;
  }

  public SalaryStatisticsResultingParameters addSpecialitiesItem(IncludesIdName specialitiesItem) {
    if (this.specialities == null) {
      this.specialities = new ArrayList<>();
    }
    this.specialities.add(specialitiesItem);
    return this;
  }

  /**
   * Профессиональные области и специализаций
   * @return specialities
  */
  @Valid 
  @Schema(name = "specialities", description = "Профессиональные области и специализаций", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("specialities")
  public List<@Valid IncludesIdName> getSpecialities() {
    return specialities;
  }

  public void setSpecialities(List<@Valid IncludesIdName> specialities) {
    this.specialities = specialities;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SalaryStatisticsResultingParameters salaryStatisticsResultingParameters = (SalaryStatisticsResultingParameters) o;
    return Objects.equals(this.areas, salaryStatisticsResultingParameters.areas) &&
        Objects.equals(this.employeeLevels, salaryStatisticsResultingParameters.employeeLevels) &&
        Objects.equals(this.employersCount, salaryStatisticsResultingParameters.employersCount) &&
        Objects.equals(this.excludedAreas, salaryStatisticsResultingParameters.excludedAreas) &&
        Objects.equals(this.indirectCalculation, salaryStatisticsResultingParameters.indirectCalculation) &&
        Objects.equals(this.industries, salaryStatisticsResultingParameters.industries) &&
        Objects.equals(this.positionsCount, salaryStatisticsResultingParameters.positionsCount) &&
        Objects.equals(this.sources, salaryStatisticsResultingParameters.sources) &&
        Objects.equals(this.specialities, salaryStatisticsResultingParameters.specialities);
  }

  @Override
  public int hashCode() {
    return Objects.hash(areas, employeeLevels, employersCount, excludedAreas, indirectCalculation, industries, positionsCount, sources, specialities);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SalaryStatisticsResultingParameters {\n");
    sb.append("    areas: ").append(toIndentedString(areas)).append("\n");
    sb.append("    employeeLevels: ").append(toIndentedString(employeeLevels)).append("\n");
    sb.append("    employersCount: ").append(toIndentedString(employersCount)).append("\n");
    sb.append("    excludedAreas: ").append(toIndentedString(excludedAreas)).append("\n");
    sb.append("    indirectCalculation: ").append(toIndentedString(indirectCalculation)).append("\n");
    sb.append("    industries: ").append(toIndentedString(industries)).append("\n");
    sb.append("    positionsCount: ").append(toIndentedString(positionsCount)).append("\n");
    sb.append("    sources: ").append(toIndentedString(sources)).append("\n");
    sb.append("    specialities: ").append(toIndentedString(specialities)).append("\n");
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

