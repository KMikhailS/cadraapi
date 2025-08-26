package ru.brobrocode.cadra.client.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.annotation.Generated;
import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;

import java.util.Objects;

/**
 * IncludesEducationalInstitutionItem
 */

@JsonTypeName("_IncludesEducationalInstitutionItem")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2025-08-17T15:41:09.394389505+05:00[Asia/Yekaterinburg]", comments = "Generator version: 7.6.0")
public class IncludesEducationalInstitutionItem {

  private String acronym = null;

  private IncludesEducationalInstitutionItemArea area;

  private String id;

  private String synonyms = null;

  private String text;

  public IncludesEducationalInstitutionItem() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public IncludesEducationalInstitutionItem(IncludesEducationalInstitutionItemArea area, String id, String text) {
    this.area = area;
    this.id = id;
    this.text = text;
  }

  public IncludesEducationalInstitutionItem acronym(String acronym) {
    this.acronym = acronym;
    return this;
  }

  /**
   * Сокращенное название учебного заведения
   * @return acronym
  */
  
  @Schema(name = "acronym", description = "Сокращенное название учебного заведения", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("acronym")
  public String getAcronym() {
    return acronym;
  }

  public void setAcronym(String acronym) {
    this.acronym = acronym;
  }

  public IncludesEducationalInstitutionItem area(IncludesEducationalInstitutionItemArea area) {
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
  public IncludesEducationalInstitutionItemArea getArea() {
    return area;
  }

  public void setArea(IncludesEducationalInstitutionItemArea area) {
    this.area = area;
  }

  public IncludesEducationalInstitutionItem id(String id) {
    this.id = id;
    return this;
  }

  /**
   * Идентификатор учебного заведения
   * @return id
  */
  @NotNull 
  @Schema(name = "id", description = "Идентификатор учебного заведения", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("id")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public IncludesEducationalInstitutionItem synonyms(String synonyms) {
    this.synonyms = synonyms;
    return this;
  }

  /**
   * Альтернативное название учебного заведения
   * @return synonyms
  */
  
  @Schema(name = "synonyms", description = "Альтернативное название учебного заведения", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("synonyms")
  public String getSynonyms() {
    return synonyms;
  }

  public void setSynonyms(String synonyms) {
    this.synonyms = synonyms;
  }

  public IncludesEducationalInstitutionItem text(String text) {
    this.text = text;
    return this;
  }

  /**
   * Полное название учебного заведения
   * @return text
  */
  @NotNull 
  @Schema(name = "text", description = "Полное название учебного заведения", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("text")
  public String getText() {
    return text;
  }

  public void setText(String text) {
    this.text = text;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    IncludesEducationalInstitutionItem includesEducationalInstitutionItem = (IncludesEducationalInstitutionItem) o;
    return Objects.equals(this.acronym, includesEducationalInstitutionItem.acronym) &&
        Objects.equals(this.area, includesEducationalInstitutionItem.area) &&
        Objects.equals(this.id, includesEducationalInstitutionItem.id) &&
        Objects.equals(this.synonyms, includesEducationalInstitutionItem.synonyms) &&
        Objects.equals(this.text, includesEducationalInstitutionItem.text);
  }

  @Override
  public int hashCode() {
    return Objects.hash(acronym, area, id, synonyms, text);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IncludesEducationalInstitutionItem {\n");
    sb.append("    acronym: ").append(toIndentedString(acronym)).append("\n");
    sb.append("    area: ").append(toIndentedString(area)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    synonyms: ").append(toIndentedString(synonyms)).append("\n");
    sb.append("    text: ").append(toIndentedString(text)).append("\n");
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

