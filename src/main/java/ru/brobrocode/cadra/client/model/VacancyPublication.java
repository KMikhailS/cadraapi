package ru.brobrocode.cadra.client.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.annotation.Generated;
import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;

import java.math.BigDecimal;
import java.util.Objects;

/**
 * VacancyPublication
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2025-08-17T15:41:09.394389505+05:00[Asia/Yekaterinburg]", comments = "Generator version: 7.6.0")
public class VacancyPublication {

  private String areasUrl;

  private BigDecimal count;

  private String name;

  public VacancyPublication() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public VacancyPublication(String areasUrl, BigDecimal count, String name) {
    this.areasUrl = areasUrl;
    this.count = count;
    this.name = name;
  }

  public VacancyPublication areasUrl(String areasUrl) {
    this.areasUrl = areasUrl;
    return this;
  }

  /**
   * URL на список регионов, в которых можно опубликовать вакансию данного типа. Список возвращается в древовидной структуре и публикация вакансий возможна только в конечных (листовых) узлах дерева. Они помечены флагом `can_publish=true`
   * @return areasUrl
  */
  @NotNull 
  @Schema(name = "areas_url", description = "URL на список регионов, в которых можно опубликовать вакансию данного типа. Список возвращается в древовидной структуре и публикация вакансий возможна только в конечных (листовых) узлах дерева. Они помечены флагом `can_publish=true`", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("areas_url")
  public String getAreasUrl() {
    return areasUrl;
  }

  public void setAreasUrl(String areasUrl) {
    this.areasUrl = areasUrl;
  }

  public VacancyPublication count(BigDecimal count) {
    this.count = count;
    return this;
  }

  /**
   * Количество публикаций в регионе, доступных работодателю
   * @return count
  */
  @NotNull @Valid 
  @Schema(name = "count", description = "Количество публикаций в регионе, доступных работодателю", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("count")
  public BigDecimal getCount() {
    return count;
  }

  public void setCount(BigDecimal count) {
    this.count = count;
  }

  public VacancyPublication name(String name) {
    this.name = name;
    return this;
  }

  /**
   * Название региона
   * @return name
  */
  @NotNull 
  @Schema(name = "name", description = "Название региона", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("name")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    VacancyPublication vacancyPublication = (VacancyPublication) o;
    return Objects.equals(this.areasUrl, vacancyPublication.areasUrl) &&
        Objects.equals(this.count, vacancyPublication.count) &&
        Objects.equals(this.name, vacancyPublication.name);
  }

  @Override
  public int hashCode() {
    return Objects.hash(areasUrl, count, name);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class VacancyPublication {\n");
    sb.append("    areasUrl: ").append(toIndentedString(areasUrl)).append("\n");
    sb.append("    count: ").append(toIndentedString(count)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
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

