package ru.brobrocode.cadra.client.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.annotation.Generated;
import jakarta.validation.constraints.NotNull;

import java.util.Objects;

/**
 * ResumeObjectsPaidServices
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2025-08-17T15:41:09.394389505+05:00[Asia/Yekaterinburg]", comments = "Generator version: 7.6.0")
public class ResumeObjectsPaidServices {

  private Boolean active;

  private String expires;

  private String id;

  private String name;

  public ResumeObjectsPaidServices() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public ResumeObjectsPaidServices(String id, String name) {
    this.id = id;
    this.name = name;
  }

  public ResumeObjectsPaidServices active(Boolean active) {
    this.active = active;
    return this;
  }

  /**
   * Активна ли в данный момент услуга
   * @return active
  */
  
  @Schema(name = "active", description = "Активна ли в данный момент услуга", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("active")
  public Boolean getActive() {
    return active;
  }

  public void setActive(Boolean active) {
    this.active = active;
  }

  public ResumeObjectsPaidServices expires(String expires) {
    this.expires = expires;
    return this;
  }

  /**
   * Время окончания действия услуги, если услуга активна
   * @return expires
  */
  
  @Schema(name = "expires", description = "Время окончания действия услуги, если услуга активна", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("expires")
  public String getExpires() {
    return expires;
  }

  public void setExpires(String expires) {
    this.expires = expires;
  }

  public ResumeObjectsPaidServices id(String id) {
    this.id = id;
    return this;
  }

  /**
   * Идентификатор услуги
   * @return id
  */
  @NotNull 
  @Schema(name = "id", description = "Идентификатор услуги", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("id")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public ResumeObjectsPaidServices name(String name) {
    this.name = name;
    return this;
  }

  /**
   * Название услуги
   * @return name
  */
  @NotNull 
  @Schema(name = "name", description = "Название услуги", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("name")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ResumeObjectsPaidServices resumeObjectsPaidServices = (ResumeObjectsPaidServices) o;
    return Objects.equals(this.active, resumeObjectsPaidServices.active) &&
        Objects.equals(this.expires, resumeObjectsPaidServices.expires) &&
        Objects.equals(this.id, resumeObjectsPaidServices.id) &&
        Objects.equals(this.name, resumeObjectsPaidServices.name);
  }

  @Override
  public int hashCode() {
    return Objects.hash(active, expires, id, name);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ResumeObjectsPaidServices {\n");
    sb.append("    active: ").append(toIndentedString(active)).append("\n");
    sb.append("    expires: ").append(toIndentedString(expires)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
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

