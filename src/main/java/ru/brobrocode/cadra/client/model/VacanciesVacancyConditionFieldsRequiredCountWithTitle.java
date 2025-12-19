package ru.brobrocode.cadra.client.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.annotation.Generated;
import jakarta.validation.Valid;

import java.math.BigDecimal;
import java.util.Objects;

/**
 * VacanciesVacancyConditionFieldsRequiredCountWithTitle
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2025-08-17T15:41:09.394389505+05:00[Asia/Yekaterinburg]", comments = "Generator version: 7.6.0")
public class VacanciesVacancyConditionFieldsRequiredCountWithTitle {

  private BigDecimal maxCount;

  private BigDecimal minCount;

  private Boolean required = null;

  public VacanciesVacancyConditionFieldsRequiredCountWithTitle maxCount(BigDecimal maxCount) {
    this.maxCount = maxCount;
    return this;
  }

  /**
   * Максимальное количество объектов для полей, в которых передается список. Если `null` — количество неограниченно
   * @return maxCount
  */
  @Valid 
  @Schema(name = "max_count", description = "Максимальное количество объектов для полей, в которых передается список. Если `null` — количество неограниченно", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("max_count")
  public BigDecimal getMaxCount() {
    return maxCount;
  }

  public void setMaxCount(BigDecimal maxCount) {
    this.maxCount = maxCount;
  }

  public VacanciesVacancyConditionFieldsRequiredCountWithTitle minCount(BigDecimal minCount) {
    this.minCount = minCount;
    return this;
  }

  /**
   * Минимальное количество объектов для полей, в которых передается список
   * @return minCount
  */
  @Valid 
  @Schema(name = "min_count", description = "Минимальное количество объектов для полей, в которых передается список", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("min_count")
  public BigDecimal getMinCount() {
    return minCount;
  }

  public void setMinCount(BigDecimal minCount) {
    this.minCount = minCount;
  }

  public VacanciesVacancyConditionFieldsRequiredCountWithTitle required(Boolean required) {
    this.required = required;
    return this;
  }

  /**
   * Является ли поле необходимым?
   * @return required
  */
  
  @Schema(name = "required", description = "Является ли поле необходимым?", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("required")
  public Boolean getRequired() {
    return required;
  }

  public void setRequired(Boolean required) {
    this.required = required;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    VacanciesVacancyConditionFieldsRequiredCountWithTitle vacanciesVacancyConditionFieldsRequiredCountWithTitle = (VacanciesVacancyConditionFieldsRequiredCountWithTitle) o;
    return Objects.equals(this.maxCount, vacanciesVacancyConditionFieldsRequiredCountWithTitle.maxCount) &&
        Objects.equals(this.minCount, vacanciesVacancyConditionFieldsRequiredCountWithTitle.minCount) &&
        Objects.equals(this.required, vacanciesVacancyConditionFieldsRequiredCountWithTitle.required);
  }

  @Override
  public int hashCode() {
    return Objects.hash(maxCount, minCount, required);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class VacanciesVacancyConditionFieldsRequiredCountWithTitle {\n");
    sb.append("    maxCount: ").append(toIndentedString(maxCount)).append("\n");
    sb.append("    minCount: ").append(toIndentedString(minCount)).append("\n");
    sb.append("    required: ").append(toIndentedString(required)).append("\n");
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

