package ru.brobrocode.cadra.client.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.annotation.Generated;
import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;

import java.util.Objects;

/**
 * ResumeObjectsActionsForOwner
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2025-08-17T15:41:09.394389505+05:00[Asia/Yekaterinburg]", comments = "Generator version: 7.6.0")
public class ResumeObjectsActionsForOwner {

  private ResumeObjectsDownload download;

  public ResumeObjectsActionsForOwner() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public ResumeObjectsActionsForOwner(ResumeObjectsDownload download) {
    this.download = download;
  }

  public ResumeObjectsActionsForOwner download(ResumeObjectsDownload download) {
    this.download = download;
    return this;
  }

  /**
   * Ссылки для скачивания резюме в нескольких форматах ([подробнее](#tag/Prosmotr-rezyume/operation/get-resume)) (атрибут 'actions') 
   * @return download
  */
  @NotNull @Valid 
  @Schema(name = "download", description = "Ссылки для скачивания резюме в нескольких форматах ([подробнее](#tag/Prosmotr-rezyume/operation/get-resume)) (атрибут 'actions') ", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("download")
  public ResumeObjectsDownload getDownload() {
    return download;
  }

  public void setDownload(ResumeObjectsDownload download) {
    this.download = download;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ResumeObjectsActionsForOwner resumeObjectsActionsForOwner = (ResumeObjectsActionsForOwner) o;
    return Objects.equals(this.download, resumeObjectsActionsForOwner.download);
  }

  @Override
  public int hashCode() {
    return Objects.hash(download);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ResumeObjectsActionsForOwner {\n");
    sb.append("    download: ").append(toIndentedString(download)).append("\n");
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

