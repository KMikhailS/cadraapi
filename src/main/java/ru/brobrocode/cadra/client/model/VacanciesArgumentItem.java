package ru.brobrocode.cadra.client.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.annotation.Generated;
import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;

import java.util.Objects;

/**
 * VacanciesArgumentItem
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2025-08-17T15:41:09.394389505+05:00[Asia/Yekaterinburg]", comments = "Generator version: 7.6.0")
public class VacanciesArgumentItem {

  private String argument;

  private IncludesIdName clusterGroup = null;

  private String disableUrl;

  private String hexColor = null;

  private String metroType = null;

  private String name = null;

  private String value;

  private String valueDescription = null;

  public VacanciesArgumentItem() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public VacanciesArgumentItem(String argument, String disableUrl, String value) {
    this.argument = argument;
    this.disableUrl = disableUrl;
    this.value = value;
  }

  public VacanciesArgumentItem argument(String argument) {
    this.argument = argument;
    return this;
  }

  /**
   * Параметр поиска вакансии
   * @return argument
  */
  @NotNull 
  @Schema(name = "argument", description = "Параметр поиска вакансии", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("argument")
  public String getArgument() {
    return argument;
  }

  public void setArgument(String argument) {
    this.argument = argument;
  }

  public VacanciesArgumentItem clusterGroup(IncludesIdName clusterGroup) {
    this.clusterGroup = clusterGroup;
    return this;
  }

  /**
   * Get clusterGroup
   * @return clusterGroup
  */
  @Valid 
  @Schema(name = "cluster_group", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("cluster_group")
  public IncludesIdName getClusterGroup() {
    return clusterGroup;
  }

  public void setClusterGroup(IncludesIdName clusterGroup) {
    this.clusterGroup = clusterGroup;
  }

  public VacanciesArgumentItem disableUrl(String disableUrl) {
    this.disableUrl = disableUrl;
    return this;
  }

  /**
   * URL поиска вакансий, который получится, если перестать учитывать в поиске данный параметр
   * @return disableUrl
  */
  @NotNull 
  @Schema(name = "disable_url", description = "URL поиска вакансий, который получится, если перестать учитывать в поиске данный параметр", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("disable_url")
  public String getDisableUrl() {
    return disableUrl;
  }

  public void setDisableUrl(String disableUrl) {
    this.disableUrl = disableUrl;
  }

  public VacanciesArgumentItem hexColor(String hexColor) {
    this.hexColor = hexColor;
    return this;
  }

  /**
   * Цвет линии в HEX-формате `RRGGBB` (от `000000` до `FFFFFF`). Возвращается только для аргумента `metro`
   * @return hexColor
  */
  
  @Schema(name = "hex_color", description = "Цвет линии в HEX-формате `RRGGBB` (от `000000` до `FFFFFF`). Возвращается только для аргумента `metro`", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("hex_color")
  public String getHexColor() {
    return hexColor;
  }

  public void setHexColor(String hexColor) {
    this.hexColor = hexColor;
  }

  public VacanciesArgumentItem metroType(String metroType) {
    this.metroType = metroType;
    return this;
  }

  /**
   * Станция или линия метро (`station`/`line`). Возвращается только для аргумента `metro`
   * @return metroType
  */
  
  @Schema(name = "metro_type", description = "Станция или линия метро (`station`/`line`). Возвращается только для аргумента `metro`", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("metro_type")
  public String getMetroType() {
    return metroType;
  }

  public void setMetroType(String metroType) {
    this.metroType = metroType;
  }

  public VacanciesArgumentItem name(String name) {
    this.name = name;
    return this;
  }

  /**
   * Название значения
   * @return name
  */
  
  @Schema(name = "name", description = "Название значения", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("name")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public VacanciesArgumentItem value(String value) {
    this.value = value;
    return this;
  }

  /**
   * Значение параметра
   * @return value
  */
  @NotNull 
  @Schema(name = "value", description = "Значение параметра", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("value")
  public String getValue() {
    return value;
  }

  public void setValue(String value) {
    this.value = value;
  }

  public VacanciesArgumentItem valueDescription(String valueDescription) {
    this.valueDescription = valueDescription;
    return this;
  }

  /**
   * Описание параметра
   * @return valueDescription
  */
  
  @Schema(name = "value_description", description = "Описание параметра", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("value_description")
  public String getValueDescription() {
    return valueDescription;
  }

  public void setValueDescription(String valueDescription) {
    this.valueDescription = valueDescription;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    VacanciesArgumentItem vacanciesArgumentItem = (VacanciesArgumentItem) o;
    return Objects.equals(this.argument, vacanciesArgumentItem.argument) &&
        Objects.equals(this.clusterGroup, vacanciesArgumentItem.clusterGroup) &&
        Objects.equals(this.disableUrl, vacanciesArgumentItem.disableUrl) &&
        Objects.equals(this.hexColor, vacanciesArgumentItem.hexColor) &&
        Objects.equals(this.metroType, vacanciesArgumentItem.metroType) &&
        Objects.equals(this.name, vacanciesArgumentItem.name) &&
        Objects.equals(this.value, vacanciesArgumentItem.value) &&
        Objects.equals(this.valueDescription, vacanciesArgumentItem.valueDescription);
  }

  @Override
  public int hashCode() {
    return Objects.hash(argument, clusterGroup, disableUrl, hexColor, metroType, name, value, valueDescription);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class VacanciesArgumentItem {\n");
    sb.append("    argument: ").append(toIndentedString(argument)).append("\n");
    sb.append("    clusterGroup: ").append(toIndentedString(clusterGroup)).append("\n");
    sb.append("    disableUrl: ").append(toIndentedString(disableUrl)).append("\n");
    sb.append("    hexColor: ").append(toIndentedString(hexColor)).append("\n");
    sb.append("    metroType: ").append(toIndentedString(metroType)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    value: ").append(toIndentedString(value)).append("\n");
    sb.append("    valueDescription: ").append(toIndentedString(valueDescription)).append("\n");
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

