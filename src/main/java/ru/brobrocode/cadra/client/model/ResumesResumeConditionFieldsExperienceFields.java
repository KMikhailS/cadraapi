package ru.brobrocode.cadra.client.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.annotation.Generated;
import jakarta.validation.Valid;

import java.util.Objects;

/**
 * ResumesResumeConditionFieldsExperienceFields
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2025-08-17T15:41:09.394389505+05:00[Asia/Yekaterinburg]", comments = "Generator version: 7.6.0")
public class ResumesResumeConditionFieldsExperienceFields {

  private ResumesResumeConditionFieldsRequiredWithTitle area = null;

  private ResumesResumeConditionFieldsRequiredLengthWithTitle company = null;

  private ResumesResumeConditionFieldsRequiredLengthWithTitle companyUrl = null;

  private ResumesResumeConditionFieldsRequiredLengthWithTitle description = null;

  private ResumesResumeConditionFieldsRequiredDateWithTitle end = null;

  private ResumesResumeConditionFieldsRequiredCountWithTitle industries = null;

  private ResumesResumeConditionFieldsRequiredWithTitle industry = null;

  private ResumesResumeConditionFieldsRequiredLengthWithTitle position = null;

  private ResumesResumeConditionFieldsRequiredDateWithTitle start = null;

  public ResumesResumeConditionFieldsExperienceFields area(ResumesResumeConditionFieldsRequiredWithTitle area) {
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
  public ResumesResumeConditionFieldsRequiredWithTitle getArea() {
    return area;
  }

  public void setArea(ResumesResumeConditionFieldsRequiredWithTitle area) {
    this.area = area;
  }

  public ResumesResumeConditionFieldsExperienceFields company(ResumesResumeConditionFieldsRequiredLengthWithTitle company) {
    this.company = company;
    return this;
  }

  /**
   * Get company
   * @return company
  */
  @Valid 
  @Schema(name = "company", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("company")
  public ResumesResumeConditionFieldsRequiredLengthWithTitle getCompany() {
    return company;
  }

  public void setCompany(ResumesResumeConditionFieldsRequiredLengthWithTitle company) {
    this.company = company;
  }

  public ResumesResumeConditionFieldsExperienceFields companyUrl(ResumesResumeConditionFieldsRequiredLengthWithTitle companyUrl) {
    this.companyUrl = companyUrl;
    return this;
  }

  /**
   * Get companyUrl
   * @return companyUrl
  */
  @Valid 
  @Schema(name = "company_url", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("company_url")
  public ResumesResumeConditionFieldsRequiredLengthWithTitle getCompanyUrl() {
    return companyUrl;
  }

  public void setCompanyUrl(ResumesResumeConditionFieldsRequiredLengthWithTitle companyUrl) {
    this.companyUrl = companyUrl;
  }

  public ResumesResumeConditionFieldsExperienceFields description(ResumesResumeConditionFieldsRequiredLengthWithTitle description) {
    this.description = description;
    return this;
  }

  /**
   * Get description
   * @return description
  */
  @Valid 
  @Schema(name = "description", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("description")
  public ResumesResumeConditionFieldsRequiredLengthWithTitle getDescription() {
    return description;
  }

  public void setDescription(ResumesResumeConditionFieldsRequiredLengthWithTitle description) {
    this.description = description;
  }

  public ResumesResumeConditionFieldsExperienceFields end(ResumesResumeConditionFieldsRequiredDateWithTitle end) {
    this.end = end;
    return this;
  }

  /**
   * Get end
   * @return end
  */
  @Valid 
  @Schema(name = "end", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("end")
  public ResumesResumeConditionFieldsRequiredDateWithTitle getEnd() {
    return end;
  }

  public void setEnd(ResumesResumeConditionFieldsRequiredDateWithTitle end) {
    this.end = end;
  }

  public ResumesResumeConditionFieldsExperienceFields industries(ResumesResumeConditionFieldsRequiredCountWithTitle industries) {
    this.industries = industries;
    return this;
  }

  /**
   * Get industries
   * @return industries
  */
  @Valid 
  @Schema(name = "industries", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("industries")
  public ResumesResumeConditionFieldsRequiredCountWithTitle getIndustries() {
    return industries;
  }

  public void setIndustries(ResumesResumeConditionFieldsRequiredCountWithTitle industries) {
    this.industries = industries;
  }

  public ResumesResumeConditionFieldsExperienceFields industry(ResumesResumeConditionFieldsRequiredWithTitle industry) {
    this.industry = industry;
    return this;
  }

  /**
   * Get industry
   * @return industry
  */
  @Valid 
  @Schema(name = "industry", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("industry")
  public ResumesResumeConditionFieldsRequiredWithTitle getIndustry() {
    return industry;
  }

  public void setIndustry(ResumesResumeConditionFieldsRequiredWithTitle industry) {
    this.industry = industry;
  }

  public ResumesResumeConditionFieldsExperienceFields position(ResumesResumeConditionFieldsRequiredLengthWithTitle position) {
    this.position = position;
    return this;
  }

  /**
   * Get position
   * @return position
  */
  @Valid 
  @Schema(name = "position", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("position")
  public ResumesResumeConditionFieldsRequiredLengthWithTitle getPosition() {
    return position;
  }

  public void setPosition(ResumesResumeConditionFieldsRequiredLengthWithTitle position) {
    this.position = position;
  }

  public ResumesResumeConditionFieldsExperienceFields start(ResumesResumeConditionFieldsRequiredDateWithTitle start) {
    this.start = start;
    return this;
  }

  /**
   * Get start
   * @return start
  */
  @Valid 
  @Schema(name = "start", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("start")
  public ResumesResumeConditionFieldsRequiredDateWithTitle getStart() {
    return start;
  }

  public void setStart(ResumesResumeConditionFieldsRequiredDateWithTitle start) {
    this.start = start;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ResumesResumeConditionFieldsExperienceFields resumesResumeConditionFieldsExperienceFields = (ResumesResumeConditionFieldsExperienceFields) o;
    return Objects.equals(this.area, resumesResumeConditionFieldsExperienceFields.area) &&
        Objects.equals(this.company, resumesResumeConditionFieldsExperienceFields.company) &&
        Objects.equals(this.companyUrl, resumesResumeConditionFieldsExperienceFields.companyUrl) &&
        Objects.equals(this.description, resumesResumeConditionFieldsExperienceFields.description) &&
        Objects.equals(this.end, resumesResumeConditionFieldsExperienceFields.end) &&
        Objects.equals(this.industries, resumesResumeConditionFieldsExperienceFields.industries) &&
        Objects.equals(this.industry, resumesResumeConditionFieldsExperienceFields.industry) &&
        Objects.equals(this.position, resumesResumeConditionFieldsExperienceFields.position) &&
        Objects.equals(this.start, resumesResumeConditionFieldsExperienceFields.start);
  }

  @Override
  public int hashCode() {
    return Objects.hash(area, company, companyUrl, description, end, industries, industry, position, start);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ResumesResumeConditionFieldsExperienceFields {\n");
    sb.append("    area: ").append(toIndentedString(area)).append("\n");
    sb.append("    company: ").append(toIndentedString(company)).append("\n");
    sb.append("    companyUrl: ").append(toIndentedString(companyUrl)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    end: ").append(toIndentedString(end)).append("\n");
    sb.append("    industries: ").append(toIndentedString(industries)).append("\n");
    sb.append("    industry: ").append(toIndentedString(industry)).append("\n");
    sb.append("    position: ").append(toIndentedString(position)).append("\n");
    sb.append("    start: ").append(toIndentedString(start)).append("\n");
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

