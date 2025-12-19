package ru.brobrocode.cadra.client.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.annotation.Generated;
import jakarta.validation.constraints.NotNull;

import java.util.Objects;

/**
 * ResumeObjectsDriverLicenseTypes
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2025-08-17T15:41:09.394389505+05:00[Asia/Yekaterinburg]", comments = "Generator version: 7.6.0")
public class ResumeObjectsDriverLicenseTypes {

  private String id;

  public ResumeObjectsDriverLicenseTypes() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public ResumeObjectsDriverLicenseTypes(String id) {
    this.id = id;
  }

  public ResumeObjectsDriverLicenseTypes id(String id) {
    this.id = id;
    return this;
  }

  /**
   * Категория водительских прав соискателя. Элемент справочника [тип водительских прав](#tag/Obshie-spravochniki/operation/get-dictionaries)
   * @return id
  */
  @NotNull 
  @Schema(name = "id", description = "Категория водительских прав соискателя. Элемент справочника [тип водительских прав](#tag/Obshie-spravochniki/operation/get-dictionaries)", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("id")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ResumeObjectsDriverLicenseTypes resumeObjectsDriverLicenseTypes = (ResumeObjectsDriverLicenseTypes) o;
    return Objects.equals(this.id, resumeObjectsDriverLicenseTypes.id);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ResumeObjectsDriverLicenseTypes {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
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

