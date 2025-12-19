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
 * ResumeObjectsRelocationPublic
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2025-08-17T15:41:09.394389505+05:00[Asia/Yekaterinburg]", comments = "Generator version: 7.6.0")
public class ResumeObjectsRelocationPublic {

  @Valid
  private List<@Valid IncludesArea> area = new ArrayList<>();

  @Valid
  private List<@Valid IncludesIdName> district = new ArrayList<>();

  private IncludesIdName type;

  public ResumeObjectsRelocationPublic() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public ResumeObjectsRelocationPublic(IncludesIdName type) {
    this.type = type;
  }

  public ResumeObjectsRelocationPublic area(List<@Valid IncludesArea> area) {
    this.area = area;
    return this;
  }

  public ResumeObjectsRelocationPublic addAreaItem(IncludesArea areaItem) {
    if (this.area == null) {
      this.area = new ArrayList<>();
    }
    this.area.add(areaItem);
    return this;
  }

  /**
   * Список городов, в которые возможен переезд. Имеет смысл только с соответствующим полем `type`
   * @return area
  */
  @Valid 
  @Schema(name = "area", description = "Список городов, в которые возможен переезд. Имеет смысл только с соответствующим полем `type`", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("area")
  public List<@Valid IncludesArea> getArea() {
    return area;
  }

  public void setArea(List<@Valid IncludesArea> area) {
    this.area = area;
  }

  public ResumeObjectsRelocationPublic district(List<@Valid IncludesIdName> district) {
    this.district = district;
    return this;
  }

  public ResumeObjectsRelocationPublic addDistrictItem(IncludesIdName districtItem) {
    if (this.district == null) {
      this.district = new ArrayList<>();
    }
    this.district.add(districtItem);
    return this;
  }

  /**
   * Список районов, в которые возможен переезд. Имеет смысл только с соответствующим полем `type`
   * @return district
  */
  @Valid 
  @Schema(name = "district", description = "Список районов, в которые возможен переезд. Имеет смысл только с соответствующим полем `type`", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("district")
  public List<@Valid IncludesIdName> getDistrict() {
    return district;
  }

  public void setDistrict(List<@Valid IncludesIdName> district) {
    this.district = district;
  }

  public ResumeObjectsRelocationPublic type(IncludesIdName type) {
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
  public IncludesIdName getType() {
    return type;
  }

  public void setType(IncludesIdName type) {
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
    ResumeObjectsRelocationPublic resumeObjectsRelocationPublic = (ResumeObjectsRelocationPublic) o;
    return Objects.equals(this.area, resumeObjectsRelocationPublic.area) &&
        Objects.equals(this.district, resumeObjectsRelocationPublic.district) &&
        Objects.equals(this.type, resumeObjectsRelocationPublic.type);
  }

  @Override
  public int hashCode() {
    return Objects.hash(area, district, type);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ResumeObjectsRelocationPublic {\n");
    sb.append("    area: ").append(toIndentedString(area)).append("\n");
    sb.append("    district: ").append(toIndentedString(district)).append("\n");
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

