package ru.brobrocode.cadra.client.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.annotation.Generated;
import jakarta.validation.constraints.NotNull;

import java.util.Objects;

/**
 * IncludesLogoUrls
 */

@JsonTypeName("_IncludesLogoUrls")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2025-08-17T15:41:09.394389505+05:00[Asia/Yekaterinburg]", comments = "Generator version: 7.6.0")
public class IncludesLogoUrls {

  private String _90;

  private String _240;

  private String original;

  public IncludesLogoUrls() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public IncludesLogoUrls(String original) {
    this.original = original;
  }

  public IncludesLogoUrls _90(String _90) {
    this._90 = _90;
    return this;
  }

  /**
   * URL логотипа с размером менее 90px по меньшей стороне
   * @return _90
  */
  
  @Schema(name = "90", description = "URL логотипа с размером менее 90px по меньшей стороне", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("90")
  public String get90() {
    return _90;
  }

  public void set90(String _90) {
    this._90 = _90;
  }

  public IncludesLogoUrls _240(String _240) {
    this._240 = _240;
    return this;
  }

  /**
   * URL логотипа с размером менее 240px по меньшей стороне
   * @return _240
  */
  
  @Schema(name = "240", description = "URL логотипа с размером менее 240px по меньшей стороне", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("240")
  public String get240() {
    return _240;
  }

  public void set240(String _240) {
    this._240 = _240;
  }

  public IncludesLogoUrls original(String original) {
    this.original = original;
    return this;
  }

  /**
   * URL необработанного логотипа
   * @return original
  */
  @NotNull 
  @Schema(name = "original", description = "URL необработанного логотипа", requiredMode = Schema.RequiredMode.REQUIRED)
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
    IncludesLogoUrls includesLogoUrls = (IncludesLogoUrls) o;
    return Objects.equals(this._90, includesLogoUrls._90) &&
        Objects.equals(this._240, includesLogoUrls._240) &&
        Objects.equals(this.original, includesLogoUrls.original);
  }

  @Override
  public int hashCode() {
    return Objects.hash(_90, _240, original);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IncludesLogoUrls {\n");
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

