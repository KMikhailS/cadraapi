package ru.brobrocode.cadra.client.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.annotation.Generated;
import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * VacancyDraftDraftResponseSchema
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2025-08-17T15:41:09.394389505+05:00[Asia/Yekaterinburg]", comments = "Generator version: 7.6.0")
public class VacancyDraftDraftResponseSchema {

  private String id;

  @Valid
  private List<String> ignoredFields = new ArrayList<>();

  private String name;

  private Boolean publicationReady;

  @Valid
  private List<@Valid VacancyDraftDraftVacancyError> validationErrors = new ArrayList<>();

  public VacancyDraftDraftResponseSchema() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public VacancyDraftDraftResponseSchema(String id, String name, Boolean publicationReady) {
    this.id = id;
    this.name = name;
    this.publicationReady = publicationReady;
  }

  public VacancyDraftDraftResponseSchema id(String id) {
    this.id = id;
    return this;
  }

  /**
   * Идентификатор созданного объекта
   * @return id
  */
  @NotNull 
  @Schema(name = "id", example = "22", description = "Идентификатор созданного объекта", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("id")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public VacancyDraftDraftResponseSchema ignoredFields(List<String> ignoredFields) {
    this.ignoredFields = ignoredFields;
    return this;
  }

  public VacancyDraftDraftResponseSchema addIgnoredFieldsItem(String ignoredFieldsItem) {
    if (this.ignoredFields == null) {
      this.ignoredFields = new ArrayList<>();
    }
    this.ignoredFields.add(ignoredFieldsItem);
    return this;
  }

  /**
   * Поля, которые не были сохранены при создании черновика, вследствие не верного заполнения
   * @return ignoredFields
  */
  
  @Schema(name = "ignored_fields", description = "Поля, которые не были сохранены при создании черновика, вследствие не верного заполнения", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("ignored_fields")
  public List<String> getIgnoredFields() {
    return ignoredFields;
  }

  public void setIgnoredFields(List<String> ignoredFields) {
    this.ignoredFields = ignoredFields;
  }

  public VacancyDraftDraftResponseSchema name(String name) {
    this.name = name;
    return this;
  }

  /**
   * Заголовок черновика
   * @return name
  */
  @NotNull 
  @Schema(name = "name", description = "Заголовок черновика", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("name")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public VacancyDraftDraftResponseSchema publicationReady(Boolean publicationReady) {
    this.publicationReady = publicationReady;
    return this;
  }

  /**
   * Готовность черновика к публикации
   * @return publicationReady
  */
  @NotNull 
  @Schema(name = "publication_ready", description = "Готовность черновика к публикации", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("publication_ready")
  public Boolean getPublicationReady() {
    return publicationReady;
  }

  public void setPublicationReady(Boolean publicationReady) {
    this.publicationReady = publicationReady;
  }

  public VacancyDraftDraftResponseSchema validationErrors(List<@Valid VacancyDraftDraftVacancyError> validationErrors) {
    this.validationErrors = validationErrors;
    return this;
  }

  public VacancyDraftDraftResponseSchema addValidationErrorsItem(VacancyDraftDraftVacancyError validationErrorsItem) {
    if (this.validationErrors == null) {
      this.validationErrors = new ArrayList<>();
    }
    this.validationErrors.add(validationErrorsItem);
    return this;
  }

  /**
   * Поля, которые были сохранены при создании черновика, с соответствующими ошибками, которые необходимо поправить для успешной публикации вакансии на основе черновика
   * @return validationErrors
  */
  @Valid 
  @Schema(name = "validation_errors", description = "Поля, которые были сохранены при создании черновика, с соответствующими ошибками, которые необходимо поправить для успешной публикации вакансии на основе черновика", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("validation_errors")
  public List<@Valid VacancyDraftDraftVacancyError> getValidationErrors() {
    return validationErrors;
  }

  public void setValidationErrors(List<@Valid VacancyDraftDraftVacancyError> validationErrors) {
    this.validationErrors = validationErrors;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    VacancyDraftDraftResponseSchema vacancyDraftDraftResponseSchema = (VacancyDraftDraftResponseSchema) o;
    return Objects.equals(this.id, vacancyDraftDraftResponseSchema.id) &&
        Objects.equals(this.ignoredFields, vacancyDraftDraftResponseSchema.ignoredFields) &&
        Objects.equals(this.name, vacancyDraftDraftResponseSchema.name) &&
        Objects.equals(this.publicationReady, vacancyDraftDraftResponseSchema.publicationReady) &&
        Objects.equals(this.validationErrors, vacancyDraftDraftResponseSchema.validationErrors);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, ignoredFields, name, publicationReady, validationErrors);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class VacancyDraftDraftResponseSchema {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    ignoredFields: ").append(toIndentedString(ignoredFields)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    publicationReady: ").append(toIndentedString(publicationReady)).append("\n");
    sb.append("    validationErrors: ").append(toIndentedString(validationErrors)).append("\n");
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

