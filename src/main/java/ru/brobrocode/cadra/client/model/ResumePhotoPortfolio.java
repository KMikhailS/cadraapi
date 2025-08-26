package ru.brobrocode.cadra.client.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.annotation.Generated;
import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * ResumePhotoPortfolio
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2025-08-17T15:41:09.394389505+05:00[Asia/Yekaterinburg]", comments = "Generator version: 7.6.0")
public class ResumePhotoPortfolio {

  private ResumeObjectsPhoto photo = null;

  @Valid
  private List<@Valid ResumeObjectsPortfolio> portfolio = new ArrayList<>();

  public ResumePhotoPortfolio() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public ResumePhotoPortfolio(List<@Valid ResumeObjectsPortfolio> portfolio) {
    this.portfolio = portfolio;
  }

  public ResumePhotoPortfolio photo(ResumeObjectsPhoto photo) {
    this.photo = photo;
    return this;
  }

  /**
   * Get photo
   * @return photo
  */
  @Valid 
  @Schema(name = "photo", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("photo")
  public ResumeObjectsPhoto getPhoto() {
    return photo;
  }

  public void setPhoto(ResumeObjectsPhoto photo) {
    this.photo = photo;
  }

  public ResumePhotoPortfolio portfolio(List<@Valid ResumeObjectsPortfolio> portfolio) {
    this.portfolio = portfolio;
    return this;
  }

  public ResumePhotoPortfolio addPortfolioItem(ResumeObjectsPortfolio portfolioItem) {
    if (this.portfolio == null) {
      this.portfolio = new ArrayList<>();
    }
    this.portfolio.add(portfolioItem);
    return this;
  }

  /**
   * Список изображений в портфолио пользователя
   * @return portfolio
  */
  @NotNull @Valid 
  @Schema(name = "portfolio", description = "Список изображений в портфолио пользователя", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("portfolio")
  public List<@Valid ResumeObjectsPortfolio> getPortfolio() {
    return portfolio;
  }

  public void setPortfolio(List<@Valid ResumeObjectsPortfolio> portfolio) {
    this.portfolio = portfolio;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ResumePhotoPortfolio resumePhotoPortfolio = (ResumePhotoPortfolio) o;
    return Objects.equals(this.photo, resumePhotoPortfolio.photo) &&
        Objects.equals(this.portfolio, resumePhotoPortfolio.portfolio);
  }

  @Override
  public int hashCode() {
    return Objects.hash(photo, portfolio);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ResumePhotoPortfolio {\n");
    sb.append("    photo: ").append(toIndentedString(photo)).append("\n");
    sb.append("    portfolio: ").append(toIndentedString(portfolio)).append("\n");
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

