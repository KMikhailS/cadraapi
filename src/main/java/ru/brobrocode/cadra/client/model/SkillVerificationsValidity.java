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
 * Информация о необходимости подтверждения навыка
 */

@Schema(name = "SkillVerificationsValidity", description = "Информация о необходимости подтверждения навыка")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2025-08-17T15:41:09.394389505+05:00[Asia/Yekaterinburg]", comments = "Generator version: 7.6.0")
public class SkillVerificationsValidity {

  private String state;

  private String validUntil = null;

  public SkillVerificationsValidity() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public SkillVerificationsValidity(String state) {
    this.state = state;
  }

  public SkillVerificationsValidity state(String state) {
    this.state = state;
    return this;
  }

  /**
   * Текущее состояние подтверждения навыка
   * @return state
  */
  @NotNull 
  @Schema(name = "state", description = "Текущее состояние подтверждения навыка", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("state")
  public String getState() {
    return state;
  }

  public void setState(String state) {
    this.state = state;
  }

  public SkillVerificationsValidity validUntil(String validUntil) {
    this.validUntil = validUntil;
    return this;
  }

  /**
   * Момент времени, до которого подтверждение будет считаться действительным
   * @return validUntil
  */
  
  @Schema(name = "valid_until", description = "Момент времени, до которого подтверждение будет считаться действительным", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("valid_until")
  public String getValidUntil() {
    return validUntil;
  }

  public void setValidUntil(String validUntil) {
    this.validUntil = validUntil;
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
    public SkillVerificationsValidity putAdditionalProperty(String key, Object value) {
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
    SkillVerificationsValidity skillVerificationsValidity = (SkillVerificationsValidity) o;
    return Objects.equals(this.state, skillVerificationsValidity.state) &&
        Objects.equals(this.validUntil, skillVerificationsValidity.validUntil) &&
    Objects.equals(this.additionalProperties, skillVerificationsValidity.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(state, validUntil, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SkillVerificationsValidity {\n");
    sb.append("    state: ").append(toIndentedString(state)).append("\n");
    sb.append("    validUntil: ").append(toIndentedString(validUntil)).append("\n");
    
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

