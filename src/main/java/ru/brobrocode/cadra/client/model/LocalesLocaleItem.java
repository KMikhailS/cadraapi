package ru.brobrocode.cadra.client.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.annotation.Generated;
import jakarta.validation.constraints.NotNull;

import java.util.Objects;

/**
 * LocalesLocaleItem
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2025-08-17T15:41:09.394389505+05:00[Asia/Yekaterinburg]", comments = "Generator version: 7.6.0")
public class LocalesLocaleItem {

  private String id;

  private String name;

  private Boolean current;

  public LocalesLocaleItem() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public LocalesLocaleItem(String id, String name, Boolean current) {
    this.id = id;
    this.name = name;
    this.current = current;
  }

  public LocalesLocaleItem id(String id) {
    this.id = id;
    return this;
  }

  /**
   * Идентификатор локали
   * @return id
  */
  @NotNull 
  @Schema(name = "id", description = "Идентификатор локали", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("id")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public LocalesLocaleItem name(String name) {
    this.name = name;
    return this;
  }

  /**
   * Имя локали
   * @return name
  */
  @NotNull 
  @Schema(name = "name", description = "Имя локали", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("name")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public LocalesLocaleItem current(Boolean current) {
    this.current = current;
    return this;
  }

  /**
   * Для текущей локали `true` , `false` для остальных
   * @return current
  */
  @NotNull 
  @Schema(name = "current", description = "Для текущей локали `true` , `false` для остальных", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("current")
  public Boolean getCurrent() {
    return current;
  }

  public void setCurrent(Boolean current) {
    this.current = current;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LocalesLocaleItem localesLocaleItem = (LocalesLocaleItem) o;
    return Objects.equals(this.id, localesLocaleItem.id) &&
        Objects.equals(this.name, localesLocaleItem.name) &&
        Objects.equals(this.current, localesLocaleItem.current);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, current);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LocalesLocaleItem {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    current: ").append(toIndentedString(current)).append("\n");
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

