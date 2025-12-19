package ru.brobrocode.cadra.client.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.annotation.Generated;
import jakarta.validation.constraints.NotNull;

import java.util.Objects;

/**
 * SkillVerificationsOpenedAnswer
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2025-08-17T15:41:09.394389505+05:00[Asia/Yekaterinburg]", comments = "Generator version: 7.6.0")
public class SkillVerificationsOpenedAnswer {

  /**
   * Дифференцированная оценка за ответ от работодателя: * `UNFAIR` — 0 баллов; * `FAIR` — 30 баллов; * `GOOD` — 60 баллов; * `EXCELLENT` — 100 баллов 
   */
  public enum MarkEnum {
    UNFAIR("UNFAIR"),
    
    FAIR("FAIR"),
    
    GOOD("GOOD"),
    
    EXCELLENT("EXCELLENT");

    private String value;

    MarkEnum(String value) {
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
    public static MarkEnum fromValue(String value) {
      for (MarkEnum b : MarkEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  private MarkEnum mark;

  private String value;

  public SkillVerificationsOpenedAnswer() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public SkillVerificationsOpenedAnswer(MarkEnum mark, String value) {
    this.mark = mark;
    this.value = value;
  }

  public SkillVerificationsOpenedAnswer mark(MarkEnum mark) {
    this.mark = mark;
    return this;
  }

  /**
   * Дифференцированная оценка за ответ от работодателя: * `UNFAIR` — 0 баллов; * `FAIR` — 30 баллов; * `GOOD` — 60 баллов; * `EXCELLENT` — 100 баллов 
   * @return mark
  */
  @NotNull 
  @Schema(name = "mark", description = "Дифференцированная оценка за ответ от работодателя: * `UNFAIR` — 0 баллов; * `FAIR` — 30 баллов; * `GOOD` — 60 баллов; * `EXCELLENT` — 100 баллов ", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("mark")
  public MarkEnum getMark() {
    return mark;
  }

  public void setMark(MarkEnum mark) {
    this.mark = mark;
  }

  public SkillVerificationsOpenedAnswer value(String value) {
    this.value = value;
    return this;
  }

  /**
   * Ответ на вопрос
   * @return value
  */
  @NotNull 
  @Schema(name = "value", description = "Ответ на вопрос", requiredMode = Schema.RequiredMode.REQUIRED)
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
    SkillVerificationsOpenedAnswer skillVerificationsOpenedAnswer = (SkillVerificationsOpenedAnswer) o;
    return Objects.equals(this.mark, skillVerificationsOpenedAnswer.mark) &&
        Objects.equals(this.value, skillVerificationsOpenedAnswer.value);
  }

  @Override
  public int hashCode() {
    return Objects.hash(mark, value);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SkillVerificationsOpenedAnswer {\n");
    sb.append("    mark: ").append(toIndentedString(mark)).append("\n");
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

