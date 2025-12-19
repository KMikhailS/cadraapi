package ru.brobrocode.cadra.client.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.annotation.Generated;
import jakarta.validation.constraints.NotNull;

import java.util.Objects;

/**
 * EmployersBrandingMakeupMakeup
 */

@JsonTypeName("EmployersBrandingMakeup_makeup")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2025-08-17T15:41:09.394389505+05:00[Asia/Yekaterinburg]", comments = "Generator version: 7.6.0")
public class EmployersBrandingMakeupMakeup {

  private String url;

  public EmployersBrandingMakeupMakeup() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public EmployersBrandingMakeupMakeup(String url) {
    this.url = url;
  }

  public EmployersBrandingMakeupMakeup url(String url) {
    this.url = url;
    return this;
  }

  /**
   * Ссылка на webview версию бренд страницы
   * @return url
  */
  @NotNull 
  @Schema(name = "url", description = "Ссылка на webview версию бренд страницы", requiredMode = Schema.RequiredMode.REQUIRED)
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
    EmployersBrandingMakeupMakeup employersBrandingMakeupMakeup = (EmployersBrandingMakeupMakeup) o;
    return Objects.equals(this.url, employersBrandingMakeupMakeup.url);
  }

  @Override
  public int hashCode() {
    return Objects.hash(url);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EmployersBrandingMakeupMakeup {\n");
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

