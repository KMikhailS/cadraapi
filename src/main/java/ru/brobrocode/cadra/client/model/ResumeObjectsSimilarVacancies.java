package ru.brobrocode.cadra.client.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.annotation.Generated;
import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;

import java.util.Objects;

/**
 * Информация о вакансиях, похожих на это резюме
 */

@Schema(name = "ResumeObjectsSimilarVacancies", description = "Информация о вакансиях, похожих на это резюме")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2025-08-17T15:41:09.394389505+05:00[Asia/Yekaterinburg]", comments = "Generator version: 7.6.0")
public class ResumeObjectsSimilarVacancies {

  private ResumeObjectsCounters counters;

  private String url;

  public ResumeObjectsSimilarVacancies() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public ResumeObjectsSimilarVacancies(ResumeObjectsCounters counters, String url) {
    this.counters = counters;
    this.url = url;
  }

  public ResumeObjectsSimilarVacancies counters(ResumeObjectsCounters counters) {
    this.counters = counters;
    return this;
  }

  /**
   * Get counters
   * @return counters
  */
  @NotNull @Valid 
  @Schema(name = "counters", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("counters")
  public ResumeObjectsCounters getCounters() {
    return counters;
  }

  public void setCounters(ResumeObjectsCounters counters) {
    this.counters = counters;
  }

  public ResumeObjectsSimilarVacancies url(String url) {
    this.url = url;
    return this;
  }

  /**
   * URL, по которому необходимо сделать GET-запрос, для получения [вакансий, похожих на данное резюме](#tag/Poisk-vakansij-dlya-soiskatelya/operation/get-vacancies-similar-to-resume)
   * @return url
  */
  @NotNull 
  @Schema(name = "url", description = "URL, по которому необходимо сделать GET-запрос, для получения [вакансий, похожих на данное резюме](#tag/Poisk-vakansij-dlya-soiskatelya/operation/get-vacancies-similar-to-resume)", requiredMode = Schema.RequiredMode.REQUIRED)
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
    ResumeObjectsSimilarVacancies resumeObjectsSimilarVacancies = (ResumeObjectsSimilarVacancies) o;
    return Objects.equals(this.counters, resumeObjectsSimilarVacancies.counters) &&
        Objects.equals(this.url, resumeObjectsSimilarVacancies.url);
  }

  @Override
  public int hashCode() {
    return Objects.hash(counters, url);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ResumeObjectsSimilarVacancies {\n");
    sb.append("    counters: ").append(toIndentedString(counters)).append("\n");
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

