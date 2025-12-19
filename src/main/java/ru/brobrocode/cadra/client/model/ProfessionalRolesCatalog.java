package ru.brobrocode.cadra.client.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.annotation.Generated;
import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * Каталог профессиональных ролей и категорий
 */

@Schema(name = "ProfessionalRolesCatalog", description = "Каталог профессиональных ролей и категорий")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2025-08-17T15:41:09.394389505+05:00[Asia/Yekaterinburg]", comments = "Generator version: 7.6.0")
public class ProfessionalRolesCatalog {

  @Valid
  private List<@Valid ProfessionalRolesCategory> categories = new ArrayList<>();

  public ProfessionalRolesCatalog() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public ProfessionalRolesCatalog(List<@Valid ProfessionalRolesCategory> categories) {
    this.categories = categories;
  }

  public ProfessionalRolesCatalog categories(List<@Valid ProfessionalRolesCategory> categories) {
    this.categories = categories;
    return this;
  }

  public ProfessionalRolesCatalog addCategoriesItem(ProfessionalRolesCategory categoriesItem) {
    if (this.categories == null) {
      this.categories = new ArrayList<>();
    }
    this.categories.add(categoriesItem);
    return this;
  }

  /**
   * Информация о категории профессиональной роли
   * @return categories
  */
  @NotNull @Valid @Size(min = 1) 
  @Schema(name = "categories", description = "Информация о категории профессиональной роли", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("categories")
  public List<@Valid ProfessionalRolesCategory> getCategories() {
    return categories;
  }

  public void setCategories(List<@Valid ProfessionalRolesCategory> categories) {
    this.categories = categories;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ProfessionalRolesCatalog professionalRolesCatalog = (ProfessionalRolesCatalog) o;
    return Objects.equals(this.categories, professionalRolesCatalog.categories);
  }

  @Override
  public int hashCode() {
    return Objects.hash(categories);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ProfessionalRolesCatalog {\n");
    sb.append("    categories: ").append(toIndentedString(categories)).append("\n");
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

