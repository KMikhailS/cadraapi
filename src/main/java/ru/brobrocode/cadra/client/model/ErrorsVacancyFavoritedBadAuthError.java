package ru.brobrocode.cadra.client.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.annotation.Generated;
import jakarta.validation.constraints.NotNull;

import java.util.Objects;

/**
 * ErrorsVacancyFavoritedBadAuthError
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2025-08-17T15:41:09.394389505+05:00[Asia/Yekaterinburg]", comments = "Generator version: 7.6.0")
public class ErrorsVacancyFavoritedBadAuthError {

  /**
   * Текстовый идентификатор типа ошибки
   */
  public enum TypeEnum {
    VACANCIES_FAVORITED("vacancies_favorited");

    private String value;

    TypeEnum(String value) {
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
    public static TypeEnum fromValue(String value) {
      for (TypeEnum b : TypeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  private TypeEnum type;

  /**
   * Возможные ошибки:   * `vacancy_archived` — Вакансия уже в архиве и не может быть добавлена в отобранное   * `limit_exceeded` — Превышен лимит количества отобранных вакансий 
   */
  public enum ValueEnum {
    VACANCY_ARCHIVED("vacancy_archived"),
    
    LIMIT_EXCEEDED("limit_exceeded");

    private String value;

    ValueEnum(String value) {
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
    public static ValueEnum fromValue(String value) {
      for (ValueEnum b : ValueEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  private ValueEnum value;

  public ErrorsVacancyFavoritedBadAuthError() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public ErrorsVacancyFavoritedBadAuthError(TypeEnum type, ValueEnum value) {
    this.type = type;
    this.value = value;
  }

  public ErrorsVacancyFavoritedBadAuthError type(TypeEnum type) {
    this.type = type;
    return this;
  }

  /**
   * Текстовый идентификатор типа ошибки
   * @return type
  */
  @NotNull 
  @Schema(name = "type", example = "vacancies_favorited", description = "Текстовый идентификатор типа ошибки", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("type")
  public TypeEnum getType() {
    return type;
  }

  public void setType(TypeEnum type) {
    this.type = type;
  }

  public ErrorsVacancyFavoritedBadAuthError value(ValueEnum value) {
    this.value = value;
    return this;
  }

  /**
   * Возможные ошибки:   * `vacancy_archived` — Вакансия уже в архиве и не может быть добавлена в отобранное   * `limit_exceeded` — Превышен лимит количества отобранных вакансий 
   * @return value
  */
  @NotNull 
  @Schema(name = "value", example = "vacancy_archived", description = "Возможные ошибки:   * `vacancy_archived` — Вакансия уже в архиве и не может быть добавлена в отобранное   * `limit_exceeded` — Превышен лимит количества отобранных вакансий ", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("value")
  public ValueEnum getValue() {
    return value;
  }

  public void setValue(ValueEnum value) {
    this.value = value;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ErrorsVacancyFavoritedBadAuthError errorsVacancyFavoritedBadAuthError = (ErrorsVacancyFavoritedBadAuthError) o;
    return Objects.equals(this.type, errorsVacancyFavoritedBadAuthError.type) &&
        Objects.equals(this.value, errorsVacancyFavoritedBadAuthError.value);
  }

  @Override
  public int hashCode() {
    return Objects.hash(type, value);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ErrorsVacancyFavoritedBadAuthError {\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    value: ").append(toIndentedString(value)).append("\n");
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

