package ru.brobrocode.cadra.client.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.annotation.Generated;
import jakarta.validation.constraints.NotNull;

import java.util.Objects;

/**
 * Ссылки на логотипы работодателя разных размеров
 */

@Schema(name = "VacancyDraftEmployer_logo_urls", description = "Ссылки на логотипы работодателя разных размеров")
@JsonTypeName("VacancyDraftEmployer_logo_urls")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2025-08-17T15:41:09.394389505+05:00[Asia/Yekaterinburg]", comments = "Generator version: 7.6.0")
public class VacancyDraftEmployerLogoUrls {

  private String _90;

  private String _240;

  private String original;

  public VacancyDraftEmployerLogoUrls() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public VacancyDraftEmployerLogoUrls(String _90, String _240) {
    this._90 = _90;
    this._240 = _240;
  }

  public VacancyDraftEmployerLogoUrls _90(String _90) {
    this._90 = _90;
    return this;
  }

  /**
   * Get _90
   * @return _90
  */
  @NotNull 
  @Schema(name = "90", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("90")
  public String get90() {
    return _90;
  }

  public void set90(String _90) {
    this._90 = _90;
  }

  public VacancyDraftEmployerLogoUrls _240(String _240) {
    this._240 = _240;
    return this;
  }

  /**
   * Get _240
   * @return _240
  */
  @NotNull 
  @Schema(name = "240", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("240")
  public String get240() {
    return _240;
  }

  public void set240(String _240) {
    this._240 = _240;
  }

  public VacancyDraftEmployerLogoUrls original(String original) {
    this.original = original;
    return this;
  }

  /**
   * Get original
   * @return original
  */
  
  @Schema(name = "original", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("original")
  public String getOriginal() {
    return original;
  }

  public void setOriginal(String original) {
    this.original = original;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    VacancyDraftEmployerLogoUrls vacancyDraftEmployerLogoUrls = (VacancyDraftEmployerLogoUrls) o;
    return Objects.equals(this._90, vacancyDraftEmployerLogoUrls._90) &&
        Objects.equals(this._240, vacancyDraftEmployerLogoUrls._240) &&
        Objects.equals(this.original, vacancyDraftEmployerLogoUrls.original);
  }

  @Override
  public int hashCode() {
    return Objects.hash(_90, _240, original);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class VacancyDraftEmployerLogoUrls {\n");
    sb.append("    _90: ").append(toIndentedString(_90)).append("\n");
    sb.append("    _240: ").append(toIndentedString(_240)).append("\n");
    sb.append("    original: ").append(toIndentedString(original)).append("\n");
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

