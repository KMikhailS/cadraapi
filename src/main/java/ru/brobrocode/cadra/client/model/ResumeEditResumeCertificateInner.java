package ru.brobrocode.cadra.client.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.annotation.Generated;
import jakarta.validation.constraints.NotNull;

import java.util.Objects;

/**
 * ResumeEditResumeCertificateInner
 */

@JsonTypeName("ResumeEditResume_certificate_inner")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2025-08-17T15:41:09.394389505+05:00[Asia/Yekaterinburg]", comments = "Generator version: 7.6.0")
public class ResumeEditResumeCertificateInner {

  private String achievedAt;

  private String owner;

  private String title;

  private String type;

  private String url;

  public ResumeEditResumeCertificateInner() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public ResumeEditResumeCertificateInner(String achievedAt, String title, String type) {
    this.achievedAt = achievedAt;
    this.title = title;
    this.type = type;
  }

  public ResumeEditResumeCertificateInner achievedAt(String achievedAt) {
    this.achievedAt = achievedAt;
    return this;
  }

  /**
   * Дата получения (в формате `ГГГГ-ММ-ДД`)
   * @return achievedAt
  */
  @NotNull 
  @Schema(name = "achieved_at", description = "Дата получения (в формате `ГГГГ-ММ-ДД`)", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("achieved_at")
  public String getAchievedAt() {
    return achievedAt;
  }

  public void setAchievedAt(String achievedAt) {
    this.achievedAt = achievedAt;
  }

  public ResumeEditResumeCertificateInner owner(String owner) {
    this.owner = owner;
    return this;
  }

  /**
   * На кого выдан сертификат, актуально только для сертификатов с `type = microsoft`
   * @return owner
  */
  
  @Schema(name = "owner", description = "На кого выдан сертификат, актуально только для сертификатов с `type = microsoft`", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("owner")
  public String getOwner() {
    return owner;
  }

  public void setOwner(String owner) {
    this.owner = owner;
  }

  public ResumeEditResumeCertificateInner title(String title) {
    this.title = title;
    return this;
  }

  /**
   * Название сертификата
   * @return title
  */
  @NotNull 
  @Schema(name = "title", description = "Название сертификата", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("title")
  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public ResumeEditResumeCertificateInner type(String type) {
    this.type = type;
    return this;
  }

  /**
   * Тип сертификата. Доступные значения: `custom`, `microsoft` 
   * @return type
  */
  @NotNull 
  @Schema(name = "type", description = "Тип сертификата. Доступные значения: `custom`, `microsoft` ", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("type")
  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }

  public ResumeEditResumeCertificateInner url(String url) {
    this.url = url;
    return this;
  }

  /**
   * Ссылка на страницу с описанием сертификата
   * @return url
  */
  
  @Schema(name = "url", description = "Ссылка на страницу с описанием сертификата", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
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
    ResumeEditResumeCertificateInner resumeEditResumeCertificateInner = (ResumeEditResumeCertificateInner) o;
    return Objects.equals(this.achievedAt, resumeEditResumeCertificateInner.achievedAt) &&
        Objects.equals(this.owner, resumeEditResumeCertificateInner.owner) &&
        Objects.equals(this.title, resumeEditResumeCertificateInner.title) &&
        Objects.equals(this.type, resumeEditResumeCertificateInner.type) &&
        Objects.equals(this.url, resumeEditResumeCertificateInner.url);
  }

  @Override
  public int hashCode() {
    return Objects.hash(achievedAt, owner, title, type, url);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ResumeEditResumeCertificateInner {\n");
    sb.append("    achievedAt: ").append(toIndentedString(achievedAt)).append("\n");
    sb.append("    owner: ").append(toIndentedString(owner)).append("\n");
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
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

