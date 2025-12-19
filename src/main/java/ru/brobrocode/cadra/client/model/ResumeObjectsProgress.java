package ru.brobrocode.cadra.client.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.annotation.Generated;
import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * Информация о заполненности резюме
 */

@Schema(name = "ResumeObjectsProgress", description = "Информация о заполненности резюме")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2025-08-17T15:41:09.394389505+05:00[Asia/Yekaterinburg]", comments = "Generator version: 7.6.0")
public class ResumeObjectsProgress {

  @Valid
  private List<@Valid IncludesIdName> mandatory = new ArrayList<>();

  private BigDecimal percentage;

  @Valid
  private List<@Valid IncludesIdName> recommended = new ArrayList<>();

  public ResumeObjectsProgress() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public ResumeObjectsProgress(List<@Valid IncludesIdName> mandatory, BigDecimal percentage, List<@Valid IncludesIdName> recommended) {
    this.mandatory = mandatory;
    this.percentage = percentage;
    this.recommended = recommended;
  }

  public ResumeObjectsProgress mandatory(List<@Valid IncludesIdName> mandatory) {
    this.mandatory = mandatory;
    return this;
  }

  public ResumeObjectsProgress addMandatoryItem(IncludesIdName mandatoryItem) {
    if (this.mandatory == null) {
      this.mandatory = new ArrayList<>();
    }
    this.mandatory.add(mandatoryItem);
    return this;
  }

  /**
   * Список полей, которые обязательны, но еще не заполнены
   * @return mandatory
  */
  @NotNull @Valid 
  @Schema(name = "mandatory", description = "Список полей, которые обязательны, но еще не заполнены", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("mandatory")
  public List<@Valid IncludesIdName> getMandatory() {
    return mandatory;
  }

  public void setMandatory(List<@Valid IncludesIdName> mandatory) {
    this.mandatory = mandatory;
  }

  public ResumeObjectsProgress percentage(BigDecimal percentage) {
    this.percentage = percentage;
    return this;
  }

  /**
   * Процент заполненности резюме
   * @return percentage
  */
  @NotNull @Valid 
  @Schema(name = "percentage", description = "Процент заполненности резюме", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("percentage")
  public BigDecimal getPercentage() {
    return percentage;
  }

  public void setPercentage(BigDecimal percentage) {
    this.percentage = percentage;
  }

  public ResumeObjectsProgress recommended(List<@Valid IncludesIdName> recommended) {
    this.recommended = recommended;
    return this;
  }

  public ResumeObjectsProgress addRecommendedItem(IncludesIdName recommendedItem) {
    if (this.recommended == null) {
      this.recommended = new ArrayList<>();
    }
    this.recommended.add(recommendedItem);
    return this;
  }

  /**
   * Список полей, которые рекомендованы к заполнению, но ещё не заполнены
   * @return recommended
  */
  @NotNull @Valid 
  @Schema(name = "recommended", description = "Список полей, которые рекомендованы к заполнению, но ещё не заполнены", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("recommended")
  public List<@Valid IncludesIdName> getRecommended() {
    return recommended;
  }

  public void setRecommended(List<@Valid IncludesIdName> recommended) {
    this.recommended = recommended;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ResumeObjectsProgress resumeObjectsProgress = (ResumeObjectsProgress) o;
    return Objects.equals(this.mandatory, resumeObjectsProgress.mandatory) &&
        Objects.equals(this.percentage, resumeObjectsProgress.percentage) &&
        Objects.equals(this.recommended, resumeObjectsProgress.recommended);
  }

  @Override
  public int hashCode() {
    return Objects.hash(mandatory, percentage, recommended);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ResumeObjectsProgress {\n");
    sb.append("    mandatory: ").append(toIndentedString(mandatory)).append("\n");
    sb.append("    percentage: ").append(toIndentedString(percentage)).append("\n");
    sb.append("    recommended: ").append(toIndentedString(recommended)).append("\n");
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

