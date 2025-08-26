package ru.brobrocode.cadra.client.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.annotation.Generated;
import jakarta.validation.Valid;

import java.math.BigDecimal;
import java.util.Objects;

/**
 * ResumePhoneGenerateCodeGenerateCode
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2025-08-17T15:41:09.394389505+05:00[Asia/Yekaterinburg]", comments = "Generator version: 7.6.0")
public class ResumePhoneGenerateCodeGenerateCode {

  private BigDecimal canRequestCodeAgainIn;

  private BigDecimal codeLength;

  private String notificationType;

  public ResumePhoneGenerateCodeGenerateCode canRequestCodeAgainIn(BigDecimal canRequestCodeAgainIn) {
    this.canRequestCodeAgainIn = canRequestCodeAgainIn;
    return this;
  }

  /**
   * Ближайшая возможная повторная отправка кода в секундах
   * @return canRequestCodeAgainIn
  */
  @Valid 
  @Schema(name = "can_request_code_again_in", example = "15", description = "Ближайшая возможная повторная отправка кода в секундах", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("can_request_code_again_in")
  public BigDecimal getCanRequestCodeAgainIn() {
    return canRequestCodeAgainIn;
  }

  public void setCanRequestCodeAgainIn(BigDecimal canRequestCodeAgainIn) {
    this.canRequestCodeAgainIn = canRequestCodeAgainIn;
  }

  public ResumePhoneGenerateCodeGenerateCode codeLength(BigDecimal codeLength) {
    this.codeLength = codeLength;
    return this;
  }

  /**
   * Длина одноразового кода
   * @return codeLength
  */
  @Valid 
  @Schema(name = "code_length", example = "4", description = "Длина одноразового кода", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("code_length")
  public BigDecimal getCodeLength() {
    return codeLength;
  }

  public void setCodeLength(BigDecimal codeLength) {
    this.codeLength = codeLength;
  }

  public ResumePhoneGenerateCodeGenerateCode notificationType(String notificationType) {
    this.notificationType = notificationType;
    return this;
  }

  /**
   * Тип сгенерированного сообщения
   * @return notificationType
  */
  
  @Schema(name = "notification_type", example = "sms", description = "Тип сгенерированного сообщения", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("notification_type")
  public String getNotificationType() {
    return notificationType;
  }

  public void setNotificationType(String notificationType) {
    this.notificationType = notificationType;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ResumePhoneGenerateCodeGenerateCode resumePhoneGenerateCodeGenerateCode = (ResumePhoneGenerateCodeGenerateCode) o;
    return Objects.equals(this.canRequestCodeAgainIn, resumePhoneGenerateCodeGenerateCode.canRequestCodeAgainIn) &&
        Objects.equals(this.codeLength, resumePhoneGenerateCodeGenerateCode.codeLength) &&
        Objects.equals(this.notificationType, resumePhoneGenerateCodeGenerateCode.notificationType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(canRequestCodeAgainIn, codeLength, notificationType);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ResumePhoneGenerateCodeGenerateCode {\n");
    sb.append("    canRequestCodeAgainIn: ").append(toIndentedString(canRequestCodeAgainIn)).append("\n");
    sb.append("    codeLength: ").append(toIndentedString(codeLength)).append("\n");
    sb.append("    notificationType: ").append(toIndentedString(notificationType)).append("\n");
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

