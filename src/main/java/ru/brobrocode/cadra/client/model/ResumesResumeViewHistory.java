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
 * ResumesResumeViewHistory
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2025-08-17T15:41:09.394389505+05:00[Asia/Yekaterinburg]", comments = "Generator version: 7.6.0")
public class ResumesResumeViewHistory {

  @Valid
  private List<@Valid ResumesResumeViewHistoryItem> items = new ArrayList<>();

  private ResumesResumeViewHistoryResume resume;

  public ResumesResumeViewHistory() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public ResumesResumeViewHistory(List<@Valid ResumesResumeViewHistoryItem> items, ResumesResumeViewHistoryResume resume) {
    this.items = items;
    this.resume = resume;
  }

  public ResumesResumeViewHistory items(List<@Valid ResumesResumeViewHistoryItem> items) {
    this.items = items;
    return this;
  }

  public ResumesResumeViewHistory addItemsItem(ResumesResumeViewHistoryItem itemsItem) {
    if (this.items == null) {
      this.items = new ArrayList<>();
    }
    this.items.add(itemsItem);
    return this;
  }

  /**
   * Список просмотров резюме
   * @return items
  */
  @NotNull @Valid 
  @Schema(name = "items", description = "Список просмотров резюме", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("items")
  public List<@Valid ResumesResumeViewHistoryItem> getItems() {
    return items;
  }

  public void setItems(List<@Valid ResumesResumeViewHistoryItem> items) {
    this.items = items;
  }

  public ResumesResumeViewHistory resume(ResumesResumeViewHistoryResume resume) {
    this.resume = resume;
    return this;
  }

  /**
   * Get resume
   * @return resume
  */
  @NotNull @Valid 
  @Schema(name = "resume", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("resume")
  public ResumesResumeViewHistoryResume getResume() {
    return resume;
  }

  public void setResume(ResumesResumeViewHistoryResume resume) {
    this.resume = resume;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ResumesResumeViewHistory resumesResumeViewHistory = (ResumesResumeViewHistory) o;
    return Objects.equals(this.items, resumesResumeViewHistory.items) &&
        Objects.equals(this.resume, resumesResumeViewHistory.resume);
  }

  @Override
  public int hashCode() {
    return Objects.hash(items, resume);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ResumesResumeViewHistory {\n");
    sb.append("    items: ").append(toIndentedString(items)).append("\n");
    sb.append("    resume: ").append(toIndentedString(resume)).append("\n");
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

