package ru.brobrocode.cadra.client.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.annotation.Generated;
import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * ResumesByStatusResponse
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2025-08-17T15:41:09.394389505+05:00[Asia/Yekaterinburg]", comments = "Generator version: 7.6.0")
public class ResumesByStatusResponse {

  @Valid
  private List<@Valid ResumesSuitableResumeItem> alreadyApplied = new ArrayList<>();

  private ResumesByStatusCounters counters = null;

  @Valid
  private List<@Valid ResumesSuitableResumeItem> notPublished = new ArrayList<>();

  @Valid
  private List<@Valid ResumesSuitableResumeItem> suitable = new ArrayList<>();

  @Valid
  private List<@Valid ResumesSuitableResumeItem> unavailable = new ArrayList<>();

  public ResumesByStatusResponse() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public ResumesByStatusResponse(List<@Valid ResumesSuitableResumeItem> alreadyApplied, List<@Valid ResumesSuitableResumeItem> notPublished, List<@Valid ResumesSuitableResumeItem> suitable, List<@Valid ResumesSuitableResumeItem> unavailable) {
    this.alreadyApplied = alreadyApplied;
    this.notPublished = notPublished;
    this.suitable = suitable;
    this.unavailable = unavailable;
  }

  public ResumesByStatusResponse alreadyApplied(List<@Valid ResumesSuitableResumeItem> alreadyApplied) {
    this.alreadyApplied = alreadyApplied;
    return this;
  }

  public ResumesByStatusResponse addAlreadyAppliedItem(ResumesSuitableResumeItem alreadyAppliedItem) {
    if (this.alreadyApplied == null) {
      this.alreadyApplied = new ArrayList<>();
    }
    this.alreadyApplied.add(alreadyAppliedItem);
    return this;
  }

  /**
   * Список резюме, уже использованных для отклика на данную вакансию
   * @return alreadyApplied
  */
  @NotNull @Valid @Size(min = 0) 
  @Schema(name = "already_applied", description = "Список резюме, уже использованных для отклика на данную вакансию", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("already_applied")
  public List<@Valid ResumesSuitableResumeItem> getAlreadyApplied() {
    return alreadyApplied;
  }

  public void setAlreadyApplied(List<@Valid ResumesSuitableResumeItem> alreadyApplied) {
    this.alreadyApplied = alreadyApplied;
  }

  public ResumesByStatusResponse counters(ResumesByStatusCounters counters) {
    this.counters = counters;
    return this;
  }

  /**
   * Get counters
   * @return counters
  */
  @Valid 
  @Schema(name = "counters", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("counters")
  public ResumesByStatusCounters getCounters() {
    return counters;
  }

  public void setCounters(ResumesByStatusCounters counters) {
    this.counters = counters;
  }

  public ResumesByStatusResponse notPublished(List<@Valid ResumesSuitableResumeItem> notPublished) {
    this.notPublished = notPublished;
    return this;
  }

  public ResumesByStatusResponse addNotPublishedItem(ResumesSuitableResumeItem notPublishedItem) {
    if (this.notPublished == null) {
      this.notPublished = new ArrayList<>();
    }
    this.notPublished.add(notPublishedItem);
    return this;
  }

  /**
   * Список неопубликованных резюме (в [статусе](#tag/Rezyume.-Prosmotr-informacii/Status-rezyume) `not_published` или `blocked`)
   * @return notPublished
  */
  @NotNull @Valid @Size(min = 0) 
  @Schema(name = "not_published", description = "Список неопубликованных резюме (в [статусе](#tag/Rezyume.-Prosmotr-informacii/Status-rezyume) `not_published` или `blocked`)", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("not_published")
  public List<@Valid ResumesSuitableResumeItem> getNotPublished() {
    return notPublished;
  }

  public void setNotPublished(List<@Valid ResumesSuitableResumeItem> notPublished) {
    this.notPublished = notPublished;
  }

  public ResumesByStatusResponse suitable(List<@Valid ResumesSuitableResumeItem> suitable) {
    this.suitable = suitable;
    return this;
  }

  public ResumesByStatusResponse addSuitableItem(ResumesSuitableResumeItem suitableItem) {
    if (this.suitable == null) {
      this.suitable = new ArrayList<>();
    }
    this.suitable.add(suitableItem);
    return this;
  }

  /**
   * Список резюме, которыми можно откликнуться на данную вакансию
   * @return suitable
  */
  @NotNull @Valid @Size(min = 0) 
  @Schema(name = "suitable", description = "Список резюме, которыми можно откликнуться на данную вакансию", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("suitable")
  public List<@Valid ResumesSuitableResumeItem> getSuitable() {
    return suitable;
  }

  public void setSuitable(List<@Valid ResumesSuitableResumeItem> suitable) {
    this.suitable = suitable;
  }

  public ResumesByStatusResponse unavailable(List<@Valid ResumesSuitableResumeItem> unavailable) {
    this.unavailable = unavailable;
    return this;
  }

  public ResumesByStatusResponse addUnavailableItem(ResumesSuitableResumeItem unavailableItem) {
    if (this.unavailable == null) {
      this.unavailable = new ArrayList<>();
    }
    this.unavailable.add(unavailableItem);
    return this;
  }

  /**
   * Список резюме, которыми невозможно откликнуться на данную вакансию (например, из-за конфликтующих настроек видимости)
   * @return unavailable
  */
  @NotNull @Valid @Size(min = 0) 
  @Schema(name = "unavailable", description = "Список резюме, которыми невозможно откликнуться на данную вакансию (например, из-за конфликтующих настроек видимости)", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("unavailable")
  public List<@Valid ResumesSuitableResumeItem> getUnavailable() {
    return unavailable;
  }

  public void setUnavailable(List<@Valid ResumesSuitableResumeItem> unavailable) {
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
    ResumesByStatusResponse resumesByStatusResponse = (ResumesByStatusResponse) o;
    return Objects.equals(this.alreadyApplied, resumesByStatusResponse.alreadyApplied) &&
        Objects.equals(this.counters, resumesByStatusResponse.counters) &&
        Objects.equals(this.notPublished, resumesByStatusResponse.notPublished) &&
        Objects.equals(this.suitable, resumesByStatusResponse.suitable) &&
        Objects.equals(this.unavailable, resumesByStatusResponse.unavailable);
  }

  @Override
  public int hashCode() {
    return Objects.hash(alreadyApplied, counters, notPublished, suitable, unavailable);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ResumesByStatusResponse {\n");
    sb.append("    alreadyApplied: ").append(toIndentedString(alreadyApplied)).append("\n");
    sb.append("    counters: ").append(toIndentedString(counters)).append("\n");
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

