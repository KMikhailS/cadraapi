package ru.brobrocode.cadra.client.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;
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
 * Пройденные тесты кандидата
 */

@Schema(name = "NegotiationsNegotiationTestResultsResponse_test_result", description = "Пройденные тесты кандидата")
@JsonTypeName("NegotiationsNegotiationTestResultsResponse_test_result")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2025-08-17T15:41:09.394389505+05:00[Asia/Yekaterinburg]", comments = "Generator version: 7.6.0")
public class NegotiationsNegotiationTestResultsResponseTestResult {

  private BigDecimal duration;

  /**
   * Дифференцированная оценка за тест: * `UNFAIR` — от 0 до 14 баллов; * `FAIR` — от 15 до 44 баллов; * `GOOD` — от 45 до 79 баллов; * `EXCELLENT` — от 80 до 100 баллов 
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

  private String name;

  private BigDecimal score;

  @Valid
  private List<@Valid SkillVerificationsTestResultTasks> tasks = new ArrayList<>();

  public NegotiationsNegotiationTestResultsResponseTestResult() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public NegotiationsNegotiationTestResultsResponseTestResult(BigDecimal duration, MarkEnum mark, String name, BigDecimal score, List<@Valid SkillVerificationsTestResultTasks> tasks) {
    this.duration = duration;
    this.mark = mark;
    this.name = name;
    this.score = score;
    this.tasks = tasks;
  }

  public NegotiationsNegotiationTestResultsResponseTestResult duration(BigDecimal duration) {
    this.duration = duration;
    return this;
  }

  /**
   * Время, затраченное на выполнение теста, в секундах
   * @return duration
  */
  @NotNull @Valid 
  @Schema(name = "duration", description = "Время, затраченное на выполнение теста, в секундах", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("duration")
  public BigDecimal getDuration() {
    return duration;
  }

  public void setDuration(BigDecimal duration) {
    this.duration = duration;
  }

  public NegotiationsNegotiationTestResultsResponseTestResult mark(MarkEnum mark) {
    this.mark = mark;
    return this;
  }

  /**
   * Дифференцированная оценка за тест: * `UNFAIR` — от 0 до 14 баллов; * `FAIR` — от 15 до 44 баллов; * `GOOD` — от 45 до 79 баллов; * `EXCELLENT` — от 80 до 100 баллов 
   * @return mark
  */
  @NotNull 
  @Schema(name = "mark", description = "Дифференцированная оценка за тест: * `UNFAIR` — от 0 до 14 баллов; * `FAIR` — от 15 до 44 баллов; * `GOOD` — от 45 до 79 баллов; * `EXCELLENT` — от 80 до 100 баллов ", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("mark")
  public MarkEnum getMark() {
    return mark;
  }

  public void setMark(MarkEnum mark) {
    this.mark = mark;
  }

  public NegotiationsNegotiationTestResultsResponseTestResult name(String name) {
    this.name = name;
    return this;
  }

  /**
   * Наименование теста
   * @return name
  */
  @NotNull 
  @Schema(name = "name", description = "Наименование теста", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("name")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public NegotiationsNegotiationTestResultsResponseTestResult score(BigDecimal score) {
    this.score = score;
    return this;
  }

  /**
   * Результат прохождения теста в баллах (от 0 до 100)
   * @return score
  */
  @NotNull @Valid 
  @Schema(name = "score", description = "Результат прохождения теста в баллах (от 0 до 100)", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("score")
  public BigDecimal getScore() {
    return score;
  }

  public void setScore(BigDecimal score) {
    this.score = score;
  }

  public NegotiationsNegotiationTestResultsResponseTestResult tasks(List<@Valid SkillVerificationsTestResultTasks> tasks) {
    this.tasks = tasks;
    return this;
  }

  public NegotiationsNegotiationTestResultsResponseTestResult addTasksItem(SkillVerificationsTestResultTasks tasksItem) {
    if (this.tasks == null) {
      this.tasks = new ArrayList<>();
    }
    this.tasks.add(tasksItem);
    return this;
  }

  /**
   * Get tasks
   * @return tasks
  */
  @NotNull @Valid 
  @Schema(name = "tasks", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("tasks")
  public List<@Valid SkillVerificationsTestResultTasks> getTasks() {
    return tasks;
  }

  public void setTasks(List<@Valid SkillVerificationsTestResultTasks> tasks) {
    this.tasks = tasks;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    NegotiationsNegotiationTestResultsResponseTestResult negotiationsNegotiationTestResultsResponseTestResult = (NegotiationsNegotiationTestResultsResponseTestResult) o;
    return Objects.equals(this.duration, negotiationsNegotiationTestResultsResponseTestResult.duration) &&
        Objects.equals(this.mark, negotiationsNegotiationTestResultsResponseTestResult.mark) &&
        Objects.equals(this.name, negotiationsNegotiationTestResultsResponseTestResult.name) &&
        Objects.equals(this.score, negotiationsNegotiationTestResultsResponseTestResult.score) &&
        Objects.equals(this.tasks, negotiationsNegotiationTestResultsResponseTestResult.tasks);
  }

  @Override
  public int hashCode() {
    return Objects.hash(duration, mark, name, score, tasks);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class NegotiationsNegotiationTestResultsResponseTestResult {\n");
    sb.append("    duration: ").append(toIndentedString(duration)).append("\n");
    sb.append("    mark: ").append(toIndentedString(mark)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    score: ").append(toIndentedString(score)).append("\n");
    sb.append("    tasks: ").append(toIndentedString(tasks)).append("\n");
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

