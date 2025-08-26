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
 * Уровень владения навыком
 */

@Schema(name = "SkillVerificationsLevel", description = "Уровень владения навыком")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2025-08-17T15:41:09.394389505+05:00[Asia/Yekaterinburg]", comments = "Generator version: 7.6.0")
public class SkillVerificationsLevel {

  private Integer id;

  private String internalId;

  private String name;

  private Integer rank;

  public SkillVerificationsLevel() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public SkillVerificationsLevel(Integer id, String internalId, String name, Integer rank) {
    this.id = id;
    this.internalId = internalId;
    this.name = name;
    this.rank = rank;
  }

  public SkillVerificationsLevel id(Integer id) {
    this.id = id;
    return this;
  }

  /**
   * Уникальный идентификатор уровня владения навыком
   * @return id
  */
  @NotNull 
  @Schema(name = "id", description = "Уникальный идентификатор уровня владения навыком", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("id")
  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public SkillVerificationsLevel internalId(String internalId) {
    this.internalId = internalId;
    return this;
  }

  /**
   * Уникальный текстовый идентификатор уровня владения навыка на базе резюме
   * @return internalId
  */
  @NotNull 
  @Schema(name = "internal_id", description = "Уникальный текстовый идентификатор уровня владения навыка на базе резюме", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("internal_id")
  public String getInternalId() {
    return internalId;
  }

  public void setInternalId(String internalId) {
    this.internalId = internalId;
  }

  public SkillVerificationsLevel name(String name) {
    this.name = name;
    return this;
  }

  /**
   * Название уровня владения навыка
   * @return name
  */
  @NotNull 
  @Schema(name = "name", description = "Название уровня владения навыка", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("name")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public SkillVerificationsLevel rank(Integer rank) {
    this.rank = rank;
    return this;
  }

  /**
   * Порядковый номер уровня владения навыка
   * @return rank
  */
  @NotNull 
  @Schema(name = "rank", description = "Порядковый номер уровня владения навыка", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("rank")
  public Integer getRank() {
    return rank;
  }

  public void setRank(Integer rank) {
    this.rank = rank;
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
    public SkillVerificationsLevel putAdditionalProperty(String key, Object value) {
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
    SkillVerificationsLevel skillVerificationsLevel = (SkillVerificationsLevel) o;
    return Objects.equals(this.id, skillVerificationsLevel.id) &&
        Objects.equals(this.internalId, skillVerificationsLevel.internalId) &&
        Objects.equals(this.name, skillVerificationsLevel.name) &&
        Objects.equals(this.rank, skillVerificationsLevel.rank) &&
    Objects.equals(this.additionalProperties, skillVerificationsLevel.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, internalId, name, rank, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SkillVerificationsLevel {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    internalId: ").append(toIndentedString(internalId)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    rank: ").append(toIndentedString(rank)).append("\n");
    
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

