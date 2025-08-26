package ru.brobrocode.cadra.client.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.annotation.Generated;
import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;

import java.math.BigDecimal;
import java.util.Objects;

/**
 * Количество резюме в списках
 */

@Schema(name = "ResumesByStatusCounters", description = "Количество резюме в списках")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2025-08-17T15:41:09.394389505+05:00[Asia/Yekaterinburg]", comments = "Generator version: 7.6.0")
public class ResumesByStatusCounters {

  private BigDecimal alreadyApplied;

  private BigDecimal notPublished;

  private BigDecimal suitable;

  private BigDecimal unavailable;

  public ResumesByStatusCounters() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public ResumesByStatusCounters(BigDecimal alreadyApplied, BigDecimal notPublished, BigDecimal suitable, BigDecimal unavailable) {
    this.alreadyApplied = alreadyApplied;
    this.notPublished = notPublished;
    this.suitable = suitable;
    this.unavailable = unavailable;
  }

  public ResumesByStatusCounters alreadyApplied(BigDecimal alreadyApplied) {
    this.alreadyApplied = alreadyApplied;
    return this;
  }

  /**
   * Количество резюме, уже использованных для отклика на данную вакансию
   * @return alreadyApplied
  */
  @NotNull @Valid 
  @Schema(name = "already_applied", description = "Количество резюме, уже использованных для отклика на данную вакансию", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("already_applied")
  public BigDecimal getAlreadyApplied() {
    return alreadyApplied;
  }

  public void setAlreadyApplied(BigDecimal alreadyApplied) {
    this.alreadyApplied = alreadyApplied;
  }

  public ResumesByStatusCounters notPublished(BigDecimal notPublished) {
    this.notPublished = notPublished;
    return this;
  }

  /**
   * Количество неопубликованных резюме (в [статусе](#tag/Rezyume.-Prosmotr-informacii/Status-rezyume) `not_published` или `blocked`)
   * @return notPublished
  */
  @NotNull @Valid 
  @Schema(name = "not_published", description = "Количество неопубликованных резюме (в [статусе](#tag/Rezyume.-Prosmotr-informacii/Status-rezyume) `not_published` или `blocked`)", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("not_published")
  public BigDecimal getNotPublished() {
    return notPublished;
  }

  public void setNotPublished(BigDecimal notPublished) {
    this.notPublished = notPublished;
  }

  public ResumesByStatusCounters suitable(BigDecimal suitable) {
    this.suitable = suitable;
    return this;
  }

  /**
   * Количество резюме, которыми можно откликнуться на данную вакансию
   * @return suitable
  */
  @NotNull @Valid 
  @Schema(name = "suitable", description = "Количество резюме, которыми можно откликнуться на данную вакансию", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("suitable")
  public BigDecimal getSuitable() {
    return suitable;
  }

  public void setSuitable(BigDecimal suitable) {
    this.suitable = suitable;
  }

  public ResumesByStatusCounters unavailable(BigDecimal unavailable) {
    this.unavailable = unavailable;
    return this;
  }

  /**
   * Количество резюме, которыми невозможно откликнуться на данную вакансию (например, из-за конфликтующих настроек видимости)
   * @return unavailable
  */
  @NotNull @Valid 
  @Schema(name = "unavailable", description = "Количество резюме, которыми невозможно откликнуться на данную вакансию (например, из-за конфликтующих настроек видимости)", requiredMode = Schema.RequiredMode.REQUIRED)
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
    ResumesByStatusCounters resumesByStatusCounters = (ResumesByStatusCounters) o;
    return Objects.equals(this.alreadyApplied, resumesByStatusCounters.alreadyApplied) &&
        Objects.equals(this.notPublished, resumesByStatusCounters.notPublished) &&
        Objects.equals(this.suitable, resumesByStatusCounters.suitable) &&
        Objects.equals(this.unavailable, resumesByStatusCounters.unavailable);
  }

  @Override
  public int hashCode() {
    return Objects.hash(alreadyApplied, notPublished, suitable, unavailable);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ResumesByStatusCounters {\n");
    sb.append("    alreadyApplied: ").append(toIndentedString(alreadyApplied)).append("\n");
    sb.append("    notPublished: ").append(toIndentedString(notPublished)).append("\n");
    sb.append("    suitable: ").append(toIndentedString(suitable)).append("\n");
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

