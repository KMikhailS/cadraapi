package ru.brobrocode.cadra.client.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.annotation.Generated;

import java.util.Objects;

/**
 * Ссылки для открытия методов коммуникации по платформам
 */

@Schema(name = "_IncludesContactProperties_links", description = "Ссылки для открытия методов коммуникации по платформам")
@JsonTypeName("_IncludesContactProperties_links")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2025-08-17T15:41:09.394389505+05:00[Asia/Yekaterinburg]", comments = "Generator version: 7.6.0")
public class IncludesContactPropertiesLinks {

  private String android;

  private String ios;

  private String web;

  public IncludesContactPropertiesLinks android(String android) {
    this.android = android;
    return this;
  }

  /**
   * Get android
   * @return android
  */
  
  @Schema(name = "android", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("android")
  public String getAndroid() {
    return android;
  }

  public void setAndroid(String android) {
    this.android = android;
  }

  public IncludesContactPropertiesLinks ios(String ios) {
    this.ios = ios;
    return this;
  }

  /**
   * Get ios
   * @return ios
  */
  
  @Schema(name = "ios", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("ios")
  public String getIos() {
    return ios;
  }

  public void setIos(String ios) {
    this.ios = ios;
  }

  public IncludesContactPropertiesLinks web(String web) {
    this.web = web;
    return this;
  }

  /**
   * Get web
   * @return web
  */
  
  @Schema(name = "web", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("web")
  public String getWeb() {
    return web;
  }

  public void setWeb(String web) {
    this.web = web;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    IncludesContactPropertiesLinks includesContactPropertiesLinks = (IncludesContactPropertiesLinks) o;
    return Objects.equals(this.android, includesContactPropertiesLinks.android) &&
        Objects.equals(this.ios, includesContactPropertiesLinks.ios) &&
        Objects.equals(this.web, includesContactPropertiesLinks.web);
  }

  @Override
  public int hashCode() {
    return Objects.hash(android, ios, web);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IncludesContactPropertiesLinks {\n");
    sb.append("    android: ").append(toIndentedString(android)).append("\n");
    sb.append("    ios: ").append(toIndentedString(ios)).append("\n");
    sb.append("    web: ").append(toIndentedString(web)).append("\n");
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

