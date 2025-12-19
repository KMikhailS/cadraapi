package ru.brobrocode.cadra.client.model;

import com.fasterxml.jackson.annotation.*;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.annotation.Generated;
import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * Краткая информация о способе подтверждения навыка, отображаемая у подтвержденного навыка или у результата подтверждения навыка
 */

@Schema(name = "SkillVerificationsShortMethod", description = "Краткая информация о способе подтверждения навыка, отображаемая у подтвержденного навыка или у результата подтверждения навыка")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2025-08-17T15:41:09.394389505+05:00[Asia/Yekaterinburg]", comments = "Generator version: 7.6.0")
public class SkillVerificationsShortMethod {

  private SkillVerificationsBrandingSettings brandingSettings = null;

  private String description = null;

  private SkillVerificationsImage headline = null;

  private SkillVerificationsImage icon = null;

  private Integer id;

  private String name;

  /**
   * Платформа для способа подтверждения навыка
   */
  public enum PlatformEnum {
    KAK_DELA_QUIZ("KAK_DELA_QUIZ");

    private String value;

    PlatformEnum(String value) {
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
    public static PlatformEnum fromValue(String value) {
      for (PlatformEnum b : PlatformEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  private PlatformEnum platform;

  private SkillVerificationsSource source;

  public SkillVerificationsShortMethod() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public SkillVerificationsShortMethod(Integer id, String name, PlatformEnum platform, SkillVerificationsSource source) {
    this.id = id;
    this.name = name;
    this.platform = platform;
    this.source = source;
  }

  public SkillVerificationsShortMethod brandingSettings(SkillVerificationsBrandingSettings brandingSettings) {
    this.brandingSettings = brandingSettings;
    return this;
  }

  /**
   * Get brandingSettings
   * @return brandingSettings
  */
  @Valid 
  @Schema(name = "branding_settings", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("branding_settings")
  public SkillVerificationsBrandingSettings getBrandingSettings() {
    return brandingSettings;
  }

  public void setBrandingSettings(SkillVerificationsBrandingSettings brandingSettings) {
    this.brandingSettings = brandingSettings;
  }

  public SkillVerificationsShortMethod description(String description) {
    this.description = description;
    return this;
  }

  /**
   * Описание способа подтверждения навыка
   * @return description
  */
  
  @Schema(name = "description", description = "Описание способа подтверждения навыка", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("description")
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public SkillVerificationsShortMethod headline(SkillVerificationsImage headline) {
    this.headline = headline;
    return this;
  }

  /**
   * Get headline
   * @return headline
  */
  @Valid 
  @Schema(name = "headline", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("headline")
  public SkillVerificationsImage getHeadline() {
    return headline;
  }

  public void setHeadline(SkillVerificationsImage headline) {
    this.headline = headline;
  }

  public SkillVerificationsShortMethod icon(SkillVerificationsImage icon) {
    this.icon = icon;
    return this;
  }

  /**
   * Get icon
   * @return icon
  */
  @Valid 
  @Schema(name = "icon", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("icon")
  public SkillVerificationsImage getIcon() {
    return icon;
  }

  public void setIcon(SkillVerificationsImage icon) {
    this.icon = icon;
  }

  public SkillVerificationsShortMethod id(Integer id) {
    this.id = id;
    return this;
  }

  /**
   * Идентификатор способа подтверждения навыка
   * @return id
  */
  @NotNull 
  @Schema(name = "id", description = "Идентификатор способа подтверждения навыка", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("id")
  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public SkillVerificationsShortMethod name(String name) {
    this.name = name;
    return this;
  }

  /**
   * Название способа подтверждения навыка
   * @return name
  */
  @NotNull 
  @Schema(name = "name", description = "Название способа подтверждения навыка", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("name")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public SkillVerificationsShortMethod platform(PlatformEnum platform) {
    this.platform = platform;
    return this;
  }

  /**
   * Платформа для способа подтверждения навыка
   * @return platform
  */
  @NotNull 
  @Schema(name = "platform", description = "Платформа для способа подтверждения навыка", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("platform")
  public PlatformEnum getPlatform() {
    return platform;
  }

  public void setPlatform(PlatformEnum platform) {
    this.platform = platform;
  }

  public SkillVerificationsShortMethod source(SkillVerificationsSource source) {
    this.source = source;
    return this;
  }

  /**
   * Get source
   * @return source
  */
  @NotNull @Valid 
  @Schema(name = "source", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("source")
  public SkillVerificationsSource getSource() {
    return source;
  }

  public void setSource(SkillVerificationsSource source) {
    this.source = source;
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
    public SkillVerificationsShortMethod putAdditionalProperty(String key, Object value) {
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
    SkillVerificationsShortMethod skillVerificationsShortMethod = (SkillVerificationsShortMethod) o;
    return Objects.equals(this.brandingSettings, skillVerificationsShortMethod.brandingSettings) &&
        Objects.equals(this.description, skillVerificationsShortMethod.description) &&
        Objects.equals(this.headline, skillVerificationsShortMethod.headline) &&
        Objects.equals(this.icon, skillVerificationsShortMethod.icon) &&
        Objects.equals(this.id, skillVerificationsShortMethod.id) &&
        Objects.equals(this.name, skillVerificationsShortMethod.name) &&
        Objects.equals(this.platform, skillVerificationsShortMethod.platform) &&
        Objects.equals(this.source, skillVerificationsShortMethod.source) &&
    Objects.equals(this.additionalProperties, skillVerificationsShortMethod.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(brandingSettings, description, headline, icon, id, name, platform, source, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SkillVerificationsShortMethod {\n");
    sb.append("    brandingSettings: ").append(toIndentedString(brandingSettings)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    headline: ").append(toIndentedString(headline)).append("\n");
    sb.append("    icon: ").append(toIndentedString(icon)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    platform: ").append(toIndentedString(platform)).append("\n");
    sb.append("    source: ").append(toIndentedString(source)).append("\n");
    
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

