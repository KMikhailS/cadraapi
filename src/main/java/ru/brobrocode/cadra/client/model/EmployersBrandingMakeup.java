package ru.brobrocode.cadra.client.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.annotation.Generated;
import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;

import java.util.Objects;

/**
 * EmployersBrandingMakeup
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2025-08-17T15:41:09.394389505+05:00[Asia/Yekaterinburg]", comments = "Generator version: 7.6.0")
public class EmployersBrandingMakeup implements EmployersBrandingBrandParameters {

  private EmployersBrandingMakeupMakeup makeup;

  private String templateCode;

  private String templateVersionId;

  public EmployersBrandingMakeup() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public EmployersBrandingMakeup(EmployersBrandingMakeupMakeup makeup, String templateCode, String templateVersionId) {
    this.makeup = makeup;
    this.templateCode = templateCode;
    this.templateVersionId = templateVersionId;
  }

  public EmployersBrandingMakeup makeup(EmployersBrandingMakeupMakeup makeup) {
    this.makeup = makeup;
    return this;
  }

  /**
   * Get makeup
   * @return makeup
  */
  @NotNull @Valid 
  @Schema(name = "makeup", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("makeup")
  public EmployersBrandingMakeupMakeup getMakeup() {
    return makeup;
  }

  public void setMakeup(EmployersBrandingMakeupMakeup makeup) {
    this.makeup = makeup;
  }

  public EmployersBrandingMakeup templateCode(String templateCode) {
    this.templateCode = templateCode;
    return this;
  }

  /**
   * Уникальный код активного бренд шаблона страницы в формате \"makeup:\\d+\"
   * @return templateCode
  */
  @NotNull 
  @Schema(name = "template_code", example = "makeup:123", description = "Уникальный код активного бренд шаблона страницы в формате \"makeup:\\d+\"", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("template_code")
  public String getTemplateCode() {
    return templateCode;
  }

  public void setTemplateCode(String templateCode) {
    this.templateCode = templateCode;
  }

  public EmployersBrandingMakeup templateVersionId(String templateVersionId) {
    this.templateVersionId = templateVersionId;
    return this;
  }

  /**
   * Идентификатор активной версии бренд шаблона страницы
   * @return templateVersionId
  */
  @NotNull 
  @Schema(name = "template_version_id", description = "Идентификатор активной версии бренд шаблона страницы", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("template_version_id")
  public String getTemplateVersionId() {
    return templateVersionId;
  }

  public void setTemplateVersionId(String templateVersionId) {
    this.templateVersionId = templateVersionId;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EmployersBrandingMakeup employersBrandingMakeup = (EmployersBrandingMakeup) o;
    return Objects.equals(this.makeup, employersBrandingMakeup.makeup) &&
        Objects.equals(this.templateCode, employersBrandingMakeup.templateCode) &&
        Objects.equals(this.templateVersionId, employersBrandingMakeup.templateVersionId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(makeup, templateCode, templateVersionId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EmployersBrandingMakeup {\n");
    sb.append("    makeup: ").append(toIndentedString(makeup)).append("\n");
    sb.append("    templateCode: ").append(toIndentedString(templateCode)).append("\n");
    sb.append("    templateVersionId: ").append(toIndentedString(templateVersionId)).append("\n");
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

