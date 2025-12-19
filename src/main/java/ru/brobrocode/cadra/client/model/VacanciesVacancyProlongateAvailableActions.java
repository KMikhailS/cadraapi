package ru.brobrocode.cadra.client.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.annotation.Generated;
import jakarta.validation.constraints.NotNull;

import java.util.Objects;

/**
 * VacanciesVacancyProlongateAvailableActions
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2025-08-17T15:41:09.394389505+05:00[Asia/Yekaterinburg]", comments = "Generator version: 7.6.0")
public class VacanciesVacancyProlongateAvailableActions implements VacanciesVacancyProlongateActionsInner {

  private Boolean enabled;

  private String id;

  private String method;

  private String url;

  public VacanciesVacancyProlongateAvailableActions() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public VacanciesVacancyProlongateAvailableActions(Boolean enabled, String id, String method, String url) {
    this.enabled = enabled;
    this.id = id;
    this.method = method;
    this.url = url;
  }

  public VacanciesVacancyProlongateAvailableActions enabled(Boolean enabled) {
    this.enabled = enabled;
    return this;
  }

  /**
   * Возможно ли выполнить действие
   * @return enabled
  */
  @NotNull 
  @Schema(name = "enabled", description = "Возможно ли выполнить действие", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("enabled")
  public Boolean getEnabled() {
    return enabled;
  }

  public void setEnabled(Boolean enabled) {
    this.enabled = enabled;
  }

  public VacanciesVacancyProlongateAvailableActions id(String id) {
    this.id = id;
    return this;
  }

  /**
   * Идентификатор действия
   * @return id
  */
  @NotNull 
  @Schema(name = "id", description = "Идентификатор действия", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("id")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public VacanciesVacancyProlongateAvailableActions method(String method) {
    this.method = method;
    return this;
  }

  /**
   * HTTP-метод запроса для выполнения действия
   * @return method
  */
  @NotNull 
  @Schema(name = "method", description = "HTTP-метод запроса для выполнения действия", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("method")
  public String getMethod() {
    return method;
  }

  public void setMethod(String method) {
    this.method = method;
  }

  public VacanciesVacancyProlongateAvailableActions url(String url) {
    this.url = url;
    return this;
  }

  /**
   * URL запроса для выполнения действия
   * @return url
  */
  @NotNull 
  @Schema(name = "url", description = "URL запроса для выполнения действия", requiredMode = Schema.RequiredMode.REQUIRED)
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
    VacanciesVacancyProlongateAvailableActions vacanciesVacancyProlongateAvailableActions = (VacanciesVacancyProlongateAvailableActions) o;
    return Objects.equals(this.enabled, vacanciesVacancyProlongateAvailableActions.enabled) &&
        Objects.equals(this.id, vacanciesVacancyProlongateAvailableActions.id) &&
        Objects.equals(this.method, vacanciesVacancyProlongateAvailableActions.method) &&
        Objects.equals(this.url, vacanciesVacancyProlongateAvailableActions.url);
  }

  @Override
  public int hashCode() {
    return Objects.hash(enabled, id, method, url);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class VacanciesVacancyProlongateAvailableActions {\n");
    sb.append("    enabled: ").append(toIndentedString(enabled)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    method: ").append(toIndentedString(method)).append("\n");
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

