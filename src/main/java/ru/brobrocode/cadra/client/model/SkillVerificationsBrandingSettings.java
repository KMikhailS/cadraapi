package ru.brobrocode.cadra.client.model;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.annotation.Generated;
import jakarta.validation.constraints.NotNull;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * Настройки брендирования для способа подтверждения навыка
 */

@Schema(name = "SkillVerificationsBrandingSettings", description = "Настройки брендирования для способа подтверждения навыка")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2025-08-17T15:41:09.394389505+05:00[Asia/Yekaterinburg]", comments = "Generator version: 7.6.0")
public class SkillVerificationsBrandingSettings {

  private String ageLabel;

  private Boolean ctaButtonEnabled;

  private Boolean enabled;

  public SkillVerificationsBrandingSettings() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public SkillVerificationsBrandingSettings(String ageLabel, Boolean ctaButtonEnabled, Boolean enabled) {
    this.ageLabel = ageLabel;
    this.ctaButtonEnabled = ctaButtonEnabled;
    this.enabled = enabled;
  }

  public SkillVerificationsBrandingSettings ageLabel(String ageLabel) {
    this.ageLabel = ageLabel;
    return this;
  }

  /**
   * Возрастное ограничение в соответствии с Федеральным законом от 29.12.2010 N 436-ФЗ
   * @return ageLabel
  */
  @NotNull 
  @Schema(name = "age_label", description = "Возрастное ограничение в соответствии с Федеральным законом от 29.12.2010 N 436-ФЗ", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("age_label")
  public String getAgeLabel() {
    return ageLabel;
  }

  public void setAgeLabel(String ageLabel) {
    this.ageLabel = ageLabel;
  }

  public SkillVerificationsBrandingSettings ctaButtonEnabled(Boolean ctaButtonEnabled) {
    this.ctaButtonEnabled = ctaButtonEnabled;
    return this;
  }

  /**
   * Флаг включения Call-to-Action кнопки для способа подтверждения навыка
   * @return ctaButtonEnabled
  */
  @NotNull 
  @Schema(name = "cta_button_enabled", description = "Флаг включения Call-to-Action кнопки для способа подтверждения навыка", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("cta_button_enabled")
  public Boolean getCtaButtonEnabled() {
    return ctaButtonEnabled;
  }

  public void setCtaButtonEnabled(Boolean ctaButtonEnabled) {
    this.ctaButtonEnabled = ctaButtonEnabled;
  }

  public SkillVerificationsBrandingSettings enabled(Boolean enabled) {
    this.enabled = enabled;
    return this;
  }

  /**
   * Флаг включения брендирования для способа подтверждения навыка
   * @return enabled
  */
  @NotNull 
  @Schema(name = "enabled", description = "Флаг включения брендирования для способа подтверждения навыка", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("enabled")
  public Boolean getEnabled() {
    return enabled;
  }

  public void setEnabled(Boolean enabled) {
    this.enabled = enabled;
  }
    /**
    * A container for additional, undeclared properties.
    * This is a holder for any undeclared properties as specified with
    * the 'additionalProperties' keyword in the OAS document.
    */
    private Map<String, Object> additionalProperties;

    /**
    * Set the additional (undeclared) property with the specified name and value.
    * If the property does not already exist, create it otherwise replace it.
    */
    @JsonAnySetter
    public SkillVerificationsBrandingSettings putAdditionalProperty(String key, Object value) {
        if (this.additionalProperties == null) {
            this.additionalProperties = new HashMap<String, Object>();
        }
        this.additionalProperties.put(key, value);
        return this;
    }

    /**
    * Return the additional (undeclared) property.
    */
    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return additionalProperties;
    }

    /**
    * Return the additional (undeclared) property with the specified name.
    */
    public Object getAdditionalProperty(String key) {
        if (this.additionalProperties == null) {
            return null;
        }
        return this.additionalProperties.get(key);
    }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SkillVerificationsBrandingSettings skillVerificationsBrandingSettings = (SkillVerificationsBrandingSettings) o;
    return Objects.equals(this.ageLabel, skillVerificationsBrandingSettings.ageLabel) &&
        Objects.equals(this.ctaButtonEnabled, skillVerificationsBrandingSettings.ctaButtonEnabled) &&
        Objects.equals(this.enabled, skillVerificationsBrandingSettings.enabled) &&
    Objects.equals(this.additionalProperties, skillVerificationsBrandingSettings.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(ageLabel, ctaButtonEnabled, enabled, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SkillVerificationsBrandingSettings {\n");
    sb.append("    ageLabel: ").append(toIndentedString(ageLabel)).append("\n");
    sb.append("    ctaButtonEnabled: ").append(toIndentedString(ctaButtonEnabled)).append("\n");
    sb.append("    enabled: ").append(toIndentedString(enabled)).append("\n");
    
    sb.append("    additionalProperties: ").append(toIndentedString(additionalProperties)).append("\n");
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

