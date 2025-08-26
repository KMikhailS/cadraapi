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
 * Информация о подтверждении навыка
 */

@Schema(name = "SkillVerificationsSkillVerification", description = "Информация о подтверждении навыка")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2025-08-17T15:41:09.394389505+05:00[Asia/Yekaterinburg]", comments = "Generator version: 7.6.0")
public class SkillVerificationsSkillVerification {

  private String attemptedAt;

  private Integer id;

  private SkillVerificationsLevel level = null;

  private SkillVerificationsShortMethod method;

  private SkillVerificationsResult result;

  private SkillVerificationsValidity validity;

  public SkillVerificationsSkillVerification() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public SkillVerificationsSkillVerification(String attemptedAt, Integer id, SkillVerificationsShortMethod method, SkillVerificationsResult result, SkillVerificationsValidity validity) {
    this.attemptedAt = attemptedAt;
    this.id = id;
    this.method = method;
    this.result = result;
    this.validity = validity;
  }

  public SkillVerificationsSkillVerification attemptedAt(String attemptedAt) {
    this.attemptedAt = attemptedAt;
    return this;
  }

  /**
   * Дата подтверждения навыка
   * @return attemptedAt
  */
  @NotNull 
  @Schema(name = "attempted_at", description = "Дата подтверждения навыка", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("attempted_at")
  public String getAttemptedAt() {
    return attemptedAt;
  }

  public void setAttemptedAt(String attemptedAt) {
    this.attemptedAt = attemptedAt;
  }

  public SkillVerificationsSkillVerification id(Integer id) {
    this.id = id;
    return this;
  }

  /**
   * Идентификатор экземпляра подтверждения навыка
   * @return id
  */
  @NotNull 
  @Schema(name = "id", description = "Идентификатор экземпляра подтверждения навыка", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("id")
  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public SkillVerificationsSkillVerification level(SkillVerificationsLevel level) {
    this.level = level;
    return this;
  }

  /**
   * Get level
   * @return level
  */
  @Valid 
  @Schema(name = "level", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("level")
  public SkillVerificationsLevel getLevel() {
    return level;
  }

  public void setLevel(SkillVerificationsLevel level) {
    this.level = level;
  }

  public SkillVerificationsSkillVerification method(SkillVerificationsShortMethod method) {
    this.method = method;
    return this;
  }

  /**
   * Get method
   * @return method
  */
  @NotNull @Valid 
  @Schema(name = "method", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("method")
  public SkillVerificationsShortMethod getMethod() {
    return method;
  }

  public void setMethod(SkillVerificationsShortMethod method) {
    this.method = method;
  }

  public SkillVerificationsSkillVerification result(SkillVerificationsResult result) {
    this.result = result;
    return this;
  }

  /**
   * Get result
   * @return result
  */
  @NotNull @Valid 
  @Schema(name = "result", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("result")
  public SkillVerificationsResult getResult() {
    return result;
  }

  public void setResult(SkillVerificationsResult result) {
    this.result = result;
  }

  public SkillVerificationsSkillVerification validity(SkillVerificationsValidity validity) {
    this.validity = validity;
    return this;
  }

  /**
   * Get validity
   * @return validity
  */
  @NotNull @Valid 
  @Schema(name = "validity", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("validity")
  public SkillVerificationsValidity getValidity() {
    return validity;
  }

  public void setValidity(SkillVerificationsValidity validity) {
    this.validity = validity;
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
    public SkillVerificationsSkillVerification putAdditionalProperty(String key, Object value) {
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
    SkillVerificationsSkillVerification skillVerificationsSkillVerification = (SkillVerificationsSkillVerification) o;
    return Objects.equals(this.attemptedAt, skillVerificationsSkillVerification.attemptedAt) &&
        Objects.equals(this.id, skillVerificationsSkillVerification.id) &&
        Objects.equals(this.level, skillVerificationsSkillVerification.level) &&
        Objects.equals(this.method, skillVerificationsSkillVerification.method) &&
        Objects.equals(this.result, skillVerificationsSkillVerification.result) &&
        Objects.equals(this.validity, skillVerificationsSkillVerification.validity) &&
    Objects.equals(this.additionalProperties, skillVerificationsSkillVerification.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(attemptedAt, id, level, method, result, validity, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SkillVerificationsSkillVerification {\n");
    sb.append("    attemptedAt: ").append(toIndentedString(attemptedAt)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    level: ").append(toIndentedString(level)).append("\n");
    sb.append("    method: ").append(toIndentedString(method)).append("\n");
    sb.append("    result: ").append(toIndentedString(result)).append("\n");
    sb.append("    validity: ").append(toIndentedString(validity)).append("\n");
    
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

