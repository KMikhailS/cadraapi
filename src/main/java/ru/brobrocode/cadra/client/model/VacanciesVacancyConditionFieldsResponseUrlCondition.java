package ru.brobrocode.cadra.client.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.annotation.Generated;
import jakarta.validation.Valid;

import java.math.BigDecimal;
import java.util.Objects;

/**
 * VacanciesVacancyConditionFieldsResponseUrlCondition
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2025-08-17T15:41:09.394389505+05:00[Asia/Yekaterinburg]", comments = "Generator version: 7.6.0")
public class VacanciesVacancyConditionFieldsResponseUrlCondition {

  private BigDecimal maxLength = null;

  private BigDecimal minLength = null;

  private Boolean required = null;

  private String regexp = null;

  public VacanciesVacancyConditionFieldsResponseUrlCondition maxLength(BigDecimal maxLength) {
    this.maxLength = maxLength;
    return this;
  }

  /**
   * Максимальная длина для текстовых полей
   * @return maxLength
  */
  @Valid 
  @Schema(name = "max_length", description = "Максимальная длина для текстовых полей", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("max_length")
  public BigDecimal getMaxLength() {
    return maxLength;
  }

  public void setMaxLength(BigDecimal maxLength) {
    this.maxLength = maxLength;
  }

  public VacanciesVacancyConditionFieldsResponseUrlCondition minLength(BigDecimal minLength) {
    this.minLength = minLength;
    return this;
  }

  /**
   * Минимальная длина для текстовых полей
   * @return minLength
  */
  @Valid 
  @Schema(name = "min_length", description = "Минимальная длина для текстовых полей", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("min_length")
  public BigDecimal getMinLength() {
    return minLength;
  }

  public void setMinLength(BigDecimal minLength) {
    this.minLength = minLength;
  }

  public VacanciesVacancyConditionFieldsResponseUrlCondition required(Boolean required) {
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

  public VacanciesVacancyConditionFieldsResponseUrlCondition regexp(String regexp) {
    this.regexp = regexp;
    return this;
  }

  /**
   * Регулярное выражение, которому должно отвечать значение поля
   * @return regexp
  */
  
  @Schema(name = "regexp", description = "Регулярное выражение, которому должно отвечать значение поля", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("regexp")
  public String getRegexp() {
    return regexp;
  }

  public void setRegexp(String regexp) {
    this.regexp = regexp;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    VacanciesVacancyConditionFieldsResponseUrlCondition vacanciesVacancyConditionFieldsResponseUrlCondition = (VacanciesVacancyConditionFieldsResponseUrlCondition) o;
    return Objects.equals(this.maxLength, vacanciesVacancyConditionFieldsResponseUrlCondition.maxLength) &&
        Objects.equals(this.minLength, vacanciesVacancyConditionFieldsResponseUrlCondition.minLength) &&
        Objects.equals(this.required, vacanciesVacancyConditionFieldsResponseUrlCondition.required) &&
        Objects.equals(this.regexp, vacanciesVacancyConditionFieldsResponseUrlCondition.regexp);
  }

  @Override
  public int hashCode() {
    return Objects.hash(maxLength, minLength, required, regexp);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class VacanciesVacancyConditionFieldsResponseUrlCondition {\n");
    sb.append("    maxLength: ").append(toIndentedString(maxLength)).append("\n");
    sb.append("    minLength: ").append(toIndentedString(minLength)).append("\n");
    sb.append("    required: ").append(toIndentedString(required)).append("\n");
    sb.append("    regexp: ").append(toIndentedString(regexp)).append("\n");
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

