package ru.brobrocode.cadra.client.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.annotation.Generated;
import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;

import java.util.Objects;

/**
 * ResumeObjectsDownload
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2025-08-17T15:41:09.394389505+05:00[Asia/Yekaterinburg]", comments = "Generator version: 7.6.0")
public class ResumeObjectsDownload {

  private ResumeObjectsDownloadPdfRtf pdf;

  private ResumeObjectsDownloadPdfRtf rtf;

  public ResumeObjectsDownload() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public ResumeObjectsDownload(ResumeObjectsDownloadPdfRtf pdf, ResumeObjectsDownloadPdfRtf rtf) {
    this.pdf = pdf;
    this.rtf = rtf;
  }

  public ResumeObjectsDownload pdf(ResumeObjectsDownloadPdfRtf pdf) {
    this.pdf = pdf;
    return this;
  }

  /**
   * PDF-версия резюме
   * @return pdf
  */
  @NotNull @Valid 
  @Schema(name = "pdf", description = "PDF-версия резюме", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("pdf")
  public ResumeObjectsDownloadPdfRtf getPdf() {
    return pdf;
  }

  public void setPdf(ResumeObjectsDownloadPdfRtf pdf) {
    this.pdf = pdf;
  }

  public ResumeObjectsDownload rtf(ResumeObjectsDownloadPdfRtf rtf) {
    this.rtf = rtf;
    return this;
  }

  /**
   * RTF-версия резюме
   * @return rtf
  */
  @NotNull @Valid 
  @Schema(name = "rtf", description = "RTF-версия резюме", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("rtf")
  public ResumeObjectsDownloadPdfRtf getRtf() {
    return rtf;
  }

  public void setRtf(ResumeObjectsDownloadPdfRtf rtf) {
    this.rtf = rtf;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ResumeObjectsDownload resumeObjectsDownload = (ResumeObjectsDownload) o;
    return Objects.equals(this.pdf, resumeObjectsDownload.pdf) &&
        Objects.equals(this.rtf, resumeObjectsDownload.rtf);
  }

  @Override
  public int hashCode() {
    return Objects.hash(pdf, rtf);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ResumeObjectsDownload {\n");
    sb.append("    pdf: ").append(toIndentedString(pdf)).append("\n");
    sb.append("    rtf: ").append(toIndentedString(rtf)).append("\n");
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

