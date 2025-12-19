package ru.brobrocode.cadra.client.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.annotation.Generated;
import jakarta.validation.Valid;

import java.math.BigDecimal;
import java.util.Objects;

/**
 * Информация по примененному брендированному шаблону конструктора вакансии. Поддерживается только две картинки: верхняя — в шапке вакансии, нижняя — в самом низу
 */

@Schema(name = "VacancyVacancyConstructorTemplate", description = "Информация по примененному брендированному шаблону конструктора вакансии. Поддерживается только две картинки: верхняя — в шапке вакансии, нижняя — в самом низу")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2025-08-17T15:41:09.394389505+05:00[Asia/Yekaterinburg]", comments = "Generator version: 7.6.0")
public class VacancyVacancyConstructorTemplate {

  private VacancyPicture bottomPicture = null;

  private BigDecimal id;

  private String name;

  private VacancyPicture topPicture = null;

  public VacancyVacancyConstructorTemplate bottomPicture(VacancyPicture bottomPicture) {
    this.bottomPicture = bottomPicture;
    return this;
  }

  /**
   * Get bottomPicture
   * @return bottomPicture
  */
  @Valid 
  @Schema(name = "bottom_picture", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("bottom_picture")
  public VacancyPicture getBottomPicture() {
    return bottomPicture;
  }

  public void setBottomPicture(VacancyPicture bottomPicture) {
    this.bottomPicture = bottomPicture;
  }

  public VacancyVacancyConstructorTemplate id(BigDecimal id) {
    this.id = id;
    return this;
  }

  /**
   * ID шаблона
   * @return id
  */
  @Valid 
  @Schema(name = "id", description = "ID шаблона", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("id")
  public BigDecimal getId() {
    return id;
  }

  public void setId(BigDecimal id) {
    this.id = id;
  }

  public VacancyVacancyConstructorTemplate name(String name) {
    this.name = name;
    return this;
  }

  /**
   * Название шаблона
   * @return name
  */
  
  @Schema(name = "name", description = "Название шаблона", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("name")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public VacancyVacancyConstructorTemplate topPicture(VacancyPicture topPicture) {
    this.topPicture = topPicture;
    return this;
  }

  /**
   * Get topPicture
   * @return topPicture
  */
  @Valid 
  @Schema(name = "top_picture", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("top_picture")
  public VacancyPicture getTopPicture() {
    return topPicture;
  }

  public void setTopPicture(VacancyPicture topPicture) {
    this.topPicture = topPicture;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    VacancyVacancyConstructorTemplate vacancyVacancyConstructorTemplate = (VacancyVacancyConstructorTemplate) o;
    return Objects.equals(this.bottomPicture, vacancyVacancyConstructorTemplate.bottomPicture) &&
        Objects.equals(this.id, vacancyVacancyConstructorTemplate.id) &&
        Objects.equals(this.name, vacancyVacancyConstructorTemplate.name) &&
        Objects.equals(this.topPicture, vacancyVacancyConstructorTemplate.topPicture);
  }

  @Override
  public int hashCode() {
    return Objects.hash(bottomPicture, id, name, topPicture);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class VacancyVacancyConstructorTemplate {\n");
    sb.append("    bottomPicture: ").append(toIndentedString(bottomPicture)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    topPicture: ").append(toIndentedString(topPicture)).append("\n");
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

