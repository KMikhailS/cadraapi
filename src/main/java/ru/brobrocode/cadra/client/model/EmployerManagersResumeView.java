package ru.brobrocode.cadra.client.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.annotation.Generated;
import jakarta.validation.constraints.NotNull;

import java.util.Objects;

/**
 * EmployerManagersResumeView
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2025-08-17T15:41:09.394389505+05:00[Asia/Yekaterinburg]", comments = "Generator version: 7.6.0")
public class EmployerManagersResumeView {

  private Integer resumeView;

  private Integer resumeViewFromApi;

  public EmployerManagersResumeView() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public EmployerManagersResumeView(Integer resumeView) {
    this.resumeView = resumeView;
  }

  public EmployerManagersResumeView resumeView(Integer resumeView) {
    this.resumeView = resumeView;
    return this;
  }

  /**
   * Просмотры резюме через сайт
   * @return resumeView
  */
  @NotNull 
  @Schema(name = "resume_view", description = "Просмотры резюме через сайт", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("resume_view")
  public Integer getResumeView() {
    return resumeView;
  }

  public void setResumeView(Integer resumeView) {
    this.resumeView = resumeView;
  }

  public EmployerManagersResumeView resumeViewFromApi(Integer resumeViewFromApi) {
    this.resumeViewFromApi = resumeViewFromApi;
    return this;
  }

  /**
   * Просмотры резюме из API. Возвращаются, если они предусмотрены в текущей конфигурации доступа к резюме для работодателя
   * @return resumeViewFromApi
  */
  
  @Schema(name = "resume_view_from_api", description = "Просмотры резюме из API. Возвращаются, если они предусмотрены в текущей конфигурации доступа к резюме для работодателя", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("resume_view_from_api")
  public Integer getResumeViewFromApi() {
    return resumeViewFromApi;
  }

  public void setResumeViewFromApi(Integer resumeViewFromApi) {
    this.resumeViewFromApi = resumeViewFromApi;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EmployerManagersResumeView employerManagersResumeView = (EmployerManagersResumeView) o;
    return Objects.equals(this.resumeView, employerManagersResumeView.resumeView) &&
        Objects.equals(this.resumeViewFromApi, employerManagersResumeView.resumeViewFromApi);
  }

  @Override
  public int hashCode() {
    return Objects.hash(resumeView, resumeViewFromApi);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EmployerManagersResumeView {\n");
    sb.append("    resumeView: ").append(toIndentedString(resumeView)).append("\n");
    sb.append("    resumeViewFromApi: ").append(toIndentedString(resumeViewFromApi)).append("\n");
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

