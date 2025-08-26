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
 * VacancyVacancyPropertiesPropertiesInner
 */

@JsonTypeName("VacancyVacancyProperties_properties_inner")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2025-08-17T15:41:09.394389505+05:00[Asia/Yekaterinburg]", comments = "Generator version: 7.6.0")
public class VacancyVacancyPropertiesPropertiesInner {

  private String endTime;

  @Valid
  private List<@Valid VacancyVacancyPropertiesPropertiesInnerParametersInner> parameters = new ArrayList<>();

  private String propertyType;

  private String startTime;

  public VacancyVacancyPropertiesPropertiesInner() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public VacancyVacancyPropertiesPropertiesInner(List<@Valid VacancyVacancyPropertiesPropertiesInnerParametersInner> parameters, String propertyType) {
    this.parameters = parameters;
    this.propertyType = propertyType;
  }

  public VacancyVacancyPropertiesPropertiesInner endTime(String endTime) {
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

  public VacancyVacancyPropertiesPropertiesInner parameters(List<@Valid VacancyVacancyPropertiesPropertiesInnerParametersInner> parameters) {
    this.parameters = parameters;
    return this;
  }

  public VacancyVacancyPropertiesPropertiesInner addParametersItem(VacancyVacancyPropertiesPropertiesInnerParametersInner parametersItem) {
    if (this.parameters == null) {
      this.parameters = new ArrayList<>();
    }
    this.parameters.add(parametersItem);
    return this;
  }

  /**
   * Параметры свойства
   * @return parameters
  */
  @NotNull @Valid 
  @Schema(name = "parameters", description = "Параметры свойства", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("parameters")
  public List<@Valid VacancyVacancyPropertiesPropertiesInnerParametersInner> getParameters() {
    return parameters;
  }

  public void setParameters(List<@Valid VacancyVacancyPropertiesPropertiesInnerParametersInner> parameters) {
    this.parameters = parameters;
  }

  public VacancyVacancyPropertiesPropertiesInner propertyType(String propertyType) {
    this.propertyType = propertyType;
    return this;
  }

  /**
   * Имя свойства: * `HH_ANONYMOUS` — Публикуется без названия компании и логотипа * `HH_STANDARD_PLUS` — С продвижением — для быстрого поиска * `HH_STANDARD` — Без продвижения — для планового поиска * `HH_FREE` — Бесплатная вакансия для поиска кандидатов * `HH_PREMIUM` — 7 дней держится выше стандартных — вас заметит больше людей * `HH_ADVERTISING` — Продвижение бренда и отклики на вашем сайте * `HH_PAY_FOR_PERFORMANCE` — Вакансия с оплатой за контакты в откликах * `ZP_CROSSPOSTING` — Вакансия на hh.ru с дополнительным размещением на zarplata.ru
   * @return propertyType
  */
  @NotNull 
  @Schema(name = "property_type", description = "Имя свойства: * `HH_ANONYMOUS` — Публикуется без названия компании и логотипа * `HH_STANDARD_PLUS` — С продвижением — для быстрого поиска * `HH_STANDARD` — Без продвижения — для планового поиска * `HH_FREE` — Бесплатная вакансия для поиска кандидатов * `HH_PREMIUM` — 7 дней держится выше стандартных — вас заметит больше людей * `HH_ADVERTISING` — Продвижение бренда и отклики на вашем сайте * `HH_PAY_FOR_PERFORMANCE` — Вакансия с оплатой за контакты в откликах * `ZP_CROSSPOSTING` — Вакансия на hh.ru с дополнительным размещением на zarplata.ru", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("property_type")
  public String getPropertyType() {
    return propertyType;
  }

  public void setPropertyType(String propertyType) {
    this.propertyType = propertyType;
  }

  public VacancyVacancyPropertiesPropertiesInner startTime(String startTime) {
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
    VacancyVacancyPropertiesPropertiesInner vacancyVacancyPropertiesPropertiesInner = (VacancyVacancyPropertiesPropertiesInner) o;
    return Objects.equals(this.endTime, vacancyVacancyPropertiesPropertiesInner.endTime) &&
        Objects.equals(this.parameters, vacancyVacancyPropertiesPropertiesInner.parameters) &&
        Objects.equals(this.propertyType, vacancyVacancyPropertiesPropertiesInner.propertyType) &&
        Objects.equals(this.startTime, vacancyVacancyPropertiesPropertiesInner.startTime);
  }

  @Override
  public int hashCode() {
    return Objects.hash(endTime, parameters, propertyType, startTime);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class VacancyVacancyPropertiesPropertiesInner {\n");
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

