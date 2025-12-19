package ru.brobrocode.cadra.client.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.annotation.Generated;
import jakarta.validation.Valid;

import java.net.URI;
import java.util.Objects;

/**
 * Объект с фотографиями менеджера
 */

@Schema(name = "MeEmployerProfilePersonalManager_photo_urls", description = "Объект с фотографиями менеджера")
@JsonTypeName("MeEmployerProfilePersonalManager_photo_urls")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2025-08-17T15:41:09.394389505+05:00[Asia/Yekaterinburg]", comments = "Generator version: 7.6.0")
public class MeEmployerProfilePersonalManagerPhotoUrls {

  private URI big = null;

  private URI small = null;

  public MeEmployerProfilePersonalManagerPhotoUrls big(URI big) {
    this.big = big;
    return this;
  }

  /**
   * URL большой фотографии менеджера
   * @return big
  */
  @Valid 
  @Schema(name = "big", example = "https://hhcdn.ru/file/big.jpg", description = "URL большой фотографии менеджера", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("big")
  public URI getBig() {
    return big;
  }

  public void setBig(URI big) {
    this.big = big;
  }

  public MeEmployerProfilePersonalManagerPhotoUrls small(URI small) {
    this.small = small;
    return this;
  }

  /**
   * URL маленькой фотографии менеджера
   * @return small
  */
  @Valid 
  @Schema(name = "small", example = "https://hhcdn.ru/file/small.jpg", description = "URL маленькой фотографии менеджера", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("small")
  public URI getSmall() {
    return small;
  }

  public void setSmall(URI small) {
    this.small = small;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MeEmployerProfilePersonalManagerPhotoUrls meEmployerProfilePersonalManagerPhotoUrls = (MeEmployerProfilePersonalManagerPhotoUrls) o;
    return Objects.equals(this.big, meEmployerProfilePersonalManagerPhotoUrls.big) &&
        Objects.equals(this.small, meEmployerProfilePersonalManagerPhotoUrls.small);
  }

  @Override
  public int hashCode() {
    return Objects.hash(big, small);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MeEmployerProfilePersonalManagerPhotoUrls {\n");
    sb.append("    big: ").append(toIndentedString(big)).append("\n");
    sb.append("    small: ").append(toIndentedString(small)).append("\n");
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

