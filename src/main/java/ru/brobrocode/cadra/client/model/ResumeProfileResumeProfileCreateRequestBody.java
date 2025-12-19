package ru.brobrocode.cadra.client.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.annotation.Generated;
import jakarta.validation.Valid;

import java.util.Objects;

/**
 * ResumeProfileResumeProfileCreateRequestBody
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2025-08-17T15:41:09.394389505+05:00[Asia/Yekaterinburg]", comments = "Generator version: 7.6.0")
public class ResumeProfileResumeProfileCreateRequestBody {

  /**
   * Точка входа (default - по умолчанию; vacancy_response - отклик на вакансию; onboarding_short - онбординг; onboarding_area_creds - онбординг с кредами; возможны другие варианты)
   */
  public enum EntryPointEnum {
    DEFAULT("default"),
    
    VACANCY_RESPONSE("vacancy_response"),
    
    ONBOARDING_SHORT("onboarding_short"),
    
    ONBOARDING_AREA_CREDS("onboarding_area_creds");

    private String value;

    EntryPointEnum(String value) {
      this.value = value;
    }

    @JsonValue
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static EntryPointEnum fromValue(String value) {
      for (EntryPointEnum b : EntryPointEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  private EntryPointEnum entryPoint;

  private Double lat;

  private Double lng;

  private Integer vacancyId;

  private ResumeProfileAdditionalProperties additionalProperties = null;

  private String cloneResumeId;

  private Boolean updateProfile;

  public ResumeProfileResumeProfileCreateRequestBody entryPoint(EntryPointEnum entryPoint) {
    this.entryPoint = entryPoint;
    return this;
  }

  /**
   * Точка входа (default - по умолчанию; vacancy_response - отклик на вакансию; onboarding_short - онбординг; onboarding_area_creds - онбординг с кредами; возможны другие варианты)
   * @return entryPoint
  */
  
  @Schema(name = "entry_point", description = "Точка входа (default - по умолчанию; vacancy_response - отклик на вакансию; onboarding_short - онбординг; onboarding_area_creds - онбординг с кредами; возможны другие варианты)", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("entry_point")
  public EntryPointEnum getEntryPoint() {
    return entryPoint;
  }

  public void setEntryPoint(EntryPointEnum entryPoint) {
    this.entryPoint = entryPoint;
  }

  public ResumeProfileResumeProfileCreateRequestBody lat(Double lat) {
    this.lat = lat;
    return this;
  }

  /**
   * Широта
   * @return lat
  */
  
  @Schema(name = "lat", description = "Широта", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("lat")
  public Double getLat() {
    return lat;
  }

  public void setLat(Double lat) {
    this.lat = lat;
  }

  public ResumeProfileResumeProfileCreateRequestBody lng(Double lng) {
    this.lng = lng;
    return this;
  }

  /**
   * Долгота
   * @return lng
  */
  
  @Schema(name = "lng", description = "Долгота", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("lng")
  public Double getLng() {
    return lng;
  }

  public void setLng(Double lng) {
    this.lng = lng;
  }

  public ResumeProfileResumeProfileCreateRequestBody vacancyId(Integer vacancyId) {
    this.vacancyId = vacancyId;
    return this;
  }

  /**
   * Id вакансии на которую откликаемся, заполняется для точки входа \"vacancy_response\"
   * @return vacancyId
  */
  
  @Schema(name = "vacancy_id", description = "Id вакансии на которую откликаемся, заполняется для точки входа \"vacancy_response\"", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("vacancy_id")
  public Integer getVacancyId() {
    return vacancyId;
  }

  public void setVacancyId(Integer vacancyId) {
    this.vacancyId = vacancyId;
  }

  public ResumeProfileResumeProfileCreateRequestBody additionalProperties(ResumeProfileAdditionalProperties additionalProperties) {
    this.additionalProperties = additionalProperties;
    return this;
  }

  /**
   * Get additionalProperties
   * @return additionalProperties
  */
  @Valid 
  @Schema(name = "additional_properties", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("additional_properties")
  public ResumeProfileAdditionalProperties getAdditionalProperties() {
    return additionalProperties;
  }

  public void setAdditionalProperties(ResumeProfileAdditionalProperties additionalProperties) {
    this.additionalProperties = additionalProperties;
  }

  public ResumeProfileResumeProfileCreateRequestBody cloneResumeId(String cloneResumeId) {
    this.cloneResumeId = cloneResumeId;
    return this;
  }

  /**
   * Идентификатор(хеш) резюме, которое клонируется
   * @return cloneResumeId
  */
  
  @Schema(name = "clone_resume_id", description = "Идентификатор(хеш) резюме, которое клонируется", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("clone_resume_id")
  public String getCloneResumeId() {
    return cloneResumeId;
  }

  public void setCloneResumeId(String cloneResumeId) {
    this.cloneResumeId = cloneResumeId;
  }

  public ResumeProfileResumeProfileCreateRequestBody updateProfile(Boolean updateProfile) {
    this.updateProfile = updateProfile;
    return this;
  }

  /**
   * Обновлять ли профиль (на данный момент ФИО)
   * @return updateProfile
  */
  
  @Schema(name = "update_profile", description = "Обновлять ли профиль (на данный момент ФИО)", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("update_profile")
  public Boolean getUpdateProfile() {
    return updateProfile;
  }

  public void setUpdateProfile(Boolean updateProfile) {
    this.updateProfile = updateProfile;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ResumeProfileResumeProfileCreateRequestBody resumeProfileResumeProfileCreateRequestBody = (ResumeProfileResumeProfileCreateRequestBody) o;
    return Objects.equals(this.entryPoint, resumeProfileResumeProfileCreateRequestBody.entryPoint) &&
        Objects.equals(this.lat, resumeProfileResumeProfileCreateRequestBody.lat) &&
        Objects.equals(this.lng, resumeProfileResumeProfileCreateRequestBody.lng) &&
        Objects.equals(this.vacancyId, resumeProfileResumeProfileCreateRequestBody.vacancyId) &&
        Objects.equals(this.additionalProperties, resumeProfileResumeProfileCreateRequestBody.additionalProperties) &&
        Objects.equals(this.cloneResumeId, resumeProfileResumeProfileCreateRequestBody.cloneResumeId) &&
        Objects.equals(this.updateProfile, resumeProfileResumeProfileCreateRequestBody.updateProfile);
  }

  @Override
  public int hashCode() {
    return Objects.hash(entryPoint, lat, lng, vacancyId, additionalProperties, cloneResumeId, updateProfile);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ResumeProfileResumeProfileCreateRequestBody {\n");
    sb.append("    entryPoint: ").append(toIndentedString(entryPoint)).append("\n");
    sb.append("    lat: ").append(toIndentedString(lat)).append("\n");
    sb.append("    lng: ").append(toIndentedString(lng)).append("\n");
    sb.append("    vacancyId: ").append(toIndentedString(vacancyId)).append("\n");
    sb.append("    additionalProperties: ").append(toIndentedString(additionalProperties)).append("\n");
    sb.append("    cloneResumeId: ").append(toIndentedString(cloneResumeId)).append("\n");
    sb.append("    updateProfile: ").append(toIndentedString(updateProfile)).append("\n");
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

