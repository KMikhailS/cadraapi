package ru.brobrocode.cadra.client.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.annotation.Generated;

import java.util.Objects;

/**
 * ResumeObjectsWorkFormatWorkFormatItemResponse
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2025-08-17T15:41:09.394389505+05:00[Asia/Yekaterinburg]", comments = "Generator version: 7.6.0")
public class ResumeObjectsWorkFormatWorkFormatItemResponse {

  private String id;

  private String name;

  public ResumeObjectsWorkFormatWorkFormatItemResponse id(String id) {
    this.id = id;
    return this;
  }

  /**
   * Элементы из [справочника resume_work_format](#tag/Obshie-spravochniki/operation/get-dictionaries)
   * @return id
  */
  
  @Schema(name = "id", description = "Элементы из [справочника resume_work_format](#tag/Obshie-spravochniki/operation/get-dictionaries)", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("id")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public ResumeObjectsWorkFormatWorkFormatItemResponse name(String name) {
    this.name = name;
    return this;
  }

  /**
   * Название формата работы
   * @return name
  */
  
  @Schema(name = "name", description = "Название формата работы", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
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
    ResumeObjectsWorkFormatWorkFormatItemResponse resumeObjectsWorkFormatWorkFormatItemResponse = (ResumeObjectsWorkFormatWorkFormatItemResponse) o;
    return Objects.equals(this.id, resumeObjectsWorkFormatWorkFormatItemResponse.id) &&
        Objects.equals(this.name, resumeObjectsWorkFormatWorkFormatItemResponse.name);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ResumeObjectsWorkFormatWorkFormatItemResponse {\n");
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

