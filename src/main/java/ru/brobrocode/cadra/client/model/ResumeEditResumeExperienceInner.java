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
 * ResumeEditResumeExperienceInner
 */

@JsonTypeName("ResumeEditResume_experience_inner")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2025-08-17T15:41:09.394389505+05:00[Asia/Yekaterinburg]", comments = "Generator version: 7.6.0")
public class ResumeEditResumeExperienceInner {

  private IncludesId area;

  private String company;

  private String companyId = null;

  private String companyUrl;

  private String description;

  private String end = null;

  @Valid
  private List<@Valid IncludesId> industries = new ArrayList<>();

  @Deprecated
  private ResumeEditResumeExperienceInnerIndustry industry;

  private String position;

  private String start;

  public ResumeEditResumeExperienceInner() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public ResumeEditResumeExperienceInner(String description, List<@Valid IncludesId> industries, String position, String start) {
    this.description = description;
    this.industries = industries;
    this.position = position;
    this.start = start;
  }

  public ResumeEditResumeExperienceInner area(IncludesId area) {
    this.area = area;
    return this;
  }

  /**
   * Регион расположения организации. Элемент [справочника регионов](#tag/Obshie-spravochniki/operation/get-areas)
   * @return area
  */
  @Valid 
  @Schema(name = "area", description = "Регион расположения организации. Элемент [справочника регионов](#tag/Obshie-spravochniki/operation/get-areas)", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("area")
  public IncludesId getArea() {
    return area;
  }

  public void setArea(IncludesId area) {
    this.area = area;
  }

  public ResumeEditResumeExperienceInner company(String company) {
    this.company = company;
    return this;
  }

  /**
   * Организация
   * @return company
  */
  
  @Schema(name = "company", description = "Организация", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("company")
  public String getCompany() {
    return company;
  }

  public void setCompany(String company) {
    this.company = company;
  }

  public ResumeEditResumeExperienceInner companyId(String companyId) {
    this.companyId = companyId;
    return this;
  }

  /**
   * Уникальный идентификатор организации, можно получить из [подсказок по организациям](#tag/Podskazki/operation/get-registered-companies-suggests)
   * @return companyId
  */
  
  @Schema(name = "company_id", description = "Уникальный идентификатор организации, можно получить из [подсказок по организациям](#tag/Podskazki/operation/get-registered-companies-suggests)", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("company_id")
  public String getCompanyId() {
    return companyId;
  }

  public void setCompanyId(String companyId) {
    this.companyId = companyId;
  }

  public ResumeEditResumeExperienceInner companyUrl(String companyUrl) {
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

  public ResumeEditResumeExperienceInner description(String description) {
    this.description = description;
    return this;
  }

  /**
   * Обязанности, функции, достижения
   * @return description
  */
  @NotNull 
  @Schema(name = "description", description = "Обязанности, функции, достижения", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("description")
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public ResumeEditResumeExperienceInner end(String end) {
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

  public ResumeEditResumeExperienceInner industries(List<@Valid IncludesId> industries) {
    this.industries = industries;
    return this;
  }

  public ResumeEditResumeExperienceInner addIndustriesItem(IncludesId industriesItem) {
    if (this.industries == null) {
      this.industries = new ArrayList<>();
    }
    this.industries.add(industriesItem);
    return this;
  }

  /**
   * Cписок отраслей компании. Элементы [справочника отраслей компаний](#tag/Obshie-spravochniki/operation/get-industries)
   * @return industries
  */
  @NotNull @Valid 
  @Schema(name = "industries", description = "Cписок отраслей компании. Элементы [справочника отраслей компаний](#tag/Obshie-spravochniki/operation/get-industries)", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("industries")
  public List<@Valid IncludesId> getIndustries() {
    return industries;
  }

  public void setIndustries(List<@Valid IncludesId> industries) {
    this.industries = industries;
  }

  public ResumeEditResumeExperienceInner industry(ResumeEditResumeExperienceInnerIndustry industry) {
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
  public ResumeEditResumeExperienceInnerIndustry getIndustry() {
    return industry;
  }

  /**
   * @deprecated
  */
  @Deprecated
  public void setIndustry(ResumeEditResumeExperienceInnerIndustry industry) {
    this.industry = industry;
  }

  public ResumeEditResumeExperienceInner position(String position) {
    this.position = position;
    return this;
  }

  /**
   * Должность
   * @return position
  */
  @NotNull 
  @Schema(name = "position", description = "Должность", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("position")
  public String getPosition() {
    return position;
  }

  public void setPosition(String position) {
    this.position = position;
  }

  public ResumeEditResumeExperienceInner start(String start) {
    this.start = start;
    return this;
  }

  /**
   * Начало работы (дата в формате `ГГГГ-ММ-ДД`)
   * @return start
  */
  @NotNull 
  @Schema(name = "start", description = "Начало работы (дата в формате `ГГГГ-ММ-ДД`)", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("start")
  public String getStart() {
    return start;
  }

  public void setStart(String start) {
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
    ResumeEditResumeExperienceInner resumeEditResumeExperienceInner = (ResumeEditResumeExperienceInner) o;
    return Objects.equals(this.area, resumeEditResumeExperienceInner.area) &&
        Objects.equals(this.company, resumeEditResumeExperienceInner.company) &&
        Objects.equals(this.companyId, resumeEditResumeExperienceInner.companyId) &&
        Objects.equals(this.companyUrl, resumeEditResumeExperienceInner.companyUrl) &&
        Objects.equals(this.description, resumeEditResumeExperienceInner.description) &&
        Objects.equals(this.end, resumeEditResumeExperienceInner.end) &&
        Objects.equals(this.industries, resumeEditResumeExperienceInner.industries) &&
        Objects.equals(this.industry, resumeEditResumeExperienceInner.industry) &&
        Objects.equals(this.position, resumeEditResumeExperienceInner.position) &&
        Objects.equals(this.start, resumeEditResumeExperienceInner.start);
  }

  @Override
  public int hashCode() {
    return Objects.hash(area, company, companyId, companyUrl, description, end, industries, industry, position, start);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ResumeEditResumeExperienceInner {\n");
    sb.append("    area: ").append(toIndentedString(area)).append("\n");
    sb.append("    company: ").append(toIndentedString(company)).append("\n");
    sb.append("    companyId: ").append(toIndentedString(companyId)).append("\n");
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

