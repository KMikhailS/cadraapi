package ru.brobrocode.cadra.client.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.annotation.Generated;
import jakarta.validation.Valid;

import java.util.Objects;

/**
 * ResumesResumeConditionFieldsRelocationFields
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2025-08-17T15:41:09.394389505+05:00[Asia/Yekaterinburg]", comments = "Generator version: 7.6.0")
public class ResumesResumeConditionFieldsRelocationFields {

  private ResumesResumeConditionFieldsRequiredCountWithTitle area = null;

  private ResumesResumeConditionFieldsRequiredCountWithTitle district = null;

  private ResumesResumeConditionFieldsRequiredWithTitle type = null;

  public ResumesResumeConditionFieldsRelocationFields area(ResumesResumeConditionFieldsRequiredCountWithTitle area) {
    this.area = area;
    return this;
  }

  /**
   * Get area
   * @return area
  */
  @Valid 
  @Schema(name = "area", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("area")
  public ResumesResumeConditionFieldsRequiredCountWithTitle getArea() {
    return area;
  }

  public void setArea(ResumesResumeConditionFieldsRequiredCountWithTitle area) {
    this.area = area;
  }

  public ResumesResumeConditionFieldsRelocationFields district(ResumesResumeConditionFieldsRequiredCountWithTitle district) {
    this.district = district;
    return this;
  }

  /**
   * Get district
   * @return district
  */
  @Valid 
  @Schema(name = "district", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("district")
  public ResumesResumeConditionFieldsRequiredCountWithTitle getDistrict() {
    return district;
  }

  public void setDistrict(ResumesResumeConditionFieldsRequiredCountWithTitle district) {
    this.district = district;
  }

  public ResumesResumeConditionFieldsRelocationFields type(ResumesResumeConditionFieldsRequiredWithTitle type) {
    this.type = type;
    return this;
  }

  /**
   * Get type
   * @return type
  */
  @Valid 
  @Schema(name = "type", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("type")
  public ResumesResumeConditionFieldsRequiredWithTitle getType() {
    return type;
  }

  public void setType(ResumesResumeConditionFieldsRequiredWithTitle type) {
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
    ResumesResumeConditionFieldsRelocationFields resumesResumeConditionFieldsRelocationFields = (ResumesResumeConditionFieldsRelocationFields) o;
    return Objects.equals(this.area, resumesResumeConditionFieldsRelocationFields.area) &&
        Objects.equals(this.district, resumesResumeConditionFieldsRelocationFields.district) &&
        Objects.equals(this.type, resumesResumeConditionFieldsRelocationFields.type);
  }

  @Override
  public int hashCode() {
    return Objects.hash(area, district, type);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ResumesResumeConditionFieldsRelocationFields {\n");
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

