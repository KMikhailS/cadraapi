package ru.brobrocode.cadra.client.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.annotation.Generated;
import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * ResumesAccessTypes
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2025-08-17T15:41:09.394389505+05:00[Asia/Yekaterinburg]", comments = "Generator version: 7.6.0")
public class ResumesAccessTypes {

  @Valid
  private List<@Valid ResumesAutoHideTimeOptions> autoHideTimeOptions;

  @Valid
  private List<@Valid ResumesAccessTypesItem> items = new ArrayList<>();

  public ResumesAccessTypes() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public ResumesAccessTypes(List<@Valid ResumesAccessTypesItem> items) {
    this.items = items;
  }

  public ResumesAccessTypes autoHideTimeOptions(List<@Valid ResumesAutoHideTimeOptions> autoHideTimeOptions) {
    this.autoHideTimeOptions = autoHideTimeOptions;
    return this;
  }

  public ResumesAccessTypes addAutoHideTimeOptionsItem(ResumesAutoHideTimeOptions autoHideTimeOptionsItem) {
    if (this.autoHideTimeOptions == null) {
      this.autoHideTimeOptions = new ArrayList<>();
    }
    this.autoHideTimeOptions.add(autoHideTimeOptionsItem);
    return this;
  }

  /**
   * Варианты времени автоскрытия резюме при неактивности пользователя. Возвращается только для пользователей rabota.by
   * @return autoHideTimeOptions
  */
  @Valid 
  @Schema(name = "auto_hide_time_options", description = "Варианты времени автоскрытия резюме при неактивности пользователя. Возвращается только для пользователей rabota.by", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("auto_hide_time_options")
  public List<@Valid ResumesAutoHideTimeOptions> getAutoHideTimeOptions() {
    return autoHideTimeOptions;
  }

  public void setAutoHideTimeOptions(List<@Valid ResumesAutoHideTimeOptions> autoHideTimeOptions) {
    this.autoHideTimeOptions = autoHideTimeOptions;
  }

  public ResumesAccessTypes items(List<@Valid ResumesAccessTypesItem> items) {
    this.items = items;
    return this;
  }

  public ResumesAccessTypes addItemsItem(ResumesAccessTypesItem itemsItem) {
    if (this.items == null) {
      this.items = new ArrayList<>();
    }
    this.items.add(itemsItem);
    return this;
  }

  /**
   * Доступные типы видимости резюме
   * @return items
  */
  @NotNull @Valid 
  @Schema(name = "items", description = "Доступные типы видимости резюме", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("items")
  public List<@Valid ResumesAccessTypesItem> getItems() {
    return items;
  }

  public void setItems(List<@Valid ResumesAccessTypesItem> items) {
    this.items = items;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ResumesAccessTypes resumesAccessTypes = (ResumesAccessTypes) o;
    return Objects.equals(this.autoHideTimeOptions, resumesAccessTypes.autoHideTimeOptions) &&
        Objects.equals(this.items, resumesAccessTypes.items);
  }

  @Override
  public int hashCode() {
    return Objects.hash(autoHideTimeOptions, items);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ResumesAccessTypes {\n");
    sb.append("    autoHideTimeOptions: ").append(toIndentedString(autoHideTimeOptions)).append("\n");
    sb.append("    items: ").append(toIndentedString(items)).append("\n");
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

