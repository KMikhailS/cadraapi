package ru.brobrocode.cadra.client.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.annotation.Generated;
import jakarta.validation.constraints.NotNull;

import java.util.Objects;

/**
 * VacancyNegotiationSubActions
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2025-08-17T15:41:09.394389505+05:00[Asia/Yekaterinburg]", comments = "Generator version: 7.6.0")
public class VacancyNegotiationSubActions {

  private String id;

  private String method;

  private String name;

  private String url;

  public VacancyNegotiationSubActions() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public VacancyNegotiationSubActions(String id, String method, String name, String url) {
    this.id = id;
    this.method = method;
    this.name = name;
    this.url = url;
  }

  public VacancyNegotiationSubActions id(String id) {
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

  public VacancyNegotiationSubActions method(String method) {
    this.method = method;
    return this;
  }

  /**
   * HTTP метод, который необходимо выполнить
   * @return method
  */
  @NotNull 
  @Schema(name = "method", description = "HTTP метод, который необходимо выполнить", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("method")
  public String getMethod() {
    return method;
  }

  public void setMethod(String method) {
    this.method = method;
  }

  public VacancyNegotiationSubActions name(String name) {
    this.name = name;
    return this;
  }

  /**
   * Название подстатуса
   * @return name
  */
  @NotNull 
  @Schema(name = "name", description = "Название подстатуса", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("name")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public VacancyNegotiationSubActions url(String url) {
    this.url = url;
    return this;
  }

  /**
   * URL, на который необходимо выполнить запрос
   * @return url
  */
  @NotNull 
  @Schema(name = "url", description = "URL, на который необходимо выполнить запрос", requiredMode = Schema.RequiredMode.REQUIRED)
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
    VacancyNegotiationSubActions vacancyNegotiationSubActions = (VacancyNegotiationSubActions) o;
    return Objects.equals(this.id, vacancyNegotiationSubActions.id) &&
        Objects.equals(this.method, vacancyNegotiationSubActions.method) &&
        Objects.equals(this.name, vacancyNegotiationSubActions.name) &&
        Objects.equals(this.url, vacancyNegotiationSubActions.url);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, method, name, url);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class VacancyNegotiationSubActions {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    method: ").append(toIndentedString(method)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
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

