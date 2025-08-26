package ru.brobrocode.cadra.client.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.annotation.Generated;
import jakarta.validation.Valid;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * VacanciesClusters
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2025-08-17T15:41:09.394389505+05:00[Asia/Yekaterinburg]", comments = "Generator version: 7.6.0")
public class VacanciesClusters {

  @Valid
  private List<@Valid VacanciesClusterItem> clusters;

  public VacanciesClusters clusters(List<@Valid VacanciesClusterItem> clusters) {
    this.clusters = clusters;
    return this;
  }

  public VacanciesClusters addClustersItem(VacanciesClusterItem clustersItem) {
    if (this.clusters == null) {
      this.clusters = new ArrayList<>();
    }
    this.clusters.add(clustersItem);
    return this;
  }

  /**
   * Массив [кластеров поиска](#tag/Poisk-vakansij/Klastery-v-poiske-vakansij)
   * @return clusters
  */
  @Valid 
  @Schema(name = "clusters", description = "Массив [кластеров поиска](#tag/Poisk-vakansij/Klastery-v-poiske-vakansij)", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("clusters")
  public List<@Valid VacanciesClusterItem> getClusters() {
    return clusters;
  }

  public void setClusters(List<@Valid VacanciesClusterItem> clusters) {
    this.clusters = clusters;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    VacanciesClusters vacanciesClusters = (VacanciesClusters) o;
    return Objects.equals(this.clusters, vacanciesClusters.clusters);
  }

  @Override
  public int hashCode() {
    return Objects.hash(clusters);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class VacanciesClusters {\n");
    sb.append("    clusters: ").append(toIndentedString(clusters)).append("\n");
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

