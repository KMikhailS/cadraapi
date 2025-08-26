package ru.brobrocode.cadra.client.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.annotation.Generated;
import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;

import java.util.Objects;

/**
 * IncludesContact
 */

@JsonTypeName("_IncludesContact")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2025-08-17T15:41:09.394389505+05:00[Asia/Yekaterinburg]", comments = "Generator version: 7.6.0")
public class IncludesContact {

  private String comment = null;

  private String contactValue = null;

  private String kind;

  private IncludesContactPropertiesLinks links = null;

  private Boolean needVerification = null;

  private Boolean preferred;

  private IncludesIdName type;

//  @Deprecated
//  private IncludesContactPropertiesValue value;

  private Boolean verified = null;

  public IncludesContact() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public IncludesContact(String contactValue, String kind, Boolean preferred, IncludesIdName type) {
    this.contactValue = contactValue;
    this.kind = kind;
    this.preferred = preferred;
    this.type = type;
  }

  public IncludesContact comment(String comment) {
    this.comment = comment;
    return this;
  }

  /**
   * Комментарий к контакту
   * @return comment
  */
  
  @Schema(name = "comment", description = "Комментарий к контакту", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("comment")
  public String getComment() {
    return comment;
  }

  public void setComment(String comment) {
    this.comment = comment;
  }

  public IncludesContact contactValue(String contactValue) {
    this.contactValue = contactValue;
    return this;
  }

  /**
   * Значение контакта
   * @return contactValue
  */
  @NotNull 
  @Schema(name = "contact_value", description = "Значение контакта", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("contact_value")
  public String getContactValue() {
    return contactValue;
  }

  public void setContactValue(String contactValue) {
    this.contactValue = contactValue;
  }

  public IncludesContact kind(String kind) {
    this.kind = kind;
    return this;
  }

  /**
   * Тип контакта - Эл. почта, телефон, основной способ связи или дополнительный способ связи
   * @return kind
  */
  @NotNull 
  @Schema(name = "kind", description = "Тип контакта - Эл. почта, телефон, основной способ связи или дополнительный способ связи", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("kind")
  public String getKind() {
    return kind;
  }

  public void setKind(String kind) {
    this.kind = kind;
  }

  public IncludesContact links(IncludesContactPropertiesLinks links) {
    this.links = links;
    return this;
  }

  /**
   * Get links
   * @return links
  */
  @Valid 
  @Schema(name = "links", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("links")
  public IncludesContactPropertiesLinks getLinks() {
    return links;
  }

  public void setLinks(IncludesContactPropertiesLinks links) {
    this.links = links;
  }

  public IncludesContact needVerification(Boolean needVerification) {
    this.needVerification = needVerification;
    return this;
  }

  /**
   * Требуется ли подтверждение телефона
   * @return needVerification
  */
  
  @Schema(name = "need_verification", description = "Требуется ли подтверждение телефона", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("need_verification")
  public Boolean getNeedVerification() {
    return needVerification;
  }

  public void setNeedVerification(Boolean needVerification) {
    this.needVerification = needVerification;
  }

  public IncludesContact preferred(Boolean preferred) {
    this.preferred = preferred;
    return this;
  }

  /**
   * Является ли предпочтительным способом связи
   * @return preferred
  */
  @NotNull 
  @Schema(name = "preferred", description = "Является ли предпочтительным способом связи", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("preferred")
  public Boolean getPreferred() {
    return preferred;
  }

  public void setPreferred(Boolean preferred) {
    this.preferred = preferred;
  }

  public IncludesContact type(IncludesIdName type) {
    this.type = type;
    return this;
  }

  /**
   * Тип контакта
   * @return type
  */
  @NotNull @Valid 
  @Schema(name = "type", description = "Тип контакта", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("type")
  public IncludesIdName getType() {
    return type;
  }

  public void setType(IncludesIdName type) {
    this.type = type;
  }

//  public IncludesContact value(IncludesContactPropertiesValue value) {
//    this.value = value;
//    return this;
//  }

  /**
   * Get value
   * @return value
   * @deprecated
  */
//  @Valid
//  @Schema(name = "value", deprecated = true, requiredMode = Schema.RequiredMode.NOT_REQUIRED)
//  @JsonProperty("value")
//  @Deprecated
//  public IncludesContactPropertiesValue getValue() {
//    return value;
//  }

  /**
   * @deprecated
  */
//  @Deprecated
//  public void setValue(IncludesContactPropertiesValue value) {
//    this.value = value;
//  }

  public IncludesContact verified(Boolean verified) {
    this.verified = verified;
    return this;
  }

  /**
   * Является ли телефон подтвержденным
   * @return verified
  */
  
  @Schema(name = "verified", description = "Является ли телефон подтвержденным", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("verified")
  public Boolean getVerified() {
    return verified;
  }

  public void setVerified(Boolean verified) {
    this.verified = verified;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    IncludesContact includesContact = (IncludesContact) o;
    return Objects.equals(this.comment, includesContact.comment) &&
        Objects.equals(this.contactValue, includesContact.contactValue) &&
        Objects.equals(this.kind, includesContact.kind) &&
        Objects.equals(this.links, includesContact.links) &&
        Objects.equals(this.needVerification, includesContact.needVerification) &&
        Objects.equals(this.preferred, includesContact.preferred) &&
        Objects.equals(this.type, includesContact.type) &&
//        Objects.equals(this.value, includesContact.value) &&
        Objects.equals(this.verified, includesContact.verified);
  }

  @Override
  public int hashCode() {
    return Objects.hash(comment, contactValue, kind, links, needVerification, preferred, type, verified);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IncludesContact {\n");
    sb.append("    comment: ").append(toIndentedString(comment)).append("\n");
    sb.append("    contactValue: ").append(toIndentedString(contactValue)).append("\n");
    sb.append("    kind: ").append(toIndentedString(kind)).append("\n");
    sb.append("    links: ").append(toIndentedString(links)).append("\n");
    sb.append("    needVerification: ").append(toIndentedString(needVerification)).append("\n");
    sb.append("    preferred: ").append(toIndentedString(preferred)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
//    sb.append("    value: ").append(toIndentedString(value)).append("\n");
    sb.append("    verified: ").append(toIndentedString(verified)).append("\n");
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

