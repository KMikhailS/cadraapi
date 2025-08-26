package ru.brobrocode.cadra.client.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.annotation.Generated;
import jakarta.validation.Valid;
import jakarta.validation.constraints.Size;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * VacancyDraftVacanciesDraftResponse
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2025-08-17T15:41:09.394389505+05:00[Asia/Yekaterinburg]", comments = "Generator version: 7.6.0")
public class VacancyDraftVacanciesDraftResponse {

  @Valid
  private List<BigDecimal> vacancyIds = new ArrayList<>();

  public VacancyDraftVacanciesDraftResponse vacancyIds(List<BigDecimal> vacancyIds) {
    this.vacancyIds = vacancyIds;
    return this;
  }

  public VacancyDraftVacanciesDraftResponse addVacancyIdsItem(BigDecimal vacancyIdsItem) {
    if (this.vacancyIds == null) {
      this.vacancyIds = new ArrayList<>();
    }
    this.vacancyIds.add(vacancyIdsItem);
    return this;
  }

  /**
   * Get vacancyIds
   * @return vacancyIds
  */
  @Valid @Size(min = 1) 
  @Schema(name = "vacancy_ids", example = "[30251619,30251620]", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("vacancy_ids")
  public List<BigDecimal> getVacancyIds() {
    return vacancyIds;
  }

  public void setVacancyIds(List<BigDecimal> vacancyIds) {
    this.vacancyIds = vacancyIds;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    VacancyDraftVacanciesDraftResponse vacancyDraftVacanciesDraftResponse = (VacancyDraftVacanciesDraftResponse) o;
    return Objects.equals(this.vacancyIds, vacancyDraftVacanciesDraftResponse.vacancyIds);
  }

  @Override
  public int hashCode() {
    return Objects.hash(vacancyIds);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class VacancyDraftVacanciesDraftResponse {\n");
    sb.append("    vacancyIds: ").append(toIndentedString(vacancyIds)).append("\n");
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

