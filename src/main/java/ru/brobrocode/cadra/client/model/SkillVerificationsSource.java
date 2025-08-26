package ru.brobrocode.cadra.client.model;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.annotation.Generated;
import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * Источник подтверждения навыка
 */

@Schema(name = "SkillVerificationsSource", description = "Источник подтверждения навыка")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2025-08-17T15:41:09.394389505+05:00[Asia/Yekaterinburg]", comments = "Generator version: 7.6.0")
public class SkillVerificationsSource {

  private String description = null;

  private SkillVerificationsImage headline = null;

  private String href = null;

  private SkillVerificationsImage icon = null;

  private Integer id;

  private String name;

  public SkillVerificationsSource() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public SkillVerificationsSource(Integer id, String name) {
    this.id = id;
    this.name = name;
  }

  public SkillVerificationsSource description(String description) {
    this.description = description;
    return this;
  }

  /**
   * Описание источника подтверждения навыка
   * @return description
  */
  
  @Schema(name = "description", description = "Описание источника подтверждения навыка", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("description")
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public SkillVerificationsSource headline(SkillVerificationsImage headline) {
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

  public SkillVerificationsSource href(String href) {
    this.href = href;
    return this;
  }

  /**
   * Ссылка на источник подтверждения навыка
   * @return href
  */
  
  @Schema(name = "href", description = "Ссылка на источник подтверждения навыка", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("href")
  public String getHref() {
    return href;
  }

  public void setHref(String href) {
    this.href = href;
  }

  public SkillVerificationsSource icon(SkillVerificationsImage icon) {
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

  public SkillVerificationsSource id(Integer id) {
    this.id = id;
    return this;
  }

  /**
   * Уникальный идентификатор источника подтверждения навыка
   * @return id
  */
  @NotNull 
  @Schema(name = "id", description = "Уникальный идентификатор источника подтверждения навыка", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("id")
  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public SkillVerificationsSource name(String name) {
    this.name = name;
    return this;
  }

  /**
   * Название источника подтверждения навыка
   * @return name
  */
  @NotNull 
  @Schema(name = "name", description = "Название источника подтверждения навыка", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("name")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
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
    public SkillVerificationsSource putAdditionalProperty(String key, Object value) {
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
    SkillVerificationsSource skillVerificationsSource = (SkillVerificationsSource) o;
    return Objects.equals(this.description, skillVerificationsSource.description) &&
        Objects.equals(this.headline, skillVerificationsSource.headline) &&
        Objects.equals(this.href, skillVerificationsSource.href) &&
        Objects.equals(this.icon, skillVerificationsSource.icon) &&
        Objects.equals(this.id, skillVerificationsSource.id) &&
        Objects.equals(this.name, skillVerificationsSource.name) &&
    Objects.equals(this.additionalProperties, skillVerificationsSource.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(description, headline, href, icon, id, name, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SkillVerificationsSource {\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    headline: ").append(toIndentedString(headline)).append("\n");
    sb.append("    href: ").append(toIndentedString(href)).append("\n");
    sb.append("    icon: ").append(toIndentedString(icon)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    
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

