package ru.brobrocode.cadra.client.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.annotation.Generated;
import jakarta.validation.Valid;

import java.math.BigDecimal;
import java.util.Objects;

/**
 * ResumesResumeConditionFieldsRequiredLengthWithTitle
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2025-08-17T15:41:09.394389505+05:00[Asia/Yekaterinburg]", comments = "Generator version: 7.6.0")
public class ResumesResumeConditionFieldsRequiredLengthWithTitle {

  private BigDecimal maxLength = null;

  private BigDecimal minLength = null;

  private Boolean required = null;

  public ResumesResumeConditionFieldsRequiredLengthWithTitle maxLength(BigDecimal maxLength) {
    this.maxLength = maxLength;
    return this;
  }

  /**
   * Максимальная длина для текстовых полей. Рассчитывается для текста без символов переноса строки (`  `). `null` — если количество не ограничено
   * @return maxLength
  */
  @Valid 
  @Schema(name = "max_length", description = "Максимальная длина для текстовых полей. Рассчитывается для текста без символов переноса строки (`  `). `null` — если количество не ограничено", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("max_length")
  public BigDecimal getMaxLength() {
    return maxLength;
  }

  public void setMaxLength(BigDecimal maxLength) {
    this.maxLength = maxLength;
  }

  public ResumesResumeConditionFieldsRequiredLengthWithTitle minLength(BigDecimal minLength) {
    this.minLength = minLength;
    return this;
  }

  /**
   * Минимальная длина для текстовых полей. Рассчитывается для текста без символов переноса строки (`  `). `null` — если количество не ограничено
   * @return minLength
  */
  @Valid 
  @Schema(name = "min_length", description = "Минимальная длина для текстовых полей. Рассчитывается для текста без символов переноса строки (`  `). `null` — если количество не ограничено", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("min_length")
  public BigDecimal getMinLength() {
    return minLength;
  }

  public void setMinLength(BigDecimal minLength) {
    this.minLength = minLength;
  }

  public ResumesResumeConditionFieldsRequiredLengthWithTitle required(Boolean required) {
    this.required = required;
    return this;
  }

  /**
   * Является ли поле необходимым? Для строковых значений поле не должно быть `null` или `\"\"`
   * @return required
  */
  
  @Schema(name = "required", description = "Является ли поле необходимым? Для строковых значений поле не должно быть `null` или `\"\"`", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
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
    ResumesResumeConditionFieldsRequiredLengthWithTitle resumesResumeConditionFieldsRequiredLengthWithTitle = (ResumesResumeConditionFieldsRequiredLengthWithTitle) o;
    return Objects.equals(this.maxLength, resumesResumeConditionFieldsRequiredLengthWithTitle.maxLength) &&
        Objects.equals(this.minLength, resumesResumeConditionFieldsRequiredLengthWithTitle.minLength) &&
        Objects.equals(this.required, resumesResumeConditionFieldsRequiredLengthWithTitle.required);
  }

  @Override
  public int hashCode() {
    return Objects.hash(maxLength, minLength, required);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ResumesResumeConditionFieldsRequiredLengthWithTitle {\n");
    sb.append("    maxLength: ").append(toIndentedString(maxLength)).append("\n");
    sb.append("    minLength: ").append(toIndentedString(minLength)).append("\n");
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

