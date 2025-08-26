package ru.brobrocode.cadra.client.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.annotation.Generated;
import jakarta.validation.constraints.Pattern;

import java.util.Objects;

/**
 * Объект - [тест](#tag/Informaciya-o-rabotodatele/operation/get-tests-dictionary) для вакансии
 */

@Schema(name = "VacancyDraftTest", description = "Объект - [тест](#tag/Informaciya-o-rabotodatele/operation/get-tests-dictionary) для вакансии")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2025-08-17T15:41:09.394389505+05:00[Asia/Yekaterinburg]", comments = "Generator version: 7.6.0")
public class VacancyDraftTest {

  private String id = null;

  private Boolean required = null;

  public VacancyDraftTest id(String id) {
    this.id = id;
    return this;
  }

  /**
   * Тест, который будет добавлен в вакансию
   * @return id
  */
  @Pattern(regexp = "^\\d+$") 
  @Schema(name = "id", description = "Тест, который будет добавлен в вакансию", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("id")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public VacancyDraftTest required(Boolean required) {
    this.required = required;
    return this;
  }

  /**
   * Флаг обязательности прохождения теста при отклике на вакансию
   * @return required
  */
  
  @Schema(name = "required", description = "Флаг обязательности прохождения теста при отклике на вакансию", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("required")
  public Boolean getRequired() {
    return required;
  }

  public void setRequired(Boolean required) {
    this.required = required;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    VacancyDraftTest vacancyDraftTest = (VacancyDraftTest) o;
    return Objects.equals(this.id, vacancyDraftTest.id) &&
        Objects.equals(this.required, vacancyDraftTest.required);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, required);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class VacancyDraftTest {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    required: ").append(toIndentedString(required)).append("\n");
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

