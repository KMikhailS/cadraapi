package ru.brobrocode.cadra.client.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.annotation.Generated;
import jakarta.validation.Valid;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * VacanciesArguments
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2025-08-17T15:41:09.394389505+05:00[Asia/Yekaterinburg]", comments = "Generator version: 7.6.0")
public class VacanciesArguments {

  @Valid
  private List<@Valid VacanciesArgumentItem> arguments;

  public VacanciesArguments arguments(List<@Valid VacanciesArgumentItem> arguments) {
    this.arguments = arguments;
    return this;
  }

  public VacanciesArguments addArgumentsItem(VacanciesArgumentItem argumentsItem) {
    if (this.arguments == null) {
      this.arguments = new ArrayList<>();
    }
    this.arguments.add(argumentsItem);
    return this;
  }

  /**
   * Массив параметров поиска, переданных в запросе.  Возвращается только если в запросе передан параметр `describe_arguments=true`. В массиве выдаются только те параметры, которые влияют на поиск вакансий. Неизвестные параметры игнорируются. Элемент списка с одним значением `argument` может повторяться несколько раз, если параметр имеет несколько значений 
   * @return arguments
  */
  @Valid 
  @Schema(name = "arguments", description = "Массив параметров поиска, переданных в запросе.  Возвращается только если в запросе передан параметр `describe_arguments=true`. В массиве выдаются только те параметры, которые влияют на поиск вакансий. Неизвестные параметры игнорируются. Элемент списка с одним значением `argument` может повторяться несколько раз, если параметр имеет несколько значений ", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("arguments")
  public List<@Valid VacanciesArgumentItem> getArguments() {
    return arguments;
  }

  public void setArguments(List<@Valid VacanciesArgumentItem> arguments) {
    this.arguments = arguments;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    VacanciesArguments vacanciesArguments = (VacanciesArguments) o;
    return Objects.equals(this.arguments, vacanciesArguments.arguments);
  }

  @Override
  public int hashCode() {
    return Objects.hash(arguments);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class VacanciesArguments {\n");
    sb.append("    arguments: ").append(toIndentedString(arguments)).append("\n");
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

