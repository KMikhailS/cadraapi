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
 * Информация о результате подтверждения навыка
 */

@Schema(name = "SkillVerificationsResult", description = "Информация о результате подтверждения навыка")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2025-08-17T15:41:09.394389505+05:00[Asia/Yekaterinburg]", comments = "Generator version: 7.6.0")
public class SkillVerificationsResult {

  /**
   * Статус антифрод проверки
   */
  public enum AntifraudVerdictEnum {
    FRAUD_DETECTED("FRAUD_DETECTED"),
    
    UNKNOWN("UNKNOWN"),
    
    VERIFIED("VERIFIED"),
    
    FAILED_TO_VERIFY("FAILED_TO_VERIFY"),
    
    EVALUATION_WAS_NOT_REQUESTED("EVALUATION_WAS_NOT_REQUESTED");

    private String value;

    AntifraudVerdictEnum(String value) {
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
    public static AntifraudVerdictEnum fromValue(String value) {
      for (AntifraudVerdictEnum b : AntifraudVerdictEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  private AntifraudVerdictEnum antifraudVerdict;

  private SkillVerificationsResultScore score;

  private String status;

  private String type;

  public SkillVerificationsResult() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public SkillVerificationsResult(String status, String type) {
    this.status = status;
    this.type = type;
  }

  public SkillVerificationsResult antifraudVerdict(AntifraudVerdictEnum antifraudVerdict) {
    this.antifraudVerdict = antifraudVerdict;
    return this;
  }

  /**
   * Статус антифрод проверки
   * @return antifraudVerdict
  */
  
  @Schema(name = "antifraud_verdict", description = "Статус антифрод проверки", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("antifraud_verdict")
  public AntifraudVerdictEnum getAntifraudVerdict() {
    return antifraudVerdict;
  }

  public void setAntifraudVerdict(AntifraudVerdictEnum antifraudVerdict) {
    this.antifraudVerdict = antifraudVerdict;
  }

  public SkillVerificationsResult score(SkillVerificationsResultScore score) {
    this.score = score;
    return this;
  }

  /**
   * Get score
   * @return score
  */
  @Valid 
  @Schema(name = "score", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("score")
  public SkillVerificationsResultScore getScore() {
    return score;
  }

  public void setScore(SkillVerificationsResultScore score) {
    this.score = score;
  }

  public SkillVerificationsResult status(String status) {
    this.status = status;
    return this;
  }

  /**
   * Статус результата подтверждения навыка
   * @return status
  */
  @NotNull 
  @Schema(name = "status", description = "Статус результата подтверждения навыка", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("status")
  public String getStatus() {
    return status;
  }

  public void setStatus(String status) {
    this.status = status;
  }

  public SkillVerificationsResult type(String type) {
    this.type = type;
    return this;
  }

  /**
   * Тип результата подтверждения навыка
   * @return type
  */
  @NotNull 
  @Schema(name = "type", description = "Тип результата подтверждения навыка", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("type")
  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
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
    public SkillVerificationsResult putAdditionalProperty(String key, Object value) {
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
    SkillVerificationsResult skillVerificationsResult = (SkillVerificationsResult) o;
    return Objects.equals(this.antifraudVerdict, skillVerificationsResult.antifraudVerdict) &&
        Objects.equals(this.score, skillVerificationsResult.score) &&
        Objects.equals(this.status, skillVerificationsResult.status) &&
        Objects.equals(this.type, skillVerificationsResult.type) &&
    Objects.equals(this.additionalProperties, skillVerificationsResult.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(antifraudVerdict, score, status, type, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SkillVerificationsResult {\n");
    sb.append("    antifraudVerdict: ").append(toIndentedString(antifraudVerdict)).append("\n");
    sb.append("    score: ").append(toIndentedString(score)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    
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

