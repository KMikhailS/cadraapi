package ru.brobrocode.cadra.client.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.annotation.Generated;
import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;

import java.math.BigDecimal;
import java.util.Objects;

/**
 * Содержит информацию об общем количестве резюме у соискателя
 */

@Schema(name = "ResumesSuitableResumeOverall", description = "Содержит информацию об общем количестве резюме у соискателя")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2025-08-17T15:41:09.394389505+05:00[Asia/Yekaterinburg]", comments = "Generator version: 7.6.0")
public class ResumesSuitableResumeOverall {

  private BigDecimal alreadyApplied;

  private BigDecimal notPublished;

  private BigDecimal unavailable;

  public ResumesSuitableResumeOverall() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public ResumesSuitableResumeOverall(BigDecimal alreadyApplied, BigDecimal notPublished, BigDecimal unavailable) {
    this.alreadyApplied = alreadyApplied;
    this.notPublished = notPublished;
    this.unavailable = unavailable;
  }

  public ResumesSuitableResumeOverall alreadyApplied(BigDecimal alreadyApplied) {
    this.alreadyApplied = alreadyApplied;
    return this;
  }

  /**
   * Количество резюме, которыми пользователь уже откликался на эту вакансию
   * @return alreadyApplied
  */
  @NotNull @Valid 
  @Schema(name = "already_applied", description = "Количество резюме, которыми пользователь уже откликался на эту вакансию", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("already_applied")
  public BigDecimal getAlreadyApplied() {
    return alreadyApplied;
  }

  public void setAlreadyApplied(BigDecimal alreadyApplied) {
    this.alreadyApplied = alreadyApplied;
  }

  public ResumesSuitableResumeOverall notPublished(BigDecimal notPublished) {
    this.notPublished = notPublished;
    return this;
  }

  /**
   * Количество неопубликованных резюме
   * @return notPublished
  */
  @NotNull @Valid 
  @Schema(name = "not_published", description = "Количество неопубликованных резюме", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("not_published")
  public BigDecimal getNotPublished() {
    return notPublished;
  }

  public void setNotPublished(BigDecimal notPublished) {
    this.notPublished = notPublished;
  }

  public ResumesSuitableResumeOverall unavailable(BigDecimal unavailable) {
    this.unavailable = unavailable;
    return this;
  }

  /**
   * Количество резюме, которыми невозможно откликнуться на данную вакансию по другим причинам (конфликтующие настройки видимости резюме и т.п.)
   * @return unavailable
  */
  @NotNull @Valid 
  @Schema(name = "unavailable", description = "Количество резюме, которыми невозможно откликнуться на данную вакансию по другим причинам (конфликтующие настройки видимости резюме и т.п.)", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("unavailable")
  public BigDecimal getUnavailable() {
    return unavailable;
  }

  public void setUnavailable(BigDecimal unavailable) {
    this.unavailable = unavailable;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ResumesSuitableResumeOverall resumesSuitableResumeOverall = (ResumesSuitableResumeOverall) o;
    return Objects.equals(this.alreadyApplied, resumesSuitableResumeOverall.alreadyApplied) &&
        Objects.equals(this.notPublished, resumesSuitableResumeOverall.notPublished) &&
        Objects.equals(this.unavailable, resumesSuitableResumeOverall.unavailable);
  }

  @Override
  public int hashCode() {
    return Objects.hash(alreadyApplied, notPublished, unavailable);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ResumesSuitableResumeOverall {\n");
    sb.append("    alreadyApplied: ").append(toIndentedString(alreadyApplied)).append("\n");
    sb.append("    notPublished: ").append(toIndentedString(notPublished)).append("\n");
    sb.append("    unavailable: ").append(toIndentedString(unavailable)).append("\n");
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

