package ru.brobrocode.cadra.client.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.annotation.Generated;
import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * Условия для поля &#x60;file&#x60;
 */

@Schema(name = "ArtifactsFields_file", description = "Условия для поля `file`")
@JsonTypeName("ArtifactsFields_file")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2025-08-17T15:41:09.394389505+05:00[Asia/Yekaterinburg]", comments = "Generator version: 7.6.0")
public class ArtifactsFieldsFile {

  private BigDecimal maxSize;

  @Valid
  private List<String> mimeType = new ArrayList<>();

  private Boolean required;

  public ArtifactsFieldsFile() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public ArtifactsFieldsFile(BigDecimal maxSize, List<String> mimeType, Boolean required) {
    this.maxSize = maxSize;
    this.mimeType = mimeType;
    this.required = required;
  }

  public ArtifactsFieldsFile maxSize(BigDecimal maxSize) {
    this.maxSize = maxSize;
    return this;
  }

  /**
   * Максимальный размер файла
   * @return maxSize
  */
  @NotNull @Valid 
  @Schema(name = "max_size", description = "Максимальный размер файла", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("max_size")
  public BigDecimal getMaxSize() {
    return maxSize;
  }

  public void setMaxSize(BigDecimal maxSize) {
    this.maxSize = maxSize;
  }

  public ArtifactsFieldsFile mimeType(List<String> mimeType) {
    this.mimeType = mimeType;
    return this;
  }

  public ArtifactsFieldsFile addMimeTypeItem(String mimeTypeItem) {
    if (this.mimeType == null) {
      this.mimeType = new ArrayList<>();
    }
    this.mimeType.add(mimeTypeItem);
    return this;
  }

  /**
   * Список допустимых [MIME-типов](https://www.iana.org/assignments/media-types/media-types.xhtml) файлов
   * @return mimeType
  */
  @NotNull 
  @Schema(name = "mime_type", description = "Список допустимых [MIME-типов](https://www.iana.org/assignments/media-types/media-types.xhtml) файлов", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("mime_type")
  public List<String> getMimeType() {
    return mimeType;
  }

  public void setMimeType(List<String> mimeType) {
    this.mimeType = mimeType;
  }

  public ArtifactsFieldsFile required(Boolean required) {
    this.required = required;
    return this;
  }

  /**
   * Является ли поле `file` обязательным
   * @return required
  */
  @NotNull 
  @Schema(name = "required", description = "Является ли поле `file` обязательным", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("required")
  public Boolean getRequired() {
    return required;
  }

  public void setRequired(Boolean required) {
    this.required = required;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ArtifactsFieldsFile artifactsFieldsFile = (ArtifactsFieldsFile) o;
    return Objects.equals(this.maxSize, artifactsFieldsFile.maxSize) &&
        Objects.equals(this.mimeType, artifactsFieldsFile.mimeType) &&
        Objects.equals(this.required, artifactsFieldsFile.required);
  }

  @Override
  public int hashCode() {
    return Objects.hash(maxSize, mimeType, required);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ArtifactsFieldsFile {\n");
    sb.append("    maxSize: ").append(toIndentedString(maxSize)).append("\n");
    sb.append("    mimeType: ").append(toIndentedString(mimeType)).append("\n");
    sb.append("    required: ").append(toIndentedString(required)).append("\n");
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

