package ru.brobrocode.cadra.client.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.annotation.Generated;
import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;

import java.math.BigDecimal;
import java.util.Objects;

/**
 * VacanciesItemsOfClusterItem
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2025-08-17T15:41:09.394389505+05:00[Asia/Yekaterinburg]", comments = "Generator version: 7.6.0")
public class VacanciesItemsOfClusterItem {

  private BigDecimal count;

  private IncludesClusterMetroLine metroLine = null;

  private IncludesClusterMetroStation metroStation = null;

  private String name;

  /**
   * Тип значения, связанного с группой
   */
  public enum TypeEnum {
    STATION("metro_station"),
    
    LINE("metro_line");

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
      return null;
    }
  }

  private TypeEnum type = null;

  private String url;

  public VacanciesItemsOfClusterItem() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public VacanciesItemsOfClusterItem(BigDecimal count, String name, String url) {
    this.count = count;
    this.name = name;
    this.url = url;
  }

  public VacanciesItemsOfClusterItem count(BigDecimal count) {
    this.count = count;
    return this;
  }

  /**
   * Количество вакансий в данном элементе кластера
   * @return count
  */
  @NotNull @Valid 
  @Schema(name = "count", description = "Количество вакансий в данном элементе кластера", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("count")
  public BigDecimal getCount() {
    return count;
  }

  public void setCount(BigDecimal count) {
    this.count = count;
  }

  public VacanciesItemsOfClusterItem metroLine(IncludesClusterMetroLine metroLine) {
    this.metroLine = metroLine;
    return this;
  }

  /**
   * Get metroLine
   * @return metroLine
  */
  @Valid 
  @Schema(name = "metro_line", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("metro_line")
  public IncludesClusterMetroLine getMetroLine() {
    return metroLine;
  }

  public void setMetroLine(IncludesClusterMetroLine metroLine) {
    this.metroLine = metroLine;
  }

  public VacanciesItemsOfClusterItem metroStation(IncludesClusterMetroStation metroStation) {
    this.metroStation = metroStation;
    return this;
  }

  /**
   * Get metroStation
   * @return metroStation
  */
  @Valid 
  @Schema(name = "metro_station", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("metro_station")
  public IncludesClusterMetroStation getMetroStation() {
    return metroStation;
  }

  public void setMetroStation(IncludesClusterMetroStation metroStation) {
    this.metroStation = metroStation;
  }

  public VacanciesItemsOfClusterItem name(String name) {
    this.name = name;
    return this;
  }

  /**
   * Название элемента кластера
   * @return name
  */
  @NotNull 
  @Schema(name = "name", description = "Название элемента кластера", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("name")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public VacanciesItemsOfClusterItem type(TypeEnum type) {
    this.type = type;
    return this;
  }

  /**
   * Тип значения, связанного с группой
   * @return type
  */
  
  @Schema(name = "type", description = "Тип значения, связанного с группой", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("type")
  public TypeEnum getType() {
    return type;
  }

  public void setType(TypeEnum type) {
    this.type = type;
  }

  public VacanciesItemsOfClusterItem url(String url) {
    this.url = url;
    return this;
  }

  /**
   * Ссылка на поисковую выдачу по данному элементу кластера
   * @return url
  */
  @NotNull 
  @Schema(name = "url", description = "Ссылка на поисковую выдачу по данному элементу кластера", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("url")
  public String getUrl() {
    return url;
  }

  public void setUrl(String url) {
    this.url = url;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    VacanciesItemsOfClusterItem vacanciesItemsOfClusterItem = (VacanciesItemsOfClusterItem) o;
    return Objects.equals(this.count, vacanciesItemsOfClusterItem.count) &&
        Objects.equals(this.metroLine, vacanciesItemsOfClusterItem.metroLine) &&
        Objects.equals(this.metroStation, vacanciesItemsOfClusterItem.metroStation) &&
        Objects.equals(this.name, vacanciesItemsOfClusterItem.name) &&
        Objects.equals(this.type, vacanciesItemsOfClusterItem.type) &&
        Objects.equals(this.url, vacanciesItemsOfClusterItem.url);
  }

  @Override
  public int hashCode() {
    return Objects.hash(count, metroLine, metroStation, name, type, url);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class VacanciesItemsOfClusterItem {\n");
    sb.append("    count: ").append(toIndentedString(count)).append("\n");
    sb.append("    metroLine: ").append(toIndentedString(metroLine)).append("\n");
    sb.append("    metroStation: ").append(toIndentedString(metroStation)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    url: ").append(toIndentedString(url)).append("\n");
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

