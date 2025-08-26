package ru.brobrocode.cadra.client.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.annotation.Generated;
import jakarta.validation.Valid;

import java.util.Objects;

/**
 * IncludesContactProperties
 */

@JsonTypeName("_IncludesContactProperties")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2025-08-17T15:41:09.394389505+05:00[Asia/Yekaterinburg]", comments = "Generator version: 7.6.0")
public class IncludesContactProperties {

  private String comment = null;

  private String contactValue = null;

  private String kind;

  private IncludesContactPropertiesLinks links = null;

  private Boolean needVerification = null;

  private Boolean preferred;

  private IncludesIdName type;

  @Deprecated
  private IncludesContactPropertiesValue value;

  private Boolean verified = null;

  public IncludesContactProperties comment(String comment) {
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

  public IncludesContactProperties contactValue(String contactValue) {
    this.contactValue = contactValue;
    return this;
  }

  /**
   * Значение контакта
   * @return contactValue
  */
  
  @Schema(name = "contact_value", description = "Значение контакта", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("contact_value")
  public String getContactValue() {
    return contactValue;
  }

  public void setContactValue(String contactValue) {
    this.contactValue = contactValue;
  }

  public IncludesContactProperties kind(String kind) {
    this.kind = kind;
    return this;
  }

  /**
   * Тип контакта - Эл. почта, телефон, основной способ связи или дополнительный способ связи
   * @return kind
  */
  
  @Schema(name = "kind", description = "Тип контакта - Эл. почта, телефон, основной способ связи или дополнительный способ связи", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("kind")
  public String getKind() {
    return kind;
  }

  public void setKind(String kind) {
    this.kind = kind;
  }

  public IncludesContactProperties links(IncludesContactPropertiesLinks links) {
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

  public IncludesContactProperties needVerification(Boolean needVerification) {
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

  public IncludesContactProperties preferred(Boolean preferred) {
    this.preferred = preferred;
    return this;
  }

  /**
   * Является ли предпочтительным способом связи
   * @return preferred
  */
  
  @Schema(name = "preferred", description = "Является ли предпочтительным способом связи", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("preferred")
  public Boolean getPreferred() {
    return preferred;
  }

  public void setPreferred(Boolean preferred) {
    this.preferred = preferred;
  }

  public IncludesContactProperties type(IncludesIdName type) {
    this.type = type;
    return this;
  }

  /**
   * Тип контакта
   * @return type
  */
  @Valid 
  @Schema(name = "type", description = "Тип контакта", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("type")
  public IncludesIdName getType() {
    return type;
  }

  public void setType(IncludesIdName type) {
    this.type = type;
  }

  public IncludesContactProperties value(IncludesContactPropertiesValue value) {
    this.value = value;
    return this;
  }

  /**
   * Get value
   * @return value
   * @deprecated
  */
  @Valid 
  @Schema(name = "value", deprecated = true, requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("value")
  @Deprecated
  public IncludesContactPropertiesValue getValue() {
    return value;
  }

  /**
   * @deprecated
  */
  @Deprecated
  public void setValue(IncludesContactPropertiesValue value) {
    this.value = value;
  }

  public IncludesContactProperties verified(Boolean verified) {
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
    IncludesContactProperties includesContactProperties = (IncludesContactProperties) o;
    return Objects.equals(this.comment, includesContactProperties.comment) &&
        Objects.equals(this.contactValue, includesContactProperties.contactValue) &&
        Objects.equals(this.kind, includesContactProperties.kind) &&
        Objects.equals(this.links, includesContactProperties.links) &&
        Objects.equals(this.needVerification, includesContactProperties.needVerification) &&
        Objects.equals(this.preferred, includesContactProperties.preferred) &&
        Objects.equals(this.type, includesContactProperties.type) &&
        Objects.equals(this.value, includesContactProperties.value) &&
        Objects.equals(this.verified, includesContactProperties.verified);
  }

  @Override
  public int hashCode() {
    return Objects.hash(comment, contactValue, kind, links, needVerification, preferred, type, value, verified);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IncludesContactProperties {\n");
    sb.append("    comment: ").append(toIndentedString(comment)).append("\n");
    sb.append("    contactValue: ").append(toIndentedString(contactValue)).append("\n");
    sb.append("    kind: ").append(toIndentedString(kind)).append("\n");
    sb.append("    links: ").append(toIndentedString(links)).append("\n");
    sb.append("    needVerification: ").append(toIndentedString(needVerification)).append("\n");
    sb.append("    preferred: ").append(toIndentedString(preferred)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    value: ").append(toIndentedString(value)).append("\n");
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

