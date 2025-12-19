package ru.brobrocode.cadra.client.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.annotation.Generated;
import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * EmployersBrandingConstructorConstructor
 */

@JsonTypeName("EmployersBrandingConstructor_constructor")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2025-08-17T15:41:09.394389505+05:00[Asia/Yekaterinburg]", comments = "Generator version: 7.6.0")
public class EmployersBrandingConstructorConstructor {

  private EmployersBrandingConstructorHeaderPicture headerPicture = null;

  private String url;

  @Valid
  private List<EmployersBrandingConstructorConstructorWidgetsInner> widgets = new ArrayList<>();

  public EmployersBrandingConstructorConstructor() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public EmployersBrandingConstructorConstructor(EmployersBrandingConstructorHeaderPicture headerPicture, String url, List<EmployersBrandingConstructorConstructorWidgetsInner> widgets) {
    this.headerPicture = headerPicture;
    this.url = url;
    this.widgets = widgets;
  }

  public EmployersBrandingConstructorConstructor headerPicture(EmployersBrandingConstructorHeaderPicture headerPicture) {
    this.headerPicture = headerPicture;
    return this;
  }

  /**
   * Get headerPicture
   * @return headerPicture
  */
  @NotNull @Valid 
  @Schema(name = "header_picture", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("header_picture")
  public EmployersBrandingConstructorHeaderPicture getHeaderPicture() {
    return headerPicture;
  }

  public void setHeaderPicture(EmployersBrandingConstructorHeaderPicture headerPicture) {
    this.headerPicture = headerPicture;
  }

  public EmployersBrandingConstructorConstructor url(String url) {
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

  public EmployersBrandingConstructorConstructor widgets(List<EmployersBrandingConstructorConstructorWidgetsInner> widgets) {
    this.widgets = widgets;
    return this;
  }

  public EmployersBrandingConstructorConstructor addWidgetsItem(EmployersBrandingConstructorConstructorWidgetsInner widgetsItem) {
    if (this.widgets == null) {
      this.widgets = new ArrayList<>();
    }
    this.widgets.add(widgetsItem);
    return this;
  }

  /**
   * Список виджетов на странице
   * @return widgets
  */
  @NotNull @Valid 
  @Schema(name = "widgets", description = "Список виджетов на странице", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("widgets")
  public List<EmployersBrandingConstructorConstructorWidgetsInner> getWidgets() {
    return widgets;
  }

  public void setWidgets(List<EmployersBrandingConstructorConstructorWidgetsInner> widgets) {
    this.widgets = widgets;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EmployersBrandingConstructorConstructor employersBrandingConstructorConstructor = (EmployersBrandingConstructorConstructor) o;
    return Objects.equals(this.headerPicture, employersBrandingConstructorConstructor.headerPicture) &&
        Objects.equals(this.url, employersBrandingConstructorConstructor.url) &&
        Objects.equals(this.widgets, employersBrandingConstructorConstructor.widgets);
  }

  @Override
  public int hashCode() {
    return Objects.hash(headerPicture, url, widgets);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EmployersBrandingConstructorConstructor {\n");
    sb.append("    headerPicture: ").append(toIndentedString(headerPicture)).append("\n");
    sb.append("    url: ").append(toIndentedString(url)).append("\n");
    sb.append("    widgets: ").append(toIndentedString(widgets)).append("\n");
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

