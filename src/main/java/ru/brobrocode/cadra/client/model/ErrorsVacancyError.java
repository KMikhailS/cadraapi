package ru.brobrocode.cadra.client.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.annotation.Generated;
import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * ErrorsVacancyError
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2025-08-17T15:41:09.394389505+05:00[Asia/Yekaterinburg]", comments = "Generator version: 7.6.0")
public class ErrorsVacancyError {

  private BigDecimal found;

  @Valid
  private List<@Valid ErrorsVacancyErrorItemsInner> items = new ArrayList<>();

  private String reason;

  private String type;

  private String value;

  public ErrorsVacancyError() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public ErrorsVacancyError(String type, String value) {
    this.type = type;
    this.value = value;
  }

  public ErrorsVacancyError found(BigDecimal found) {
    this.found = found;
    return this;
  }

  /**
   * Количество найденных дублей вакансии
   * @return found
  */
  @Valid 
  @Schema(name = "found", description = "Количество найденных дублей вакансии", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("found")
  public BigDecimal getFound() {
    return found;
  }

  public void setFound(BigDecimal found) {
    this.found = found;
  }

  public ErrorsVacancyError items(List<@Valid ErrorsVacancyErrorItemsInner> items) {
    this.items = items;
    return this;
  }

  public ErrorsVacancyError addItemsItem(ErrorsVacancyErrorItemsInner itemsItem) {
    if (this.items == null) {
      this.items = new ArrayList<>();
    }
    this.items.add(itemsItem);
    return this;
  }

  /**
   * Массив идентификаторов вакансий-дублей
   * @return items
  */
  @Valid @Size(min = 1) 
  @Schema(name = "items", description = "Массив идентификаторов вакансий-дублей", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("items")
  public List<@Valid ErrorsVacancyErrorItemsInner> getItems() {
    return items;
  }

  public void setItems(List<@Valid ErrorsVacancyErrorItemsInner> items) {
    this.items = items;
  }

  public ErrorsVacancyError reason(String reason) {
    this.reason = reason;
    return this;
  }

  /**
   * Причина ошибки
   * @return reason
  */
  
  @Schema(name = "reason", example = "is_empty", description = "Причина ошибки", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("reason")
  public String getReason() {
    return reason;
  }

  public void setReason(String reason) {
    this.reason = reason;
  }

  public ErrorsVacancyError type(String type) {
    this.type = type;
    return this;
  }

  /**
   * Тип ошибки
   * @return type
  */
  @NotNull 
  @Schema(name = "type", example = "bad_json_data", description = "Тип ошибки", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("type")
  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }

  public ErrorsVacancyError value(String value) {
    this.value = value;
    return this;
  }

  /**
   * Наименование поля с ошибкой
   * @return value
  */
  @NotNull 
  @Schema(name = "value", example = "specializations", description = "Наименование поля с ошибкой", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("value")
  public String getValue() {
    return value;
  }

  public void setValue(String value) {
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
    ErrorsVacancyError errorsVacancyError = (ErrorsVacancyError) o;
    return Objects.equals(this.found, errorsVacancyError.found) &&
        Objects.equals(this.items, errorsVacancyError.items) &&
        Objects.equals(this.reason, errorsVacancyError.reason) &&
        Objects.equals(this.type, errorsVacancyError.type) &&
        Objects.equals(this.value, errorsVacancyError.value);
  }

  @Override
  public int hashCode() {
    return Objects.hash(found, items, reason, type, value);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ErrorsVacancyError {\n");
    sb.append("    found: ").append(toIndentedString(found)).append("\n");
    sb.append("    items: ").append(toIndentedString(items)).append("\n");
    sb.append("    reason: ").append(toIndentedString(reason)).append("\n");
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

