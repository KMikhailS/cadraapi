package ru.brobrocode.cadra.client.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.annotation.Generated;
import jakarta.validation.constraints.NotNull;

import java.util.Objects;

/**
 * VacanciesEmployerRating
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2025-08-17T15:41:09.394389505+05:00[Asia/Yekaterinburg]", comments = "Generator version: 7.6.0")
public class VacanciesEmployerRating {

  private Object reviewsCount = null;

  private String totalRating;

  public VacanciesEmployerRating() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public VacanciesEmployerRating(Object reviewsCount, String totalRating) {
    this.reviewsCount = reviewsCount;
    this.totalRating = totalRating;
  }

  public VacanciesEmployerRating reviewsCount(Object reviewsCount) {
    this.reviewsCount = reviewsCount;
    return this;
  }

  /**
   * Количество отзывов
   * @return reviewsCount
  */
  @NotNull 
  @Schema(name = "reviews_count", example = "700", description = "Количество отзывов", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("reviews_count")
  public Object getReviewsCount() {
    return reviewsCount;
  }

  public void setReviewsCount(Object reviewsCount) {
    this.reviewsCount = reviewsCount;
  }

  public VacanciesEmployerRating totalRating(String totalRating) {
    this.totalRating = totalRating;
    return this;
  }

  /**
   * Сводный рейтинг компании
   * @return totalRating
  */
  @NotNull 
  @Schema(name = "total_rating", example = "4.3", description = "Сводный рейтинг компании", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("total_rating")
  public String getTotalRating() {
    return totalRating;
  }

  public void setTotalRating(String totalRating) {
    this.totalRating = totalRating;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    VacanciesEmployerRating vacanciesEmployerRating = (VacanciesEmployerRating) o;
    return Objects.equals(this.reviewsCount, vacanciesEmployerRating.reviewsCount) &&
        Objects.equals(this.totalRating, vacanciesEmployerRating.totalRating);
  }

  @Override
  public int hashCode() {
    return Objects.hash(reviewsCount, totalRating);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class VacanciesEmployerRating {\n");
    sb.append("    reviewsCount: ").append(toIndentedString(reviewsCount)).append("\n");
    sb.append("    totalRating: ").append(toIndentedString(totalRating)).append("\n");
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

