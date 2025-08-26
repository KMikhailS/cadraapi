package ru.brobrocode.cadra.client.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.annotation.Generated;
import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * ErrorsVacancyAddEditForbiddenError
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2025-08-17T15:41:09.394389505+05:00[Asia/Yekaterinburg]", comments = "Generator version: 7.6.0")
public class ErrorsVacancyAddEditForbiddenError {

  private String description = null;

  private BigDecimal found = null;

  @Valid
  private List<@Valid IncludesNumericId> items;

  /**
   * Текстовый идентификатор типа ошибки
   */
  public enum TypeEnum {
    VACANCIES("vacancies");

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
   * Ошибки при публикации и редактировании вакансии:   * `not_enough_purchased_services` — купленных услуг недостаточно для публикации или обновления данного типа вакансии   * `quota_exceeded` — квота менеджера на публикацию данного типа вакансии закончилась   * `duplicate` — аналогичная вакансия уже опубликована. В ответе передается информация по дубликатам вакансии. Данную ошибку можно форсировано отключить параметром `?ignore_duplicates=true`   * `replacement` — вакансия существенно изменена, есть риски блокировки. Чтобы проигнорировать риск блокировки, следует отправить повторный запрос с параметром `?ignore_replacement_warning=true`   * `creation_forbidden` — публикация вакансий недоступна текущему менеджеру   * `unavailable_for_archived` — редактирование недоступно для архивной вакансии   * `conflict_changes` — [конфликтные изменения](https://github.com/hhru/api/blob/master/docs/employer_vacancies.md#%D1%81%D0%BC%D0%B5%D0%BD%D0%B0-%D0%B1%D0%B8%D0%BB%D0%BB%D0%B8%D0%BD%D0%B3-%D1%82%D0%B8%D0%BF%D0%B0-%D0%BC%D0%B5%D0%BD%D0%B5%D0%B4%D0%B6%D0%B5%D1%80%D0%B0-%D0%B2%D0%B0%D0%BA%D0%B0%D0%BD%D1%81%D0%B8%D0%B8) данных вакансии 
   */
  public enum ValueEnum {
    NOT_ENOUGH_PURCHASED_SERVICES("not_enough_purchased_services"),
    
    QUOTA_EXCEEDED("quota_exceeded"),
    
    DUPLICATE("duplicate"),
    
    REPLACEMENT("replacement"),
    
    CREATION_FORBIDDEN("creation_forbidden"),
    
    UNAVAILABLE_FOR_ARCHIVED("unavailable_for_archived"),
    
    CONFLICT_CHANGES("conflict_changes");

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

  public ErrorsVacancyAddEditForbiddenError() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public ErrorsVacancyAddEditForbiddenError(TypeEnum type, ValueEnum value) {
    this.type = type;
    this.value = value;
  }

  public ErrorsVacancyAddEditForbiddenError description(String description) {
    this.description = description;
    return this;
  }

  /**
   * Описание ошибки 
   * @return description
  */
  
  @Schema(name = "description", description = "Описание ошибки ", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("description")
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public ErrorsVacancyAddEditForbiddenError found(BigDecimal found) {
    this.found = found;
    return this;
  }

  /**
   * Общее количество дубликатов вакансии. Возвращается только для `\"value\": \"duplicate\"` 
   * @return found
  */
  @Valid 
  @Schema(name = "found", example = "2", description = "Общее количество дубликатов вакансии. Возвращается только для `\"value\": \"duplicate\"` ", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("found")
  public BigDecimal getFound() {
    return found;
  }

  public void setFound(BigDecimal found) {
    this.found = found;
  }

  public ErrorsVacancyAddEditForbiddenError items(List<@Valid IncludesNumericId> items) {
    this.items = items;
    return this;
  }

  public ErrorsVacancyAddEditForbiddenError addItemsItem(IncludesNumericId itemsItem) {
    if (this.items == null) {
      this.items = new ArrayList<>();
    }
    this.items.add(itemsItem);
    return this;
  }

  /**
   * Ограниченное количество записей с информацией о дубликатах. Не гарантирует выдачу всех дубликатов. Возвращается только для `\"value\": \"duplicate\"` 
   * @return items
  */
  @Valid 
  @Schema(name = "items", description = "Ограниченное количество записей с информацией о дубликатах. Не гарантирует выдачу всех дубликатов. Возвращается только для `\"value\": \"duplicate\"` ", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("items")
  public List<@Valid IncludesNumericId> getItems() {
    return items;
  }

  public void setItems(List<@Valid IncludesNumericId> items) {
    this.items = items;
  }

  public ErrorsVacancyAddEditForbiddenError type(TypeEnum type) {
    this.type = type;
    return this;
  }

  /**
   * Текстовый идентификатор типа ошибки
   * @return type
  */
  @NotNull 
  @Schema(name = "type", example = "vacancies", description = "Текстовый идентификатор типа ошибки", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("type")
  public TypeEnum getType() {
    return type;
  }

  public void setType(TypeEnum type) {
    this.type = type;
  }

  public ErrorsVacancyAddEditForbiddenError value(ValueEnum value) {
    this.value = value;
    return this;
  }

  /**
   * Ошибки при публикации и редактировании вакансии:   * `not_enough_purchased_services` — купленных услуг недостаточно для публикации или обновления данного типа вакансии   * `quota_exceeded` — квота менеджера на публикацию данного типа вакансии закончилась   * `duplicate` — аналогичная вакансия уже опубликована. В ответе передается информация по дубликатам вакансии. Данную ошибку можно форсировано отключить параметром `?ignore_duplicates=true`   * `replacement` — вакансия существенно изменена, есть риски блокировки. Чтобы проигнорировать риск блокировки, следует отправить повторный запрос с параметром `?ignore_replacement_warning=true`   * `creation_forbidden` — публикация вакансий недоступна текущему менеджеру   * `unavailable_for_archived` — редактирование недоступно для архивной вакансии   * `conflict_changes` — [конфликтные изменения](https://github.com/hhru/api/blob/master/docs/employer_vacancies.md#%D1%81%D0%BC%D0%B5%D0%BD%D0%B0-%D0%B1%D0%B8%D0%BB%D0%BB%D0%B8%D0%BD%D0%B3-%D1%82%D0%B8%D0%BF%D0%B0-%D0%BC%D0%B5%D0%BD%D0%B5%D0%B4%D0%B6%D0%B5%D1%80%D0%B0-%D0%B2%D0%B0%D0%BA%D0%B0%D0%BD%D1%81%D0%B8%D0%B8) данных вакансии 
   * @return value
  */
  @NotNull 
  @Schema(name = "value", example = "not_enough_purchased_services", description = "Ошибки при публикации и редактировании вакансии:   * `not_enough_purchased_services` — купленных услуг недостаточно для публикации или обновления данного типа вакансии   * `quota_exceeded` — квота менеджера на публикацию данного типа вакансии закончилась   * `duplicate` — аналогичная вакансия уже опубликована. В ответе передается информация по дубликатам вакансии. Данную ошибку можно форсировано отключить параметром `?ignore_duplicates=true`   * `replacement` — вакансия существенно изменена, есть риски блокировки. Чтобы проигнорировать риск блокировки, следует отправить повторный запрос с параметром `?ignore_replacement_warning=true`   * `creation_forbidden` — публикация вакансий недоступна текущему менеджеру   * `unavailable_for_archived` — редактирование недоступно для архивной вакансии   * `conflict_changes` — [конфликтные изменения](https://github.com/hhru/api/blob/master/docs/employer_vacancies.md#%D1%81%D0%BC%D0%B5%D0%BD%D0%B0-%D0%B1%D0%B8%D0%BB%D0%BB%D0%B8%D0%BD%D0%B3-%D1%82%D0%B8%D0%BF%D0%B0-%D0%BC%D0%B5%D0%BD%D0%B5%D0%B4%D0%B6%D0%B5%D1%80%D0%B0-%D0%B2%D0%B0%D0%BA%D0%B0%D0%BD%D1%81%D0%B8%D0%B8) данных вакансии ", requiredMode = Schema.RequiredMode.REQUIRED)
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
    ErrorsVacancyAddEditForbiddenError errorsVacancyAddEditForbiddenError = (ErrorsVacancyAddEditForbiddenError) o;
    return Objects.equals(this.description, errorsVacancyAddEditForbiddenError.description) &&
        Objects.equals(this.found, errorsVacancyAddEditForbiddenError.found) &&
        Objects.equals(this.items, errorsVacancyAddEditForbiddenError.items) &&
        Objects.equals(this.type, errorsVacancyAddEditForbiddenError.type) &&
        Objects.equals(this.value, errorsVacancyAddEditForbiddenError.value);
  }

  @Override
  public int hashCode() {
    return Objects.hash(description, found, items, type, value);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ErrorsVacancyAddEditForbiddenError {\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    found: ").append(toIndentedString(found)).append("\n");
    sb.append("    items: ").append(toIndentedString(items)).append("\n");
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

