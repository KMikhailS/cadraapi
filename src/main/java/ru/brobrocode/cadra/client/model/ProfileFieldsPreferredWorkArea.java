package ru.brobrocode.cadra.client.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.annotation.Generated;
import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * ProfileFieldsPreferredWorkArea
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2025-08-17T15:41:09.394389505+05:00[Asia/Yekaterinburg]", comments = "Generator version: 7.6.0")
public class ProfileFieldsPreferredWorkArea {

  private IncludesArea area;

  @Valid
  private List<@Valid ProfileFieldsDistrict> districts = new ArrayList<>();

  @Valid
  private List<@Valid MetroMetroLine> lines = new ArrayList<>();

  @Valid
  private List<@Valid MetroLineStation> stations = new ArrayList<>();

  public ProfileFieldsPreferredWorkArea() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public ProfileFieldsPreferredWorkArea(IncludesArea area) {
    this.area = area;
  }

  public ProfileFieldsPreferredWorkArea area(IncludesArea area) {
    this.area = area;
    return this;
  }

  /**
   * Get area
   * @return area
  */
  @NotNull @Valid 
  @Schema(name = "area", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("area")
  public IncludesArea getArea() {
    return area;
  }

  public void setArea(IncludesArea area) {
    this.area = area;
  }

  public ProfileFieldsPreferredWorkArea districts(List<@Valid ProfileFieldsDistrict> districts) {
    this.districts = districts;
    return this;
  }

  public ProfileFieldsPreferredWorkArea addDistrictsItem(ProfileFieldsDistrict districtsItem) {
    if (this.districts == null) {
      this.districts = new ArrayList<>();
    }
    this.districts.add(districtsItem);
    return this;
  }

  /**
   * Район города для поиска работы, район должен быть обязательно находится в выбранном городе для поиска работы 
   * @return districts
  */
  @Valid 
  @Schema(name = "districts", description = "Район города для поиска работы, район должен быть обязательно находится в выбранном городе для поиска работы ", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("districts")
  public List<@Valid ProfileFieldsDistrict> getDistricts() {
    return districts;
  }

  public void setDistricts(List<@Valid ProfileFieldsDistrict> districts) {
    this.districts = districts;
  }

  public ProfileFieldsPreferredWorkArea lines(List<@Valid MetroMetroLine> lines) {
    this.lines = lines;
    return this;
  }

  public ProfileFieldsPreferredWorkArea addLinesItem(MetroMetroLine linesItem) {
    if (this.lines == null) {
      this.lines = new ArrayList<>();
    }
    this.lines.add(linesItem);
    return this;
  }

  /**
   * Линии метро для поиска работы, линии метро должны находится в выбранном городе для поиска работы
   * @return lines
  */
  @Valid 
  @Schema(name = "lines", description = "Линии метро для поиска работы, линии метро должны находится в выбранном городе для поиска работы", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("lines")
  public List<@Valid MetroMetroLine> getLines() {
    return lines;
  }

  public void setLines(List<@Valid MetroMetroLine> lines) {
    this.lines = lines;
  }

  public ProfileFieldsPreferredWorkArea stations(List<@Valid MetroLineStation> stations) {
    this.stations = stations;
    return this;
  }

  public ProfileFieldsPreferredWorkArea addStationsItem(MetroLineStation stationsItem) {
    if (this.stations == null) {
      this.stations = new ArrayList<>();
    }
    this.stations.add(stationsItem);
    return this;
  }

  /**
   * Станции метро для поиска работы, станции метро должны находится в выбранном городе для поиска работы
   * @return stations
  */
  @Valid 
  @Schema(name = "stations", description = "Станции метро для поиска работы, станции метро должны находится в выбранном городе для поиска работы", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("stations")
  public List<@Valid MetroLineStation> getStations() {
    return stations;
  }

  public void setStations(List<@Valid MetroLineStation> stations) {
    this.stations = stations;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ProfileFieldsPreferredWorkArea profileFieldsPreferredWorkArea = (ProfileFieldsPreferredWorkArea) o;
    return Objects.equals(this.area, profileFieldsPreferredWorkArea.area) &&
        Objects.equals(this.districts, profileFieldsPreferredWorkArea.districts) &&
        Objects.equals(this.lines, profileFieldsPreferredWorkArea.lines) &&
        Objects.equals(this.stations, profileFieldsPreferredWorkArea.stations);
  }

  @Override
  public int hashCode() {
    return Objects.hash(area, districts, lines, stations);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ProfileFieldsPreferredWorkArea {\n");
    sb.append("    area: ").append(toIndentedString(area)).append("\n");
    sb.append("    districts: ").append(toIndentedString(districts)).append("\n");
    sb.append("    lines: ").append(toIndentedString(lines)).append("\n");
    sb.append("    stations: ").append(toIndentedString(stations)).append("\n");
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

