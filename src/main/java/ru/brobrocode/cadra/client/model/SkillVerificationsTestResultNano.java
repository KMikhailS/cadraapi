package ru.brobrocode.cadra.client.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.annotation.Generated;
import jakarta.validation.constraints.NotNull;

import java.util.Objects;

/**
 * Краткая информация о результате теста
 */

@Schema(name = "SkillVerificationsTestResultNano", description = "Краткая информация о результате теста")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2025-08-17T15:41:09.394389505+05:00[Asia/Yekaterinburg]", comments = "Generator version: 7.6.0")
public class SkillVerificationsTestResultNano {

  /**
   * Дифференцированная оценка за тест:  * `UNFAIR` — от 0 до 14 баллов; * `FAIR` — от 15 до 44 баллов; * `GOOD` — от 45 до 79 баллов; * `EXCELLENT` — от 80 до 100 баллов 
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

  private Integer score;

  public SkillVerificationsTestResultNano() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public SkillVerificationsTestResultNano(Integer score) {
    this.score = score;
  }

  public SkillVerificationsTestResultNano mark(MarkEnum mark) {
    this.mark = mark;
    return this;
  }

  /**
   * Дифференцированная оценка за тест:  * `UNFAIR` — от 0 до 14 баллов; * `FAIR` — от 15 до 44 баллов; * `GOOD` — от 45 до 79 баллов; * `EXCELLENT` — от 80 до 100 баллов 
   * @return mark
  */
  
  @Schema(name = "mark", description = "Дифференцированная оценка за тест:  * `UNFAIR` — от 0 до 14 баллов; * `FAIR` — от 15 до 44 баллов; * `GOOD` — от 45 до 79 баллов; * `EXCELLENT` — от 80 до 100 баллов ", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("mark")
  public MarkEnum getMark() {
    return mark;
  }

  public void setMark(MarkEnum mark) {
    this.mark = mark;
  }

  public SkillVerificationsTestResultNano score(Integer score) {
    this.score = score;
    return this;
  }

  /**
   * Результат прохождения теста в баллах (от 0 до 100)
   * @return score
  */
  @NotNull 
  @Schema(name = "score", description = "Результат прохождения теста в баллах (от 0 до 100)", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("score")
  public Integer getScore() {
    return score;
  }

  public void setScore(Integer score) {
    this.score = score;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SkillVerificationsTestResultNano skillVerificationsTestResultNano = (SkillVerificationsTestResultNano) o;
    return Objects.equals(this.mark, skillVerificationsTestResultNano.mark) &&
        Objects.equals(this.score, skillVerificationsTestResultNano.score);
  }

  @Override
  public int hashCode() {
    return Objects.hash(mark, score);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SkillVerificationsTestResultNano {\n");
    sb.append("    mark: ").append(toIndentedString(mark)).append("\n");
    sb.append("    score: ").append(toIndentedString(score)).append("\n");
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

