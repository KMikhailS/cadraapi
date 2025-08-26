package ru.brobrocode.cadra.client.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.annotation.Generated;
import jakarta.validation.Valid;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * VacancyPublicationVacancyPropertiesPropertiesInner
 */

@JsonTypeName("VacancyPublicationVacancyProperties_properties_inner")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2025-08-17T15:41:09.394389505+05:00[Asia/Yekaterinburg]", comments = "Generator version: 7.6.0")
public class VacancyPublicationVacancyPropertiesPropertiesInner {

  private String endTime;

  @Valid
  private List<String> parameters = new ArrayList<>();

  private String propertyType;

  private String startTime;

  public VacancyPublicationVacancyPropertiesPropertiesInner endTime(String endTime) {
    this.endTime = endTime;
    return this;
  }

  /**
   * Время окончания действия свойства
   * @return endTime
  */
  
  @Schema(name = "end_time", description = "Время окончания действия свойства", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("end_time")
  public String getEndTime() {
    return endTime;
  }

  public void setEndTime(String endTime) {
    this.endTime = endTime;
  }

  public VacancyPublicationVacancyPropertiesPropertiesInner parameters(List<String> parameters) {
    this.parameters = parameters;
    return this;
  }

  public VacancyPublicationVacancyPropertiesPropertiesInner addParametersItem(String parametersItem) {
    if (this.parameters == null) {
      this.parameters = new ArrayList<>();
    }
    this.parameters.add(parametersItem);
    return this;
  }

  /**
   * Дополнительные параметры проперти
   * @return parameters
  */
  
  @Schema(name = "parameters", description = "Дополнительные параметры проперти", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("parameters")
  public List<String> getParameters() {
    return parameters;
  }

  public void setParameters(List<String> parameters) {
    this.parameters = parameters;
  }

  public VacancyPublicationVacancyPropertiesPropertiesInner propertyType(String propertyType) {
    this.propertyType = propertyType;
    return this;
  }

  /**
   * Имя свойства: * `HH_ANONYMOUS` — Публикуется без названия компании и логотипа * `HH_STANDARD_PLUS` — С продвижением — для быстрого поиска * `HH_STANDARD` — Без продвижения — для планового поиска * `HH_FREE` — Бесплатная вакансия для поиска кандидатов * `HH_PREMIUM` — 7 дней держится выше стандартных — вас заметит больше людей * `HH_ADVERTISING` — Продвижение бренда и отклики на вашем сайте * `HH_PAY_FOR_PERFORMANCE` — Вакансия с оплатой за контакты в откликах * `ZP_CROSSPOSTING` — Вакансия на hh.ru с дополнительным размещением на zarplata.ru
   * @return propertyType
  */
  
  @Schema(name = "property_type", description = "Имя свойства: * `HH_ANONYMOUS` — Публикуется без названия компании и логотипа * `HH_STANDARD_PLUS` — С продвижением — для быстрого поиска * `HH_STANDARD` — Без продвижения — для планового поиска * `HH_FREE` — Бесплатная вакансия для поиска кандидатов * `HH_PREMIUM` — 7 дней держится выше стандартных — вас заметит больше людей * `HH_ADVERTISING` — Продвижение бренда и отклики на вашем сайте * `HH_PAY_FOR_PERFORMANCE` — Вакансия с оплатой за контакты в откликах * `ZP_CROSSPOSTING` — Вакансия на hh.ru с дополнительным размещением на zarplata.ru", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("property_type")
  public String getPropertyType() {
    return propertyType;
  }

  public void setPropertyType(String propertyType) {
    this.propertyType = propertyType;
  }

  public VacancyPublicationVacancyPropertiesPropertiesInner startTime(String startTime) {
    this.startTime = startTime;
    return this;
  }

  /**
   * Время начала действия свойства
   * @return startTime
  */
  
  @Schema(name = "start_time", description = "Время начала действия свойства", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("start_time")
  public String getStartTime() {
    return startTime;
  }

  public void setStartTime(String startTime) {
    this.startTime = startTime;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    VacancyPublicationVacancyPropertiesPropertiesInner vacancyPublicationVacancyPropertiesPropertiesInner = (VacancyPublicationVacancyPropertiesPropertiesInner) o;
    return Objects.equals(this.endTime, vacancyPublicationVacancyPropertiesPropertiesInner.endTime) &&
        Objects.equals(this.parameters, vacancyPublicationVacancyPropertiesPropertiesInner.parameters) &&
        Objects.equals(this.propertyType, vacancyPublicationVacancyPropertiesPropertiesInner.propertyType) &&
        Objects.equals(this.startTime, vacancyPublicationVacancyPropertiesPropertiesInner.startTime);
  }

  @Override
  public int hashCode() {
    return Objects.hash(endTime, parameters, propertyType, startTime);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class VacancyPublicationVacancyPropertiesPropertiesInner {\n");
    sb.append("    endTime: ").append(toIndentedString(endTime)).append("\n");
    sb.append("    parameters: ").append(toIndentedString(parameters)).append("\n");
    sb.append("    propertyType: ").append(toIndentedString(propertyType)).append("\n");
    sb.append("    startTime: ").append(toIndentedString(startTime)).append("\n");
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

