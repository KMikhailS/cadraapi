package ru.brobrocode.cadra.client.model;

import com.fasterxml.jackson.annotation.*;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.annotation.Generated;
import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;

import java.util.*;
/**
 * Подтвержденный навык
 */

@Schema(name = "SkillVerificationsSkill", description = "Подтвержденный навык")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2025-08-17T15:41:09.394389505+05:00[Asia/Yekaterinburg]", comments = "Generator version: 7.6.0")
public class SkillVerificationsSkill {

  private SkillVerificationsSkillCategory category;

  private Integer id;

  private SkillVerificationsLevel level = null;

  private String name;

  private SkillVerificationsSkillVerification practice = null;

  private SkillVerificationsSkillVerification theory = null;

  @Deprecated
  @Valid
  private List<SkillVerificationsSkillVerification> verifications = new ArrayList<>();

  private Boolean verified;

  /**
   * Источник подтверждения навыка
   */
  public enum VerifiedByEnum {
    NONE("NONE"),
    
    THEORY("THEORY"),
    
    PRACTICE("PRACTICE"),
    
    THEORY_AND_PRACTICE("THEORY_AND_PRACTICE");

    private String value;

    VerifiedByEnum(String value) {
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
    public static VerifiedByEnum fromValue(String value) {
      for (VerifiedByEnum b : VerifiedByEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  private VerifiedByEnum verifiedBy;

  public SkillVerificationsSkill() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public SkillVerificationsSkill(SkillVerificationsSkillCategory category, Integer id, String name, Boolean verified, VerifiedByEnum verifiedBy) {
    this.category = category;
    this.id = id;
    this.name = name;
    this.verified = verified;
    this.verifiedBy = verifiedBy;
  }

  public SkillVerificationsSkill category(SkillVerificationsSkillCategory category) {
    this.category = category;
    return this;
  }

  /**
   * Get category
   * @return category
  */
  @NotNull @Valid 
  @Schema(name = "category", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("category")
  public SkillVerificationsSkillCategory getCategory() {
    return category;
  }

  public void setCategory(SkillVerificationsSkillCategory category) {
    this.category = category;
  }

  public SkillVerificationsSkill id(Integer id) {
    this.id = id;
    return this;
  }

  /**
   * Идентификатор навыка
   * @return id
  */
  @NotNull 
  @Schema(name = "id", description = "Идентификатор навыка", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("id")
  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public SkillVerificationsSkill level(SkillVerificationsLevel level) {
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

  public SkillVerificationsSkill name(String name) {
    this.name = name;
    return this;
  }

  /**
   * Название навыка
   * @return name
  */
  @NotNull 
  @Schema(name = "name", description = "Название навыка", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("name")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public SkillVerificationsSkill practice(SkillVerificationsSkillVerification practice) {
    this.practice = practice;
    return this;
  }

  /**
   * Get practice
   * @return practice
  */
  @Valid 
  @Schema(name = "practice", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("practice")
  public SkillVerificationsSkillVerification getPractice() {
    return practice;
  }

  public void setPractice(SkillVerificationsSkillVerification practice) {
    this.practice = practice;
  }

  public SkillVerificationsSkill theory(SkillVerificationsSkillVerification theory) {
    this.theory = theory;
    return this;
  }

  /**
   * Get theory
   * @return theory
  */
  @Valid 
  @Schema(name = "theory", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("theory")
  public SkillVerificationsSkillVerification getTheory() {
    return theory;
  }

  public void setTheory(SkillVerificationsSkillVerification theory) {
    this.theory = theory;
  }

  public SkillVerificationsSkill verifications(List<SkillVerificationsSkillVerification> verifications) {
    this.verifications = verifications;
    return this;
  }

  public SkillVerificationsSkill addVerificationsItem(SkillVerificationsSkillVerification verificationsItem) {
    if (this.verifications == null) {
      this.verifications = new ArrayList<>();
    }
    this.verifications.add(verificationsItem);
    return this;
  }

  /**
   * Подтверждения навыков
   * @return verifications
   * @deprecated
  */
  @Valid 
  @Schema(name = "verifications", description = "Подтверждения навыков", deprecated = true, requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("verifications")
  @Deprecated
  public List<SkillVerificationsSkillVerification> getVerifications() {
    return verifications;
  }

  /**
   * @deprecated
  */
  @Deprecated
  public void setVerifications(List<SkillVerificationsSkillVerification> verifications) {
    this.verifications = verifications;
  }

  public SkillVerificationsSkill verified(Boolean verified) {
    this.verified = verified;
    return this;
  }

  /**
   * Флаг подтвержденного навыка
   * @return verified
  */
  @NotNull 
  @Schema(name = "verified", description = "Флаг подтвержденного навыка", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("verified")
  public Boolean getVerified() {
    return verified;
  }

  public void setVerified(Boolean verified) {
    this.verified = verified;
  }

  public SkillVerificationsSkill verifiedBy(VerifiedByEnum verifiedBy) {
    this.verifiedBy = verifiedBy;
    return this;
  }

  /**
   * Источник подтверждения навыка
   * @return verifiedBy
  */
  @NotNull 
  @Schema(name = "verified_by", description = "Источник подтверждения навыка", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("verified_by")
  public VerifiedByEnum getVerifiedBy() {
    return verifiedBy;
  }

  public void setVerifiedBy(VerifiedByEnum verifiedBy) {
    this.verifiedBy = verifiedBy;
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
    public SkillVerificationsSkill putAdditionalProperty(String key, Object value) {
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
    SkillVerificationsSkill skillVerificationsSkill = (SkillVerificationsSkill) o;
    return Objects.equals(this.category, skillVerificationsSkill.category) &&
        Objects.equals(this.id, skillVerificationsSkill.id) &&
        Objects.equals(this.level, skillVerificationsSkill.level) &&
        Objects.equals(this.name, skillVerificationsSkill.name) &&
        Objects.equals(this.practice, skillVerificationsSkill.practice) &&
        Objects.equals(this.theory, skillVerificationsSkill.theory) &&
        Objects.equals(this.verifications, skillVerificationsSkill.verifications) &&
        Objects.equals(this.verified, skillVerificationsSkill.verified) &&
        Objects.equals(this.verifiedBy, skillVerificationsSkill.verifiedBy) &&
    Objects.equals(this.additionalProperties, skillVerificationsSkill.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(category, id, level, name, practice, theory, verifications, verified, verifiedBy, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SkillVerificationsSkill {\n");
    sb.append("    category: ").append(toIndentedString(category)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    level: ").append(toIndentedString(level)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    practice: ").append(toIndentedString(practice)).append("\n");
    sb.append("    theory: ").append(toIndentedString(theory)).append("\n");
    sb.append("    verifications: ").append(toIndentedString(verifications)).append("\n");
    sb.append("    verified: ").append(toIndentedString(verified)).append("\n");
    sb.append("    verifiedBy: ").append(toIndentedString(verifiedBy)).append("\n");
    
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

