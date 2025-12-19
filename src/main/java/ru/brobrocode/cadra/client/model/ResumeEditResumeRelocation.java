package ru.brobrocode.cadra.client.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.annotation.Generated;
import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * Информация о возможности переезда в другой город
 */

@Schema(name = "ResumeEditResume_relocation", description = "Информация о возможности переезда в другой город")
@JsonTypeName("ResumeEditResume_relocation")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2025-08-17T15:41:09.394389505+05:00[Asia/Yekaterinburg]", comments = "Generator version: 7.6.0")
public class ResumeEditResumeRelocation {

  @Valid
  private List<IncludesId> area = new ArrayList<>();

  private IncludesId type;

  public ResumeEditResumeRelocation() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public ResumeEditResumeRelocation(List<IncludesId> area, IncludesId type) {
    this.area = area;
    this.type = type;
  }

  public ResumeEditResumeRelocation area(List<IncludesId> area) {
    this.area = area;
    return this;
  }

  public ResumeEditResumeRelocation addAreaItem(IncludesId areaItem) {
    if (this.area == null) {
      this.area = new ArrayList<>();
    }
    this.area.add(areaItem);
    return this;
  }

  /**
   * Список городов, в которые возможен переезд. Содержит элементы [справочника регионов](#tag/Obshie-spravochniki/operation/get-areas). Имеет смысл только с соответствующим полем `type` 
   * @return area
  */
  @NotNull @Valid 
  @Schema(name = "area", description = "Список городов, в которые возможен переезд. Содержит элементы [справочника регионов](#tag/Obshie-spravochniki/operation/get-areas). Имеет смысл только с соответствующим полем `type` ", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("area")
  public List<IncludesId> getArea() {
    return area;
  }

  public void setArea(List<IncludesId> area) {
    this.area = area;
  }

  public ResumeEditResumeRelocation type(IncludesId type) {
    this.type = type;
    return this;
  }

  /**
   * Готовность к переезду. Элемент справочника [relocation_type](#tag/Obshie-spravochniki/operation/get-dictionaries)
   * @return type
  */
  @NotNull @Valid 
  @Schema(name = "type", description = "Готовность к переезду. Элемент справочника [relocation_type](#tag/Obshie-spravochniki/operation/get-dictionaries)", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("type")
  public IncludesId getType() {
    return type;
  }

  public void setType(IncludesId type) {
    this.type = type;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ResumeEditResumeRelocation resumeEditResumeRelocation = (ResumeEditResumeRelocation) o;
    return Objects.equals(this.area, resumeEditResumeRelocation.area) &&
        Objects.equals(this.type, resumeEditResumeRelocation.type);
  }

  @Override
  public int hashCode() {
    return Objects.hash(area, type);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ResumeEditResumeRelocation {\n");
    sb.append("    area: ").append(toIndentedString(area)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
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

