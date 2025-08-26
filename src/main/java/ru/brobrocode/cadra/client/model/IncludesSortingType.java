package ru.brobrocode.cadra.client.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.annotation.Generated;
import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;

import java.util.Objects;

/**
 * IncludesSortingType
 */

@JsonTypeName("_IncludesSortingType")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2025-08-17T15:41:09.394389505+05:00[Asia/Yekaterinburg]", comments = "Generator version: 7.6.0")
public class IncludesSortingType {

  private IncludesIdName orderedBy;

  public IncludesSortingType() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public IncludesSortingType(IncludesIdName orderedBy) {
    this.orderedBy = orderedBy;
  }

  public IncludesSortingType orderedBy(IncludesIdName orderedBy) {
    this.orderedBy = orderedBy;
    return this;
  }

  /**
   * Применяемый тип сортировки
   * @return orderedBy
  */
  @NotNull @Valid 
  @Schema(name = "ordered_by", description = "Применяемый тип сортировки", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("ordered_by")
  public IncludesIdName getOrderedBy() {
    return orderedBy;
  }

  public void setOrderedBy(IncludesIdName orderedBy) {
    this.orderedBy = orderedBy;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    IncludesSortingType includesSortingType = (IncludesSortingType) o;
    return Objects.equals(this.orderedBy, includesSortingType.orderedBy);
  }

  @Override
  public int hashCode() {
    return Objects.hash(orderedBy);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IncludesSortingType {\n");
    sb.append("    orderedBy: ").append(toIndentedString(orderedBy)).append("\n");
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

