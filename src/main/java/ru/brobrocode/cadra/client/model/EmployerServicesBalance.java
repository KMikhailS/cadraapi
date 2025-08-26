package ru.brobrocode.cadra.client.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.annotation.Generated;
import jakarta.validation.constraints.NotNull;

import java.util.Objects;

/**
 * EmployerServicesBalance
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2025-08-17T15:41:09.394389505+05:00[Asia/Yekaterinburg]", comments = "Generator version: 7.6.0")
public class EmployerServicesBalance {

  private Integer actual;

  private Integer initial;

  public EmployerServicesBalance() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public EmployerServicesBalance(Integer actual, Integer initial) {
    this.actual = actual;
    this.initial = initial;
  }

  public EmployerServicesBalance actual(Integer actual) {
    this.actual = actual;
    return this;
  }

  /**
   * Текущее значение баланса
   * @return actual
  */
  @NotNull 
  @Schema(name = "actual", description = "Текущее значение баланса", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("actual")
  public Integer getActual() {
    return actual;
  }

  public void setActual(Integer actual) {
    this.actual = actual;
  }

  public EmployerServicesBalance initial(Integer initial) {
    this.initial = initial;
    return this;
  }

  /**
   * Значение баланса на момент активации услуги
   * @return initial
  */
  @NotNull 
  @Schema(name = "initial", description = "Значение баланса на момент активации услуги", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("initial")
  public Integer getInitial() {
    return initial;
  }

  public void setInitial(Integer initial) {
    this.initial = initial;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EmployerServicesBalance employerServicesBalance = (EmployerServicesBalance) o;
    return Objects.equals(this.actual, employerServicesBalance.actual) &&
        Objects.equals(this.initial, employerServicesBalance.initial);
  }

  @Override
  public int hashCode() {
    return Objects.hash(actual, initial);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EmployerServicesBalance {\n");
    sb.append("    actual: ").append(toIndentedString(actual)).append("\n");
    sb.append("    initial: ").append(toIndentedString(initial)).append("\n");
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

