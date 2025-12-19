package ru.brobrocode.cadra.client.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.annotation.Generated;
import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;

import java.math.BigDecimal;
import java.util.Objects;

/**
 * ResumesCreationAvailability
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2025-08-17T15:41:09.394389505+05:00[Asia/Yekaterinburg]", comments = "Generator version: 7.6.0")
public class ResumesCreationAvailability {

  private BigDecimal created;

  private Boolean isCreationAvailable;

  private BigDecimal max;

  private BigDecimal remaining;

  public ResumesCreationAvailability() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public ResumesCreationAvailability(BigDecimal created, Boolean isCreationAvailable, BigDecimal max, BigDecimal remaining) {
    this.created = created;
    this.isCreationAvailable = isCreationAvailable;
    this.max = max;
    this.remaining = remaining;
  }

  public ResumesCreationAvailability created(BigDecimal created) {
    this.created = created;
    return this;
  }

  /**
   * Количество созданных резюме
   * @return created
  */
  @NotNull @Valid 
  @Schema(name = "created", description = "Количество созданных резюме", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("created")
  public BigDecimal getCreated() {
    return created;
  }

  public void setCreated(BigDecimal created) {
    this.created = created;
  }

  public ResumesCreationAvailability isCreationAvailable(Boolean isCreationAvailable) {
    this.isCreationAvailable = isCreationAvailable;
    return this;
  }

  /**
   * Доступно ли создание новых резюме для данного пользователя
   * @return isCreationAvailable
  */
  @NotNull 
  @Schema(name = "is_creation_available", description = "Доступно ли создание новых резюме для данного пользователя", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("is_creation_available")
  public Boolean getIsCreationAvailable() {
    return isCreationAvailable;
  }

  public void setIsCreationAvailable(Boolean isCreationAvailable) {
    this.isCreationAvailable = isCreationAvailable;
  }

  public ResumesCreationAvailability max(BigDecimal max) {
    this.max = max;
    return this;
  }

  /**
   * Максимально возможное количество резюме
   * @return max
  */
  @NotNull @Valid 
  @Schema(name = "max", description = "Максимально возможное количество резюме", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("max")
  public BigDecimal getMax() {
    return max;
  }

  public void setMax(BigDecimal max) {
    this.max = max;
  }

  public ResumesCreationAvailability remaining(BigDecimal remaining) {
    this.remaining = remaining;
    return this;
  }

  /**
   * Количество доступных для создания резюме
   * @return remaining
  */
  @NotNull @Valid 
  @Schema(name = "remaining", description = "Количество доступных для создания резюме", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("remaining")
  public BigDecimal getRemaining() {
    return remaining;
  }

  public void setRemaining(BigDecimal remaining) {
    this.remaining = remaining;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ResumesCreationAvailability resumesCreationAvailability = (ResumesCreationAvailability) o;
    return Objects.equals(this.created, resumesCreationAvailability.created) &&
        Objects.equals(this.isCreationAvailable, resumesCreationAvailability.isCreationAvailable) &&
        Objects.equals(this.max, resumesCreationAvailability.max) &&
        Objects.equals(this.remaining, resumesCreationAvailability.remaining);
  }

  @Override
  public int hashCode() {
    return Objects.hash(created, isCreationAvailable, max, remaining);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ResumesCreationAvailability {\n");
    sb.append("    created: ").append(toIndentedString(created)).append("\n");
    sb.append("    isCreationAvailable: ").append(toIndentedString(isCreationAvailable)).append("\n");
    sb.append("    max: ").append(toIndentedString(max)).append("\n");
    sb.append("    remaining: ").append(toIndentedString(remaining)).append("\n");
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

