package ru.brobrocode.cadra.client.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.annotation.Generated;
import jakarta.validation.Valid;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 * Изображение под разные темы для разных размеров (пресеты)
 */

@Schema(name = "SkillVerificationsImage", description = "Изображение под разные темы для разных размеров (пресеты)")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2025-08-17T15:41:09.394389505+05:00[Asia/Yekaterinburg]", comments = "Generator version: 7.6.0")
public class SkillVerificationsImage {

  @Valid
  private Map<String, String> dark = new HashMap<>();

  @Valid
  private Map<String, String> defaults = new HashMap<>();

  @Valid
  private Map<String, String> light = new HashMap<>();

  public SkillVerificationsImage dark(Map<String, String> dark) {
    this.dark = dark;
    return this;
  }

  public SkillVerificationsImage putDarkItem(String key, String darkItem) {
    if (this.dark == null) {
      this.dark = new HashMap<>();
    }
    this.dark.put(key, darkItem);
    return this;
  }

  /**
   * Ссылки на изображения разных масштабов для темы
   * @return dark
  */
  
  @Schema(name = "dark", description = "Ссылки на изображения разных масштабов для темы", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("dark")
  public Map<String, String> getDark() {
    return dark;
  }

  public void setDark(Map<String, String> dark) {
    this.dark = dark;
  }

  public SkillVerificationsImage defaults(Map<String, String> defaults) {
    this.defaults = defaults;
    return this;
  }

  public SkillVerificationsImage putDefaultsItem(String key, String defaultsItem) {
    if (this.defaults == null) {
      this.defaults = new HashMap<>();
    }
    this.defaults.put(key, defaultsItem);
    return this;
  }

  /**
   * Ссылки на изображения разных масштабов для темы
   * @return defaults
  */
  
  @Schema(name = "defaults", description = "Ссылки на изображения разных масштабов для темы", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("defaults")
  public Map<String, String> getDefaults() {
    return defaults;
  }

  public void setDefaults(Map<String, String> defaults) {
    this.defaults = defaults;
  }

  public SkillVerificationsImage light(Map<String, String> light) {
    this.light = light;
    return this;
  }

  public SkillVerificationsImage putLightItem(String key, String lightItem) {
    if (this.light == null) {
      this.light = new HashMap<>();
    }
    this.light.put(key, lightItem);
    return this;
  }

  /**
   * Ссылки на изображения разных масштабов для темы
   * @return light
  */
  
  @Schema(name = "light", description = "Ссылки на изображения разных масштабов для темы", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("light")
  public Map<String, String> getLight() {
    return light;
  }

  public void setLight(Map<String, String> light) {
    this.light = light;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SkillVerificationsImage skillVerificationsImage = (SkillVerificationsImage) o;
    return Objects.equals(this.dark, skillVerificationsImage.dark) &&
        Objects.equals(this.defaults, skillVerificationsImage.defaults) &&
        Objects.equals(this.light, skillVerificationsImage.light);
  }

  @Override
  public int hashCode() {
    return Objects.hash(dark, defaults, light);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SkillVerificationsImage {\n");
    sb.append("    dark: ").append(toIndentedString(dark)).append("\n");
    sb.append("    defaults: ").append(toIndentedString(defaults)).append("\n");
    sb.append("    light: ").append(toIndentedString(light)).append("\n");
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

