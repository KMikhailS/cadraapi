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
 * Роль
 */

@Schema(name = "ResumeProfileResumeProfileDictionaryTitles_items_inner", description = "Роль")
@JsonTypeName("ResumeProfileResumeProfileDictionaryTitles_items_inner")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2025-08-17T15:41:09.394389505+05:00[Asia/Yekaterinburg]", comments = "Generator version: 7.6.0")
public class ResumeProfileResumeProfileDictionaryTitlesItemsInner {

  private String name;

  @Valid
  private List<String> roleIds;

  public ResumeProfileResumeProfileDictionaryTitlesItemsInner() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public ResumeProfileResumeProfileDictionaryTitlesItemsInner(String name) {
    this.name = name;
  }

  public ResumeProfileResumeProfileDictionaryTitlesItemsInner name(String name) {
    this.name = name;
    return this;
  }

  /**
   * Название роли
   * @return name
  */
  @NotNull 
  @Schema(name = "name", description = "Название роли", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("name")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public ResumeProfileResumeProfileDictionaryTitlesItemsInner roleIds(List<String> roleIds) {
    this.roleIds = roleIds;
    return this;
  }

  public ResumeProfileResumeProfileDictionaryTitlesItemsInner addRoleIdsItem(String roleIdsItem) {
    if (this.roleIds == null) {
      this.roleIds = new ArrayList<>();
    }
    this.roleIds.add(roleIdsItem);
    return this;
  }

  /**
   * Список id роли
   * @return roleIds
  */
  
  @Schema(name = "role_ids", description = "Список id роли", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("role_ids")
  public List<String> getRoleIds() {
    return roleIds;
  }

  public void setRoleIds(List<String> roleIds) {
    this.roleIds = roleIds;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ResumeProfileResumeProfileDictionaryTitlesItemsInner resumeProfileResumeProfileDictionaryTitlesItemsInner = (ResumeProfileResumeProfileDictionaryTitlesItemsInner) o;
    return Objects.equals(this.name, resumeProfileResumeProfileDictionaryTitlesItemsInner.name) &&
        Objects.equals(this.roleIds, resumeProfileResumeProfileDictionaryTitlesItemsInner.roleIds);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, roleIds);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ResumeProfileResumeProfileDictionaryTitlesItemsInner {\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    roleIds: ").append(toIndentedString(roleIds)).append("\n");
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

