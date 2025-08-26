package ru.brobrocode.cadra.client.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.annotation.Generated;
import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;

import java.util.Objects;

/**
 * ResumeObjectsActions
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2025-08-17T15:41:09.394389505+05:00[Asia/Yekaterinburg]", comments = "Generator version: 7.6.0")
public class ResumeObjectsActions {

  private ResumeObjectsDownload download;

  private ResumeObjectsDownload downloadWithContact = null;

  private IncludesUrl getWithContact = null;

  public ResumeObjectsActions() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public ResumeObjectsActions(ResumeObjectsDownload download) {
    this.download = download;
  }

  public ResumeObjectsActions download(ResumeObjectsDownload download) {
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

  public ResumeObjectsActions downloadWithContact(ResumeObjectsDownload downloadWithContact) {
    this.downloadWithContact = downloadWithContact;
    return this;
  }

  /**
   * Get downloadWithContact
   * @return downloadWithContact
  */
  @Valid 
  @Schema(name = "download_with_contact", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("download_with_contact")
  public ResumeObjectsDownload getDownloadWithContact() {
    return downloadWithContact;
  }

  public void setDownloadWithContact(ResumeObjectsDownload downloadWithContact) {
    this.downloadWithContact = downloadWithContact;
  }

  public ResumeObjectsActions getWithContact(IncludesUrl getWithContact) {
    this.getWithContact = getWithContact;
    return this;
  }

  /**
   * Get getWithContact
   * @return getWithContact
  */
  @Valid 
  @Schema(name = "get_with_contact", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("get_with_contact")
  public IncludesUrl getGetWithContact() {
    return getWithContact;
  }

  public void setGetWithContact(IncludesUrl getWithContact) {
    this.getWithContact = getWithContact;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ResumeObjectsActions resumeObjectsActions = (ResumeObjectsActions) o;
    return Objects.equals(this.download, resumeObjectsActions.download) &&
        Objects.equals(this.downloadWithContact, resumeObjectsActions.downloadWithContact) &&
        Objects.equals(this.getWithContact, resumeObjectsActions.getWithContact);
  }

  @Override
  public int hashCode() {
    return Objects.hash(download, downloadWithContact, getWithContact);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ResumeObjectsActions {\n");
    sb.append("    download: ").append(toIndentedString(download)).append("\n");
    sb.append("    downloadWithContact: ").append(toIndentedString(downloadWithContact)).append("\n");
    sb.append("    getWithContact: ").append(toIndentedString(getWithContact)).append("\n");
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

