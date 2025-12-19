package ru.brobrocode.cadra.client.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.annotation.Generated;
import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;

import java.util.Objects;

/**
 * NegotiationsNegotiationMessageTemplates
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2025-08-17T15:41:09.394389505+05:00[Asia/Yekaterinburg]", comments = "Generator version: 7.6.0")
public class NegotiationsNegotiationMessageTemplates {

  private NegotiationsNegotiationMessageTemplate mail;

  private NegotiationsNegotiationMessageTemplate sms;

  public NegotiationsNegotiationMessageTemplates() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public NegotiationsNegotiationMessageTemplates(NegotiationsNegotiationMessageTemplate mail) {
    this.mail = mail;
  }

  public NegotiationsNegotiationMessageTemplates mail(NegotiationsNegotiationMessageTemplate mail) {
    this.mail = mail;
    return this;
  }

  /**
   * Get mail
   * @return mail
  */
  @NotNull @Valid 
  @Schema(name = "mail", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("mail")
  public NegotiationsNegotiationMessageTemplate getMail() {
    return mail;
  }

  public void setMail(NegotiationsNegotiationMessageTemplate mail) {
    this.mail = mail;
  }

  public NegotiationsNegotiationMessageTemplates sms(NegotiationsNegotiationMessageTemplate sms) {
    this.sms = sms;
    return this;
  }

  /**
   * Get sms
   * @return sms
  */
  @Valid 
  @Schema(name = "sms", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("sms")
  public NegotiationsNegotiationMessageTemplate getSms() {
    return sms;
  }

  public void setSms(NegotiationsNegotiationMessageTemplate sms) {
    this.sms = sms;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    NegotiationsNegotiationMessageTemplates negotiationsNegotiationMessageTemplates = (NegotiationsNegotiationMessageTemplates) o;
    return Objects.equals(this.mail, negotiationsNegotiationMessageTemplates.mail) &&
        Objects.equals(this.sms, negotiationsNegotiationMessageTemplates.sms);
  }

  @Override
  public int hashCode() {
    return Objects.hash(mail, sms);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class NegotiationsNegotiationMessageTemplates {\n");
    sb.append("    mail: ").append(toIndentedString(mail)).append("\n");
    sb.append("    sms: ").append(toIndentedString(sms)).append("\n");
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

