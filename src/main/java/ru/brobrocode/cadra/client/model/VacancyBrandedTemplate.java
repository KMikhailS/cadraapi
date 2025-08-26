package ru.brobrocode.cadra.client.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.annotation.Generated;
import jakarta.validation.constraints.Size;

import java.util.Objects;

/**
 * Брендированный шаблон вакансий работодателя из [списка доступных](#tag/Informaciya-o-rabotodatele/operation/get-vacancy-branded-templates-list), либо &#x60;null&#x60;, если не используется у компании 
 */

@Schema(name = "VacancyBrandedTemplate", description = "Брендированный шаблон вакансий работодателя из [списка доступных](#tag/Informaciya-o-rabotodatele/operation/get-vacancy-branded-templates-list), либо `null`, если не используется у компании ")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2025-08-17T15:41:09.394389505+05:00[Asia/Yekaterinburg]", comments = "Generator version: 7.6.0")
public class VacancyBrandedTemplate {

  private String id = null;

  private String name = null;

  public VacancyBrandedTemplate id(String id) {
    this.id = id;
    return this;
  }

  /**
   * Идентификатор брендированного шаблона вакансий
   * @return id
  */
  @Size(min = 1) 
  @Schema(name = "id", example = "default", description = "Идентификатор брендированного шаблона вакансий", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("id")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public VacancyBrandedTemplate name(String name) {
    this.name = name;
    return this;
  }

  /**
   * Название брендированного шаблона вакансий
   * @return name
  */
  
  @Schema(name = "name", example = "Стандартный шаблон", description = "Название брендированного шаблона вакансий", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("name")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    VacancyBrandedTemplate vacancyBrandedTemplate = (VacancyBrandedTemplate) o;
    return Objects.equals(this.id, vacancyBrandedTemplate.id) &&
        Objects.equals(this.name, vacancyBrandedTemplate.name);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class VacancyBrandedTemplate {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
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

