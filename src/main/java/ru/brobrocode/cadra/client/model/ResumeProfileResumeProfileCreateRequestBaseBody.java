package ru.brobrocode.cadra.client.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.annotation.Generated;

import java.util.Objects;

/**
 * Создание резюме и профиля и получение в ответ схемы с полями резюме-профиля
 */

@Schema(name = "ResumeProfileResumeProfileCreateRequestBaseBody", description = "Создание резюме и профиля и получение в ответ схемы с полями резюме-профиля")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2025-08-17T15:41:09.394389505+05:00[Asia/Yekaterinburg]", comments = "Generator version: 7.6.0")
public class ResumeProfileResumeProfileCreateRequestBaseBody {

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

  public ResumeProfileResumeProfileCreateRequestBaseBody entryPoint(EntryPointEnum entryPoint) {
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

  public ResumeProfileResumeProfileCreateRequestBaseBody lat(Double lat) {
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

  public ResumeProfileResumeProfileCreateRequestBaseBody lng(Double lng) {
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

  public ResumeProfileResumeProfileCreateRequestBaseBody vacancyId(Integer vacancyId) {
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

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ResumeProfileResumeProfileCreateRequestBaseBody resumeProfileResumeProfileCreateRequestBaseBody = (ResumeProfileResumeProfileCreateRequestBaseBody) o;
    return Objects.equals(this.entryPoint, resumeProfileResumeProfileCreateRequestBaseBody.entryPoint) &&
        Objects.equals(this.lat, resumeProfileResumeProfileCreateRequestBaseBody.lat) &&
        Objects.equals(this.lng, resumeProfileResumeProfileCreateRequestBaseBody.lng) &&
        Objects.equals(this.vacancyId, resumeProfileResumeProfileCreateRequestBaseBody.vacancyId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(entryPoint, lat, lng, vacancyId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ResumeProfileResumeProfileCreateRequestBaseBody {\n");
    sb.append("    entryPoint: ").append(toIndentedString(entryPoint)).append("\n");
    sb.append("    lat: ").append(toIndentedString(lat)).append("\n");
    sb.append("    lng: ").append(toIndentedString(lng)).append("\n");
    sb.append("    vacancyId: ").append(toIndentedString(vacancyId)).append("\n");
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

