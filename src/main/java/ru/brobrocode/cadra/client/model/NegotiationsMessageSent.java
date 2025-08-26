package ru.brobrocode.cadra.client.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.annotation.Generated;
import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;

import java.util.Objects;

/**
 * NegotiationsMessageSent
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2025-08-17T15:41:09.394389505+05:00[Asia/Yekaterinburg]", comments = "Generator version: 7.6.0")
public class NegotiationsMessageSent {

  private NegotiationsAuthor author;

  private String createdAt;

  private Boolean editable;

  private String id;

  private Boolean read;

  private IncludesIdName state;

  private String text = null;

  private Boolean viewedByMe;

  private Boolean viewedByOpponent;

  private VacancyAddressOutput address = null;

  public NegotiationsMessageSent() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public NegotiationsMessageSent(NegotiationsAuthor author, String createdAt, Boolean editable, String id, IncludesIdName state, String text, Boolean viewedByMe, Boolean viewedByOpponent, VacancyAddressOutput address) {
    this.author = author;
    this.createdAt = createdAt;
    this.editable = editable;
    this.id = id;
    this.state = state;
    this.text = text;
    this.viewedByMe = viewedByMe;
    this.viewedByOpponent = viewedByOpponent;
    this.address = address;
  }

  public NegotiationsMessageSent author(NegotiationsAuthor author) {
    this.author = author;
    return this;
  }

  /**
   * Get author
   * @return author
  */
  @NotNull @Valid 
  @Schema(name = "author", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("author")
  public NegotiationsAuthor getAuthor() {
    return author;
  }

  public void setAuthor(NegotiationsAuthor author) {
    this.author = author;
  }

  public NegotiationsMessageSent createdAt(String createdAt) {
    this.createdAt = createdAt;
    return this;
  }

  /**
   * Дата и время создания сообщения
   * @return createdAt
  */
  @NotNull 
  @Schema(name = "created_at", description = "Дата и время создания сообщения", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("created_at")
  public String getCreatedAt() {
    return createdAt;
  }

  public void setCreatedAt(String createdAt) {
    this.createdAt = createdAt;
  }

  public NegotiationsMessageSent editable(Boolean editable) {
    this.editable = editable;
    return this;
  }

  /**
   * Можно ли редактировать текст сообщения
   * @return editable
  */
  @NotNull 
  @Schema(name = "editable", description = "Можно ли редактировать текст сообщения", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("editable")
  public Boolean getEditable() {
    return editable;
  }

  public void setEditable(Boolean editable) {
    this.editable = editable;
  }

  public NegotiationsMessageSent id(String id) {
    this.id = id;
    return this;
  }

  /**
   * Идентификатор сообщения
   * @return id
  */
  @NotNull 
  @Schema(name = "id", description = "Идентификатор сообщения", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("id")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public NegotiationsMessageSent read(Boolean read) {
    this.read = read;
    return this;
  }

  /**
   * Можно ли прочитать сообщение
   * @return read
  */
  
  @Schema(name = "read", description = "Можно ли прочитать сообщение", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("read")
  public Boolean getRead() {
    return read;
  }

  public void setRead(Boolean read) {
    this.read = read;
  }

  public NegotiationsMessageSent state(IncludesIdName state) {
    this.state = state;
    return this;
  }

  /**
   * Состояние сообщения
   * @return state
  */
  @NotNull @Valid 
  @Schema(name = "state", description = "Состояние сообщения", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("state")
  public IncludesIdName getState() {
    return state;
  }

  public void setState(IncludesIdName state) {
    this.state = state;
  }

  public NegotiationsMessageSent text(String text) {
    this.text = text;
    return this;
  }

  /**
   * Текст сообщения
   * @return text
  */
  @NotNull 
  @Schema(name = "text", description = "Текст сообщения", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("text")
  public String getText() {
    return text;
  }

  public void setText(String text) {
    this.text = text;
  }

  public NegotiationsMessageSent viewedByMe(Boolean viewedByMe) {
    this.viewedByMe = viewedByMe;
    return this;
  }

  /**
   * Прочитано ли сообщение смотрящим (для сообщений отправленных соискателем - всегда true)
   * @return viewedByMe
  */
  @NotNull 
  @Schema(name = "viewed_by_me", description = "Прочитано ли сообщение смотрящим (для сообщений отправленных соискателем - всегда true)", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("viewed_by_me")
  public Boolean getViewedByMe() {
    return viewedByMe;
  }

  public void setViewedByMe(Boolean viewedByMe) {
    this.viewedByMe = viewedByMe;
  }

  public NegotiationsMessageSent viewedByOpponent(Boolean viewedByOpponent) {
    this.viewedByOpponent = viewedByOpponent;
    return this;
  }

  /**
   * Прочитано ли сообщение работодателем (для сообщений работодателя - true)
   * @return viewedByOpponent
  */
  @NotNull 
  @Schema(name = "viewed_by_opponent", description = "Прочитано ли сообщение работодателем (для сообщений работодателя - true)", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("viewed_by_opponent")
  public Boolean getViewedByOpponent() {
    return viewedByOpponent;
  }

  public void setViewedByOpponent(Boolean viewedByOpponent) {
    this.viewedByOpponent = viewedByOpponent;
  }

  public NegotiationsMessageSent address(VacancyAddressOutput address) {
    this.address = address;
    return this;
  }

  /**
   * Get address
   * @return address
  */
  @NotNull @Valid 
  @Schema(name = "address", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("address")
  public VacancyAddressOutput getAddress() {
    return address;
  }

  public void setAddress(VacancyAddressOutput address) {
    this.address = address;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    NegotiationsMessageSent negotiationsMessageSent = (NegotiationsMessageSent) o;
    return Objects.equals(this.author, negotiationsMessageSent.author) &&
        Objects.equals(this.createdAt, negotiationsMessageSent.createdAt) &&
        Objects.equals(this.editable, negotiationsMessageSent.editable) &&
        Objects.equals(this.id, negotiationsMessageSent.id) &&
        Objects.equals(this.read, negotiationsMessageSent.read) &&
        Objects.equals(this.state, negotiationsMessageSent.state) &&
        Objects.equals(this.text, negotiationsMessageSent.text) &&
        Objects.equals(this.viewedByMe, negotiationsMessageSent.viewedByMe) &&
        Objects.equals(this.viewedByOpponent, negotiationsMessageSent.viewedByOpponent) &&
        Objects.equals(this.address, negotiationsMessageSent.address);
  }

  @Override
  public int hashCode() {
    return Objects.hash(author, createdAt, editable, id, read, state, text, viewedByMe, viewedByOpponent, address);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class NegotiationsMessageSent {\n");
    sb.append("    author: ").append(toIndentedString(author)).append("\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    editable: ").append(toIndentedString(editable)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    read: ").append(toIndentedString(read)).append("\n");
    sb.append("    state: ").append(toIndentedString(state)).append("\n");
    sb.append("    text: ").append(toIndentedString(text)).append("\n");
    sb.append("    viewedByMe: ").append(toIndentedString(viewedByMe)).append("\n");
    sb.append("    viewedByOpponent: ").append(toIndentedString(viewedByOpponent)).append("\n");
    sb.append("    address: ").append(toIndentedString(address)).append("\n");
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

