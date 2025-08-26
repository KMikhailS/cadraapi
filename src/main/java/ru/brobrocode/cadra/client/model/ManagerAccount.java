package ru.brobrocode.cadra.client.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.annotation.Generated;
import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;

import java.util.Objects;

/**
 * Информация о рабочем аккаунте менеджера
 */

@Schema(name = "ManagerAccount", description = "Информация о рабочем аккаунте менеджера")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2025-08-17T15:41:09.394389505+05:00[Asia/Yekaterinburg]", comments = "Generator version: 7.6.0")
public class ManagerAccount {

  private ManagerAccountCompany employer;

  private String id;

  public ManagerAccount() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public ManagerAccount(ManagerAccountCompany employer, String id) {
    this.employer = employer;
    this.id = id;
  }

  public ManagerAccount employer(ManagerAccountCompany employer) {
    this.employer = employer;
    return this;
  }

  /**
   * Get employer
   * @return employer
  */
  @NotNull @Valid 
  @Schema(name = "employer", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("employer")
  public ManagerAccountCompany getEmployer() {
    return employer;
  }

  public void setEmployer(ManagerAccountCompany employer) {
    this.employer = employer;
  }

  public ManagerAccount id(String id) {
    this.id = id;
    return this;
  }

  /**
   * Идентификатор рабочего аккаунта менеджера
   * @return id
  */
  @NotNull 
  @Schema(name = "id", example = "12345678", description = "Идентификатор рабочего аккаунта менеджера", requiredMode = Schema.RequiredMode.REQUIRED)
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
    ManagerAccount managerAccount = (ManagerAccount) o;
    return Objects.equals(this.employer, managerAccount.employer) &&
        Objects.equals(this.id, managerAccount.id);
  }

  @Override
  public int hashCode() {
    return Objects.hash(employer, id);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ManagerAccount {\n");
    sb.append("    employer: ").append(toIndentedString(employer)).append("\n");
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

