package ru.brobrocode.cadra.client.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.annotation.Generated;
import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;

import java.util.Objects;

/**
 * Информация о предпочтениях менеджера
 */

@Schema(name = "ManagerSettings", description = "Информация о предпочтениях менеджера")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2025-08-17T15:41:09.394389505+05:00[Asia/Yekaterinburg]", comments = "Generator version: 7.6.0")
public class ManagerSettings {

  private ManagerSettingsCurrency defaultCurrency;

  private VacancyBrandedTemplate defaultVacancyBrandedTemplate = null;

  private Boolean useSmsNotification;

  public ManagerSettings() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public ManagerSettings(ManagerSettingsCurrency defaultCurrency, Boolean useSmsNotification) {
    this.defaultCurrency = defaultCurrency;
    this.useSmsNotification = useSmsNotification;
  }

  public ManagerSettings defaultCurrency(ManagerSettingsCurrency defaultCurrency) {
    this.defaultCurrency = defaultCurrency;
    return this;
  }

  /**
   * Get defaultCurrency
   * @return defaultCurrency
  */
  @NotNull @Valid 
  @Schema(name = "default_currency", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("default_currency")
  public ManagerSettingsCurrency getDefaultCurrency() {
    return defaultCurrency;
  }

  public void setDefaultCurrency(ManagerSettingsCurrency defaultCurrency) {
    this.defaultCurrency = defaultCurrency;
  }

  public ManagerSettings defaultVacancyBrandedTemplate(VacancyBrandedTemplate defaultVacancyBrandedTemplate) {
    this.defaultVacancyBrandedTemplate = defaultVacancyBrandedTemplate;
    return this;
  }

  /**
   * Get defaultVacancyBrandedTemplate
   * @return defaultVacancyBrandedTemplate
  */
  @Valid 
  @Schema(name = "default_vacancy_branded_template", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("default_vacancy_branded_template")
  public VacancyBrandedTemplate getDefaultVacancyBrandedTemplate() {
    return defaultVacancyBrandedTemplate;
  }

  public void setDefaultVacancyBrandedTemplate(VacancyBrandedTemplate defaultVacancyBrandedTemplate) {
    this.defaultVacancyBrandedTemplate = defaultVacancyBrandedTemplate;
  }

  public ManagerSettings useSmsNotification(Boolean useSmsNotification) {
    this.useSmsNotification = useSmsNotification;
    return this;
  }

  /**
   * Предпочтение по использованию флага `send_sms` при [приглашении соискателя](#tag/Otklikipriglasheniya-rabotodatelya/operation/invite-applicant-to-vacancy) 
   * @return useSmsNotification
  */
  @NotNull 
  @Schema(name = "use_sms_notification", example = "true", description = "Предпочтение по использованию флага `send_sms` при [приглашении соискателя](#tag/Otklikipriglasheniya-rabotodatelya/operation/invite-applicant-to-vacancy) ", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("use_sms_notification")
  public Boolean getUseSmsNotification() {
    return useSmsNotification;
  }

  public void setUseSmsNotification(Boolean useSmsNotification) {
    this.useSmsNotification = useSmsNotification;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ManagerSettings managerSettings = (ManagerSettings) o;
    return Objects.equals(this.defaultCurrency, managerSettings.defaultCurrency) &&
        Objects.equals(this.defaultVacancyBrandedTemplate, managerSettings.defaultVacancyBrandedTemplate) &&
        Objects.equals(this.useSmsNotification, managerSettings.useSmsNotification);
  }

  @Override
  public int hashCode() {
    return Objects.hash(defaultCurrency, defaultVacancyBrandedTemplate, useSmsNotification);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ManagerSettings {\n");
    sb.append("    defaultCurrency: ").append(toIndentedString(defaultCurrency)).append("\n");
    sb.append("    defaultVacancyBrandedTemplate: ").append(toIndentedString(defaultVacancyBrandedTemplate)).append("\n");
    sb.append("    useSmsNotification: ").append(toIndentedString(useSmsNotification)).append("\n");
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

