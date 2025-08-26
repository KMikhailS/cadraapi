package ru.brobrocode.cadra.client.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.annotation.Generated;
import jakarta.validation.Valid;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * ResumeObjectsExperienceProperties
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2025-08-17T15:41:09.394389505+05:00[Asia/Yekaterinburg]", comments = "Generator version: 7.6.0")
public class ResumeObjectsExperienceProperties {

  private IncludesIdNameUrl area = null;

  private String company = null;

  private String companyId = null;

  private String companyUrl = null;

  private EmployersEmployerInfoShort employer = null;

  private String end = null;

  @Valid
  private List<@Valid IncludesIdName> industries = new ArrayList<>();

  @Deprecated
  private ResumeObjectsIndustry industry = null;

  private String position;

  private String start;

  private String description = null;

  public ResumeObjectsExperienceProperties area(IncludesIdNameUrl area) {
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
  public IncludesIdNameUrl getArea() {
    return area;
  }

  public void setArea(IncludesIdNameUrl area) {
    this.area = area;
  }

  public ResumeObjectsExperienceProperties company(String company) {
    this.company = company;
    return this;
  }

  /**
   * Название организации
   * @return company
  */
  
  @Schema(name = "company", description = "Название организации", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("company")
  public String getCompany() {
    return company;
  }

  public void setCompany(String company) {
    this.company = company;
  }

  public ResumeObjectsExperienceProperties companyId(String companyId) {
    this.companyId = companyId;
    return this;
  }

  /**
   * Уникальный идентификатор организации
   * @return companyId
  */
  
  @Schema(name = "company_id", description = "Уникальный идентификатор организации", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("company_id")
  public String getCompanyId() {
    return companyId;
  }

  public void setCompanyId(String companyId) {
    this.companyId = companyId;
  }

  public ResumeObjectsExperienceProperties companyUrl(String companyUrl) {
    this.companyUrl = companyUrl;
    return this;
  }

  /**
   * Сайт компании
   * @return companyUrl
  */
  
  @Schema(name = "company_url", description = "Сайт компании", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("company_url")
  public String getCompanyUrl() {
    return companyUrl;
  }

  public void setCompanyUrl(String companyUrl) {
    this.companyUrl = companyUrl;
  }

  public ResumeObjectsExperienceProperties employer(EmployersEmployerInfoShort employer) {
    this.employer = employer;
    return this;
  }

  /**
   * Get employer
   * @return employer
  */
  @Valid 
  @Schema(name = "employer", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("employer")
  public EmployersEmployerInfoShort getEmployer() {
    return employer;
  }

  public void setEmployer(EmployersEmployerInfoShort employer) {
    this.employer = employer;
  }

  public ResumeObjectsExperienceProperties end(String end) {
    this.end = end;
    return this;
  }

  /**
   * Окончание работы (дата в формате `ГГГГ-ММ-ДД`)
   * @return end
  */
  
  @Schema(name = "end", description = "Окончание работы (дата в формате `ГГГГ-ММ-ДД`)", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("end")
  public String getEnd() {
    return end;
  }

  public void setEnd(String end) {
    this.end = end;
  }

  public ResumeObjectsExperienceProperties industries(List<@Valid IncludesIdName> industries) {
    this.industries = industries;
    return this;
  }

  public ResumeObjectsExperienceProperties addIndustriesItem(IncludesIdName industriesItem) {
    if (this.industries == null) {
      this.industries = new ArrayList<>();
    }
    this.industries.add(industriesItem);
    return this;
  }

  /**
   * Список отраслей компании. Возможные значения приведены в [справочнике индустрий](#tag/Obshie-spravochniki/operation/get-industries)
   * @return industries
  */
  @Valid 
  @Schema(name = "industries", description = "Список отраслей компании. Возможные значения приведены в [справочнике индустрий](#tag/Obshie-spravochniki/operation/get-industries)", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("industries")
  public List<@Valid IncludesIdName> getIndustries() {
    return industries;
  }

  public void setIndustries(List<@Valid IncludesIdName> industries) {
    this.industries = industries;
  }

  public ResumeObjectsExperienceProperties industry(ResumeObjectsIndustry industry) {
    this.industry = industry;
    return this;
  }

  /**
   * Get industry
   * @return industry
   * @deprecated
  */
  @Valid 
  @Schema(name = "industry", deprecated = true, requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("industry")
  @Deprecated
  public ResumeObjectsIndustry getIndustry() {
    return industry;
  }

  /**
   * @deprecated
  */
  @Deprecated
  public void setIndustry(ResumeObjectsIndustry industry) {
    this.industry = industry;
  }

  public ResumeObjectsExperienceProperties position(String position) {
    this.position = position;
    return this;
  }

  /**
   * Должность
   * @return position
  */
  
  @Schema(name = "position", description = "Должность", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("position")
  public String getPosition() {
    return position;
  }

  public void setPosition(String position) {
    this.position = position;
  }

  public ResumeObjectsExperienceProperties start(String start) {
    this.start = start;
    return this;
  }

  /**
   * Начало работы (дата в формате `ГГГГ-ММ-ДД`)
   * @return start
  */
  
  @Schema(name = "start", description = "Начало работы (дата в формате `ГГГГ-ММ-ДД`)", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("start")
  public String getStart() {
    return start;
  }

  public void setStart(String start) {
    this.start = start;
  }

  public ResumeObjectsExperienceProperties description(String description) {
    this.description = description;
    return this;
  }

  /**
   * Обязанности, функции, достижения
   * @return description
  */
  
  @Schema(name = "description", description = "Обязанности, функции, достижения", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("description")
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ResumeObjectsExperienceProperties resumeObjectsExperienceProperties = (ResumeObjectsExperienceProperties) o;
    return Objects.equals(this.area, resumeObjectsExperienceProperties.area) &&
        Objects.equals(this.company, resumeObjectsExperienceProperties.company) &&
        Objects.equals(this.companyId, resumeObjectsExperienceProperties.companyId) &&
        Objects.equals(this.companyUrl, resumeObjectsExperienceProperties.companyUrl) &&
        Objects.equals(this.employer, resumeObjectsExperienceProperties.employer) &&
        Objects.equals(this.end, resumeObjectsExperienceProperties.end) &&
        Objects.equals(this.industries, resumeObjectsExperienceProperties.industries) &&
        Objects.equals(this.industry, resumeObjectsExperienceProperties.industry) &&
        Objects.equals(this.position, resumeObjectsExperienceProperties.position) &&
        Objects.equals(this.start, resumeObjectsExperienceProperties.start) &&
        Objects.equals(this.description, resumeObjectsExperienceProperties.description);
  }

  @Override
  public int hashCode() {
    return Objects.hash(area, company, companyId, companyUrl, employer, end, industries, industry, position, start, description);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ResumeObjectsExperienceProperties {\n");
    sb.append("    area: ").append(toIndentedString(area)).append("\n");
    sb.append("    company: ").append(toIndentedString(company)).append("\n");
    sb.append("    companyId: ").append(toIndentedString(companyId)).append("\n");
    sb.append("    companyUrl: ").append(toIndentedString(companyUrl)).append("\n");
    sb.append("    employer: ").append(toIndentedString(employer)).append("\n");
    sb.append("    end: ").append(toIndentedString(end)).append("\n");
    sb.append("    industries: ").append(toIndentedString(industries)).append("\n");
    sb.append("    industry: ").append(toIndentedString(industry)).append("\n");
    sb.append("    position: ").append(toIndentedString(position)).append("\n");
    sb.append("    start: ").append(toIndentedString(start)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
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

