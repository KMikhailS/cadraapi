package ru.brobrocode.cadra.client.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.annotation.Generated;
import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;

import java.util.Objects;

/**
 * ResumeShouldSendSmsContainer
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2025-08-17T15:41:09.394389505+05:00[Asia/Yekaterinburg]", comments = "Generator version: 7.6.0")
public class ResumeShouldSendSmsContainer {

  private ResumeShouldSendSmsPhone phone;

  public ResumeShouldSendSmsContainer() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public ResumeShouldSendSmsContainer(ResumeShouldSendSmsPhone phone) {
    this.phone = phone;
  }

  public ResumeShouldSendSmsContainer phone(ResumeShouldSendSmsPhone phone) {
    this.phone = phone;
    return this;
  }

  /**
   * Get phone
   * @return phone
  */
  @NotNull @Valid 
  @Schema(name = "phone", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("phone")
  public ResumeShouldSendSmsPhone getPhone() {
    return phone;
  }

  public void setPhone(ResumeShouldSendSmsPhone phone) {
    this.phone = phone;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ResumeShouldSendSmsContainer resumeShouldSendSmsContainer = (ResumeShouldSendSmsContainer) o;
    return Objects.equals(this.phone, resumeShouldSendSmsContainer.phone);
  }

  @Override
  public int hashCode() {
    return Objects.hash(phone);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ResumeShouldSendSmsContainer {\n");
    sb.append("    phone: ").append(toIndentedString(phone)).append("\n");
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

