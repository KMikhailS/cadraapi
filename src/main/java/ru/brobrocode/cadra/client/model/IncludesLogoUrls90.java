package ru.brobrocode.cadra.client.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.annotation.Generated;
import jakarta.validation.constraints.NotNull;

import java.util.Objects;

/**
 * IncludesLogoUrls90
 */

@JsonTypeName("_IncludesLogoUrls90")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2025-08-17T15:41:09.394389505+05:00[Asia/Yekaterinburg]", comments = "Generator version: 7.6.0")
public class IncludesLogoUrls90 {

  private String _90;

  public IncludesLogoUrls90() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public IncludesLogoUrls90(String _90) {
    this._90 = _90;
  }

  public IncludesLogoUrls90 _90(String _90) {
    this._90 = _90;
    return this;
  }

  /**
   * URL логотипа с размером менее 90px по меньшей стороне
   * @return _90
  */
  @NotNull 
  @Schema(name = "90", description = "URL логотипа с размером менее 90px по меньшей стороне", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("90")
  public String get90() {
    return _90;
  }

  public void set90(String _90) {
    this._90 = _90;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    IncludesLogoUrls90 includesLogoUrls90 = (IncludesLogoUrls90) o;
    return Objects.equals(this._90, includesLogoUrls90._90);
  }

  @Override
  public int hashCode() {
    return Objects.hash(_90);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IncludesLogoUrls90 {\n");
    sb.append("    _90: ").append(toIndentedString(_90)).append("\n");
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

