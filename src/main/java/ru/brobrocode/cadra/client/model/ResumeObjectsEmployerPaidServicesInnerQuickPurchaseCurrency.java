package ru.brobrocode.cadra.client.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.annotation.Generated;
import jakarta.validation.constraints.NotNull;

import java.util.Objects;

/**
 * Валюта услуги
 */

@Schema(name = "ResumeObjectsEmployerPaidServices_inner_quick_purchase_currency", description = "Валюта услуги")
@JsonTypeName("ResumeObjectsEmployerPaidServices_inner_quick_purchase_currency")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2025-08-17T15:41:09.394389505+05:00[Asia/Yekaterinburg]", comments = "Generator version: 7.6.0")
public class ResumeObjectsEmployerPaidServicesInnerQuickPurchaseCurrency {

  private String abbr;

  private String code;

  private String name;

  public ResumeObjectsEmployerPaidServicesInnerQuickPurchaseCurrency() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public ResumeObjectsEmployerPaidServicesInnerQuickPurchaseCurrency(String abbr, String code, String name) {
    this.abbr = abbr;
    this.code = code;
    this.name = name;
  }

  public ResumeObjectsEmployerPaidServicesInnerQuickPurchaseCurrency abbr(String abbr) {
    this.abbr = abbr;
    return this;
  }

  /**
   * Краткое обозначение
   * @return abbr
  */
  @NotNull 
  @Schema(name = "abbr", description = "Краткое обозначение", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("abbr")
  public String getAbbr() {
    return abbr;
  }

  public void setAbbr(String abbr) {
    this.abbr = abbr;
  }

  public ResumeObjectsEmployerPaidServicesInnerQuickPurchaseCurrency code(String code) {
    this.code = code;
    return this;
  }

  /**
   * Код
   * @return code
  */
  @NotNull 
  @Schema(name = "code", description = "Код", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("code")
  public String getCode() {
    return code;
  }

  public void setCode(String code) {
    this.code = code;
  }

  public ResumeObjectsEmployerPaidServicesInnerQuickPurchaseCurrency name(String name) {
    this.name = name;
    return this;
  }

  /**
   * Название
   * @return name
  */
  @NotNull 
  @Schema(name = "name", description = "Название", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("name")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ResumeObjectsEmployerPaidServicesInnerQuickPurchaseCurrency resumeObjectsEmployerPaidServicesInnerQuickPurchaseCurrency = (ResumeObjectsEmployerPaidServicesInnerQuickPurchaseCurrency) o;
    return Objects.equals(this.abbr, resumeObjectsEmployerPaidServicesInnerQuickPurchaseCurrency.abbr) &&
        Objects.equals(this.code, resumeObjectsEmployerPaidServicesInnerQuickPurchaseCurrency.code) &&
        Objects.equals(this.name, resumeObjectsEmployerPaidServicesInnerQuickPurchaseCurrency.name);
  }

  @Override
  public int hashCode() {
    return Objects.hash(abbr, code, name);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ResumeObjectsEmployerPaidServicesInnerQuickPurchaseCurrency {\n");
    sb.append("    abbr: ").append(toIndentedString(abbr)).append("\n");
    sb.append("    code: ").append(toIndentedString(code)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
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

