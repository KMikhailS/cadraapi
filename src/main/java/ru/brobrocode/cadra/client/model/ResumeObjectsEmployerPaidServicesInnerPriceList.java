package ru.brobrocode.cadra.client.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.annotation.Generated;
import jakarta.validation.constraints.NotNull;

import java.util.Objects;

/**
 * Прайс на услугу
 */

@Schema(name = "ResumeObjectsEmployerPaidServices_inner_price_list", description = "Прайс на услугу")
@JsonTypeName("ResumeObjectsEmployerPaidServices_inner_price_list")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2025-08-17T15:41:09.394389505+05:00[Asia/Yekaterinburg]", comments = "Generator version: 7.6.0")
public class ResumeObjectsEmployerPaidServicesInnerPriceList {

  private String alternateUrl;

  public ResumeObjectsEmployerPaidServicesInnerPriceList() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public ResumeObjectsEmployerPaidServicesInnerPriceList(String alternateUrl) {
    this.alternateUrl = alternateUrl;
  }

  public ResumeObjectsEmployerPaidServicesInnerPriceList alternateUrl(String alternateUrl) {
    this.alternateUrl = alternateUrl;
    return this;
  }

  /**
   * Ссылка на сайт, по которой доступен полный прайс на услугу
   * @return alternateUrl
  */
  @NotNull 
  @Schema(name = "alternate_url", description = "Ссылка на сайт, по которой доступен полный прайс на услугу", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("alternate_url")
  public String getAlternateUrl() {
    return alternateUrl;
  }

  public void setAlternateUrl(String alternateUrl) {
    this.alternateUrl = alternateUrl;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ResumeObjectsEmployerPaidServicesInnerPriceList resumeObjectsEmployerPaidServicesInnerPriceList = (ResumeObjectsEmployerPaidServicesInnerPriceList) o;
    return Objects.equals(this.alternateUrl, resumeObjectsEmployerPaidServicesInnerPriceList.alternateUrl);
  }

  @Override
  public int hashCode() {
    return Objects.hash(alternateUrl);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ResumeObjectsEmployerPaidServicesInnerPriceList {\n");
    sb.append("    alternateUrl: ").append(toIndentedString(alternateUrl)).append("\n");
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

