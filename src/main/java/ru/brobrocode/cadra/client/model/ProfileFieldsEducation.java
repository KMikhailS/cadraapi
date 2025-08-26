package ru.brobrocode.cadra.client.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.annotation.Generated;
import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * ProfileFieldsEducation
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2025-08-17T15:41:09.394389505+05:00[Asia/Yekaterinburg]", comments = "Generator version: 7.6.0")
public class ProfileFieldsEducation {

  @Valid
  private List<@Valid ProfileFieldsEducationAdditional> additional;

  @Valid
  private List<@Valid ProfileFieldsEducationAdditional> attestation;

  @Valid
  private List<@Valid ProfileFieldsEducationElementary> elementary;

  private IncludesIdName level = null;

  @Valid
  private List<@Valid ProfileFieldsEducationPrimary> primary;

  public ProfileFieldsEducation() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public ProfileFieldsEducation(IncludesIdName level) {
    this.level = level;
  }

  public ProfileFieldsEducation additional(List<@Valid ProfileFieldsEducationAdditional> additional) {
    this.additional = additional;
    return this;
  }

  public ProfileFieldsEducation addAdditionalItem(ProfileFieldsEducationAdditional additionalItem) {
    if (this.additional == null) {
      this.additional = new ArrayList<>();
    }
    this.additional.add(additionalItem);
    return this;
  }

  /**
   * Список куров повышения квалификации
   * @return additional
  */
  @Valid 
  @Schema(name = "additional", description = "Список куров повышения квалификации", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("additional")
  public List<@Valid ProfileFieldsEducationAdditional> getAdditional() {
    return additional;
  }

  public void setAdditional(List<@Valid ProfileFieldsEducationAdditional> additional) {
    this.additional = additional;
  }

  public ProfileFieldsEducation attestation(List<@Valid ProfileFieldsEducationAdditional> attestation) {
    this.attestation = attestation;
    return this;
  }

  public ProfileFieldsEducation addAttestationItem(ProfileFieldsEducationAdditional attestationItem) {
    if (this.attestation == null) {
      this.attestation = new ArrayList<>();
    }
    this.attestation.add(attestationItem);
    return this;
  }

  /**
   * Список пройденных тестов или экзаменов
   * @return attestation
  */
  @Valid 
  @Schema(name = "attestation", description = "Список пройденных тестов или экзаменов", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("attestation")
  public List<@Valid ProfileFieldsEducationAdditional> getAttestation() {
    return attestation;
  }

  public void setAttestation(List<@Valid ProfileFieldsEducationAdditional> attestation) {
    this.attestation = attestation;
  }

  public ProfileFieldsEducation elementary(List<@Valid ProfileFieldsEducationElementary> elementary) {
    this.elementary = elementary;
    return this;
  }

  public ProfileFieldsEducation addElementaryItem(ProfileFieldsEducationElementary elementaryItem) {
    if (this.elementary == null) {
      this.elementary = new ArrayList<>();
    }
    this.elementary.add(elementaryItem);
    return this;
  }

  /**
   * Среднее образование. Обычно заполняется только при отсутствии высшего образования
   * @return elementary
  */
  @Valid 
  @Schema(name = "elementary", description = "Среднее образование. Обычно заполняется только при отсутствии высшего образования", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("elementary")
  public List<@Valid ProfileFieldsEducationElementary> getElementary() {
    return elementary;
  }

  public void setElementary(List<@Valid ProfileFieldsEducationElementary> elementary) {
    this.elementary = elementary;
  }

  public ProfileFieldsEducation level(IncludesIdName level) {
    this.level = level;
    return this;
  }

  /**
   * Get level
   * @return level
  */
  @NotNull @Valid 
  @Schema(name = "level", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("level")
  public IncludesIdName getLevel() {
    return level;
  }

  public void setLevel(IncludesIdName level) {
    this.level = level;
  }

  public ProfileFieldsEducation primary(List<@Valid ProfileFieldsEducationPrimary> primary) {
    this.primary = primary;
    return this;
  }

  public ProfileFieldsEducation addPrimaryItem(ProfileFieldsEducationPrimary primaryItem) {
    if (this.primary == null) {
      this.primary = new ArrayList<>();
    }
    this.primary.add(primaryItem);
    return this;
  }

  /**
   * Список образований выше среднего
   * @return primary
  */
  @Valid 
  @Schema(name = "primary", description = "Список образований выше среднего", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("primary")
  public List<@Valid ProfileFieldsEducationPrimary> getPrimary() {
    return primary;
  }

  public void setPrimary(List<@Valid ProfileFieldsEducationPrimary> primary) {
    this.primary = primary;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ProfileFieldsEducation profileFieldsEducation = (ProfileFieldsEducation) o;
    return Objects.equals(this.additional, profileFieldsEducation.additional) &&
        Objects.equals(this.attestation, profileFieldsEducation.attestation) &&
        Objects.equals(this.elementary, profileFieldsEducation.elementary) &&
        Objects.equals(this.level, profileFieldsEducation.level) &&
        Objects.equals(this.primary, profileFieldsEducation.primary);
  }

  @Override
  public int hashCode() {
    return Objects.hash(additional, attestation, elementary, level, primary);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ProfileFieldsEducation {\n");
    sb.append("    additional: ").append(toIndentedString(additional)).append("\n");
    sb.append("    attestation: ").append(toIndentedString(attestation)).append("\n");
    sb.append("    elementary: ").append(toIndentedString(elementary)).append("\n");
    sb.append("    level: ").append(toIndentedString(level)).append("\n");
    sb.append("    primary: ").append(toIndentedString(primary)).append("\n");
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

