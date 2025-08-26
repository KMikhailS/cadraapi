package ru.brobrocode.cadra.client.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.annotation.Generated;
import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;

import java.math.BigDecimal;
import java.util.Objects;

/**
 * VacanciesVisitorsHiddenOnPage
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2025-08-17T15:41:09.394389505+05:00[Asia/Yekaterinburg]", comments = "Generator version: 7.6.0")
public class VacanciesVisitorsHiddenOnPage {

  private BigDecimal hiddenOnPage;

  public VacanciesVisitorsHiddenOnPage() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public VacanciesVisitorsHiddenOnPage(BigDecimal hiddenOnPage) {
    this.hiddenOnPage = hiddenOnPage;
  }

  public VacanciesVisitorsHiddenOnPage hiddenOnPage(BigDecimal hiddenOnPage) {
    this.hiddenOnPage = hiddenOnPage;
    return this;
  }

  /**
   * Количество удаленных или скрытых соискателями резюме на странице
   * @return hiddenOnPage
  */
  @NotNull @Valid 
  @Schema(name = "hidden_on_page", description = "Количество удаленных или скрытых соискателями резюме на странице", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("hidden_on_page")
  public BigDecimal getHiddenOnPage() {
    return hiddenOnPage;
  }

  public void setHiddenOnPage(BigDecimal hiddenOnPage) {
    this.hiddenOnPage = hiddenOnPage;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    VacanciesVisitorsHiddenOnPage vacanciesVisitorsHiddenOnPage = (VacanciesVisitorsHiddenOnPage) o;
    return Objects.equals(this.hiddenOnPage, vacanciesVisitorsHiddenOnPage.hiddenOnPage);
  }

  @Override
  public int hashCode() {
    return Objects.hash(hiddenOnPage);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class VacanciesVisitorsHiddenOnPage {\n");
    sb.append("    hiddenOnPage: ").append(toIndentedString(hiddenOnPage)).append("\n");
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

