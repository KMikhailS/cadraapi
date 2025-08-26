package ru.brobrocode.cadra.client.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.annotation.Generated;
import jakarta.validation.constraints.NotNull;

import java.util.Objects;

/**
 * ResumeObjectsDownloadPdfRtf
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2025-08-17T15:41:09.394389505+05:00[Asia/Yekaterinburg]", comments = "Generator version: 7.6.0")
public class ResumeObjectsDownloadPdfRtf {

  private String url;

  public ResumeObjectsDownloadPdfRtf() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public ResumeObjectsDownloadPdfRtf(String url) {
    this.url = url;
  }

  public ResumeObjectsDownloadPdfRtf url(String url) {
    this.url = url;
    return this;
  }

  /**
   * Ссылка для получения PDF/RTF-версии резюме
   * @return url
  */
  @NotNull 
  @Schema(name = "url", description = "Ссылка для получения PDF/RTF-версии резюме", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("url")
  public String getUrl() {
    return url;
  }

  public void setUrl(String url) {
    this.url = url;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ResumeObjectsDownloadPdfRtf resumeObjectsDownloadPdfRtf = (ResumeObjectsDownloadPdfRtf) o;
    return Objects.equals(this.url, resumeObjectsDownloadPdfRtf.url);
  }

  @Override
  public int hashCode() {
    return Objects.hash(url);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ResumeObjectsDownloadPdfRtf {\n");
    sb.append("    url: ").append(toIndentedString(url)).append("\n");
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

