package ru.brobrocode.cadra.client.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.annotation.Generated;
import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;

import java.util.Objects;

/**
 * Дополнительные параметры брендирования
 */

@Schema(name = "EmployersBrandingEmployerBranding", description = "Дополнительные параметры брендирования")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2025-08-17T15:41:09.394389505+05:00[Asia/Yekaterinburg]", comments = "Generator version: 7.6.0")
public class EmployersBrandingEmployerBranding {

  /**
   * Тип брендирования:    * `CONSTRUCTOR` — брендирование типом «конструктор»;   * `MAKEUP` — брендирование типом «makeup» (хамелеон) 
   */
  public enum TypeEnum {
    CONSTRUCTOR("CONSTRUCTOR"),
    
    MAKEUP("MAKEUP");

    private String value;

    TypeEnum(String value) {
      this.value = value;
    }

    @JsonValue
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static TypeEnum fromValue(String value) {
      for (TypeEnum b : TypeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  private TypeEnum type;

  private EmployersBrandingConstructorConstructor constructor;

  private EmployersBrandingMakeupMakeup makeup;

  private String templateCode;

  private String templateVersionId;

  public EmployersBrandingEmployerBranding() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public EmployersBrandingEmployerBranding(TypeEnum type, EmployersBrandingConstructorConstructor constructor, EmployersBrandingMakeupMakeup makeup, String templateCode, String templateVersionId) {
    this.type = type;
    this.constructor = constructor;
    this.makeup = makeup;
    this.templateCode = templateCode;
    this.templateVersionId = templateVersionId;
  }

  public EmployersBrandingEmployerBranding type(TypeEnum type) {
    this.type = type;
    return this;
  }

  /**
   * Тип брендирования:    * `CONSTRUCTOR` — брендирование типом «конструктор»;   * `MAKEUP` — брендирование типом «makeup» (хамелеон) 
   * @return type
  */
  @NotNull 
  @Schema(name = "type", description = "Тип брендирования:    * `CONSTRUCTOR` — брендирование типом «конструктор»;   * `MAKEUP` — брендирование типом «makeup» (хамелеон) ", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("type")
  public TypeEnum getType() {
    return type;
  }

  public void setType(TypeEnum type) {
    this.type = type;
  }

  public EmployersBrandingEmployerBranding constructor(EmployersBrandingConstructorConstructor constructor) {
    this.constructor = constructor;
    return this;
  }

  /**
   * Get constructor
   * @return constructor
  */
  @NotNull @Valid 
  @Schema(name = "constructor", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("constructor")
  public EmployersBrandingConstructorConstructor getConstructor() {
    return constructor;
  }

  public void setConstructor(EmployersBrandingConstructorConstructor constructor) {
    this.constructor = constructor;
  }

  public EmployersBrandingEmployerBranding makeup(EmployersBrandingMakeupMakeup makeup) {
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

  public EmployersBrandingEmployerBranding templateCode(String templateCode) {
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

  public EmployersBrandingEmployerBranding templateVersionId(String templateVersionId) {
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
    EmployersBrandingEmployerBranding employersBrandingEmployerBranding = (EmployersBrandingEmployerBranding) o;
    return Objects.equals(this.type, employersBrandingEmployerBranding.type) &&
        Objects.equals(this.constructor, employersBrandingEmployerBranding.constructor) &&
        Objects.equals(this.makeup, employersBrandingEmployerBranding.makeup) &&
        Objects.equals(this.templateCode, employersBrandingEmployerBranding.templateCode) &&
        Objects.equals(this.templateVersionId, employersBrandingEmployerBranding.templateVersionId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(type, constructor, makeup, templateCode, templateVersionId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EmployersBrandingEmployerBranding {\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    constructor: ").append(toIndentedString(constructor)).append("\n");
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

