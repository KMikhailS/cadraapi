package ru.brobrocode.cadra.client.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.annotation.Generated;

import java.util.Objects;

/**
 * Информация о менеджере, создавшем адрес
 */

@Schema(name = "EmployerAddressesEmployerAddressItem_manager", description = "Информация о менеджере, создавшем адрес")
@JsonTypeName("EmployerAddressesEmployerAddressItem_manager")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2025-08-17T15:41:09.394389505+05:00[Asia/Yekaterinburg]", comments = "Generator version: 7.6.0")
public class EmployerAddressesEmployerAddressItemManager {

  private String fullName;

  private String id;

  public EmployerAddressesEmployerAddressItemManager fullName(String fullName) {
    this.fullName = fullName;
    return this;
  }

  /**
   * Полное имя менеджера
   * @return fullName
  */
  
  @Schema(name = "full_name", description = "Полное имя менеджера", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("full_name")
  public String getFullName() {
    return fullName;
  }

  public void setFullName(String fullName) {
    this.fullName = fullName;
  }

  public EmployerAddressesEmployerAddressItemManager id(String id) {
    this.id = id;
    return this;
  }

  /**
   * Идентификатор менеджера
   * @return id
  */
  
  @Schema(name = "id", description = "Идентификатор менеджера", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("id")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EmployerAddressesEmployerAddressItemManager employerAddressesEmployerAddressItemManager = (EmployerAddressesEmployerAddressItemManager) o;
    return Objects.equals(this.fullName, employerAddressesEmployerAddressItemManager.fullName) &&
        Objects.equals(this.id, employerAddressesEmployerAddressItemManager.id);
  }

  @Override
  public int hashCode() {
    return Objects.hash(fullName, id);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EmployerAddressesEmployerAddressItemManager {\n");
    sb.append("    fullName: ").append(toIndentedString(fullName)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
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

