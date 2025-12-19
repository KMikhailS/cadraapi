package ru.brobrocode.cadra.client.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.annotation.Generated;
import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import org.springframework.format.annotation.DateTimeFormat;

import java.time.OffsetDateTime;
import java.util.Objects;

/**
 * ProfessionalRolesRole
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2025-08-17T15:41:09.394389505+05:00[Asia/Yekaterinburg]", comments = "Generator version: 7.6.0")
public class ProfessionalRolesRole {

  private Boolean acceptIncompleteResumes;

  private String id;

  private Boolean isDefault;

  private String name;

  private Boolean searchDeprecated;

  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
  private OffsetDateTime searchDeprecatedDatetime = null;

  private Boolean selectDeprecated;

  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
  private OffsetDateTime selectDeprecatedDatetime = null;

  public ProfessionalRolesRole() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public ProfessionalRolesRole(Boolean acceptIncompleteResumes, String id, Boolean isDefault, String name) {
    this.acceptIncompleteResumes = acceptIncompleteResumes;
    this.id = id;
    this.isDefault = isDefault;
    this.name = name;
  }

  public ProfessionalRolesRole acceptIncompleteResumes(Boolean acceptIncompleteResumes) {
    this.acceptIncompleteResumes = acceptIncompleteResumes;
    return this;
  }

  /**
   * На роль принимаются отклики неполным резюме
   * @return acceptIncompleteResumes
  */
  @NotNull 
  @Schema(name = "accept_incomplete_resumes", example = "true", description = "На роль принимаются отклики неполным резюме", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("accept_incomplete_resumes")
  public Boolean getAcceptIncompleteResumes() {
    return acceptIncompleteResumes;
  }

  public void setAcceptIncompleteResumes(Boolean acceptIncompleteResumes) {
    this.acceptIncompleteResumes = acceptIncompleteResumes;
  }

  public ProfessionalRolesRole id(String id) {
    this.id = id;
    return this;
  }

  /**
   * Идентификатор профессиональной роли
   * @return id
  */
  @NotNull @Size(min = 1) 
  @Schema(name = "id", example = "1", description = "Идентификатор профессиональной роли", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("id")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public ProfessionalRolesRole isDefault(Boolean isDefault) {
    this.isDefault = isDefault;
    return this;
  }

  /**
   * Дефолтная роль
   * @return isDefault
  */
  @NotNull 
  @Schema(name = "is_default", example = "true", description = "Дефолтная роль", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("is_default")
  public Boolean getIsDefault() {
    return isDefault;
  }

  public void setIsDefault(Boolean isDefault) {
    this.isDefault = isDefault;
  }

  public ProfessionalRolesRole name(String name) {
    this.name = name;
    return this;
  }

  /**
   * Имя профессиональной роли
   * @return name
  */
  @NotNull @Size(min = 1) 
  @Schema(name = "name", example = "Архитектор", description = "Имя профессиональной роли", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("name")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public ProfessionalRolesRole searchDeprecated(Boolean searchDeprecated) {
    this.searchDeprecated = searchDeprecated;
    return this;
  }

  /**
   * Наличие запрета на использование в поиске при составлении поискового запроса
   * @return searchDeprecated
  */
  
  @Schema(name = "search_deprecated", example = "true", description = "Наличие запрета на использование в поиске при составлении поискового запроса", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("search_deprecated")
  public Boolean getSearchDeprecated() {
    return searchDeprecated;
  }

  public void setSearchDeprecated(Boolean searchDeprecated) {
    this.searchDeprecated = searchDeprecated;
  }

  public ProfessionalRolesRole searchDeprecatedDatetime(OffsetDateTime searchDeprecatedDatetime) {
    this.searchDeprecatedDatetime = searchDeprecatedDatetime;
    return this;
  }

  /**
   * Время, с которого действует запрет на использование роли в поиске при составлении поискового запроса,  в формате [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601) с точностью до секунды: `YYYY-MM-DDThh:mm:ss±hhmm` 
   * @return searchDeprecatedDatetime
  */
  @Valid 
  @Schema(name = "search_deprecated_datetime", description = "Время, с которого действует запрет на использование роли в поиске при составлении поискового запроса,  в формате [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601) с точностью до секунды: `YYYY-MM-DDThh:mm:ss±hhmm` ", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("search_deprecated_datetime")
  public OffsetDateTime getSearchDeprecatedDatetime() {
    return searchDeprecatedDatetime;
  }

  public void setSearchDeprecatedDatetime(OffsetDateTime searchDeprecatedDatetime) {
    this.searchDeprecatedDatetime = searchDeprecatedDatetime;
  }

  public ProfessionalRolesRole selectDeprecated(Boolean selectDeprecated) {
    this.selectDeprecated = selectDeprecated;
    return this;
  }

  /**
   * Наличие запрета на использование при создании новых сущностей (резюме или вакансии)
   * @return selectDeprecated
  */
  
  @Schema(name = "select_deprecated", example = "true", description = "Наличие запрета на использование при создании новых сущностей (резюме или вакансии)", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("select_deprecated")
  public Boolean getSelectDeprecated() {
    return selectDeprecated;
  }

  public void setSelectDeprecated(Boolean selectDeprecated) {
    this.selectDeprecated = selectDeprecated;
  }

  public ProfessionalRolesRole selectDeprecatedDatetime(OffsetDateTime selectDeprecatedDatetime) {
    this.selectDeprecatedDatetime = selectDeprecatedDatetime;
    return this;
  }

  /**
   * Время, с которого действует запрет на использование роли при создании новых сущностей,  в формате [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601) с точностью до секунды: `YYYY-MM-DDThh:mm:ss±hhmm` 
   * @return selectDeprecatedDatetime
  */
  @Valid 
  @Schema(name = "select_deprecated_datetime", description = "Время, с которого действует запрет на использование роли при создании новых сущностей,  в формате [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601) с точностью до секунды: `YYYY-MM-DDThh:mm:ss±hhmm` ", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("select_deprecated_datetime")
  public OffsetDateTime getSelectDeprecatedDatetime() {
    return selectDeprecatedDatetime;
  }

  public void setSelectDeprecatedDatetime(OffsetDateTime selectDeprecatedDatetime) {
    this.selectDeprecatedDatetime = selectDeprecatedDatetime;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ProfessionalRolesRole professionalRolesRole = (ProfessionalRolesRole) o;
    return Objects.equals(this.acceptIncompleteResumes, professionalRolesRole.acceptIncompleteResumes) &&
        Objects.equals(this.id, professionalRolesRole.id) &&
        Objects.equals(this.isDefault, professionalRolesRole.isDefault) &&
        Objects.equals(this.name, professionalRolesRole.name) &&
        Objects.equals(this.searchDeprecated, professionalRolesRole.searchDeprecated) &&
        Objects.equals(this.searchDeprecatedDatetime, professionalRolesRole.searchDeprecatedDatetime) &&
        Objects.equals(this.selectDeprecated, professionalRolesRole.selectDeprecated) &&
        Objects.equals(this.selectDeprecatedDatetime, professionalRolesRole.selectDeprecatedDatetime);
  }

  @Override
  public int hashCode() {
    return Objects.hash(acceptIncompleteResumes, id, isDefault, name, searchDeprecated, searchDeprecatedDatetime, selectDeprecated, selectDeprecatedDatetime);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ProfessionalRolesRole {\n");
    sb.append("    acceptIncompleteResumes: ").append(toIndentedString(acceptIncompleteResumes)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    isDefault: ").append(toIndentedString(isDefault)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    searchDeprecated: ").append(toIndentedString(searchDeprecated)).append("\n");
    sb.append("    searchDeprecatedDatetime: ").append(toIndentedString(searchDeprecatedDatetime)).append("\n");
    sb.append("    selectDeprecated: ").append(toIndentedString(selectDeprecated)).append("\n");
    sb.append("    selectDeprecatedDatetime: ").append(toIndentedString(selectDeprecatedDatetime)).append("\n");
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

