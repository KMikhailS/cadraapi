package ru.brobrocode.cadra.client.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.annotation.Generated;

import java.util.Objects;

/**
 * ErrorsVacancyApplyForbiddenErrorsAllOfBadArguments
 */

@JsonTypeName("ErrorsVacancyApplyForbiddenErrors_allOf_bad_arguments")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2025-08-17T15:41:09.394389505+05:00[Asia/Yekaterinburg]", comments = "Generator version: 7.6.0")
public class ErrorsVacancyApplyForbiddenErrorsAllOfBadArguments {

  private String description;

  /**
   * Поле, в котором допущена ошибка.  Возможные значения: * `vacancy_id` — указан невалидный идентификатор * `resume_id` — указан невалидный идентификатор 
   */
  public enum NameEnum {
    VACANCY_ID("vacancy_id"),
    
    RESUME_ID("resume_id");

    private String value;

    NameEnum(String value) {
      this.value = value;
    }

    @JsonValue
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static NameEnum fromValue(String value) {
      for (NameEnum b : NameEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  private NameEnum name;

  public ErrorsVacancyApplyForbiddenErrorsAllOfBadArguments description(String description) {
    this.description = description;
    return this;
  }

  /**
   * Get description
   * @return description
  */
  
  @Schema(name = "description", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("description")
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public ErrorsVacancyApplyForbiddenErrorsAllOfBadArguments name(NameEnum name) {
    this.name = name;
    return this;
  }

  /**
   * Поле, в котором допущена ошибка.  Возможные значения: * `vacancy_id` — указан невалидный идентификатор * `resume_id` — указан невалидный идентификатор 
   * @return name
  */
  
  @Schema(name = "name", description = "Поле, в котором допущена ошибка.  Возможные значения: * `vacancy_id` — указан невалидный идентификатор * `resume_id` — указан невалидный идентификатор ", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("name")
  public NameEnum getName() {
    return name;
  }

  public void setName(NameEnum name) {
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
    ErrorsVacancyApplyForbiddenErrorsAllOfBadArguments errorsVacancyApplyForbiddenErrorsAllOfBadArguments = (ErrorsVacancyApplyForbiddenErrorsAllOfBadArguments) o;
    return Objects.equals(this.description, errorsVacancyApplyForbiddenErrorsAllOfBadArguments.description) &&
        Objects.equals(this.name, errorsVacancyApplyForbiddenErrorsAllOfBadArguments.name);
  }

  @Override
  public int hashCode() {
    return Objects.hash(description, name);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ErrorsVacancyApplyForbiddenErrorsAllOfBadArguments {\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
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

