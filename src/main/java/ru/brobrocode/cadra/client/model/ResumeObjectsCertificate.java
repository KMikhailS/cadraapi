package ru.brobrocode.cadra.client.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.annotation.Generated;

import java.util.Objects;

/**
 * ResumeObjectsCertificate
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2025-08-17T15:41:09.394389505+05:00[Asia/Yekaterinburg]", comments = "Generator version: 7.6.0")
public class ResumeObjectsCertificate {

  private String achievedAt;

  private String owner = null;

  private String title;

  private String type;

  private String url = null;

  public ResumeObjectsCertificate achievedAt(String achievedAt) {
    this.achievedAt = achievedAt;
    return this;
  }

  /**
   * Дата получения (в формате `ГГГГ-ММ-ДД`)
   * @return achievedAt
  */
  
  @Schema(name = "achieved_at", description = "Дата получения (в формате `ГГГГ-ММ-ДД`)", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("achieved_at")
  public String getAchievedAt() {
    return achievedAt;
  }

  public void setAchievedAt(String achievedAt) {
    this.achievedAt = achievedAt;
  }

  public ResumeObjectsCertificate owner(String owner) {
    this.owner = owner;
    return this;
  }

  /**
   * На кого выдан сертификат. Возвращается только для сертификатов с `type = microsoft`
   * @return owner
  */
  
  @Schema(name = "owner", description = "На кого выдан сертификат. Возвращается только для сертификатов с `type = microsoft`", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("owner")
  public String getOwner() {
    return owner;
  }

  public void setOwner(String owner) {
    this.owner = owner;
  }

  public ResumeObjectsCertificate title(String title) {
    this.title = title;
    return this;
  }

  /**
   * Название сертификата
   * @return title
  */
  
  @Schema(name = "title", description = "Название сертификата", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("title")
  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public ResumeObjectsCertificate type(String type) {
    this.type = type;
    return this;
  }

  /**
   * Тип сертификата. Доступные значения:  * `custom`; * `microsoft` 
   * @return type
  */
  
  @Schema(name = "type", description = "Тип сертификата. Доступные значения:  * `custom`; * `microsoft` ", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("type")
  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }

  public ResumeObjectsCertificate url(String url) {
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
    ResumeObjectsCertificate resumeObjectsCertificate = (ResumeObjectsCertificate) o;
    return Objects.equals(this.achievedAt, resumeObjectsCertificate.achievedAt) &&
        Objects.equals(this.owner, resumeObjectsCertificate.owner) &&
        Objects.equals(this.title, resumeObjectsCertificate.title) &&
        Objects.equals(this.type, resumeObjectsCertificate.type) &&
        Objects.equals(this.url, resumeObjectsCertificate.url);
  }

  @Override
  public int hashCode() {
    return Objects.hash(achievedAt, owner, title, type, url);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ResumeObjectsCertificate {\n");
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

