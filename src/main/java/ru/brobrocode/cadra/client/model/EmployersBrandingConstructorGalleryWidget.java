package ru.brobrocode.cadra.client.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.annotation.Generated;
import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * Виджет галереи
 */

@Schema(name = "EmployersBrandingConstructorGalleryWidget", description = "Виджет галереи")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2025-08-17T15:41:09.394389505+05:00[Asia/Yekaterinburg]", comments = "Generator version: 7.6.0")
public class EmployersBrandingConstructorGalleryWidget implements EmployersBrandingConstructorConstructorWidgetsInner {

  @Valid
  private List<@Valid EmployersBrandingConstructorGalleryWidgetItemsInner> items = new ArrayList<>();

  /**
   * Для галереи это значение равно 'gallery'
   */
  public enum TypeEnum {
    GALLERY("gallery");

    private String value;

    TypeEnum(String value) {
      this.value = value;
    }

    @JsonValue
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static TypeEnum fromValue(String value) {
      for (TypeEnum b : TypeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  private TypeEnum type;

  public EmployersBrandingConstructorGalleryWidget() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public EmployersBrandingConstructorGalleryWidget(List<@Valid EmployersBrandingConstructorGalleryWidgetItemsInner> items, TypeEnum type) {
    this.items = items;
    this.type = type;
  }

  public EmployersBrandingConstructorGalleryWidget items(List<@Valid EmployersBrandingConstructorGalleryWidgetItemsInner> items) {
    this.items = items;
    return this;
  }

  public EmployersBrandingConstructorGalleryWidget addItemsItem(EmployersBrandingConstructorGalleryWidgetItemsInner itemsItem) {
    if (this.items == null) {
      this.items = new ArrayList<>();
    }
    this.items.add(itemsItem);
    return this;
  }

  /**
   * Список изображений в галерее
   * @return items
  */
  @NotNull @Valid 
  @Schema(name = "items", description = "Список изображений в галерее", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("items")
  public List<@Valid EmployersBrandingConstructorGalleryWidgetItemsInner> getItems() {
    return items;
  }

  public void setItems(List<@Valid EmployersBrandingConstructorGalleryWidgetItemsInner> items) {
    this.items = items;
  }

  public EmployersBrandingConstructorGalleryWidget type(TypeEnum type) {
    this.type = type;
    return this;
  }

  /**
   * Для галереи это значение равно 'gallery'
   * @return type
  */
  @NotNull 
  @Schema(name = "type", description = "Для галереи это значение равно 'gallery'", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("type")
  public TypeEnum getType() {
    return type;
  }

  public void setType(TypeEnum type) {
    this.type = type;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EmployersBrandingConstructorGalleryWidget employersBrandingConstructorGalleryWidget = (EmployersBrandingConstructorGalleryWidget) o;
    return Objects.equals(this.items, employersBrandingConstructorGalleryWidget.items) &&
        Objects.equals(this.type, employersBrandingConstructorGalleryWidget.type);
  }

  @Override
  public int hashCode() {
    return Objects.hash(items, type);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EmployersBrandingConstructorGalleryWidget {\n");
    sb.append("    items: ").append(toIndentedString(items)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
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

