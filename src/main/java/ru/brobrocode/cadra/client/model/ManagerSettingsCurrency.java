package ru.brobrocode.cadra.client.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.annotation.Generated;
import jakarta.validation.constraints.NotNull;

import java.util.Objects;

/**
 * Предпочитаемая валюта при [публикации вакансии](#tag/Upravlenie-vakansiyami/operation/publish-vacancy) 
 */

@Schema(name = "ManagerSettingsCurrency", description = "Предпочитаемая валюта при [публикации вакансии](#tag/Upravlenie-vakansiyami/operation/publish-vacancy) ")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2025-08-17T15:41:09.394389505+05:00[Asia/Yekaterinburg]", comments = "Generator version: 7.6.0")
public class ManagerSettingsCurrency {

  private String abbr;

  private String code;

  private String name;

  public ManagerSettingsCurrency() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public ManagerSettingsCurrency(String abbr, String code, String name) {
    this.abbr = abbr;
    this.code = code;
    this.name = name;
  }

  public ManagerSettingsCurrency abbr(String abbr) {
    this.abbr = abbr;
    return this;
  }

  /**
   * Краткое обозначение валюты
   * @return abbr
  */
  @NotNull 
  @Schema(name = "abbr", example = "руб.", description = "Краткое обозначение валюты", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("abbr")
  public String getAbbr() {
    return abbr;
  }

  public void setAbbr(String abbr) {
    this.abbr = abbr;
  }

  public ManagerSettingsCurrency code(String code) {
    this.code = code;
    return this;
  }

  /**
   * Код валюты
   * @return code
  */
  @NotNull 
  @Schema(name = "code", example = "RUR", description = "Код валюты", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("code")
  public String getCode() {
    return code;
  }

  public void setCode(String code) {
    this.code = code;
  }

  public ManagerSettingsCurrency name(String name) {
    this.name = name;
    return this;
  }

  /**
   * Название валюты
   * @return name
  */
  @NotNull 
  @Schema(name = "name", example = "Рубли", description = "Название валюты", requiredMode = Schema.RequiredMode.REQUIRED)
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
    ManagerSettingsCurrency managerSettingsCurrency = (ManagerSettingsCurrency) o;
    return Objects.equals(this.abbr, managerSettingsCurrency.abbr) &&
        Objects.equals(this.code, managerSettingsCurrency.code) &&
        Objects.equals(this.name, managerSettingsCurrency.name);
  }

  @Override
  public int hashCode() {
    return Objects.hash(abbr, code, name);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ManagerSettingsCurrency {\n");
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

