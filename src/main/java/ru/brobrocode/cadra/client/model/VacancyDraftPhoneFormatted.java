package ru.brobrocode.cadra.client.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.annotation.Generated;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;

import java.util.Objects;

/**
 * VacancyDraftPhoneFormatted
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2025-08-17T15:41:09.394389505+05:00[Asia/Yekaterinburg]", comments = "Generator version: 7.6.0")
public class VacancyDraftPhoneFormatted implements VacancyDraftPhoneItem {

  private String comment = null;

  private String formatted;

  public VacancyDraftPhoneFormatted() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public VacancyDraftPhoneFormatted(String formatted) {
    this.formatted = formatted;
  }

  public VacancyDraftPhoneFormatted comment(String comment) {
    this.comment = comment;
    return this;
  }

  /**
   * Комментарий (удобное время для звонка по этому номеру)
   * @return comment
  */
  
  @Schema(name = "comment", description = "Комментарий (удобное время для звонка по этому номеру)", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("comment")
  public String getComment() {
    return comment;
  }

  public void setComment(String comment) {
    this.comment = comment;
  }

  public VacancyDraftPhoneFormatted formatted(String formatted) {
    this.formatted = formatted;
    return this;
  }

  /**
   * Телефонный номер целиком
   * @return formatted
  */
  @NotNull @Pattern(regexp = "^\\d+$") 
  @Schema(name = "formatted", description = "Телефонный номер целиком", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("formatted")
  public String getFormatted() {
    return formatted;
  }

  public void setFormatted(String formatted) {
    this.formatted = formatted;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    VacancyDraftPhoneFormatted vacancyDraftPhoneFormatted = (VacancyDraftPhoneFormatted) o;
    return Objects.equals(this.comment, vacancyDraftPhoneFormatted.comment) &&
        Objects.equals(this.formatted, vacancyDraftPhoneFormatted.formatted);
  }

  @Override
  public int hashCode() {
    return Objects.hash(comment, formatted);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class VacancyDraftPhoneFormatted {\n");
    sb.append("    comment: ").append(toIndentedString(comment)).append("\n");
    sb.append("    formatted: ").append(toIndentedString(formatted)).append("\n");
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

