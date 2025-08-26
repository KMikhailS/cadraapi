package ru.brobrocode.cadra.client.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.annotation.Generated;
import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * Профобласть и специализации
 */

@Schema(name = "DictionariesSalaryStatisticsProfessionalAreasResponse_inner", description = "Профобласть и специализации")
@JsonTypeName("DictionariesSalaryStatisticsProfessionalAreasResponse_inner")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2025-08-17T15:41:09.394389505+05:00[Asia/Yekaterinburg]", comments = "Generator version: 7.6.0")
public class DictionariesSalaryStatisticsProfessionalAreasResponseInner {

  private String id;

  private String name;

  @Valid
  private List<@Valid IncludesIdNameDesc> specializations = new ArrayList<>();

  public DictionariesSalaryStatisticsProfessionalAreasResponseInner() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public DictionariesSalaryStatisticsProfessionalAreasResponseInner(String id, String name, List<@Valid IncludesIdNameDesc> specializations) {
    this.id = id;
    this.name = name;
    this.specializations = specializations;
  }

  public DictionariesSalaryStatisticsProfessionalAreasResponseInner id(String id) {
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

  public DictionariesSalaryStatisticsProfessionalAreasResponseInner name(String name) {
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

  public DictionariesSalaryStatisticsProfessionalAreasResponseInner specializations(List<@Valid IncludesIdNameDesc> specializations) {
    this.specializations = specializations;
    return this;
  }

  public DictionariesSalaryStatisticsProfessionalAreasResponseInner addSpecializationsItem(IncludesIdNameDesc specializationsItem) {
    if (this.specializations == null) {
      this.specializations = new ArrayList<>();
    }
    this.specializations.add(specializationsItem);
    return this;
  }

  /**
   * Get specializations
   * @return specializations
  */
  @NotNull @Valid 
  @Schema(name = "specializations", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("specializations")
  public List<@Valid IncludesIdNameDesc> getSpecializations() {
    return specializations;
  }

  public void setSpecializations(List<@Valid IncludesIdNameDesc> specializations) {
    this.specializations = specializations;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DictionariesSalaryStatisticsProfessionalAreasResponseInner dictionariesSalaryStatisticsProfessionalAreasResponseInner = (DictionariesSalaryStatisticsProfessionalAreasResponseInner) o;
    return Objects.equals(this.id, dictionariesSalaryStatisticsProfessionalAreasResponseInner.id) &&
        Objects.equals(this.name, dictionariesSalaryStatisticsProfessionalAreasResponseInner.name) &&
        Objects.equals(this.specializations, dictionariesSalaryStatisticsProfessionalAreasResponseInner.specializations);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, specializations);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DictionariesSalaryStatisticsProfessionalAreasResponseInner {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    specializations: ").append(toIndentedString(specializations)).append("\n");
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

