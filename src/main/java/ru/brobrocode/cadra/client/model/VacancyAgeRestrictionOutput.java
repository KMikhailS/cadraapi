package ru.brobrocode.cadra.client.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.annotation.Generated;

import java.util.Objects;

/**
 * Публикация вакансий для соискателей от 14 и 16 лет допустима только на территории Российской Федерации.  Права публиковать вакансии с пометкой для соискателей от 14 и 16 лет есть у подтвержденных Российских работодателей.  Для получения права для иностранной компании обратитесь к персональному менеджеру.  После получения права, появится возможность публиковать новые вакансии с данным параметром, либо обновлять имеющиеся вакансии 
 */

@Schema(name = "VacancyAgeRestrictionOutput", description = "Публикация вакансий для соискателей от 14 и 16 лет допустима только на территории Российской Федерации.  Права публиковать вакансии с пометкой для соискателей от 14 и 16 лет есть у подтвержденных Российских работодателей.  Для получения права для иностранной компании обратитесь к персональному менеджеру.  После получения права, появится возможность публиковать новые вакансии с данным параметром, либо обновлять имеющиеся вакансии ")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2025-08-17T15:41:09.394389505+05:00[Asia/Yekaterinburg]", comments = "Generator version: 7.6.0")
public class VacancyAgeRestrictionOutput {

  private String id;

  private String name;

  public VacancyAgeRestrictionOutput id(String id) {
    this.id = id;
    return this;
  }

  /**
   * Элементы из [справочника age_restriction](#tag/Obshie-spravochniki/operation/get-dictionaries)
   * @return id
  */
  
  @Schema(name = "id", description = "Элементы из [справочника age_restriction](#tag/Obshie-spravochniki/operation/get-dictionaries)", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("id")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public VacancyAgeRestrictionOutput name(String name) {
    this.name = name;
    return this;
  }

  /**
   * Наименования поля ограничения по возрасту
   * @return name
  */
  
  @Schema(name = "name", description = "Наименования поля ограничения по возрасту", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
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
    VacancyAgeRestrictionOutput vacancyAgeRestrictionOutput = (VacancyAgeRestrictionOutput) o;
    return Objects.equals(this.id, vacancyAgeRestrictionOutput.id) &&
        Objects.equals(this.name, vacancyAgeRestrictionOutput.name);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class VacancyAgeRestrictionOutput {\n");
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

