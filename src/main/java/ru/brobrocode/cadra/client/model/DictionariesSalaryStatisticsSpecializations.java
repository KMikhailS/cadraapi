package ru.brobrocode.cadra.client.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.annotation.Generated;
import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * DictionariesSalaryStatisticsSpecializations
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2025-08-17T15:41:09.394389505+05:00[Asia/Yekaterinburg]", comments = "Generator version: 7.6.0")
public class DictionariesSalaryStatisticsSpecializations {

  @Valid
  private List<@Valid IncludesIdNameDesc> specializations = new ArrayList<>();

  public DictionariesSalaryStatisticsSpecializations() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public DictionariesSalaryStatisticsSpecializations(List<@Valid IncludesIdNameDesc> specializations) {
    this.specializations = specializations;
  }

  public DictionariesSalaryStatisticsSpecializations specializations(List<@Valid IncludesIdNameDesc> specializations) {
    this.specializations = specializations;
    return this;
  }

  public DictionariesSalaryStatisticsSpecializations addSpecializationsItem(IncludesIdNameDesc specializationsItem) {
    if (this.specializations == null) {
      this.specializations = new ArrayList<>();
    }
    this.specializations.add(specializationsItem);
    return this;
  }

  /**
   * Get specializations
   * @return specializations
  */
  @NotNull @Valid 
  @Schema(name = "specializations", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("specializations")
  public List<@Valid IncludesIdNameDesc> getSpecializations() {
    return specializations;
  }

  public void setSpecializations(List<@Valid IncludesIdNameDesc> specializations) {
    this.specializations = specializations;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DictionariesSalaryStatisticsSpecializations dictionariesSalaryStatisticsSpecializations = (DictionariesSalaryStatisticsSpecializations) o;
    return Objects.equals(this.specializations, dictionariesSalaryStatisticsSpecializations.specializations);
  }

  @Override
  public int hashCode() {
    return Objects.hash(specializations);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DictionariesSalaryStatisticsSpecializations {\n");
    sb.append("    specializations: ").append(toIndentedString(specializations)).append("\n");
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

