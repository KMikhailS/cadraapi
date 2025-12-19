package ru.brobrocode.cadra.client.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.annotation.Generated;
import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * Образование  Особенности сохранения образования:  - Если передать и высшее и среднее образование и уровень образования \&quot;средний\&quot;, то сохранится только среднее образование. - Если передать и высшее и среднее образование и уровень образования \&quot;высшее\&quot;, то сохранится только высшее образование 
 */

@Schema(name = "ResumeEditResume_education", description = "Образование  Особенности сохранения образования:  - Если передать и высшее и среднее образование и уровень образования \"средний\", то сохранится только среднее образование. - Если передать и высшее и среднее образование и уровень образования \"высшее\", то сохранится только высшее образование ")
@JsonTypeName("ResumeEditResume_education")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2025-08-17T15:41:09.394389505+05:00[Asia/Yekaterinburg]", comments = "Generator version: 7.6.0")
public class ResumeEditResumeEducation {

  @Valid
  private List<@Valid ResumeEditResumeEducationAdditionalInner> additional = new ArrayList<>();

  @Valid
  private List<@Valid ResumeEditResumeEducationAdditionalInner> attestation = new ArrayList<>();

  @Valid
  private List<@Valid ResumeEditResumeEducationElementaryInner> elementary = new ArrayList<>();

  private IncludesId level;

  @Valid
  private List<@Valid ResumeEditResumeEducationPrimaryInner> primary = new ArrayList<>();

  public ResumeEditResumeEducation() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public ResumeEditResumeEducation(List<@Valid ResumeEditResumeEducationAdditionalInner> additional, List<@Valid ResumeEditResumeEducationAdditionalInner> attestation, List<@Valid ResumeEditResumeEducationElementaryInner> elementary, IncludesId level, List<@Valid ResumeEditResumeEducationPrimaryInner> primary) {
    this.additional = additional;
    this.attestation = attestation;
    this.elementary = elementary;
    this.level = level;
    this.primary = primary;
  }

  public ResumeEditResumeEducation additional(List<@Valid ResumeEditResumeEducationAdditionalInner> additional) {
    this.additional = additional;
    return this;
  }

  public ResumeEditResumeEducation addAdditionalItem(ResumeEditResumeEducationAdditionalInner additionalItem) {
    if (this.additional == null) {
      this.additional = new ArrayList<>();
    }
    this.additional.add(additionalItem);
    return this;
  }

  /**
   * Список курсов повышения квалификации
   * @return additional
  */
  @NotNull @Valid 
  @Schema(name = "additional", description = "Список курсов повышения квалификации", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("additional")
  public List<@Valid ResumeEditResumeEducationAdditionalInner> getAdditional() {
    return additional;
  }

  public void setAdditional(List<@Valid ResumeEditResumeEducationAdditionalInner> additional) {
    this.additional = additional;
  }

  public ResumeEditResumeEducation attestation(List<@Valid ResumeEditResumeEducationAdditionalInner> attestation) {
    this.attestation = attestation;
    return this;
  }

  public ResumeEditResumeEducation addAttestationItem(ResumeEditResumeEducationAdditionalInner attestationItem) {
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
  @NotNull @Valid 
  @Schema(name = "attestation", description = "Список пройденных тестов или экзаменов", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("attestation")
  public List<@Valid ResumeEditResumeEducationAdditionalInner> getAttestation() {
    return attestation;
  }

  public void setAttestation(List<@Valid ResumeEditResumeEducationAdditionalInner> attestation) {
    this.attestation = attestation;
  }

  public ResumeEditResumeEducation elementary(List<@Valid ResumeEditResumeEducationElementaryInner> elementary) {
    this.elementary = elementary;
    return this;
  }

  public ResumeEditResumeEducation addElementaryItem(ResumeEditResumeEducationElementaryInner elementaryItem) {
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
  @NotNull @Valid 
  @Schema(name = "elementary", description = "Среднее образование. Обычно заполняется только при отсутствии высшего образования", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("elementary")
  public List<@Valid ResumeEditResumeEducationElementaryInner> getElementary() {
    return elementary;
  }

  public void setElementary(List<@Valid ResumeEditResumeEducationElementaryInner> elementary) {
    this.elementary = elementary;
  }

  public ResumeEditResumeEducation level(IncludesId level) {
    this.level = level;
    return this;
  }

  /**
   * Уровень образования. Элемент справочника [education_level](#tag/Obshie-spravochniki/operation/get-dictionaries)
   * @return level
  */
  @NotNull @Valid 
  @Schema(name = "level", description = "Уровень образования. Элемент справочника [education_level](#tag/Obshie-spravochniki/operation/get-dictionaries)", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("level")
  public IncludesId getLevel() {
    return level;
  }

  public void setLevel(IncludesId level) {
    this.level = level;
  }

  public ResumeEditResumeEducation primary(List<@Valid ResumeEditResumeEducationPrimaryInner> primary) {
    this.primary = primary;
    return this;
  }

  public ResumeEditResumeEducation addPrimaryItem(ResumeEditResumeEducationPrimaryInner primaryItem) {
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
  @NotNull @Valid 
  @Schema(name = "primary", description = "Список образований выше среднего", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("primary")
  public List<@Valid ResumeEditResumeEducationPrimaryInner> getPrimary() {
    return primary;
  }

  public void setPrimary(List<@Valid ResumeEditResumeEducationPrimaryInner> primary) {
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
    ResumeEditResumeEducation resumeEditResumeEducation = (ResumeEditResumeEducation) o;
    return Objects.equals(this.additional, resumeEditResumeEducation.additional) &&
        Objects.equals(this.attestation, resumeEditResumeEducation.attestation) &&
        Objects.equals(this.elementary, resumeEditResumeEducation.elementary) &&
        Objects.equals(this.level, resumeEditResumeEducation.level) &&
        Objects.equals(this.primary, resumeEditResumeEducation.primary);
  }

  @Override
  public int hashCode() {
    return Objects.hash(additional, attestation, elementary, level, primary);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ResumeEditResumeEducation {\n");
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

