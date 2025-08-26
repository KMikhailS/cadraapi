package ru.brobrocode.cadra.client.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.annotation.Generated;
import jakarta.validation.Valid;

import java.util.Objects;

/**
 * VacanciesVacancyConditionFieldsPhoneFields
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2025-08-17T15:41:09.394389505+05:00[Asia/Yekaterinburg]", comments = "Generator version: 7.6.0")
public class VacanciesVacancyConditionFieldsPhoneFields {

  private VacanciesVacancyConditionFieldsRequiredLengthWithTitle comment = null;

  private VacanciesVacancyConditionFieldsNumberCondition number = null;

  public VacanciesVacancyConditionFieldsPhoneFields comment(VacanciesVacancyConditionFieldsRequiredLengthWithTitle comment) {
    this.comment = comment;
    return this;
  }

  /**
   * Get comment
   * @return comment
  */
  @Valid 
  @Schema(name = "comment", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("comment")
  public VacanciesVacancyConditionFieldsRequiredLengthWithTitle getComment() {
    return comment;
  }

  public void setComment(VacanciesVacancyConditionFieldsRequiredLengthWithTitle comment) {
    this.comment = comment;
  }

  public VacanciesVacancyConditionFieldsPhoneFields number(VacanciesVacancyConditionFieldsNumberCondition number) {
    this.number = number;
    return this;
  }

  /**
   * Get number
   * @return number
  */
  @Valid 
  @Schema(name = "number", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("number")
  public VacanciesVacancyConditionFieldsNumberCondition getNumber() {
    return number;
  }

  public void setNumber(VacanciesVacancyConditionFieldsNumberCondition number) {
    this.number = number;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    VacanciesVacancyConditionFieldsPhoneFields vacanciesVacancyConditionFieldsPhoneFields = (VacanciesVacancyConditionFieldsPhoneFields) o;
    return Objects.equals(this.comment, vacanciesVacancyConditionFieldsPhoneFields.comment) &&
        Objects.equals(this.number, vacanciesVacancyConditionFieldsPhoneFields.number);
  }

  @Override
  public int hashCode() {
    return Objects.hash(comment, number);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class VacanciesVacancyConditionFieldsPhoneFields {\n");
    sb.append("    comment: ").append(toIndentedString(comment)).append("\n");
    sb.append("    number: ").append(toIndentedString(number)).append("\n");
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

