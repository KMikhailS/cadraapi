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
 * Тесты или опросники, предназначенные для прохождения соискателями
 */

@Schema(name = "NegotiationsAssessment", description = "Тесты или опросники, предназначенные для прохождения соискателями")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2025-08-17T15:41:09.394389505+05:00[Asia/Yekaterinburg]", comments = "Generator version: 7.6.0")
public class NegotiationsAssessment {

  private String id;

  private String name;

  @Valid
  private List<@Valid NegotiationsAction> actions = new ArrayList<>();

  public NegotiationsAssessment() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public NegotiationsAssessment(String id, String name, List<@Valid NegotiationsAction> actions) {
    this.id = id;
    this.name = name;
    this.actions = actions;
  }

  public NegotiationsAssessment id(String id) {
    this.id = id;
    return this;
  }

  /**
   * Идентификатор
   * @return id
  */
  @NotNull 
  @Schema(name = "id", description = "Идентификатор", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("id")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public NegotiationsAssessment name(String name) {
    this.name = name;
    return this;
  }

  /**
   * Название
   * @return name
  */
  @NotNull 
  @Schema(name = "name", description = "Название", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("name")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public NegotiationsAssessment actions(List<@Valid NegotiationsAction> actions) {
    this.actions = actions;
    return this;
  }

  public NegotiationsAssessment addActionsItem(NegotiationsAction actionsItem) {
    if (this.actions == null) {
      this.actions = new ArrayList<>();
    }
    this.actions.add(actionsItem);
    return this;
  }

  /**
   * Инструменты оценки
   * @return actions
  */
  @NotNull @Valid 
  @Schema(name = "actions", description = "Инструменты оценки", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("actions")
  public List<@Valid NegotiationsAction> getActions() {
    return actions;
  }

  public void setActions(List<@Valid NegotiationsAction> actions) {
    this.actions = actions;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    NegotiationsAssessment negotiationsAssessment = (NegotiationsAssessment) o;
    return Objects.equals(this.id, negotiationsAssessment.id) &&
        Objects.equals(this.name, negotiationsAssessment.name) &&
        Objects.equals(this.actions, negotiationsAssessment.actions);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, actions);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class NegotiationsAssessment {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    actions: ").append(toIndentedString(actions)).append("\n");
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

