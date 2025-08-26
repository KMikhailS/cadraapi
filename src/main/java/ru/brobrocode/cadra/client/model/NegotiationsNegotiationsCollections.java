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
 * NegotiationsNegotiationsCollections
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2025-08-17T15:41:09.394389505+05:00[Asia/Yekaterinburg]", comments = "Generator version: 7.6.0")
public class NegotiationsNegotiationsCollections {

  @Valid
  private List<@Valid NegotiationsNegotiationsCollection> collections = new ArrayList<>();

  @Valid
  private List<@Valid EmployersEmployersState> employerStates = new ArrayList<>();

  @Valid
  private List<@Valid NegotiationsNegotiationsCollection> generatedCollections = new ArrayList<>();

  public NegotiationsNegotiationsCollections() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public NegotiationsNegotiationsCollections(List<@Valid NegotiationsNegotiationsCollection> collections, List<@Valid EmployersEmployersState> employerStates, List<@Valid NegotiationsNegotiationsCollection> generatedCollections) {
    this.collections = collections;
    this.employerStates = employerStates;
    this.generatedCollections = generatedCollections;
  }

  public NegotiationsNegotiationsCollections collections(List<@Valid NegotiationsNegotiationsCollection> collections) {
    this.collections = collections;
    return this;
  }

  public NegotiationsNegotiationsCollections addCollectionsItem(NegotiationsNegotiationsCollection collectionsItem) {
    if (this.collections == null) {
      this.collections = new ArrayList<>();
    }
    this.collections.add(collectionsItem);
    return this;
  }

  /**
   * Коллекции откликов/приглашений для данной вакансии
   * @return collections
  */
  @NotNull @Valid 
  @Schema(name = "collections", description = "Коллекции откликов/приглашений для данной вакансии", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("collections")
  public List<@Valid NegotiationsNegotiationsCollection> getCollections() {
    return collections;
  }

  public void setCollections(List<@Valid NegotiationsNegotiationsCollection> collections) {
    this.collections = collections;
  }

  public NegotiationsNegotiationsCollections employerStates(List<@Valid EmployersEmployersState> employerStates) {
    this.employerStates = employerStates;
    return this;
  }

  public NegotiationsNegotiationsCollections addEmployerStatesItem(EmployersEmployersState employerStatesItem) {
    if (this.employerStates == null) {
      this.employerStates = new ArrayList<>();
    }
    this.employerStates.add(employerStatesItem);
    return this;
  }

  /**
   * Состояния [откликов/приглашений](https://github.com/hhru/api/blob/master/docs/employer_negotiations.md#term-employer-state) вакансии для работодателя 
   * @return employerStates
  */
  @NotNull @Valid 
  @Schema(name = "employer_states", description = "Состояния [откликов/приглашений](https://github.com/hhru/api/blob/master/docs/employer_negotiations.md#term-employer-state) вакансии для работодателя ", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("employer_states")
  public List<@Valid EmployersEmployersState> getEmployerStates() {
    return employerStates;
  }

  public void setEmployerStates(List<@Valid EmployersEmployersState> employerStates) {
    this.employerStates = employerStates;
  }

  public NegotiationsNegotiationsCollections generatedCollections(List<@Valid NegotiationsNegotiationsCollection> generatedCollections) {
    this.generatedCollections = generatedCollections;
    return this;
  }

  public NegotiationsNegotiationsCollections addGeneratedCollectionsItem(NegotiationsNegotiationsCollection generatedCollectionsItem) {
    if (this.generatedCollections == null) {
      this.generatedCollections = new ArrayList<>();
    }
    this.generatedCollections.add(generatedCollectionsItem);
    return this;
  }

  /**
   * Сгенерированные коллекции откликов/приглашений для данной вакансии
   * @return generatedCollections
  */
  @NotNull @Valid 
  @Schema(name = "generated_collections", description = "Сгенерированные коллекции откликов/приглашений для данной вакансии", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("generated_collections")
  public List<@Valid NegotiationsNegotiationsCollection> getGeneratedCollections() {
    return generatedCollections;
  }

  public void setGeneratedCollections(List<@Valid NegotiationsNegotiationsCollection> generatedCollections) {
    this.generatedCollections = generatedCollections;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    NegotiationsNegotiationsCollections negotiationsNegotiationsCollections = (NegotiationsNegotiationsCollections) o;
    return Objects.equals(this.collections, negotiationsNegotiationsCollections.collections) &&
        Objects.equals(this.employerStates, negotiationsNegotiationsCollections.employerStates) &&
        Objects.equals(this.generatedCollections, negotiationsNegotiationsCollections.generatedCollections);
  }

  @Override
  public int hashCode() {
    return Objects.hash(collections, employerStates, generatedCollections);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class NegotiationsNegotiationsCollections {\n");
    sb.append("    collections: ").append(toIndentedString(collections)).append("\n");
    sb.append("    employerStates: ").append(toIndentedString(employerStates)).append("\n");
    sb.append("    generatedCollections: ").append(toIndentedString(generatedCollections)).append("\n");
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

