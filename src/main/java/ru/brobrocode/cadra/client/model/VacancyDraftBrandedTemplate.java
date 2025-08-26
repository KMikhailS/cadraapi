package ru.brobrocode.cadra.client.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.annotation.Generated;
import jakarta.validation.constraints.NotNull;

import java.util.Objects;

/**
 * Брендированный шаблон вакансий работодателя из [списка доступных](#tag/Informaciya-o-rabotodatele/operation/get-vacancy-branded-templates-list), либо &#x60;null&#x60;, если не используется у компании 
 */

@Schema(name = "VacancyDraftBrandedTemplate", description = "Брендированный шаблон вакансий работодателя из [списка доступных](#tag/Informaciya-o-rabotodatele/operation/get-vacancy-branded-templates-list), либо `null`, если не используется у компании ")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2025-08-17T15:41:09.394389505+05:00[Asia/Yekaterinburg]", comments = "Generator version: 7.6.0")
public class VacancyDraftBrandedTemplate {

  private String id;

  public VacancyDraftBrandedTemplate() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public VacancyDraftBrandedTemplate(String id) {
    this.id = id;
  }

  public VacancyDraftBrandedTemplate id(String id) {
    this.id = id;
    return this;
  }

  /**
   * Идентификатор брендированного шаблона вакансий работодателя из [списка доступных](#tag/Informaciya-o-rabotodatele/operation/get-vacancy-branded-templates-list)
   * @return id
  */
  @NotNull 
  @Schema(name = "id", description = "Идентификатор брендированного шаблона вакансий работодателя из [списка доступных](#tag/Informaciya-o-rabotodatele/operation/get-vacancy-branded-templates-list)", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("id")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    VacancyDraftBrandedTemplate vacancyDraftBrandedTemplate = (VacancyDraftBrandedTemplate) o;
    return Objects.equals(this.id, vacancyDraftBrandedTemplate.id);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class VacancyDraftBrandedTemplate {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
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

