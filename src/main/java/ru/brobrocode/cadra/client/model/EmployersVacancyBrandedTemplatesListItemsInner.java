package ru.brobrocode.cadra.client.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.annotation.Generated;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

import java.util.Objects;

/**
 * EmployersVacancyBrandedTemplatesListItemsInner
 */

@JsonTypeName("EmployersVacancyBrandedTemplatesList_items_inner")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2025-08-17T15:41:09.394389505+05:00[Asia/Yekaterinburg]", comments = "Generator version: 7.6.0")
public class EmployersVacancyBrandedTemplatesListItemsInner {

  private String id;

  private String name;

  private String versionId = null;

  public EmployersVacancyBrandedTemplatesListItemsInner() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public EmployersVacancyBrandedTemplatesListItemsInner(String id, String name, String versionId) {
    this.id = id;
    this.name = name;
    this.versionId = versionId;
  }

  public EmployersVacancyBrandedTemplatesListItemsInner id(String id) {
    this.id = id;
    return this;
  }

  /**
   * Идентификатор брендированного шаблона вакансий
   * @return id
  */
  @NotNull @Size(min = 1) 
  @Schema(name = "id", description = "Идентификатор брендированного шаблона вакансий", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("id")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public EmployersVacancyBrandedTemplatesListItemsInner name(String name) {
    this.name = name;
    return this;
  }

  /**
   * Название брендированного шаблона вакансий
   * @return name
  */
  @NotNull 
  @Schema(name = "name", description = "Название брендированного шаблона вакансий", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("name")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public EmployersVacancyBrandedTemplatesListItemsInner versionId(String versionId) {
    this.versionId = versionId;
    return this;
  }

  /**
   * Идентификатор активной версии брендированного шаблона.  Равен null в случае шаблонов-конструкторов 
   * @return versionId
  */
  @NotNull 
  @Schema(name = "version_id", description = "Идентификатор активной версии брендированного шаблона.  Равен null в случае шаблонов-конструкторов ", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("version_id")
  public String getVersionId() {
    return versionId;
  }

  public void setVersionId(String versionId) {
    this.versionId = versionId;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EmployersVacancyBrandedTemplatesListItemsInner employersVacancyBrandedTemplatesListItemsInner = (EmployersVacancyBrandedTemplatesListItemsInner) o;
    return Objects.equals(this.id, employersVacancyBrandedTemplatesListItemsInner.id) &&
        Objects.equals(this.name, employersVacancyBrandedTemplatesListItemsInner.name) &&
        Objects.equals(this.versionId, employersVacancyBrandedTemplatesListItemsInner.versionId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, versionId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EmployersVacancyBrandedTemplatesListItemsInner {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    versionId: ").append(toIndentedString(versionId)).append("\n");
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

